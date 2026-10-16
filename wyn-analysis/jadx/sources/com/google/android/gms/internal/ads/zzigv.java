package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzigv implements Iterator {
    final /* synthetic */ zzigx zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzigv(zzigx zzigxVar, byte[] bArr) {
        Objects.requireNonNull(zzigxVar);
        this.zza = zzigxVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5 = this.zzb + 1;
        zzigx zzigxVar = this.zza;
        if (i5 >= zzigxVar.zzj()) {
            return !zzigxVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i5 = this.zzb + 1;
        this.zzb = i5;
        zzigx zzigxVar = this.zza;
        return i5 < zzigxVar.zzj() ? (zzigu) zzigxVar.zzi()[i5] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzigx zzigxVar = this.zza;
        zzigxVar.zzh();
        int i5 = this.zzb;
        if (i5 >= zzigxVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i5 - 1;
            zzigxVar.zzg(i5);
        }
    }
}
