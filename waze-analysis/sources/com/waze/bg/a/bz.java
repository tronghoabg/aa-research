package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum bz implements com.google.v.eg {
    TURN_CLOSURE_UNSPECIFIED(0),
    TURN_CLOSURE_DEFAULT(1),
    TURN_CLOSURE_EVENT(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f16484e;

    bz(int i2) {
        this.f16484e = i2;
    }

    public static bz a(int i2) {
        if (i2 == 0) {
            return TURN_CLOSURE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return TURN_CLOSURE_DEFAULT;
        }
        if (i2 != 2) {
            return null;
        }
        return TURN_CLOSURE_EVENT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16484e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16484e);
    }
}
