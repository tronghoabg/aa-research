package com.google.firebase.perf.f;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum ak implements eg {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f10433d;

    ak(int i2) {
        this.f10433d = i2;
    }

    public static ak a(int i2) {
        if (i2 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i2 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f10433d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f10433d);
    }
}
