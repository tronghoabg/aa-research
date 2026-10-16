package com.google.z.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum e implements eg {
    DEFAULT_TABLE_TYPE(0),
    SQL_TABLE(1),
    VALUE_TABLE(2);


    /* renamed from: d, reason: collision with root package name */
    private static final eh f13458d = new b(2);

    /* renamed from: f, reason: collision with root package name */
    private final int f13460f;

    e(int i2) {
        this.f13460f = i2;
    }

    public static eh a() {
        return f13458d;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f13460f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13460f);
    }
}
