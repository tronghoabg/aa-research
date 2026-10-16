package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ahyg implements agdi {
    protected ahyv components;
    private final ahzm finder;
    private final aieb<ahnf, agdc> fragments;
    private final agcu moduleDescriptor;
    private final aiei storageManager;

    public ahyg(aiei aieiVar, ahzm ahzmVar, agcu agcuVar) {
        aieiVar.getClass();
        ahzmVar.getClass();
        agcuVar.getClass();
        this.storageManager = aieiVar;
        this.finder = ahzmVar;
        this.moduleDescriptor = agcuVar;
        this.fragments = aieiVar.createMemoizedFunctionWithNullableValues(new ahyf(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agdc fragments$lambda$0(ahyg ahygVar, ahnf ahnfVar) {
        ahnfVar.getClass();
        ahza ahzaVarFindPackage = ahygVar.findPackage(ahnfVar);
        if (ahzaVarFindPackage == null) {
            return null;
        }
        ahzaVarFindPackage.initialize(ahygVar.getComponents());
        return ahzaVarFindPackage;
    }

    @Override // defpackage.agdi
    public void collectPackageFragments(ahnf ahnfVar, Collection<agdc> collection) {
        ahnfVar.getClass();
        collection.getClass();
        aiow.addIfNotNull(collection, this.fragments.invoke(ahnfVar));
    }

    protected abstract ahza findPackage(ahnf ahnfVar);

    protected final ahyv getComponents() {
        ahyv ahyvVar = this.components;
        if (ahyvVar != null) {
            return ahyvVar;
        }
        affa.d("components");
        return null;
    }

    protected final ahzm getFinder() {
        return this.finder;
    }

    protected final agcu getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    @Override // defpackage.agdd
    public List<agdc> getPackageFragments(ahnf ahnfVar) {
        ahnfVar.getClass();
        return woy.bj(this.fragments.invoke(ahnfVar));
    }

    protected final aiei getStorageManager() {
        return this.storageManager;
    }

    @Override // defpackage.agdd
    public Collection<ahnf> getSubPackagesOf(ahnf ahnfVar, afec<? super ahnj, Boolean> afecVar) {
        ahnfVar.getClass();
        afecVar.getClass();
        return afbg.a;
    }

    @Override // defpackage.agdi
    public boolean isEmpty(ahnf ahnfVar) {
        ahnfVar.getClass();
        return (this.fragments.isComputed(ahnfVar) ? (agdc) this.fragments.invoke(ahnfVar) : findPackage(ahnfVar)) == null;
    }

    protected final void setComponents(ahyv ahyvVar) {
        ahyvVar.getClass();
        this.components = ahyvVar;
    }
}
