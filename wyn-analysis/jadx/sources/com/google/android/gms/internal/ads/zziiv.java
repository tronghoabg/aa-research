package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zziiv extends zziep implements zziga {
    private static final zziiv zzc;
    private static volatile zzigh zzd;
    private int zza;
    private String zzb = "";

    static {
        zziiv zziivVar = new zziiv();
        zzc = zziivVar;
        zziep.zzbu(zziiv.class, zziivVar);
    }

    private zziiv() {
    }

    public static zziiu zzc() {
        return (zziiu) zzc.zzbn();
    }

    public final /* synthetic */ void zzd(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zziiv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziiu(bArr);
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
        synchronized (zziiv.class) {
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
}
