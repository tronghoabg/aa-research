package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hns extends defpackage.hnq {
    public hns(defpackage.hnt hntVar) {
        super(hntVar);
    }

    @Override // defpackage.hnq
    public final java.util.Collection a() {
        java.lang.Iterable originHints;
        java.util.List listB = b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listB.iterator();
        while (it.hasNext()) {
            android.service.personalcontext.insight.ContextInsight contextInsight = ((defpackage.hqn) it.next()).a;
            if (contextInsight == null || (originHints = contextInsight.getOriginHints()) == null) {
                originHints = defpackage.afcg.a;
            }
            defpackage.afga.bk(arrayList, originHints);
        }
        return defpackage.afga.bf(arrayList);
    }

    public abstract java.util.List b();
}
