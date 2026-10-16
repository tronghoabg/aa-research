package com.google.android.gms.internal.measurement;

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

/* loaded from: classes4.dex */
public abstract class zzik implements Serializable, Iterable<Byte> {
    public static final zzik zza = new zziv(zzjv.zzb);
    private static final zzir zzb = new zziu();
    private int zzc = 0;

    static {
        new zzim();
    }

    public static /* synthetic */ int zza(byte b5) {
        return b5 & ForkServer.ERROR;
    }

    public static zzik zzb(byte[] bArr) {
        return new zziv(bArr);
    }

    public static zzit zzc(int i5) {
        return new zzit(i5);
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
        return new zzin(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return b.c(AbstractC1593a.k(zzb(), "<ByteString@", hexString, " size=", " contents=\""), zzb() <= 50 ? zzmg.zza(this) : a.f(zzmg.zza(zza(0, 47)), "..."), "\">");
    }

    public abstract byte zza(int i5);

    public abstract zzik zza(int i5, int i10);

    public abstract void zza(zzil zzilVar) throws IOException;

    public abstract byte zzb(int i5);

    public abstract int zzb();

    public abstract int zzb(int i5, int i10, int i11);

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

    public static zzik zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzik zza(byte[] bArr, int i5, int i10) {
        zza(i5, i5 + i10, bArr.length);
        return new zziv(zzb.zza(bArr, i5, i10));
    }

    public static zzik zza(String str) {
        return new zziv(str.getBytes(zzjv.zza));
    }
}
