package defpackage;

import j$.time.Duration;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ucs implements Comparator {
    private final /* synthetic */ int a;
    private final Object b;

    /* JADX WARN: Type inference failed for: r1v2, types: [aeve, java.lang.Object] */
    public ucs(List list, xxj xxjVar, int i) {
        this.a = i;
        this.b = new aevt(list.size());
        aemi aemiVar = new aemi(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xxjVar.a((udx) it.next());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            udx udxVar = (udx) it2.next();
            int iS = udxVar.n().i;
            if (udxVar.A() && aemiVar.d(udxVar.d())) {
                iS = aemiVar.s(udxVar.d());
            }
            this.b.a(udxVar, iS);
        }
    }

    private final mvl a(nuh nuhVar) {
        nuo nuoVar = nuhVar.c.x;
        int iOrdinal = nuoVar.ordinal();
        if (iOrdinal == 5) {
            return mvl.c;
        }
        if (iOrdinal == 6) {
            return mvl.d;
        }
        if (iOrdinal == 7) {
            return lxw.g(nuhVar, (Duration) this.b) ? mvl.b : mvl.f;
        }
        if (iOrdinal == 9) {
            return mvl.a;
        }
        if (acpc.s() && nuoVar == nuo.a) {
            return mvl.e;
        }
        Objects.toString(nuoVar);
        throw new IllegalStateException("Invalid category ".concat(String.valueOf(nuoVar)));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aeve, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ukd ukdVar = (ukd) obj;
                ukd ukdVar2 = (ukd) obj2;
                IdentityHashMap identityHashMap = (IdentityHashMap) this.b;
                Integer num = (Integer) identityHashMap.get(ukdVar);
                Integer num2 = (Integer) identityHashMap.get(ukdVar2);
                return yde.b.c(num == null ? 0 : num.intValue(), num2 != null ? num2.intValue() : 0).c(ukdVar.b(), ukdVar2.b()).c(ukdVar.c(), ukdVar2.c()).a();
            }
            nuh nuhVar = (nuh) obj;
            nuh nuhVar2 = (nuh) obj2;
            nuhVar.getClass();
            nuhVar2.getClass();
            yde ydeVarE = yde.b.e(a(nuhVar), a(nuhVar2));
            int i2 = nuj.b;
            return ydeVarE.f(nuhVar, nuhVar2, new ail(18)).a();
        }
        udx udxVar = (udx) obj;
        udx udxVar2 = (udx) obj2;
        yde ydeVarG = yde.b.g(udxVar.aj(), udxVar2.aj()).g(udxVar.ah(), udxVar2.ah()).g(udxVar.ai(), udxVar2.ai());
        ?? r3 = this.b;
        yde ydeVarE2 = ydeVarG.c(r3.o(udxVar), r3.o(udxVar2)).g(udxVar.A(), udxVar2.A()).c(udxVar.n().o, udxVar2.n().o).e(udxVar.f(), udxVar2.f());
        abag abagVar = udxVar.n().e;
        if (abagVar == null) {
            abagVar = abag.a;
        }
        int iHashCode = abagVar.hashCode();
        abag abagVar2 = udxVar2.n().e;
        if (abagVar2 == null) {
            abagVar2 = abag.a;
        }
        yde ydeVarC = ydeVarE2.c(iHashCode, abagVar2.hashCode());
        abdy abdyVar = udxVar.n().f;
        if (abdyVar == null) {
            abdyVar = abdy.a;
        }
        int iHashCode2 = abdyVar.hashCode();
        abdy abdyVar2 = udxVar2.n().f;
        if (abdyVar2 == null) {
            abdyVar2 = abdy.a;
        }
        return ydeVarC.c(iHashCode2, abdyVar2.hashCode()).g(udxVar.B(), udxVar2.B()).c(udxVar.hashCode(), udxVar2.hashCode()).a();
    }

    public ucs(Duration duration, int i) {
        this.a = i;
        this.b = duration;
    }

    public ucs(uie uieVar, ukx ukxVar, int i) {
        this.a = i;
        this.b = new IdentityHashMap(ukxVar.g.size());
        ukw ukwVarI = ukxVar.i();
        while (ukwVarI.hasNext()) {
            ukd next = ukwVarI.next();
            ((IdentityHashMap) this.b).put(next, Integer.valueOf(uieVar.e(next).F));
        }
    }
}
