package defpackage;

/* loaded from: classes3.dex */
public final class agfg {
    private static final ahnj DEPRECATED_MESSAGE_NAME = ahnj.identifier("message");
    private static final ahnj DEPRECATED_REPLACE_WITH_NAME = ahnj.identifier("replaceWith");
    private static final ahnj DEPRECATED_LEVEL_NAME = ahnj.identifier("level");
    private static final ahnj REPLACE_WITH_EXPRESSION_NAME = ahnj.identifier("expression");
    private static final ahnj REPLACE_WITH_IMPORTS_NAME = ahnj.identifier("imports");

    public static final agfc createDeprecatedAnnotation(afye afyeVar, String str, String str2, String str3, boolean z) {
        afyeVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new agfo(afyeVar, afyn.deprecated, woy.ba(new aezu(DEPRECATED_MESSAGE_NAME, new ahvh(str)), new aezu(DEPRECATED_REPLACE_WITH_NAME, new ahub(new agfo(afyeVar, afyn.replaceWith, woy.ba(new aezu(REPLACE_WITH_EXPRESSION_NAME, new ahvh(str2)), new aezu(REPLACE_WITH_IMPORTS_NAME, new ahuc(afbe.a, new agff(afyeVar)))), false, 8, null))), new aezu(DEPRECATED_LEVEL_NAME, new ahul(ahnd.Companion.topLevel(afyn.deprecationLevel), ahnj.identifier(str3)))), z);
    }

    public static /* synthetic */ agfc createDeprecatedAnnotation$default(afye afyeVar, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return createDeprecatedAnnotation(afyeVar, str, str2, str3, z & ((i & 8) == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigl createDeprecatedAnnotation$lambda$0(afye afyeVar, agcu agcuVar) {
        agcuVar.getClass();
        aigw arrayType = agcuVar.getBuiltIns().getArrayType(aijg.INVARIANT, afyeVar.getStringType());
        arrayType.getClass();
        return arrayType;
    }
}
