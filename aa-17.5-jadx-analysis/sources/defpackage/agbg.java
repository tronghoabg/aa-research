package defpackage;

/* loaded from: classes3.dex */
public final class agbg {
    public static final boolean canBeUsedForConstVal(aigl aiglVar) {
        aiglVar.getClass();
        return ((afye.isPrimitiveType(aiglVar) || afys.isUnsignedType(aiglVar)) && !aijc.isNullableType(aiglVar)) || afye.isString(aiglVar);
    }
}
