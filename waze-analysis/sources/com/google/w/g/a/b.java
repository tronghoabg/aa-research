package com.google.w.g.a;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum b implements eg {
    UNSPECIFIED(0),
    EQUAL(1),
    LESS_THAN(2),
    LESS_THAN_OR_EQUAL(3),
    GREATER_THAN(4),
    GREATER_THAN_OR_EQUAL(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f13216h;

    b(int i2) {
        this.f13216h = i2;
    }

    public static ei a() {
        return a.f13208a;
    }

    public static b b(int i2) {
        if (i2 == 0) {
            return UNSPECIFIED;
        }
        if (i2 == 1) {
            return EQUAL;
        }
        if (i2 == 2) {
            return LESS_THAN;
        }
        if (i2 == 3) {
            return LESS_THAN_OR_EQUAL;
        }
        if (i2 == 4) {
            return GREATER_THAN;
        }
        if (i2 != 5) {
            return null;
        }
        return GREATER_THAN_OR_EQUAL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f13216h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13216h);
    }
}
