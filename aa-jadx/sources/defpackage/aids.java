package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aids extends defpackage.ahyf {
    static final /* synthetic */ defpackage.afja<java.lang.Object>[] $$delegatedProperties = {new defpackage.afgn(defpackage.aids.class, "classNames", "getClassNames$org_jetbrains_kotlin_deserialization()Ljava/util/Set;", 0), new defpackage.afgn(defpackage.aids.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};
    private final defpackage.ahzy c;
    private final defpackage.aifc classNames$delegate;
    private final defpackage.aifd classifierNamesLazy$delegate;
    private final defpackage.aicz impl;

    protected aids(defpackage.ahzy ahzyVar, java.util.List<defpackage.ahjf> list, java.util.List<defpackage.ahjs> list2, java.util.List<defpackage.ahkq> list3, defpackage.afer<? extends java.util.Collection<defpackage.ahoj>> aferVar) {
        ahzyVar.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        aferVar.getClass();
        this.c = ahzyVar;
        this.impl = createImplementation(list, list2, list3);
        this.classNames$delegate = ahzyVar.getStorageManager().createLazyValue(new defpackage.aicx(aferVar));
        this.classifierNamesLazy$delegate = ahzyVar.getStorageManager().createNullableLazyValue(new defpackage.aicy(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Set classNames_delegate$lambda$0(defpackage.afer aferVar) {
        return defpackage.afga.bf((java.lang.Iterable) aferVar.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Set classifierNamesLazy_delegate$lambda$0(defpackage.aids aidsVar) {
        java.util.Set<defpackage.ahoj> nonDeclaredClassifierNames = aidsVar.getNonDeclaredClassifierNames();
        if (nonDeclaredClassifierNames == null) {
            return null;
        }
        return defpackage.afga.M(defpackage.afga.M(aidsVar.getClassNames$org_jetbrains_kotlin_deserialization(), aidsVar.impl.getTypeAliasNames()), nonDeclaredClassifierNames);
    }

    private final defpackage.aicz createImplementation(java.util.List<defpackage.ahjf> list, java.util.List<defpackage.ahjs> list2, java.util.List<defpackage.ahkq> list3) {
        return this.c.getComponents().getConfiguration().getPreserveDeclarationsOrdering() ? new defpackage.aidk(this, list, list2, list3) : new defpackage.aidr(this, list, list2, list3);
    }

    private final defpackage.agca deserializeClass(defpackage.ahoj ahojVar) {
        return this.c.getComponents().deserializeClass(createClassId(ahojVar));
    }

    private final java.util.Set<defpackage.ahoj> getClassifierNamesLazy() {
        return (java.util.Set) defpackage.aifh.getValue(this.classifierNamesLazy$delegate, this, $$delegatedProperties[1]);
    }

    private final defpackage.agfd getTypeAliasByName(defpackage.ahoj ahojVar) {
        return this.impl.getTypeAliasByName(ahojVar);
    }

    protected abstract void addEnumEntryDescriptors(java.util.Collection<defpackage.agci> collection, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar);

    protected final java.util.Collection<defpackage.agci> computeDescriptors(defpackage.ahxt ahxtVar, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar, defpackage.agmo agmoVar) {
        ahxtVar.getClass();
        affcVar.getClass();
        agmoVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        if (ahxtVar.acceptsKinds(defpackage.ahxt.Companion.getSINGLETON_CLASSIFIERS_MASK())) {
            addEnumEntryDescriptors(arrayList, affcVar);
        }
        this.impl.addFunctionsAndPropertiesTo(arrayList, ahxtVar, affcVar, agmoVar);
        if (ahxtVar.acceptsKinds(defpackage.ahxt.Companion.getCLASSIFIERS_MASK())) {
            for (defpackage.ahoj ahojVar : getClassNames$org_jetbrains_kotlin_deserialization()) {
                if (affcVar.invoke(ahojVar).booleanValue()) {
                    defpackage.aipw.addIfNotNull(arrayList, deserializeClass(ahojVar));
                }
            }
        }
        if (ahxtVar.acceptsKinds(defpackage.ahxt.Companion.getTYPE_ALIASES_MASK())) {
            for (defpackage.ahoj ahojVar2 : this.impl.getTypeAliasNames()) {
                if (affcVar.invoke(ahojVar2).booleanValue()) {
                    defpackage.aipw.addIfNotNull(arrayList, this.impl.getTypeAliasByName(ahojVar2));
                }
            }
        }
        return defpackage.aipw.compact(arrayList);
    }

    protected void computeNonDeclaredFunctions(defpackage.ahoj ahojVar, java.util.List<defpackage.agev> list) {
        ahojVar.getClass();
        list.getClass();
    }

    protected void computeNonDeclaredProperties(defpackage.ahoj ahojVar, java.util.List<defpackage.agen> list) {
        ahojVar.getClass();
        list.getClass();
    }

    protected abstract defpackage.ahod createClassId(defpackage.ahoj ahojVar);

    public final defpackage.ahzy getC() {
        return this.c;
    }

    public final java.util.Set<defpackage.ahoj> getClassNames$org_jetbrains_kotlin_deserialization() {
        return (java.util.Set) defpackage.aifh.getValue(this.classNames$delegate, this, $$delegatedProperties[0]);
    }

    @Override // defpackage.ahyf, defpackage.ahye
    public java.util.Set<defpackage.ahoj> getClassifierNames() {
        return getClassifierNamesLazy();
    }

    @Override // defpackage.ahyf, defpackage.ahyi
    public defpackage.agcd getContributedClassifier(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        if (hasClass(ahojVar)) {
            return deserializeClass(ahojVar);
        }
        if (this.impl.getTypeAliasNames().contains(ahojVar)) {
            return getTypeAliasByName(ahojVar);
        }
        return null;
    }

    @Override // defpackage.ahyf, defpackage.ahye, defpackage.ahyi
    public java.util.Collection<defpackage.agev> getContributedFunctions(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        return this.impl.getContributedFunctions(ahojVar, agmoVar);
    }

    @Override // defpackage.ahyf, defpackage.ahye
    public java.util.Collection<defpackage.agen> getContributedVariables(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        return this.impl.getContributedVariables(ahojVar, agmoVar);
    }

    @Override // defpackage.ahyf, defpackage.ahye
    public java.util.Set<defpackage.ahoj> getFunctionNames() {
        return this.impl.getFunctionNames();
    }

    protected abstract java.util.Set<defpackage.ahoj> getNonDeclaredClassifierNames();

    protected abstract java.util.Set<defpackage.ahoj> getNonDeclaredFunctionNames();

    protected abstract java.util.Set<defpackage.ahoj> getNonDeclaredVariableNames();

    @Override // defpackage.ahyf, defpackage.ahye
    public java.util.Set<defpackage.ahoj> getVariableNames() {
        return this.impl.getVariableNames();
    }

    protected boolean hasClass(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        return getClassNames$org_jetbrains_kotlin_deserialization().contains(ahojVar);
    }

    protected boolean isDeclaredFunctionAvailable(defpackage.agev agevVar) {
        agevVar.getClass();
        return true;
    }
}
