package com.google.t.a.a.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum h implements eg {
    TU_NOT_SPECIFIED(0),
    TU_NANOSECONDS(1),
    TU_MICROSECONDS(2),
    TU_MILLISECONDS(3),
    TU_SECONDS(4),
    TU_MINUTES(5),
    TU_HOURS(6),
    TU_DAYS(7);


    /* renamed from: i, reason: collision with root package name */
    private static final eh f12577i = new f(2);

    /* renamed from: k, reason: collision with root package name */
    private final int f12579k;

    h(int i2) {
        this.f12579k = i2;
    }

    public static eh a() {
        return f12577i;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12579k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12579k);
    }
}
