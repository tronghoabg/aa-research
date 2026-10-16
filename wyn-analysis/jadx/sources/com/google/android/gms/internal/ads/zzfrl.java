package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfrl extends zziep implements zziga {
    private static final zzfrl zzb;
    private static volatile zzigh zzc;
    private boolean zza;

    static {
        zzfrl zzfrlVar = new zzfrl();
        zzb = zzfrlVar;
        zziep.zzbu(zzfrl.class, zzfrlVar);
    }

    private zzfrl() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzfrl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfrk(bArr);
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
        synchronized (zzfrl.class) {
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
}
