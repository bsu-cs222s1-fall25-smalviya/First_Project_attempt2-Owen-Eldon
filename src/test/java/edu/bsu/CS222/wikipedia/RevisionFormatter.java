package edu.bsu.CS222.wikipedia;

import java.util.List;
import java.util.Map;

public class RevisionFormatter {
    private final List<Map<String, String>> revisions;

    public RevisionFormatter(List<Map<String, String>> revisions) {
        this.revisions = revisions;
    }

    public int size() {
        return revisions.size();
    }

    public String formatAll() {
        StringBuilder builder = new StringBuilder();
        for (Map<String, String> revision : revisions) {
            builder.append("User: ")
                    .append(revision.get("user"))
                    .append(", Timestamp: ")
                    .append(revision.get("timestamp"))
                    .append("\n");
        }
        return builder.toString();
    }
}

