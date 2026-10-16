package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.Header;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tjr extends tjo {
    public boolean a;

    public tjr(boolean z) {
        this.a = z;
    }

    @Override // defpackage.tjo
    public final /* bridge */ /* synthetic */ Object a() {
        uj ujVar = new uj();
        ujVar.a = this.a;
        ArrayList arrayList = new ArrayList();
        List list = this.k;
        for (Object obj : list) {
            if (obj instanceof tin) {
                arrayList.add(obj);
            }
        }
        tin tinVar = (tin) woy.bP(arrayList);
        if (tinVar != null) {
            ujVar.d((Header) tinVar.d());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ths) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ujVar.b((Action) ((ths) it.next()).d());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof tir) {
                arrayList3.add(obj3);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((tir) it2.next()).c(ujVar);
        }
        return ujVar.a();
    }

    @Override // defpackage.tjo
    public final String b() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.k) {
            if (obj instanceof tin) {
                arrayList.add(obj);
            }
        }
        tin tinVar = (tin) woy.bP(arrayList);
        return "List: isLoading " + this.a + (tinVar != null ? ", header ".concat(tinVar.b()) : "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tjr) && this.a == ((tjr) obj).a;
    }

    public final int hashCode() {
        return a.f(this.a);
    }

    public final String toString() {
        return "ListNode(isLoading=" + this.a + ")";
    }

    public tjr() {
        throw null;
    }
}
