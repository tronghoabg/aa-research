package com.waze.ch;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum ab implements eg {
    STATUS_UNSPECIFIED(0),
    OPEN(1),
    OPENS_SOON(2),
    CLOSED(3),
    CLOSES_SOON(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f22356g;

    ab(int i2) {
        this.f22356g = i2;
    }

    public static ab a(int i2) {
        if (i2 == 0) {
            return STATUS_UNSPECIFIED;
        }
        if (i2 == 1) {
            return OPEN;
        }
        if (i2 == 2) {
            return OPENS_SOON;
        }
        if (i2 == 3) {
            return CLOSED;
        }
        if (i2 != 4) {
            return null;
        }
        return CLOSES_SOON;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f22356g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22356g);
    }
}
