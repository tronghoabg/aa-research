package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ahnn {
    private static final ahnd AbstractMap;
    private static final ahnd Annotation;
    private static final ahnd AnnotationRetention;
    private static final ahnd AnnotationTarget;
    private static final ahnd Any;
    private static final ahnd Array;
    private static final ahnd AtomicArray;
    private static final ahnd AtomicBoolean;
    private static final ahnd AtomicInt;
    private static final ahnd AtomicIntArray;
    private static final ahnd AtomicLong;
    private static final ahnd AtomicLongArray;
    private static final ahnd AtomicReference;
    private static final ahnf BASE_ANNOTATIONS_JVM_PACKAGE;
    private static final ahnf BASE_ANNOTATION_PACKAGE;
    private static final ahnf BASE_COLLECTIONS_PACKAGE;
    private static final ahnf BASE_CONCURRENT_ATOMICS_PACKAGE;
    private static final ahnf BASE_CONCURRENT_PACKAGE;
    private static final ahnf BASE_CONTRACTS_PACKAGE;
    private static final ahnf BASE_COROUTINES_INTRINSICS_PACKAGE;
    private static final ahnf BASE_COROUTINES_PACKAGE;
    private static final ahnf BASE_ENUMS_PACKAGE;
    private static final ahnf BASE_EXPERIMENTAL_PACKAGE;
    private static final ahnf BASE_INTERNAL_IR_PACKAGE;
    private static final ahnf BASE_INTERNAL_PACKAGE;
    private static final ahnf BASE_JS_PACKAGE;
    private static final ahnf BASE_JVM_FUNCTIONS_PACKAGE;
    private static final ahnf BASE_JVM_INTERNAL_PACKAGE;
    private static final ahnf BASE_JVM_PACKAGE;
    private static final ahnf BASE_KOTLIN_PACKAGE;
    private static final ahnf BASE_RANGES_PACKAGE;
    private static final ahnf BASE_REFLECT_PACKAGE;
    private static final ahnf BASE_SEQUENCES_PACKAGE;
    private static final ahnf BASE_TEST_PACKAGE;
    private static final ahnf BASE_TEXT_PACKAGE;
    private static final ahnd Boolean;
    private static final ahnd Byte;
    private static final ahnd Char;
    private static final ahnd CharIterator;
    private static final ahnd CharRange;
    private static final ahnd CharSequence;
    private static final ahnd Cloneable;
    private static final ahnd Collection;
    private static final ahnd Comparable;
    private static final ahnd Continuation;
    private static final ahnd CoroutineContext;
    private static final ahnd DeprecationLevel;
    private static final ahnd Double;
    private static final ahnd Enum;
    private static final ahnd EnumEntries;
    private static final ahnd Float;
    private static final ahnd Function;
    public static final ahnn INSTANCE = new ahnn();
    private static final ahnd Int;
    private static final ahnd IntRange;
    private static final ahnd Iterable;
    private static final ahnd Iterator;
    private static final ahnd KCallable;
    private static final ahnd KClass;
    private static final ahnd KFunction;
    private static final ahnd KMutableProperty;
    private static final ahnd KMutableProperty0;
    private static final ahnd KMutableProperty1;
    private static final ahnd KMutableProperty2;
    private static final ahnd KProperty;
    private static final ahnd KProperty0;
    private static final ahnd KProperty1;
    private static final ahnd KProperty2;
    private static final ahnd KType;
    private static final ahnd List;
    private static final ahnd ListIterator;
    private static final ahnd Long;
    private static final ahnd LongRange;
    private static final ahnd Map;
    private static final ahnd MapEntry;
    private static final ahnd MutableCollection;
    private static final ahnd MutableIterable;
    private static final ahnd MutableIterator;
    private static final ahnd MutableList;
    private static final ahnd MutableListIterator;
    private static final ahnd MutableMap;
    private static final ahnd MutableMapEntry;
    private static final ahnd MutableSet;
    private static final ahnd Nothing;
    private static final ahnd Number;
    private static final ahnd Result;
    private static final ahnd Sequence;
    private static final ahnd Set;
    private static final ahnd Short;
    private static final ahnd String;
    private static final ahnd SuspendFunction;
    private static final ahnd Throwable;
    private static final ahnd UByte;
    private static final ahnd UInt;
    private static final ahnd ULong;
    private static final ahnd UShort;
    private static final ahnd Unit;
    private static final Set<ahnd> allBuiltinTypes;
    private static final Map<ahnd, ahnd> atomicArrayByPrimitive;
    private static final Map<ahnd, ahnd> atomicByPrimitive;
    private static final Set<ahnf> builtInsPackages;
    private static final Set<ahnf> builtInsPackagesWithDefaultNamedImport;
    private static final Set<ahnd> constantAllowedTypes;
    private static final Map<ahnd, ahnd> elementTypeByPrimitiveArrayType;
    private static final Map<ahnd, ahnd> elementTypeByUnsignedArrayType;
    private static final Map<ahnd, ahnd> primitiveArrayTypeByElementType;
    private static final Set<ahnd> primitiveTypes;
    private static final Set<ahnd> signedIntegerTypes;
    private static final Map<ahnd, ahnd> unsignedArrayTypeByElementType;
    private static final Set<ahnd> unsignedTypes;

    static {
        ahnf ahnfVar = new ahnf("kotlin");
        BASE_KOTLIN_PACKAGE = ahnfVar;
        ahnf ahnfVarChild = ahnfVar.child(ahnj.identifier("reflect"));
        BASE_REFLECT_PACKAGE = ahnfVarChild;
        BASE_EXPERIMENTAL_PACKAGE = ahnfVar.child(ahnj.identifier("experimental"));
        ahnf ahnfVarChild2 = ahnfVar.child(ahnj.identifier("collections"));
        BASE_COLLECTIONS_PACKAGE = ahnfVarChild2;
        BASE_SEQUENCES_PACKAGE = ahnfVar.child(ahnj.identifier("sequences"));
        ahnf ahnfVarChild3 = ahnfVar.child(ahnj.identifier("ranges"));
        BASE_RANGES_PACKAGE = ahnfVarChild3;
        ahnf ahnfVarChild4 = ahnfVar.child(ahnj.identifier("jvm"));
        BASE_JVM_PACKAGE = ahnfVarChild4;
        BASE_JS_PACKAGE = ahnfVar.child(ahnj.identifier("js"));
        BASE_ANNOTATIONS_JVM_PACKAGE = ahnfVar.child(ahnj.identifier("annotations")).child(ahnj.identifier("jvm"));
        BASE_JVM_INTERNAL_PACKAGE = ahnfVarChild4.child(ahnj.identifier("internal"));
        BASE_JVM_FUNCTIONS_PACKAGE = ahnfVarChild4.child(ahnj.identifier("functions"));
        ahnf ahnfVarChild5 = ahnfVar.child(ahnj.identifier("annotation"));
        BASE_ANNOTATION_PACKAGE = ahnfVarChild5;
        ahnf ahnfVarChild6 = ahnfVar.child(ahnj.identifier("internal"));
        BASE_INTERNAL_PACKAGE = ahnfVarChild6;
        BASE_INTERNAL_IR_PACKAGE = ahnfVarChild6.child(ahnj.identifier("ir"));
        ahnf ahnfVarChild7 = ahnfVar.child(ahnj.identifier("coroutines"));
        BASE_COROUTINES_PACKAGE = ahnfVarChild7;
        BASE_COROUTINES_INTRINSICS_PACKAGE = ahnfVarChild7.child(ahnj.identifier("intrinsics"));
        BASE_ENUMS_PACKAGE = ahnfVar.child(ahnj.identifier("enums"));
        BASE_CONTRACTS_PACKAGE = ahnfVar.child(ahnj.identifier("contracts"));
        ahnf ahnfVarChild8 = ahnfVar.child(ahnj.identifier("concurrent"));
        BASE_CONCURRENT_PACKAGE = ahnfVarChild8;
        ahnf ahnfVarChild9 = ahnfVarChild8.child(ahnj.identifier("atomics"));
        BASE_CONCURRENT_ATOMICS_PACKAGE = ahnfVarChild9;
        BASE_TEST_PACKAGE = ahnfVar.child(ahnj.identifier("test"));
        BASE_TEXT_PACKAGE = ahnfVar.child(ahnj.identifier("text"));
        builtInsPackagesWithDefaultNamedImport = woy.di(new ahnf[]{ahnfVar, ahnfVarChild2, ahnfVarChild3, ahnfVarChild5});
        builtInsPackages = woy.di(new ahnf[]{ahnfVar, ahnfVarChild2, ahnfVarChild3, ahnfVarChild5, ahnfVarChild, ahnfVarChild6, ahnfVarChild7, ahnfVarChild9});
        Nothing = ahno.baseId("Nothing");
        Unit = ahno.baseId("Unit");
        Any = ahno.baseId("Any");
        Enum = ahno.baseId("Enum");
        Annotation = ahno.baseId("Annotation");
        Array = ahno.baseId("Array");
        ahnd ahndVarBaseId = ahno.baseId("Boolean");
        Boolean = ahndVarBaseId;
        ahnd ahndVarBaseId2 = ahno.baseId("Char");
        Char = ahndVarBaseId2;
        ahnd ahndVarBaseId3 = ahno.baseId("Byte");
        Byte = ahndVarBaseId3;
        ahnd ahndVarBaseId4 = ahno.baseId("Short");
        Short = ahndVarBaseId4;
        ahnd ahndVarBaseId5 = ahno.baseId("Int");
        Int = ahndVarBaseId5;
        ahnd ahndVarBaseId6 = ahno.baseId("Long");
        Long = ahndVarBaseId6;
        ahnd ahndVarBaseId7 = ahno.baseId("Float");
        Float = ahndVarBaseId7;
        ahnd ahndVarBaseId8 = ahno.baseId("Double");
        Double = ahndVarBaseId8;
        UByte = ahno.unsignedId(ahndVarBaseId3);
        UShort = ahno.unsignedId(ahndVarBaseId4);
        UInt = ahno.unsignedId(ahndVarBaseId5);
        ULong = ahno.unsignedId(ahndVarBaseId6);
        CharSequence = ahno.baseId("CharSequence");
        String = ahno.baseId("String");
        Throwable = ahno.baseId("Throwable");
        Cloneable = ahno.baseId("Cloneable");
        KProperty = ahno.reflectId("KProperty");
        KMutableProperty = ahno.reflectId("KMutableProperty");
        KProperty0 = ahno.reflectId("KProperty0");
        KMutableProperty0 = ahno.reflectId("KMutableProperty0");
        KProperty1 = ahno.reflectId("KProperty1");
        KMutableProperty1 = ahno.reflectId("KMutableProperty1");
        KProperty2 = ahno.reflectId("KProperty2");
        KMutableProperty2 = ahno.reflectId("KMutableProperty2");
        KFunction = ahno.reflectId("KFunction");
        KClass = ahno.reflectId("KClass");
        KCallable = ahno.reflectId("KCallable");
        KType = ahno.reflectId("KType");
        Sequence = ahno.sequencesId("Sequence");
        Comparable = ahno.baseId("Comparable");
        Number = ahno.baseId("Number");
        Function = ahno.baseId("Function");
        SuspendFunction = ahno.coroutinesId("SuspendFunction");
        Set<ahnd> setDi = woy.di(new ahnd[]{ahndVarBaseId, ahndVarBaseId2, ahndVarBaseId3, ahndVarBaseId4, ahndVarBaseId5, ahndVarBaseId6, ahndVarBaseId7, ahndVarBaseId8});
        primitiveTypes = setDi;
        signedIntegerTypes = woy.di(new ahnd[]{ahndVarBaseId3, ahndVarBaseId4, ahndVarBaseId5, ahndVarBaseId6});
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(setDi, 10)), 16));
        for (Object obj : setDi) {
            linkedHashMap.put(obj, ahno.primitiveArrayId(((ahnd) obj).getShortClassName()));
        }
        primitiveArrayTypeByElementType = linkedHashMap;
        elementTypeByPrimitiveArrayType = ahno.inverseMap(linkedHashMap);
        Set<ahnd> setDi2 = woy.di(new ahnd[]{UByte, UShort, UInt, ULong});
        unsignedTypes = setDi2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(afpt.e(woy.aV(woy.bp(setDi2, 10)), 16));
        for (Object obj2 : setDi2) {
            linkedHashMap2.put(obj2, ahno.primitiveArrayId(((ahnd) obj2).getShortClassName()));
        }
        unsignedArrayTypeByElementType = linkedHashMap2;
        elementTypeByUnsignedArrayType = ahno.inverseMap(linkedHashMap2);
        Set<ahnd> set = primitiveTypes;
        Set<ahnd> set2 = unsignedTypes;
        Set setAS = woy.aS(set, set2);
        ahnd ahndVar = String;
        constantAllowedTypes = woy.aT(setAS, ahndVar);
        Continuation = ahno.coroutinesId("Continuation");
        CoroutineContext = ahno.coroutinesId("CoroutineContext");
        Iterator = ahno.collectionsId("Iterator");
        Iterable = ahno.collectionsId("Iterable");
        Collection = ahno.collectionsId("Collection");
        List = ahno.collectionsId("List");
        ListIterator = ahno.collectionsId("ListIterator");
        Set = ahno.collectionsId("Set");
        ahnd ahndVarCollectionsId = ahno.collectionsId("Map");
        Map = ahndVarCollectionsId;
        AbstractMap = ahno.collectionsId("AbstractMap");
        MutableIterator = ahno.collectionsId("MutableIterator");
        CharIterator = ahno.collectionsId("CharIterator");
        MutableIterable = ahno.collectionsId("MutableIterable");
        MutableCollection = ahno.collectionsId("MutableCollection");
        MutableList = ahno.collectionsId("MutableList");
        MutableListIterator = ahno.collectionsId("MutableListIterator");
        MutableSet = ahno.collectionsId("MutableSet");
        ahnd ahndVarCollectionsId2 = ahno.collectionsId("MutableMap");
        MutableMap = ahndVarCollectionsId2;
        MapEntry = ahndVarCollectionsId.createNestedClassId(ahnj.identifier("Entry"));
        MutableMapEntry = ahndVarCollectionsId2.createNestedClassId(ahnj.identifier("MutableEntry"));
        Result = ahno.baseId("Result");
        IntRange = ahno.rangesId("IntRange");
        LongRange = ahno.rangesId("LongRange");
        CharRange = ahno.rangesId("CharRange");
        AnnotationRetention = ahno.annotationId("AnnotationRetention");
        AnnotationTarget = ahno.annotationId("AnnotationTarget");
        DeprecationLevel = ahno.baseId("DeprecationLevel");
        EnumEntries = ahno.enumsId("EnumEntries");
        ahnd ahndVarAtomicsId = ahno.atomicsId("AtomicBoolean");
        AtomicBoolean = ahndVarAtomicsId;
        ahnd ahndVarAtomicsId2 = ahno.atomicsId("AtomicInt");
        AtomicInt = ahndVarAtomicsId2;
        ahnd ahndVarAtomicsId3 = ahno.atomicsId("AtomicLong");
        AtomicLong = ahndVarAtomicsId3;
        AtomicReference = ahno.atomicsId("AtomicReference");
        ahnd ahndVar2 = Int;
        ahnd ahndVar3 = Long;
        atomicByPrimitive = woy.ba(new aezu(Boolean, ahndVarAtomicsId), new aezu(ahndVar2, ahndVarAtomicsId2), new aezu(ahndVar3, ahndVarAtomicsId3));
        AtomicArray = ahno.atomicsId("AtomicArray");
        ahnd ahndVarAtomicsId4 = ahno.atomicsId("AtomicIntArray");
        AtomicIntArray = ahndVarAtomicsId4;
        ahnd ahndVarAtomicsId5 = ahno.atomicsId("AtomicLongArray");
        AtomicLongArray = ahndVarAtomicsId5;
        atomicArrayByPrimitive = woy.ba(new aezu(ahndVar2, ahndVarAtomicsId4), new aezu(ahndVar3, ahndVarAtomicsId5));
        allBuiltinTypes = woy.aT(woy.aT(woy.aT(woy.aT(woy.aS(set, set2), ahndVar), Unit), Any), Enum);
    }

    private ahnn() {
    }

    public final ahnd getArray() {
        return Array;
    }

    public final ahnf getBASE_ANNOTATION_PACKAGE() {
        return BASE_ANNOTATION_PACKAGE;
    }

    public final ahnf getBASE_COLLECTIONS_PACKAGE() {
        return BASE_COLLECTIONS_PACKAGE;
    }

    public final ahnf getBASE_CONCURRENT_ATOMICS_PACKAGE() {
        return BASE_CONCURRENT_ATOMICS_PACKAGE;
    }

    public final ahnf getBASE_COROUTINES_PACKAGE() {
        return BASE_COROUTINES_PACKAGE;
    }

    public final ahnf getBASE_ENUMS_PACKAGE() {
        return BASE_ENUMS_PACKAGE;
    }

    public final ahnf getBASE_KOTLIN_PACKAGE() {
        return BASE_KOTLIN_PACKAGE;
    }

    public final ahnf getBASE_RANGES_PACKAGE() {
        return BASE_RANGES_PACKAGE;
    }

    public final ahnf getBASE_REFLECT_PACKAGE() {
        return BASE_REFLECT_PACKAGE;
    }

    public final ahnf getBASE_SEQUENCES_PACKAGE() {
        return BASE_SEQUENCES_PACKAGE;
    }

    public final ahnd getEnumEntries() {
        return EnumEntries;
    }

    public final ahnd getKClass() {
        return KClass;
    }

    public final ahnd getKFunction() {
        return KFunction;
    }

    public final ahnd getMutableList() {
        return MutableList;
    }

    public final ahnd getMutableMap() {
        return MutableMap;
    }

    public final ahnd getMutableSet() {
        return MutableSet;
    }
}
