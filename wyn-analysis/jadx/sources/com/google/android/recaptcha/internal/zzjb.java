package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class zzjb {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzjc zzc;

    public /* synthetic */ zzjb(zzja zzjaVar) {
    }

    public static int zzF(int i5) {
        return (i5 >>> 1) ^ (-(i5 & 1));
    }

    public static long zzG(long j8) {
        return (j8 >>> 1) ^ (-(1 & j8));
    }

    public static zzjb zzH(byte[] bArr, int i5, int i10, boolean z2) {
        zzix zzixVar = new zzix(bArr, 0, 0, false, null);
        try {
            zzixVar.zze(0);
            return zzixVar;
        } catch (zzlc e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public abstract void zzA(int i5);

    public abstract boolean zzC() throws IOException;

    public abstract boolean zzD() throws IOException;

    public abstract boolean zzE(int i5) throws IOException;

    public abstract double zzb() throws IOException;

    public abstract float zzc() throws IOException;

    public abstract int zzd();

    public abstract int zze(int i5) throws zzlc;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract long zzv() throws IOException;

    public abstract zziv zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract String zzy() throws IOException;

    public abstract void zzz(int i5) throws zzlc;
}
