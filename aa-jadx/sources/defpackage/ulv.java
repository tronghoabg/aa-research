package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ulv implements defpackage.tre {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public ulv(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.tre
    public final void a(defpackage.utu utuVar, defpackage.ukf ukfVar) {
        if (this.b == 0) {
            defpackage.vbq vbqVar = defpackage.uqy.c;
            java.lang.Object obj = this.a;
            defpackage.ulx ulxVar = ((defpackage.ulw) obj).c;
            synchronized (ulxVar.b) {
                java.util.List list = ((defpackage.ulw) obj).a;
                list.clear();
                list.addAll(ulxVar.c.entrySet());
            }
            defpackage.ulw ulwVar = (defpackage.ulw) this.a;
            java.util.List list2 = ulwVar.a;
            defpackage.yha yhaVarH = defpackage.yhe.h(list2.size());
            java.util.Iterator it = list2.iterator();
            if (it.hasNext()) {
                throw null;
            }
            yhaVarH.d(false);
            defpackage.rif rifVar = ulwVar.c.g;
            rifVar.a.clear();
            rifVar.c.clear();
            rifVar.b.clear();
            java.util.Collections.sort(list2, defpackage.ulx.a);
            new defpackage.utu(defpackage.tuj.b(defpackage.tuj.a(utuVar.o())), utuVar.k(), utuVar.j(), utuVar.f());
            java.util.Iterator it2 = list2.iterator();
            if (it2.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                throw null;
            }
            return;
        }
        java.lang.Object obj2 = this.a;
        defpackage.txw txwVar = (defpackage.txw) obj2;
        boolean z = txwVar.f.getAndSet(false) || ukfVar != txwVar.h.j;
        txwVar.h.j = ukfVar;
        synchronized (txwVar.a) {
            java.util.List list3 = ((defpackage.txw) obj2).c;
            list3.clear();
            java.util.List list4 = ((defpackage.txw) obj2).b;
            list3.addAll(list4);
            list4.clear();
            java.util.List list5 = ((defpackage.txw) obj2).d;
            ((defpackage.txw) obj2).d = ((defpackage.txw) obj2).e;
            ((defpackage.txw) obj2).e = list5;
            ((defpackage.txw) obj2).d.clear();
        }
        java.lang.Object obj3 = this.a;
        defpackage.txw txwVar2 = (defpackage.txw) obj3;
        java.util.Iterator it3 = txwVar2.c.iterator();
        while (it3.hasNext()) {
            ((java.lang.Runnable) it3.next()).run();
        }
        int size = txwVar2.e.size();
        while (true) {
            size--;
            if (size < 0) {
                synchronized (txwVar2.a) {
                    ((defpackage.txw) obj3).e.addAll(((defpackage.txw) obj3).d);
                    java.util.List list6 = ((defpackage.txw) obj3).d;
                    ((defpackage.txw) obj3).d = ((defpackage.txw) obj3).e;
                    ((defpackage.txw) obj3).e = list6;
                    ((defpackage.txw) obj3).e.clear();
                }
                return;
            }
            if (((defpackage.twr) txwVar2.e.get(size)).d()) {
                txwVar2.e.remove(size);
            } else if (z) {
                defpackage.twr twrVar = (defpackage.twr) txwVar2.e.get(size);
                defpackage.tyb tybVar = txwVar2.h;
                tybVar.e.getClass();
                defpackage.ufq ufqVar = tybVar.i;
                twrVar.t();
            }
        }
    }
}
