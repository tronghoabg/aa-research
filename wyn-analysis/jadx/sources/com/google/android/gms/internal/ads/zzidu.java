package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class zzidu extends zzidc {
    public static final /* synthetic */ int zzb = 0;
    private static final boolean zzc = zzihk.zza();
    Object zza;

    private zzidu() {
        throw null;
    }

    public static int zzE(int i5) {
        if (i5 > 4096) {
            return 4096;
        }
        return i5;
    }

    public static int zzF(int i5) {
        return (352 - (Integer.numberOfLeadingZeros(i5) * 9)) >>> 6;
    }

    public static int zzG(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    public static int zzH(zzifz zzifzVar) {
        int iZzbr = zzifzVar.zzbr();
        return zzF(iZzbr) + iZzbr;
    }

    public final void zzI() {
        if (zzy() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (zzy() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract void zzb(int i5, int i10) throws IOException;

    public abstract void zzc(int i5, int i10) throws IOException;

    public abstract void zzd(int i5, int i10) throws IOException;

    public abstract void zze(int i5, int i10) throws IOException;

    public abstract void zzf(int i5, long j8) throws IOException;

    public abstract void zzg(int i5, long j8) throws IOException;

    public abstract void zzh(int i5, boolean z2) throws IOException;

    public abstract void zzi(int i5, String str) throws IOException;

    public abstract void zzj(int i5, zzidl zzidlVar) throws IOException;

    public abstract void zzk(zzidl zzidlVar) throws IOException;

    public abstract void zzl(byte[] bArr, int i5, int i10) throws IOException;

    public abstract void zzm(int i5, zzifz zzifzVar) throws IOException;

    public abstract void zzn(int i5, zzidl zzidlVar) throws IOException;

    public abstract void zzo(zzifz zzifzVar) throws IOException;

    public abstract void zzp(byte b5) throws IOException;

    public abstract void zzq(int i5) throws IOException;

    public abstract void zzr(int i5) throws IOException;

    public abstract void zzs(int i5) throws IOException;

    public abstract void zzt(long j8) throws IOException;

    public abstract void zzu(long j8) throws IOException;

    public abstract void zzw(String str) throws IOException;

    public abstract void zzx() throws IOException;

    public abstract int zzy();

    public /* synthetic */ zzidu(byte[] bArr) {
    }
}
