package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzeel extends Exception {
    private final int zza;

    public zzeel(int i5) {
        this.zza = i5;
    }

    public final int zza() {
        return this.zza;
    }

    public zzeel(int i5, String str) {
        super(str);
        this.zza = i5;
    }

    public zzeel(int i5, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
