package com.github.damianszwed.artinola.spot.synchro.inator.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class HelloControllerTest {

    @Test
    void returnsHelloWorld() throws Exception {
        var mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();

        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith("text/plain"))
                .andExpect(content().string("Hello, World!"));
    }
}
