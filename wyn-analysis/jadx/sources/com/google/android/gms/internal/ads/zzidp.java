package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class zzidp {
    public static final /* synthetic */ int zze = 0;
    private static volatile int zzf = 100;
    int zza;
    int zzb;
    final int zzc = zzf;
    Object zzd;

    private zzidp() {
    }

    public static zzidp zzH(InputStream inputStream, int i5) {
        return inputStream == null ? zzI(zzifc.zza, 0, 0, false) : new zzido(inputStream, 4096, null);
    }

    public static zzidp zzI(byte[] bArr, int i5, int i10, boolean z2) {
        zzidn zzidnVar = new zzidn(bArr, i5, i10, z2, null);
        try {
            zzidnVar.zzB(i10);
            return zzidnVar;
        } catch (zzifh e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static int zzM(int i5) {
        return (i5 >>> 1) ^ (-(i5 & 1));
    }

    public static long zzN(long j8) {
        return (j8 >>> 1) ^ (-(1 & j8));
    }

    public static int zzO(int i5, InputStream inputStream) throws IOException {
        if ((i5 & 128) == 0) {
            return i5;
        }
        int i10 = i5 & 127;
        int i11 = 7;
        while (i11 < 32) {
            int i12 = inputStream.read();
            if (i12 == -1) {
                throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i10 |= (i12 & 127) << i11;
            if ((i12 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        while (i11 < 64) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i13 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        throw new zzifh("CodedInputStream encountered a malformed varint.");
    }

    public abstract int zzB(int i5) throws zzifh;

    public abstract void zzC(int i5);

    public abstract boolean zzD() throws IOException;

    public abstract int zzE();

    public final void zzJ() throws zzifh {
        if (this.zza + this.zzb >= this.zzc) {
            throw new zzifh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzK() throws zzifh {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzL() throws IOException {
        int iZza;
        do {
            iZza = zza();
            if (iZza == 0) {
                return;
            }
            zzJ();
            this.zzb++;
            this.zzb--;
        } while (zzc(iZza));
    }

    public abstract int zza() throws IOException;

    public abstract void zzb(int i5) throws zzifh;

    public abstract boolean zzc(int i5) throws IOException;

    public abstract double zzd() throws IOException;

    public abstract float zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract long zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract boolean zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract String zzm() throws IOException;

    public abstract zzidl zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    public abstract int zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public /* synthetic */ zzidp(byte[] bArr) {
    }
}
