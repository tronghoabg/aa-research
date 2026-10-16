package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class afjz {
    public static final String computeJvmSignature(agoj agojVar, afrj afrjVar) {
        agojVar.getClass();
        afrjVar.getClass();
        agqp getterSignature = agqk.getGetterSignature(agojVar);
        if (getterSignature != null) {
            return getterSignature.toString();
        }
        agql fieldSignature = agqk.getFieldSignature(agojVar);
        if (fieldSignature == null) {
            return null;
        }
        return agth.getterName(fieldSignature.getName()) + getManglingSuffix(agojVar, afrjVar) + "()" + fieldSignature.getDescriptor();
    }

    public static final afdr<Type> convertTypeArgumentToJavaType(afdr<? extends aiqc> afdrVar, int i) {
        afdrVar.getClass();
        return new afjw(afdrVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type convertTypeArgumentToJavaType$lambda$0(afdr afdrVar, int i) {
        aiqc aiqcVar = (aiqc) afdrVar.invoke();
        aezr aezrVarDH = woy.dH(2, new afjy(aiqcVar));
        Type javaType = aiqcVar.getJavaType();
        if (javaType instanceof Class) {
            Class cls = (Class) javaType;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            componentType.getClass();
            return componentType;
        }
        if (javaType instanceof GenericArrayType) {
            if (i != 0) {
                Objects.toString(aiqcVar);
                throw new aftw("Array type has been queried for a non-0th argument: ".concat(String.valueOf(aiqcVar)));
            }
            Type genericComponentType = ((GenericArrayType) javaType).getGenericComponentType();
            genericComponentType.getClass();
            return genericComponentType;
        }
        if (!(javaType instanceof ParameterizedType)) {
            Objects.toString(aiqcVar);
            throw new aftw("Non-generic type has been queried for arguments: ".concat(String.valueOf(aiqcVar)));
        }
        Type type = convertTypeArgumentToJavaType$lambda$0$1(aezrVarDH).get(i);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        lowerBounds.getClass();
        Type type2 = (Type) woy.cV(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            upperBounds.getClass();
            type2 = (Type) woy.cU(upperBounds);
        }
        type2.getClass();
        return type2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List convertTypeArgumentToJavaType$lambda$0$0(aiqc aiqcVar) {
        Type javaType = aiqcVar.getJavaType();
        javaType.getClass();
        return agkc.getParameterizedTypeArguments(javaType);
    }

    private static final List<Type> convertTypeArgumentToJavaType$lambda$0$1(aezr<? extends List<? extends Type>> aezrVar) {
        return (List) aezrVar.a();
    }

    public static final afsg createUnboundConstructor(agnw agnwVar, afrj afrjVar) {
        agnwVar.getClass();
        afrjVar.getClass();
        agqp signature = agqk.getSignature(agnwVar);
        if (signature != null) {
            return new afsb(afrjVar, signature.toString(), afeq.NO_RECEIVER, agnwVar);
        }
        throw new aftw("No signature for constructor (" + agnwVar.getValueParameters().size() + " parameters, declared in " + afrjVar + ')');
    }

    public static final afsg createUnboundFunction(agog agogVar, afrj afrjVar) {
        agogVar.getClass();
        afrjVar.getClass();
        agqp signature = agqk.getSignature(agogVar);
        if (signature != null) {
            return new afst(afrjVar, signature.toString(), afeq.NO_RECEIVER, agogVar, afpq.EMPTY);
        }
        throw new aftw("No signature for function: ".concat(String.valueOf(agogVar.getName())));
    }

    public static final aftr<?> createUnboundProperty(agoj agojVar, afrj afrjVar) {
        agojVar.getClass();
        afrjVar.getClass();
        char c = !agojVar.getContextParameters().isEmpty() ? (char) 65535 : agojVar.getReceiverParameterType() != null ? (char) 1 : (char) 0;
        String strComputeJvmSignature = computeJvmSignature(agojVar, afrjVar);
        if (strComputeJvmSignature == null) {
            throw new aftw("No field or getter signature for property: ".concat(String.valueOf(agojVar.getName())));
        }
        Object obj = afeq.NO_RECEIVER;
        return !agmo.isVar(agojVar) ? c != 65535 ? c != 0 ? new aftq(afrjVar, strComputeJvmSignature, obj, agojVar, afpq.EMPTY) : new aftm(afrjVar, strComputeJvmSignature, obj, agojVar, afpq.EMPTY) : new aftv(afrjVar, strComputeJvmSignature, obj, agojVar, afpq.EMPTY) : c != 65535 ? c != 0 ? new afsm(afrjVar, strComputeJvmSignature, obj, agojVar, afpq.EMPTY) : new afsj(afrjVar, strComputeJvmSignature, obj, agojVar, afpq.EMPTY) : new afsp(afrjVar, strComputeJvmSignature, obj, agojVar, afpq.EMPTY);
    }

    private static final String getManglingSuffix(agoj agojVar, afrj afrjVar) {
        if (agmo.getVisibility(agojVar) == agoz.INTERNAL && (afrjVar instanceof afqw)) {
            String moduleName$kotlin_reflection = ((afqw) afrjVar).getModuleName$kotlin_reflection();
            if (moduleName$kotlin_reflection == null) {
                moduleName$kotlin_reflection = "main";
            }
            return "$" + ahnl.sanitizeAsJavaIdentifier(moduleName$kotlin_reflection);
        }
        if (agmo.getVisibility(agojVar) != agoz.PRIVATE || !(afrjVar instanceof afrt)) {
            return "";
        }
        afrt afrtVar = (afrt) afrjVar;
        if (!afrtVar.isMultifilePart$kotlin_reflection()) {
            return "";
        }
        return "$" + afrtVar.getJClass().getSimpleName();
    }

    public static final afhe<?> loadKClass(ClassLoader classLoader, String str, boolean z) {
        Class<?> primitiveByWrapper;
        classLoader.getClass();
        str.getClass();
        Class<?> clsLoadClass$default = afvu.loadClass$default(classLoader, toClassId(str), 0, 2, null);
        if (clsLoadClass$default != null) {
            if (!z && (primitiveByWrapper = agkc.getPrimitiveByWrapper(clsLoadClass$default)) != null) {
                clsLoadClass$default = primitiveByWrapper;
            }
            if (clsLoadClass$default != null) {
                return affa.l(clsLoadClass$default);
            }
        }
        return null;
    }

    public static /* synthetic */ afhe loadKClass$default(ClassLoader classLoader, String str, boolean z, int i, Object obj) {
        return loadKClass(classLoader, str, z & ((i & 2) == 0));
    }

    public static final Annotation toAnnotation(agms agmsVar, ClassLoader classLoader) {
        agmsVar.getClass();
        classLoader.getClass();
        Class clsLoadClass$default = afvu.loadClass$default(classLoader, toClassId(agmsVar.getClassName()), 0, 2, null);
        if (clsLoadClass$default == null) {
            throw new aftw("Annotation class not found: ".concat(String.valueOf(agmsVar.getClassName())));
        }
        Map<String, agnp> arguments = agmsVar.getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(arguments.size()));
        Iterator<T> it = arguments.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), toAnnotationArgument((agnp) entry.getValue(), agmsVar.getClassName(), (String) entry.getKey(), classLoader));
        }
        return (Annotation) afwd.createAnnotationInstance$default(clsLoadClass$default, linkedHashMap, null, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.Object toAnnotationArgument(defpackage.agnp r8, java.lang.String r9, java.lang.String r10, java.lang.ClassLoader r11) throws java.lang.ArrayIndexOutOfBoundsException, java.lang.IllegalArgumentException, java.lang.NegativeArraySizeException {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afjz.toAnnotationArgument(agnp, java.lang.String, java.lang.String, java.lang.ClassLoader):java.lang.Object");
    }

    public static final ahnd toClassId(String str) {
        str.getClass();
        boolean zG = afyh.g(str, ".", false);
        if (zG) {
            str = str.substring(1);
            str.getClass();
        }
        return new ahnd(new ahnf(afyh.I(afyh.s(str, '/', ""), '/', '.')), new ahnf(afyh.p(str, '/', str)), zG);
    }

    private static final afhf toClassifier(agnu agnuVar, ClassLoader classLoader, afvq afvqVar, List<afid> list, boolean z) {
        if (!(agnuVar instanceof agnr)) {
            if (agnuVar instanceof agns) {
                return new afru(toClassId(((agns) agnuVar).getName()).asSingleFqName());
            }
            if (!(agnuVar instanceof agnt)) {
                throw new aezs();
            }
            agnt agntVar = (agnt) agnuVar;
            afic aficVar = afvqVar.get(agntVar.getId());
            return aficVar != null ? aficVar : new afmt(agntVar.getId());
        }
        agnr agnrVar = (agnr) agnuVar;
        if (affa.f(agnrVar.getName(), "kotlin/Array")) {
            afib any = ((afid) woy.bN(list)).c;
            if (any == null) {
                any = afvm.INSTANCE.getANY();
            }
            return affa.l(afvu.createArrayType(affa.h(afir.f(any))));
        }
        afhe<?> afheVarLoadKClass = loadKClass(classLoader, agnrVar.getName(), z);
        if (afheVarLoadKClass != null) {
            return afheVarLoadKClass;
        }
        throw new aftw("Class not found: ".concat(String.valueOf(agnrVar.getName())));
    }

    public static final aiqc toKType(agol agolVar, ClassLoader classLoader, afvq afvqVar, boolean z, afdr<? extends Type> afdrVar) {
        aire aireVar;
        agolVar.getClass();
        classLoader.getClass();
        afvqVar.getClass();
        affv affvVar = new affv();
        List listJ = afrg.j(new aisb(afrg.p(afrg.f(agolVar, afjt.INSTANCE), afju.INSTANCE), new afjv(classLoader, afvqVar, afdrVar, affvVar), 0));
        afhf classifier = toClassifier(agolVar.getClassifier(), classLoader, afvqVar, listJ, agmo.isNullable(agolVar) || z);
        boolean zIsNullable = agmo.isNullable(agolVar);
        List<agms> annotations = agqk.getAnnotations(agolVar);
        ArrayList arrayList = new ArrayList(woy.bp(annotations, 10));
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            arrayList.add(toAnnotation((agms) it.next(), classLoader));
        }
        agol abbreviatedType = agolVar.getAbbreviatedType();
        aire aireVar2 = null;
        aiqc kType$default = abbreviatedType != null ? toKType$default(abbreviatedType, classLoader, afvqVar, false, null, 12, null) : null;
        boolean zIsDefinitelyNonNull = agmo.isDefinitelyNonNull(agolVar);
        agnu classifier2 = agolVar.getClassifier();
        agnr agnrVar = classifier2 instanceof agnr ? (agnr) classifier2 : null;
        affvVar.a = new aire(classifier, listJ, zIsNullable, arrayList, kType$default, zIsDefinitelyNonNull, affa.f(agnrVar != null ? agnrVar.getName() : null, "kotlin/Nothing"), agmo.isSuspend(agolVar), toMutableCollectionKClass(agolVar.getClassifier(), classifier), afdrVar);
        if (agmo.isSuspend(agolVar)) {
            Object obj = affvVar.a;
            if (obj == null) {
                affa.d("result");
                aireVar = null;
            } else {
                aireVar = (aire) obj;
            }
            aire aireVarUnwrapSuspendFunctionType = unwrapSuspendFunctionType(aireVar, afdrVar);
            if (aireVarUnwrapSuspendFunctionType == null) {
                StringBuilder sb = new StringBuilder("Invalid suspend function type: ");
                Object obj2 = affvVar.a;
                if (obj2 == null) {
                    affa.d("result");
                } else {
                    aireVar2 = (aire) obj2;
                }
                sb.append(aireVar2);
                throw new aftw(sb.toString());
            }
            affvVar.a = aireVarUnwrapSuspendFunctionType;
        }
        agof flexibleTypeUpperBound = agolVar.getFlexibleTypeUpperBound();
        if (flexibleTypeUpperBound == null || !affa.f(flexibleTypeUpperBound.getTypeFlexibilityId(), "kotlin.jvm.PlatformType")) {
            Object obj3 = affvVar.a;
            if (obj3 != null) {
                return (aire) obj3;
            }
            affa.d("result");
            return null;
        }
        aiqq aiqqVar = aiqr.Companion;
        Object obj4 = affvVar.a;
        if (obj4 == null) {
            affa.d("result");
        } else {
            aireVar2 = (aire) obj4;
        }
        return aiqqVar.create(aireVar2, toKType$default(flexibleTypeUpperBound.getType(), classLoader, afvqVar, false, null, 12, null), agqk.isRaw(agolVar), afdrVar);
    }

    public static /* synthetic */ aiqc toKType$default(agol agolVar, ClassLoader classLoader, afvq afvqVar, boolean z, afdr afdrVar, int i, Object obj) {
        boolean z2 = z & ((i & 4) == 0);
        if ((i & 8) != 0) {
            afdrVar = null;
        }
        return toKType(agolVar, classLoader, afvqVar, z2, afdrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agol toKType$lambda$0(agol agolVar) {
        agolVar.getClass();
        return agolVar.getOuterType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable toKType$lambda$1(agol agolVar) {
        agolVar.getClass();
        return agolVar.getArguments();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afid toKType$lambda$2(ClassLoader classLoader, afvq afvqVar, afdr afdrVar, affv affvVar, int i, agop agopVar) {
        aiqc kType;
        agopVar.getClass();
        if (affa.f(agopVar, agop.STAR)) {
            return afid.a;
        }
        agol type = agopVar.getType();
        if (type != null) {
            kType = toKType(type, classLoader, afvqVar, true, afdrVar == null ? null : convertTypeArgumentToJavaType(new afjx(affvVar), i));
        } else {
            kType = null;
        }
        agor variance = agopVar.getVariance();
        return new afid(variance != null ? toKVariance(variance) : null, kType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aiqc toKType$lambda$2$0(affv affvVar) {
        Object obj = affvVar.a;
        if (obj != null) {
            return (aire) obj;
        }
        affa.d("result");
        return null;
    }

    public static final afie toKVariance(agor agorVar) {
        agorVar.getClass();
        agor agorVar2 = agor.INVARIANT;
        agoz agozVar = agoz.INTERNAL;
        int iOrdinal = agorVar.ordinal();
        if (iOrdinal == 0) {
            return afie.a;
        }
        if (iOrdinal == 1) {
            return afie.b;
        }
        if (iOrdinal == 2) {
            return afie.c;
        }
        throw new aezs();
    }

    public static final afif toKVisibility(agoz agozVar) {
        agozVar.getClass();
        agor agorVar = agor.INVARIANT;
        agoz agozVar2 = agoz.INTERNAL;
        int iOrdinal = agozVar.ordinal();
        if (iOrdinal == 0) {
            return afif.c;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return afif.b;
            }
            if (iOrdinal == 3) {
                return afif.a;
            }
            if (iOrdinal != 4) {
                if (iOrdinal == 5) {
                    return null;
                }
                throw new aezs();
            }
        }
        return afif.d;
    }

    private static final aiqx<?> toMutableCollectionKClass(agnu agnuVar, afhf afhfVar) {
        String name;
        agnr agnrVar = agnuVar instanceof agnr ? (agnr) agnuVar : null;
        if (agnrVar != null && (name = agnrVar.getName()) != null) {
            ahnd classId = toClassId(name);
            if (afzq.INSTANCE.isMutable(classId)) {
                ahnf ahnfVarAsSingleFqName = classId.asSingleFqName();
                afhfVar.getClass();
                return aira.getMutableCollectionKClass(ahnfVarAsSingleFqName, (afhe) afhfVar);
            }
        }
        return null;
    }

    public static final String toNonLocalSimpleName(String str) {
        str.getClass();
        if (afyh.g(str, ".", false)) {
            throw new IllegalArgumentException("Local class is not supported: ".concat(str));
        }
        String strP = afyh.p(str, '/', str);
        return afyh.p(strP, '.', strP);
    }

    private static final aire unwrapSuspendFunctionType(aire aireVar, afdr<? extends Type> afdrVar) {
        afib afibVar;
        afid afidVar;
        afib afibVar2;
        if (!aireVar.isSuspendFunctionType()) {
            Objects.toString(aireVar);
            throw new IllegalArgumentException("Not a suspend function type: ".concat(String.valueOf(aireVar)));
        }
        afid afidVar2 = (afid) woy.bI(aireVar.getArguments(), aireVar.getArguments().size() - 2);
        if (afidVar2 == null || (afibVar = afidVar2.c) == null || !affa.f(afibVar.getClassifier(), affw.b(afck.class)) || (afidVar = (afid) woy.bP(afibVar.getArguments())) == null || (afibVar2 = afidVar.c) == null) {
            return null;
        }
        return new aire(aireVar.getClassifier(), woy.bZ(woy.bS(aireVar.getArguments(), 2), afik.f(afibVar2)), aireVar.isMarkedNullable(), aireVar.getAnnotations(), aireVar.getAbbreviation(), aireVar.isDefinitelyNotNullType(), aireVar.isNothingType(), true, aireVar.getMutableCollectionClass(), afdrVar);
    }
}
