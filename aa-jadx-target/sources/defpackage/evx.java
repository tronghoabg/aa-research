package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class evx {
    public boolean c;
    public final ajay d;
    public final ajay e;
    public final ajba f;
    public final ajba g;
    public final defpackage.ebs h = new defpackage.ebs();

    public evx() {
        ajba ajbaVar = new ajba(defpackage.afce.a);
        this.f = ajbaVar;
        ajba ajbaVar2 = new ajba(defpackage.afcg.a);
        this.g = ajbaVar2;
        this.d = new ajak(ajbaVar, (aiwg) null);
        this.e = new ajak(ajbaVar2, (aiwg) null);
    }

    public abstract defpackage.euw a(defpackage.evf evfVar, android.os.Bundle bundle);

    public void c(defpackage.euw euwVar) {
        throw null;
    }

    public void d(defpackage.euw euwVar, boolean z) {
        throw null;
    }

    public void e(defpackage.euw euwVar) {
        throw null;
    }

    public final void f(defpackage.euw euwVar) {
        int iNextIndex;
        synchronized (this.h) {
            java.util.List listBb = defpackage.afga.bb((java.util.Collection) this.d.b());
            java.util.ListIterator listIterator = listBb.listIterator(listBb.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (defpackage.afga.f(((defpackage.euw) listIterator.previous()).c, euwVar.c)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            listBb.set(iNextIndex, euwVar);
            this.f.d(listBb);
        }
    }

    public final void g(defpackage.euw euwVar, boolean z) {
        java.lang.Object objPrevious;
        ajba ajbaVar = this.g;
        java.lang.Iterable iterable = (java.lang.Iterable) ajbaVar.b();
        if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((defpackage.euw) it.next()) == euwVar) {
                    java.lang.Iterable iterable2 = (java.lang.Iterable) this.d.b();
                    if ((iterable2 instanceof java.util.Collection) && ((java.util.Collection) iterable2).isEmpty()) {
                        return;
                    }
                    java.util.Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((defpackage.euw) it2.next()) == euwVar) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        ajbaVar.d(defpackage.afga.N((java.util.Set) ajbaVar.b(), euwVar));
        ajay ajayVar = this.d;
        java.util.List list = (java.util.List) ajayVar.b();
        java.util.ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            defpackage.euw euwVar2 = (defpackage.euw) objPrevious;
            if (!defpackage.afga.f(euwVar2, euwVar) && ((java.util.List) ajayVar.b()).lastIndexOf(euwVar2) < ((java.util.List) ajayVar.b()).lastIndexOf(euwVar)) {
                break;
            }
        }
        defpackage.euw euwVar3 = (defpackage.euw) objPrevious;
        if (euwVar3 != null) {
            ajbaVar.d(defpackage.afga.N((java.util.Set) ajbaVar.b(), euwVar3));
        }
        d(euwVar, z);
    }

    public final void h(defpackage.euw euwVar) {
        euwVar.getClass();
        ajba ajbaVar = this.g;
        java.lang.Iterable iterable = (java.lang.Iterable) ajbaVar.b();
        if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((defpackage.euw) it.next()) == euwVar) {
                    java.lang.Iterable iterable2 = (java.lang.Iterable) this.d.b();
                    if (!(iterable2 instanceof java.util.Collection) || !((java.util.Collection) iterable2).isEmpty()) {
                        java.util.Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((defpackage.euw) it2.next()) == euwVar) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        defpackage.euw euwVar2 = (defpackage.euw) defpackage.afga.aF((java.util.List) this.d.b());
        if (euwVar2 != null) {
            ajbaVar.d(defpackage.afga.N((java.util.Set) ajbaVar.b(), euwVar2));
        }
        ajbaVar.d(defpackage.afga.N((java.util.Set) ajbaVar.b(), euwVar));
        e(euwVar);
    }
}
