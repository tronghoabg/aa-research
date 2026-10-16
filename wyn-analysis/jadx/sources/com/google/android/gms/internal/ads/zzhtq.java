package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhtq extends zziep implements zziga {
    private static final zzhtq zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private zzhts zzc;

    static {
        zzhtq zzhtqVar = new zzhtq();
        zzd = zzhtqVar;
        zziep.zzbu(zzhtq.class, zzhtqVar);
    }

    private zzhtq() {
    }

    public static zzhtq zzc(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhtq) zziep.zzbT(zzd, zzidlVar, zzidzVar);
    }

    public static zzhtp zzd() {
        return (zzhtp) zzd.zzbn();
    }

    public static zzigh zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhts zzb() {
        zzhts zzhtsVar = this.zzc;
        return zzhtsVar == null ? zzhts.zzd() : zzhtsVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhtq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtp(bArr);
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
        synchronized (zzhtq.class) {
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

    public final /* synthetic */ void zzg(zzhts zzhtsVar) {
        zzhtsVar.getClass();
        this.zzc = zzhtsVar;
        this.zza |= 1;
    }
}
