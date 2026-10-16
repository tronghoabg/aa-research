package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class agut extends agug {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(agut.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    private final aiec allValueArguments$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agut(agzf agzfVar, agvu agvuVar) {
        super(agvuVar, agzfVar, afyn.target);
        agzfVar.getClass();
        agvuVar.getClass();
        this.allValueArguments$delegate = agvuVar.getStorageManager().createLazyValue(new agus(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allValueArguments_delegate$lambda$0(agut agutVar) {
        agzg firstArgument = agutVar.getFirstArgument();
        ahuh<?> ahuhVarMapJavaTargetArguments$org_jetbrains_kotlin_descriptors_jvm = firstArgument instanceof agkj ? aguj.INSTANCE.mapJavaTargetArguments$org_jetbrains_kotlin_descriptors_jvm(((agkj) agutVar.getFirstArgument()).getElements()) : firstArgument instanceof agky ? aguj.INSTANCE.mapJavaTargetArguments$org_jetbrains_kotlin_descriptors_jvm(woy.bg(agutVar.getFirstArgument())) : null;
        Map mapAW = ahuhVarMapJavaTargetArguments$org_jetbrains_kotlin_descriptors_jvm != null ? woy.aW(new aezu(aguh.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$org_jetbrains_kotlin_descriptors_jvm(), ahuhVarMapJavaTargetArguments$org_jetbrains_kotlin_descriptors_jvm)) : null;
        return mapAW == null ? afbf.a : mapAW;
    }

    @Override // defpackage.agug, defpackage.agfc
    public Map<ahnj, ahuh<Object>> getAllValueArguments() {
        return (Map) aieh.getValue(this.allValueArguments$delegate, this, $$delegatedProperties[0]);
    }
}
