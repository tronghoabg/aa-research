package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzayk extends zziep implements zziga {
    private static final zzayk zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        zzayk zzaykVar = new zzayk();
        zzd = zzaykVar;
        zziep.zzbu(zzayk.class, zzaykVar);
    }

    private zzayk() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", zzaxx.zza, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzayk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayj(bArr);
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
        synchronized (zzayk.class) {
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
