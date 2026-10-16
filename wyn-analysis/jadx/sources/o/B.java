package O;

import N.C0718d;
import N.y0;
import com.applovin.shadow.okio.Segment;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;
import q.s1;

/* loaded from: classes.dex */
public final class B extends Fe.b {

    /* renamed from: c, reason: collision with root package name */
    public int f8701c;

    /* renamed from: e, reason: collision with root package name */
    public int f8703e;

    /* renamed from: g, reason: collision with root package name */
    public int f8705g;

    /* renamed from: h, reason: collision with root package name */
    public int f8706h;

    /* renamed from: i, reason: collision with root package name */
    public int f8707i;

    /* renamed from: b, reason: collision with root package name */
    public A[] f8700b = new A[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f8702d = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f8704f = new Object[16];

    public static final int W(B b5, int i5) {
        b5.getClass();
        if (i5 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i5);
    }

    public final void X() {
        this.f8701c = 0;
        this.f8703e = 0;
        Arrays.fill(this.f8704f, 0, this.f8705g, (Object) null);
        this.f8705g = 0;
    }

    public final void Y(E9.c cVar, y0 y0Var, s1 s1Var) {
        B b5;
        int i5;
        if (a0()) {
            G4.f fVar = new G4.f();
            fVar.f4236d = this;
            do {
                b5 = (B) fVar.f4236d;
                A a5 = b5.f8700b[fVar.f4233a];
                AbstractC3340k.b(a5);
                a5.a(fVar, cVar, y0Var, s1Var);
                int i10 = fVar.f4233a;
                if (i10 >= b5.f8701c) {
                    break;
                }
                A a10 = b5.f8700b[i10];
                AbstractC3340k.b(a10);
                fVar.f4234b += a10.f8698a;
                fVar.f4235c += a10.f8699b;
                i5 = fVar.f4233a + 1;
                fVar.f4233a = i5;
            } while (i5 < b5.f8701c);
        }
        X();
    }

    public final boolean Z() {
        return this.f8701c == 0;
    }

    public final boolean a0() {
        return this.f8701c != 0;
    }

    public final A b0() {
        A a5 = this.f8700b[this.f8701c - 1];
        AbstractC3340k.b(a5);
        return a5;
    }

    public final void c0(A a5) {
        int i5 = a5.f8698a;
        int i10 = a5.f8699b;
        if (i5 == 0 && i10 == 0) {
            d0(a5);
            return;
        }
        C0718d.O("Cannot push " + a5 + " without arguments because it expects " + i5 + " ints and " + i10 + " objects.");
        throw null;
    }

    public final void d0(A a5) {
        this.f8706h = 0;
        this.f8707i = 0;
        int i5 = this.f8701c;
        A[] aArr = this.f8700b;
        int length = aArr.length;
        int i10 = Segment.SHARE_MINIMUM;
        if (i5 == length) {
            Object[] objArrCopyOf = Arrays.copyOf(aArr, i5 + (i5 > 1024 ? 1024 : i5));
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8700b = (A[]) objArrCopyOf;
        }
        int i11 = this.f8703e + a5.f8698a;
        int[] iArr = this.f8702d;
        int length2 = iArr.length;
        if (i11 > length2) {
            int i12 = length2 + (length2 > 1024 ? 1024 : length2);
            if (i12 >= i11) {
                i11 = i12;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
            AbstractC3340k.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f8702d = iArrCopyOf;
        }
        int i13 = this.f8705g;
        int i14 = a5.f8699b;
        int i15 = i13 + i14;
        Object[] objArr = this.f8704f;
        int length3 = objArr.length;
        if (i15 > length3) {
            if (length3 <= 1024) {
                i10 = length3;
            }
            int i16 = length3 + i10;
            if (i16 >= i15) {
                i15 = i16;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i15);
            AbstractC3340k.d(objArrCopyOf2, "copyOf(this, newSize)");
            this.f8704f = objArrCopyOf2;
        }
        A[] aArr2 = this.f8700b;
        int i17 = this.f8701c;
        this.f8701c = i17 + 1;
        aArr2[i17] = a5;
        this.f8703e += a5.f8698a;
        this.f8705g += i14;
    }
}
