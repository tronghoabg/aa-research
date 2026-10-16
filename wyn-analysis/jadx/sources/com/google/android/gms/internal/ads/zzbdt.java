package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzbdt extends zziep implements zziga {
    private static final zzbdt zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzbee zzb;
    private zziex zzc = zziep.zzbC();

    static {
        zzbdt zzbdtVar = new zzbdt();
        zzd = zzbdtVar;
        zziep.zzbu(zzbdt.class, zzbdtVar);
    }

    private zzbdt() {
    }

    public static zzbdt zzc(byte[] bArr, zzidz zzidzVar) throws zzifh {
        return (zzbdt) zziep.zzbV(zzd, bArr, zzidzVar);
    }

    public final zzbee zza() {
        zzbee zzbeeVar = this.zzb;
        return zzbeeVar == null ? zzbee.zze() : zzbeeVar;
    }

    public final List zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzbdt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbds(bArr);
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
        synchronized (zzbdt.class) {
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
