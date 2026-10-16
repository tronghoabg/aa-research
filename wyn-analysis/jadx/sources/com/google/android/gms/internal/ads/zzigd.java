package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzigd implements zzigr {
    private final zzifz zza;
    private final zzihd zzb;
    private final boolean zzc;
    private final zziea zzd;

    private zzigd(zzihd zzihdVar, zziea zzieaVar, zzifz zzifzVar) {
        this.zzb = zzihdVar;
        this.zzc = zzifzVar instanceof zziel;
        this.zzd = zzieaVar;
        this.zza = zzifzVar;
    }

    public static zzigd zzh(zzihd zzihdVar, zziea zzieaVar, zzifz zzifzVar) {
        return new zzigd(zzihdVar, zzieaVar, zzifzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final Object zza() {
        zzifz zzifzVar = this.zza;
        return zzifzVar instanceof zziep ? ((zziep) zzifzVar).zzbg() : zzifzVar.zzcY().zzbt();
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final boolean zzb(Object obj, Object obj2) {
        if (!((zziep) obj).zzt.equals(((zziep) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zziel) obj).zza.equals(((zziel) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final int zzc(Object obj) {
        int iHashCode = ((zziep) obj).zzt.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zziel) obj).zza.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final void zzd(Object obj, Object obj2) {
        zzigs.zzH(this.zzb, obj, obj2);
        if (this.zzc) {
            zzigs.zzG(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final int zze(Object obj) {
        int iZzh = ((zziep) obj).zzt.zzh();
        return this.zzc ? iZzh + ((zziel) obj).zza.zzg() : iZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final void zzf(Object obj, zzihs zzihsVar) throws IOException {
        Iterator itZzc = ((zziel) obj).zza.zzc();
        while (itZzc.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzc.next();
            zzied zziedVar = (zzied) entry.getKey();
            if (zziedVar.zzc() != zzihr.MESSAGE || zziedVar.zzd() || zziedVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzifd) {
                zzihsVar.zzv(zziedVar.zza(), ((zzifd) entry).zza().zzc());
            } else {
                zzihsVar.zzv(zziedVar.zza(), entry.getValue());
            }
        }
        ((zziep) obj).zzt.zzf(zzihsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final void zzg(Object obj, zzigm zzigmVar, zzidz zzidzVar) throws IOException {
        this.zzb.zzh(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final void zzj(Object obj, byte[] bArr, int i5, int i10, zzicz zziczVar) throws IOException {
        zziep zziepVar = (zziep) obj;
        if (zziepVar.zzt == zzihe.zza()) {
            zziepVar.zzt = zzihe.zzb();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final void zzk(Object obj) {
        this.zzb.zzj(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final boolean zzl(Object obj) {
        return ((zziel) obj).zza.zze();
    }
}
