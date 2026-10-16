package w9;

import com.google.protobuf.ByteString;
import java.security.SecureRandom;
import java.util.Iterator;
import m9.B;
import m9.F;
import m9.G;
import md.k0;
import md.l0;
import org.apache.tika.fork.ForkServer;

/* renamed from: w9.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4397p {

    /* renamed from: a, reason: collision with root package name */
    public static final B f47455a;

    static {
        new SecureRandom();
        f47455a = new B(27);
    }

    public static Object a(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static int b(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i5 = 0; i5 < iMin; i5++) {
            int i10 = bArr[i5] & ForkServer.ERROR;
            int i11 = bArr2[i5] & ForkServer.ERROR;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
        }
        return d(bArr.length, bArr2.length);
    }

    public static int c(ByteString byteString, ByteString byteString2) {
        int iMin = Math.min(byteString.size(), byteString2.size());
        for (int i5 = 0; i5 < iMin; i5++) {
            int iByteAt = byteString.byteAt(i5) & ForkServer.ERROR;
            int iByteAt2 = byteString2.byteAt(i5) & ForkServer.ERROR;
            if (iByteAt < iByteAt2) {
                return -1;
            }
            if (iByteAt > iByteAt2) {
                return 1;
            }
        }
        return d(byteString.size(), byteString2.size());
    }

    public static int d(int i5, int i10) {
        if (i5 < i10) {
            return -1;
        }
        return i5 > i10 ? 1 : 0;
    }

    public static int e(double d3, long j8) {
        if (Double.isNaN(d3) || d3 < -9.223372036854776E18d) {
            return -1;
        }
        if (d3 >= 9.223372036854776E18d) {
            return 1;
        }
        int iCompare = Long.compare((long) d3, j8);
        return iCompare != 0 ? iCompare : Fe.b.w(d3, j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(java.util.Iterator r6, java.util.Iterator r7, java.util.Comparator r8, w9.InterfaceC4388g r9, w9.InterfaceC4388g r10) {
        /*
            java.lang.Object r0 = a(r6)
            java.lang.Object r1 = a(r7)
        L8:
            if (r0 != 0) goto Le
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L20
            if (r1 == 0) goto L20
            int r4 = r8.compare(r0, r1)
            if (r4 >= 0) goto L1b
            goto L26
        L1b:
            if (r4 <= 0) goto L1e
            goto L23
        L1e:
            r3 = r2
            goto L26
        L20:
            if (r0 == 0) goto L23
            goto L26
        L23:
            r5 = r3
            r3 = r2
            r2 = r5
        L26:
            if (r2 == 0) goto L30
            r9.accept(r1)
            java.lang.Object r1 = a(r7)
            goto L8
        L30:
            if (r3 == 0) goto L3a
            r10.accept(r0)
            java.lang.Object r0 = a(r6)
            goto L8
        L3a:
            java.lang.Object r0 = a(r6)
            java.lang.Object r1 = a(r7)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.AbstractC4397p.f(java.util.Iterator, java.util.Iterator, java.util.Comparator, w9.g, w9.g):void");
    }

    public static G g(k0 k0Var) {
        k0Var.getClass();
        l0 l0Var = new l0(k0Var);
        return new G(l0Var.getMessage(), (F) F.f40422m.get(k0Var.f40685a.f40671a, F.UNKNOWN), l0Var);
    }

    public static StringBuilder h(int i5, CharSequence charSequence, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (i5 != 0) {
            sb2.append(charSequence);
            for (int i10 = 1; i10 < i5; i10++) {
                sb2.append((CharSequence) str);
                sb2.append(charSequence);
            }
        }
        return sb2;
    }

    public static String i(ByteString byteString) {
        int size = byteString.size();
        StringBuilder sb2 = new StringBuilder(size * 2);
        for (int i5 = 0; i5 < size; i5++) {
            byte bByteAt = byteString.byteAt(i5);
            sb2.append(Character.forDigit((bByteAt & ForkServer.ERROR) >>> 4, 16));
            sb2.append(Character.forDigit(bByteAt & 15, 16));
        }
        return sb2.toString();
    }
}
