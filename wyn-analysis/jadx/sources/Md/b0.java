package md;

import Va.M6;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;
import k8.AbstractC3198g;
import m8.C3496c;
import m8.C3498e;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f40614c = Logger.getLogger(b0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final C3542j f40615d = new C3542j(8);

    /* renamed from: e, reason: collision with root package name */
    public static final C3496c f40616e;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f40617a;

    /* renamed from: b, reason: collision with root package name */
    public int f40618b;

    static {
        C3496c c3496c = C3498e.f40402d;
        if (c3496c.f40405b != null) {
            c3496c = new C3496c(c3496c.f40404a, (Character) null);
        }
        f40616e = c3496c;
    }

    public final void a(Y y10) {
        if (this.f40618b == 0) {
            return;
        }
        int i5 = 0;
        int i10 = 0;
        while (true) {
            int i11 = this.f40618b;
            if (i5 >= i11) {
                Arrays.fill(this.f40617a, i10 * 2, i11 * 2, (Object) null);
                this.f40618b = i10;
                return;
            }
            if (!Arrays.equals(y10.f40608b, e(i5))) {
                byte[] bArrE = e(i5);
                Object[] objArr = this.f40617a;
                int i12 = i10 * 2;
                objArr[i12] = bArrE;
                Object obj = objArr[(i5 * 2) + 1];
                if (objArr instanceof byte[][]) {
                    b(objArr != null ? objArr.length : 0);
                }
                this.f40617a[i12 + 1] = obj;
                i10++;
            }
            i5++;
        }
    }

    public final void b(int i5) {
        Object[] objArr = new Object[i5];
        int i10 = this.f40618b;
        if (i10 != 0) {
            System.arraycopy(this.f40617a, 0, objArr, 0, i10 * 2);
        }
        this.f40617a = objArr;
    }

    public final Object c(Y y10) {
        for (int i5 = this.f40618b - 1; i5 >= 0; i5--) {
            if (Arrays.equals(y10.f40608b, e(i5))) {
                Object obj = this.f40617a[(i5 * 2) + 1];
                if (obj instanceof byte[]) {
                    return y10.a((byte[]) obj);
                }
                obj.getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public final void d(b0 b0Var) {
        int i5 = b0Var.f40618b;
        if (i5 == 0) {
            return;
        }
        Object[] objArr = this.f40617a;
        int length = objArr != null ? objArr.length : 0;
        int i10 = this.f40618b;
        int i11 = length - (i10 * 2);
        if (i10 == 0 || i11 < i5 * 2) {
            b((i5 * 2) + (i10 * 2));
        }
        System.arraycopy(b0Var.f40617a, 0, this.f40617a, this.f40618b * 2, b0Var.f40618b * 2);
        this.f40618b += b0Var.f40618b;
    }

    public final byte[] e(int i5) {
        return (byte[]) this.f40617a[i5 * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(md.Y r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            Fe.e.t(r5, r0)
            java.lang.String r0 = "value"
            Fe.e.t(r6, r0)
            int r0 = r4.f40618b
            int r1 = r0 * 2
            if (r1 == 0) goto L19
            java.lang.Object[] r2 = r4.f40617a
            if (r2 == 0) goto L16
            int r2 = r2.length
            goto L17
        L16:
            r2 = 0
        L17:
            if (r1 != r2) goto L24
        L19:
            int r0 = r0 * 4
            r1 = 8
            int r0 = java.lang.Math.max(r0, r1)
            r4.b(r0)
        L24:
            int r0 = r4.f40618b
            java.lang.Object[] r1 = r4.f40617a
            int r2 = r0 * 2
            byte[] r3 = r5.f40608b
            r1[r2] = r3
            byte[] r5 = r5.b(r6)
            java.lang.Object[] r6 = r4.f40617a
            int r0 = r0 * 2
            int r0 = r0 + 1
            r6[r0] = r5
            int r5 = r4.f40618b
            int r5 = r5 + 1
            r4.f40618b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: md.b0.f(md.Y, java.lang.Object):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(");
        for (int i5 = 0; i5 < this.f40618b; i5++) {
            if (i5 != 0) {
                sb2.append(',');
            }
            byte[] bArrE = e(i5);
            Charset charset = AbstractC3198g.f39299a;
            String str = new String(bArrE, charset);
            sb2.append(str);
            sb2.append('=');
            if (str.endsWith("-bin")) {
                Object obj = this.f40617a[(i5 * 2) + 1];
                if (!(obj instanceof byte[])) {
                    M6.z(obj);
                    throw null;
                }
                sb2.append(f40616e.c((byte[]) obj));
            } else {
                Object obj2 = this.f40617a[(i5 * 2) + 1];
                if (!(obj2 instanceof byte[])) {
                    M6.z(obj2);
                    throw null;
                }
                sb2.append(new String((byte[]) obj2, charset));
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
