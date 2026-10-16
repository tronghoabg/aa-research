package l8;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: l8.O, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3413O extends AbstractC3403E {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f40061d;

    /* renamed from: e, reason: collision with root package name */
    public int f40062e;

    @Override // l8.AbstractC3403E
    public /* bridge */ /* synthetic */ AbstractC3403E c(Object obj) {
        g(obj);
        return this;
    }

    public void g(Object obj) {
        obj.getClass();
        if (this.f40061d != null) {
            int iH = AbstractC3414P.h(this.f40045b);
            Object[] objArr = this.f40061d;
            if (iH <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iR = AbstractC3437s.r(iHashCode);
                while (true) {
                    int i5 = iR & length;
                    Object[] objArr2 = this.f40061d;
                    Object obj2 = objArr2[i5];
                    if (obj2 == null) {
                        objArr2[i5] = obj;
                        this.f40062e += iHashCode;
                        a(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iR = i5 + 1;
                    }
                }
            }
        }
        this.f40061d = null;
        a(obj);
    }

    public void h(List list) {
        list.getClass();
        if (this.f40061d == null) {
            d(list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g(it.next());
        }
    }

    public AbstractC3414P i() {
        AbstractC3414P abstractC3414PI;
        int i5 = this.f40045b;
        if (i5 == 0) {
            int i10 = AbstractC3414P.f40063c;
            return k0.f40128j;
        }
        if (i5 == 1) {
            Object obj = this.f40044a[0];
            Objects.requireNonNull(obj);
            int i11 = AbstractC3414P.f40063c;
            return new r0(obj);
        }
        if (this.f40061d == null || AbstractC3414P.h(i5) != this.f40061d.length) {
            abstractC3414PI = AbstractC3414P.i(this.f40045b, this.f40044a);
            this.f40045b = abstractC3414PI.size();
        } else {
            int i12 = this.f40045b;
            Object[] objArrCopyOf = this.f40044a;
            int length = objArrCopyOf.length;
            if (i12 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
            }
            abstractC3414PI = new k0(objArrCopyOf, this.f40062e, this.f40061d, r6.length - 1, this.f40045b);
        }
        this.f40046c = true;
        this.f40061d = null;
        return abstractC3414PI;
    }
}
