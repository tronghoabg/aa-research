package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ageu<T extends defpackage.ahye> {
    static final /* synthetic */ defpackage.afja<java.lang.Object>[] $$delegatedProperties = {new defpackage.afgn(defpackage.ageu.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};
    public static final defpackage.aget Companion = new defpackage.aget(null);
    private final defpackage.agca classDescriptor;
    private final defpackage.aiku kotlinTypeRefinerForOwnerModule;
    private final defpackage.affc<defpackage.aiku, T> scopeFactory;
    private final defpackage.aifc scopeForOwnerModule$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    private ageu(defpackage.agca agcaVar, defpackage.aifi aifiVar, defpackage.affc<? super defpackage.aiku, ? extends T> affcVar, defpackage.aiku aikuVar) {
        this.classDescriptor = agcaVar;
        this.scopeFactory = affcVar;
        this.kotlinTypeRefinerForOwnerModule = aikuVar;
        this.scopeForOwnerModule$delegate = aifiVar.createLazyValue(new defpackage.ager(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.ahye getScope$lambda$0(defpackage.ageu ageuVar, defpackage.aiku aikuVar) {
        return ageuVar.scopeFactory.invoke(aikuVar);
    }

    private final T getScopeForOwnerModule() {
        return (T) defpackage.aifh.getValue(this.scopeForOwnerModule$delegate, this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.ahye scopeForOwnerModule_delegate$lambda$0(defpackage.ageu ageuVar) {
        return ageuVar.scopeFactory.invoke(ageuVar.kotlinTypeRefinerForOwnerModule);
    }

    public final T getScope(defpackage.aiku aikuVar) {
        aikuVar.getClass();
        if (!aikuVar.isRefinementNeededForModule(defpackage.ahwz.getModule(this.classDescriptor))) {
            return (T) getScopeForOwnerModule();
        }
        defpackage.aijd typeConstructor = this.classDescriptor.getTypeConstructor();
        typeConstructor.getClass();
        return !aikuVar.isRefinementNeededForTypeConstructor(typeConstructor) ? (T) getScopeForOwnerModule() : (T) aikuVar.getOrPutScopeForClass(this.classDescriptor, new defpackage.ages(this, aikuVar));
    }

    public /* synthetic */ ageu(defpackage.agca agcaVar, defpackage.aifi aifiVar, defpackage.affc affcVar, defpackage.aiku aikuVar, defpackage.affu affuVar) {
        this(agcaVar, aifiVar, affcVar, aikuVar);
    }
}
