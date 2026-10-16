package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum be implements eg {
    MESSAGE_ENCODING_UNKNOWN(0),
    LENGTH_PREFIXED(1),
    DELIMITED(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f12722e;

    be(int i2) {
        this.f12722e = i2;
    }

    public static be a(int i2) {
        if (i2 == 0) {
            return MESSAGE_ENCODING_UNKNOWN;
        }
        if (i2 == 1) {
            return LENGTH_PREFIXED;
        }
        if (i2 != 2) {
            return null;
        }
        return DELIMITED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12722e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12722e);
    }
}
