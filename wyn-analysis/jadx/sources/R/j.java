package R;

import ff.m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: b, reason: collision with root package name */
    public static final j f10033b = new j(new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f10034a;

    public j(Object[] objArr) {
        this.f10034a = objArr;
    }

    @Override // R.c
    public final c a(int i5, Object obj) {
        tg.b.s(i5, size());
        if (i5 == size()) {
            return c(obj);
        }
        int size = size();
        Object[] objArr = this.f10034a;
        if (size < 32) {
            Object[] objArr2 = new Object[size() + 1];
            m.j0(objArr, 0, objArr2, i5, 6);
            m.h0(objArr, i5 + 1, objArr2, i5, size());
            objArr2[i5] = obj;
            return new j(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3340k.d(objArrCopyOf, "copyOf(this, size)");
        m.h0(objArr, i5 + 1, objArrCopyOf, i5, size() - 1);
        objArrCopyOf[i5] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new f(objArrCopyOf, objArr3, size() + 1, 0);
    }

    @Override // R.c
    public final c c(Object obj) {
        int size = size();
        Object[] objArr = this.f10034a;
        if (size >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new f(objArr, objArr2, size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
        AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size()] = obj;
        return new j(objArrCopyOf);
    }

    @Override // R.c
    public final c d(Collection collection) {
        if (collection.size() + size() > 32) {
            g gVarE = e();
            gVarE.addAll(collection);
            return gVarE.d();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f10034a, collection.size() + size());
        AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new j(objArrCopyOf);
    }

    @Override // R.c
    public final g e() {
        return new g(this, null, this.f10034a, 0);
    }

    @Override // R.c
    public final c f(b bVar) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.f10034a;
        Object[] objArrCopyOf = objArr;
        boolean z2 = false;
        for (int i5 = 0; i5 < size2; i5++) {
            Object obj = objArr[i5];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z2) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    AbstractC3340k.d(objArrCopyOf, "copyOf(this, size)");
                    z2 = true;
                    size = i5;
                }
            } else if (z2) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? f10033b : new j(m.m0(objArrCopyOf, 0, size));
    }

    @Override // R.c
    public final c g(int i5) {
        tg.b.q(i5, size());
        if (size() == 1) {
            return f10033b;
        }
        int size = size() - 1;
        Object[] objArr = this.f10034a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
        AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
        m.h0(objArr, i5, objArrCopyOf, i5 + 1, size());
        return new j(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i5) {
        tg.b.q(i5, size());
        return this.f10034a[i5];
    }

    @Override // ff.AbstractC2646a
    public final int getSize() {
        return this.f10034a.length;
    }

    @Override // R.c
    public final c h(int i5, Object obj) {
        tg.b.q(i5, size());
        Object[] objArr = this.f10034a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3340k.d(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i5] = obj;
        return new j(objArrCopyOf);
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final int indexOf(Object obj) {
        return m.y0(obj, this.f10034a);
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f10034a;
        AbstractC3340k.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i5 < 0) {
                        break;
                    }
                    length = i5;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i10 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length2 = i10;
                }
            }
        }
        return -1;
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final ListIterator listIterator(int i5) {
        tg.b.s(i5, size());
        return new d(this.f10034a, i5, size());
    }
}
