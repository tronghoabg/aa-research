package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ailm {
    private static final aila errorClass;
    private static final agdn errorProperty;
    private static final Set<agdn> errorPropertyGroup;
    private static final aigl errorPropertyType;
    private static final aigl errorTypeForLoopInSupertypes;
    public static final ailm INSTANCE = new ailm();
    private static final agcu errorModule = ailf.INSTANCE;

    static {
        String str = String.format(ailb.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        str.getClass();
        errorClass = new aila(ahnj.special(str));
        errorTypeForLoopInSupertypes = createErrorType(aill.CYCLIC_SUPERTYPES, new String[0]);
        errorPropertyType = createErrorType(aill.ERROR_PROPERTY_TYPE, new String[0]);
        ailg ailgVar = new ailg();
        errorProperty = ailgVar;
        errorPropertyGroup = woy.aO(ailgVar);
    }

    private ailm() {
    }

    public static final ailh createErrorScope(aili ailiVar, boolean z, String... strArr) {
        ailiVar.getClass();
        strArr.getClass();
        return z ? new ailn(ailiVar, (String[]) Arrays.copyOf(strArr, strArr.length)) : new ailh(ailiVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean isError(agbi agbiVar) {
        if (agbiVar == null) {
            return false;
        }
        ailm ailmVar = INSTANCE;
        return ailmVar.isErrorClass(agbiVar) || ailmVar.isErrorClass(agbiVar.getContainingDeclaration()) || agbiVar == errorModule;
    }

    private final boolean isErrorClass(agbi agbiVar) {
        return agbiVar instanceof aila;
    }

    public static final boolean isUninferredTypeVariable(aigl aiglVar) {
        if (aiglVar == null) {
            return false;
        }
        aiid constructor = aiglVar.getConstructor();
        return (constructor instanceof ailk) && ((ailk) constructor).getKind() == aill.UNINFERRED_TYPE_VARIABLE;
    }

    public final ailj createErrorType(aill aillVar, aiid aiidVar, String... strArr) {
        aillVar.getClass();
        aiidVar.getClass();
        strArr.getClass();
        return createErrorTypeWithArguments(aillVar, afbe.a, aiidVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final ailk createErrorTypeConstructor(aill aillVar, String... strArr) {
        aillVar.getClass();
        strArr.getClass();
        return new ailk(aillVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final ailj createErrorTypeWithArguments(aill aillVar, List<? extends aiin> list, aiid aiidVar, String... strArr) {
        aillVar.getClass();
        list.getClass();
        aiidVar.getClass();
        strArr.getClass();
        return new ailj(aiidVar, createErrorScope(aili.ERROR_TYPE_SCOPE, aiidVar.toString()), aillVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final aila getErrorClass() {
        return errorClass;
    }

    public final agcu getErrorModule() {
        return errorModule;
    }

    public final Set<agdn> getErrorPropertyGroup() {
        return errorPropertyGroup;
    }

    public final aigl getErrorPropertyType() {
        return errorPropertyType;
    }

    public final aigl getErrorTypeForLoopInSupertypes() {
        return errorTypeForLoopInSupertypes;
    }

    public final String unresolvedTypeAsItIs(aigl aiglVar) {
        aiglVar.getClass();
        aimr.isUnresolvedType(aiglVar);
        aiid constructor = aiglVar.getConstructor();
        constructor.getClass();
        return ((ailk) constructor).getParam(0);
    }

    public static final ailj createErrorType(aill aillVar, String... strArr) {
        aillVar.getClass();
        strArr.getClass();
        return INSTANCE.createErrorTypeWithArguments(aillVar, afbe.a, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final ailh createErrorScope(aili ailiVar, String... strArr) {
        ailiVar.getClass();
        strArr.getClass();
        return createErrorScope(ailiVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final ailj createErrorTypeWithArguments(aill aillVar, List<? extends aiin> list, String... strArr) {
        aillVar.getClass();
        list.getClass();
        strArr.getClass();
        int length = strArr.length;
        return createErrorTypeWithArguments(aillVar, list, createErrorTypeConstructor(aillVar, (String[]) Arrays.copyOf(strArr, length)), (String[]) Arrays.copyOf(strArr, length));
    }
}
