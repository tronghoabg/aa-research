package defpackage;

/* loaded from: classes3.dex */
public final class agvu {
    private final agvl components;
    private final aezr<agte> delegateForDefaultTypeQualifiers;
    private final agwa typeParameterResolver;
    private final agyv typeResolver;

    public agvu(agvl agvlVar, agwa agwaVar, aezr<agte> aezrVar) {
        agvlVar.getClass();
        agwaVar.getClass();
        aezrVar.getClass();
        this.components = agvlVar;
        this.typeParameterResolver = agwaVar;
        this.delegateForDefaultTypeQualifiers = aezrVar;
        this.typeResolver = new agyv(this, agwaVar);
    }

    public final agvl getComponents() {
        return this.components;
    }

    public final agte getDefaultTypeQualifiers() {
        return (agte) this.delegateForDefaultTypeQualifiers.a();
    }

    public final aezr<agte> getDelegateForDefaultTypeQualifiers$org_jetbrains_kotlin_descriptors_jvm() {
        return this.delegateForDefaultTypeQualifiers;
    }

    public final agcu getModule() {
        return this.components.getModule();
    }

    public final aiei getStorageManager() {
        return this.components.getStorageManager();
    }

    public final agwa getTypeParameterResolver() {
        return this.typeParameterResolver;
    }

    public final agyv getTypeResolver() {
        return this.typeResolver;
    }
}
