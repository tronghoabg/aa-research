package defpackage;

/* loaded from: classes3.dex */
public final class aiht {
    public static final String a(int i) {
        return woy.dD(i & 4294967295L, 16);
    }

    public static final aifl getCustomTypeParameter(aigl aiglVar) {
        aiglVar.getClass();
        agez agezVarUnwrap = aiglVar.unwrap();
        aifl aiflVar = agezVarUnwrap instanceof aifl ? (aifl) agezVarUnwrap : null;
        if (aiflVar == null || true != aiflVar.isTypeParameter()) {
            return null;
        }
        return aiflVar;
    }

    public static final boolean isCustomTypeParameter(aigl aiglVar) {
        aiglVar.getClass();
        agez agezVarUnwrap = aiglVar.unwrap();
        aifl aiflVar = agezVarUnwrap instanceof aifl ? (aifl) agezVarUnwrap : null;
        if (aiflVar != null) {
            return aiflVar.isTypeParameter();
        }
        return false;
    }
}
