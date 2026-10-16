package P;

import ff.m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes.dex */
public final class d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f8970a;

    /* renamed from: b, reason: collision with root package name */
    public a f8971b;

    /* renamed from: c, reason: collision with root package name */
    public int f8972c = 0;

    public d(Object[] objArr) {
        this.f8970a = objArr;
    }

    public final void a(int i5, Object obj) {
        g(this.f8972c + 1);
        Object[] objArr = this.f8970a;
        int i10 = this.f8972c;
        if (i5 != i10) {
            m.h0(objArr, i5 + 1, objArr, i5, i10);
        }
        objArr[i5] = obj;
        this.f8972c++;
    }

    public final void b(Object obj) {
        g(this.f8972c + 1);
        Object[] objArr = this.f8970a;
        int i5 = this.f8972c;
        objArr[i5] = obj;
        this.f8972c = i5 + 1;
    }

    public final void c(int i5, d dVar) {
        if (dVar.i()) {
            return;
        }
        g(this.f8972c + dVar.f8972c);
        Object[] objArr = this.f8970a;
        int i10 = this.f8972c;
        if (i5 != i10) {
            m.h0(objArr, dVar.f8972c + i5, objArr, i5, i10);
        }
        m.h0(dVar.f8970a, i5, objArr, 0, dVar.f8972c);
        this.f8972c += dVar.f8972c;
    }

    public final boolean d(int i5, Collection collection) {
        int i10 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        g(collection.size() + this.f8972c);
        Object[] objArr = this.f8970a;
        if (i5 != this.f8972c) {
            m.h0(objArr, collection.size() + i5, objArr, i5, this.f8972c);
        }
        for (Object obj : collection) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3935e.P();
                throw null;
            }
            objArr[i10 + i5] = obj;
            i10 = i11;
        }
        this.f8972c = collection.size() + this.f8972c;
        return true;
    }

    public final void e() {
        Object[] objArr = this.f8970a;
        int i5 = this.f8972c;
        while (true) {
            i5--;
            if (-1 >= i5) {
                this.f8972c = 0;
                return;
            }
            objArr[i5] = null;
        }
    }

    public final boolean f(Object obj) {
        int i5 = this.f8972c - 1;
        if (i5 >= 0) {
            for (int i10 = 0; !AbstractC3340k.a(this.f8970a[i10], obj); i10++) {
                if (i10 != i5) {
                }
            }
            return true;
        }
        return false;
    }

    public final void g(int i5) {
        Object[] objArr = this.f8970a;
        if (objArr.length < i5) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i5, objArr.length * 2));
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8970a = objArrCopyOf;
        }
    }

    public final int h(Object obj) {
        int i5 = this.f8972c;
        if (i5 <= 0) {
            return -1;
        }
        Object[] objArr = this.f8970a;
        int i10 = 0;
        while (!AbstractC3340k.a(obj, objArr[i10])) {
            i10++;
            if (i10 >= i5) {
                return -1;
            }
        }
        return i10;
    }

    public final boolean i() {
        return this.f8972c == 0;
    }

    public final boolean j() {
        return this.f8972c != 0;
    }

    public final boolean k(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return false;
        }
        m(iH);
        return true;
    }

    public final void l(d dVar) {
        int i5 = dVar.f8972c - 1;
        if (i5 < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            k(dVar.f8970a[i10]);
            if (i10 == i5) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final Object m(int i5) {
        Object[] objArr = this.f8970a;
        Object obj = objArr[i5];
        int i10 = this.f8972c;
        if (i5 != i10 - 1) {
            m.h0(objArr, i5, objArr, i5 + 1, i10);
        }
        int i11 = this.f8972c - 1;
        this.f8972c = i11;
        objArr[i11] = null;
        return obj;
    }

    public final void n(Comparator comparator) {
        Object[] objArr = this.f8970a;
        int i5 = this.f8972c;
        AbstractC3340k.e(objArr, "<this>");
        AbstractC3340k.e(comparator, "comparator");
        Arrays.sort(objArr, 0, i5, comparator);
    }
}
