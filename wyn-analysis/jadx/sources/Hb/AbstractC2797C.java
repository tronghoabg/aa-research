package hb;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;

/* renamed from: hb.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2797C implements Closeable, Flushable {

    /* renamed from: e, reason: collision with root package name */
    public String f36237e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36238f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f36239g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f36240h;

    /* renamed from: a, reason: collision with root package name */
    public int f36233a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int[] f36234b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    public String[] f36235c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    public int[] f36236d = new int[32];

    /* renamed from: i, reason: collision with root package name */
    public int f36241i = -1;

    public final void B(int i5) {
        int[] iArr = this.f36234b;
        int i10 = this.f36233a;
        this.f36233a = i10 + 1;
        iArr[i10] = i5;
    }

    public void D(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f36237e = str;
    }

    public abstract AbstractC2797C J(double d3);

    public abstract AbstractC2797C P(long j8);

    public abstract AbstractC2797C Q(Float f10);

    public abstract AbstractC2797C V(String str);

    public abstract AbstractC2797C W(boolean z2);

    public abstract AbstractC2797C a();

    public abstract AbstractC2797C b();

    public final void d() {
        int i5 = this.f36233a;
        int[] iArr = this.f36234b;
        if (i5 != iArr.length) {
            return;
        }
        if (i5 == 256) {
            throw new E5.Q("Nesting too deep at " + o() + ": circular reference?", 11);
        }
        this.f36234b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f36235c;
        this.f36235c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f36236d;
        this.f36236d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof C2796B) {
            C2796B c2796b = (C2796B) this;
            Object[] objArr = c2796b.f36232j;
            c2796b.f36232j = Arrays.copyOf(objArr, objArr.length * 2);
        }
    }

    public abstract AbstractC2797C h();

    public abstract AbstractC2797C i();

    public final String o() {
        return P.c(this.f36233a, this.f36234b, this.f36235c, this.f36236d);
    }

    public abstract AbstractC2797C w(String str);

    public abstract AbstractC2797C y();

    public final int z() {
        int i5 = this.f36233a;
        if (i5 != 0) {
            return this.f36234b[i5 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
}
