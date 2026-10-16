package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhso extends zziep implements zziga {
    private static final zzhso zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzidl zzc = zzidl.zza;
    private zzhsq zzd;

    static {
        zzhso zzhsoVar = new zzhso();
        zze = zzhsoVar;
        zziep.zzbu(zzhso.class, zzhsoVar);
    }

    private zzhso() {
    }

    public static zzhso zzd(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhso) zziep.zzbT(zze, zzidlVar, zzidzVar);
    }

    public static zzhsn zze() {
        return (zzhsn) zze.zzbn();
    }

    public static zzigh zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzidl zzb() {
        return this.zzc;
    }

    public final zzhsq zzc() {
        zzhsq zzhsqVar = this.zzd;
        return zzhsqVar == null ? zzhsq.zze() : zzhsqVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhso();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsn(bArr);
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
        synchronized (zzhso.class) {
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

    public final /* synthetic */ void zzh(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzc = zzidlVar;
    }

    public final /* synthetic */ void zzi(zzhsq zzhsqVar) {
        zzhsqVar.getClass();
        this.zzd = zzhsqVar;
        this.zza |= 1;
    }
}
