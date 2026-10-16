package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzazf extends zziep implements zziga {
    private static final zzazf zzi;
    private static volatile zzigh zzj;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";
    private String zzh = "";

    static {
        zzazf zzazfVar = new zzazf();
        zzi = zzazfVar;
        zziep.zzbu(zzazf.class, zzazfVar);
    }

    private zzazf() {
    }

    public static zzaze zza() {
        return (zzaze) zzi.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void zzc(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzd(long j8) {
        this.zza |= 4;
        this.zzd = j8;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzi, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzazf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaze(bArr);
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzj;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzazf.class) {
            try {
                zziekVar = zzj;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzi);
                    zzj = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void zzg(long j8) {
        this.zza |= 16;
        this.zzf = j8;
    }

    public final /* synthetic */ void zzh(long j8) {
        this.zza |= 32;
        this.zzg = j8;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza |= 64;
        this.zzh = str;
    }
}
