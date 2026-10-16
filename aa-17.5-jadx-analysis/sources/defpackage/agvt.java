package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class agvt implements agdi {
    private final agvu c;
    private final aidd<ahnf, agxj> packageFragments;

    public agvt(agvl agvlVar) {
        agvlVar.getClass();
        agvu agvuVar = new agvu(agvlVar, agvz.INSTANCE, new aezo(null));
        this.c = agvuVar;
        this.packageFragments = agvuVar.getStorageManager().createCacheWithNotNullValues();
    }

    private final agxj getPackageFragment(ahnf ahnfVar) {
        agzu agzuVarFindPackage$default = agsk.findPackage$default(this.c.getComponents().getFinder(), ahnfVar, false, 2, null);
        if (agzuVarFindPackage$default == null) {
            return null;
        }
        return this.packageFragments.computeIfAbsent(ahnfVar, new agvs(this, agzuVarFindPackage$default));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agxj getPackageFragment$lambda$0(agvt agvtVar, agzu agzuVar) {
        return new agxj(agvtVar.c, agzuVar);
    }

    @Override // defpackage.agdi
    public void collectPackageFragments(ahnf ahnfVar, Collection<agdc> collection) {
        ahnfVar.getClass();
        collection.getClass();
        aiow.addIfNotNull(collection, getPackageFragment(ahnfVar));
    }

    @Override // defpackage.agdd
    public List<agxj> getPackageFragments(ahnf ahnfVar) {
        ahnfVar.getClass();
        return woy.bj(getPackageFragment(ahnfVar));
    }

    @Override // defpackage.agdd
    public List<ahnf> getSubPackagesOf(ahnf ahnfVar, afec<? super ahnj, Boolean> afecVar) {
        ahnfVar.getClass();
        afecVar.getClass();
        agxj packageFragment = getPackageFragment(ahnfVar);
        List<ahnf> subPackageFqNames$org_jetbrains_kotlin_descriptors_jvm = packageFragment != null ? packageFragment.getSubPackageFqNames$org_jetbrains_kotlin_descriptors_jvm() : null;
        return subPackageFqNames$org_jetbrains_kotlin_descriptors_jvm == null ? afbe.a : subPackageFqNames$org_jetbrains_kotlin_descriptors_jvm;
    }

    @Override // defpackage.agdi
    public boolean isEmpty(ahnf ahnfVar) {
        ahnfVar.getClass();
        return agsk.findPackage$default(this.c.getComponents().getFinder(), ahnfVar, false, 2, null) == null;
    }

    public String toString() {
        agcu module = this.c.getComponents().getModule();
        Objects.toString(module);
        return "LazyJavaPackageFragmentProvider of module ".concat(String.valueOf(module));
    }

    @Override // defpackage.agdd
    public /* bridge */ /* synthetic */ Collection getSubPackagesOf(ahnf ahnfVar, afec afecVar) {
        return getSubPackagesOf(ahnfVar, (afec<? super ahnj, Boolean>) afecVar);
    }
}
