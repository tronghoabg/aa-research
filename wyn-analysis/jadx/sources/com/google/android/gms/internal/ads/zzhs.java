package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzhs extends IOException {
    public final int zza;

    public zzhs(int i5) {
        this.zza = i5;
    }

    public zzhs(String str, int i5) {
        super(str);
        this.zza = i5;
    }

    public zzhs(String str, Throwable th, int i5) {
        super(str, th);
        this.zza = i5;
    }

    public zzhs(Throwable th, int i5) {
        super(th);
        this.zza = i5;
    }
}
