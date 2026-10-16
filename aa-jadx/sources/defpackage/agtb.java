package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agtb extends defpackage.agva {
    public static final defpackage.agtb INSTANCE = new defpackage.agtb();

    private agtb() {
    }

    private final boolean getHasErasedValueParametersInJava(defpackage.agbx agbxVar) {
        return defpackage.afga.bh(defpackage.agva.Companion.getERASED_VALUE_PARAMETERS_SIGNATURES(), defpackage.ahgp.computeJvmSignature(agbxVar));
    }

    public static final defpackage.agdj getOverriddenBuiltinFunctionWithErasedValueParametersInJava(defpackage.agdj agdjVar) {
        agdjVar.getClass();
        defpackage.agtb agtbVar = INSTANCE;
        defpackage.ahoj name = agdjVar.getName();
        name.getClass();
        if (agtbVar.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return (defpackage.agdj) defpackage.ahwz.firstOverridden(agdjVar, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), defpackage.agsz.INSTANCE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOverriddenBuiltinFunctionWithErasedValueParametersInJava$lambda$0(defpackage.agbx agbxVar) {
        agbxVar.getClass();
        return INSTANCE.getHasErasedValueParametersInJava(agbxVar);
    }

    public static final defpackage.agux getSpecialSignatureInfo(defpackage.agbx agbxVar) {
        defpackage.agbx agbxVarFirstOverridden;
        java.lang.String strComputeJvmSignature;
        agbxVar.getClass();
        if (!defpackage.agva.Companion.getERASED_VALUE_PARAMETERS_SHORT_NAMES().contains(agbxVar.getName()) || (agbxVarFirstOverridden = defpackage.ahwz.firstOverridden(agbxVar, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), defpackage.agta.INSTANCE)) == null || (strComputeJvmSignature = defpackage.ahgp.computeJvmSignature(agbxVarFirstOverridden)) == null) {
            return null;
        }
        return defpackage.agva.Companion.getSpecialSignatureInfo(strComputeJvmSignature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSpecialSignatureInfo$lambda$0(defpackage.agbx agbxVar) {
        agbxVar.getClass();
        return (agbxVar instanceof defpackage.agdj) && INSTANCE.getHasErasedValueParametersInJava(agbxVar);
    }

    public final boolean getSameAsBuiltinMethodWithErasedValueParameters(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        return defpackage.agva.Companion.getERASED_VALUE_PARAMETERS_SHORT_NAMES().contains(ahojVar);
    }
}
