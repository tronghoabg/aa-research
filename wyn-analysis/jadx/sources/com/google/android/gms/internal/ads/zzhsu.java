package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhsu extends zziep implements zziga {
    private static final zzhsu zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzhsy zzc;
    private zzidl zzd = zzidl.zza;

    static {
        zzhsu zzhsuVar = new zzhsu();
        zze = zzhsuVar;
        zziep.zzbu(zzhsu.class, zzhsuVar);
    }

    private zzhsu() {
    }

    public static zzhsu zzd(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhsu) zziep.zzbT(zze, zzidlVar, zzidzVar);
    }

    public static zzhst zze() {
        return (zzhst) zze.zzbn();
    }

    public static zzhsu zzg() {
        return zze;
    }

    public static zzigh zzh() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhsy zzb() {
        zzhsy zzhsyVar = this.zzc;
        return zzhsyVar == null ? zzhsy.zzd() : zzhsyVar;
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
            return zziep.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhsu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhst(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzf;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhsu.class) {
            try {
                zziekVar = zzf;
                if (zziekVar == null) {
                    zziekVar = new zziek(zze);
                    zzf = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zzi(zzhsy zzhsyVar) {
        zzhsyVar.getClass();
        this.zzc = zzhsyVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzj(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
    }
}
