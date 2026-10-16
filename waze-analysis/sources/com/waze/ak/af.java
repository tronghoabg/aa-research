package com.waze.ak;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum af implements eg {
    VOICE_CATEGORY_UNSPECIFIED(0),
    TTS(1),
    PROMPT(2),
    COPILOT(3),
    CUSTOM(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f14092g;

    af(int i2) {
        this.f14092g = i2;
    }

    public static af a(int i2) {
        if (i2 == 0) {
            return VOICE_CATEGORY_UNSPECIFIED;
        }
        if (i2 == 1) {
            return TTS;
        }
        if (i2 == 2) {
            return PROMPT;
        }
        if (i2 == 3) {
            return COPILOT;
        }
        if (i2 != 4) {
            return null;
        }
        return CUSTOM;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f14092g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14092g);
    }
}
