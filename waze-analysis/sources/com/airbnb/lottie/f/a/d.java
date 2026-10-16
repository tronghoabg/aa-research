package com.airbnb.lottie.f.a;

import java.io.Closeable;
import java.util.Arrays;
import k.j;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class d implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f2312e = new String[128];

    /* renamed from: a, reason: collision with root package name */
    int f2313a;

    /* renamed from: b, reason: collision with root package name */
    int[] f2314b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    String[] f2315c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    int[] f2316d = new int[32];

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f2312e[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f2312e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    d() {
    }

    public static d e(j jVar) {
        return new e(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* bridge */ /* synthetic */ void i(k.i r8, java.lang.String r9) {
        /*
            java.lang.String[] r0 = com.airbnb.lottie.f.a.d.f2312e
            r1 = 34
            r8.ae(r1)
            int r2 = r9.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            int r5 = r3 + 1
            char r6 = r9.charAt(r3)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L1e
            r6 = r0[r6]
            if (r6 == 0) goto L34
            goto L2b
        L1e:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L25
            java.lang.String r6 = "\\u2028"
            goto L2b
        L25:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L34
            java.lang.String r6 = "\\u2029"
        L2b:
            if (r4 >= r3) goto L30
            r8.an(r9, r4, r3)
        L30:
            r8.E(r6)
            r4 = r5
        L34:
            r3 = r5
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r8.an(r9, r4, r2)
        L3b:
            r8.ae(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.f.a.d.i(k.i, java.lang.String):void");
    }

    public abstract double a();

    public abstract int b();

    public abstract int c(c cVar);

    final b d(String str) throws b {
        throw new b(str + " at path " + f());
    }

    public final String f() {
        int i2 = this.f2313a;
        int[] iArr = this.f2314b;
        String[] strArr = this.f2315c;
        int[] iArr2 = this.f2316d;
        StringBuilder sb = new StringBuilder("$");
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(iArr2[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = strArr[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract String g();

    public abstract String h();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    final void n(int i2) {
        int i3 = this.f2313a;
        int[] iArr = this.f2314b;
        int length = iArr.length;
        if (i3 == length) {
            if (i3 == 256) {
                throw new a("Nesting too deep at ".concat(f()));
            }
            this.f2314b = Arrays.copyOf(iArr, length + length);
            String[] strArr = this.f2315c;
            int length2 = strArr.length;
            this.f2315c = (String[]) Arrays.copyOf(strArr, length2 + length2);
            int[] iArr2 = this.f2316d;
            int length3 = iArr2.length;
            this.f2316d = Arrays.copyOf(iArr2, length3 + length3);
        }
        int[] iArr3 = this.f2314b;
        int i4 = this.f2313a;
        this.f2313a = i4 + 1;
        iArr3[i4] = i2;
    }

    public abstract void o();

    public abstract void p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract int s();
}
