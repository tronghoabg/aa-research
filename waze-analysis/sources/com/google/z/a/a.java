package com.google.z.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum a implements eg {
    DEFAULT_ENCODING(0),
    DATE_DECIMAL(1),
    __FieldFormat_Encoding__switch_must_have_a_default__(-1);


    /* renamed from: d, reason: collision with root package name */
    private static final eh f13434d = new b(1);

    /* renamed from: f, reason: collision with root package name */
    private final int f13436f;

    a(int i2) {
        this.f13436f = i2;
    }

    public static eh a() {
        return f13434d;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f13436f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13436f);
    }
}
