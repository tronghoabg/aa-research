package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class d0 implements InterfaceC1412b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f18392a;

    public d0(e0 e0Var) {
        this.f18392a = e0Var;
    }

    @Override // androidx.fragment.app.InterfaceC1412b0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        e0 e0Var = this.f18392a;
        C1409a c1409a = (C1409a) AbstractC3256n.e(e0Var.f18411d, 1);
        e0Var.f18415h = c1409a;
        Iterator it = c1409a.f18350a.iterator();
        while (it.hasNext()) {
            F f10 = ((n0) it.next()).f18504b;
            if (f10 != null) {
                f10.mTransitioning = true;
            }
        }
        boolean zR = e0Var.R(arrayList, arrayList2, -1, 0);
        if (!e0Var.f18419m.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(e0.E((C1409a) it2.next()));
            }
            Iterator it3 = e0Var.f18419m.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zR;
    }
}
