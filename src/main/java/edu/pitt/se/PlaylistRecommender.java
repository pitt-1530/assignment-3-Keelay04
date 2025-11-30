package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        if (bpms == null || bpms.isEmpty()) {
            throw new IllegalArgumentException("The BPM list can not be null or empty");
        } 

        int sumBPM = 0;
        for(int bpm : bpms) {
            sumBPM += bpm;
        }
        double averageBMP = sumBPM / (double)bpms.size();

        if (averageBMP >= 140) {
            return "HIGH";
        } else if (averageBMP >= 100 && averageBMP < 140) {
            return "MEDIUM";
        } else {
            return "LOW";
        }
        // throw new UnsupportedOperationException("Not implemented");
    }

    public static boolean isValidTrackTitle(String title) {
        if (title == null) {
            return false;
        }

        int titleLength = title.length();
        boolean containsLetter = false;

        if (titleLength < 1 || titleLength > 30) {
            return false;
        }

        for (int i = 0; i < titleLength; i++) {
            char c = title.charAt(i);

            if (Character.isLetter(c)) {
                containsLetter = true;
            } else if (c != ' ') {
                return false;
            }
        }

        return containsLetter;
        // throw new UnsupportedOperationException("Not implemented");
    }

    public static int normalizeVolume(int volumeDb) {
        if (volumeDb < 0) {
            return 0;
        } else if (volumeDb > 100) {
            return 100;
        } else {
            return volumeDb;
        }
        // throw new UnsupportedOperationException("Not implemented");
    }
}
