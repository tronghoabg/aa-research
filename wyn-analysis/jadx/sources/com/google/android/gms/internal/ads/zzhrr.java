package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhrr extends zziep implements zziga {
    private static final zzhrr zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzidl zzb = zzidl.zza;

    static {
        zzhrr zzhrrVar = new zzhrr();
        zzc = zzhrrVar;
        zziep.zzbu(zzhrr.class, zzhrrVar);
    }

    private zzhrr() {
    }

    public static zzhrr zzc(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhrr) zziep.zzbT(zzc, zzidlVar, zzidzVar);
    }

    public static zzhrq zzd() {
        return (zzhrq) zzc.zzbn();
    }

    public static zzigh zze() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzidl zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhrr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrq(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzd;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhrr.class) {
            try {
                zziekVar = zzd;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzc);
                    zzd = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    public final /* synthetic */ void zzg(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzb = zzidlVar;
    }
}
