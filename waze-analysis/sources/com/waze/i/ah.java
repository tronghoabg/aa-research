package com.waze.i;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ah implements eg {
    TYPE_UNSPECIFIED(0),
    IN_CAR_AAOS(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f24420d;

    ah(int i2) {
        this.f24420d = i2;
    }

    public static ah a(int i2) {
        if (i2 == 0) {
            return TYPE_UNSPECIFIED;
        }
        if (i2 != 1) {
            return null;
        }
        return IN_CAR_AAOS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f24420d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f24420d);
    }
}
