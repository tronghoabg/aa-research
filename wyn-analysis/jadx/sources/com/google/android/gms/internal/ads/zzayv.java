package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzayv extends zziep implements zziga {
    private static final zzayv zzn;
    private static volatile zzigh zzo;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private zzayx zzl;
    private zziex zze = zziep.zzbC();
    private zzifb zzh = zziep.zzbM();
    private zzifa zzm = zziep.zzbE();

    static {
        zzayv zzayvVar = new zzayv();
        zzn = zzayvVar;
        zziep.zzbu(zzayv.class, zzayvVar);
    }

    private zzayv() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဉ\b\f\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzazb.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzayv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzayu(bArr);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzo;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzayv.class) {
            try {
                zziekVar = zzo;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzn);
                    zzo = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
