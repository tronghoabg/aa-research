package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tko extends defpackage.tkl {
    public boolean a;

    public tko(boolean z) {
        this.a = z;
    }

    @Override // defpackage.tkl
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        defpackage.uo uoVar = new defpackage.uo();
        uoVar.a = this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.k;
        for (java.lang.Object obj : list) {
            if (obj instanceof defpackage.tjk) {
                arrayList.add(obj);
            }
        }
        defpackage.tjk tjkVar = (defpackage.tjk) defpackage.afga.aJ(arrayList);
        if (tjkVar != null) {
            uoVar.d((androidx.car.app.model.Header) tjkVar.d());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (obj2 instanceof defpackage.tio) {
                arrayList2.add(obj2);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            uoVar.b((androidx.car.app.model.Action) ((defpackage.tio) it.next()).d());
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (obj3 instanceof defpackage.tjp) {
                arrayList3.add(obj3);
            }
        }
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((defpackage.tjp) it2.next()).c(uoVar);
        }
        return uoVar.a();
    }

    @Override // defpackage.tkl
    public final java.lang.String b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.k) {
            if (obj instanceof defpackage.tjk) {
                arrayList.add(obj);
            }
        }
        defpackage.tjk tjkVar = (defpackage.tjk) defpackage.afga.aJ(arrayList);
        return "List: isLoading " + this.a + (tjkVar != null ? ", header ".concat(tjkVar.b()) : "");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.tko) && this.a == ((defpackage.tko) obj).a;
    }

    public final int hashCode() {
        return defpackage.a.e(this.a);
    }

    public final java.lang.String toString() {
        return "ListNode(isLoading=" + this.a + ")";
    }

    public tko() {
        throw null;
    }
}
