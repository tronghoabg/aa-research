package hb;

import cg.InterfaceC1619h;
import java.io.IOException;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes4.dex */
public final class y extends AbstractC2797C {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f36374m = new String[128];

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC1619h f36375j;
    public String k = TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;

    /* renamed from: l, reason: collision with root package name */
    public String f36376l;

    static {
        for (int i5 = 0; i5 <= 31; i5++) {
            f36374m[i5] = String.format("\\u%04x", Integer.valueOf(i5));
        }
        String[] strArr = f36374m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public y(InterfaceC1619h interfaceC1619h) {
        if (interfaceC1619h == null) {
            throw new NullPointerException("sink == null");
        }
        this.f36375j = interfaceC1619h;
        B(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b0(cg.InterfaceC1619h r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = hb.y.f36374m
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.L(r4, r3, r8)
        L2e:
            r7.writeUtf8(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.L(r4, r2, r8)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.y.b0(cg.h, java.lang.String):void");
    }

    @Override // hb.AbstractC2797C
    public final void D(String str) {
        super.D(str);
        this.k = !str.isEmpty() ? ": " : TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C J(double d3) {
        if (!this.f36238f && (Double.isNaN(d3) || Double.isInfinite(d3))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d3);
        }
        if (this.f36240h) {
            this.f36240h = false;
            w(Double.toString(d3));
            return this;
        }
        c0();
        X();
        this.f36375j.writeUtf8(Double.toString(d3));
        int[] iArr = this.f36236d;
        int i5 = this.f36233a - 1;
        iArr[i5] = iArr[i5] + 1;
        return this;
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C P(long j8) {
        if (this.f36240h) {
            this.f36240h = false;
            w(Long.toString(j8));
            return this;
        }
        c0();
        X();
        this.f36375j.writeUtf8(Long.toString(j8));
        int[] iArr = this.f36236d;
        int i5 = this.f36233a - 1;
        iArr[i5] = iArr[i5] + 1;
        return this;
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C Q(Float f10) {
        if (f10 == null) {
            y();
            return this;
        }
        String string = f10.toString();
        if (!this.f36238f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f10);
        }
        if (this.f36240h) {
            this.f36240h = false;
            w(string);
            return this;
        }
        c0();
        X();
        this.f36375j.writeUtf8(string);
        int[] iArr = this.f36236d;
        int i5 = this.f36233a - 1;
        iArr[i5] = iArr[i5] + 1;
        return this;
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C V(String str) {
        if (str == null) {
            y();
            return this;
        }
        if (this.f36240h) {
            this.f36240h = false;
            w(str);
            return this;
        }
        c0();
        X();
        b0(this.f36375j, str);
        int[] iArr = this.f36236d;
        int i5 = this.f36233a - 1;
        iArr[i5] = iArr[i5] + 1;
        return this;
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C W(boolean z2) {
        if (this.f36240h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + o());
        }
        c0();
        X();
        this.f36375j.writeUtf8(z2 ? "true" : "false");
        int[] iArr = this.f36236d;
        int i5 = this.f36233a - 1;
        iArr[i5] = iArr[i5] + 1;
        return this;
    }

    public final void X() {
        int iZ = z();
        int i5 = 2;
        if (iZ != 1) {
            InterfaceC1619h interfaceC1619h = this.f36375j;
            if (iZ == 2) {
                interfaceC1619h.writeByte(44);
                Z();
            } else if (iZ == 4) {
                interfaceC1619h.writeUtf8(this.k);
                i5 = 5;
            } else {
                if (iZ == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                if (iZ != 6) {
                    if (iZ != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f36238f) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                i5 = 7;
            }
        } else {
            Z();
        }
        this.f36234b[this.f36233a - 1] = i5;
    }

    public final void Y(int i5, int i10, char c10) {
        int iZ = z();
        if (iZ != i10 && iZ != i5) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f36376l != null) {
            throw new IllegalStateException("Dangling name: " + this.f36376l);
        }
        int i11 = this.f36233a;
        int i12 = ~this.f36241i;
        if (i11 == i12) {
            this.f36241i = i12;
            return;
        }
        int i13 = i11 - 1;
        this.f36233a = i13;
        this.f36235c[i13] = null;
        int[] iArr = this.f36236d;
        int i14 = i11 - 2;
        iArr[i14] = iArr[i14] + 1;
        if (iZ == i10) {
            Z();
        }
        this.f36375j.writeByte(c10);
    }

    public final void Z() {
        if (this.f36237e == null) {
            return;
        }
        InterfaceC1619h interfaceC1619h = this.f36375j;
        interfaceC1619h.writeByte(10);
        int i5 = this.f36233a;
        for (int i10 = 1; i10 < i5; i10++) {
            interfaceC1619h.writeUtf8(this.f36237e);
        }
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C a() {
        if (this.f36240h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + o());
        }
        c0();
        a0(1, 2, '[');
        return this;
    }

    public final void a0(int i5, int i10, char c10) {
        int i11;
        int i12 = this.f36233a;
        int i13 = this.f36241i;
        if (i12 == i13 && ((i11 = this.f36234b[i12 - 1]) == i5 || i11 == i10)) {
            this.f36241i = ~i13;
            return;
        }
        X();
        d();
        B(i5);
        this.f36236d[this.f36233a - 1] = 0;
        this.f36375j.writeByte(c10);
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C b() {
        if (this.f36240h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + o());
        }
        c0();
        a0(3, 5, '{');
        return this;
    }

    public final void c0() {
        if (this.f36376l != null) {
            int iZ = z();
            InterfaceC1619h interfaceC1619h = this.f36375j;
            if (iZ == 5) {
                interfaceC1619h.writeByte(44);
            } else if (iZ != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            Z();
            this.f36234b[this.f36233a - 1] = 4;
            b0(interfaceC1619h, this.f36376l);
            this.f36376l = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f36375j.close();
        int i5 = this.f36233a;
        if (i5 > 1 || (i5 == 1 && this.f36234b[i5 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f36233a = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f36233a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f36375j.flush();
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C h() {
        Y(1, 2, ']');
        return this;
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C i() {
        this.f36240h = false;
        Y(3, 5, '}');
        return this;
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C w(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f36233a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iZ = z();
        if ((iZ != 3 && iZ != 5) || this.f36376l != null || this.f36240h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f36376l = str;
        this.f36235c[this.f36233a - 1] = str;
        return this;
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C y() {
        if (this.f36240h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + o());
        }
        if (this.f36376l != null) {
            if (!this.f36239g) {
                this.f36376l = null;
                return this;
            }
            c0();
        }
        X();
        this.f36375j.writeUtf8("null");
        int[] iArr = this.f36236d;
        int i5 = this.f36233a - 1;
        iArr[i5] = iArr[i5] + 1;
        return this;
    }
}
