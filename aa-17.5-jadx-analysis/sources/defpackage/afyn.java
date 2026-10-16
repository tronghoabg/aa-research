package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class afyn {
    public static final afyn INSTANCE;
    public static final ahnh _boolean;
    public static final ahnh _byte;
    public static final ahnh _char;
    public static final ahnh _double;
    public static final ahnh _enum;
    public static final ahnh _float;
    public static final ahnh _int;
    public static final ahnh _long;
    public static final ahnh _short;
    public static final ahnf accessibleLateinitPropertyLiteral;
    public static final ahnf annotation;
    public static final ahnf annotationRetention;
    public static final ahnf annotationTarget;
    public static final ahnh any;
    public static final ahnh array;
    public static final Map<ahnh, afyi> arrayClassFqNameToPrimitiveType;
    public static final ahnf atomicArray;
    public static final ahnf atomicBoolean;
    public static final ahnf atomicInt;
    public static final ahnf atomicIntArray;
    public static final ahnf atomicLong;
    public static final ahnf atomicLongArray;
    public static final ahnf atomicReference;
    public static final ahnh charSequence;
    public static final ahnh cloneable;
    public static final ahnf collection;
    public static final ahnf comparable;
    public static final ahnf contextFunctionTypeParams;
    public static final ahnf deprecated;
    public static final ahnf deprecatedSinceKotlin;
    public static final ahnf deprecationLevel;
    public static final ahnf extensionFunctionType;
    public static final ahnh findAssociatedObject;
    public static final Map<ahnh, afyi> fqNameToPrimitiveType;
    public static final ahnh functionSupertype;
    public static final ahnh intRange;
    public static final ahnf introducedAt;
    public static final ahnf iterable;
    public static final ahnf iterator;
    public static final ahnh kCallable;
    public static final ahnh kClass;
    public static final ahnh kDeclarationContainer;
    public static final ahnh kMutableProperty0;
    public static final ahnh kMutableProperty1;
    public static final ahnh kMutableProperty2;
    public static final ahnh kMutablePropertyFqName;
    public static final ahnd kProperty;
    public static final ahnh kProperty0;
    public static final ahnh kProperty1;
    public static final ahnh kProperty2;
    public static final ahnh kPropertyFqName;
    public static final ahnh kType;
    public static final ahnf list;
    public static final ahnf listIterator;
    public static final ahnh longRange;
    public static final ahnf map;
    public static final ahnf mapEntry;
    public static final ahnf mustBeDocumented;
    public static final ahnf mutableCollection;
    public static final ahnf mutableIterable;
    public static final ahnf mutableIterator;
    public static final ahnf mutableList;
    public static final ahnf mutableListIterator;
    public static final ahnf mutableMap;
    public static final ahnf mutableMapEntry;
    public static final ahnf mutableSet;
    public static final ahnh nothing;
    public static final ahnh number;
    public static final ahnf parameterName;
    public static final ahnd parameterNameClassId;
    public static final ahnf platformDependent;
    public static final ahnd platformDependentClassId;
    public static final Set<ahnj> primitiveArrayTypeShortNames;
    public static final Set<ahnj> primitiveTypeShortNames;
    public static final ahnf publishedApi;
    public static final ahnf repeatable;
    public static final ahnd repeatableClassId;
    public static final ahnf replaceWith;
    public static final ahnf retention;
    public static final ahnd retentionClassId;
    public static final ahnf set;
    public static final ahnh string;
    public static final ahnf suppress;
    public static final ahnf target;
    public static final ahnd targetClassId;
    public static final ahnf throwable;
    public static final ahnd uByte;
    public static final ahnf uByteArrayFqName;
    public static final ahnf uByteFqName;
    public static final ahnd uInt;
    public static final ahnf uIntArrayFqName;
    public static final ahnf uIntFqName;
    public static final ahnd uLong;
    public static final ahnf uLongArrayFqName;
    public static final ahnf uLongFqName;
    public static final ahnd uShort;
    public static final ahnf uShortArrayFqName;
    public static final ahnf uShortFqName;
    public static final ahnh unit;
    public static final ahnf unsafeVariance;

    static {
        afyn afynVar = new afyn();
        INSTANCE = afynVar;
        any = afynVar.fqNameUnsafe("Any");
        nothing = afynVar.fqNameUnsafe("Nothing");
        cloneable = afynVar.fqNameUnsafe("Cloneable");
        suppress = afynVar.fqName("Suppress");
        unit = afynVar.fqNameUnsafe("Unit");
        charSequence = afynVar.fqNameUnsafe("CharSequence");
        string = afynVar.fqNameUnsafe("String");
        array = afynVar.fqNameUnsafe("Array");
        _boolean = afynVar.fqNameUnsafe("Boolean");
        _char = afynVar.fqNameUnsafe("Char");
        _byte = afynVar.fqNameUnsafe("Byte");
        _short = afynVar.fqNameUnsafe("Short");
        _int = afynVar.fqNameUnsafe("Int");
        _long = afynVar.fqNameUnsafe("Long");
        _float = afynVar.fqNameUnsafe("Float");
        _double = afynVar.fqNameUnsafe("Double");
        number = afynVar.fqNameUnsafe("Number");
        _enum = afynVar.fqNameUnsafe("Enum");
        functionSupertype = afynVar.fqNameUnsafe("Function");
        throwable = afynVar.fqName("Throwable");
        comparable = afynVar.fqName("Comparable");
        intRange = afynVar.rangesFqName("IntRange");
        longRange = afynVar.rangesFqName("LongRange");
        deprecated = afynVar.fqName("Deprecated");
        deprecatedSinceKotlin = afynVar.fqName("DeprecatedSinceKotlin");
        deprecationLevel = afynVar.fqName("DeprecationLevel");
        replaceWith = afynVar.fqName("ReplaceWith");
        extensionFunctionType = afynVar.fqName("ExtensionFunctionType");
        contextFunctionTypeParams = afynVar.fqName("ContextFunctionTypeParams");
        ahnf ahnfVarFqName = afynVar.fqName("ParameterName");
        parameterName = ahnfVarFqName;
        parameterNameClassId = ahnd.Companion.topLevel(ahnfVarFqName);
        annotation = afynVar.fqName("Annotation");
        ahnf ahnfVarAnnotationName = afynVar.annotationName("Target");
        target = ahnfVarAnnotationName;
        targetClassId = ahnd.Companion.topLevel(ahnfVarAnnotationName);
        annotationTarget = afynVar.annotationName("AnnotationTarget");
        annotationRetention = afynVar.annotationName("AnnotationRetention");
        ahnf ahnfVarAnnotationName2 = afynVar.annotationName("Retention");
        retention = ahnfVarAnnotationName2;
        retentionClassId = ahnd.Companion.topLevel(ahnfVarAnnotationName2);
        ahnf ahnfVarAnnotationName3 = afynVar.annotationName("Repeatable");
        repeatable = ahnfVarAnnotationName3;
        repeatableClassId = ahnd.Companion.topLevel(ahnfVarAnnotationName3);
        mustBeDocumented = afynVar.annotationName("MustBeDocumented");
        unsafeVariance = afynVar.fqName("UnsafeVariance");
        publishedApi = afynVar.fqName("PublishedApi");
        accessibleLateinitPropertyLiteral = afynVar.internalName("AccessibleLateinitPropertyLiteral");
        ahnf ahnfVar = new ahnf("kotlin.internal.PlatformDependent");
        platformDependent = ahnfVar;
        platformDependentClassId = ahnd.Companion.topLevel(ahnfVar);
        introducedAt = afynVar.fqName("IntroducedAt");
        iterator = afynVar.collectionsFqName("Iterator");
        iterable = afynVar.collectionsFqName("Iterable");
        collection = afynVar.collectionsFqName("Collection");
        list = afynVar.collectionsFqName("List");
        listIterator = afynVar.collectionsFqName("ListIterator");
        set = afynVar.collectionsFqName("Set");
        ahnf ahnfVarCollectionsFqName = afynVar.collectionsFqName("Map");
        map = ahnfVarCollectionsFqName;
        mapEntry = ahnfVarCollectionsFqName.child(ahnj.identifier("Entry"));
        mutableIterator = afynVar.collectionsFqName("MutableIterator");
        mutableIterable = afynVar.collectionsFqName("MutableIterable");
        mutableCollection = afynVar.collectionsFqName("MutableCollection");
        mutableList = afynVar.collectionsFqName("MutableList");
        mutableListIterator = afynVar.collectionsFqName("MutableListIterator");
        mutableSet = afynVar.collectionsFqName("MutableSet");
        ahnf ahnfVarCollectionsFqName2 = afynVar.collectionsFqName("MutableMap");
        mutableMap = ahnfVarCollectionsFqName2;
        mutableMapEntry = ahnfVarCollectionsFqName2.child(ahnj.identifier("MutableEntry"));
        kClass = reflect("KClass");
        kType = reflect("KType");
        kCallable = reflect("KCallable");
        kProperty0 = reflect("KProperty0");
        kProperty1 = reflect("KProperty1");
        kProperty2 = reflect("KProperty2");
        kMutableProperty0 = reflect("KMutableProperty0");
        kMutableProperty1 = reflect("KMutableProperty1");
        kMutableProperty2 = reflect("KMutableProperty2");
        ahnh ahnhVarReflect = reflect("KProperty");
        kPropertyFqName = ahnhVarReflect;
        kMutablePropertyFqName = reflect("KMutableProperty");
        kProperty = ahnd.Companion.topLevel(ahnhVarReflect.toSafe());
        kDeclarationContainer = reflect("KDeclarationContainer");
        findAssociatedObject = reflect("findAssociatedObject");
        ahnf ahnfVarFqName2 = afynVar.fqName("UByte");
        uByteFqName = ahnfVarFqName2;
        ahnf ahnfVarFqName3 = afynVar.fqName("UShort");
        uShortFqName = ahnfVarFqName3;
        ahnf ahnfVarFqName4 = afynVar.fqName("UInt");
        uIntFqName = ahnfVarFqName4;
        ahnf ahnfVarFqName5 = afynVar.fqName("ULong");
        uLongFqName = ahnfVarFqName5;
        uByte = ahnd.Companion.topLevel(ahnfVarFqName2);
        uShort = ahnd.Companion.topLevel(ahnfVarFqName3);
        uInt = ahnd.Companion.topLevel(ahnfVarFqName4);
        uLong = ahnd.Companion.topLevel(ahnfVarFqName5);
        uByteArrayFqName = afynVar.fqName("UByteArray");
        uShortArrayFqName = afynVar.fqName("UShortArray");
        uIntArrayFqName = afynVar.fqName("UIntArray");
        uLongArrayFqName = afynVar.fqName("ULongArray");
        atomicInt = afynVar.concurrentAtomics("AtomicInt");
        atomicLong = afynVar.concurrentAtomics("AtomicLong");
        atomicBoolean = afynVar.concurrentAtomics("AtomicBoolean");
        atomicReference = afynVar.concurrentAtomics("AtomicReference");
        atomicIntArray = afynVar.concurrentAtomics("AtomicIntArray");
        atomicLongArray = afynVar.concurrentAtomics("AtomicLongArray");
        atomicArray = afynVar.concurrentAtomics("AtomicArray");
        HashSet hashSetNewHashSetWithExpectedSize = aiow.newHashSetWithExpectedSize(afyi.values().length);
        for (afyi afyiVar : afyi.values()) {
            hashSetNewHashSetWithExpectedSize.add(afyiVar.getTypeName());
        }
        primitiveTypeShortNames = hashSetNewHashSetWithExpectedSize;
        HashSet hashSetNewHashSetWithExpectedSize2 = aiow.newHashSetWithExpectedSize(afyi.values().length);
        for (afyi afyiVar2 : afyi.values()) {
            hashSetNewHashSetWithExpectedSize2.add(afyiVar2.getArrayTypeName());
        }
        primitiveArrayTypeShortNames = hashSetNewHashSetWithExpectedSize2;
        HashMap mapNewHashMapWithExpectedSize = aiow.newHashMapWithExpectedSize(afyi.values().length);
        for (afyi afyiVar3 : afyi.values()) {
            String strAsString = afyiVar3.getTypeName().asString();
            strAsString.getClass();
            mapNewHashMapWithExpectedSize.put(INSTANCE.fqNameUnsafe(strAsString), afyiVar3);
        }
        fqNameToPrimitiveType = mapNewHashMapWithExpectedSize;
        HashMap mapNewHashMapWithExpectedSize2 = aiow.newHashMapWithExpectedSize(afyi.values().length);
        for (afyi afyiVar4 : afyi.values()) {
            String strAsString2 = afyiVar4.getArrayTypeName().asString();
            strAsString2.getClass();
            mapNewHashMapWithExpectedSize2.put(INSTANCE.fqNameUnsafe(strAsString2), afyiVar4);
        }
        arrayClassFqNameToPrimitiveType = mapNewHashMapWithExpectedSize2;
    }

    private afyn() {
    }

    private final ahnf annotationName(String str) {
        return afyo.ANNOTATION_PACKAGE_FQ_NAME.child(ahnj.identifier(str));
    }

    private final ahnf collectionsFqName(String str) {
        return afyo.COLLECTIONS_PACKAGE_FQ_NAME.child(ahnj.identifier(str));
    }

    private final ahnf concurrentAtomics(String str) {
        return afyo.CONCURRENT_ATOMICS_PACKAGE_FQ_NAME.child(ahnj.identifier(str));
    }

    private final ahnf fqName(String str) {
        return afyo.BUILT_INS_PACKAGE_FQ_NAME.child(ahnj.identifier(str));
    }

    private final ahnh fqNameUnsafe(String str) {
        return fqName(str).toUnsafe();
    }

    private final ahnf internalName(String str) {
        return afyo.KOTLIN_INTERNAL_FQ_NAME.child(ahnj.identifier(str));
    }

    private final ahnh rangesFqName(String str) {
        return afyo.RANGES_PACKAGE_FQ_NAME.child(ahnj.identifier(str)).toUnsafe();
    }

    public static final ahnh reflect(String str) {
        str.getClass();
        return afyo.KOTLIN_REFLECT_FQ_NAME.child(ahnj.identifier(str)).toUnsafe();
    }
}
