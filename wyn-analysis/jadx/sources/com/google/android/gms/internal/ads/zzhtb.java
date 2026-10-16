package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhtb extends zziep implements zziga {
    private static final zzhtb zzd;
    private static volatile zzigh zze;
    private String zza = "";
    private zzidl zzb = zzidl.zza;
    private int zzc;

    static {
        zzhtb zzhtbVar = new zzhtb();
        zzd = zzhtbVar;
        zziep.zzbu(zzhtb.class, zzhtbVar);
    }

    private zzhtb() {
    }

    public static zzhsz zzd() {
        return (zzhsz) zzd.zzbn();
    }

    public static zzhtb zze() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzidl zzb() {
        return this.zzb;
    }

    public final zzhta zzc() {
        int i5 = this.zzc;
        zzhta zzhtaVar = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? null : zzhta.REMOTE : zzhta.ASYMMETRIC_PUBLIC : zzhta.ASYMMETRIC_PRIVATE : zzhta.SYMMETRIC : zzhta.UNKNOWN_KEYMATERIAL;
        return zzhtaVar == null ? zzhta.UNRECOGNIZED : zzhtaVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhtb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsz(bArr);
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
        synchronized (zzhtb.class) {
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

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzh(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzb = zzidlVar;
    }

    public final /* synthetic */ void zzi(zzhta zzhtaVar) {
        this.zzc = zzhtaVar.zza();
    }
}
