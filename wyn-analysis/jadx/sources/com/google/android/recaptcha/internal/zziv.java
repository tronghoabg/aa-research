package com.google.android.recaptcha.internal;

import A7.AbstractC0279p0;
import R8.v;
import cb.AbstractC1593a;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import wg.b;

/* loaded from: classes4.dex */
public abstract class zziv implements Iterable, Serializable {
    public static final zziv zzb = new zziu(zzla.zzb);
    private int zza = 0;

    static {
        int i5 = zzij.zza;
    }

    public static int zzi(int i5, int i10, int i11) {
        int i12 = i10 - i5;
        if ((i5 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0279p0.i(i5, "Beginning index: ", " < 0"));
        }
        if (i10 < i5) {
            throw new IndexOutOfBoundsException(v.e(i5, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(v.e(i10, i11, "End index: ", " >= "));
    }

    public static zziv zzk(byte[] bArr, int i5, int i10) {
        zzi(i5, i5 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        return new zziu(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzf = this.zza;
        if (iZzf == 0) {
            int iZzd = zzd();
            iZzf = zzf(iZzd, 0, iZzd);
            if (iZzf == 0) {
                iZzf = 1;
            }
            this.zza = iZzf;
        }
        return iZzf;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzio(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return b.c(AbstractC1593a.k(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzmw.zza(this) : zzmw.zza(zzg(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i5);

    public abstract byte zzb(int i5);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i5, int i10, int i11);

    public abstract int zzf(int i5, int i10, int i11);

    public abstract zziv zzg(int i5, int i10);

    public abstract void zzh(zzin zzinVar) throws IOException;

    public final int zzj() {
        return this.zza;
    }

    public final byte[] zzl() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzla.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
