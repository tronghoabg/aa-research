package defpackage;

/* loaded from: classes3.dex */
public final class afym {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(afym.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new affn(afym.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new affn(afym.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new affn(afym.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new affn(afym.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new affn(afym.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new affn(afym.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new affn(afym.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)};
    public static final afyl Companion = new afyl(null);
    private final afyk kClass$delegate;
    private final afyk kMutableProperty0$delegate;
    private final afyk kMutableProperty1$delegate;
    private final afyk kMutableProperty2$delegate;
    private final afyk kProperty$delegate;
    private final afyk kProperty0$delegate;
    private final afyk kProperty1$delegate;
    private final afyk kProperty2$delegate;
    private final aezr kotlinReflectScope$delegate;
    private final agdb notFoundClasses;

    public afym(agcu agcuVar, agdb agdbVar) {
        agcuVar.getClass();
        agdbVar.getClass();
        this.notFoundClasses = agdbVar;
        this.kotlinReflectScope$delegate = woy.dH(2, new afyj(agcuVar));
        this.kClass$delegate = new afyk(1);
        this.kProperty$delegate = new afyk(1);
        this.kProperty0$delegate = new afyk(1);
        this.kProperty1$delegate = new afyk(2);
        this.kProperty2$delegate = new afyk(3);
        this.kMutableProperty0$delegate = new afyk(1);
        this.kMutableProperty1$delegate = new afyk(2);
        this.kMutableProperty2$delegate = new afyk(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final agba find(String str, int i) {
        ahnj ahnjVarIdentifier = ahnj.identifier(str);
        agbd contributedClassifier = getKotlinReflectScope().getContributedClassifier(ahnjVarIdentifier, aglr.FROM_REFLECTION);
        agba agbaVar = contributedClassifier instanceof agba ? (agba) contributedClassifier : null;
        return agbaVar == null ? this.notFoundClasses.getClass(new ahnd(afyo.KOTLIN_REFLECT_FQ_NAME, ahnjVarIdentifier), woy.bg(Integer.valueOf(i))) : agbaVar;
    }

    private final ahxe getKotlinReflectScope() {
        return (ahxe) this.kotlinReflectScope$delegate.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahxe kotlinReflectScope_delegate$lambda$0(agcu agcuVar) {
        return agcuVar.getPackage(afyo.KOTLIN_REFLECT_FQ_NAME).getMemberScope();
    }

    public final agba getKClass() {
        return this.kClass$delegate.getValue(this, $$delegatedProperties[0]);
    }
}
