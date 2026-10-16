package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum no implements com.google.v.eg {
    OPERATION_UNKNOWN(0),
    MATCH(1),
    ALL_OF(2),
    ANY_OF(3),
    TRUE(10),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f12153h;

    no(int i2) {
        this.f12153h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f12153h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12153h);
    }
}
