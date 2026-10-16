package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bo implements eg {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f12762e;

    bo(int i2) {
        this.f12762e = i2;
    }

    public static bo a(int i2) {
        if (i2 == 0) {
            return STRING;
        }
        if (i2 == 1) {
            return CORD;
        }
        if (i2 != 2) {
            return null;
        }
        return STRING_PIECE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12762e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12762e);
    }
}
