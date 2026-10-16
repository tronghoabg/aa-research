package com.google.w.l;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum g implements eg {
    TOMBSTONE_UNSPECIFIED(0),
    TOMBSTONE_RETAIN(1),
    TOMBSTONE_DROP(2);


    /* renamed from: d, reason: collision with root package name */
    private static final eh f13287d = new f();

    /* renamed from: f, reason: collision with root package name */
    private final int f13289f;

    g(int i2) {
        this.f13289f = i2;
    }

    public static eh a() {
        return f13287d;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f13289f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13289f);
    }
}
