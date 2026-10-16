package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhdm extends zziep implements zziga {
    private static final zzhdm zzd;
    private static volatile zzigh zze;
    private int zza;
    private long zzb;
    private int zzc;

    static {
        zzhdm zzhdmVar = new zzhdm();
        zzd = zzhdmVar;
        zziep.zzbu(zzhdm.class, zzhdmVar);
    }

    private zzhdm() {
    }

    public static zzhdl zza() {
        return (zzhdl) zzd.zzbn();
    }

    public final /* synthetic */ void zzb(long j8) {
        this.zza |= 1;
        this.zzb = j8;
    }

    public final /* synthetic */ void zzd(int i5) {
        this.zzc = i5 - 1;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzhdj.zza});
        }
        if (iOrdinal == 3) {
            return new zzhdm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhdl(bArr);
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
        synchronized (zzhdm.class) {
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
