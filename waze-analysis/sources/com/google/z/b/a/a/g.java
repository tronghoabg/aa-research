package com.google.z.b.a.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum g implements eg {
    UNKNOWN_CATEGORY(0),
    END_TO_END(1),
    INGESTED_BUT_NOT_SERVED(2),
    MATERIALIZED_AND_SERVED(3),
    INTERNAL_KG_USE_ONLY(4);


    /* renamed from: f, reason: collision with root package name */
    private static final eh f13514f = new f();

    /* renamed from: h, reason: collision with root package name */
    private final int f13516h;

    g(int i2) {
        this.f13516h = i2;
    }

    public static eh a() {
        return f13514f;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f13516h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13516h);
    }
}
