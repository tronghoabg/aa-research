package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agsy extends defpackage.agva {
    public static final defpackage.agsy INSTANCE = new defpackage.agsy();

    private agsy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBuiltinFunctionWithDifferentNameInJvm$lambda$0(defpackage.agev agevVar, defpackage.agbx agbxVar) {
        agbxVar.getClass();
        return defpackage.agva.Companion.getSIGNATURE_TO_JVM_REPRESENTATION_NAME().containsKey(defpackage.ahgp.computeJvmSignature(agevVar));
    }

    public final defpackage.ahoj getJvmName(defpackage.agev agevVar) {
        agevVar.getClass();
        java.util.Map<java.lang.String, defpackage.ahoj> signature_to_jvm_representation_name = defpackage.agva.Companion.getSIGNATURE_TO_JVM_REPRESENTATION_NAME();
        java.lang.String strComputeJvmSignature = defpackage.ahgp.computeJvmSignature(agevVar);
        if (strComputeJvmSignature == null) {
            return null;
        }
        return signature_to_jvm_representation_name.get(strComputeJvmSignature);
    }

    public final boolean isBuiltinFunctionWithDifferentNameInJvm(defpackage.agev agevVar) {
        agevVar.getClass();
        return defpackage.afze.isBuiltIn(agevVar) && defpackage.ahwz.firstOverridden(agevVar, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), new defpackage.agsx(agevVar)) != null;
    }

    public final boolean isRemoveAtByIndex(defpackage.agev agevVar) {
        agevVar.getClass();
        return defpackage.afga.f(agevVar.getName().asString(), "removeAt") && defpackage.afga.f(defpackage.ahgp.computeJvmSignature(agevVar), defpackage.agva.Companion.getREMOVE_AT_NAME_AND_SIGNATURE().getSignature());
    }
}
