package dg;

import cg.C1611C;
import cg.C1618g;
import java.io.EOFException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f34288a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Bf.a.f1670a);
        AbstractC3340k.d(bytes, "getBytes(...)");
        f34288a = bytes;
    }

    public static final boolean a(C1611C c1611c, int i5, byte[] bArr, int i10) {
        int i11 = c1611c.f19868c;
        byte[] bArr2 = c1611c.f19866a;
        for (int i12 = 1; i12 < i10; i12++) {
            if (i5 == i11) {
                c1611c = c1611c.f19871f;
                AbstractC3340k.b(c1611c);
                i5 = c1611c.f19867b;
                i11 = c1611c.f19868c;
                bArr2 = c1611c.f19866a;
            }
            if (bArr2[i5] != bArr[i12]) {
                return false;
            }
            i5++;
        }
        return true;
    }

    public static final String b(C1618g c1618g, long j8) throws EOFException {
        AbstractC3340k.e(c1618g, "<this>");
        if (j8 > 0) {
            long j10 = j8 - 1;
            if (c1618g.o(j10) == 13) {
                String string = c1618g.readString(j10, Bf.a.f1670a);
                c1618g.skip(2L);
                return string;
            }
        }
        String string2 = c1618g.readString(j8, Bf.a.f1670a);
        c1618g.skip(1L);
        return string2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r19 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(cg.C1618g r17, cg.x r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dg.a.c(cg.g, cg.x, boolean):int");
    }
}
