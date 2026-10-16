package ra;

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
import la.i;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: ra.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3963b implements Closeable, Flushable {

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f44698l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f44699m = new String[128];

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f44700n;

    /* renamed from: a, reason: collision with root package name */
    public final Writer f44701a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f44702b;

    /* renamed from: c, reason: collision with root package name */
    public int f44703c;

    /* renamed from: d, reason: collision with root package name */
    public i f44704d;

    /* renamed from: e, reason: collision with root package name */
    public String f44705e;

    /* renamed from: f, reason: collision with root package name */
    public String f44706f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f44707g;

    /* renamed from: h, reason: collision with root package name */
    public int f44708h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f44709i;

    /* renamed from: j, reason: collision with root package name */
    public String f44710j;
    public boolean k;

    static {
        for (int i5 = 0; i5 <= 31; i5++) {
            f44699m[i5] = String.format("\\u%04x", Integer.valueOf(i5));
        }
        String[] strArr = f44699m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f44700n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C3963b(Writer writer) {
        int[] iArr = new int[32];
        this.f44702b = iArr;
        this.f44703c = 0;
        if (iArr.length == 0) {
            this.f44702b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f44702b;
        int i5 = this.f44703c;
        this.f44703c = i5 + 1;
        iArr2[i5] = 6;
        this.f44708h = 2;
        this.k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f44701a = writer;
        D(i.f40186d);
    }

    public final int B() {
        int i5 = this.f44703c;
        if (i5 != 0) {
            return this.f44702b[i5 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void D(i iVar) {
        Objects.requireNonNull(iVar);
        this.f44704d = iVar;
        this.f44706f = ",";
        if (iVar.f40189c) {
            this.f44705e = ": ";
            if (iVar.f40187a.isEmpty()) {
                this.f44706f = ", ";
            }
        } else {
            this.f44705e = TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER;
        }
        this.f44707g = this.f44704d.f40187a.isEmpty() && this.f44704d.f40188b.isEmpty();
    }

    public final void J(int i5) {
        if (i5 == 0) {
            throw null;
        }
        this.f44708h = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f44709i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = ra.C3963b.f44700n
            goto L9
        L7:
            java.lang.String[] r0 = ra.C3963b.f44699m
        L9:
            java.io.Writer r1 = r8.f44701a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.C3963b.P(java.lang.String):void");
    }

    public void Q(double d3) throws IOException {
        a0();
        if (this.f44708h == 1 || !(Double.isNaN(d3) || Double.isInfinite(d3))) {
            a();
            this.f44701a.append((CharSequence) Double.toString(d3));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d3);
        }
    }

    public void V(long j8) throws IOException {
        a0();
        a();
        this.f44701a.write(Long.toString(j8));
    }

    public void W(Boolean bool) throws IOException {
        if (bool == null) {
            z();
            return;
        }
        a0();
        a();
        this.f44701a.write(bool.booleanValue() ? "true" : "false");
    }

    public void X(Number number) throws IOException {
        if (number == null) {
            z();
            return;
        }
        a0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f44708h != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f44698l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        a();
        this.f44701a.append((CharSequence) string);
    }

    public void Y(String str) throws IOException {
        if (str == null) {
            z();
            return;
        }
        a0();
        a();
        P(str);
    }

    public void Z(boolean z2) throws IOException {
        a0();
        a();
        this.f44701a.write(z2 ? "true" : "false");
    }

    public final void a() throws IOException {
        int iB = B();
        if (iB == 1) {
            this.f44702b[this.f44703c - 1] = 2;
            y();
            return;
        }
        Writer writer = this.f44701a;
        if (iB == 2) {
            writer.append((CharSequence) this.f44706f);
            y();
        } else {
            if (iB == 4) {
                writer.append((CharSequence) this.f44705e);
                this.f44702b[this.f44703c - 1] = 5;
                return;
            }
            if (iB != 6) {
                if (iB != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f44708h != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f44702b[this.f44703c - 1] = 7;
        }
    }

    public final void a0() throws IOException {
        if (this.f44710j != null) {
            int iB = B();
            if (iB == 5) {
                this.f44701a.write(this.f44706f);
            } else if (iB != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            y();
            this.f44702b[this.f44703c - 1] = 4;
            P(this.f44710j);
            this.f44710j = null;
        }
    }

    public void b() throws IOException {
        a0();
        a();
        int i5 = this.f44703c;
        int[] iArr = this.f44702b;
        if (i5 == iArr.length) {
            this.f44702b = Arrays.copyOf(iArr, i5 * 2);
        }
        int[] iArr2 = this.f44702b;
        int i10 = this.f44703c;
        this.f44703c = i10 + 1;
        iArr2[i10] = 1;
        this.f44701a.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f44701a.close();
        int i5 = this.f44703c;
        if (i5 > 1 || (i5 == 1 && this.f44702b[i5 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f44703c = 0;
    }

    public void d() throws IOException {
        a0();
        a();
        int i5 = this.f44703c;
        int[] iArr = this.f44702b;
        if (i5 == iArr.length) {
            this.f44702b = Arrays.copyOf(iArr, i5 * 2);
        }
        int[] iArr2 = this.f44702b;
        int i10 = this.f44703c;
        this.f44703c = i10 + 1;
        iArr2[i10] = 3;
        this.f44701a.write(123);
    }

    public void flush() throws IOException {
        if (this.f44703c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f44701a.flush();
    }

    public final void h(int i5, int i10, char c10) throws IOException {
        int iB = B();
        if (iB != i10 && iB != i5) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f44710j != null) {
            throw new IllegalStateException("Dangling name: " + this.f44710j);
        }
        this.f44703c--;
        if (iB == i10) {
            y();
        }
        this.f44701a.write(c10);
    }

    public void i() throws IOException {
        h(1, 2, ']');
    }

    public void o() throws IOException {
        h(3, 5, '}');
    }

    public void w(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f44710j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iB = B();
        if (iB != 3 && iB != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f44710j = str;
    }

    public final void y() throws IOException {
        if (this.f44707g) {
            return;
        }
        String str = this.f44704d.f40187a;
        Writer writer = this.f44701a;
        writer.write(str);
        int i5 = this.f44703c;
        for (int i10 = 1; i10 < i5; i10++) {
            writer.write(this.f44704d.f40188b);
        }
    }

    public C3963b z() throws IOException {
        if (this.f44710j != null) {
            if (!this.k) {
                this.f44710j = null;
                return this;
            }
            a0();
        }
        a();
        this.f44701a.write("null");
        return this;
    }
}
