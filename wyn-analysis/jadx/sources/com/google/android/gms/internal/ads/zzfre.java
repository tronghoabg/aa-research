package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfre extends zziep implements zziga {
    private static final zzfre zzi;
    private static volatile zzigh zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        zzfre zzfreVar = new zzfre();
        zzi = zzfreVar;
        zziep.zzbu(zzfre.class, zzfreVar);
    }

    private zzfre() {
    }

    public static zzfrd zza() {
        return (zzfrd) zzi.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzc(long j8) {
        this.zzb = j8;
    }

    public final /* synthetic */ void zzd(long j8) {
        this.zzc = j8;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzfre();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfrd(bArr);
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
        synchronized (zzfre.class) {
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

    public final /* synthetic */ void zze(boolean z2) {
        this.zzd = z2;
    }

    public final /* synthetic */ void zzg(long j8) {
        this.zze = j8;
    }

    public final /* synthetic */ void zzh(long j8) {
        this.zzf = j8;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzg = str;
    }

    public final /* synthetic */ void zzk(int i5) {
        this.zzh = i5 - 2;
    }
}
