package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zziij extends zziep implements zziga {
    private static final zziij zzb;
    private static volatile zzigh zzc;
    private zzifb zza = zziep.zzbM();

    static {
        zziij zziijVar = new zziij();
        zzb = zziijVar;
        zziep.zzbu(zziij.class, zziijVar);
    }

    private zziij() {
    }

    public static zziii zzc() {
        return (zziii) zzb.zzbn();
    }

    public final /* synthetic */ void zzd(zziih zziihVar) {
        zziihVar.getClass();
        zzifb zzifbVar = this.zza;
        if (!zzifbVar.zza()) {
            this.zza = zziep.zzbN(zzifbVar);
        }
        this.zza.add(zziihVar);
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zziih.class});
        }
        if (iOrdinal == 3) {
            return new zziij();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziii(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzc;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zziij.class) {
            try {
                zziekVar = zzc;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzb);
                    zzc = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
