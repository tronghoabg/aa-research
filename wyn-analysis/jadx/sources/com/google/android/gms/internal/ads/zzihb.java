package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzihb extends zziep implements zziga {
    private static final zzihb zzc;
    private static volatile zzigh zzd;
    private long zza;
    private int zzb;

    static {
        zzihb zzihbVar = new zzihb();
        zzc = zzihbVar;
        zziep.zzbu(zzihb.class, zzihbVar);
    }

    private zzihb() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzihb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziha(bArr);
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
        synchronized (zzihb.class) {
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
}
