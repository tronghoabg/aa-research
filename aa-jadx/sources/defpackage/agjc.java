package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agjc extends defpackage.aghy implements defpackage.agdu {
    private final defpackage.afze builtIns;
    private final java.util.Map<defpackage.agds<?>, java.lang.Object> capabilities;
    private defpackage.agiy dependencies;
    private boolean isValid;
    private defpackage.aged packageFragmentProviderForModuleContent;
    private final defpackage.afar packageFragmentProviderForWholeModuleWithDependencies$delegate;
    private final defpackage.agjh packageViewDescriptorFactory;
    private final defpackage.aifa<defpackage.ahof, defpackage.agej> packages;
    private final defpackage.ahoq platform;
    private final defpackage.ahoj stableName;
    private final defpackage.aifi storageManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agjc(defpackage.ahoj ahojVar, defpackage.aifi aifiVar, defpackage.afze afzeVar, defpackage.ahoq ahoqVar, java.util.Map<defpackage.agds<?>, ? extends java.lang.Object> map, defpackage.ahoj ahojVar2) {
        super(defpackage.aggk.Companion.getEMPTY(), ahojVar);
        ahojVar.getClass();
        aifiVar.getClass();
        afzeVar.getClass();
        map.getClass();
        this.storageManager = aifiVar;
        this.builtIns = afzeVar;
        this.platform = ahoqVar;
        this.stableName = ahojVar2;
        if (!ahojVar.isSpecial()) {
            java.util.Objects.toString(ahojVar);
            throw new java.lang.IllegalArgumentException("Module name must be special: ".concat(ahojVar.toString()));
        }
        this.capabilities = map;
        defpackage.agjh agjhVar = (defpackage.agjh) getCapability(defpackage.agjh.Companion.getCAPABILITY());
        this.packageViewDescriptorFactory = agjhVar == null ? defpackage.agjg.INSTANCE : agjhVar;
        this.isValid = true;
        this.packages = aifiVar.createMemoizedFunction(new defpackage.agja(this));
        this.packageFragmentProviderForWholeModuleWithDependencies$delegate = defpackage.afga.cA(new defpackage.agjb(this));
    }

    private final java.lang.String getId() {
        java.lang.String string = getName().toString();
        string.getClass();
        return string;
    }

    private final defpackage.aghx getPackageFragmentProviderForWholeModuleWithDependencies() {
        return (defpackage.aghx) this.packageFragmentProviderForWholeModuleWithDependencies$delegate.a();
    }

    private final boolean isInitialized() {
        return this.packageFragmentProviderForModuleContent != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aghx packageFragmentProviderForWholeModuleWithDependencies_delegate$lambda$0(defpackage.agjc agjcVar) {
        defpackage.agiy agiyVar = agjcVar.dependencies;
        if (agiyVar == null) {
            throw new java.lang.AssertionError("Dependencies of module " + agjcVar.getId() + " were not set before querying module content");
        }
        java.util.List<defpackage.agjc> allDependencies = agiyVar.getAllDependencies();
        agjcVar.assertValid();
        allDependencies.contains(agjcVar);
        java.util.Iterator<T> it = allDependencies.iterator();
        while (it.hasNext()) {
            ((defpackage.agjc) it.next()).isInitialized();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(allDependencies, 10));
        java.util.Iterator<T> it2 = allDependencies.iterator();
        while (it2.hasNext()) {
            defpackage.aged agedVar = ((defpackage.agjc) it2.next()).packageFragmentProviderForModuleContent;
            agedVar.getClass();
            arrayList.add(agedVar);
        }
        defpackage.ahoj name = agjcVar.getName();
        java.util.Objects.toString(name);
        return new defpackage.aghx(arrayList, "CompositeProvider@ModuleDescriptor for ".concat(java.lang.String.valueOf(name)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.agej packages$lambda$0(defpackage.agjc agjcVar, defpackage.ahof ahofVar) {
        ahofVar.getClass();
        return agjcVar.packageViewDescriptorFactory.compute(agjcVar, ahofVar, agjcVar.storageManager);
    }

    @Override // defpackage.agci
    public /* bridge */ <R, D> R accept(defpackage.agck<R, D> agckVar, D d) {
        return (R) defpackage.agdt.accept(this, agckVar, d);
    }

    public void assertValid() {
        if (isValid()) {
            return;
        }
        defpackage.agdm.moduleInvalidated(this);
    }

    @Override // defpackage.agdu
    public defpackage.afze getBuiltIns() {
        return this.builtIns;
    }

    @Override // defpackage.agdu
    public <T> T getCapability(defpackage.agds<T> agdsVar) {
        agdsVar.getClass();
        T t = (T) this.capabilities.get(agdsVar);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // defpackage.agci
    public /* bridge */ defpackage.agci getContainingDeclaration() {
        return null;
    }

    @Override // defpackage.agdu
    public java.util.List<defpackage.agdu> getExpectedByModules() {
        defpackage.agiy agiyVar = this.dependencies;
        if (agiyVar != null) {
            return agiyVar.getDirectExpectedByDependencies();
        }
        throw new java.lang.AssertionError("Dependencies of module " + getId() + " were not set");
    }

    @Override // defpackage.agdu
    public defpackage.agej getPackage(defpackage.ahof ahofVar) {
        ahofVar.getClass();
        assertValid();
        return this.packages.invoke(ahofVar);
    }

    public final defpackage.aged getPackageFragmentProvider() {
        assertValid();
        return getPackageFragmentProviderForWholeModuleWithDependencies();
    }

    @Override // defpackage.agdu
    public java.util.Collection<defpackage.ahof> getSubPackagesOf(defpackage.ahof ahofVar, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar) {
        ahofVar.getClass();
        affcVar.getClass();
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(ahofVar, affcVar);
    }

    public final void initialize(defpackage.aged agedVar) {
        agedVar.getClass();
        this.packageFragmentProviderForModuleContent = agedVar;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public final void setDependencies(java.util.List<defpackage.agjc> list, java.util.Set<defpackage.agjc> set) {
        list.getClass();
        set.getClass();
        setDependencies(new defpackage.agiz(list, set, defpackage.afce.a, defpackage.afcg.a));
    }

    @Override // defpackage.agdu
    public boolean shouldSeeInternalsOf(defpackage.agdu agduVar) {
        agduVar.getClass();
        if (defpackage.afga.f(this, agduVar)) {
            return true;
        }
        defpackage.agiy agiyVar = this.dependencies;
        agiyVar.getClass();
        return defpackage.afga.bh(agiyVar.getModulesWhoseInternalsAreVisible(), agduVar) || getExpectedByModules().contains(agduVar) || agduVar.getExpectedByModules().contains(this);
    }

    @Override // defpackage.aghy
    public java.lang.String toString() {
        java.lang.Class<?> cls;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        if (!isValid()) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        defpackage.aged agedVar = this.packageFragmentProviderForModuleContent;
        java.lang.String simpleName = null;
        if (agedVar != null && (cls = agedVar.getClass()) != null) {
            simpleName = cls.getSimpleName();
        }
        sb.append(simpleName);
        return sb.toString();
    }

    public final void setDependencies(java.util.List<defpackage.agjc> list) {
        list.getClass();
        setDependencies(list, defpackage.afcg.a);
    }

    public final void setDependencies(defpackage.agiy agiyVar) {
        agiyVar.getClass();
        this.dependencies = agiyVar;
    }

    public final void setDependencies(defpackage.agjc... agjcVarArr) {
        agjcVarArr.getClass();
        setDependencies(defpackage.afga.bZ(agjcVarArr));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agjc(defpackage.ahoj ahojVar, defpackage.aifi aifiVar, defpackage.afze afzeVar, defpackage.ahoq ahoqVar) {
        this(ahojVar, aifiVar, afzeVar, ahoqVar, null, null, 48, null);
        ahojVar.getClass();
        aifiVar.getClass();
        afzeVar.getClass();
    }

    public /* synthetic */ agjc(defpackage.ahoj ahojVar, defpackage.aifi aifiVar, defpackage.afze afzeVar, defpackage.ahoq ahoqVar, java.util.Map map, defpackage.ahoj ahojVar2, int i, defpackage.affu affuVar) {
        this(ahojVar, aifiVar, afzeVar, (i & 8) != 0 ? null : ahoqVar, (i & 16) != 0 ? defpackage.afcf.a : map, (i & 32) != 0 ? null : ahojVar2);
    }
}
