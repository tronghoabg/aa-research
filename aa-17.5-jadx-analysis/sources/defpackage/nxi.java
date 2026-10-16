package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class nxi extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ List c;
    final /* synthetic */ axr d;
    final /* synthetic */ SnapshotStateList e;
    final /* synthetic */ afec f;
    final /* synthetic */ bwq g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxi(List list, axr axrVar, SnapshotStateList snapshotStateList, afec afecVar, bwq bwqVar, afck afckVar) {
        super(2, afckVar);
        this.c = list;
        this.d = axrVar;
        this.e = snapshotStateList;
        this.f = afecVar;
        this.g = bwqVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new nxi(this.c, this.d, this.e, this.f, this.g, afckVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Object next;
        Iterator it;
        afcr afcrVar = afcr.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            woy.dF(obj);
            it = obj2;
        } else {
            woy.dF(obj);
            nxm.a.l().u("clearAll");
            List list = this.c;
            ebf.j().q(yzz.NOTIFICATION_CENTER, yzy.ly, list.size());
            List list2 = this.d.l().j;
            ArrayList arrayList = new ArrayList(woy.bp(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((axk) it2.next()).e);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (affa.f(((nuh) next).d, obj3)) {
                        break;
                    }
                }
                nuh nuhVar = (nuh) next;
                if (nuhVar != null) {
                    arrayList2.add(nuhVar);
                }
            }
            List listCa = woy.ca(arrayList2);
            bwq bwqVar = this.g;
            yph yphVar = nxm.a;
            bwqVar.b(Boolean.valueOf(true));
            it = listCa.iterator();
        }
        while (it.hasNext()) {
            this.e.add(((nuh) it.next()).d);
            Duration durationAk = wub.ak(67);
            this.a = it;
            this.b = 1;
            if (wub.aq(durationAk, this) == afcrVar) {
                return afcrVar;
            }
        }
        List list3 = this.c;
        afec afecVar = this.f;
        Iterator it4 = list3.iterator();
        while (it4.hasNext()) {
            afecVar.invoke(it4.next());
        }
        this.e.clear();
        bwq bwqVar2 = this.g;
        yph yphVar2 = nxm.a;
        bwqVar2.b(Boolean.valueOf(false));
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((nxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
