package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhrx extends zziep implements zziga {
    private static final zzhrx zzc;
    private static volatile zzigh zzd;
    private int zza;
    private int zzb;

    static {
        zzhrx zzhrxVar = new zzhrx();
        zzc = zzhrxVar;
        zziep.zzbu(zzhrx.class, zzhrxVar);
    }

    private zzhrx() {
    }

    public static zzhrx zzc(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhrx) zziep.zzbT(zzc, zzidlVar, zzidzVar);
    }

    public static zzhrw zzd() {
        return (zzhrw) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
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
            return zziep.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (iOrdinal == 3) {
            return new zzhrx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhrw(bArr);
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
        synchronized (zzhrx.class) {
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

    public final /* synthetic */ void zze(int i5) {
        this.zza = i5;
    }
}
