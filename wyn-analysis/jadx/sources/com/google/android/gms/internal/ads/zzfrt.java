package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfrt extends zziep implements zziga {
    private static final zzfrt zzb;
    private static volatile zzigh zzc;
    private zzifb zza = zziep.zzbM();

    static {
        zzfrt zzfrtVar = new zzfrt();
        zzb = zzfrtVar;
        zziep.zzbu(zzfrt.class, zzfrtVar);
    }

    private zzfrt() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzfrr.class});
        }
        if (iOrdinal == 3) {
            return new zzfrt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfrs(bArr);
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
        synchronized (zzfrt.class) {
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
