package com.google.android.gms.internal.play_billing;

import A7.AbstractC0279p0;
import R8.v;
import cb.AbstractC1593a;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import wg.b;

/* loaded from: classes4.dex */
public abstract class zzbq implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzbq zzb = new zzbn(zzda.zzd);
    private static final zzbp zzd;
    private int zzc = 0;

    static {
        int i5 = zzbb.zza;
        zzd = new zzbp(null);
        zza = new zzbh();
    }

    public static int zzj(int i5, int i10, int i11) {
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

    public static zzbq zzl(byte[] bArr, int i5, int i10) {
        zzj(i5, i5 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        return new zzbn(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zzc;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zzc = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzbg(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return b.c(AbstractC1593a.k(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzfd.zza(this) : zzfd.zza(zzf(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i5);

    public abstract byte zzb(int i5);

    public abstract int zzd();

    public abstract int zze(int i5, int i10, int i11);

    public abstract zzbq zzf(int i5, int i10);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzbf zzbfVar) throws IOException;

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
