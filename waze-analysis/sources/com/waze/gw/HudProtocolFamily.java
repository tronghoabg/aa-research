package com.waze.gw;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Locale;

/* loaded from: classes10.dex */
enum HudProtocolFamily {
    AUTO(TtmlNode.TEXT_EMPHASIS_AUTO),
    HLP1("hlp1"),
    VIETMAP_H50("vietmap_h50"),
    VIETMAP_H1("vietmap_h1");

    private final String preferenceValue;

    HudProtocolFamily(String str) {
        this.preferenceValue = str;
    }

    String preferenceValue() {
        return this.preferenceValue;
    }

    static HudProtocolFamily fromPreference(String str) {
        if (str == null) {
            return AUTO;
        }
        String lowerCase = str.trim().toLowerCase(Locale.US);
        for (HudProtocolFamily hudProtocolFamily : values()) {
            if (hudProtocolFamily.preferenceValue.equals(lowerCase)) {
                return hudProtocolFamily;
            }
        }
        return AUTO;
    }
}
