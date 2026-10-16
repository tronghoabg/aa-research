package defpackage;

/* loaded from: classes3.dex */
public final class aige {
    public static final aiga asFlexibleType(aigl aiglVar) {
        aiglVar.getClass();
        aijf aijfVarUnwrap = aiglVar.unwrap();
        aijfVarUnwrap.getClass();
        return (aiga) aijfVarUnwrap;
    }

    public static final boolean isFlexible(aigl aiglVar) {
        aiglVar.getClass();
        return aiglVar.unwrap() instanceof aiga;
    }

    public static final aigw lowerIfFlexible(aigl aiglVar) {
        aiglVar.getClass();
        aijf aijfVarUnwrap = aiglVar.unwrap();
        if (aijfVarUnwrap instanceof aiga) {
            return ((aiga) aijfVarUnwrap).getLowerBound();
        }
        if (aijfVarUnwrap instanceof aigw) {
            return (aigw) aijfVarUnwrap;
        }
        throw new aezs();
    }

    public static final aigw upperIfFlexible(aigl aiglVar) {
        aiglVar.getClass();
        aijf aijfVarUnwrap = aiglVar.unwrap();
        if (aijfVarUnwrap instanceof aiga) {
            return ((aiga) aijfVarUnwrap).getUpperBound();
        }
        if (aijfVarUnwrap instanceof aigw) {
            return (aigw) aijfVarUnwrap;
        }
        throw new aezs();
    }
}
