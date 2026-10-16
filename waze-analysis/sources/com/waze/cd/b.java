package com.waze.cd;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum b implements eg {
    UNKNOWN(0),
    AVAILABLE(1),
    BLOCKED(2),
    CHARGING(3),
    INOPERATIVE(4),
    OUTOFORDER(5),
    PLANNED(6),
    REMOVED(7),
    RESERVED(8);


    /* renamed from: k, reason: collision with root package name */
    private final int f22152k;

    b(int i2) {
        this.f22152k = i2;
    }

    public static ei a() {
        return a.f22141a;
    }

    public static b b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return AVAILABLE;
            case 2:
                return BLOCKED;
            case 3:
                return CHARGING;
            case 4:
                return INOPERATIVE;
            case 5:
                return OUTOFORDER;
            case 6:
                return PLANNED;
            case 7:
                return REMOVED;
            case 8:
                return RESERVED;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f22152k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22152k);
    }
}
