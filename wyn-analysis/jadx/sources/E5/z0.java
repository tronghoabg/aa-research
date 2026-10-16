package E5;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class z0 extends J0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f3577b;

    /* renamed from: c, reason: collision with root package name */
    public final f6.X f3578c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3579d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3580e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f3581f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3582g;

    /* renamed from: h, reason: collision with root package name */
    public final J0[] f3583h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f3584i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f3585j;

    public z0(ArrayList arrayList, f6.X x5) {
        this.f3578c = x5;
        this.f3577b = x5.f35008b.length;
        int size = arrayList.size();
        this.f3581f = new int[size];
        this.f3582g = new int[size];
        this.f3583h = new J0[size];
        this.f3584i = new Object[size];
        this.f3585j = new HashMap();
        Iterator it = arrayList.iterator();
        int iO = 0;
        int iH = 0;
        int i5 = 0;
        while (it.hasNext()) {
            InterfaceC0458j0 interfaceC0458j0 = (InterfaceC0458j0) it.next();
            this.f3583h[i5] = interfaceC0458j0.a();
            this.f3582g[i5] = iO;
            this.f3581f[i5] = iH;
            iO += this.f3583h[i5].o();
            iH += this.f3583h[i5].h();
            this.f3584i[i5] = interfaceC0458j0.getUid();
            this.f3585j.put(this.f3584i[i5], Integer.valueOf(i5));
            i5++;
        }
        this.f3579d = iO;
        this.f3580e = iH;
    }

    @Override // E5.J0
    public final int a(boolean z2) {
        if (this.f3577b != 0) {
            int iQ = 0;
            if (z2) {
                int[] iArr = this.f3578c.f35008b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                J0[] j0Arr = this.f3583h;
                if (!j0Arr[iQ].p()) {
                    return j0Arr[iQ].a(z2) + this.f3582g[iQ];
                }
                iQ = q(iQ, z2);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // E5.J0
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f3585j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.f3583h[iIntValue].b(obj3)) != -1) {
                return this.f3581f[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // E5.J0
    public final int c(boolean z2) {
        int iR;
        int i5 = this.f3577b;
        if (i5 != 0) {
            if (z2) {
                int[] iArr = this.f3578c.f35008b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i5 - 1;
            }
            do {
                J0[] j0Arr = this.f3583h;
                if (!j0Arr[iR].p()) {
                    return j0Arr[iR].c(z2) + this.f3582g[iR];
                }
                iR = r(iR, z2);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // E5.J0
    public final int e(int i5, int i10, boolean z2) {
        int[] iArr = this.f3582g;
        int iD = u6.v.d(iArr, i5 + 1, false, false);
        int i11 = iArr[iD];
        J0[] j0Arr = this.f3583h;
        int iE = j0Arr[iD].e(i5 - i11, i10 != 2 ? i10 : 0, z2);
        if (iE != -1) {
            return i11 + iE;
        }
        int iQ = q(iD, z2);
        while (iQ != -1 && j0Arr[iQ].p()) {
            iQ = q(iQ, z2);
        }
        if (iQ != -1) {
            return j0Arr[iQ].a(z2) + iArr[iQ];
        }
        if (i10 == 2) {
            return a(z2);
        }
        return -1;
    }

    @Override // E5.J0
    public final H0 f(int i5, H0 h02, boolean z2) {
        int[] iArr = this.f3581f;
        int iD = u6.v.d(iArr, i5 + 1, false, false);
        int i10 = this.f3582g[iD];
        this.f3583h[iD].f(i5 - iArr[iD], h02, z2);
        h02.f3041c += i10;
        if (z2) {
            Object obj = this.f3584i[iD];
            Object obj2 = h02.f3040b;
            obj2.getClass();
            h02.f3040b = Pair.create(obj, obj2);
        }
        return h02;
    }

    @Override // E5.J0
    public final H0 g(Object obj, H0 h02) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f3585j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i5 = this.f3582g[iIntValue];
        this.f3583h[iIntValue].g(obj3, h02);
        h02.f3041c += i5;
        h02.f3040b = obj;
        return h02;
    }

    @Override // E5.J0
    public final int h() {
        return this.f3580e;
    }

    @Override // E5.J0
    public final int k(int i5, int i10, boolean z2) {
        int[] iArr = this.f3582g;
        int iD = u6.v.d(iArr, i5 + 1, false, false);
        int i11 = iArr[iD];
        J0[] j0Arr = this.f3583h;
        int iK = j0Arr[iD].k(i5 - i11, i10 != 2 ? i10 : 0, z2);
        if (iK != -1) {
            return i11 + iK;
        }
        int iR = r(iD, z2);
        while (iR != -1 && j0Arr[iR].p()) {
            iR = r(iR, z2);
        }
        if (iR != -1) {
            return j0Arr[iR].c(z2) + iArr[iR];
        }
        if (i10 == 2) {
            return c(z2);
        }
        return -1;
    }

    @Override // E5.J0
    public final Object l(int i5) {
        int[] iArr = this.f3581f;
        int iD = u6.v.d(iArr, i5 + 1, false, false);
        return Pair.create(this.f3584i[iD], this.f3583h[iD].l(i5 - iArr[iD]));
    }

    @Override // E5.J0
    public final I0 m(int i5, I0 i02, long j8) {
        int[] iArr = this.f3582g;
        int iD = u6.v.d(iArr, i5 + 1, false, false);
        int i10 = iArr[iD];
        int i11 = this.f3581f[iD];
        this.f3583h[iD].m(i5 - i10, i02, j8);
        Object objCreate = this.f3584i[iD];
        if (!I0.f3107q.equals(i02.f3110a)) {
            objCreate = Pair.create(objCreate, i02.f3110a);
        }
        i02.f3110a = objCreate;
        i02.f3122n += i11;
        i02.f3123o += i11;
        return i02;
    }

    @Override // E5.J0
    public final int o() {
        return this.f3579d;
    }

    public final int q(int i5, boolean z2) {
        if (!z2) {
            if (i5 < this.f3577b - 1) {
                return i5 + 1;
            }
            return -1;
        }
        f6.X x5 = this.f3578c;
        int i10 = x5.f35009c[i5] + 1;
        int[] iArr = x5.f35008b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int r(int i5, boolean z2) {
        if (!z2) {
            if (i5 > 0) {
                return i5 - 1;
            }
            return -1;
        }
        f6.X x5 = this.f3578c;
        int i10 = x5.f35009c[i5] - 1;
        if (i10 >= 0) {
            return x5.f35008b[i10];
        }
        return -1;
    }
}
