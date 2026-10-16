package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agdg implements agdi {
    private final Collection<agdc> packageFragments;

    /* JADX WARN: Multi-variable type inference failed */
    public agdg(Collection<? extends agdc> collection) {
        collection.getClass();
        this.packageFragments = collection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnf getSubPackagesOf$lambda$0(agdc agdcVar) {
        agdcVar.getClass();
        return agdcVar.getFqName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSubPackagesOf$lambda$1(ahnf ahnfVar, ahnf ahnfVar2) {
        ahnfVar2.getClass();
        return !ahnfVar2.isRoot() && affa.f(ahnfVar2.parent(), ahnfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agdi
    public void collectPackageFragments(ahnf ahnfVar, Collection<agdc> collection) {
        ahnfVar.getClass();
        collection.getClass();
        for (Object obj : this.packageFragments) {
            if (affa.f(((agdc) obj).getFqName(), ahnfVar)) {
                collection.add(obj);
            }
        }
    }

    @Override // defpackage.agdd
    public List<agdc> getPackageFragments(ahnf ahnfVar) {
        ahnfVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.packageFragments) {
            if (affa.f(((agdc) obj).getFqName(), ahnfVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.agdd
    public Collection<ahnf> getSubPackagesOf(ahnf ahnfVar, afec<? super ahnj, Boolean> afecVar) {
        ahnfVar.getClass();
        afecVar.getClass();
        return afrg.j(afrg.l(afrg.q(woy.cm(this.packageFragments), agde.INSTANCE), new agdf(ahnfVar)));
    }

    @Override // defpackage.agdi
    public boolean isEmpty(ahnf ahnfVar) {
        ahnfVar.getClass();
        Collection<agdc> collection = this.packageFragments;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (affa.f(((agdc) it.next()).getFqName(), ahnfVar)) {
                return false;
            }
        }
        return true;
    }
}
