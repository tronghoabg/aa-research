package com.waze.u.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum q implements eg {
    RECOGNIZER_UNSPECIFIED(0),
    GOOGLE_CLOUD_SPEECH_TO_TEXT(1),
    VERTEX_MULTIMODAL(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f41633e;

    q(int i2) {
        this.f41633e = i2;
    }

    public static q a(int i2) {
        if (i2 == 0) {
            return RECOGNIZER_UNSPECIFIED;
        }
        if (i2 == 1) {
            return GOOGLE_CLOUD_SPEECH_TO_TEXT;
        }
        if (i2 != 2) {
            return null;
        }
        return VERTEX_MULTIMODAL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f41633e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f41633e);
    }
}
