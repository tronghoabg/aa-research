package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class agur extends agug {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(agur.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    private final aiec allValueArguments$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agur(agzf agzfVar, agvu agvuVar) {
        super(agvuVar, agzfVar, afyn.retention);
        agzfVar.getClass();
        agvuVar.getClass();
        this.allValueArguments$delegate = agvuVar.getStorageManager().createLazyValue(new aguq(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allValueArguments_delegate$lambda$0(agur agurVar) {
        ahuh<?> ahuhVarMapJavaRetentionArgument$org_jetbrains_kotlin_descriptors_jvm = aguj.INSTANCE.mapJavaRetentionArgument$org_jetbrains_kotlin_descriptors_jvm(agurVar.getFirstArgument());
        Map mapAW = ahuhVarMapJavaRetentionArgument$org_jetbrains_kotlin_descriptors_jvm != null ? woy.aW(new aezu(aguh.INSTANCE.getRETENTION_ANNOTATION_VALUE$org_jetbrains_kotlin_descriptors_jvm(), ahuhVarMapJavaRetentionArgument$org_jetbrains_kotlin_descriptors_jvm)) : null;
        return mapAW == null ? afbf.a : mapAW;
    }

    @Override // defpackage.agug, defpackage.agfc
    public Map<ahnj, ahuh<?>> getAllValueArguments() {
        return (Map) aieh.getValue(this.allValueArguments$delegate, this, $$delegatedProperties[0]);
    }
}
