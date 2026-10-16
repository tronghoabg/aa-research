package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zziir extends zziep implements zziga {
    private static final zziir zzy;
    private static volatile zzigh zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzp;
    private long zzu;
    private boolean zzw;
    private String zzd = "";
    private zzifb zze = zziep.zzbM();
    private String zzj = "";
    private zzifb zzo = zziep.zzbM();
    private zziex zzv = zziep.zzbC();
    private zziex zzx = zziep.zzbC();

    static {
        zziir zziirVar = new zziir();
        zzy = zziirVar;
        zziep.zzbu(zziir.class, zziirVar);
    }

    private zziir() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", zziiq.zza, "zzc", "zzd", "zze", "zzf", zziio.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zziin.class, "zzp", "zzu", "zzv", zziif.zza(), "zzw", "zzx", zziip.zza});
        }
        if (iOrdinal == 3) {
            return new zziir();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziik(bArr);
        }
        if (iOrdinal == 5) {
            return zzy;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzz;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zziir.class) {
            try {
                zziekVar = zzz;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzy);
                    zzz = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
