package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tyg {
    public final tyf a;
    public final tof b;
    public final ulw e;
    public final boolean f;
    public final float g;
    public final int h;
    public final ujx j;
    public ute k;
    public ugc l;
    private final List n = new ArrayList();
    public final List c = new ArrayList();
    public List d = new ArrayList();
    public int i = 0;
    public uvx m = null;

    public tyg(ujx ujxVar, tyf tyfVar, tof tofVar, int i, float f, int i2, ulw ulwVar) {
        this.j = ujxVar;
        this.a = tyfVar;
        this.b = tofVar;
        this.f = i == 2;
        this.g = f;
        this.h = i2;
        this.k = ulwVar.E();
        this.e = ulwVar;
        ulwVar.A(false);
        ulwVar.s = 519;
        ulwVar.t(1, 771);
        ulwVar.m(1.0f);
    }

    public static ujf a(ugc ugcVar, int i) {
        return ((ukf) ugcVar.c.get(0)).g(i);
    }

    public static ute b(int i) {
        return new ute(2147483647L, 2147483647L, 2147483647L, i);
    }

    public final void c() {
        this.e.l(this.a.b());
        this.i = 0;
        for (uho uhoVar : this.c) {
            for (uhp uhpVar : uhoVar.b) {
                this.i += urw.a(Math.max(uhpVar.b.length >> 1, uhpVar.c.length >> 1), uhoVar.e, uhpVar.a.length);
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean d(abdd abddVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tyz tyzVar = (tyz) it.next();
            if (!this.n.contains(tyzVar)) {
                arrayList.add(tyzVar);
            }
        }
        if (!arrayList.isEmpty()) {
            List list2 = this.n;
            if (arrayList.size() > 8 - list2.size() || (!arrayList.isEmpty() && !list2.isEmpty() && !((tyz) list2.get(0)).l((tqo) arrayList.get(0), this.f))) {
                return false;
            }
        }
        this.n.addAll(arrayList);
        uho uhoVar = new uho(abddVar, this.b);
        this.c.add(uhoVar);
        this.a.d(uhoVar);
        return true;
    }

    public final boolean e() {
        ugc ugcVar = this.l;
        if (ugcVar == null || ugcVar.c.isEmpty()) {
            return false;
        }
        ujf ujfVarD = ((ukf) this.l.c.get(0)).d();
        return uqw.x(this.f ? ujfVarD.I : ujfVarD.H, 1);
    }
}
