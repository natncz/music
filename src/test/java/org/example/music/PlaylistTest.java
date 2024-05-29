package org.example.music;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlaylistTest {

    @Test
    public void testPlaylistIsEmpty() {
        Playlist playlist = new Playlist();
        assertTrue(playlist.isEmpty());
    }

}
