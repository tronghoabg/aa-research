package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class ewp {
    public final afdr a;
    public eva b;
    public Bundle c;
    public Bundle[] d;
    public final afaz e = new afaz();
    public final Map f;
    public final Map g;
    public eqa h;
    public eps i;
    public final epz j;
    public final evq k;
    public final Map l;
    public afec m;
    public afec n;
    public final Map o;
    public final ajab p;
    public final ajab q;
    public evn r;
    private final euu s;
    private final Map t;
    private final Map u;
    private final List v;
    private int w;
    private final List x;
    private final aizk y;

    public ewp(euu euuVar, afdr afdrVar) {
        this.s = euuVar;
        this.a = afdrVar;
        afbe afbeVar = afbe.a;
        this.p = ajac.a(afbeVar);
        this.q = ajac.a(afbeVar);
        this.t = new LinkedHashMap();
        this.u = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.v = new ArrayList();
        this.i = eps.b;
        this.j = new erc(this, 4, null);
        this.k = new evq();
        this.l = new LinkedHashMap();
        this.o = new LinkedHashMap();
        this.x = new ArrayList();
        this.y = aizq.e(1, 0, 2, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [euz, eva] */
    /* JADX WARN: Type inference failed for: r0v5, types: [eva, java.lang.Object] */
    public static final euz o(euz euzVar, int i, boolean z, euz euzVar2) {
        euzVar.getClass();
        if (euzVar.c() == i && (euzVar2 == null || (affa.f(euzVar, euzVar2) && affa.f(euzVar.e, euzVar2.e)))) {
            return euzVar;
        }
        ?? r0 = euzVar instanceof eva ? (eva) euzVar : 0;
        if (r0 == 0) {
            r0 = euzVar.e;
            r0.getClass();
        }
        return r0.m(i, r0, z, euzVar2);
    }

    public static /* synthetic */ void r(ewp ewpVar, euq euqVar) {
        ewpVar.j(euqVar, false, new afaz());
    }

    private final boolean v(int i, Bundle bundle, eve eveVar) {
        euz euzVarF;
        euq euqVar;
        euz euzVar;
        Map map = this.f;
        Integer numValueOf = Integer.valueOf(i);
        int i2 = 0;
        if (!map.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) map.get(numValueOf);
        woy.cv(map.values(), new ewm(str, i2));
        Map map2 = this.g;
        affz.i(map2);
        afaz<erb> afazVar = (afaz) map2.remove(str);
        ArrayList arrayList = new ArrayList();
        euq euqVar2 = (euq) this.e.f();
        if (euqVar2 == null || (euzVarF = euqVar2.a) == null) {
            euzVarF = f();
        }
        if (afazVar != null) {
            for (erb erbVar : afazVar) {
                euz euzVarO = o(euzVarF, erbVar.D(), true, null);
                if (euzVarO == null) {
                    throw new IllegalStateException("Restore State failed: destination " + ebf.K(u(), erbVar.D()) + " cannot be found from the current destination " + euzVarF);
                }
                arrayList.add(erbVar.J(u(), euzVarO, a(), this.r));
                euzVarF = euzVarO;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<euq> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((euq) obj).a instanceof eva)) {
                arrayList3.add(obj);
            }
        }
        for (euq euqVar3 : arrayList3) {
            List list = (List) woy.bL(arrayList2);
            if (affa.f((list == null || (euqVar = (euq) woy.bK(list)) == null || (euzVar = euqVar.a) == null) ? null : euzVar.c, euqVar3.a.c)) {
                list.add(euqVar3);
            } else {
                arrayList2.add(woy.bk(euqVar3));
            }
        }
        affq affqVar = new affq();
        for (List list2 : arrayList2) {
            q(this.k.a(((euq) woy.bF(list2)).a.c), list2, eveVar, new ewo(affqVar, arrayList, new afft(), this, bundle, 0));
        }
        return affqVar.a;
    }

    public final eps a() {
        return this.h == null ? eps.c : this.i;
    }

    public final euq b(int i) {
        Object objPrevious;
        afaz afazVar = this.e;
        ListIterator<E> listIterator = afazVar.listIterator(afazVar.a);
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((euq) objPrevious).a.c() == i) {
                break;
            }
        }
        euq euqVar = (euq) objPrevious;
        if (euqVar != null) {
            return euqVar;
        }
        throw new IllegalArgumentException("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + e());
    }

    public final euq c() {
        return (euq) this.e.f();
    }

    public final euz d(int i, euz euzVar) {
        euz euzVar2;
        eva evaVar = this.b;
        if (evaVar == null) {
            return null;
        }
        if (evaVar.c() == i && (euzVar == null || (affa.f(this.b, euzVar) && euzVar.e == null))) {
            return this.b;
        }
        euq euqVar = (euq) this.e.f();
        if (euqVar == null || (euzVar2 = euqVar.a) == null) {
            euzVar2 = this.b;
            euzVar2.getClass();
        }
        return o(euzVar2, i, false, euzVar);
    }

    public final euz e() {
        euq euqVarC = c();
        if (euqVarC != null) {
            return euqVarC.a;
        }
        return null;
    }

    public final eva f() {
        eva evaVar = this.b;
        if (evaVar != null) {
            return evaVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.l.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((eur) it.next()).e.b();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                euq euqVar = (euq) obj;
                if (!arrayList.contains(euqVar) && !euqVar.i.a(eps.d)) {
                    arrayList2.add(obj);
                }
            }
            woy.cq(arrayList, arrayList2);
        }
        afaz afazVar = this.e;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : afazVar) {
            euq euqVar2 = (euq) obj2;
            if (!arrayList.contains(euqVar2) && euqVar2.i.a(eps.d)) {
                arrayList3.add(obj2);
            }
        }
        woy.cq(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((euq) obj3).a instanceof eva)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final void h(euz euzVar, Bundle bundle, euq euqVar, List list) {
        afaz afazVar;
        Object objPrevious;
        Object objPrevious2;
        afaz afazVar2;
        euz euzVar2 = euqVar.a;
        if (!(euzVar2 instanceof ewa)) {
            do {
                afazVar2 = this.e;
                if (afazVar2.isEmpty() || !(((euq) afazVar2.e()).a instanceof ewa)) {
                    break;
                }
            } while (n(((euq) afazVar2.e()).a.c(), true, false));
        }
        afaz<euq> afazVar3 = new afaz();
        Object obj = null;
        if (euzVar instanceof eva) {
            euz euzVar3 = euzVar2;
            do {
                euzVar3.getClass();
                euzVar3 = euzVar3.e;
                if (euzVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (affa.f(((euq) objPrevious2).a, euzVar3)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    euq euqVarM = (euq) objPrevious2;
                    if (euqVarM == null) {
                        euqVarM = ebf.M(u(), euzVar3, bundle, a(), this.r);
                    }
                    afazVar3.addFirst(euqVarM);
                    afaz afazVar4 = this.e;
                    if (!afazVar4.isEmpty() && ((euq) afazVar4.e()).a == euzVar3) {
                        r(this, (euq) afazVar4.e());
                    }
                }
                if (euzVar3 == null) {
                    break;
                }
            } while (euzVar3 != euzVar);
        }
        euz euzVar4 = afazVar3.isEmpty() ? euzVar2 : ((euq) afazVar3.a()).a;
        while (euzVar4 != null && d(euzVar4.c(), euzVar4) != euzVar4) {
            euzVar4 = euzVar4.e;
            if (euzVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (affa.f(((euq) objPrevious).a, euzVar4)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                euq euqVarM2 = (euq) objPrevious;
                if (euqVarM2 == null) {
                    euqVarM2 = ebf.M(u(), euzVar4, euzVar4.d(bundle2), a(), this.r);
                }
                afazVar3.addFirst(euqVarM2);
            }
        }
        if (!afazVar3.isEmpty()) {
            euzVar2 = ((euq) afazVar3.a()).a;
        }
        while (true) {
            afazVar = this.e;
            if (afazVar.isEmpty() || !(((euq) afazVar.e()).a instanceof eva)) {
                break;
            }
            euz euzVar5 = ((euq) afazVar.e()).a;
            euzVar5.getClass();
            if (aav.a(((eva) euzVar5).k(), euzVar2.c()) != null) {
                break;
            } else {
                r(this, (euq) afazVar.e());
            }
        }
        euq euqVar2 = (euq) afazVar.c();
        if (euqVar2 == null) {
            euqVar2 = (euq) afazVar3.c();
        }
        if (!affa.f(euqVar2 != null ? euqVar2.a : null, this.b)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                euz euzVar6 = ((euq) objPrevious3).a;
                eva evaVar = this.b;
                evaVar.getClass();
                if (affa.f(euzVar6, evaVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            euq euqVarM3 = (euq) obj;
            if (euqVarM3 == null) {
                erb erbVarU = u();
                eva evaVar2 = this.b;
                evaVar2.getClass();
                evaVar2.getClass();
                euqVarM3 = ebf.M(erbVarU, evaVar2, evaVar2.d(bundle), a(), this.r);
            }
            afazVar3.addFirst(euqVarM3);
        }
        for (euq euqVar3 : afazVar3) {
            Object obj2 = this.l.get(this.k.a(euqVar3.a.c));
            if (obj2 == null) {
                throw new IllegalStateException("NavigatorBackStack for " + euzVar.c + " should already be created");
            }
            ((eur) obj2).b(euqVar3);
        }
        afazVar.addAll(afazVar3);
        afazVar.addLast(euqVar);
        for (euq euqVar4 : woy.bZ(afazVar3, euqVar)) {
            eva evaVar3 = euqVar4.a.e;
            if (evaVar3 != null) {
                i(euqVar4, b(evaVar3.c()));
            }
        }
    }

    public final void i(euq euqVar, euq euqVar2) {
        euqVar.getClass();
        this.t.put(euqVar, euqVar2);
        Map map = this.u;
        if (map.get(euqVar2) == null) {
            map.put(euqVar2, new erb((char[]) null));
        }
        Object obj = map.get(euqVar2);
        obj.getClass();
        ((AtomicInteger) ((erb) obj).a).incrementAndGet();
    }

    public final void j(euq euqVar, boolean z, afaz afazVar) {
        evn evnVar;
        Set set;
        euqVar.getClass();
        afaz afazVar2 = this.e;
        euq euqVar2 = (euq) afazVar2.e();
        if (!affa.f(euqVar2, euqVar)) {
            throw new IllegalStateException("Attempted to pop " + euqVar.a + ", which is not the top of the back stack (" + euqVar2.a + ")");
        }
        woy.bu(afazVar2);
        eur eurVar = (eur) this.l.get(this.k.a(euqVar2.a.c));
        boolean z2 = true;
        if ((eurVar == null || (set = (Set) eurVar.e.b()) == null || !set.contains(euqVar2)) && !this.u.containsKey(euqVar2)) {
            z2 = false;
        }
        eps epsVar = euqVar2.g.e;
        eps epsVar2 = eps.c;
        if (epsVar.a(epsVar2)) {
            if (z) {
                euqVar2.b(epsVar2);
                afazVar.addFirst(new erb(euqVar2));
            }
            if (z2) {
                euqVar2.b(epsVar2);
            } else {
                euqVar2.b(eps.a);
                s(euqVar2);
            }
        }
        if (z || z2 || (evnVar = this.r) == null) {
            return;
        }
        evnVar.a(euqVar2.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x030e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0214  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [euz, eva] */
    /* JADX WARN: Type inference failed for: r8v17, types: [eva, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v51 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.eva r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewp.k(eva, android.os.Bundle):void");
    }

    public final void l() {
        erb erbVar;
        Set set;
        List<euq> listCh = woy.ch(this.e);
        if (listCh.isEmpty()) {
            return;
        }
        euz euzVar = ((euq) woy.bK(listCh)).a;
        List listBk = woy.bk(euzVar);
        if (euzVar instanceof evx) {
            boolean z = euzVar instanceof ewa;
            Iterator it = woy.bR(woy.ca(listCh), 1).iterator();
            while (it.hasNext()) {
                euz euzVar2 = ((euq) it.next()).a;
                if (z && !(euzVar2 instanceof ewa) && !(euzVar2 instanceof eva)) {
                    break;
                }
                listBk.add(euzVar2);
                if (!(euzVar2 instanceof evx) && !(euzVar2 instanceof eva)) {
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (woy.bK(listBk) instanceof ewa) {
            Iterator it2 = woy.ca(listCh).iterator();
            while (it2.hasNext()) {
                euz euzVar3 = ((euq) it2.next()).a;
                arrayList.add(euzVar3);
                if (!(euzVar3 instanceof ewa) && !(euzVar3 instanceof evx) && !(euzVar3 instanceof eva)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (euq euqVar : woy.ca(listCh)) {
            eps epsVar = euqVar.i;
            euz euzVar4 = euqVar.a;
            euz euzVar5 = (euz) woy.bH(listBk);
            if (euzVar5 != null && euzVar5.c() == euzVar4.c()) {
                eps epsVar2 = eps.e;
                if (epsVar != epsVar2) {
                    eur eurVar = (eur) this.l.get(this.k.a(euqVar.a.c));
                    Boolean boolValueOf = null;
                    if (eurVar != null && (set = (Set) eurVar.e.b()) != null) {
                        boolValueOf = Boolean.valueOf(set.contains(euqVar));
                    }
                    if (affa.f(boolValueOf, true) || ((erbVar = (erb) this.u.get(euqVar)) != null && ((AtomicInteger) erbVar.a).get() == 0)) {
                        map.put(euqVar, eps.d);
                    } else {
                        map.put(euqVar, epsVar2);
                    }
                }
                euz euzVar6 = (euz) woy.bH(arrayList);
                if (euzVar6 != null && euzVar6.c() == euzVar4.c()) {
                    woy.bt(arrayList);
                }
                woy.bt(listBk);
                eva evaVar = euzVar4.e;
                if (evaVar != null) {
                    listBk.add(evaVar);
                }
            } else if (arrayList.isEmpty() || euzVar4.c() != ((euz) woy.bF(arrayList)).c()) {
                euqVar.b(eps.c);
            } else {
                euz euzVar7 = (euz) woy.bt(arrayList);
                if (epsVar == eps.e) {
                    euqVar.b(eps.d);
                } else {
                    eps epsVar3 = eps.d;
                    if (epsVar != epsVar3) {
                        map.put(euqVar, epsVar3);
                    }
                }
                eva evaVar2 = euzVar7.e;
                if (evaVar2 != null && !arrayList.contains(evaVar2)) {
                    arrayList.add(evaVar2);
                }
            }
        }
        for (euq euqVar2 : listCh) {
            eps epsVar4 = (eps) map.get(euqVar2);
            if (epsVar4 != null) {
                euqVar2.b(epsVar4);
            } else {
                euqVar2.c();
            }
        }
    }

    public final boolean m() {
        afaz afazVar;
        while (true) {
            afazVar = this.e;
            if (afazVar.isEmpty() || !(((euq) afazVar.e()).a instanceof eva)) {
                break;
            }
            r(this, (euq) afazVar.e());
        }
        euq euqVar = (euq) afazVar.f();
        if (euqVar != null) {
            this.x.add(euqVar);
        }
        this.w++;
        l();
        int i = this.w - 1;
        this.w = i;
        if (i == 0) {
            List list = this.x;
            List<euq> listCh = woy.ch(list);
            list.clear();
            for (euq euqVar2 : listCh) {
                for (eus eusVar : woy.cf(this.v)) {
                    euz euzVar = euqVar2.a;
                    euqVar2.a();
                    eusVar.a();
                }
                this.y.c(euqVar2);
            }
            this.p.d(woy.ch(afazVar));
            this.q.d(g());
        }
        return euqVar != null;
    }

    public final boolean n(int i, boolean z, boolean z2) {
        euz euzVar;
        boolean z3;
        afaz afazVar = this.e;
        if (afazVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = woy.ca(afazVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                euzVar = null;
                break;
            }
            euz euzVar2 = ((euq) it.next()).a;
            evp evpVarA = this.k.a(euzVar2.c);
            if (z || euzVar2.c() != i) {
                arrayList.add(evpVarA);
            }
            if (euzVar2.c() == i) {
                euzVar = euzVar2;
                break;
            }
        }
        if (euzVar == null) {
            int i2 = euz.g;
            Log.i("NavController", "Ignoring popBackStack to destination " + ebf.K(u(), i) + " as it was not found on the current back stack");
            return false;
        }
        affq affqVar = new affq();
        afaz afazVar2 = new afaz();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = z2;
                break;
            }
            evp evpVar = (evp) it2.next();
            affq affqVar2 = new affq();
            euq euqVar = (euq) afazVar.e();
            z3 = z2;
            ewn ewnVar = new ewn(affqVar2, affqVar, this, z3, afazVar2, 0);
            evpVar.getClass();
            euqVar.getClass();
            this.n = ewnVar;
            evpVar.j(euqVar, z3);
            this.n = null;
            if (!affqVar2.a) {
                break;
            }
        }
        if (z3) {
            if (!z) {
                airz airzVar = new airz((aisb) afrg.t(afrg.f(euzVar, new ewc(4)), new ewm(this, 2)), 0);
                while (airzVar.hasNext()) {
                    euz euzVar3 = (euz) airzVar.next();
                    Map map = this.f;
                    Integer numValueOf = Integer.valueOf(euzVar3.c());
                    erb erbVar = (erb) afazVar2.c();
                    map.put(numValueOf, erbVar != null ? erbVar.F() : null);
                }
            }
            if (!afazVar2.isEmpty()) {
                erb erbVar2 = (erb) afazVar2.a();
                airz airzVar2 = new airz((aisb) afrg.t(afrg.f(d(erbVar2.D(), null), new ewc(5)), new ewm(this, 3)), 0);
                while (airzVar2.hasNext()) {
                    this.f.put(Integer.valueOf(((euz) airzVar2.next()).c()), erbVar2.F());
                }
                if (this.f.values().contains(erbVar2.F())) {
                    this.g.put(erbVar2.F(), afazVar2);
                }
            }
        }
        this.a.invoke();
        return affqVar.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.euz r25, android.os.Bundle r26, defpackage.eve r27) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewp.p(euz, android.os.Bundle, eve):void");
    }

    public final void q(evp evpVar, List list, eve eveVar, afec afecVar) {
        list.getClass();
        this.m = afecVar;
        evpVar.d(list, eveVar);
        this.m = null;
    }

    public final void s(euq euqVar) {
        euqVar.getClass();
        euq euqVar2 = (euq) this.t.remove(euqVar);
        if (euqVar2 == null) {
            return;
        }
        Map map = this.u;
        erb erbVar = (erb) map.get(euqVar2);
        Integer numValueOf = erbVar != null ? Integer.valueOf(((AtomicInteger) erbVar.a).decrementAndGet()) : null;
        if (numValueOf == null || numValueOf.intValue() != 0) {
            return;
        }
        eur eurVar = (eur) this.l.get(this.k.a(euqVar2.a.c));
        if (eurVar != null) {
            eurVar.c(euqVar2);
        }
        map.remove(euqVar2);
    }

    public final void t(int i, boolean z) {
        if (n(i, z, false)) {
            m();
        }
    }

    public final erb u() {
        return this.s.g;
    }
}
