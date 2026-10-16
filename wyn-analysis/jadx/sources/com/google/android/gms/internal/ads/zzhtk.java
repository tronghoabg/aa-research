package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzhtk extends zziep implements zziga {
    private static final zzhtk zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzifb zzb = zziep.zzbM();

    static {
        zzhtk zzhtkVar = new zzhtk();
        zzc = zzhtkVar;
        zziep.zzbu(zzhtk.class, zzhtkVar);
    }

    private zzhtk() {
    }

    public static zzhtk zze(byte[] bArr, zzidz zzidzVar) throws zzifh {
        return (zzhtk) zziep.zzbV(zzc, bArr, zzidzVar);
    }

    public static zzhtk zzg(InputStream inputStream, zzidz zzidzVar) throws IOException {
        return (zzhtk) zziep.zzbX(zzc, inputStream, zzidzVar);
    }

    public static zzhth zzh() {
        return (zzhth) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhtj zzd(int i5) {
        return (zzhtj) this.zzb.get(i5);
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhtj.class});
        }
        if (iOrdinal == 3) {
            return new zzhtk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhth(bArr);
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
        synchronized (zzhtk.class) {
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

    public final /* synthetic */ void zzi(int i5) {
        this.zza = i5;
    }

    public final /* synthetic */ void zzj(zzhtj zzhtjVar) {
        zzhtjVar.getClass();
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            this.zzb = zziep.zzbN(zzifbVar);
        }
        this.zzb.add(zzhtjVar);
    }
}
