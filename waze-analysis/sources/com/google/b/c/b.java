package com.google.b.c;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum b implements eg {
    INT52(0),
    NUMBER(1),
    STRING(2),
    GBIGINT(3);


    /* renamed from: e, reason: collision with root package name */
    private static final eh f7029e = new a();

    /* renamed from: g, reason: collision with root package name */
    private final int f7031g;

    b(int i2) {
        this.f7031g = i2;
    }

    public static eh a() {
        return f7029e;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f7031g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7031g);
    }
}
