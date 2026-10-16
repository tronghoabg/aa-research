package com.waze.sound.f;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final d f39990a;

    public f(com.waze.speech.k kVar, d dVar) {
        x.f(kVar, "voiceSearchLanguageConfig");
        x.f(dVar, "voiceAssistantStatsSender");
        this.f39990a = dVar;
    }

    public final void a() {
        String strB = ConfigValues.CONFIG_VALUE_SOUND_DEFAULT_VOICE_SEARCH_LANGUAGE.b();
        x.e(strB, "getValue(...)");
        String strB2 = ConfigValues.CONFIG_VALUE_SOUND_VOICE_SEARCH_LANG.b();
        String str = strB2;
        boolean zN = true;
        if (str != null && str.length() != 0) {
            zN = x.n(strB2, TtmlNode.TEXT_EMPHASIS_AUTO);
        }
        this.f39990a.f(strB, zN);
    }
}
