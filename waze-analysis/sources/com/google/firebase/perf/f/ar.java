package com.google.firebase.perf.f;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum ar implements eg {
    SOURCE_UNKNOWN(0),
    FL_LEGACY_V1(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f10439d;

    ar(int i2) {
        this.f10439d = i2;
    }

    public static ar a(int i2) {
        if (i2 == 0) {
            return SOURCE_UNKNOWN;
        }
        if (i2 != 1) {
            return null;
        }
        return FL_LEGACY_V1;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f10439d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f10439d);
    }
}
