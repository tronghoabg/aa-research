package com.google.android.gms.internal.p002firebaseauthapi;

import A7.AbstractC0279p0;
import N0.a;
import R8.v;
import cb.AbstractC1593a;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import org.apache.tika.fork.ForkServer;
import wg.b;

/* loaded from: classes.dex */
public abstract class zzaip implements Serializable, Iterable<Byte> {
    public static final zzaip zza = new zzaiw(zzakb.zzb);
    private static final zzais zzb = new zzaiz();
    private int zzc = 0;

    static {
        new zzair();
    }

    public static /* synthetic */ int zza(byte b5) {
        return b5 & ForkServer.ERROR;
    }

    public static zzaip zzb(byte[] bArr) {
        return new zzaiw(bArr);
    }

    public static zzaiu zzc(int i5) {
        return new zzaiu(i5);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzb = this.zzc;
        if (iZzb == 0) {
            int iZzb2 = zzb();
            iZzb = zzb(iZzb2, 0, iZzb2);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzc = iZzb;
        }
        return iZzb;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzaio(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return b.c(AbstractC1593a.k(zzb(), "<ByteString@", hexString, " size=", " contents=\""), zzb() <= 50 ? zzamh.zza(this) : a.f(zzamh.zza(zza(0, 47)), "..."), "\">");
    }

    public abstract byte zza(int i5);

    public abstract zzaip zza(int i5, int i10);

    public abstract void zza(zzaim zzaimVar) throws IOException;

    public abstract void zza(byte[] bArr, int i5, int i10, int i11);

    public abstract byte zzb(int i5);

    public abstract int zzb();

    public abstract int zzb(int i5, int i10, int i11);

    public abstract zzajb zzc();

    public final byte[] zzd() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzakb.zzb;
        }
        byte[] bArr = new byte[iZzb];
        zza(bArr, 0, 0, iZzb);
        return bArr;
    }

    public static int zza(int i5, int i10, int i11) {
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

    public final int zza() {
        return this.zzc;
    }

    public static zzaip zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzaip zza(byte[] bArr, int i5, int i10) {
        zza(i5, i5 + i10, bArr.length);
        return new zzaiw(zzb.zza(bArr, i5, i10));
    }

    public static zzaip zza(String str) {
        return new zzaiw(str.getBytes(zzakb.zza));
    }
}
