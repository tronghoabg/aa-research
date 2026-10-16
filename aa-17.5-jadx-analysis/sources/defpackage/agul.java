package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class agul extends agug {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(agul.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    private final aiec allValueArguments$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agul(agzf agzfVar, agvu agvuVar) {
        super(agvuVar, agzfVar, afyn.deprecated);
        agvuVar.getClass();
        this.allValueArguments$delegate = agvuVar.getStorageManager().createLazyValue(aguk.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map allValueArguments_delegate$lambda$0() {
        return woy.aW(new aezu(aguh.INSTANCE.getDEPRECATED_ANNOTATION_MESSAGE$org_jetbrains_kotlin_descriptors_jvm(), new ahvh("Deprecated in Java")));
    }

    @Override // defpackage.agug, defpackage.agfc
    public Map<ahnj, ahuh<?>> getAllValueArguments() {
        return (Map) aieh.getValue(this.allValueArguments$delegate, this, $$delegatedProperties[0]);
    }
}
