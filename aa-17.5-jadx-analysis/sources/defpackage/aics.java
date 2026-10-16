package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class aics extends ahxf {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(aics.class, "classNames", "getClassNames$org_jetbrains_kotlin_deserialization()Ljava/util/Set;", 0), new affn(aics.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};
    private final ahyy c;
    private final aiec classNames$delegate;
    private final aied classifierNamesLazy$delegate;
    private final aibz impl;

    protected aics(ahyy ahyyVar, List<ahif> list, List<ahis> list2, List<ahjq> list3, afdr<? extends Collection<ahnj>> afdrVar) {
        ahyyVar.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        afdrVar.getClass();
        this.c = ahyyVar;
        this.impl = createImplementation(list, list2, list3);
        this.classNames$delegate = ahyyVar.getStorageManager().createLazyValue(new aibx(afdrVar));
        this.classifierNamesLazy$delegate = ahyyVar.getStorageManager().createNullableLazyValue(new aiby(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set classNames_delegate$lambda$0(afdr afdrVar) {
        return woy.cl((Iterable) afdrVar.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set classifierNamesLazy_delegate$lambda$0(aics aicsVar) {
        Set<ahnj> nonDeclaredClassifierNames = aicsVar.getNonDeclaredClassifierNames();
        if (nonDeclaredClassifierNames == null) {
            return null;
        }
        return woy.aS(woy.aS(aicsVar.getClassNames$org_jetbrains_kotlin_deserialization(), aicsVar.impl.getTypeAliasNames()), nonDeclaredClassifierNames);
    }

    private final aibz createImplementation(List<ahif> list, List<ahis> list2, List<ahjq> list3) {
        return this.c.getComponents().getConfiguration().getPreserveDeclarationsOrdering() ? new aick(this, list, list2, list3) : new aicr(this, list, list2, list3);
    }

    private final agba deserializeClass(ahnj ahnjVar) {
        return this.c.getComponents().deserializeClass(createClassId(ahnjVar));
    }

    private final Set<ahnj> getClassifierNamesLazy() {
        return (Set) aieh.getValue(this.classifierNamesLazy$delegate, this, $$delegatedProperties[1]);
    }

    private final aged getTypeAliasByName(ahnj ahnjVar) {
        return this.impl.getTypeAliasByName(ahnjVar);
    }

    protected abstract void addEnumEntryDescriptors(Collection<agbi> collection, afec<? super ahnj, Boolean> afecVar);

    protected final Collection<agbi> computeDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar, aglo agloVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        agloVar.getClass();
        ArrayList arrayList = new ArrayList(0);
        if (ahwtVar.acceptsKinds(ahwt.Companion.getSINGLETON_CLASSIFIERS_MASK())) {
            addEnumEntryDescriptors(arrayList, afecVar);
        }
        this.impl.addFunctionsAndPropertiesTo(arrayList, ahwtVar, afecVar, agloVar);
        if (ahwtVar.acceptsKinds(ahwt.Companion.getCLASSIFIERS_MASK())) {
            for (ahnj ahnjVar : getClassNames$org_jetbrains_kotlin_deserialization()) {
                if (afecVar.invoke(ahnjVar).booleanValue()) {
                    aiow.addIfNotNull(arrayList, deserializeClass(ahnjVar));
                }
            }
        }
        if (ahwtVar.acceptsKinds(ahwt.Companion.getTYPE_ALIASES_MASK())) {
            for (ahnj ahnjVar2 : this.impl.getTypeAliasNames()) {
                if (afecVar.invoke(ahnjVar2).booleanValue()) {
                    aiow.addIfNotNull(arrayList, this.impl.getTypeAliasByName(ahnjVar2));
                }
            }
        }
        return aiow.compact(arrayList);
    }

    protected void computeNonDeclaredFunctions(ahnj ahnjVar, List<agdv> list) {
        ahnjVar.getClass();
        list.getClass();
    }

    protected void computeNonDeclaredProperties(ahnj ahnjVar, List<agdn> list) {
        ahnjVar.getClass();
        list.getClass();
    }

    protected abstract ahnd createClassId(ahnj ahnjVar);

    public final ahyy getC() {
        return this.c;
    }

    public final Set<ahnj> getClassNames$org_jetbrains_kotlin_deserialization() {
        return (Set) aieh.getValue(this.classNames$delegate, this, $$delegatedProperties[0]);
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Set<ahnj> getClassifierNames() {
        return getClassifierNamesLazy();
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        if (hasClass(ahnjVar)) {
            return deserializeClass(ahnjVar);
        }
        if (this.impl.getTypeAliasNames().contains(ahnjVar)) {
            return getTypeAliasByName(ahnjVar);
        }
        return null;
    }

    @Override // defpackage.ahxf, defpackage.ahxe, defpackage.ahxi
    public Collection<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return this.impl.getContributedFunctions(ahnjVar, agloVar);
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return this.impl.getContributedVariables(ahnjVar, agloVar);
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Set<ahnj> getFunctionNames() {
        return this.impl.getFunctionNames();
    }

    protected abstract Set<ahnj> getNonDeclaredClassifierNames();

    protected abstract Set<ahnj> getNonDeclaredFunctionNames();

    protected abstract Set<ahnj> getNonDeclaredVariableNames();

    @Override // defpackage.ahxf, defpackage.ahxe
    public Set<ahnj> getVariableNames() {
        return this.impl.getVariableNames();
    }

    protected boolean hasClass(ahnj ahnjVar) {
        ahnjVar.getClass();
        return getClassNames$org_jetbrains_kotlin_deserialization().contains(ahnjVar);
    }

    protected boolean isDeclaredFunctionAvailable(agdv agdvVar) {
        agdvVar.getClass();
        return true;
    }
}
