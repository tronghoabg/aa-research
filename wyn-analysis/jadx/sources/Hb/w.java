package hb;

import A7.AbstractC0279p0;
import io.ktor.utils.io.T;
import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class w implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public int f36358a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f36359b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    public String[] f36360c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    public int[] f36361d = new int[32];

    /* renamed from: e, reason: collision with root package name */
    public boolean f36362e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36363f;

    public abstract long B();

    public abstract void D();

    public abstract String J();

    public abstract v P();

    public abstract void Q();

    public final void V(int i5) {
        int i10 = this.f36358a;
        int[] iArr = this.f36359b;
        if (i10 == iArr.length) {
            if (i10 == 256) {
                throw new E5.Q("Nesting too deep at " + i(), 11);
            }
            this.f36359b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f36360c;
            this.f36360c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f36361d;
            this.f36361d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f36359b;
        int i11 = this.f36358a;
        this.f36358a = i11 + 1;
        iArr3[i11] = i5;
    }

    public abstract int W(u uVar);

    public abstract int X(u uVar);

    public abstract void Y();

    public abstract void Z();

    public abstract void a();

    public final void a0(String str) throws T {
        StringBuilder sbQ = AbstractC0279p0.q(str, " at path ");
        sbQ.append(i());
        throw new T(sbQ.toString());
    }

    public abstract void b();

    public final E5.Q b0(Object obj, Object obj2) {
        if (obj == null) {
            return new E5.Q("Expected " + obj2 + " but was null at path " + i(), 11);
        }
        return new E5.Q("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + i(), 11);
    }

    public abstract void d();

    public abstract void h();

    public final String i() {
        return P.c(this.f36358a, this.f36359b, this.f36360c, this.f36361d);
    }

    public abstract boolean o();

    public abstract boolean w();

    public abstract double y();

    public abstract int z();
}
