package com.google.t.a.a.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum a implements eg {
    DU_NOT_SPECIFIED(0),
    DU_BYTES(2),
    DU_KILOBYTES(3),
    DU_MEGABYTES(4),
    DU_GIGABYTES(5),
    DU_KIBIBYTES(6),
    DU_MEBIBYTES(7),
    DU_GIBIBYTES(8);


    /* renamed from: i, reason: collision with root package name */
    private static final eh f12543i = new f(1);

    /* renamed from: k, reason: collision with root package name */
    private final int f12545k;

    a(int i2) {
        this.f12545k = i2;
    }

    public static eh a() {
        return f12543i;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12545k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12545k);
    }
}
