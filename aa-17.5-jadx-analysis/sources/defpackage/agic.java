package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agic extends aggy implements agcu {
    private final afye builtIns;
    private final Map<agcs<?>, Object> capabilities;
    private aghy dependencies;
    private boolean isValid;
    private agdd packageFragmentProviderForModuleContent;
    private final aezr packageFragmentProviderForWholeModuleWithDependencies$delegate;
    private final agih packageViewDescriptorFactory;
    private final aiea<ahnf, agdj> packages;
    private final ahnq platform;
    private final ahnj stableName;
    private final aiei storageManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agic(ahnj ahnjVar, aiei aieiVar, afye afyeVar, ahnq ahnqVar, Map<agcs<?>, ? extends Object> map, ahnj ahnjVar2) {
        super(agfk.Companion.getEMPTY(), ahnjVar);
        ahnjVar.getClass();
        aieiVar.getClass();
        afyeVar.getClass();
        map.getClass();
        this.storageManager = aieiVar;
        this.builtIns = afyeVar;
        this.platform = ahnqVar;
        this.stableName = ahnjVar2;
        if (!ahnjVar.isSpecial()) {
            Objects.toString(ahnjVar);
            throw new IllegalArgumentException("Module name must be special: ".concat(ahnjVar.toString()));
        }
        this.capabilities = map;
        agih agihVar = (agih) getCapability(agih.Companion.getCAPABILITY());
        this.packageViewDescriptorFactory = agihVar == null ? agig.INSTANCE : agihVar;
        this.isValid = true;
        this.packages = aieiVar.createMemoizedFunction(new agia(this));
        this.packageFragmentProviderForWholeModuleWithDependencies$delegate = woy.dG(new agib(this));
    }

    private final String getId() {
        String string = getName().toString();
        string.getClass();
        return string;
    }

    private final aggx getPackageFragmentProviderForWholeModuleWithDependencies() {
        return (aggx) this.packageFragmentProviderForWholeModuleWithDependencies$delegate.a();
    }

    private final boolean isInitialized() {
        return this.packageFragmentProviderForModuleContent != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aggx packageFragmentProviderForWholeModuleWithDependencies_delegate$lambda$0(agic agicVar) {
        aghy aghyVar = agicVar.dependencies;
        if (aghyVar == null) {
            throw new AssertionError("Dependencies of module " + agicVar.getId() + " were not set before querying module content");
        }
        List<agic> allDependencies = aghyVar.getAllDependencies();
        agicVar.assertValid();
        allDependencies.contains(agicVar);
        Iterator<T> it = allDependencies.iterator();
        while (it.hasNext()) {
            ((agic) it.next()).isInitialized();
        }
        ArrayList arrayList = new ArrayList(woy.bp(allDependencies, 10));
        Iterator<T> it2 = allDependencies.iterator();
        while (it2.hasNext()) {
            agdd agddVar = ((agic) it2.next()).packageFragmentProviderForModuleContent;
            agddVar.getClass();
            arrayList.add(agddVar);
        }
        ahnj name = agicVar.getName();
        Objects.toString(name);
        return new aggx(arrayList, "CompositeProvider@ModuleDescriptor for ".concat(String.valueOf(name)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agdj packages$lambda$0(agic agicVar, ahnf ahnfVar) {
        ahnfVar.getClass();
        return agicVar.packageViewDescriptorFactory.compute(agicVar, ahnfVar, agicVar.storageManager);
    }

    @Override // defpackage.agbi
    public /* bridge */ <R, D> R accept(agbk<R, D> agbkVar, D d) {
        return (R) agct.accept(this, agbkVar, d);
    }

    public void assertValid() {
        if (isValid()) {
            return;
        }
        agcm.moduleInvalidated(this);
    }

    @Override // defpackage.agcu
    public afye getBuiltIns() {
        return this.builtIns;
    }

    @Override // defpackage.agcu
    public <T> T getCapability(agcs<T> agcsVar) {
        agcsVar.getClass();
        T t = (T) this.capabilities.get(agcsVar);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // defpackage.agbi
    public /* bridge */ agbi getContainingDeclaration() {
        return null;
    }

    @Override // defpackage.agcu
    public List<agcu> getExpectedByModules() {
        aghy aghyVar = this.dependencies;
        if (aghyVar != null) {
            return aghyVar.getDirectExpectedByDependencies();
        }
        throw new AssertionError("Dependencies of module " + getId() + " were not set");
    }

    @Override // defpackage.agcu
    public agdj getPackage(ahnf ahnfVar) {
        ahnfVar.getClass();
        assertValid();
        return this.packages.invoke(ahnfVar);
    }

    public final agdd getPackageFragmentProvider() {
        assertValid();
        return getPackageFragmentProviderForWholeModuleWithDependencies();
    }

    @Override // defpackage.agcu
    public Collection<ahnf> getSubPackagesOf(ahnf ahnfVar, afec<? super ahnj, Boolean> afecVar) {
        ahnfVar.getClass();
        afecVar.getClass();
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(ahnfVar, afecVar);
    }

    public final void initialize(agdd agddVar) {
        agddVar.getClass();
        this.packageFragmentProviderForModuleContent = agddVar;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public final void setDependencies(List<agic> list, Set<agic> set) {
        list.getClass();
        set.getClass();
        setDependencies(new aghz(list, set, afbe.a, afbg.a));
    }

    @Override // defpackage.agcu
    public boolean shouldSeeInternalsOf(agcu agcuVar) {
        agcuVar.getClass();
        if (affa.f(this, agcuVar)) {
            return true;
        }
        aghy aghyVar = this.dependencies;
        aghyVar.getClass();
        return woy.cn(aghyVar.getModulesWhoseInternalsAreVisible(), agcuVar) || getExpectedByModules().contains(agcuVar) || agcuVar.getExpectedByModules().contains(this);
    }

    @Override // defpackage.aggy
    public String toString() {
        Class<?> cls;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (!isValid()) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        agdd agddVar = this.packageFragmentProviderForModuleContent;
        String simpleName = null;
        if (agddVar != null && (cls = agddVar.getClass()) != null) {
            simpleName = cls.getSimpleName();
        }
        sb.append(simpleName);
        return sb.toString();
    }

    public final void setDependencies(List<agic> list) {
        list.getClass();
        setDependencies(list, afbg.a);
    }

    public final void setDependencies(aghy aghyVar) {
        aghyVar.getClass();
        this.dependencies = aghyVar;
    }

    public final void setDependencies(agic... agicVarArr) {
        agicVarArr.getClass();
        setDependencies(woy.df(agicVarArr));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agic(ahnj ahnjVar, aiei aieiVar, afye afyeVar, ahnq ahnqVar) {
        this(ahnjVar, aieiVar, afyeVar, ahnqVar, null, null, 48, null);
        ahnjVar.getClass();
        aieiVar.getClass();
        afyeVar.getClass();
    }

    public /* synthetic */ agic(ahnj ahnjVar, aiei aieiVar, afye afyeVar, ahnq ahnqVar, Map map, ahnj ahnjVar2, int i, afeu afeuVar) {
        this(ahnjVar, aieiVar, afyeVar, (i & 8) != 0 ? null : ahnqVar, (i & 16) != 0 ? afbf.a : map, (i & 32) != 0 ? null : ahnjVar2);
    }
}
