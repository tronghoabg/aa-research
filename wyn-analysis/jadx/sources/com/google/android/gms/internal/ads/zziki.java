package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zziki extends zziep implements zziga {
    private static final zziki zzf;
    private static volatile zzigh zzg;
    private int zza;
    private String zzb = "";
    private zzifb zzc = zziep.zzbM();
    private zzifb zzd = zziep.zzbM();
    private String zze = "";

    static {
        zziki zzikiVar = new zziki();
        zzf = zzikiVar;
        zziep.zzbu(zziki.class, zzikiVar);
    }

    private zziki() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zziki();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzikh(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzg;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zziki.class) {
            try {
                zziekVar = zzg;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzf);
                    zzg = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
