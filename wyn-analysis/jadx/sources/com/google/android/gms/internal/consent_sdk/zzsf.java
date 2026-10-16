package com.google.android.gms.internal.consent_sdk;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzsf implements Iterator {
    final /* synthetic */ zzsi zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzsf(zzsi zzsiVar, zzsh zzshVar) {
        Objects.requireNonNull(zzsiVar);
        this.zza = zzsiVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5 = this.zzb + 1;
        zzsi zzsiVar = this.zza;
        if (i5 >= zzsiVar.zzb) {
            return !zzsiVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i5 = this.zzb + 1;
        this.zzb = i5;
        zzsi zzsiVar = this.zza;
        return i5 < zzsiVar.zzb ? (zzse) zzsiVar.zza[i5] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzsi zzsiVar = this.zza;
        zzsiVar.zzo();
        int i5 = this.zzb;
        if (i5 >= zzsiVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i5 - 1;
            zzsiVar.zzm(i5);
        }
    }
}
