package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzidk extends OutputStream {
    private static final byte[] zza = new byte[0];
    private int zzd;
    private int zzf;
    private final int zzb = 128;
    private final ArrayList zzc = new ArrayList();
    private byte[] zze = new byte[128];

    public zzidk(int i5) {
    }

    private final void zzc(int i5) {
        this.zzc.add(new zzidj(this.zze));
        int length = this.zzd + this.zze.length;
        this.zzd = length;
        this.zze = new byte[Math.max(this.zzb, Math.max(i5, length >>> 1))];
        this.zzf = 0;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        return "<ByteString.Output@" + Integer.toHexString(System.identityHashCode(this)) + " size=" + zzb() + ">";
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i5) {
        try {
            if (this.zzf == this.zze.length) {
                zzc(1);
            }
            byte[] bArr = this.zze;
            int i10 = this.zzf;
            this.zzf = i10 + 1;
            bArr[i10] = (byte) i5;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzidl zza() {
        try {
            int i5 = this.zzf;
            byte[] bArr = this.zze;
            if (i5 >= bArr.length) {
                this.zzc.add(new zzidj(this.zze));
                this.zze = zza;
            } else if (i5 > 0) {
                this.zzc.add(new zzidj(Arrays.copyOf(bArr, i5)));
            }
            this.zzd += this.zzf;
            this.zzf = 0;
        } catch (Throwable th) {
            throw th;
        }
        return zzidl.zzy(this.zzc);
    }

    public final synchronized int zzb() {
        return this.zzd + this.zzf;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i5, int i10) {
        byte[] bArr2 = this.zze;
        int length = bArr2.length;
        int i11 = this.zzf;
        int i12 = length - i11;
        if (i10 <= i12) {
            System.arraycopy(bArr, i5, bArr2, i11, i10);
            this.zzf += i10;
            return;
        }
        System.arraycopy(bArr, i5, bArr2, i11, i12);
        int i13 = i10 - i12;
        zzc(i13);
        System.arraycopy(bArr, i5 + i12, this.zze, 0, i13);
        this.zzf = i13;
    }
}
