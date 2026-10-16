package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import A7.AbstractC0279p0;
import R8.v;
import cb.AbstractC1593a;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import wg.b;

/* loaded from: classes4.dex */
public abstract class zbtc implements Iterable, Serializable {
    public static final zbtc zbb = new zbtb(zbuo.zbb);
    private int zba = 0;

    static {
        int i5 = zbsm.zba;
    }

    public static int zbh(int i5, int i10, int i11) {
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

    public static zbtc zbj(byte[] bArr, int i5, int i10) {
        zbh(i5, i5 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        return new zbtb(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZbe = this.zba;
        if (iZbe == 0) {
            int iZbd = zbd();
            iZbe = zbe(iZbd, 0, iZbd);
            if (iZbe == 0) {
                iZbe = 1;
            }
            this.zba = iZbe;
        }
        return iZbe;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zbsu(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return b.c(AbstractC1593a.k(zbd(), "<ByteString@", hexString, " size=", " contents=\""), zbd() <= 50 ? zbwj.zba(this) : zbwj.zba(zbf(0, 47)).concat("..."), "\">");
    }

    public abstract byte zba(int i5);

    public abstract byte zbb(int i5);

    public abstract int zbd();

    public abstract int zbe(int i5, int i10, int i11);

    public abstract zbtc zbf(int i5, int i10);

    public abstract void zbg(zbst zbstVar) throws IOException;

    public final int zbi() {
        return this.zba;
    }
}
