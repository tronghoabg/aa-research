package defpackage;

/* loaded from: classes3.dex */
public final class aigr {
    public static final boolean isError(aigl aiglVar) {
        aiglVar.getClass();
        aijf aijfVarUnwrap = aiglVar.unwrap();
        if (aijfVarUnwrap instanceof ailj) {
            return true;
        }
        return (aijfVarUnwrap instanceof aiga) && (((aiga) aijfVarUnwrap).getDelegate() instanceof ailj);
    }

    public static final boolean isNullable(aigl aiglVar) {
        aiglVar.getClass();
        return aijc.isNullableType(aiglVar);
    }
}
