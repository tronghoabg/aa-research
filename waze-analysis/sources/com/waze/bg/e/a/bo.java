package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum bo implements com.google.v.eg {
    DEFAULT_ACTION_UNSPECIFIED(1),
    DEFAULT_ACTION_ACCEPT(2),
    DEFAULT_ACTION_REJECT(3);


    /* renamed from: e, reason: collision with root package name */
    private final int f16630e;

    bo(int i2) {
        this.f16630e = i2;
    }

    public static bo a(int i2) {
        if (i2 == 1) {
            return DEFAULT_ACTION_UNSPECIFIED;
        }
        if (i2 == 2) {
            return DEFAULT_ACTION_ACCEPT;
        }
        if (i2 != 3) {
            return null;
        }
        return DEFAULT_ACTION_REJECT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16630e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16630e);
    }
}
