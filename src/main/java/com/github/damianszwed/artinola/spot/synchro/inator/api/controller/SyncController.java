package com.github.damianszwed.artinola.spot.synchro.inator.api.controller;

import com.github.damianszwed.artinola.spot.synchro.inator.api.SyncApi;
import com.github.damianszwed.artinola.spot.synchro.inator.model.SyncResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SyncController implements SyncApi {

    @Override
    public ResponseEntity<SyncResponse> sync() {
        // TODO business execution
        return ResponseEntity.ok(new SyncResponse("ok"));
    }
}
