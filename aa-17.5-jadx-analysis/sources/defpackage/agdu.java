package defpackage;

import defpackage.ahxe;

/* loaded from: classes3.dex */
public final class agdu<T extends ahxe> {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(agdu.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};
    public static final agdt Companion = new agdt(null);
    private final agba classDescriptor;
    private final aiju kotlinTypeRefinerForOwnerModule;
    private final afec<aiju, T> scopeFactory;
    private final aiec scopeForOwnerModule$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    private agdu(agba agbaVar, aiei aieiVar, afec<? super aiju, ? extends T> afecVar, aiju aijuVar) {
        this.classDescriptor = agbaVar;
        this.scopeFactory = afecVar;
        this.kotlinTypeRefinerForOwnerModule = aijuVar;
        this.scopeForOwnerModule$delegate = aieiVar.createLazyValue(new agdr(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahxe getScope$lambda$0(agdu agduVar, aiju aijuVar) {
        return agduVar.scopeFactory.invoke(aijuVar);
    }

    private final T getScopeForOwnerModule() {
        return (T) aieh.getValue(this.scopeForOwnerModule$delegate, this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahxe scopeForOwnerModule_delegate$lambda$0(agdu agduVar) {
        return agduVar.scopeFactory.invoke(agduVar.kotlinTypeRefinerForOwnerModule);
    }

    public final T getScope(aiju aijuVar) {
        aijuVar.getClass();
        if (!aijuVar.isRefinementNeededForModule(ahvz.getModule(this.classDescriptor))) {
            return (T) getScopeForOwnerModule();
        }
        aiid typeConstructor = this.classDescriptor.getTypeConstructor();
        typeConstructor.getClass();
        return !aijuVar.isRefinementNeededForTypeConstructor(typeConstructor) ? (T) getScopeForOwnerModule() : (T) aijuVar.getOrPutScopeForClass(this.classDescriptor, new agds(this, aijuVar));
    }

    public /* synthetic */ agdu(agba agbaVar, aiei aieiVar, afec afecVar, aiju aijuVar, afeu afeuVar) {
        this(agbaVar, aieiVar, afecVar, aijuVar);
    }
}
