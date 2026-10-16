package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class afzn {
    public static final defpackage.afzn INSTANCE;
    public static final defpackage.ahoh _boolean;
    public static final defpackage.ahoh _byte;
    public static final defpackage.ahoh _char;
    public static final defpackage.ahoh _double;
    public static final defpackage.ahoh _enum;
    public static final defpackage.ahoh _float;
    public static final defpackage.ahoh _int;
    public static final defpackage.ahoh _long;
    public static final defpackage.ahoh _short;
    public static final defpackage.ahof accessibleLateinitPropertyLiteral;
    public static final defpackage.ahof annotation;
    public static final defpackage.ahof annotationRetention;
    public static final defpackage.ahof annotationTarget;
    public static final defpackage.ahoh any;
    public static final defpackage.ahoh array;
    public static final java.util.Map<defpackage.ahoh, defpackage.afzi> arrayClassFqNameToPrimitiveType;
    public static final defpackage.ahof atomicArray;
    public static final defpackage.ahof atomicBoolean;
    public static final defpackage.ahof atomicInt;
    public static final defpackage.ahof atomicIntArray;
    public static final defpackage.ahof atomicLong;
    public static final defpackage.ahof atomicLongArray;
    public static final defpackage.ahof atomicReference;
    public static final defpackage.ahoh charSequence;
    public static final defpackage.ahoh cloneable;
    public static final defpackage.ahof collection;
    public static final defpackage.ahof comparable;
    public static final defpackage.ahof contextFunctionTypeParams;
    public static final defpackage.ahof deprecated;
    public static final defpackage.ahof deprecatedSinceKotlin;
    public static final defpackage.ahof deprecationLevel;
    public static final defpackage.ahof extensionFunctionType;
    public static final defpackage.ahoh findAssociatedObject;
    public static final java.util.Map<defpackage.ahoh, defpackage.afzi> fqNameToPrimitiveType;
    public static final defpackage.ahoh functionSupertype;
    public static final defpackage.ahoh intRange;
    public static final defpackage.ahof introducedAt;
    public static final defpackage.ahof iterable;
    public static final defpackage.ahof iterator;
    public static final defpackage.ahoh kCallable;
    public static final defpackage.ahoh kClass;
    public static final defpackage.ahoh kDeclarationContainer;
    public static final defpackage.ahoh kMutableProperty0;
    public static final defpackage.ahoh kMutableProperty1;
    public static final defpackage.ahoh kMutableProperty2;
    public static final defpackage.ahoh kMutablePropertyFqName;
    public static final defpackage.ahod kProperty;
    public static final defpackage.ahoh kProperty0;
    public static final defpackage.ahoh kProperty1;
    public static final defpackage.ahoh kProperty2;
    public static final defpackage.ahoh kPropertyFqName;
    public static final defpackage.ahoh kType;
    public static final defpackage.ahof list;
    public static final defpackage.ahof listIterator;
    public static final defpackage.ahoh longRange;
    public static final defpackage.ahof map;
    public static final defpackage.ahof mapEntry;
    public static final defpackage.ahof mustBeDocumented;
    public static final defpackage.ahof mutableCollection;
    public static final defpackage.ahof mutableIterable;
    public static final defpackage.ahof mutableIterator;
    public static final defpackage.ahof mutableList;
    public static final defpackage.ahof mutableListIterator;
    public static final defpackage.ahof mutableMap;
    public static final defpackage.ahof mutableMapEntry;
    public static final defpackage.ahof mutableSet;
    public static final defpackage.ahoh nothing;
    public static final defpackage.ahoh number;
    public static final defpackage.ahof parameterName;
    public static final defpackage.ahod parameterNameClassId;
    public static final defpackage.ahof platformDependent;
    public static final defpackage.ahod platformDependentClassId;
    public static final java.util.Set<defpackage.ahoj> primitiveArrayTypeShortNames;
    public static final java.util.Set<defpackage.ahoj> primitiveTypeShortNames;
    public static final defpackage.ahof publishedApi;
    public static final defpackage.ahof repeatable;
    public static final defpackage.ahod repeatableClassId;
    public static final defpackage.ahof replaceWith;
    public static final defpackage.ahof retention;
    public static final defpackage.ahod retentionClassId;
    public static final defpackage.ahof set;
    public static final defpackage.ahoh string;
    public static final defpackage.ahof suppress;
    public static final defpackage.ahof target;
    public static final defpackage.ahod targetClassId;
    public static final defpackage.ahof throwable;
    public static final defpackage.ahod uByte;
    public static final defpackage.ahof uByteArrayFqName;
    public static final defpackage.ahof uByteFqName;
    public static final defpackage.ahod uInt;
    public static final defpackage.ahof uIntArrayFqName;
    public static final defpackage.ahof uIntFqName;
    public static final defpackage.ahod uLong;
    public static final defpackage.ahof uLongArrayFqName;
    public static final defpackage.ahof uLongFqName;
    public static final defpackage.ahod uShort;
    public static final defpackage.ahof uShortArrayFqName;
    public static final defpackage.ahof uShortFqName;
    public static final defpackage.ahoh unit;
    public static final defpackage.ahof unsafeVariance;

    static {
        defpackage.afzn afznVar = new defpackage.afzn();
        INSTANCE = afznVar;
        any = afznVar.fqNameUnsafe("Any");
        nothing = afznVar.fqNameUnsafe("Nothing");
        cloneable = afznVar.fqNameUnsafe("Cloneable");
        suppress = afznVar.fqName("Suppress");
        unit = afznVar.fqNameUnsafe("Unit");
        charSequence = afznVar.fqNameUnsafe("CharSequence");
        string = afznVar.fqNameUnsafe("String");
        array = afznVar.fqNameUnsafe("Array");
        _boolean = afznVar.fqNameUnsafe("Boolean");
        _char = afznVar.fqNameUnsafe("Char");
        _byte = afznVar.fqNameUnsafe("Byte");
        _short = afznVar.fqNameUnsafe("Short");
        _int = afznVar.fqNameUnsafe("Int");
        _long = afznVar.fqNameUnsafe("Long");
        _float = afznVar.fqNameUnsafe("Float");
        _double = afznVar.fqNameUnsafe("Double");
        number = afznVar.fqNameUnsafe("Number");
        _enum = afznVar.fqNameUnsafe("Enum");
        functionSupertype = afznVar.fqNameUnsafe("Function");
        throwable = afznVar.fqName("Throwable");
        comparable = afznVar.fqName("Comparable");
        intRange = afznVar.rangesFqName("IntRange");
        longRange = afznVar.rangesFqName("LongRange");
        deprecated = afznVar.fqName("Deprecated");
        deprecatedSinceKotlin = afznVar.fqName("DeprecatedSinceKotlin");
        deprecationLevel = afznVar.fqName("DeprecationLevel");
        replaceWith = afznVar.fqName("ReplaceWith");
        extensionFunctionType = afznVar.fqName("ExtensionFunctionType");
        contextFunctionTypeParams = afznVar.fqName("ContextFunctionTypeParams");
        defpackage.ahof ahofVarFqName = afznVar.fqName("ParameterName");
        parameterName = ahofVarFqName;
        parameterNameClassId = defpackage.ahod.Companion.topLevel(ahofVarFqName);
        annotation = afznVar.fqName("Annotation");
        defpackage.ahof ahofVarAnnotationName = afznVar.annotationName("Target");
        target = ahofVarAnnotationName;
        targetClassId = defpackage.ahod.Companion.topLevel(ahofVarAnnotationName);
        annotationTarget = afznVar.annotationName("AnnotationTarget");
        annotationRetention = afznVar.annotationName("AnnotationRetention");
        defpackage.ahof ahofVarAnnotationName2 = afznVar.annotationName("Retention");
        retention = ahofVarAnnotationName2;
        retentionClassId = defpackage.ahod.Companion.topLevel(ahofVarAnnotationName2);
        defpackage.ahof ahofVarAnnotationName3 = afznVar.annotationName("Repeatable");
        repeatable = ahofVarAnnotationName3;
        repeatableClassId = defpackage.ahod.Companion.topLevel(ahofVarAnnotationName3);
        mustBeDocumented = afznVar.annotationName("MustBeDocumented");
        unsafeVariance = afznVar.fqName("UnsafeVariance");
        publishedApi = afznVar.fqName("PublishedApi");
        accessibleLateinitPropertyLiteral = afznVar.internalName("AccessibleLateinitPropertyLiteral");
        defpackage.ahof ahofVar = new defpackage.ahof("kotlin.internal.PlatformDependent");
        platformDependent = ahofVar;
        platformDependentClassId = defpackage.ahod.Companion.topLevel(ahofVar);
        introducedAt = afznVar.fqName("IntroducedAt");
        iterator = afznVar.collectionsFqName("Iterator");
        iterable = afznVar.collectionsFqName("Iterable");
        collection = afznVar.collectionsFqName("Collection");
        list = afznVar.collectionsFqName("List");
        listIterator = afznVar.collectionsFqName("ListIterator");
        set = afznVar.collectionsFqName("Set");
        defpackage.ahof ahofVarCollectionsFqName = afznVar.collectionsFqName("Map");
        map = ahofVarCollectionsFqName;
        mapEntry = ahofVarCollectionsFqName.child(defpackage.ahoj.identifier("Entry"));
        mutableIterator = afznVar.collectionsFqName("MutableIterator");
        mutableIterable = afznVar.collectionsFqName("MutableIterable");
        mutableCollection = afznVar.collectionsFqName("MutableCollection");
        mutableList = afznVar.collectionsFqName("MutableList");
        mutableListIterator = afznVar.collectionsFqName("MutableListIterator");
        mutableSet = afznVar.collectionsFqName("MutableSet");
        defpackage.ahof ahofVarCollectionsFqName2 = afznVar.collectionsFqName("MutableMap");
        mutableMap = ahofVarCollectionsFqName2;
        mutableMapEntry = ahofVarCollectionsFqName2.child(defpackage.ahoj.identifier("MutableEntry"));
        kClass = reflect("KClass");
        kType = reflect("KType");
        kCallable = reflect("KCallable");
        kProperty0 = reflect("KProperty0");
        kProperty1 = reflect("KProperty1");
        kProperty2 = reflect("KProperty2");
        kMutableProperty0 = reflect("KMutableProperty0");
        kMutableProperty1 = reflect("KMutableProperty1");
        kMutableProperty2 = reflect("KMutableProperty2");
        defpackage.ahoh ahohVarReflect = reflect("KProperty");
        kPropertyFqName = ahohVarReflect;
        kMutablePropertyFqName = reflect("KMutableProperty");
        kProperty = defpackage.ahod.Companion.topLevel(ahohVarReflect.toSafe());
        kDeclarationContainer = reflect("KDeclarationContainer");
        findAssociatedObject = reflect("findAssociatedObject");
        defpackage.ahof ahofVarFqName2 = afznVar.fqName("UByte");
        uByteFqName = ahofVarFqName2;
        defpackage.ahof ahofVarFqName3 = afznVar.fqName("UShort");
        uShortFqName = ahofVarFqName3;
        defpackage.ahof ahofVarFqName4 = afznVar.fqName("UInt");
        uIntFqName = ahofVarFqName4;
        defpackage.ahof ahofVarFqName5 = afznVar.fqName("ULong");
        uLongFqName = ahofVarFqName5;
        uByte = defpackage.ahod.Companion.topLevel(ahofVarFqName2);
        uShort = defpackage.ahod.Companion.topLevel(ahofVarFqName3);
        uInt = defpackage.ahod.Companion.topLevel(ahofVarFqName4);
        uLong = defpackage.ahod.Companion.topLevel(ahofVarFqName5);
        uByteArrayFqName = afznVar.fqName("UByteArray");
        uShortArrayFqName = afznVar.fqName("UShortArray");
        uIntArrayFqName = afznVar.fqName("UIntArray");
        uLongArrayFqName = afznVar.fqName("ULongArray");
        atomicInt = afznVar.concurrentAtomics("AtomicInt");
        atomicLong = afznVar.concurrentAtomics("AtomicLong");
        atomicBoolean = afznVar.concurrentAtomics("AtomicBoolean");
        atomicReference = afznVar.concurrentAtomics("AtomicReference");
        atomicIntArray = afznVar.concurrentAtomics("AtomicIntArray");
        atomicLongArray = afznVar.concurrentAtomics("AtomicLongArray");
        atomicArray = afznVar.concurrentAtomics("AtomicArray");
        java.util.HashSet hashSetNewHashSetWithExpectedSize = defpackage.aipw.newHashSetWithExpectedSize(defpackage.afzi.values().length);
        for (defpackage.afzi afziVar : defpackage.afzi.values()) {
            hashSetNewHashSetWithExpectedSize.add(afziVar.getTypeName());
        }
        primitiveTypeShortNames = hashSetNewHashSetWithExpectedSize;
        java.util.HashSet hashSetNewHashSetWithExpectedSize2 = defpackage.aipw.newHashSetWithExpectedSize(defpackage.afzi.values().length);
        for (defpackage.afzi afziVar2 : defpackage.afzi.values()) {
            hashSetNewHashSetWithExpectedSize2.add(afziVar2.getArrayTypeName());
        }
        primitiveArrayTypeShortNames = hashSetNewHashSetWithExpectedSize2;
        java.util.HashMap mapNewHashMapWithExpectedSize = defpackage.aipw.newHashMapWithExpectedSize(defpackage.afzi.values().length);
        for (defpackage.afzi afziVar3 : defpackage.afzi.values()) {
            java.lang.String strAsString = afziVar3.getTypeName().asString();
            strAsString.getClass();
            mapNewHashMapWithExpectedSize.put(INSTANCE.fqNameUnsafe(strAsString), afziVar3);
        }
        fqNameToPrimitiveType = mapNewHashMapWithExpectedSize;
        java.util.HashMap mapNewHashMapWithExpectedSize2 = defpackage.aipw.newHashMapWithExpectedSize(defpackage.afzi.values().length);
        for (defpackage.afzi afziVar4 : defpackage.afzi.values()) {
            java.lang.String strAsString2 = afziVar4.getArrayTypeName().asString();
            strAsString2.getClass();
            mapNewHashMapWithExpectedSize2.put(INSTANCE.fqNameUnsafe(strAsString2), afziVar4);
        }
        arrayClassFqNameToPrimitiveType = mapNewHashMapWithExpectedSize2;
    }

    private afzn() {
    }

    private final defpackage.ahof annotationName(java.lang.String str) {
        return defpackage.afzo.ANNOTATION_PACKAGE_FQ_NAME.child(defpackage.ahoj.identifier(str));
    }

    private final defpackage.ahof collectionsFqName(java.lang.String str) {
        return defpackage.afzo.COLLECTIONS_PACKAGE_FQ_NAME.child(defpackage.ahoj.identifier(str));
    }

    private final defpackage.ahof concurrentAtomics(java.lang.String str) {
        return defpackage.afzo.CONCURRENT_ATOMICS_PACKAGE_FQ_NAME.child(defpackage.ahoj.identifier(str));
    }

    private final defpackage.ahof fqName(java.lang.String str) {
        return defpackage.afzo.BUILT_INS_PACKAGE_FQ_NAME.child(defpackage.ahoj.identifier(str));
    }

    private final defpackage.ahoh fqNameUnsafe(java.lang.String str) {
        return fqName(str).toUnsafe();
    }

    private final defpackage.ahof internalName(java.lang.String str) {
        return defpackage.afzo.KOTLIN_INTERNAL_FQ_NAME.child(defpackage.ahoj.identifier(str));
    }

    private final defpackage.ahoh rangesFqName(java.lang.String str) {
        return defpackage.afzo.RANGES_PACKAGE_FQ_NAME.child(defpackage.ahoj.identifier(str)).toUnsafe();
    }

    public static final defpackage.ahoh reflect(java.lang.String str) {
        str.getClass();
        return defpackage.afzo.KOTLIN_REFLECT_FQ_NAME.child(defpackage.ahoj.identifier(str)).toUnsafe();
    }
}
