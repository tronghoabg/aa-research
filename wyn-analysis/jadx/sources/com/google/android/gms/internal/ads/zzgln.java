package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgln extends RuntimeException {
    public zzgln() {
        this(0);
    }

    public zzgln(int i5) {
        super(N0.a.d(i5, "r: ", new StringBuilder(String.valueOf(i5).length() + 3)));
    }

    public zzgln(int i5, Throwable th) {
        super("r: 2", th);
    }
}
