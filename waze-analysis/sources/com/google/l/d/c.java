package com.google.l.d;

import androidx.credentials.provider.CredentialEntry;
import com.google.l.s;
import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class c implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f12434a = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f12435b = new String[128];

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f12436c;

    /* renamed from: d, reason: collision with root package name */
    private final Writer f12437d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f12438e = new int[32];

    /* renamed from: f, reason: collision with root package name */
    private int f12439f = 0;

    /* renamed from: g, reason: collision with root package name */
    private com.google.l.b f12440g;

    /* renamed from: h, reason: collision with root package name */
    private String f12441h;

    /* renamed from: i, reason: collision with root package name */
    private String f12442i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12443j;

    /* renamed from: k, reason: collision with root package name */
    private s f12444k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12445l;
    private String m;
    private boolean n;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f12435b[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f12435b;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f12436c = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        x(6);
        this.f12444k = s.f12463b;
        this.n = true;
        this.f12437d = (Writer) Objects.requireNonNull(writer, "out == null");
        o(com.google.l.b.f12217a);
    }

    private final void A() throws IOException {
        if (this.m != null) {
            int iA = a();
            if (iA == 5) {
                this.f12437d.write(this.f12442i);
            } else if (iA != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            w();
            y(4);
            z(this.m);
            this.m = null;
        }
    }

    private final void B(int i2, int i3, char c2) throws IOException {
        int iA = a();
        if (iA != i3 && iA != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.m;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f12439f--;
        if (iA == i3) {
            w();
        }
        this.f12437d.write(c2);
    }

    private final void C(int i2, char c2) throws IOException {
        v();
        x(i2);
        this.f12437d.write(c2);
    }

    private final int a() {
        int i2 = this.f12439f;
        if (i2 != 0) {
            return this.f12438e[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void v() throws IOException {
        int iA = a();
        if (iA == 1) {
            y(2);
            w();
            return;
        }
        if (iA == 2) {
            this.f12437d.append((CharSequence) this.f12442i);
            w();
        } else {
            if (iA == 4) {
                this.f12437d.append((CharSequence) this.f12441h);
                y(5);
                return;
            }
            if (iA != 6) {
                if (iA != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f12444k != s.f12462a) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            y(7);
        }
    }

    private final void w() throws IOException {
        if (this.f12443j) {
            return;
        }
        Writer writer = this.f12437d;
        writer.write(this.f12440g.b());
        int i2 = this.f12439f;
        for (int i3 = 1; i3 < i2; i3++) {
            writer.write(this.f12440g.a());
        }
    }

    private final void x(int i2) {
        int i3 = this.f12439f;
        int[] iArrCopyOf = this.f12438e;
        if (i3 == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3 + i3);
            this.f12438e = iArrCopyOf;
        }
        int i4 = this.f12439f;
        this.f12439f = i4 + 1;
        iArrCopyOf[i4] = i2;
    }

    private final void y(int i2) {
        this.f12438e[this.f12439f - 1] = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f12445l
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.l.d.c.f12436c
            goto L9
        L7:
            java.lang.String[] r0 = com.google.l.d.c.f12435b
        L9:
            java.io.Writer r8 = r8.f12437d
            r1 = 34
            r8.write(r1)
            int r2 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r2) goto L40
            int r5 = r3 + 1
            char r6 = r9.charAt(r3)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L27
            r6 = r0[r6]
            if (r6 == 0) goto L3e
            goto L34
        L27:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2e
            java.lang.String r6 = "\\u2028"
            goto L34
        L2e:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L34:
            if (r4 >= r3) goto L3a
            int r3 = r3 - r4
            r8.write(r9, r4, r3)
        L3a:
            r8.write(r6)
            r4 = r5
        L3e:
            r3 = r5
            goto L16
        L40:
            if (r4 >= r2) goto L46
            int r2 = r2 - r4
            r8.write(r9, r4, r2)
        L46:
            r8.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.l.d.c.z(java.lang.String):void");
    }

    public void b() throws IOException {
        A();
        C(1, '[');
    }

    public void c() throws IOException {
        A();
        C(3, '{');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12437d.close();
        int i2 = this.f12439f;
        if (i2 > 1 || (i2 == 1 && this.f12438e[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f12439f = 0;
    }

    public void d() throws IOException {
        B(1, 2, ']');
    }

    public void e() throws IOException {
        B(3, 5, '}');
    }

    public void f(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.m != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iA = a();
        if (iA != 3 && iA != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.m = str;
    }

    public void flush() throws IOException {
        if (this.f12439f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f12437d.flush();
    }

    public void g() throws IOException {
        if (this.m != null) {
            if (!this.n) {
                this.m = null;
                return;
            }
            A();
        }
        v();
        this.f12437d.write("null");
    }

    public void h(double d2) throws IOException {
        A();
        if (this.f12444k == s.f12462a || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            v();
            this.f12437d.append((CharSequence) Double.toString(d2));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
    }

    public void i(long j2) throws IOException {
        A();
        v();
        this.f12437d.write(Long.toString(j2));
    }

    public void j(Boolean bool) throws IOException {
        if (bool == null) {
            g();
            return;
        }
        A();
        v();
        this.f12437d.write(true != bool.booleanValue() ? CredentialEntry.FALSE_STRING : CredentialEntry.TRUE_STRING);
    }

    public void k(Number number) throws IOException {
        if (number == null) {
            g();
            return;
        }
        A();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f12444k != s.f12462a) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(string)));
                }
            } else if (cls != Float.class && cls != Double.class && !f12434a.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + String.valueOf(cls) + " is not a valid JSON number: " + string);
            }
        }
        v();
        this.f12437d.append((CharSequence) string);
    }

    public void l(String str) throws IOException {
        if (str == null) {
            g();
            return;
        }
        A();
        v();
        z(str);
    }

    public void m(boolean z) throws IOException {
        A();
        v();
        this.f12437d.write(true != z ? CredentialEntry.FALSE_STRING : CredentialEntry.TRUE_STRING);
    }

    public final s n() {
        return this.f12444k;
    }

    public final void o(com.google.l.b bVar) {
        com.google.l.b bVar2 = (com.google.l.b) Objects.requireNonNull(bVar);
        this.f12440g = bVar2;
        this.f12442i = ",";
        if (bVar2.c()) {
            this.f12441h = ": ";
            if (this.f12440g.b().isEmpty()) {
                this.f12442i = ", ";
            }
        } else {
            this.f12441h = ":";
        }
        boolean z = false;
        if (this.f12440g.b().isEmpty() && this.f12440g.a().isEmpty()) {
            z = true;
        }
        this.f12443j = z;
    }

    public final void p(boolean z) {
        this.f12445l = z;
    }

    public final void q(boolean z) {
        this.n = z;
    }

    public final void r(s sVar) {
        this.f12444k = (s) Objects.requireNonNull(sVar);
    }

    public final boolean s() {
        return this.n;
    }

    public final boolean t() {
        return this.f12445l;
    }

    public final boolean u() {
        return this.f12444k == s.f12462a;
    }
}
