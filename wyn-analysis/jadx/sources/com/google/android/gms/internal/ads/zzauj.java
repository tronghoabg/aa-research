package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzauj {
    private final int zza;
    private final List zzb;
    private final int zzc;
    private final InputStream zzd;

    public zzauj(int i5, List list, int i10, InputStream inputStream) {
        this.zza = i5;
        this.zzb = list;
        this.zzc = i10;
        this.zzd = inputStream;
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return DesugarCollections.unmodifiableList(this.zzb);
    }

    public final int zzc() {
        return this.zzc;
    }

    public final InputStream zzd() {
        InputStream inputStream = this.zzd;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }
}
