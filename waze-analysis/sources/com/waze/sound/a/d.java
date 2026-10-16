package com.waze.sound.a;

import com.waze.config.ConfigValues;
import com.waze.sound.em;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {
    public d(em emVar) {
        x.f(emVar, "soundConfig");
    }

    public static final String a() {
        String strB = ConfigValues.CONFIG_VALUE_CUSTOM_PROMPTS_SELECTED_UUID.b();
        if (strB == null || strB.length() == 0) {
            return null;
        }
        return strB;
    }

    public static final String b() {
        return ConfigValues.CONFIG_VALUE_VOICES_SELECTED_VOICE_ID.b();
    }

    public static final void c(String str) {
        x.f(str, "voiceId");
        ConfigValues.CONFIG_VALUE_VOICES_SELECTED_VOICE_ID.d(str);
    }
}
