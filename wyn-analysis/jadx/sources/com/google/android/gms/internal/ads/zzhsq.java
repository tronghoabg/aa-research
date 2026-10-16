package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhsq extends zziep implements zziga {
    private static final zzhsq zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzidl zzb = zzidl.zza;

    static {
        zzhsq zzhsqVar = new zzhsq();
        zzc = zzhsqVar;
        zziep.zzbu(zzhsq.class, zzhsqVar);
    }

    private zzhsq() {
    }

    public static zzhsq zzc(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhsq) zziep.zzbT(zzc, zzidlVar, zzidzVar);
    }

    public static zzhsp zzd() {
        return (zzhsp) zzc.zzbn();
    }

    public static zzhsq zze() {
        return zzc;
    }

    public static zzigh zzg() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzidl zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhsq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsp(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzd;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhsq.class) {
            try {
                zziekVar = zzd;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzc);
                    zzd = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zzh(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzb = zzidlVar;
    }
}
