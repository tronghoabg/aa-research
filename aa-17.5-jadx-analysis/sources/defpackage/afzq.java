package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class afzq {
    private static final ahnd CLASS_CLASS_ID;
    private static final ahnd FUNCTION_N_CLASS_ID;
    private static final ahnf FUNCTION_N_FQ_NAME;
    public static final afzq INSTANCE;
    private static final ahnd K_CLASS_CLASS_ID;
    private static final ahnd K_FUNCTION_CLASS_ID;
    private static final String NUMBERED_FUNCTION_PREFIX;
    private static final String NUMBERED_K_FUNCTION_PREFIX;
    private static final String NUMBERED_K_SUSPEND_FUNCTION_PREFIX;
    private static final String NUMBERED_SUSPEND_FUNCTION_PREFIX;
    private static final HashMap<ahnh, ahnd> javaToKotlin;
    private static final HashMap<ahnh, ahnd> kotlinToJava;
    private static final Set<ahnf> mappedKotlinClassFqNames;
    private static final List<afzp> mutabilityMappings;
    private static final HashMap<ahnh, ahnf> mutableToReadOnly;
    private static final HashMap<ahnd, ahnd> mutableToReadOnlyClassId;
    private static final HashMap<ahnh, ahnf> readOnlyToMutable;
    private static final HashMap<ahnd, ahnd> readOnlyToMutableClassId;

    static {
        afzq afzqVar = new afzq();
        INSTANCE = afzqVar;
        NUMBERED_FUNCTION_PREFIX = afzd.INSTANCE.getPackageFqName() + '.' + afzd.INSTANCE.getClassNamePrefix();
        NUMBERED_K_FUNCTION_PREFIX = afze.INSTANCE.getPackageFqName() + '.' + afze.INSTANCE.getClassNamePrefix();
        NUMBERED_SUSPEND_FUNCTION_PREFIX = afzg.INSTANCE.getPackageFqName() + '.' + afzg.INSTANCE.getClassNamePrefix();
        NUMBERED_K_SUSPEND_FUNCTION_PREFIX = afzf.INSTANCE.getPackageFqName() + '.' + afzf.INSTANCE.getClassNamePrefix();
        ahnd ahndVar = ahnd.Companion.topLevel(new ahnf("kotlin.jvm.functions.FunctionN"));
        FUNCTION_N_CLASS_ID = ahndVar;
        FUNCTION_N_FQ_NAME = ahndVar.asSingleFqName();
        K_FUNCTION_CLASS_ID = ahnn.INSTANCE.getKFunction();
        K_CLASS_CLASS_ID = ahnn.INSTANCE.getKClass();
        CLASS_CLASS_ID = afzqVar.classId(Class.class);
        javaToKotlin = new HashMap<>();
        kotlinToJava = new HashMap<>();
        mutableToReadOnly = new HashMap<>();
        readOnlyToMutable = new HashMap<>();
        mutableToReadOnlyClassId = new HashMap<>();
        readOnlyToMutableClassId = new HashMap<>();
        mappedKotlinClassFqNames = new LinkedHashSet();
        ahnd ahndVar2 = ahnd.Companion.topLevel(afyn.iterable);
        ahnd ahndVar3 = new ahnd(ahndVar2.getPackageFqName(), ahni.tail(afyn.mutableIterable, ahndVar2.getPackageFqName()), false);
        ahnd ahndVar4 = ahnd.Companion.topLevel(afyn.iterator);
        ahnd ahndVar5 = new ahnd(ahndVar4.getPackageFqName(), ahni.tail(afyn.mutableIterator, ahndVar4.getPackageFqName()), false);
        ahnd ahndVar6 = ahnd.Companion.topLevel(afyn.collection);
        ahnd ahndVar7 = new ahnd(ahndVar6.getPackageFqName(), ahni.tail(afyn.mutableCollection, ahndVar6.getPackageFqName()), false);
        ahnd ahndVar8 = ahnd.Companion.topLevel(afyn.list);
        ahnd ahndVar9 = new ahnd(ahndVar8.getPackageFqName(), ahni.tail(afyn.mutableList, ahndVar8.getPackageFqName()), false);
        ahnd ahndVar10 = ahnd.Companion.topLevel(afyn.set);
        ahnd ahndVar11 = new ahnd(ahndVar10.getPackageFqName(), ahni.tail(afyn.mutableSet, ahndVar10.getPackageFqName()), false);
        ahnd ahndVar12 = ahnd.Companion.topLevel(afyn.listIterator);
        ahnd ahndVar13 = new ahnd(ahndVar12.getPackageFqName(), ahni.tail(afyn.mutableListIterator, ahndVar12.getPackageFqName()), false);
        ahnd ahndVar14 = ahnd.Companion.topLevel(afyn.map);
        ahnd ahndVar15 = new ahnd(ahndVar14.getPackageFqName(), ahni.tail(afyn.mutableMap, ahndVar14.getPackageFqName()), false);
        ahnd ahndVarCreateNestedClassId = ahnd.Companion.topLevel(afyn.map).createNestedClassId(afyn.mapEntry.shortName());
        List<afzp> listBi = woy.bi(new afzp(afzqVar.classId(Iterable.class), ahndVar2, ahndVar3), new afzp(afzqVar.classId(Iterator.class), ahndVar4, ahndVar5), new afzp(afzqVar.classId(Collection.class), ahndVar6, ahndVar7), new afzp(afzqVar.classId(List.class), ahndVar8, ahndVar9), new afzp(afzqVar.classId(Set.class), ahndVar10, ahndVar11), new afzp(afzqVar.classId(ListIterator.class), ahndVar12, ahndVar13), new afzp(afzqVar.classId(Map.class), ahndVar14, ahndVar15), new afzp(afzqVar.classId(Map.Entry.class), ahndVarCreateNestedClassId, new ahnd(ahndVarCreateNestedClassId.getPackageFqName(), ahni.tail(afyn.mutableMapEntry, ahndVarCreateNestedClassId.getPackageFqName()), false)));
        mutabilityMappings = listBi;
        afzqVar.addTopLevel(Object.class, afyn.any);
        afzqVar.addTopLevel(String.class, afyn.string);
        afzqVar.addTopLevel(CharSequence.class, afyn.charSequence);
        afzqVar.addTopLevel(Throwable.class, afyn.throwable);
        afzqVar.addTopLevel(Cloneable.class, afyn.cloneable);
        afzqVar.addTopLevel(Number.class, afyn.number);
        afzqVar.addTopLevel(Comparable.class, afyn.comparable);
        afzqVar.addTopLevel(Enum.class, afyn._enum);
        afzqVar.addTopLevel(Annotation.class, afyn.annotation);
        Iterator<afzp> it = listBi.iterator();
        while (it.hasNext()) {
            INSTANCE.addMapping(it.next());
        }
        for (ahwe ahweVar : ahwe.values()) {
            ahnc ahncVar = ahnd.Companion;
            ahnf wrapperFqName = ahweVar.getWrapperFqName();
            wrapperFqName.getClass();
            ahnd ahndVar16 = ahncVar.topLevel(wrapperFqName);
            ahnc ahncVar2 = ahnd.Companion;
            afyi primitiveType = ahweVar.getPrimitiveType();
            primitiveType.getClass();
            INSTANCE.add(ahndVar16, ahncVar2.topLevel(afyo.getPrimitiveFqName(primitiveType)));
        }
        for (ahnd ahndVar17 : afxs.INSTANCE.allClassesWithIntrinsicCompanions()) {
            INSTANCE.add(ahnd.Companion.topLevel(new ahnf("kotlin.jvm.internal." + ahndVar17.getShortClassName().asString() + "CompanionObject")), ahndVar17.createNestedClassId(ahnm.DEFAULT_NAME_FOR_COMPANION_OBJECT));
        }
        for (int i = 0; i < 23; i++) {
            ahnd ahndVar18 = ahnd.Companion.topLevel(new ahnf(a.bp(i, "kotlin.jvm.functions.Function")));
            ahnd functionClassId = afyo.getFunctionClassId(i);
            afzq afzqVar2 = INSTANCE;
            afzqVar2.add(ahndVar18, functionClassId);
            afzqVar2.addKotlinToJava(new ahnf(NUMBERED_K_FUNCTION_PREFIX + i), K_FUNCTION_CLASS_ID);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            INSTANCE.addKotlinToJava(new ahnf(NUMBERED_K_SUSPEND_FUNCTION_PREFIX + i2), K_FUNCTION_CLASS_ID);
        }
        ahnf ahnfVar = new ahnf("kotlin.concurrent.atomics.AtomicInt");
        afzq afzqVar3 = INSTANCE;
        afzqVar3.addKotlinToJava(ahnfVar, afzqVar3.classId(AtomicInteger.class));
        afzqVar3.addKotlinToJava(new ahnf("kotlin.concurrent.atomics.AtomicLong"), afzqVar3.classId(AtomicLong.class));
        afzqVar3.addKotlinToJava(new ahnf("kotlin.concurrent.atomics.AtomicBoolean"), afzqVar3.classId(AtomicBoolean.class));
        afzqVar3.addKotlinToJava(new ahnf("kotlin.concurrent.atomics.AtomicReference"), afzqVar3.classId(AtomicReference.class));
        afzqVar3.addKotlinToJava(new ahnf("kotlin.concurrent.atomics.AtomicIntArray"), afzqVar3.classId(AtomicIntegerArray.class));
        afzqVar3.addKotlinToJava(new ahnf("kotlin.concurrent.atomics.AtomicLongArray"), afzqVar3.classId(AtomicLongArray.class));
        afzqVar3.addKotlinToJava(new ahnf("kotlin.concurrent.atomics.AtomicArray"), afzqVar3.classId(AtomicReferenceArray.class));
        afzqVar3.addKotlinToJava(afyn.nothing.toSafe(), afzqVar3.classId(Void.class));
    }

    private afzq() {
    }

    private final void add(ahnd ahndVar, ahnd ahndVar2) {
        addJavaToKotlin(ahndVar, ahndVar2);
        addKotlinToJava(ahndVar2.asSingleFqName(), ahndVar);
    }

    private final void addJavaToKotlin(ahnd ahndVar, ahnd ahndVar2) {
        javaToKotlin.put(ahndVar.asSingleFqName().toUnsafe(), ahndVar2);
    }

    private final void addKotlinToJava(ahnf ahnfVar, ahnd ahndVar) {
        mappedKotlinClassFqNames.add(ahnfVar);
        kotlinToJava.put(ahnfVar.toUnsafe(), ahndVar);
    }

    private final void addMapping(afzp afzpVar) {
        ahnd ahndVarComponent1 = afzpVar.component1();
        ahnd ahndVarComponent2 = afzpVar.component2();
        ahnd ahndVarComponent3 = afzpVar.component3();
        add(ahndVarComponent1, ahndVarComponent2);
        addKotlinToJava(ahndVarComponent3.asSingleFqName(), ahndVarComponent1);
        mutableToReadOnlyClassId.put(ahndVarComponent3, ahndVarComponent2);
        readOnlyToMutableClassId.put(ahndVarComponent2, ahndVarComponent3);
        ahnf ahnfVarAsSingleFqName = ahndVarComponent2.asSingleFqName();
        ahnf ahnfVarAsSingleFqName2 = ahndVarComponent3.asSingleFqName();
        mutableToReadOnly.put(ahndVarComponent3.asSingleFqName().toUnsafe(), ahnfVarAsSingleFqName);
        readOnlyToMutable.put(ahnfVarAsSingleFqName.toUnsafe(), ahnfVarAsSingleFqName2);
    }

    private final void addTopLevel(Class<?> cls, ahnf ahnfVar) {
        add(classId(cls), ahnd.Companion.topLevel(ahnfVar));
    }

    private final ahnd classId(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return classId(declaringClass).createNestedClassId(ahnj.identifier(cls.getSimpleName()));
        }
        ahnc ahncVar = ahnd.Companion;
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        return ahncVar.topLevel(new ahnf(canonicalName));
    }

    private final boolean isKotlinFunctionWithBigArity(ahnh ahnhVar, String str, boolean z) {
        String strAsString = ahnhVar.asString();
        if (!afyh.g(strAsString, str, false)) {
            return false;
        }
        String strSubstring = strAsString.substring(str.length());
        strSubstring.getClass();
        if (!afyh.M(strSubstring, '0')) {
            Integer numC = afyh.c(strSubstring);
            int i = true != z ? 23 : 22;
            if (numC != null && numC.intValue() >= i) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean isKotlinFunctionWithBigArity$default(afzq afzqVar, ahnh ahnhVar, String str, boolean z, int i, Object obj) {
        return afzqVar.isKotlinFunctionWithBigArity(ahnhVar, str, z & ((i & 4) == 0));
    }

    public final ahnf getFUNCTION_N_FQ_NAME() {
        return FUNCTION_N_FQ_NAME;
    }

    public final List<afzp> getMutabilityMappings() {
        return mutabilityMappings;
    }

    public final boolean isMutable(ahnd ahndVar) {
        return mutableToReadOnlyClassId.containsKey(ahndVar);
    }

    public final boolean isReadOnly(ahnh ahnhVar) {
        return readOnlyToMutable.containsKey(ahnhVar);
    }

    public final ahnd mapJavaToKotlin(ahnf ahnfVar) {
        ahnfVar.getClass();
        return javaToKotlin.get(ahnfVar.toUnsafe());
    }

    public final ahnd mapKotlinToJava(ahnh ahnhVar) {
        ahnhVar.getClass();
        return isKotlinFunctionWithBigArity$default(this, ahnhVar, NUMBERED_FUNCTION_PREFIX, false, 4, null) ? FUNCTION_N_CLASS_ID : isKotlinFunctionWithBigArity(ahnhVar, NUMBERED_SUSPEND_FUNCTION_PREFIX, true) ? FUNCTION_N_CLASS_ID : isKotlinFunctionWithBigArity$default(this, ahnhVar, NUMBERED_K_FUNCTION_PREFIX, false, 4, null) ? K_FUNCTION_CLASS_ID : isKotlinFunctionWithBigArity(ahnhVar, NUMBERED_K_SUSPEND_FUNCTION_PREFIX, true) ? K_FUNCTION_CLASS_ID : kotlinToJava.get(ahnhVar);
    }

    public final ahnf mutableToReadOnly(ahnh ahnhVar) {
        return mutableToReadOnly.get(ahnhVar);
    }

    public final ahnf readOnlyToMutable(ahnh ahnhVar) {
        return readOnlyToMutable.get(ahnhVar);
    }

    public final boolean isMutable(ahnh ahnhVar) {
        return mutableToReadOnly.containsKey(ahnhVar);
    }

    private final void addTopLevel(Class<?> cls, ahnh ahnhVar) {
        addTopLevel(cls, ahnhVar.toSafe());
    }
}
