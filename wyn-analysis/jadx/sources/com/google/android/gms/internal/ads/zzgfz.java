package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgfz extends zziep implements zziga {
    private static final zzgfz zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzggb zzb;
    private zzidl zzc;
    private zzidl zzd;
    private int zze;

    static {
        zzgfz zzgfzVar = new zzgfz();
        zzf = zzgfzVar;
        zziep.zzbu(zzgfz.class, zzgfzVar);
    }

    private zzgfz() {
        zzidl zzidlVar = zzidl.zza;
        this.zzc = zzidlVar;
        this.zzd = zzidlVar;
    }

    public static zzgfy zzd() {
        return (zzgfy) zzf.zzbn();
    }

    public final zzggb zza() {
        zzggb zzggbVar = this.zzb;
        return zzggbVar == null ? zzggb.zzh() : zzggbVar;
    }

    public final zzidl zzb() {
        return this.zzc;
    }

    public final zzidl zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzggp.zza});
        }
        if (iOrdinal == 3) {
            return new zzgfz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgfy(bArr);
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
        synchronized (zzgfz.class) {
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

    public final /* synthetic */ void zze(zzggb zzggbVar) {
        zzggbVar.getClass();
        this.zzb = zzggbVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 2;
        this.zzc = zzidlVar;
    }

    public final /* synthetic */ void zzh(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 4;
        this.zzd = zzidlVar;
    }

    public final int zzj() {
        int iZza = zzggq.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final /* synthetic */ void zzk(int i5) {
        this.zze = i5 - 1;
        this.zza |= 8;
    }
}
