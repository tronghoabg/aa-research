package defpackage;

/* loaded from: classes3.dex */
public final class agsb extends agua {
    public static final agsb INSTANCE = new agsb();

    private agsb() {
    }

    private final boolean getHasErasedValueParametersInJava(agax agaxVar) {
        return woy.cn(agua.Companion.getERASED_VALUE_PARAMETERS_SIGNATURES(), ahfp.computeJvmSignature(agaxVar));
    }

    public static final agcj getOverriddenBuiltinFunctionWithErasedValueParametersInJava(agcj agcjVar) {
        agcjVar.getClass();
        agsb agsbVar = INSTANCE;
        ahnj name = agcjVar.getName();
        name.getClass();
        if (agsbVar.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return (agcj) ahvz.firstOverridden(agcjVar, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), agrz.INSTANCE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOverriddenBuiltinFunctionWithErasedValueParametersInJava$lambda$0(agax agaxVar) {
        agaxVar.getClass();
        return INSTANCE.getHasErasedValueParametersInJava(agaxVar);
    }

    public static final agtx getSpecialSignatureInfo(agax agaxVar) {
        agax agaxVarFirstOverridden;
        String strComputeJvmSignature;
        agaxVar.getClass();
        if (!agua.Companion.getERASED_VALUE_PARAMETERS_SHORT_NAMES().contains(agaxVar.getName()) || (agaxVarFirstOverridden = ahvz.firstOverridden(agaxVar, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), agsa.INSTANCE)) == null || (strComputeJvmSignature = ahfp.computeJvmSignature(agaxVarFirstOverridden)) == null) {
            return null;
        }
        return agua.Companion.getSpecialSignatureInfo(strComputeJvmSignature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSpecialSignatureInfo$lambda$0(agax agaxVar) {
        agaxVar.getClass();
        return (agaxVar instanceof agcj) && INSTANCE.getHasErasedValueParametersInJava(agaxVar);
    }

    public final boolean getSameAsBuiltinMethodWithErasedValueParameters(ahnj ahnjVar) {
        ahnjVar.getClass();
        return agua.Companion.getERASED_VALUE_PARAMETERS_SHORT_NAMES().contains(ahnjVar);
    }
}
