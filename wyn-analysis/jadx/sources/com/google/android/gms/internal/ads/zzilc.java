package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzilc extends zziep implements zziga {
    private static final zzilc zzp;
    private static volatile zzigh zzu;
    private int zza;
    private boolean zzh;
    private double zzi;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private zzifb zze = zziep.zzbM();
    private String zzf = "";
    private String zzg = "";
    private zzifb zzj = zziep.zzbM();

    static {
        zzilc zzilcVar = new zzilc();
        zzp = zzilcVar;
        zziep.zzbu(zzilc.class, zzilcVar);
    }

    private zzilc() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", zzilb.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzila.class, "zzc", "zzk", zziky.zza, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iOrdinal == 3) {
            return new zzilc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzikx(bArr);
        }
        if (iOrdinal == 5) {
            return zzp;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzu;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzilc.class) {
            try {
                zziekVar = zzu;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzp);
                    zzu = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
