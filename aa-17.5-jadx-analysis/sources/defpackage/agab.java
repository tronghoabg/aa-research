package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class agab extends afye {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(agab.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0)};
    private final aiec customizer$delegate;
    private final afzz kind;
    private afdr<agaa> settingsComputation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agab(aiei aieiVar, afzz afzzVar) {
        super(aieiVar);
        aieiVar.getClass();
        afzzVar.getClass();
        this.kind = afzzVar;
        this.customizer$delegate = aieiVar.createLazyValue(new afzw(this, aieiVar));
        int iOrdinal = afzzVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                createBuiltInsModule(false);
            } else {
                if (iOrdinal != 2) {
                    throw new aezs();
                }
                createBuiltInsModule(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agao customizer_delegate$lambda$0(agab agabVar, aiei aieiVar) {
        agic builtInsModule = agabVar.getBuiltInsModule();
        builtInsModule.getClass();
        return new agao(builtInsModule, aieiVar, new afzy(agabVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agaa customizer_delegate$lambda$0$0(agab agabVar) {
        afdr<agaa> afdrVar = agabVar.settingsComputation;
        if (afdrVar == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        agaa agaaVarInvoke = afdrVar.invoke();
        agabVar.settingsComputation = null;
        return agaaVarInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agaa initialize$lambda$0(agcu agcuVar, boolean z) {
        return new agaa(agcuVar, z);
    }

    @Override // defpackage.afye
    protected agfx getAdditionalClassPartsProvider() {
        return getCustomizer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afye
    public List<agfy> getClassDescriptorFactories() {
        Iterable<agfy> classDescriptorFactories = super.getClassDescriptorFactories();
        classDescriptorFactories.getClass();
        aiei storageManager = getStorageManager();
        storageManager.getClass();
        agic builtInsModule = getBuiltInsModule();
        builtInsModule.getClass();
        return woy.bX(classDescriptorFactories, new afzv(storageManager, builtInsModule, null, 4, null));
    }

    public final agao getCustomizer() {
        return (agao) aieh.getValue(this.customizer$delegate, this, $$delegatedProperties[0]);
    }

    @Override // defpackage.afye
    protected aggb getPlatformDependentDeclarationFilter() {
        return getCustomizer();
    }

    public final void initialize(agcu agcuVar, boolean z) {
        agcuVar.getClass();
        setPostponedSettingsComputation(new afzx(agcuVar, z));
    }

    public final void setPostponedSettingsComputation(afdr<agaa> afdrVar) {
        afdrVar.getClass();
        this.settingsComputation = afdrVar;
    }
}
