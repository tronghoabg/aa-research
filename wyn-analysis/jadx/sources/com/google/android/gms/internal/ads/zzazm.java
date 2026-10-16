package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzazm extends zziep implements zziga {
    private static final zzazm zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzifb zzb = zziep.zzbM();
    private zzidl zzc = zzidl.zza;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzazm zzazmVar = new zzazm();
        zzf = zzazmVar;
        zziep.zzbu(zzazm.class, zzazmVar);
    }

    private zzazm() {
    }

    public static zzazl zza() {
        return (zzazl) zzf.zzbn();
    }

    public final /* synthetic */ void zzb(zzidl zzidlVar) {
        zzidlVar.getClass();
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            this.zzb = zziep.zzbN(zzifbVar);
        }
        this.zzb.add(zzidlVar);
    }

    public final /* synthetic */ void zzc(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 1;
        this.zzc = zzidlVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", zzazg.zza, "zze", zzazc.zza});
        }
        if (iOrdinal == 3) {
            return new zzazm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzazl(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzg;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzazm.class) {
            try {
                zziekVar = zzg;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzf);
                    zzg = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zze(int i5) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void zzg(int i5) {
        this.zze = i5 - 1;
        this.zza |= 4;
    }
}
