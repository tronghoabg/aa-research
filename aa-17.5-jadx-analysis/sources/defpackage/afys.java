package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class afys {
    public static final afys INSTANCE = new afys();
    private static final HashMap<ahnd, ahnd> arrayClassIdToUnsignedClassId;
    private static final Set<ahnj> arrayClassesShortNames;
    private static final Set<ahnj> unsignedArrayTypeNames;
    private static final HashMap<afyq, ahnj> unsignedArrayTypeToArrayCall;
    private static final HashMap<ahnd, ahnd> unsignedClassIdToArrayClassId;
    private static final Set<ahnj> unsignedTypeNames;

    static {
        afyr[] afyrVarArrValues = afyr.values();
        ArrayList arrayList = new ArrayList(afyrVarArrValues.length);
        for (afyr afyrVar : afyrVarArrValues) {
            arrayList.add(afyrVar.getTypeName());
        }
        unsignedTypeNames = woy.cl(arrayList);
        afyq[] afyqVarArrValues = afyq.values();
        ArrayList arrayList2 = new ArrayList(afyqVarArrValues.length);
        for (afyq afyqVar : afyqVarArrValues) {
            arrayList2.add(afyqVar.getTypeName());
        }
        unsignedArrayTypeNames = woy.cl(arrayList2);
        arrayClassIdToUnsignedClassId = new HashMap<>();
        unsignedClassIdToArrayClassId = new HashMap<>();
        unsignedArrayTypeToArrayCall = woy.aZ(new aezu(afyq.UBYTEARRAY, ahnj.identifier("ubyteArrayOf")), new aezu(afyq.USHORTARRAY, ahnj.identifier("ushortArrayOf")), new aezu(afyq.UINTARRAY, ahnj.identifier("uintArrayOf")), new aezu(afyq.ULONGARRAY, ahnj.identifier("ulongArrayOf")));
        afyr[] afyrVarArrValues2 = afyr.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (afyr afyrVar2 : afyrVarArrValues2) {
            linkedHashSet.add(afyrVar2.getArrayClassId().getShortClassName());
        }
        arrayClassesShortNames = linkedHashSet;
        for (afyr afyrVar3 : afyr.values()) {
            arrayClassIdToUnsignedClassId.put(afyrVar3.getArrayClassId(), afyrVar3.getClassId());
            unsignedClassIdToArrayClassId.put(afyrVar3.getClassId(), afyrVar3.getArrayClassId());
        }
    }

    private afys() {
    }

    public static final boolean isUnsignedType(aigl aiglVar) {
        agbd declarationDescriptor;
        aiglVar.getClass();
        if (aijc.noExpectedType(aiglVar) || (declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor()) == null) {
            return false;
        }
        return INSTANCE.isUnsignedClass(declarationDescriptor);
    }

    public final ahnd getUnsignedClassIdByArrayClassId(ahnd ahndVar) {
        ahndVar.getClass();
        return arrayClassIdToUnsignedClassId.get(ahndVar);
    }

    public final boolean isShortNameOfUnsignedArray(ahnj ahnjVar) {
        ahnjVar.getClass();
        return arrayClassesShortNames.contains(ahnjVar);
    }

    public final boolean isUnsignedClass(agbi agbiVar) {
        agbiVar.getClass();
        agbi containingDeclaration = agbiVar.getContainingDeclaration();
        return (containingDeclaration instanceof agdc) && affa.f(((agdc) containingDeclaration).getFqName(), afyo.BUILT_INS_PACKAGE_FQ_NAME) && unsignedTypeNames.contains(agbiVar.getName());
    }
}
