package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zziiz extends zziep implements zziga {
    private static final zziiz zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zziiy zzc;
    private long zzd;
    private String zzb = "";
    private String zze = "";

    static {
        zziiz zziizVar = new zziiz();
        zzf = zziizVar;
        zziep.zzbu(zziiz.class, zziizVar);
    }

    private zziiz() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zziiz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziiw(bArr);
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
        synchronized (zziiz.class) {
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
