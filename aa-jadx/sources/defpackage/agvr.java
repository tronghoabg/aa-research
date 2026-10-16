package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agvr extends defpackage.agvg {
    static final /* synthetic */ defpackage.afja<java.lang.Object>[] $$delegatedProperties = {new defpackage.afgn(defpackage.agvr.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    private final defpackage.aifc allValueArguments$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvr(defpackage.ahaf ahafVar, defpackage.agwu agwuVar) {
        super(agwuVar, ahafVar, defpackage.afzn.retention);
        ahafVar.getClass();
        agwuVar.getClass();
        this.allValueArguments$delegate = agwuVar.getStorageManager().createLazyValue(new defpackage.agvq(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map allValueArguments_delegate$lambda$0(defpackage.agvr agvrVar) {
        defpackage.ahvh<?> ahvhVarMapJavaRetentionArgument$org_jetbrains_kotlin_descriptors_jvm = defpackage.agvj.INSTANCE.mapJavaRetentionArgument$org_jetbrains_kotlin_descriptors_jvm(agvrVar.getFirstArgument());
        java.util.Map mapQ = ahvhVarMapJavaRetentionArgument$org_jetbrains_kotlin_descriptors_jvm != null ? defpackage.afga.Q(new defpackage.afau(defpackage.agvh.INSTANCE.getRETENTION_ANNOTATION_VALUE$org_jetbrains_kotlin_descriptors_jvm(), ahvhVarMapJavaRetentionArgument$org_jetbrains_kotlin_descriptors_jvm)) : null;
        return mapQ == null ? defpackage.afcf.a : mapQ;
    }

    @Override // defpackage.agvg, defpackage.aggc
    public java.util.Map<defpackage.ahoj, defpackage.ahvh<?>> getAllValueArguments() {
        return (java.util.Map) defpackage.aifh.getValue(this.allValueArguments$delegate, this, $$delegatedProperties[0]);
    }
}
