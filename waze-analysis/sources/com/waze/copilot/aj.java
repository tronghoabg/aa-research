package com.waze.copilot;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum aj implements eg {
    STATUS_UNSPECIFIED(0),
    SUCCESS(1),
    SERVER_ERROR(2),
    UNAVAILABLE(3),
    NOT_FOUND(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f22895g;

    aj(int i2) {
        this.f22895g = i2;
    }

    public static aj a(int i2) {
        if (i2 == 0) {
            return STATUS_UNSPECIFIED;
        }
        if (i2 == 1) {
            return SUCCESS;
        }
        if (i2 == 2) {
            return SERVER_ERROR;
        }
        if (i2 == 3) {
            return UNAVAILABLE;
        }
        if (i2 != 4) {
            return null;
        }
        return NOT_FOUND;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f22895g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22895g);
    }
}
