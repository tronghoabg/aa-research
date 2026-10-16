package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agvl extends defpackage.agvg {
    static final /* synthetic */ defpackage.afja<java.lang.Object>[] $$delegatedProperties = {new defpackage.afgn(defpackage.agvl.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    private final defpackage.aifc allValueArguments$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvl(defpackage.ahaf ahafVar, defpackage.agwu agwuVar) {
        super(agwuVar, ahafVar, defpackage.afzn.deprecated);
        agwuVar.getClass();
        this.allValueArguments$delegate = agwuVar.getStorageManager().createLazyValue(defpackage.agvk.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map allValueArguments_delegate$lambda$0() {
        return defpackage.afga.Q(new defpackage.afau(defpackage.agvh.INSTANCE.getDEPRECATED_ANNOTATION_MESSAGE$org_jetbrains_kotlin_descriptors_jvm(), new defpackage.ahwh("Deprecated in Java")));
    }

    @Override // defpackage.agvg, defpackage.aggc
    public java.util.Map<defpackage.ahoj, defpackage.ahvh<?>> getAllValueArguments() {
        return (java.util.Map) defpackage.aifh.getValue(this.allValueArguments$delegate, this, $$delegatedProperties[0]);
    }
}
