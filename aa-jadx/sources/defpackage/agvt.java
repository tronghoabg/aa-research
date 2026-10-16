package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agvt extends defpackage.agvg {
    static final /* synthetic */ defpackage.afja<java.lang.Object>[] $$delegatedProperties = {new defpackage.afgn(defpackage.agvt.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    private final defpackage.aifc allValueArguments$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvt(defpackage.ahaf ahafVar, defpackage.agwu agwuVar) {
        super(agwuVar, ahafVar, defpackage.afzn.target);
        ahafVar.getClass();
        agwuVar.getClass();
        this.allValueArguments$delegate = agwuVar.getStorageManager().createLazyValue(new defpackage.agvs(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map allValueArguments_delegate$lambda$0(defpackage.agvt agvtVar) {
        defpackage.ahvh<?> ahvhVarMapJavaTargetArguments$org_jetbrains_kotlin_descriptors_jvm;
        defpackage.ahag firstArgument = agvtVar.getFirstArgument();
        if (firstArgument instanceof defpackage.aglj) {
            ahvhVarMapJavaTargetArguments$org_jetbrains_kotlin_descriptors_jvm = defpackage.agvj.INSTANCE.mapJavaTargetArguments$org_jetbrains_kotlin_descriptors_jvm(((defpackage.aglj) agvtVar.getFirstArgument()).getElements());
        } else {
            ahvhVarMapJavaTargetArguments$org_jetbrains_kotlin_descriptors_jvm = firstArgument instanceof defpackage.agly ? defpackage.agvj.INSTANCE.mapJavaTargetArguments$org_jetbrains_kotlin_descriptors_jvm(defpackage.afga.aa(agvtVar.getFirstArgument())) : null;
        }
        java.util.Map mapQ = ahvhVarMapJavaTargetArguments$org_jetbrains_kotlin_descriptors_jvm != null ? defpackage.afga.Q(new defpackage.afau(defpackage.agvh.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$org_jetbrains_kotlin_descriptors_jvm(), ahvhVarMapJavaTargetArguments$org_jetbrains_kotlin_descriptors_jvm)) : null;
        return mapQ == null ? defpackage.afcf.a : mapQ;
    }

    @Override // defpackage.agvg, defpackage.aggc
    public java.util.Map<defpackage.ahoj, defpackage.ahvh<java.lang.Object>> getAllValueArguments() {
        return (java.util.Map) defpackage.aifh.getValue(this.allValueArguments$delegate, this, $$delegatedProperties[0]);
    }
}
