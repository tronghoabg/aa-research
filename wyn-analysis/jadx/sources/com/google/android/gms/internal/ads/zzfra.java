package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfra extends zziep implements zziga {
    private static final zzfra zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzifb zzb = zziep.zzbM();
    private zziib zzc;

    static {
        zzfra zzfraVar = new zzfra();
        zzd = zzfraVar;
        zziep.zzbu(zzfra.class, zzfraVar);
    }

    private zzfra() {
    }

    public static zzfqx zzb() {
        return (zzfqx) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final /* synthetic */ void zzc(zzfqz zzfqzVar) {
        zzfqzVar.getClass();
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            this.zzb = zziep.zzbN(zzifbVar);
        }
        this.zzb.add(zzfqzVar);
    }

    public final /* synthetic */ void zzd() {
        this.zzb = zziep.zzbM();
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzfqz.class, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzfra();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfqx(bArr);
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
        synchronized (zzfra.class) {
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
