package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class admg {
    private static admg e;
    public final Object a;
    public int b;
    public final Object c;
    public Object d;

    public admg() {
        this.a = new Object();
        this.c = new HashSet();
        this.d = new admy[5];
    }

    public static synchronized admg a() {
        admg admgVar;
        admgVar = e;
        if (admgVar == null) {
            admgVar = new admg();
            e = admgVar;
        }
        return admgVar;
    }

    public final void b() {
        Object obj = this.d;
        this.d = (admy[]) Arrays.copyOf((Object[]) obj, ((admy[]) obj).length + 5);
    }

    public final void c() {
        synchronized (this.a) {
            DesugarCollections.unmodifiableList(Arrays.asList((admy[]) Arrays.copyOfRange((Object[]) this.d, 0, this.b)));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final admy d(String str, List list, List list2) {
        admy admyVar;
        woy.O(!woy.am(str), "missing metric name");
        synchronized (this.a) {
            ?? r1 = this.c;
            if (r1.contains(str)) {
                throw new IllegalStateException(a.bq(str, "Metric with name ", " already exists"));
            }
            int i = this.b;
            if (i + 1 == ((admy[]) this.d).length) {
                b();
            }
            admyVar = new admy(i, str, list, list2);
            ((admy[]) this.d)[i] = admyVar;
            r1.add(str);
            this.b++;
        }
        return admyVar;
    }

    public final euz e(int i, euz euzVar, boolean z, euz euzVar2) {
        euz euzVarM;
        aau aauVar = (aau) this.a;
        euz euzVar3 = (euz) aav.a(aauVar, i);
        if (euzVar2 == null ? euzVar3 != null : affa.f(euzVar3, euzVar2) && affa.f(euzVar3.e, euzVar2.e)) {
            return euzVar3;
        }
        if (z) {
            Iterator itA = afrg.b(ca.ac(aauVar)).a();
            while (itA.hasNext()) {
                euz euzVar4 = (euz) itA.next();
                euzVarM = (!(euzVar4 instanceof eva) || affa.f(euzVar4, euzVar)) ? null : ((eva) euzVar4).m(i, (euz) this.c, true, euzVar2);
                if (euzVarM != null) {
                    break;
                }
            }
            euzVarM = null;
        } else {
            euzVarM = null;
        }
        if (euzVarM != null) {
            return euzVarM;
        }
        euz euzVar5 = (euz) this.c;
        eva evaVar = euzVar5.e;
        if (evaVar == null || affa.f(evaVar, euzVar)) {
            return null;
        }
        eva evaVar2 = euzVar5.e;
        evaVar2.getClass();
        return evaVar2.m(i, euzVar5, z, euzVar2);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object] */
    public final euy f(euy euyVar, eux euxVar, boolean z, euz euzVar) {
        euy euyVarP;
        ArrayList arrayList = new ArrayList();
        ?? r5 = this.c;
        Iterator it = r5.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            euz euzVar2 = (euz) it.next();
            euyVarP = affa.f(euzVar2, euzVar) ? null : euzVar2.f(euxVar);
            if (euyVarP != null) {
                arrayList.add(euyVarP);
            }
        }
        euy euyVar2 = (euy) woy.bz(arrayList);
        euz euzVar3 = (euz) r5;
        eva evaVar = euzVar3.e;
        if (evaVar != null && z && !affa.f(evaVar, euzVar)) {
            euyVarP = evaVar.p(euxVar, euzVar3);
        }
        return (euy) woy.bz(woy.da(new euy[]{euyVar, euyVar2, euyVarP}));
    }

    public admg(eva evaVar) {
        this.c = evaVar;
        this.a = new aau(null);
    }
}
