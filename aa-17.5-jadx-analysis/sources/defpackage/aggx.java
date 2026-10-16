package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aggx implements agdi {
    private final String debugName;
    private final List<agdd> providers;

    /* JADX WARN: Multi-variable type inference failed */
    public aggx(List<? extends agdd> list, String str) {
        list.getClass();
        str.getClass();
        this.providers = list;
        this.debugName = str;
        list.size();
        woy.cl(list).size();
    }

    @Override // defpackage.agdi
    public void collectPackageFragments(ahnf ahnfVar, Collection<agdc> collection) {
        ahnfVar.getClass();
        collection.getClass();
        Iterator<agdd> it = this.providers.iterator();
        while (it.hasNext()) {
            agdh.collectPackageFragmentsOptimizedIfPossible(it.next(), ahnfVar, collection);
        }
    }

    @Override // defpackage.agdd
    public List<agdc> getPackageFragments(ahnf ahnfVar) {
        ahnfVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<agdd> it = this.providers.iterator();
        while (it.hasNext()) {
            agdh.collectPackageFragmentsOptimizedIfPossible(it.next(), ahnfVar, arrayList);
        }
        return woy.cf(arrayList);
    }

    @Override // defpackage.agdd
    public Collection<ahnf> getSubPackagesOf(ahnf ahnfVar, afec<? super ahnj, Boolean> afecVar) {
        ahnfVar.getClass();
        afecVar.getClass();
        HashSet hashSet = new HashSet();
        Iterator<agdd> it = this.providers.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().getSubPackagesOf(ahnfVar, afecVar));
        }
        return hashSet;
    }

    @Override // defpackage.agdi
    public boolean isEmpty(ahnf ahnfVar) {
        ahnfVar.getClass();
        List<agdd> list = this.providers;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!agdh.isEmpty((agdd) it.next(), ahnfVar)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return this.debugName;
    }
}
