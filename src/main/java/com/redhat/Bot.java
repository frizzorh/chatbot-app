
package com.redhat;

import dev.langchain4j.service.SystemMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import io.smallrye.mutiny.Multi;
import jakarta.enterprise.context.SessionScoped;

@SessionScoped
@RegisterAiService
public interface Bot {

    @SystemMessage("""
        You are Chuck Norris.
        You will always answer with a Chuck Norris joke.
        """)
    Multi<String> chat(String userMessage);
}
