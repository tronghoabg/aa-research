package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhte extends zziep implements zziga {
    private static final zzhte zzd;
    private static volatile zzigh zze;
    private String zza = "";
    private zzidl zzb = zzidl.zza;
    private int zzc;

    static {
        zzhte zzhteVar = new zzhte();
        zzd = zzhteVar;
        zziep.zzbu(zzhte.class, zzhteVar);
    }

    private zzhte() {
    }

    public static zzhte zzd(byte[] bArr, zzidz zzidzVar) throws zzifh {
        return (zzhte) zziep.zzbV(zzd, bArr, zzidzVar);
    }

    public static zzhtd zze() {
        return (zzhtd) zzd.zzbn();
    }

    public static zzhtd zzg(zzhte zzhteVar) {
        return (zzhtd) zzd.zzbo(zzhteVar);
    }

    public static zzhte zzh() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzidl zzb() {
        return this.zzb;
    }

    public final zzhtx zzc() {
        zzhtx zzhtxVarZzb = zzhtx.zzb(this.zzc);
        return zzhtxVarZzb == null ? zzhtx.UNRECOGNIZED : zzhtxVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhte();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtd(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zze;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhte.class) {
            try {
                zziekVar = zze;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzd);
                    zze = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzj(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzb = zzidlVar;
    }

    public final /* synthetic */ void zzk(zzhtx zzhtxVar) {
        this.zzc = zzhtxVar.zza();
    }
}
