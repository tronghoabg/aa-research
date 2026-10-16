package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhts extends zziep implements zziga {
    private static final zzhts zzb;
    private static volatile zzigh zzc;
    private String zza = "";

    static {
        zzhts zzhtsVar = new zzhts();
        zzb = zzhtsVar;
        zziep.zzbu(zzhts.class, zzhtsVar);
    }

    private zzhts() {
    }

    public static zzhts zzb(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhts) zziep.zzbT(zzb, zzidlVar, zzidzVar);
    }

    public static zzhtr zzc() {
        return (zzhtr) zzb.zzbn();
    }

    public static zzhts zzd() {
        return zzb;
    }

    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhts();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtr(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzc;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhts.class) {
            try {
                zziekVar = zzc;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzb);
                    zzc = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }
}
