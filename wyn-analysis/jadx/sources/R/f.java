package R;

import N.C0718d;
import ff.m;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f10015a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f10016b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10017c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10018d;

    public f(Object[] objArr, Object[] objArr2, int i5, int i10) {
        this.f10015a = objArr;
        this.f10016b = objArr2;
        this.f10017c = i5;
        this.f10018d = i10;
        if (size() > 32) {
            size();
            size();
            int length = objArr2.length;
        } else {
            C0718d.O("Trie-based persistent vector should have at least 33 elements, got " + size());
            throw null;
        }
    }

    public static Object[] i(Object[] objArr, int i5, int i10, Object obj, e eVar) {
        Object[] objArrCopyOf;
        int iD = ic.d.D(i10, i5);
        if (i5 == 0) {
            if (iD == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            }
            m.h0(objArr, iD + 1, objArrCopyOf, iD, 31);
            eVar.f10014a = objArr[31];
            objArrCopyOf[iD] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC3340k.d(objArrCopyOf2, "copyOf(this, newSize)");
        int i11 = i5 - 5;
        Object obj2 = objArr[iD];
        AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iD] = i((Object[]) obj2, i11, i10, obj, eVar);
        while (true) {
            iD++;
            if (iD >= 32 || objArrCopyOf2[iD] == null) {
                break;
            }
            Object obj3 = objArr[iD];
            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iD] = i((Object[]) obj3, i11, 0, eVar.f10014a, eVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] k(Object[] objArr, int i5, int i10, e eVar) {
        Object[] objArrK;
        int iD = ic.d.D(i10, i5);
        if (i5 == 5) {
            eVar.f10014a = objArr[iD];
            objArrK = null;
        } else {
            Object obj = objArr[iD];
            AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrK = k((Object[]) obj, i5 - 5, i10, eVar);
        }
        if (objArrK == null && iD == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iD] = objArrK;
        return objArrCopyOf;
    }

    public static Object[] q(Object[] objArr, int i5, int i10, Object obj) {
        int iD = ic.d.D(i10, i5);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
        if (i5 == 0) {
            objArrCopyOf[iD] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iD];
        AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iD] = q((Object[]) obj2, i5 - 5, i10, obj);
        return objArrCopyOf;
    }

    @Override // R.c
    public final c a(int i5, Object obj) {
        tg.b.s(i5, size());
        if (i5 == size()) {
            return c(obj);
        }
        int iP = p();
        Object[] objArr = this.f10015a;
        if (i5 >= iP) {
            return j(obj, objArr, i5 - iP);
        }
        e eVar = new e(null);
        return j(eVar.f10014a, i(objArr, this.f10018d, i5, obj, eVar), 0);
    }

    @Override // R.c
    public final c c(Object obj) {
        int size = size() - p();
        Object[] objArr = this.f10015a;
        Object[] objArr2 = this.f10016b;
        if (size >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return l(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size] = obj;
        return new f(objArr, objArrCopyOf, size() + 1, this.f10018d);
    }

    @Override // R.c
    public final g e() {
        return new g(this, this.f10015a, this.f10016b, this.f10018d);
    }

    @Override // R.c
    public final c f(b bVar) {
        g gVar = new g(this, this.f10015a, this.f10016b, this.f10018d);
        gVar.A(bVar);
        return gVar.d();
    }

    @Override // R.c
    public final c g(int i5) {
        tg.b.q(i5, size());
        int iP = p();
        Object[] objArr = this.f10015a;
        int i10 = this.f10018d;
        return i5 >= iP ? o(objArr, iP, i10, i5 - iP) : o(n(objArr, i10, i5, new e(this.f10016b[0])), iP, i10, 0);
    }

    @Override // java.util.List
    public final Object get(int i5) {
        Object[] objArr;
        tg.b.q(i5, size());
        if (p() <= i5) {
            objArr = this.f10016b;
        } else {
            objArr = this.f10015a;
            for (int i10 = this.f10018d; i10 > 0; i10 -= 5) {
                Object obj = objArr[ic.d.D(i5, i10)];
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i5 & 31];
    }

    @Override // ff.AbstractC2646a
    public final int getSize() {
        return this.f10017c;
    }

    @Override // R.c
    public final c h(int i5, Object obj) {
        tg.b.q(i5, size());
        int iP = p();
        Object[] objArr = this.f10015a;
        Object[] objArr2 = this.f10016b;
        int i10 = this.f10018d;
        if (iP > i5) {
            return new f(q(objArr, i10, i5, obj), objArr2, size(), i10);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i5 & 31] = obj;
        return new f(objArr, objArrCopyOf, size(), i10);
    }

    public final f j(Object obj, Object[] objArr, int i5) {
        int size = size() - p();
        Object[] objArr2 = this.f10016b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
        if (size < 32) {
            m.h0(objArr2, i5 + 1, objArrCopyOf, i5, size);
            objArrCopyOf[i5] = obj;
            return new f(objArr, objArrCopyOf, size() + 1, this.f10018d);
        }
        Object obj2 = objArr2[31];
        m.h0(objArr2, i5 + 1, objArrCopyOf, i5, size - 1);
        objArrCopyOf[i5] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return l(objArr, objArrCopyOf, objArr3);
    }

    public final f l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i5 = this.f10018d;
        if (size <= (1 << i5)) {
            return new f(m(objArr, objArr2, i5), objArr3, size() + 1, i5);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i10 = i5 + 5;
        return new f(m(objArr4, objArr2, i10), objArr3, size() + 1, i10);
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final ListIterator listIterator(int i5) {
        tg.b.s(i5, size());
        return new h(this.f10015a, i5, this.f10016b, size(), (this.f10018d / 5) + 1);
    }

    public final Object[] m(Object[] objArr, Object[] objArr2, int i5) {
        Object[] objArrCopyOf;
        int iD = ic.d.D(size() - 1, i5);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i5 == 5) {
            objArrCopyOf[iD] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iD] = m((Object[]) objArrCopyOf[iD], objArr2, i5 - 5);
        return objArrCopyOf;
    }

    public final Object[] n(Object[] objArr, int i5, int i10, e eVar) {
        Object[] objArrCopyOf;
        int iD = ic.d.D(i10, i5);
        if (i5 == 0) {
            if (iD == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            }
            m.h0(objArr, iD, objArrCopyOf, iD + 1, 32);
            objArrCopyOf[31] = eVar.f10014a;
            eVar.f10014a = objArr[iD];
            return objArrCopyOf;
        }
        int iD2 = objArr[31] == null ? ic.d.D(p() - 1, i5) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC3340k.d(objArrCopyOf2, "copyOf(this, newSize)");
        int i11 = i5 - 5;
        int i12 = iD + 1;
        if (i12 <= iD2) {
            while (true) {
                Object obj = objArrCopyOf2[iD2];
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iD2] = n((Object[]) obj, i11, 0, eVar);
                if (iD2 == i12) {
                    break;
                }
                iD2--;
            }
        }
        Object obj2 = objArrCopyOf2[iD];
        AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iD] = n((Object[]) obj2, i11, i10, eVar);
        return objArrCopyOf2;
    }

    public final c o(Object[] objArr, int i5, int i10, int i11) {
        int size = size() - i5;
        if (size != 1) {
            Object[] objArr2 = this.f10016b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            int i12 = size - 1;
            if (i11 < i12) {
                m.h0(objArr2, i11, objArrCopyOf, i11 + 1, size);
            }
            objArrCopyOf[i12] = null;
            return new f(objArr, objArrCopyOf, (i5 + size) - 1, i10);
        }
        if (i10 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                AbstractC3340k.d(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        e eVar = new e(null);
        Object[] objArrK = k(objArr, i10, i5 - 1, eVar);
        AbstractC3340k.b(objArrK);
        Object obj = eVar.f10014a;
        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrK[1] != null) {
            return new f(objArrK, objArr3, i5, i10);
        }
        Object obj2 = objArrK[0];
        AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new f((Object[]) obj2, objArr3, i5, i10 - 5);
    }

    public final int p() {
        return (size() - 1) & (-32);
    }
}
