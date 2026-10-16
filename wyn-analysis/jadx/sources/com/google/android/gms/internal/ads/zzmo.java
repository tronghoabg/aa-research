package com.google.android.gms.internal.ads;

import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class zzmo implements zzxw, zzum {
    final /* synthetic */ zzmt zza;
    private final zzmq zzb;

    public zzmo(zzmt zzmtVar, zzmq zzmqVar) {
        Objects.requireNonNull(zzmtVar);
        this.zza = zzmtVar;
        this.zzb = zzmqVar;
    }

    private final Pair zzf(int i5, zzxl zzxlVar) {
        zzxl zzxlVarZza;
        zzxl zzxlVar2 = null;
        if (zzxlVar != null) {
            zzmq zzmqVar = this.zzb;
            int i10 = 0;
            while (true) {
                List list = zzmqVar.zzc;
                if (i10 >= list.size()) {
                    zzxlVarZza = null;
                    break;
                }
                if (((zzxl) list.get(i10)).zzd == zzxlVar.zzd) {
                    Object obj = zzxlVar.zza;
                    Object obj2 = zzmqVar.zzb;
                    int i11 = zzna.zzb;
                    zzxlVarZza = zzxlVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i10++;
            }
            if (zzxlVarZza == null) {
                return null;
            }
            zzxlVar2 = zzxlVarZza;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzxlVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzai(int i5, zzxl zzxlVar, final zzxc zzxcVar, final zzxh zzxhVar, final int i10) {
        final Pair pairZzf = zzf(0, zzxlVar);
        if (pairZzf != null) {
            zzmt zzmtVar = this.zza;
            zzmtVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzai(((Integer) pair.first).intValue(), (zzxl) pair.second, zzxcVar, zzxhVar, i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzaj(int i5, zzxl zzxlVar, final zzxc zzxcVar, final zzxh zzxhVar) {
        final Pair pairZzf = zzf(0, zzxlVar);
        if (pairZzf != null) {
            zzmt zzmtVar = this.zza;
            zzmtVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzaj(((Integer) pair.first).intValue(), (zzxl) pair.second, zzxcVar, zzxhVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzak(int i5, zzxl zzxlVar, final zzxc zzxcVar, final zzxh zzxhVar) {
        final Pair pairZzf = zzf(0, zzxlVar);
        if (pairZzf != null) {
            zzmt zzmtVar = this.zza;
            zzmtVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzak(((Integer) pair.first).intValue(), (zzxl) pair.second, zzxcVar, zzxhVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzal(int i5, zzxl zzxlVar, final zzxc zzxcVar, final zzxh zzxhVar, final IOException iOException, final boolean z2) {
        final Pair pairZzf = zzf(0, zzxlVar);
        if (pairZzf != null) {
            zzmt zzmtVar = this.zza;
            zzmtVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzml
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzal(((Integer) pair.first).intValue(), (zzxl) pair.second, zzxcVar, zzxhVar, iOException, z2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzam(int i5, zzxl zzxlVar, final zzxh zzxhVar) {
        final Pair pairZzf = zzf(0, zzxlVar);
        if (pairZzf != null) {
            zzmt zzmtVar = this.zza;
            zzmtVar.zzk().zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzam(((Integer) pair.first).intValue(), (zzxl) pair.second, zzxhVar);
                }
            });
        }
    }
}
