package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhtw extends zziep implements zziga {
    private static final zzhtw zzd;
    private static volatile zzigh zze;
    private int zza;
    private String zzb = "";
    private zzhte zzc;

    static {
        zzhtw zzhtwVar = new zzhtw();
        zzd = zzhtwVar;
        zziep.zzbu(zzhtw.class, zzhtwVar);
    }

    private zzhtw() {
    }

    public static zzhtw zzc(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhtw) zziep.zzbT(zzd, zzidlVar, zzidzVar);
    }

    public static zzhtv zzd() {
        return (zzhtv) zzd.zzbn();
    }

    public static zzhtw zze() {
        return zzd;
    }

    public final String zza() {
        return this.zzb;
    }

    public final zzhte zzb() {
        zzhte zzhteVar = this.zzc;
        return zzhteVar == null ? zzhte.zzh() : zzhteVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhtw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtv(bArr);
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
        synchronized (zzhtw.class) {
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

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void zzh(zzhte zzhteVar) {
        zzhteVar.getClass();
        this.zzc = zzhteVar;
        this.zza |= 1;
    }
}
