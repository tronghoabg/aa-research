package Pf;

import A.AbstractC0213f;
import Va.M6;
import cb.AbstractC1593a;
import java.io.EOFException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f9483a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final void a(long j8, long j10, long j11) {
        if (j10 >= 0 && j11 <= j8) {
            if (j10 > j11) {
                throw new IllegalArgumentException(AbstractC0213f.e(M6.u(j10, "startIndex (", ") > endIndex ("), j11, ')'));
            }
            return;
        }
        StringBuilder sbU = M6.u(j10, "startIndex (", ") and endIndex (");
        sbU.append(j11);
        sbU.append(") are not within the range [0..size(");
        sbU.append(j8);
        sbU.append("))");
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public static final void b(long j8, long j10) {
        if (0 > j8 || j8 < j10 || j10 < 0) {
            throw new IllegalArgumentException(M6.s(M6.u(j10, "offset (0) and byteCount (", ") are not within the range [0..size("), j8, "))"));
        }
    }

    public static final String c(a aVar, long j8) throws EOFException {
        if (j8 == 0) {
            return "";
        }
        g gVar = aVar.f9454a;
        if (gVar == null) {
            throw new IllegalStateException("Unreacheable");
        }
        if (gVar.a() < j8) {
            byte[] bArrE = e(aVar, (int) j8);
            return A6.c.o(bArrE, 0, bArrE.length);
        }
        int i5 = gVar.f9470b;
        String strO = A6.c.o(gVar.f9469a, i5, Math.min(gVar.f9471c, ((int) j8) + i5));
        aVar.skip(j8);
        return strO;
    }

    public static final int d(g gVar, byte b5, int i5, int i10) {
        if (i5 < 0 || i5 >= gVar.a()) {
            throw new IllegalArgumentException(String.valueOf(i5).toString());
        }
        if (i5 > i10 || i10 > gVar.a()) {
            throw new IllegalArgumentException(String.valueOf(i10).toString());
        }
        int i11 = gVar.f9470b;
        while (i5 < i10) {
            if (gVar.f9469a[i11 + i5] == b5) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static final byte[] e(i iVar, int i5) {
        AbstractC3340k.e(iVar, "<this>");
        long j8 = i5;
        if (j8 >= 0) {
            return f(iVar, i5);
        }
        throw new IllegalArgumentException(AbstractC1593a.h(j8, "byteCount (", ") < 0").toString());
    }

    public static final byte[] f(i iVar, int i5) {
        if (i5 == -1) {
            for (long j8 = 2147483647L; iVar.getBuffer().f9456c < 2147483647L && iVar.request(j8); j8 *= 2) {
            }
            if (iVar.getBuffer().f9456c >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + iVar.getBuffer().f9456c).toString());
            }
            i5 = (int) iVar.getBuffer().f9456c;
        } else {
            iVar.require(i5);
        }
        byte[] bArr = new byte[i5];
        a buffer = iVar.getBuffer();
        AbstractC3340k.e(buffer, "<this>");
        long j10 = i5;
        int i10 = 0;
        a(j10, 0, j10);
        while (i10 < i5) {
            int iA = buffer.a(i10, i5, bArr);
            if (iA == -1) {
                throw new EOFException(N0.a.e("Source exhausted before reading ", i5, " bytes. Only ", iA, " bytes were read."));
            }
            i10 += iA;
        }
        return bArr;
    }

    public static final String g(i iVar) {
        iVar.request(Long.MAX_VALUE);
        return c(iVar.getBuffer(), iVar.getBuffer().f9456c);
    }
}
