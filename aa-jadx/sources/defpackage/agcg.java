package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agcg {
    public static final boolean canBeUsedForConstVal(defpackage.aihl aihlVar) {
        aihlVar.getClass();
        return ((defpackage.afze.isPrimitiveType(aihlVar) || defpackage.afzs.isUnsignedType(aihlVar)) && !defpackage.aikc.isNullableType(aihlVar)) || defpackage.afze.isString(aihlVar);
    }
}
