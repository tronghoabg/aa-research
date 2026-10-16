package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eqa {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public eqa(defpackage.epy epyVar, defpackage.epx epxVar, epm epmVar, aiwg aiwgVar) {
        epyVar.getClass();
        this.a = epyVar;
        this.d = epxVar;
        this.b = epmVar;
        defpackage.epz epzVar = new defpackage.epz(this, aiwgVar, 0);
        this.c = epzVar;
        if (((defpackage.eqi) epyVar).e != defpackage.epx.a) {
            epyVar.c(epzVar);
        } else {
            aiwgVar.s((java.util.concurrent.CancellationException) null);
            a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [eqf, java.lang.Object] */
    public final void a() {
        ((defpackage.epy) this.a).d(this.c);
        epm epmVar = (epm) this.b;
        epmVar.b = true;
        epmVar.a();
    }

    public final java.util.ArrayList b(java.lang.Object obj) {
        return (java.util.ArrayList) ((defpackage.aba) this.d).get(obj);
    }

    public final void c(java.lang.Object obj) {
        defpackage.aba abaVar = (defpackage.aba) this.d;
        if (abaVar.containsKey(obj)) {
            return;
        }
        abaVar.put(obj, null);
    }

    public final void d(java.lang.Object obj, java.util.ArrayList arrayList, java.util.HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new java.lang.RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) ((defpackage.aba) this.d).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                d(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public eqa(elt eltVar, elt eltVar2, java.lang.Object obj) {
        this.b = eltVar;
        this.a = "";
        this.d = eltVar2;
        this.c = obj;
    }

    public eqa() {
        this.b = new defpackage.dzs(10);
        this.d = new defpackage.aba(0);
        this.a = new java.util.ArrayList();
        this.c = new java.util.HashSet();
    }

    public eqa(defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.dns dnsVar, defpackage.affg affgVar) {
        this.a = aferVar;
        this.d = cgfVar;
        this.b = dnsVar;
        this.c = affgVar;
    }
}
