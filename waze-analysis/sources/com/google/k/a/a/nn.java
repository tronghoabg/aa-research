package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum nn implements com.google.v.eg {
    DIRECTION_UNKNOWN(0),
    IS(1),
    NOT(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f12145f;

    nn(int i2) {
        this.f12145f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f12145f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12145f);
    }
}
