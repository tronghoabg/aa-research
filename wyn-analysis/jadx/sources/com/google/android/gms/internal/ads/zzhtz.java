package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes3.dex */
public final class zzhtz extends zziep implements zziga {
    public static final /* synthetic */ int zza = 0;
    private static final zzhtz zzd;
    private static volatile zzigh zze;
    private String zzb = "";
    private zzifb zzc = zziep.zzbM();

    static {
        zzhtz zzhtzVar = new zzhtz();
        zzd = zzhtzVar;
        zziep.zzbu(zzhtz.class, zzhtzVar);
    }

    private zzhtz() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhtg.class});
        }
        if (iOrdinal == 3) {
            return new zzhtz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhty(bArr);
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
        synchronized (zzhtz.class) {
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
}
