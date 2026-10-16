package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzggb extends zziep implements zziga {
    private static final zzggb zzf;
    private static volatile zzigh zzg;
    private int zza;
    private Object zzc;
    private int zzd;
    private int zzb = 0;
    private zziex zze = zziep.zzbC();

    static {
        zzggb zzggbVar = new zzggb();
        zzf = zzggbVar;
        zziep.zzbu(zzggb.class, zzggbVar);
    }

    private zzggb() {
    }

    public static zzggb zze(zzidl zzidlVar) throws zzifh {
        return (zzggb) zziep.zzbS(zzf, zzidlVar);
    }

    public static zzgga zzg() {
        return (zzgga) zzf.zzbn();
    }

    public static zzggb zzh() {
        return zzf;
    }

    public final zzbei zza() {
        return this.zzb == 1 ? (zzbei) this.zzc : zzbei.zzj();
    }

    public final zzbeg zzb() {
        return this.zzb == 2 ? (zzbeg) this.zzc : zzbeg.zzd();
    }

    public final zzbdz zzc() {
        zzbdz zzbdzVarZzb = zzbdz.zzb(this.zzd);
        return zzbdzVarZzb == null ? zzbdz.UNSUPPORTED : zzbdzVarZzb;
    }

    public final List zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"zzc", "zzb", "zza", zzbei.class, zzbeg.class, "zzd", zzbdz.zzc(), "zze"});
        }
        if (iOrdinal == 3) {
            return new zzggb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgga(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzg;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzggb.class) {
            try {
                zziekVar = zzg;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzf);
                    zzg = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zzi(zzbei zzbeiVar) {
        zzbeiVar.getClass();
        this.zzc = zzbeiVar;
        this.zzb = 1;
    }

    public final /* synthetic */ void zzj(zzbeg zzbegVar) {
        zzbegVar.getClass();
        this.zzc = zzbegVar;
        this.zzb = 2;
    }

    public final /* synthetic */ void zzk(zzbdz zzbdzVar) {
        this.zzd = zzbdzVar.zza();
        this.zza |= 1;
    }

    public final /* synthetic */ void zzl(Iterable iterable) {
        zziex zziexVar = this.zze;
        if (!zziexVar.zza()) {
            this.zze = zziep.zzbD(zziexVar);
        }
        zzicu.zzaW(iterable, this.zze);
    }
}
