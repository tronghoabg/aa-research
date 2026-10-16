package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzilk extends zziep implements zziga {
    private static final zzilk zzn;
    private static volatile zzigh zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private zzilp zzk;
    private zzilj zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        zzilk zzilkVar = new zzilk();
        zzn = zzilkVar;
        zziep.zzbu(zzilk.class, zzilkVar);
    }

    private zzilk() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", zzilt.zza, "zze", zzils.zza, "zzf", "zzg", "zzh", "zzi", "zzj", zzill.zza, "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzilk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzilh(bArr);
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
        synchronized (zzilk.class) {
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
