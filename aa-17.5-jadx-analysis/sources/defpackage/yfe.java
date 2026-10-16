package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
abstract class yfe extends yff {
    Object[] a;
    int b;
    boolean c;

    public yfe(int i) {
        wub.G(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    private final void h(int i) {
        int length = this.a.length;
        int iF = f(length, this.b + i);
        if (iF > length || this.c) {
            this.a = Arrays.copyOf(this.a, iF);
            this.c = false;
        }
    }

    final void a(Object[] objArr, int i) {
        yrm.B(objArr, i);
        h(i);
        System.arraycopy(objArr, 0, this.a, this.b, i);
        this.b += i;
    }

    public final void b(Object obj) {
        obj.getClass();
        h(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    @Override // defpackage.yff
    public /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public final void d(Object... objArr) {
        a(objArr, objArr.length);
    }

    public final void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            h(collection.size());
            if (collection instanceof yfg) {
                this.b = ((yfg) collection).a(this.a, this.b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }
}
