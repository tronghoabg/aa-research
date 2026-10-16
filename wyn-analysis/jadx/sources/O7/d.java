package O7;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import ka.AbstractC3256n;
import ka.C1;
import md.i0;
import p9.t;
import s9.j;
import s9.k;
import s9.p;

/* loaded from: classes4.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8908a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8909b;

    public /* synthetic */ d(Object obj, int i5) {
        this.f8908a = i5;
        this.f8909b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i5;
        int iA;
        int iB;
        switch (this.f8908a) {
            case 0:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f26855o).compareTo(Boolean.valueOf(materialButton2.f26855o));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f8909b;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            case 1:
                i0 i0Var = (i0) this.f8909b;
                int iD = i0Var.d(obj) - i0Var.d(obj2);
                return iD != 0 ? iD : obj.getClass().getName().compareTo(obj2.getClass().getName());
            default:
                k kVar = (k) obj;
                k kVar2 = (k) obj2;
                Iterator it = ((List) this.f8909b).iterator();
                do {
                    i5 = 0;
                    if (it.hasNext()) {
                        t tVar = (t) it.next();
                        tVar.getClass();
                        j jVar = j.f45378b;
                        j jVar2 = tVar.f43407b;
                        boolean zEquals = jVar2.equals(jVar);
                        int i10 = tVar.f43406a;
                        if (zEquals) {
                            iA = AbstractC3256n.a(i10);
                            iB = kVar.f45380a.compareTo(kVar2.f45380a);
                        } else {
                            C1 c1F = kVar.f45384e.f(jVar2);
                            C1 c1F2 = kVar2.f45384e.f(jVar2);
                            A6.c.z((c1F == null || c1F2 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
                            iA = AbstractC3256n.a(i10);
                            iB = p.b(c1F, c1F2);
                        }
                        i5 = iB * iA;
                    }
                    return i5;
                } while (i5 == 0);
                return i5;
        }
    }

    public d(List list) {
        boolean z2;
        this.f8908a = 2;
        Iterator it = list.iterator();
        loop0: while (true) {
            z2 = false;
            while (it.hasNext()) {
                z2 = (z2 || ((t) it.next()).f43407b.equals(j.f45378b)) ? true : z2;
            }
        }
        if (!z2) {
            throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
        }
        this.f8909b = list;
    }
}
