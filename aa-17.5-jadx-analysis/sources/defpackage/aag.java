package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class aag {
    public Object[] a;
    public int b;
    private byt c;

    public aag(int i) {
        this.a = i == 0 ? aah.a : new Object[i];
    }

    public final int a(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        int i2 = this.b;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < i2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final Object b() {
        if (f()) {
            ca.ab("ObjectList is empty.");
        }
        return this.a[0];
    }

    public final Object c(int i) {
        if (i < 0 || i >= this.b) {
            d(i);
        }
        return this.a[i];
    }

    public final void d(int i) {
        ca.aa("Index " + i + " must be in 0.." + (this.b - 1));
    }

    public final boolean e(Object obj) {
        return a(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aag) {
            aag aagVar = (aag) obj;
            int i = aagVar.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = aagVar.a;
                afha afhaVarM = afpt.m(0, i2);
                int i3 = afhaVarM.a;
                int i4 = afhaVarM.b;
                if (i3 > i4) {
                    return true;
                }
                while (affa.f(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.b == 0;
    }

    public final boolean g() {
        return this.b != 0;
    }

    public final Object h(int i) {
        if (i < 0 || i >= this.b) {
            d(i);
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        int i2 = this.b;
        if (i != i2 - 1) {
            int i3 = i + 1;
            objArr.getClass();
            objArr.getClass();
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.b - 1;
        this.b = i4;
        objArr[i4] = null;
        return obj;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final Object i(int i, Object obj) {
        if (i < 0 || i >= this.b) {
            d(i);
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final List j() {
        byt bytVar = this.c;
        if (bytVar != null) {
            return bytVar;
        }
        byt bytVar2 = new byt(this, 1);
        this.c = bytVar2;
        return bytVar2;
    }

    public final void k() {
        Object[] objArr = this.a;
        int i = this.b;
        objArr.getClass();
        Arrays.fill(objArr, 0, i, (Object) null);
        this.b = 0;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            ca.aa("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.b);
        }
        if (i2 < i) {
            ca.Y(a.bB(i2, i, "Start (", ") is more than end (", ")"));
        }
        if (i2 != i) {
            int i4 = this.b;
            if (i2 < i4) {
                Object[] objArr = this.a;
                objArr.getClass();
                objArr.getClass();
                System.arraycopy(objArr, i2, objArr, i, i4 - i2);
            }
            int i5 = this.b;
            int i6 = i5 - (i2 - i);
            Object[] objArr2 = this.a;
            objArr2.getClass();
            Arrays.fill(objArr2, i6, i5, (Object) null);
            this.b = i6;
        }
    }

    public final void m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.a = objArr2;
    }

    public final void n(int i) {
        ca.aa("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean o(Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return false;
        }
        h(iA);
        return true;
    }

    public final void p(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void q(aag aagVar) {
        int i = this.b;
        if (aagVar.f()) {
            return;
        }
        int i2 = i + aagVar.b;
        Object[] objArr = this.a;
        if (objArr.length < i2) {
            m(i2, objArr);
        }
        woy.dq(aagVar.a, this.a, this.b, 0, aagVar.b);
        this.b += aagVar.b;
    }

    public final void r(List list) {
        int i = this.b;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b += list.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        aai aaiVar = new aai(this, 1);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            Object obj = objArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) aaiVar.invoke(obj));
            i2++;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public aag() {
        this(16);
    }
}
