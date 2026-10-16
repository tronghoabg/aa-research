package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhut extends zziep implements zziga {
    private static final zzhut zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private zzhuv zzc;

    static {
        zzhut zzhutVar = new zzhut();
        zzd = zzhutVar;
        zziep.zzbu(zzhut.class, zzhutVar);
    }

    private zzhut() {
    }

    public static zzhut zzc(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhut) zziep.zzbT(zzd, zzidlVar, zzidzVar);
    }

    public static zzhus zzd() {
        return (zzhus) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhuv zzb() {
        zzhuv zzhuvVar = this.zzc;
        return zzhuvVar == null ? zzhuv.zzc() : zzhuvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhut();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhus(bArr);
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
        synchronized (zzhut.class) {
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

    public final /* synthetic */ void zze(zzhuv zzhuvVar) {
        zzhuvVar.getClass();
        this.zzc = zzhuvVar;
        this.zza |= 1;
    }
}
