package com.google.n.a.a.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum a implements eg {
    ENDPOINT_UNSPECIFIED(0),
    STUBBY(1),
    MOBILE(2),
    NON_GOOGLE_PROD(3);


    /* renamed from: e, reason: collision with root package name */
    private static final eh f12479e = new c(1);

    /* renamed from: g, reason: collision with root package name */
    private final int f12481g;

    a(int i2) {
        this.f12481g = i2;
    }

    public static eh a() {
        return f12479e;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12481g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12481g);
    }
}
