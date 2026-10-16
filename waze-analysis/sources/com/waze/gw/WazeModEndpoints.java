package com.waze.gw;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* loaded from: classes10.dex */
final class WazeModEndpoints {
    static final String FALLBACK = "https://wazemod.chisadin.id.vn";
    static final String PRIMARY = "https://wazemod.io.vn";

    private WazeModEndpoints() {
    }

    static String[] defaults() {
        return new String[]{PRIMARY, FALLBACK};
    }

    static String[] forConfiguredBase(String str) {
        String strTrim = trim(str);
        if (strTrim.length() == 0 || PRIMARY.equalsIgnoreCase(strTrim) || FALLBACK.equalsIgnoreCase(strTrim)) {
            return defaults();
        }
        return new String[]{strTrim};
    }

    static String trim(String str) {
        String strTrim = str == null ? "" : str.trim();
        while (strTrim.endsWith(DomExceptionUtils.SEPARATOR)) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        return strTrim;
    }
}
