package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzijv extends zziep implements zziga {
    private static final zzijv zzf;
    private static volatile zzigh zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzijv zzijvVar = new zzijv();
        zzf = zzijvVar;
        zziep.zzbu(zzijv.class, zzijvVar);
    }

    private zzijv() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", zziju.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzijv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzijt(bArr);
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
        synchronized (zzijv.class) {
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
