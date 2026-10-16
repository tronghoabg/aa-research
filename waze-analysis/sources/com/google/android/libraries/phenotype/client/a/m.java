package com.google.android.libraries.phenotype.client.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final int f5967a;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(int i2, String str, Throwable th) {
        String strValueOf;
        if (str != null) {
            strValueOf = i2 + ": " + str;
        } else {
            strValueOf = String.valueOf(i2);
        }
        super(strValueOf, th);
        this.f5967a = i2;
    }

    public final int a() {
        return this.f5967a;
    }
}
