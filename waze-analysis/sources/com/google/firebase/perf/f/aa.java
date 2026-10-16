package com.google.firebase.perf.f;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum aa implements eg {
    NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
    GENERIC_CLIENT_ERROR(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f10423d;

    aa(int i2) {
        this.f10423d = i2;
    }

    public static aa a(int i2) {
        if (i2 == 0) {
            return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        }
        if (i2 != 1) {
            return null;
        }
        return GENERIC_CLIENT_ERROR;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f10423d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f10423d);
    }
}
