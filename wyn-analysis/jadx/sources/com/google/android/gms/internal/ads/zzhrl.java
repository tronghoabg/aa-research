package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhrl extends zziep implements zziga {
    private static final zzhrl zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzhrp zzc;
    private zzidl zzd = zzidl.zza;

    static {
        zzhrl zzhrlVar = new zzhrl();
        zze = zzhrlVar;
        zziep.zzbu(zzhrl.class, zzhrlVar);
    }

    private zzhrl() {
    }

    public static zzhrl zzd(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhrl) zziep.zzbT(zze, zzidlVar, zzidzVar);
    }

    public static zzhrk zze() {
        return (zzhrk) zze.zzbn();
    }

    public static zzigh zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhrp zzb() {
        zzhrp zzhrpVar = this.zzc;
        return zzhrpVar == null ? zzhrp.zzc() : zzhrpVar;
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
            return new zzhrl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrk(bArr);
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
        synchronized (zzhrl.class) {
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

    public final /* synthetic */ void zzh(zzhrp zzhrpVar) {
        zzhrpVar.getClass();
        this.zzc = zzhrpVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
    }
}
