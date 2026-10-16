package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class afzo {
    public static final defpackage.ahof ANNOTATION_PACKAGE_FQ_NAME;
    public static final defpackage.ahof BUILT_INS_PACKAGE_FQ_NAME;
    public static final java.util.Set<defpackage.ahof> BUILT_INS_PACKAGE_FQ_NAMES;
    public static final defpackage.ahoj BUILT_INS_PACKAGE_NAME;
    public static final defpackage.ahoj CHAR_CODE;
    public static final defpackage.ahof COLLECTIONS_PACKAGE_FQ_NAME;
    public static final defpackage.ahof CONCURRENT_ATOMICS_PACKAGE_FQ_NAME;
    public static final defpackage.ahof CONCURRENT_PACKAGE_FQ_NAME;
    public static final defpackage.ahoj CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME;
    public static final defpackage.ahof CONTINUATION_INTERFACE_FQ_NAME;
    public static final defpackage.ahof COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;
    public static final defpackage.ahof COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;
    public static final defpackage.ahof COROUTINES_PACKAGE_FQ_NAME;
    public static final defpackage.ahoj COROUTINE_SUSPENDED_NAME;
    public static final java.lang.String DATA_CLASS_COMPONENT_PREFIX;
    public static final defpackage.ahoj DATA_CLASS_COPY;
    public static final defpackage.ahoj DEFAULT_IMPLS_CLASS_NAME;
    public static final defpackage.ahoj DEFAULT_VALUE_PARAMETER;
    public static final defpackage.ahof DYNAMIC_FQ_NAME;
    public static final defpackage.ahoj ENUM_ENTRIES;
    public static final defpackage.ahoj ENUM_VALUES;
    public static final defpackage.ahoj ENUM_VALUE_OF;
    public static final defpackage.ahoj EQUALS_NAME;
    public static final defpackage.ahoj HASHCODE_NAME;
    public static final defpackage.ahoj IMPLICIT_LAMBDA_PARAMETER_NAME;
    public static final defpackage.ahof KOTLIN_INTERNAL_FQ_NAME;
    public static final defpackage.ahof KOTLIN_REFLECT_FQ_NAME;
    public static final defpackage.ahoj MAIN;
    public static final defpackage.ahoj MAP_ENTRY_KEY;
    public static final defpackage.ahoj MAP_ENTRY_VALUE;
    public static final defpackage.ahoj NAME;
    public static final defpackage.ahoj NEXT_CHAR;
    private static final defpackage.ahof NON_EXISTENT_CLASS;
    public static final java.util.List<java.lang.String> PREFIXES;
    public static final defpackage.ahof RANGES_PACKAGE_FQ_NAME;
    public static final defpackage.ahof RESULT_FQ_NAME;
    public static final defpackage.ahof SEQUENCES_PACKAGE_FQ_NAME;
    public static final defpackage.ahof TEXT_PACKAGE_FQ_NAME;
    public static final defpackage.ahoj TO_STRING_NAME;
    public static final defpackage.afzo INSTANCE = new defpackage.afzo();
    public static final defpackage.ahoj BACKING_FIELD = defpackage.ahoj.identifier("field");

    static {
        defpackage.ahoj ahojVarIdentifier = defpackage.ahoj.identifier("value");
        DEFAULT_VALUE_PARAMETER = ahojVarIdentifier;
        ENUM_VALUES = defpackage.ahoj.identifier("values");
        ENUM_ENTRIES = defpackage.ahoj.identifier("entries");
        ENUM_VALUE_OF = defpackage.ahoj.identifier("valueOf");
        DATA_CLASS_COPY = defpackage.ahoj.identifier("copy");
        DATA_CLASS_COMPONENT_PREFIX = "component";
        HASHCODE_NAME = defpackage.ahoj.identifier("hashCode");
        TO_STRING_NAME = defpackage.ahoj.identifier("toString");
        EQUALS_NAME = defpackage.ahoj.identifier("equals");
        CHAR_CODE = defpackage.ahoj.identifier("code");
        NAME = defpackage.ahoj.identifier("name");
        MAIN = defpackage.ahoj.identifier("main");
        NEXT_CHAR = defpackage.ahoj.identifier("nextChar");
        IMPLICIT_LAMBDA_PARAMETER_NAME = defpackage.ahoj.identifier("it");
        CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME = defpackage.ahoj.identifier("count");
        DEFAULT_IMPLS_CLASS_NAME = defpackage.ahoj.identifier("DefaultImpls");
        DYNAMIC_FQ_NAME = new defpackage.ahof("<dynamic>");
        defpackage.ahof ahofVar = new defpackage.ahof("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME = ahofVar;
        COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new defpackage.ahof("kotlin.coroutines.jvm.internal");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new defpackage.ahof("kotlin.coroutines.intrinsics");
        COROUTINE_SUSPENDED_NAME = defpackage.ahoj.identifier("COROUTINE_SUSPENDED");
        CONTINUATION_INTERFACE_FQ_NAME = ahofVar.child(defpackage.ahoj.identifier("Continuation"));
        RESULT_FQ_NAME = new defpackage.ahof("kotlin.Result");
        defpackage.ahof ahofVar2 = new defpackage.ahof("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = ahofVar2;
        PREFIXES = defpackage.afga.ac("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        defpackage.ahoj ahojVarIdentifier2 = defpackage.ahoj.identifier("kotlin");
        BUILT_INS_PACKAGE_NAME = ahojVarIdentifier2;
        MAP_ENTRY_KEY = defpackage.ahoj.identifier("key");
        MAP_ENTRY_VALUE = ahojVarIdentifier;
        defpackage.ahof ahofVar3 = defpackage.ahof.Companion.topLevel(ahojVarIdentifier2);
        BUILT_INS_PACKAGE_FQ_NAME = ahofVar3;
        defpackage.ahof ahofVarChild = ahofVar3.child(defpackage.ahoj.identifier("annotation"));
        ANNOTATION_PACKAGE_FQ_NAME = ahofVarChild;
        defpackage.ahof ahofVarChild2 = ahofVar3.child(defpackage.ahoj.identifier("collections"));
        COLLECTIONS_PACKAGE_FQ_NAME = ahofVarChild2;
        SEQUENCES_PACKAGE_FQ_NAME = ahofVar3.child(defpackage.ahoj.identifier("sequences"));
        defpackage.ahof ahofVarChild3 = ahofVar3.child(defpackage.ahoj.identifier("ranges"));
        RANGES_PACKAGE_FQ_NAME = ahofVarChild3;
        TEXT_PACKAGE_FQ_NAME = ahofVar3.child(defpackage.ahoj.identifier("text"));
        defpackage.ahof ahofVarChild4 = ahofVar3.child(defpackage.ahoj.identifier("internal"));
        KOTLIN_INTERNAL_FQ_NAME = ahofVarChild4;
        defpackage.ahof ahofVarChild5 = ahofVar3.child(defpackage.ahoj.identifier("concurrent"));
        CONCURRENT_PACKAGE_FQ_NAME = ahofVarChild5;
        defpackage.ahof ahofVarChild6 = ahofVarChild5.child(defpackage.ahoj.identifier("atomics"));
        CONCURRENT_ATOMICS_PACKAGE_FQ_NAME = ahofVarChild6;
        NON_EXISTENT_CLASS = new defpackage.ahof("error.NonExistentClass");
        BUILT_INS_PACKAGE_FQ_NAMES = defpackage.afga.cc(new defpackage.ahof[]{ahofVar3, ahofVarChild2, ahofVarChild3, ahofVarChild, ahofVar2, ahofVarChild4, ahofVar, ahofVarChild6});
    }

    private afzo() {
    }

    public static final defpackage.ahod getFunctionClassId(int i) {
        return new defpackage.ahod(BUILT_INS_PACKAGE_FQ_NAME, defpackage.ahoj.identifier(getFunctionName(i)));
    }

    public static final java.lang.String getFunctionName(int i) {
        return defpackage.a.bo(i, "Function");
    }

    public static final defpackage.ahof getPrimitiveFqName(defpackage.afzi afziVar) {
        afziVar.getClass();
        return BUILT_INS_PACKAGE_FQ_NAME.child(afziVar.getTypeName());
    }

    public static final java.lang.String getSuspendFunctionName(int i) {
        return defpackage.agag.INSTANCE.getClassNamePrefix() + i;
    }

    public static final boolean isPrimitiveArray(defpackage.ahoh ahohVar) {
        ahohVar.getClass();
        return defpackage.afzn.arrayClassFqNameToPrimitiveType.get(ahohVar) != null;
    }
}
