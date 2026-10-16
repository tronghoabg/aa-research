package t3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.RunnableC1423l;
import androidx.fragment.app.v0;
import java.util.ArrayList;

/* renamed from: t3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4093m extends v0 {
    @Override // androidx.fragment.app.v0
    public final void a(View view, Object obj) {
        ((AbstractC4096p) obj).b(view);
    }

    @Override // androidx.fragment.app.v0
    public final void b(Object obj, ArrayList arrayList) {
        AbstractC4096p abstractC4096p = (AbstractC4096p) obj;
        if (abstractC4096p == null) {
            return;
        }
        int i5 = 0;
        if (abstractC4096p instanceof C4101u) {
            C4101u c4101u = (C4101u) abstractC4096p;
            int size = c4101u.f45726x.size();
            while (i5 < size) {
                b((i5 < 0 || i5 >= c4101u.f45726x.size()) ? null : (AbstractC4096p) c4101u.f45726x.get(i5), arrayList);
                i5++;
            }
            return;
        }
        if (v0.h(abstractC4096p.f45702e) && v0.h(abstractC4096p.f45703f)) {
            int size2 = arrayList.size();
            while (i5 < size2) {
                abstractC4096p.b((View) arrayList.get(i5));
                i5++;
            }
        }
    }

    @Override // androidx.fragment.app.v0
    public final void c(ViewGroup viewGroup, Object obj) {
        AbstractC4100t.a(viewGroup, (AbstractC4096p) obj);
    }

    @Override // androidx.fragment.app.v0
    public final boolean e(Object obj) {
        return obj instanceof AbstractC4096p;
    }

    @Override // androidx.fragment.app.v0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((AbstractC4096p) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.v0
    public final Object j(Object obj, Object obj2, Object obj3) {
        AbstractC4096p abstractC4096p = (AbstractC4096p) obj;
        AbstractC4096p abstractC4096p2 = (AbstractC4096p) obj2;
        AbstractC4096p abstractC4096p3 = (AbstractC4096p) obj3;
        if (abstractC4096p != null && abstractC4096p2 != null) {
            C4101u c4101u = new C4101u();
            c4101u.J(abstractC4096p);
            c4101u.J(abstractC4096p2);
            c4101u.f45727y = false;
            abstractC4096p = c4101u;
        } else if (abstractC4096p == null) {
            abstractC4096p = abstractC4096p2 != null ? abstractC4096p2 : null;
        }
        if (abstractC4096p3 == null) {
            return abstractC4096p;
        }
        C4101u c4101u2 = new C4101u();
        if (abstractC4096p != null) {
            c4101u2.J(abstractC4096p);
        }
        c4101u2.J(abstractC4096p3);
        return c4101u2;
    }

    @Override // androidx.fragment.app.v0
    public final Object k(Object obj, Object obj2) {
        C4101u c4101u = new C4101u();
        if (obj != null) {
            c4101u.J((AbstractC4096p) obj);
        }
        c4101u.J((AbstractC4096p) obj2);
        return c4101u;
    }

    @Override // androidx.fragment.app.v0
    public final void l(Object obj, View view, ArrayList arrayList) {
        ((AbstractC4096p) obj).a(new C4090j(view, arrayList));
    }

    @Override // androidx.fragment.app.v0
    public final void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC4096p) obj).a(new C4091k(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.v0
    public final void n(View view, Object obj) {
        if (view != null) {
            v0.g(view, new Rect());
            ((AbstractC4096p) obj).C(new C4089i());
        }
    }

    @Override // androidx.fragment.app.v0
    public final void o(Object obj, Rect rect) {
        ((AbstractC4096p) obj).C(new C4089i());
    }

    @Override // androidx.fragment.app.v0
    public final void p(Object obj, R4.a aVar, RunnableC1423l runnableC1423l) {
        AbstractC4096p abstractC4096p = (AbstractC4096p) obj;
        a2.v vVar = new a2.v(abstractC4096p, 25);
        synchronized (aVar) {
            while (aVar.f10232b) {
                try {
                    try {
                        aVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (((a2.v) aVar.f10233c) != vVar) {
                aVar.f10233c = vVar;
                if (aVar.f10231a) {
                    ((AbstractC4096p) vVar.f17322b).cancel();
                }
            }
        }
        abstractC4096p.a(new C4092l(runnableC1423l));
    }

    @Override // androidx.fragment.app.v0
    public final void q(Object obj, View view, ArrayList arrayList) {
        C4101u c4101u = (C4101u) obj;
        ArrayList arrayList2 = c4101u.f45703f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            v0.d((View) arrayList.get(i5), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(c4101u, arrayList);
    }

    @Override // androidx.fragment.app.v0
    public final void r(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C4101u c4101u = (C4101u) obj;
        if (c4101u != null) {
            ArrayList arrayList3 = c4101u.f45703f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            t(c4101u, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.v0
    public final Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        C4101u c4101u = new C4101u();
        c4101u.J((AbstractC4096p) obj);
        return c4101u;
    }

    public final void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC4096p abstractC4096p = (AbstractC4096p) obj;
        int i5 = 0;
        if (abstractC4096p instanceof C4101u) {
            C4101u c4101u = (C4101u) abstractC4096p;
            int size = c4101u.f45726x.size();
            while (i5 < size) {
                t((i5 < 0 || i5 >= c4101u.f45726x.size()) ? null : (AbstractC4096p) c4101u.f45726x.get(i5), arrayList, arrayList2);
                i5++;
            }
            return;
        }
        if (v0.h(abstractC4096p.f45702e)) {
            ArrayList arrayList3 = abstractC4096p.f45703f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i5 < size2) {
                    abstractC4096p.b((View) arrayList2.get(i5));
                    i5++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    abstractC4096p.x((View) arrayList.get(size3));
                }
            }
        }
    }
}
