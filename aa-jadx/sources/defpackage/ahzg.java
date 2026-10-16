package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahzg implements defpackage.agei {
    protected defpackage.ahzv components;
    private final defpackage.aiam finder;
    private final defpackage.aifb<defpackage.ahof, defpackage.agec> fragments;
    private final defpackage.agdu moduleDescriptor;
    private final defpackage.aifi storageManager;

    public ahzg(defpackage.aifi aifiVar, defpackage.aiam aiamVar, defpackage.agdu agduVar) {
        aifiVar.getClass();
        aiamVar.getClass();
        agduVar.getClass();
        this.storageManager = aifiVar;
        this.finder = aiamVar;
        this.moduleDescriptor = agduVar;
        this.fragments = aifiVar.createMemoizedFunctionWithNullableValues(new defpackage.ahzf(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.agec fragments$lambda$0(defpackage.ahzg ahzgVar, defpackage.ahof ahofVar) {
        ahofVar.getClass();
        defpackage.aiaa aiaaVarFindPackage = ahzgVar.findPackage(ahofVar);
        if (aiaaVarFindPackage == null) {
            return null;
        }
        aiaaVarFindPackage.initialize(ahzgVar.getComponents());
        return aiaaVarFindPackage;
    }

    @Override // defpackage.agei
    public void collectPackageFragments(defpackage.ahof ahofVar, java.util.Collection<defpackage.agec> collection) {
        ahofVar.getClass();
        collection.getClass();
        defpackage.aipw.addIfNotNull(collection, this.fragments.invoke(ahofVar));
    }

    protected abstract defpackage.aiaa findPackage(defpackage.ahof ahofVar);

    protected final defpackage.ahzv getComponents() {
        defpackage.ahzv ahzvVar = this.components;
        if (ahzvVar != null) {
            return ahzvVar;
        }
        defpackage.afga.d("components");
        return null;
    }

    protected final defpackage.aiam getFinder() {
        return this.finder;
    }

    protected final defpackage.agdu getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    @Override // defpackage.aged
    public java.util.List<defpackage.agec> getPackageFragments(defpackage.ahof ahofVar) {
        ahofVar.getClass();
        return defpackage.afga.ad(this.fragments.invoke(ahofVar));
    }

    protected final defpackage.aifi getStorageManager() {
        return this.storageManager;
    }

    @Override // defpackage.aged
    public java.util.Collection<defpackage.ahof> getSubPackagesOf(defpackage.ahof ahofVar, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar) {
        ahofVar.getClass();
        affcVar.getClass();
        return defpackage.afcg.a;
    }

    @Override // defpackage.agei
    public boolean isEmpty(defpackage.ahof ahofVar) {
        ahofVar.getClass();
        return (this.fragments.isComputed(ahofVar) ? (defpackage.agec) this.fragments.invoke(ahofVar) : findPackage(ahofVar)) == null;
    }

    protected final void setComponents(defpackage.ahzv ahzvVar) {
        ahzvVar.getClass();
        this.components = ahzvVar;
    }
}
