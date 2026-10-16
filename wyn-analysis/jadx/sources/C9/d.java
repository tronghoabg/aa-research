package c9;

import A7.C0295v;
import W9.u;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r9.C3946c;

/* loaded from: classes4.dex */
public final class d implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final c f19805a;

    public d(List list, Comparator comparator) {
        c cVarC;
        Map map = Collections.EMPTY_MAP;
        if (list.size() < 25) {
            Collections.sort(list, comparator);
            int size = list.size();
            Object[] objArr = new Object[size];
            Object[] objArr2 = new Object[size];
            int i5 = 0;
            for (Object obj : list) {
                objArr[i5] = obj;
                objArr2[i5] = map.get(obj);
                i5++;
            }
            cVarC = new b(comparator, objArr, objArr2);
        } else {
            cVarC = u.c(list, map, comparator);
        }
        this.f19805a = cVarC;
    }

    public final d a(Object obj) {
        return new d(this.f19805a.g(obj, null));
    }

    public final C0295v b(C3946c c3946c) {
        return new C0295v(this.f19805a.h(c3946c));
    }

    public final d c(Object obj) {
        c cVar = this.f19805a;
        c cVarI = cVar.i(obj);
        return cVarI == cVar ? this : new d(cVarI);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f19805a.equals(((d) obj).f19805a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19805a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0295v(this.f19805a.iterator());
    }

    public d(c cVar) {
        this.f19805a = cVar;
    }
}
