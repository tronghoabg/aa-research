package com.google.w.f;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum b implements eg {
    UNKNOWN(0),
    SUCCESS(1),
    FAILURE(2),
    CANCEL(3);


    /* renamed from: e, reason: collision with root package name */
    private static final eh f13203e = new a();

    /* renamed from: g, reason: collision with root package name */
    private final int f13205g;

    b(int i2) {
        this.f13205g = i2;
    }

    public static eh a() {
        return f13203e;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f13205g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13205g);
    }
}
