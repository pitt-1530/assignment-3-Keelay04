package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class PlaylistRecommenderTest {

    @Test
    public void classifyEnergy_returnsHighAverageBpm() {
        String result = PlaylistRecommender.classifyEnergy(List.of(160, 180, 140));
        assertEquals("HIGH", result);
    }

    @Test
    public void isValidTrackTitle_rejectsNull() {
        assertFalse(PlaylistRecommender.isValidTrackTitle(null));
    }

    @Test
    public void normalizeVolume_clampsBelowMin() {
        assertEquals(0, PlaylistRecommender.normalizeVolume(-10));
    }
}
