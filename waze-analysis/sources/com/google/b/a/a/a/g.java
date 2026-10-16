package com.google.b.a.a.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum g implements eg {
    INTERNAL(1),
    EXTERNAL(2),
    NO_OP(3);


    /* renamed from: d, reason: collision with root package name */
    private static final eh f7000d = new h(1);

    /* renamed from: f, reason: collision with root package name */
    private final int f7002f;

    g(int i2) {
        this.f7002f = i2;
    }

    public static eh a() {
        return f7000d;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f7002f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7002f);
    }
}
