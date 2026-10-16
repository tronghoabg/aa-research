package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ygp extends yfe {
    Object[] d;
    private int e;

    public ygp(int i) {
        super(i);
        this.d = new Object[ygr.j(i)];
    }

    @Override // defpackage.yff
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ygr g() {
        ygr ygrVarL;
        int i = this.b;
        if (i == 0) {
            return yly.a;
        }
        if (i == 1) {
            Object obj = this.a[0];
            obj.getClass();
            return new ymp(obj);
        }
        if (this.d == null || ygr.j(i) != this.d.length) {
            ygrVarL = ygr.l(this.b, this.a);
            this.b = ygrVarL.size();
        } else {
            int i2 = this.b;
            Object[] objArrCopyOf = this.a;
            if (ygr.u(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            ygrVarL = new yly(objArrCopyOf, this.e, this.d, r6.length - 1, this.b);
        }
        this.c = true;
        this.d = null;
        return ygrVarL;
    }

    @Override // defpackage.yfe, defpackage.yff
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void c(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int iJ = ygr.j(this.b);
            Object[] objArr = this.d;
            int length = objArr.length;
            if (iJ <= length) {
                objArr.getClass();
                int iHashCode = obj.hashCode();
                int iW = wub.w(iHashCode);
                while (true) {
                    Object[] objArr2 = this.d;
                    int i = iW & (length - 1);
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += iHashCode;
                        super.b(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iW = i + 1;
                    }
                }
            }
        }
        this.d = null;
        super.b(obj);
    }

    public final void j(Object... objArr) {
        if (this.d == null) {
            super.d(objArr);
            return;
        }
        for (Object obj : objArr) {
            c(obj);
        }
    }

    public final void k(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            super.e(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void l(ygp ygpVar) {
        if (this.d == null) {
            a(ygpVar.a, ygpVar.b);
            return;
        }
        for (int i = 0; i < ygpVar.b; i++) {
            Object obj = ygpVar.a[i];
            obj.getClass();
            c(obj);
        }
    }

    public ygp() {
        super(4);
    }
}
