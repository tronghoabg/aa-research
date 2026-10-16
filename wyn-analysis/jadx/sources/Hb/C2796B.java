package hb;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: hb.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2796B extends AbstractC2797C {

    /* renamed from: j, reason: collision with root package name */
    public Object[] f36232j;
    public String k;

    @Override // hb.AbstractC2797C
    public final AbstractC2797C J(double d3) {
        if (!this.f36238f && (Double.isNaN(d3) || d3 == Double.NEGATIVE_INFINITY || d3 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d3);
        }
        if (this.f36240h) {
            this.f36240h = false;
            w(Double.toString(d3));
            return this;
        }
        X(Double.valueOf(d3));
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
        X(Long.valueOf(j8));
        int[] iArr = this.f36236d;
        int i5 = this.f36233a - 1;
        iArr[i5] = iArr[i5] + 1;
        return this;
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C Q(Float f10) {
        if (f10 instanceof Float) {
            J(f10.doubleValue());
            return this;
        }
        if (f10 == null) {
            y();
            return this;
        }
        BigDecimal bigDecimal = new BigDecimal(f10.toString());
        if (this.f36240h) {
            this.f36240h = false;
            w(bigDecimal.toString());
            return this;
        }
        X(bigDecimal);
        int[] iArr = this.f36236d;
        int i5 = this.f36233a - 1;
        iArr[i5] = iArr[i5] + 1;
        return this;
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C V(String str) {
        if (this.f36240h) {
            this.f36240h = false;
            w(str);
            return this;
        }
        X(str);
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
        X(Boolean.valueOf(z2));
        int[] iArr = this.f36236d;
        int i5 = this.f36233a - 1;
        iArr[i5] = iArr[i5] + 1;
        return this;
    }

    public final void X(Serializable serializable) {
        String str;
        Object objPut;
        int iZ = z();
        int i5 = this.f36233a;
        if (i5 == 1) {
            if (iZ != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            int i10 = i5 - 1;
            this.f36234b[i10] = 7;
            this.f36232j[i10] = serializable;
            return;
        }
        if (iZ != 3 || (str = this.k) == null) {
            if (iZ == 1) {
                ((List) this.f36232j[i5 - 1]).add(serializable);
                return;
            } else {
                if (iZ != 9) {
                    throw new IllegalStateException("Nesting problem.");
                }
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
        }
        if ((serializable == null && !this.f36239g) || (objPut = ((Map) this.f36232j[i5 - 1]).put(str, serializable)) == null) {
            this.k = null;
            return;
        }
        throw new IllegalArgumentException("Map key '" + this.k + "' has multiple values at path " + o() + ": " + objPut + " and " + serializable);
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C a() {
        if (this.f36240h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + o());
        }
        int i5 = this.f36233a;
        int i10 = this.f36241i;
        if (i5 == i10 && this.f36234b[i5 - 1] == 1) {
            this.f36241i = ~i10;
            return this;
        }
        d();
        ArrayList arrayList = new ArrayList();
        X(arrayList);
        Object[] objArr = this.f36232j;
        int i11 = this.f36233a;
        objArr[i11] = arrayList;
        this.f36236d[i11] = 0;
        B(1);
        return this;
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C b() {
        if (this.f36240h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + o());
        }
        int i5 = this.f36233a;
        int i10 = this.f36241i;
        if (i5 == i10 && this.f36234b[i5 - 1] == 3) {
            this.f36241i = ~i10;
            return this;
        }
        d();
        H h10 = new H();
        X(h10);
        this.f36232j[this.f36233a] = h10;
        B(3);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
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
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C h() {
        if (z() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i5 = this.f36233a;
        int i10 = this.f36241i;
        if (i5 == (~i10)) {
            this.f36241i = ~i10;
            return this;
        }
        int i11 = i5 - 1;
        this.f36233a = i11;
        this.f36232j[i11] = null;
        int[] iArr = this.f36236d;
        int i12 = i5 - 2;
        iArr[i12] = iArr[i12] + 1;
        return this;
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C i() {
        if (z() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.k != null) {
            throw new IllegalStateException("Dangling name: " + this.k);
        }
        int i5 = this.f36233a;
        int i10 = this.f36241i;
        if (i5 == (~i10)) {
            this.f36241i = ~i10;
            return this;
        }
        this.f36240h = false;
        int i11 = i5 - 1;
        this.f36233a = i11;
        this.f36232j[i11] = null;
        this.f36235c[i11] = null;
        int[] iArr = this.f36236d;
        int i12 = i5 - 2;
        iArr[i12] = iArr[i12] + 1;
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
        if (z() != 3 || this.k != null || this.f36240h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.k = str;
        this.f36235c[this.f36233a - 1] = str;
        return this;
    }

    @Override // hb.AbstractC2797C
    public final AbstractC2797C y() {
        if (this.f36240h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + o());
        }
        X(null);
        int[] iArr = this.f36236d;
        int i5 = this.f36233a - 1;
        iArr[i5] = iArr[i5] + 1;
        return this;
    }
}
