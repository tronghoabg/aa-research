package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adnh {
    private static defpackage.adnh e;
    public final java.lang.Object a;
    public int b;
    public final java.lang.Object c;
    public java.lang.Object d;

    public adnh() {
        this.a = new java.lang.Object();
        this.c = new java.util.HashSet();
        this.d = new defpackage.adnz[5];
    }

    public static synchronized defpackage.adnh a() {
        defpackage.adnh adnhVar;
        adnhVar = e;
        if (adnhVar == null) {
            adnhVar = new defpackage.adnh();
            e = adnhVar;
        }
        return adnhVar;
    }

    public final void b() {
        java.lang.Object obj = this.d;
        this.d = (defpackage.adnz[]) java.util.Arrays.copyOf((java.lang.Object[]) obj, ((defpackage.adnz[]) obj).length + 5);
    }

    public final void c() {
        synchronized (this.a) {
            j$.util.DesugarCollections.unmodifiableList(java.util.Arrays.asList((defpackage.adnz[]) java.util.Arrays.copyOfRange((java.lang.Object[]) this.d, 0, this.b)));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final defpackage.adnz d(java.lang.String str, java.util.List list, java.util.List list2) {
        defpackage.adnz adnzVar;
        defpackage.ysr.aY(!defpackage.ysr.bw(str), "missing metric name");
        synchronized (this.a) {
            ?? r1 = this.c;
            if (r1.contains(str)) {
                throw new java.lang.IllegalStateException(defpackage.a.bp(str, "Metric with name ", " already exists"));
            }
            int i = this.b;
            if (i + 1 == ((defpackage.adnz[]) this.d).length) {
                b();
            }
            adnzVar = new defpackage.adnz(i, str, list, list2);
            ((defpackage.adnz[]) this.d)[i] = adnzVar;
            r1.add(str);
            this.b++;
        }
        return adnzVar;
    }

    public final defpackage.evf e(int i, defpackage.evf evfVar, boolean z, defpackage.evf evfVar2) {
        defpackage.evf evfVarM;
        defpackage.abb abbVar = (defpackage.abb) this.a;
        defpackage.evf evfVar3 = (defpackage.evf) defpackage.abc.a(abbVar, i);
        if (evfVar2 == null ? evfVar3 != null : defpackage.afga.f(evfVar3, evfVar2) && defpackage.afga.f(evfVar3.e, evfVar2.e)) {
            return evfVar3;
        }
        if (!z) {
            evfVarM = null;
            break;
        }
        java.util.Iterator itA = afsg.b(defpackage.ca.ac(abbVar)).a();
        do {
            if (!itA.hasNext()) {
                evfVarM = null;
                break;
            }
            defpackage.evf evfVar4 = (defpackage.evf) itA.next();
            evfVarM = (!(evfVar4 instanceof defpackage.evg) || defpackage.afga.f(evfVar4, evfVar)) ? null : ((defpackage.evg) evfVar4).m(i, (defpackage.evf) this.c, true, evfVar2);
        } while (evfVarM == null);
        if (evfVarM != null) {
            return evfVarM;
        }
        defpackage.evf evfVar5 = (defpackage.evf) this.c;
        defpackage.evg evgVar = evfVar5.e;
        if (evgVar == null || defpackage.afga.f(evgVar, evfVar)) {
            return null;
        }
        defpackage.evg evgVar2 = evfVar5.e;
        evgVar2.getClass();
        return evgVar2.m(i, evfVar5, z, evfVar2);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object] */
    public final defpackage.eve f(defpackage.eve eveVar, defpackage.evd evdVar, boolean z, defpackage.evf evfVar) {
        defpackage.eve eveVarP;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ?? r5 = this.c;
        java.util.Iterator it = r5.iterator();
        while (true) {
            eveVarP = null;
            if (!it.hasNext()) {
                break;
            }
            defpackage.evf evfVar2 = (defpackage.evf) it.next();
            eveVarP = defpackage.afga.f(evfVar2, evfVar) ? null : evfVar2.f(evdVar);
            if (eveVarP != null) {
                arrayList.add(eveVarP);
            }
        }
        defpackage.eve eveVar2 = (defpackage.eve) defpackage.afga.at(arrayList);
        defpackage.evf evfVar3 = (defpackage.evf) r5;
        defpackage.evg evgVar = evfVar3.e;
        if (evgVar != null && z && !defpackage.afga.f(evgVar, evfVar)) {
            eveVarP = evgVar.p(evdVar, evfVar3);
        }
        return (defpackage.eve) defpackage.afga.at(defpackage.afga.bU(new defpackage.eve[]{eveVar, eveVar2, eveVarP}));
    }

    public adnh(defpackage.evg evgVar) {
        this.c = evgVar;
        this.a = new defpackage.abb(null);
    }
}
