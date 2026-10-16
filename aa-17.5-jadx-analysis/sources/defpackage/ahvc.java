package defpackage;

/* loaded from: classes3.dex */
public final class ahvc extends ahuh {
    public static final ahuy Companion = new ahuy(null);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ahvc(ahnd ahndVar, int i) {
        this(new ahug(ahndVar, i));
        ahndVar.getClass();
    }

    public final aigl getArgumentType(agcu agcuVar) {
        agcuVar.getClass();
        ahvb ahvbVar = (ahvb) getValue();
        if (ahvbVar instanceof ahuz) {
            return ((ahuz) getValue()).getType();
        }
        if (!(ahvbVar instanceof ahva)) {
            throw new aezs();
        }
        ahug value = ((ahva) getValue()).getValue();
        ahnd ahndVarComponent1 = value.component1();
        int iComponent2 = value.component2();
        agba agbaVarFindClassAcrossModuleDependencies = agch.findClassAcrossModuleDependencies(agcuVar, ahndVarComponent1);
        if (agbaVarFindClassAcrossModuleDependencies == null) {
            return ailm.createErrorType(aill.UNRESOLVED_KCLASS_CONSTANT_VALUE, ahndVarComponent1.toString(), String.valueOf(iComponent2));
        }
        aigw defaultType = agbaVarFindClassAcrossModuleDependencies.getDefaultType();
        defaultType.getClass();
        aigl aiglVarReplaceArgumentsWithStarProjections = aimr.replaceArgumentsWithStarProjections(defaultType);
        for (int i = 0; i < iComponent2; i++) {
            aiglVarReplaceArgumentsWithStarProjections = agcuVar.getBuiltIns().getArrayType(aijg.INVARIANT, aiglVarReplaceArgumentsWithStarProjections);
            aiglVarReplaceArgumentsWithStarProjections.getClass();
        }
        return aiglVarReplaceArgumentsWithStarProjections;
    }

    @Override // defpackage.ahuh
    public aigl getType(agcu agcuVar) {
        agcuVar.getClass();
        aihr empty = aihr.Companion.getEmpty();
        agba kClass = agcuVar.getBuiltIns().getKClass();
        kClass.getClass();
        return aigq.simpleNotNullType(empty, kClass, woy.bg(new aiip(getArgumentType(agcuVar))));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ahvc(ahug ahugVar) {
        this(new ahva(ahugVar));
        ahugVar.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvc(ahvb ahvbVar) {
        super(ahvbVar);
        ahvbVar.getClass();
    }
}
