package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class agdh {
    public static final void collectPackageFragmentsOptimizedIfPossible(agdd agddVar, ahnf ahnfVar, Collection<agdc> collection) {
        agddVar.getClass();
        ahnfVar.getClass();
        collection.getClass();
        if (agddVar instanceof agdi) {
            ((agdi) agddVar).collectPackageFragments(ahnfVar, collection);
        } else {
            collection.addAll(agddVar.getPackageFragments(ahnfVar));
        }
    }

    public static final boolean isEmpty(agdd agddVar, ahnf ahnfVar) {
        agddVar.getClass();
        ahnfVar.getClass();
        return agddVar instanceof agdi ? ((agdi) agddVar).isEmpty(ahnfVar) : packageFragments(agddVar, ahnfVar).isEmpty();
    }

    public static final List<agdc> packageFragments(agdd agddVar, ahnf ahnfVar) {
        agddVar.getClass();
        ahnfVar.getClass();
        ArrayList arrayList = new ArrayList();
        collectPackageFragmentsOptimizedIfPossible(agddVar, ahnfVar, arrayList);
        return arrayList;
    }
}
