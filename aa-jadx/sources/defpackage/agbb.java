package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agbb extends defpackage.afze {
    static final /* synthetic */ defpackage.afja<java.lang.Object>[] $$delegatedProperties = {new defpackage.afgn(defpackage.agbb.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0)};
    private final defpackage.aifc customizer$delegate;
    private final defpackage.agaz kind;
    private defpackage.afer<defpackage.agba> settingsComputation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agbb(defpackage.aifi aifiVar, defpackage.agaz agazVar) {
        super(aifiVar);
        aifiVar.getClass();
        agazVar.getClass();
        this.kind = agazVar;
        this.customizer$delegate = aifiVar.createLazyValue(new defpackage.agaw(this, aifiVar));
        int iOrdinal = agazVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                createBuiltInsModule(false);
            } else {
                if (iOrdinal != 2) {
                    throw new defpackage.afas();
                }
                createBuiltInsModule(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.agbo customizer_delegate$lambda$0(defpackage.agbb agbbVar, defpackage.aifi aifiVar) {
        defpackage.agjc builtInsModule = agbbVar.getBuiltInsModule();
        builtInsModule.getClass();
        return new defpackage.agbo(builtInsModule, aifiVar, new defpackage.agay(agbbVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.agba customizer_delegate$lambda$0$0(defpackage.agbb agbbVar) {
        defpackage.afer<defpackage.agba> aferVar = agbbVar.settingsComputation;
        if (aferVar == null) {
            throw new java.lang.AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        defpackage.agba agbaVarInvoke = aferVar.invoke();
        agbbVar.settingsComputation = null;
        return agbaVarInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.agba initialize$lambda$0(defpackage.agdu agduVar, boolean z) {
        return new defpackage.agba(agduVar, z);
    }

    @Override // defpackage.afze
    protected defpackage.aggx getAdditionalClassPartsProvider() {
        return getCustomizer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afze
    public java.util.List<defpackage.aggy> getClassDescriptorFactories() {
        java.lang.Iterable<defpackage.aggy> classDescriptorFactories = super.getClassDescriptorFactories();
        classDescriptorFactories.getClass();
        defpackage.aifi storageManager = getStorageManager();
        storageManager.getClass();
        defpackage.agjc builtInsModule = getBuiltInsModule();
        builtInsModule.getClass();
        return defpackage.afga.aR(classDescriptorFactories, new defpackage.agav(storageManager, builtInsModule, null, 4, null));
    }

    public final defpackage.agbo getCustomizer() {
        return (defpackage.agbo) defpackage.aifh.getValue(this.customizer$delegate, this, $$delegatedProperties[0]);
    }

    @Override // defpackage.afze
    protected defpackage.aghb getPlatformDependentDeclarationFilter() {
        return getCustomizer();
    }

    public final void initialize(defpackage.agdu agduVar, boolean z) {
        agduVar.getClass();
        setPostponedSettingsComputation(new defpackage.agax(agduVar, z));
    }

    public final void setPostponedSettingsComputation(defpackage.afer<defpackage.agba> aferVar) {
        aferVar.getClass();
        this.settingsComputation = aferVar;
    }
}
