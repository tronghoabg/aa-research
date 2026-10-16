package B1;

import A7.AbstractC0279p0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f1506a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1507b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1508c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1509d;

    public d(int i5, int i10, byte[] bArr) {
        this(-1L, bArr, i5, i10);
    }

    public static d a(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(h.f1542b0);
        return new d(2, bytes.length, bytes);
    }

    public static d b(long j8, ByteOrder byteOrder) {
        return c(new long[]{j8}, byteOrder);
    }

    public static d c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.f1533S[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j8 : jArr) {
            byteBufferWrap.putInt((int) j8);
        }
        return new d(4, jArr.length, byteBufferWrap.array());
    }

    public static d d(f[] fVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.f1533S[5] * fVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (f fVar : fVarArr) {
            byteBufferWrap.putInt((int) fVar.f1514a);
            byteBufferWrap.putInt((int) fVar.f1515b);
        }
        return new d(5, fVarArr.length, byteBufferWrap.array());
    }

    public static d e(int i5, ByteOrder byteOrder) {
        return f(new int[]{i5}, byteOrder);
    }

    public static d f(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.f1533S[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i5 : iArr) {
            byteBufferWrap.putShort((short) i5);
        }
        return new d(3, iArr.length, byteBufferWrap.array());
    }

    public final double g(ByteOrder byteOrder) throws Throwable {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objJ instanceof String) {
            return Double.parseDouble((String) objJ);
        }
        if (objJ instanceof long[]) {
            if (((long[]) objJ).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objJ instanceof int[]) {
            if (((int[]) objJ).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objJ instanceof double[]) {
            double[] dArr = (double[]) objJ;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objJ instanceof f[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        f[] fVarArr = (f[]) objJ;
        if (fVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        f fVar = fVarArr[0];
        return fVar.f1514a / fVar.f1515b;
    }

    public final int h(ByteOrder byteOrder) {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objJ instanceof String) {
            return Integer.parseInt((String) objJ);
        }
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objJ instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objJ;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String i(ByteOrder byteOrder) throws Throwable {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            return null;
        }
        if (objJ instanceof String) {
            return (String) objJ;
        }
        StringBuilder sb2 = new StringBuilder();
        int i5 = 0;
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            while (i5 < jArr.length) {
                sb2.append(jArr[i5]);
                i5++;
                if (i5 != jArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objJ instanceof int[]) {
            int[] iArr = (int[]) objJ;
            while (i5 < iArr.length) {
                sb2.append(iArr[i5]);
                i5++;
                if (i5 != iArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objJ instanceof double[]) {
            double[] dArr = (double[]) objJ;
            while (i5 < dArr.length) {
                sb2.append(dArr[i5]);
                i5++;
                if (i5 != dArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (!(objJ instanceof f[])) {
            return null;
        }
        f[] fVarArr = (f[]) objJ;
        while (i5 < fVarArr.length) {
            sb2.append(fVarArr[i5].f1514a);
            sb2.append('/');
            sb2.append(fVarArr[i5].f1515b);
            i5++;
            if (i5 != fVarArr.length) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:16:0x0033 */
    /* JADX WARN: Removed duplicated region for block: B:153:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v24, types: [B1.f[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [B1.f[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable j(java.nio.ByteOrder r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.d.j(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(h.f1532R[this.f1506a]);
        sb2.append(", data length:");
        return AbstractC0279p0.j(this.f1509d.length, ")", sb2);
    }

    public d(long j8, byte[] bArr, int i5, int i10) {
        this.f1506a = i5;
        this.f1507b = i10;
        this.f1508c = j8;
        this.f1509d = bArr;
    }
}
