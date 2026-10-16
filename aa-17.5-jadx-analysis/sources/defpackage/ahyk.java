package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ahyk {
    private final agcu module;
    private final agdb notFoundClasses;

    public ahyk(agcu agcuVar, agdb agdbVar) {
        agcuVar.getClass();
        agdbVar.getClass();
        this.module = agcuVar;
        this.notFoundClasses = agdbVar;
    }

    private final boolean doesValueConformToExpectedType(ahuh<?> ahuhVar, aigl aiglVar, ahgu ahguVar) {
        ahgt type = ahguVar.getType();
        if (type != null) {
            int iOrdinal = type.ordinal();
            if (iOrdinal == 9) {
                agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
                agba agbaVar = declarationDescriptor instanceof agba ? (agba) declarationDescriptor : null;
                return agbaVar == null || afye.isKClass(agbaVar);
            }
            if (iOrdinal == 12) {
                if (ahuhVar instanceof ahuc) {
                    ahuc ahucVar = (ahuc) ahuhVar;
                    if (ahucVar.getValue().size() == ahguVar.getArrayElementList().size()) {
                        aigl arrayElementTypeOrNull = getBuiltIns().getArrayElementTypeOrNull(aiglVar);
                        if (arrayElementTypeOrNull == null) {
                            return false;
                        }
                        afbk it = woy.bm(ahucVar.getValue()).iterator();
                        while (((afgz) it).a) {
                            int iA = it.a();
                            ahuh<?> ahuhVar2 = ahucVar.getValue().get(iA);
                            ahgu arrayElement = ahguVar.getArrayElement(iA);
                            arrayElement.getClass();
                            if (!doesValueConformToExpectedType(ahuhVar2, arrayElementTypeOrNull, arrayElement)) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                Objects.toString(ahuhVar);
                throw new IllegalStateException("Deserialized ArrayValue should have the same number of elements as the original array value: ".concat(String.valueOf(ahuhVar)));
            }
        }
        return affa.f(ahuhVar.getType(this.module), aiglVar);
    }

    private final afye getBuiltIns() {
        return this.module.getBuiltIns();
    }

    private final aezu<ahnj, ahuh<?>> resolveArgument(ahgv ahgvVar, Map<ahnj, ? extends agel> map, ahld ahldVar) {
        agel agelVar = map.get(ahzz.getName(ahldVar, ahgvVar.getNameId()));
        if (agelVar == null) {
            return null;
        }
        ahnj name = ahzz.getName(ahldVar, ahgvVar.getNameId());
        aigl type = agelVar.getType();
        type.getClass();
        ahgu value = ahgvVar.getValue();
        value.getClass();
        return new aezu<>(name, resolveValueAndCheckExpectedType(type, value, ahldVar));
    }

    private final agba resolveClass(ahnd ahndVar) {
        return agch.findNonGenericClassAcrossDependencies(this.module, ahndVar, this.notFoundClasses);
    }

    private final ahuh<?> resolveValueAndCheckExpectedType(aigl aiglVar, ahgu ahguVar, ahld ahldVar) {
        ahuh<?> ahuhVarResolveValue = resolveValue(aiglVar, ahguVar, ahldVar);
        if (true != doesValueConformToExpectedType(ahuhVarResolveValue, aiglVar, ahguVar)) {
            ahuhVarResolveValue = null;
        }
        if (ahuhVarResolveValue != null) {
            return ahuhVarResolveValue;
        }
        return ahuo.Companion.create("Unexpected argument value: actual type " + ahguVar.getType() + " != expected type " + aiglVar);
    }

    public final agfc deserializeAnnotation(ahgx ahgxVar, ahld ahldVar) {
        ahgxVar.getClass();
        ahldVar.getClass();
        agba agbaVarResolveClass = resolveClass(ahzz.getClassId(ahldVar, ahgxVar.getId()));
        Map mapBc = afbf.a;
        if (ahgxVar.getArgumentCount() != 0 && !ailm.isError(agbaVarResolveClass) && ahst.isAnnotationClass(agbaVarResolveClass)) {
            Collection<agaz> constructors = agbaVarResolveClass.getConstructors();
            constructors.getClass();
            agaz agazVar = (agaz) woy.bO(constructors);
            if (agazVar != null) {
                List<agel> valueParameters = agazVar.getValueParameters();
                valueParameters.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(valueParameters, 10)), 16));
                for (Object obj : valueParameters) {
                    linkedHashMap.put(((agel) obj).getName(), obj);
                }
                List<ahgv> argumentList = ahgxVar.getArgumentList();
                argumentList.getClass();
                ArrayList arrayList = new ArrayList();
                for (ahgv ahgvVar : argumentList) {
                    ahgvVar.getClass();
                    aezu<ahnj, ahuh<?>> aezuVarResolveArgument = resolveArgument(ahgvVar, linkedHashMap, ahldVar);
                    if (aezuVarResolveArgument != null) {
                        arrayList.add(aezuVarResolveArgument);
                    }
                }
                mapBc = woy.bc(arrayList);
            }
        }
        return new agfd(agbaVarResolveClass.getDefaultType(), mapBc, agdx.NO_SOURCE);
    }

    public final ahuh<?> resolveValue(aigl aiglVar, ahgu ahguVar, ahld ahldVar) {
        aiglVar.getClass();
        ahguVar.getClass();
        ahldVar.getClass();
        boolean zBooleanValue = ahla.IS_UNSIGNED.get(ahguVar.getFlags()).booleanValue();
        ahgt type = ahguVar.getType();
        if (type != null) {
            switch (type) {
                case BYTE:
                    byte intValue = (byte) ahguVar.getIntValue();
                    return zBooleanValue ? new ahvk(intValue) : new ahue(intValue);
                case CHAR:
                    return new ahuf((char) ahguVar.getIntValue());
                case SHORT:
                    short intValue2 = (short) ahguVar.getIntValue();
                    return zBooleanValue ? new ahvn(intValue2) : new ahvg(intValue2);
                case INT:
                    int intValue3 = (int) ahguVar.getIntValue();
                    return zBooleanValue ? new ahvl(intValue3) : new ahuq(intValue3);
                case LONG:
                    long intValue4 = ahguVar.getIntValue();
                    return zBooleanValue ? new ahvm(intValue4) : new ahvd(intValue4);
                case FLOAT:
                    return new ahup(ahguVar.getFloatValue());
                case DOUBLE:
                    return new ahuk(ahguVar.getDoubleValue());
                case BOOLEAN:
                    return new ahud(ahguVar.getIntValue() != 0);
                case STRING:
                    return new ahvh(ahldVar.getString(ahguVar.getStringValue()));
                case CLASS:
                    return new ahvc(ahzz.getClassId(ahldVar, ahguVar.getClassId()), ahguVar.getArrayDimensionCount());
                case ENUM:
                    return new ahul(ahzz.getClassId(ahldVar, ahguVar.getClassId()), ahzz.getName(ahldVar, ahguVar.getEnumValueId()));
                case ANNOTATION:
                    ahgx annotation = ahguVar.getAnnotation();
                    annotation.getClass();
                    return new ahub(deserializeAnnotation(annotation, ahldVar));
                case ARRAY:
                    ahuj ahujVar = ahuj.INSTANCE;
                    List<ahgu> arrayElementList = ahguVar.getArrayElementList();
                    arrayElementList.getClass();
                    ArrayList arrayList = new ArrayList(woy.bp(arrayElementList, 10));
                    for (ahgu ahguVar2 : arrayElementList) {
                        aigw anyType = getBuiltIns().getAnyType();
                        anyType.getClass();
                        ahguVar2.getClass();
                        arrayList.add(resolveValue(anyType, ahguVar2, ahldVar));
                    }
                    return ahujVar.createArrayValue(arrayList, aiglVar);
            }
        }
        throw new IllegalStateException("Unsupported annotation argument type: " + ahguVar.getType() + " (expected " + aiglVar + ')');
    }
}
