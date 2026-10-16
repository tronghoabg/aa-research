package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class agry extends agua {
    public static final agry INSTANCE = new agry();

    private agry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBuiltinFunctionWithDifferentNameInJvm$lambda$0(agdv agdvVar, agax agaxVar) {
        agaxVar.getClass();
        return agua.Companion.getSIGNATURE_TO_JVM_REPRESENTATION_NAME().containsKey(ahfp.computeJvmSignature(agdvVar));
    }

    public final ahnj getJvmName(agdv agdvVar) {
        agdvVar.getClass();
        Map<String, ahnj> signature_to_jvm_representation_name = agua.Companion.getSIGNATURE_TO_JVM_REPRESENTATION_NAME();
        String strComputeJvmSignature = ahfp.computeJvmSignature(agdvVar);
        if (strComputeJvmSignature == null) {
            return null;
        }
        return signature_to_jvm_representation_name.get(strComputeJvmSignature);
    }

    public final boolean isBuiltinFunctionWithDifferentNameInJvm(agdv agdvVar) {
        agdvVar.getClass();
        return afye.isBuiltIn(agdvVar) && ahvz.firstOverridden(agdvVar, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), new agrx(agdvVar)) != null;
    }

    public final boolean isRemoveAtByIndex(agdv agdvVar) {
        agdvVar.getClass();
        return affa.f(agdvVar.getName().asString(), "removeAt") && affa.f(ahfp.computeJvmSignature(agdvVar), agua.Companion.getREMOVE_AT_NAME_AND_SIGNATURE().getSignature());
    }
}
