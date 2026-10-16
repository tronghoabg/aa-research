package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum aq implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    BUILDING(1),
    OTHER_CONSTRUCTION(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f11095e;

    aq(int i2) {
        this.f11095e = i2;
    }

    public static aq a(int i2) {
        if (i2 == 0) {
            return TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return BUILDING;
        }
        if (i2 != 2) {
            return null;
        }
        return OTHER_CONSTRUCTION;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11095e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11095e);
    }
}
