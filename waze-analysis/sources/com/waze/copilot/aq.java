package com.waze.copilot;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum aq implements eg {
    VOICE_TYPE_UNSPECIFIED(0),
    TTS(1),
    PRE_RECORDED_PROMPT(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f22903e;

    aq(int i2) {
        this.f22903e = i2;
    }

    public static aq a(int i2) {
        if (i2 == 0) {
            return VOICE_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return TTS;
        }
        if (i2 != 2) {
            return null;
        }
        return PRE_RECORDED_PROMPT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f22903e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22903e);
    }
}
