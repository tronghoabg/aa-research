package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbei extends zziep implements zziga {
    private static final zzbei zzg;
    private static volatile zzigh zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        zzbei zzbeiVar = new zzbei();
        zzg = zzbeiVar;
        zziep.zzbu(zzbei.class, zzbeiVar);
    }

    private zzbei() {
    }

    public static zzbei zzg(zzidl zzidlVar) throws zzifh {
        return (zzbei) zziep.zzbS(zzg, zzidlVar);
    }

    public static zzbei zzh(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzbei) zziep.zzbT(zzg, zzidlVar, zzidzVar);
    }

    public static zzbeh zzi() {
        return (zzbeh) zzg.zzbn();
    }

    public static zzbei zzj() {
        return zzg;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
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
            return zziep.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzbei();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbeh(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzh;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzbei.class) {
            try {
                zziekVar = zzh;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzg);
                    zzh = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final long zze() {
        return this.zzf;
    }

    public final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzm(long j8) {
        this.zza |= 4;
        this.zzd = j8;
    }

    public final /* synthetic */ void zzn(long j8) {
        this.zza |= 8;
        this.zze = j8;
    }

    public final /* synthetic */ void zzo(long j8) {
        this.zza |= 16;
        this.zzf = j8;
    }
}
