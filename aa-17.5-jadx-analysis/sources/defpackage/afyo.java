package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class afyo {
    public static final ahnf ANNOTATION_PACKAGE_FQ_NAME;
    public static final ahnf BUILT_INS_PACKAGE_FQ_NAME;
    public static final Set<ahnf> BUILT_INS_PACKAGE_FQ_NAMES;
    public static final ahnj BUILT_INS_PACKAGE_NAME;
    public static final ahnj CHAR_CODE;
    public static final ahnf COLLECTIONS_PACKAGE_FQ_NAME;
    public static final ahnf CONCURRENT_ATOMICS_PACKAGE_FQ_NAME;
    public static final ahnf CONCURRENT_PACKAGE_FQ_NAME;
    public static final ahnj CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME;
    public static final ahnf CONTINUATION_INTERFACE_FQ_NAME;
    public static final ahnf COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;
    public static final ahnf COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;
    public static final ahnf COROUTINES_PACKAGE_FQ_NAME;
    public static final ahnj COROUTINE_SUSPENDED_NAME;
    public static final String DATA_CLASS_COMPONENT_PREFIX;
    public static final ahnj DATA_CLASS_COPY;
    public static final ahnj DEFAULT_IMPLS_CLASS_NAME;
    public static final ahnj DEFAULT_VALUE_PARAMETER;
    public static final ahnf DYNAMIC_FQ_NAME;
    public static final ahnj ENUM_ENTRIES;
    public static final ahnj ENUM_VALUES;
    public static final ahnj ENUM_VALUE_OF;
    public static final ahnj EQUALS_NAME;
    public static final ahnj HASHCODE_NAME;
    public static final ahnj IMPLICIT_LAMBDA_PARAMETER_NAME;
    public static final ahnf KOTLIN_INTERNAL_FQ_NAME;
    public static final ahnf KOTLIN_REFLECT_FQ_NAME;
    public static final ahnj MAIN;
    public static final ahnj MAP_ENTRY_KEY;
    public static final ahnj MAP_ENTRY_VALUE;
    public static final ahnj NAME;
    public static final ahnj NEXT_CHAR;
    private static final ahnf NON_EXISTENT_CLASS;
    public static final List<String> PREFIXES;
    public static final ahnf RANGES_PACKAGE_FQ_NAME;
    public static final ahnf RESULT_FQ_NAME;
    public static final ahnf SEQUENCES_PACKAGE_FQ_NAME;
    public static final ahnf TEXT_PACKAGE_FQ_NAME;
    public static final ahnj TO_STRING_NAME;
    public static final afyo INSTANCE = new afyo();
    public static final ahnj BACKING_FIELD = ahnj.identifier("field");

    static {
        ahnj ahnjVarIdentifier = ahnj.identifier("value");
        DEFAULT_VALUE_PARAMETER = ahnjVarIdentifier;
        ENUM_VALUES = ahnj.identifier("values");
        ENUM_ENTRIES = ahnj.identifier("entries");
        ENUM_VALUE_OF = ahnj.identifier("valueOf");
        DATA_CLASS_COPY = ahnj.identifier("copy");
        DATA_CLASS_COMPONENT_PREFIX = "component";
        HASHCODE_NAME = ahnj.identifier("hashCode");
        TO_STRING_NAME = ahnj.identifier("toString");
        EQUALS_NAME = ahnj.identifier("equals");
        CHAR_CODE = ahnj.identifier("code");
        NAME = ahnj.identifier("name");
        MAIN = ahnj.identifier("main");
        NEXT_CHAR = ahnj.identifier("nextChar");
        IMPLICIT_LAMBDA_PARAMETER_NAME = ahnj.identifier("it");
        CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME = ahnj.identifier("count");
        DEFAULT_IMPLS_CLASS_NAME = ahnj.identifier("DefaultImpls");
        DYNAMIC_FQ_NAME = new ahnf("<dynamic>");
        ahnf ahnfVar = new ahnf("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME = ahnfVar;
        COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new ahnf("kotlin.coroutines.jvm.internal");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new ahnf("kotlin.coroutines.intrinsics");
        COROUTINE_SUSPENDED_NAME = ahnj.identifier("COROUTINE_SUSPENDED");
        CONTINUATION_INTERFACE_FQ_NAME = ahnfVar.child(ahnj.identifier("Continuation"));
        RESULT_FQ_NAME = new ahnf("kotlin.Result");
        ahnf ahnfVar2 = new ahnf("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = ahnfVar2;
        PREFIXES = woy.bi("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        ahnj ahnjVarIdentifier2 = ahnj.identifier("kotlin");
        BUILT_INS_PACKAGE_NAME = ahnjVarIdentifier2;
        MAP_ENTRY_KEY = ahnj.identifier("key");
        MAP_ENTRY_VALUE = ahnjVarIdentifier;
        ahnf ahnfVar3 = ahnf.Companion.topLevel(ahnjVarIdentifier2);
        BUILT_INS_PACKAGE_FQ_NAME = ahnfVar3;
        ahnf ahnfVarChild = ahnfVar3.child(ahnj.identifier("annotation"));
        ANNOTATION_PACKAGE_FQ_NAME = ahnfVarChild;
        ahnf ahnfVarChild2 = ahnfVar3.child(ahnj.identifier("collections"));
        COLLECTIONS_PACKAGE_FQ_NAME = ahnfVarChild2;
        SEQUENCES_PACKAGE_FQ_NAME = ahnfVar3.child(ahnj.identifier("sequences"));
        ahnf ahnfVarChild3 = ahnfVar3.child(ahnj.identifier("ranges"));
        RANGES_PACKAGE_FQ_NAME = ahnfVarChild3;
        TEXT_PACKAGE_FQ_NAME = ahnfVar3.child(ahnj.identifier("text"));
        ahnf ahnfVarChild4 = ahnfVar3.child(ahnj.identifier("internal"));
        KOTLIN_INTERNAL_FQ_NAME = ahnfVarChild4;
        ahnf ahnfVarChild5 = ahnfVar3.child(ahnj.identifier("concurrent"));
        CONCURRENT_PACKAGE_FQ_NAME = ahnfVarChild5;
        ahnf ahnfVarChild6 = ahnfVarChild5.child(ahnj.identifier("atomics"));
        CONCURRENT_ATOMICS_PACKAGE_FQ_NAME = ahnfVarChild6;
        NON_EXISTENT_CLASS = new ahnf("error.NonExistentClass");
        BUILT_INS_PACKAGE_FQ_NAMES = woy.di(new ahnf[]{ahnfVar3, ahnfVarChild2, ahnfVarChild3, ahnfVarChild, ahnfVar2, ahnfVarChild4, ahnfVar, ahnfVarChild6});
    }

    private afyo() {
    }

    public static final ahnd getFunctionClassId(int i) {
        return new ahnd(BUILT_INS_PACKAGE_FQ_NAME, ahnj.identifier(getFunctionName(i)));
    }

    public static final String getFunctionName(int i) {
        return a.bp(i, "Function");
    }

    public static final ahnf getPrimitiveFqName(afyi afyiVar) {
        afyiVar.getClass();
        return BUILT_INS_PACKAGE_FQ_NAME.child(afyiVar.getTypeName());
    }

    public static final String getSuspendFunctionName(int i) {
        return afzg.INSTANCE.getClassNamePrefix() + i;
    }

    public static final boolean isPrimitiveArray(ahnh ahnhVar) {
        ahnhVar.getClass();
        return afyn.arrayClassFqNameToPrimitiveType.get(ahnhVar) != null;
    }
}
