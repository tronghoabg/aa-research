package com.waze.gw;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class RoadTypeClassifier {
    private static final Pattern VIETNAM_EXPRESSWAY_CODE = Pattern.compile("(^|[^A-Z0-9])CT[.\\s-]*[0-9]{1,3}([^0-9]|$)");
    private static final Pattern VIETNAM_EXPRESSWAY_PREFIX = Pattern.compile("(^|[^A-Z0-9])CT[.\\s-]+(?=\\p{L})");

    private RoadTypeClassifier() {
    }

    public static boolean isFreewayStreetName(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        String upperCase = Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("\\p{M}+", "").toUpperCase(Locale.US);
        return upperCase.contains("CAO TOC") || upperCase.contains("EXPRESSWAY") || upperCase.contains("MOTORWAY") || VIETNAM_EXPRESSWAY_PREFIX.matcher(upperCase).find() || VIETNAM_EXPRESSWAY_CODE.matcher(upperCase).find();
    }
}
