package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhrf extends zziep implements zziga {
    private static final zzhrf zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzhrj zzc;
    private zzidl zzd = zzidl.zza;

    static {
        zzhrf zzhrfVar = new zzhrf();
        zze = zzhrfVar;
        zziep.zzbu(zzhrf.class, zzhrfVar);
    }

    private zzhrf() {
    }

    public static zzhre zzd() {
        return (zzhre) zze.zzbn();
    }

    public static zzhrf zze() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhrj zzb() {
        zzhrj zzhrjVar = this.zzc;
        return zzhrjVar == null ? zzhrj.zzc() : zzhrjVar;
    }

    public final zzidl zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhrf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhre(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzf;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhrf.class) {
            try {
                zziekVar = zzf;
                if (zziekVar == null) {
                    zziekVar = new zziek(zze);
                    zzf = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zzg(zzhrj zzhrjVar) {
        zzhrjVar.getClass();
        this.zzc = zzhrjVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
    }
}
