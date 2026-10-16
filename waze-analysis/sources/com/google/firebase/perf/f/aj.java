package com.google.firebase.perf.f;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum aj implements eg {
    SERVICE_WORKER_STATUS_UNKNOWN(0),
    UNSUPPORTED(1),
    CONTROLLED(2),
    UNCONTROLLED(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f10429f;

    aj(int i2) {
        this.f10429f = i2;
    }

    public static aj a(int i2) {
        if (i2 == 0) {
            return SERVICE_WORKER_STATUS_UNKNOWN;
        }
        if (i2 == 1) {
            return UNSUPPORTED;
        }
        if (i2 == 2) {
            return CONTROLLED;
        }
        if (i2 != 3) {
            return null;
        }
        return UNCONTROLLED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f10429f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f10429f);
    }
}
