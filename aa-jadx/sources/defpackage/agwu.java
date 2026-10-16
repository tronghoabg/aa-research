package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agwu {
    private final defpackage.agwl components;
    private final defpackage.afar<defpackage.ague> delegateForDefaultTypeQualifiers;
    private final defpackage.agxa typeParameterResolver;
    private final defpackage.agzv typeResolver;

    public agwu(defpackage.agwl agwlVar, defpackage.agxa agxaVar, defpackage.afar<defpackage.ague> afarVar) {
        agwlVar.getClass();
        agxaVar.getClass();
        afarVar.getClass();
        this.components = agwlVar;
        this.typeParameterResolver = agxaVar;
        this.delegateForDefaultTypeQualifiers = afarVar;
        this.typeResolver = new defpackage.agzv(this, agxaVar);
    }

    public final defpackage.agwl getComponents() {
        return this.components;
    }

    public final defpackage.ague getDefaultTypeQualifiers() {
        return (defpackage.ague) this.delegateForDefaultTypeQualifiers.a();
    }

    public final defpackage.afar<defpackage.ague> getDelegateForDefaultTypeQualifiers$org_jetbrains_kotlin_descriptors_jvm() {
        return this.delegateForDefaultTypeQualifiers;
    }

    public final defpackage.agdu getModule() {
        return this.components.getModule();
    }

    public final defpackage.aifi getStorageManager() {
        return this.components.getStorageManager();
    }

    public final defpackage.agxa getTypeParameterResolver() {
        return this.typeParameterResolver;
    }

    public final defpackage.agzv getTypeResolver() {
        return this.typeResolver;
    }
}
