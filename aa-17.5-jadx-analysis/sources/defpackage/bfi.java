package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bfi implements ctp {
    private final afdr a;
    private final afdr b;

    public bfi(afdr afdrVar, afdr afdrVar2) {
        this.a = afdrVar;
        this.b = afdrVar2;
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int a(csq csqVar, List list, int i) {
        return tr.u(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int b(csq csqVar, List list, int i) {
        return tr.v(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int c(csq csqVar, List list, int i) {
        return tr.w(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final /* synthetic */ int d(csq csqVar, List list, int i) {
        return tr.x(this, csqVar, list, i);
    }

    @Override // defpackage.ctp
    public final ctq e(cts ctsVar, List list, long j) {
        ArrayList arrayList;
        aezu aezuVar;
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(((cto) obj).g() instanceof bfk)) {
                arrayList2.add(obj);
            }
        }
        List list2 = (List) this.b.invoke();
        if (list2 != null) {
            arrayList = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                cjb cjbVar = (cjb) list2.get(i2);
                if (cjbVar != null) {
                    cto ctoVar = (cto) arrayList2.get(i2);
                    float f = cjbVar.d;
                    float f2 = cjbVar.b;
                    float fFloor = (float) Math.floor(f - f2);
                    float f3 = cjbVar.e;
                    float f4 = cjbVar.c;
                    aezuVar = new aezu(ctoVar.v(dlf.d(0, (int) fFloor, 0, (int) Math.floor(f3 - f4))), new dlo((Math.round(f2) << 32) | (Math.round(f4) & 4294967295L)));
                } else {
                    aezuVar = null;
                }
                if (aezuVar != null) {
                    arrayList.add(aezuVar);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList3 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = list.get(i3);
            if (((cto) obj2).g() instanceof bfk) {
                arrayList3.add(obj2);
            }
        }
        return ctsVar.eK(dle.b(j), dle.a(j), afbf.a, new bee(arrayList, afp.I(arrayList3, this.a), 5, null));
    }
}
