package s9;

import Va.M6;
import java.util.ArrayList;
import java.util.List;
import w9.AbstractC4397p;

/* loaded from: classes4.dex */
public abstract class e implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final List f45369a;

    public e(List list) {
        this.f45369a = list;
    }

    public final e a(String str) {
        ArrayList arrayList = new ArrayList(this.f45369a);
        arrayList.add(str);
        return e(arrayList);
    }

    public final e b(e eVar) {
        ArrayList arrayList = new ArrayList(this.f45369a);
        arrayList.addAll(eVar.f45369a);
        return e(arrayList);
    }

    public abstract String c();

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        int size = this.f45369a.size();
        int size2 = eVar.f45369a.size();
        for (int i5 = 0; i5 < size && i5 < size2; i5++) {
            int iCompareTo = g(i5).compareTo(eVar.g(i5));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return AbstractC4397p.d(size, size2);
    }

    public abstract e e(List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    public final String f() {
        return (String) M6.k(1, this.f45369a);
    }

    public final String g(int i5) {
        return (String) this.f45369a.get(i5);
    }

    public final boolean h() {
        return this.f45369a.size() == 0;
    }

    public final int hashCode() {
        return this.f45369a.hashCode() + ((getClass().hashCode() + 37) * 37);
    }

    public final boolean i(e eVar) {
        List list = this.f45369a;
        if (list.size() <= eVar.f45369a.size()) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                if (g(i5).equals(eVar.g(i5))) {
                }
            }
            return true;
        }
        return false;
    }

    public final e j() {
        List list = this.f45369a;
        int size = list.size();
        A6.c.z(size >= 5, "Can't call popFirst with count > length() (%d > %d)", 5, Integer.valueOf(size));
        return new m(list.subList(5, size));
    }

    public final e k() {
        return e(this.f45369a.subList(0, r0.size() - 1));
    }

    public final String toString() {
        return c();
    }
}
