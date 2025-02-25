package org.svenehrke.demo.springbootsse.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequiredArgsConstructor
public class SseController {

	private final SseService sseService;

	@GetMapping(path = "/sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public SseEmitter subscribe() {
		SseEmitter emitter = new SseEmitter(Long.MAX_VALUE);
		sseService.addEmitter(emitter);
		// Add the emitter to a list of subscribers or handle it in another way
		return emitter;
	}
}
