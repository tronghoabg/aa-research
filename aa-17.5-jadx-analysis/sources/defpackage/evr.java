package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class evr {
    public boolean c;
    public final aizz d;
    public final aizz e;
    public final ajab f;
    public final ajab g;
    public final ebl h = new ebl();

    public evr() {
        ajab ajabVar = new ajab(afbe.a);
        this.f = ajabVar;
        ajab ajabVar2 = new ajab(afbg.a);
        this.g = ajabVar2;
        this.d = new aizl(ajabVar, null);
        this.e = new aizl(ajabVar2, null);
    }

    public abstract euq a(euz euzVar, Bundle bundle);

    public void c(euq euqVar) {
        throw null;
    }

    public void d(euq euqVar, boolean z) {
        throw null;
    }

    public void e(euq euqVar) {
        throw null;
    }

    public final void f(euq euqVar) {
        int iNextIndex;
        synchronized (this.h) {
            List listCh = woy.ch((Collection) this.d.b());
            ListIterator listIterator = listCh.listIterator(listCh.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (affa.f(((euq) listIterator.previous()).c, euqVar.c)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            listCh.set(iNextIndex, euqVar);
            this.f.d(listCh);
        }
    }

    public final void g(euq euqVar, boolean z) {
        Object objPrevious;
        ajab ajabVar = this.g;
        Iterable iterable = (Iterable) ajabVar.b();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((euq) it.next()) == euqVar) {
                    Iterable iterable2 = (Iterable) this.d.b();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((euq) it2.next()) == euqVar) {
                        }
                    }
                    return;
                }
            }
        }
        ajabVar.d(woy.aT((Set) ajabVar.b(), euqVar));
        aizz aizzVar = this.d;
        List list = (List) aizzVar.b();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            euq euqVar2 = (euq) objPrevious;
            if (!affa.f(euqVar2, euqVar) && ((List) aizzVar.b()).lastIndexOf(euqVar2) < ((List) aizzVar.b()).lastIndexOf(euqVar)) {
                break;
            }
        }
        euq euqVar3 = (euq) objPrevious;
        if (euqVar3 != null) {
            ajabVar.d(woy.aT((Set) ajabVar.b(), euqVar3));
        }
        d(euqVar, z);
    }

    public final void h(euq euqVar) {
        euqVar.getClass();
        ajab ajabVar = this.g;
        Iterable iterable = (Iterable) ajabVar.b();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((euq) it.next()) == euqVar) {
                    Iterable iterable2 = (Iterable) this.d.b();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((euq) it2.next()) == euqVar) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        euq euqVar2 = (euq) woy.bL((List) this.d.b());
        if (euqVar2 != null) {
            ajabVar.d(woy.aT((Set) ajabVar.b(), euqVar2));
        }
        ajabVar.d(woy.aT((Set) ajabVar.b(), euqVar));
        e(euqVar);
    }
}
