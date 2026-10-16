package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhtu extends zziep implements zziga {
    private static final zzhtu zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private zzhtw zzc;

    static {
        zzhtu zzhtuVar = new zzhtu();
        zzd = zzhtuVar;
        zziep.zzbu(zzhtu.class, zzhtuVar);
    }

    private zzhtu() {
    }

    public static zzhtu zzc(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhtu) zziep.zzbT(zzd, zzidlVar, zzidzVar);
    }

    public static zzhtt zzd() {
        return (zzhtt) zzd.zzbn();
    }

    public static zzigh zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhtw zzb() {
        zzhtw zzhtwVar = this.zzc;
        return zzhtwVar == null ? zzhtw.zze() : zzhtwVar;
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
            return new zzhtu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtt(bArr);
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
        synchronized (zzhtu.class) {
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

    public final /* synthetic */ void zzg(zzhtw zzhtwVar) {
        zzhtwVar.getClass();
        this.zzc = zzhtwVar;
        this.zza |= 1;
    }
}
