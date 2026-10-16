package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzayo extends zziep implements zziga {
    private static final zzayo zzd;
    private static volatile zzigh zze;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;

    static {
        zzayo zzayoVar = new zzayo();
        zzd = zzayoVar;
        zziep.zzbu(zzayo.class, zzayoVar);
    }

    private zzayo() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzazd.zza});
        }
        if (iOrdinal == 3) {
            return new zzayo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayn(bArr);
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
        synchronized (zzayo.class) {
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
