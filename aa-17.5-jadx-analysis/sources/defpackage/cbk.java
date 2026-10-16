package defpackage;

import j$.util.List;
import java.util.Arrays;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class cbk<E> extends cbi<E> implements List<E>, cbf {
    private final Object[] a;
    private final Object[] b;
    private final int c;
    private final int d;

    public cbk(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (i <= 32) {
            bxc.a(a.bp(i, "Trie-based persistent vector should have at least 33 elements, got "));
        }
        int length = objArr2.length;
    }

    private final int l() {
        return (this.c - 1) & (-32);
    }

    private final cbf m(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.c - i;
        if (i4 != 1) {
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf.getClass();
            int i5 = i4 - 1;
            if (i3 < i5) {
                woy.dq(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new cbk(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                objArr.getClass();
            }
            return new cbp(objArr);
        }
        ntn ntnVar = new ntn(null, null);
        Object[] objArrS = s(objArr, i2, i - 1, ntnVar);
        objArrS.getClass();
        Object obj = ntnVar.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrS[1] != null) {
            return new cbk(objArrS, objArr3, i, i2);
        }
        Object obj2 = objArrS[0];
        obj2.getClass();
        return new cbk((Object[]) obj2, objArr3, i, i2 - 5);
    }

    private final cbk n(Object[] objArr, int i, Object obj) {
        int i2 = this.c;
        int iL = i2 - l();
        Object[] objArr2 = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf.getClass();
        int i3 = i + 1;
        if (iL < 32) {
            woy.dq(objArr2, objArrCopyOf, i3, i, iL);
            objArrCopyOf[i] = obj;
            return new cbk(objArr, objArrCopyOf, i2 + 1, this.d);
        }
        Object obj2 = objArr2[31];
        woy.dq(objArr2, objArrCopyOf, i3, i, iL - 1);
        objArrCopyOf[i] = obj;
        return o(objArr, objArrCopyOf, czz.ag(obj2));
    }

    private final cbk o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c;
        int i2 = i + 1;
        int i3 = this.d;
        if ((i >> 5) <= (1 << i3)) {
            return new cbk(p(objArr, i3, objArr2), objArr3, i2, i3);
        }
        int i4 = i3 + 5;
        return new cbk(p(czz.ag(objArr), i4, objArr2), objArr3, i2, i4);
    }

    private final Object[] p(Object[] objArr, int i, Object[] objArr2) {
        Object[] objArrCopyOf;
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            objArrCopyOf.getClass();
        } else {
            objArrCopyOf = new Object[32];
        }
        int i2 = ((this.c - 1) >> i) & 31;
        if (i == 5) {
            objArrCopyOf[i2] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[i2] = p((Object[]) objArrCopyOf[i2], i - 5, objArr2);
        return objArrCopyOf;
    }

    private final Object[] q(Object[] objArr, int i, int i2, Object obj) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf.getClass();
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[i3];
        obj2.getClass();
        objArrCopyOf[i3] = q((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    private final Object[] r(Object[] objArr, int i, int i2, Object obj, ntn ntnVar) {
        Object[] objArrCopyOf;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                objArrCopyOf.getClass();
            }
            woy.dq(objArr, objArrCopyOf, i3 + 1, i3, 31);
            ntnVar.a = objArr[31];
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        objArrCopyOf2.getClass();
        int i4 = i - 5;
        Object obj2 = objArr[i3];
        obj2.getClass();
        objArrCopyOf2[i3] = r((Object[]) obj2, i4, i2, obj, ntnVar);
        while (true) {
            i3++;
            if (i3 >= 32 || objArrCopyOf2[i3] == null) {
                break;
            }
            Object obj3 = objArr[i3];
            obj3.getClass();
            objArrCopyOf2[i3] = r((Object[]) obj3, i4, 0, ntnVar.a, ntnVar);
        }
        return objArrCopyOf2;
    }

    private final Object[] s(Object[] objArr, int i, int i2, ntn ntnVar) {
        Object[] objArrS;
        int i3 = (i2 >> i) & 31;
        if (i == 5) {
            ntnVar.a = objArr[i3];
            objArrS = null;
        } else {
            Object obj = objArr[i3];
            obj.getClass();
            objArrS = s((Object[]) obj, i - 5, i2, ntnVar);
        }
        if (objArrS == null && i3 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[i3] = objArrS;
        return objArrCopyOf;
    }

    private final Object[] t(Object[] objArr, int i, int i2, ntn ntnVar) {
        Object[] objArrCopyOf;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                objArrCopyOf.getClass();
            }
            woy.dq(objArr, objArrCopyOf, i3, i3 + 1, 32);
            objArrCopyOf[31] = ntnVar.a;
            ntnVar.a = objArr[i3];
            return objArrCopyOf;
        }
        int iL = objArr[31] == null ? 31 & ((l() - 1) >> i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        objArrCopyOf2.getClass();
        int i4 = i - 5;
        int i5 = i3 + 1;
        if (i5 <= iL) {
            while (true) {
                Object obj = objArrCopyOf2[iL];
                obj.getClass();
                objArrCopyOf2[iL] = t((Object[]) obj, i4, 0, ntnVar);
                if (iL == i5) {
                    break;
                }
                iL--;
            }
        }
        Object obj2 = objArrCopyOf2[i3];
        obj2.getClass();
        objArrCopyOf2[i3] = t((Object[]) obj2, i4, i2, ntnVar);
        return objArrCopyOf2;
    }

    @Override // defpackage.afam
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cbf
    public final cbf b(Object obj) {
        int i = this.c;
        int iL = i - l();
        if (iL >= 32) {
            return o(this.a, this.b, czz.ag(obj));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[iL] = obj;
        return new cbk(this.a, objArrCopyOf, i + 1, this.d);
    }

    @Override // defpackage.cbf
    public final cbf c(int i, Object obj) {
        int i2 = this.c;
        a.aH(i, i2);
        if (i == i2) {
            return b(obj);
        }
        int iL = l();
        if (i >= iL) {
            return n(this.a, i - iL, obj);
        }
        ntn ntnVar = new ntn(null, null);
        return n(r(this.a, this.d, i, obj, ntnVar), 0, ntnVar.a);
    }

    @Override // defpackage.cbf
    public final cbf g(afec afecVar) {
        cbl cblVarJ = j();
        cblVarJ.e(afecVar);
        return cblVarJ.c();
    }

    @Override // defpackage.afar, java.util.List
    public final E get(int i) {
        Object[] objArr;
        a.aG(i, this.c);
        if (l() <= i) {
            objArr = this.b;
        } else {
            Object[] objArr2 = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[(i >> i2) & 31];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return (E) objArr[i & 31];
    }

    @Override // defpackage.cbf
    public final cbf h(int i) {
        a.aG(i, this.c);
        int iL = l();
        Object[] objArr = this.a;
        if (i >= iL) {
            return m(objArr, iL, this.d, i - iL);
        }
        int i2 = this.d;
        return m(t(objArr, i2, i, new ntn(this.b[0], null)), iL, i2, 0);
    }

    @Override // defpackage.cbf
    public final cbf i(int i, Object obj) {
        int i2 = this.c;
        a.aG(i, i2);
        if (l() > i) {
            Object[] objArr = this.a;
            int i3 = this.d;
            return new cbk(q(objArr, i3, i, obj), this.b, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.b, 32);
        objArrCopyOf.getClass();
        objArrCopyOf[i & 31] = obj;
        return new cbk(this.a, objArrCopyOf, i2, this.d);
    }

    @Override // defpackage.cbf
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final cbl j() {
        return new cbl(this, this.a, this.b, this.d);
    }

    @Override // defpackage.afar, java.util.List
    public final ListIterator<E> listIterator(int i) {
        int i2 = this.c;
        a.aH(i, i2);
        return new cbm(this.a, this.b, i, i2, (this.d / 5) + 1);
    }
}
