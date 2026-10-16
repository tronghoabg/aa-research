package com.google.w.b;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum f implements eg {
    DF_NONE(0),
    DF_HTTPHEADER(1),
    DF_COOKIE(2),
    DF_URL(3),
    DF_CGI_ARGS(4),
    DF_HOST_ORDER(5),
    DF_BYTE_SWAPPED(6),
    DF_LOGGING_ELEMENT_TYPE_ID(7);


    /* renamed from: i, reason: collision with root package name */
    private static final eh f13137i = new r(1);

    /* renamed from: k, reason: collision with root package name */
    private final int f13139k;

    f(int i2) {
        this.f13139k = i2;
    }

    public static eh a() {
        return f13137i;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f13139k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13139k);
    }
}
