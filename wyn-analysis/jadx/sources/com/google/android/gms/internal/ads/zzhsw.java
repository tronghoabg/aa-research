package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhsw extends zziep implements zziga {
    private static final zzhsw zze;
    private static volatile zzigh zzf;
    private int zza;
    private zzhsy zzb;
    private int zzc;
    private int zzd;

    static {
        zzhsw zzhswVar = new zzhsw();
        zze = zzhswVar;
        zziep.zzbu(zzhsw.class, zzhswVar);
    }

    private zzhsw() {
    }

    public static zzhsw zzd(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhsw) zziep.zzbT(zze, zzidlVar, zzidzVar);
    }

    public static zzhsv zze() {
        return (zzhsv) zze.zzbn();
    }

    public static zzhsw zzg() {
        return zze;
    }

    public final zzhsy zza() {
        zzhsy zzhsyVar = this.zzb;
        return zzhsyVar == null ? zzhsy.zzd() : zzhsyVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
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
            return zziep.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhsw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsv(bArr);
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
        synchronized (zzhsw.class) {
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

    public final /* synthetic */ void zzh(zzhsy zzhsyVar) {
        zzhsyVar.getClass();
        this.zzb = zzhsyVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(int i5) {
        this.zzc = i5;
    }
}
