package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class afzr {
    public static final afzr INSTANCE = new afzr();

    private afzr() {
    }

    public static /* synthetic */ agba mapJavaToKotlin$default(afzr afzrVar, ahnf ahnfVar, afye afyeVar, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return afzrVar.mapJavaToKotlin(ahnfVar, afyeVar, num);
    }

    public final agba convertMutableToReadOnly(agba agbaVar) {
        agbaVar.getClass();
        ahnf ahnfVarMutableToReadOnly = afzq.INSTANCE.mutableToReadOnly(ahst.getFqName(agbaVar));
        if (ahnfVarMutableToReadOnly == null) {
            throw new IllegalArgumentException(a.bm(agbaVar, "Given class ", " is not a mutable collection"));
        }
        agba builtInClassByFqName = ahvz.getBuiltIns(agbaVar).getBuiltInClassByFqName(ahnfVarMutableToReadOnly);
        builtInClassByFqName.getClass();
        return builtInClassByFqName;
    }

    public final agba convertReadOnlyToMutable(agba agbaVar) {
        agbaVar.getClass();
        ahnf onlyToMutable = afzq.INSTANCE.readOnlyToMutable(ahst.getFqName(agbaVar));
        if (onlyToMutable == null) {
            throw new IllegalArgumentException(a.bm(agbaVar, "Given class ", " is not a read-only collection"));
        }
        agba builtInClassByFqName = ahvz.getBuiltIns(agbaVar).getBuiltInClassByFqName(onlyToMutable);
        builtInClassByFqName.getClass();
        return builtInClassByFqName;
    }

    public final boolean isMutable(agba agbaVar) {
        agbaVar.getClass();
        return afzq.INSTANCE.isMutable(ahst.getFqName(agbaVar));
    }

    public final boolean isReadOnly(agba agbaVar) {
        agbaVar.getClass();
        return afzq.INSTANCE.isReadOnly(ahst.getFqName(agbaVar));
    }

    public final agba mapJavaToKotlin(ahnf ahnfVar, afye afyeVar, Integer num) {
        ahnfVar.getClass();
        afyeVar.getClass();
        ahnd ahndVarMapJavaToKotlin = (num == null || !affa.f(ahnfVar, afzq.INSTANCE.getFUNCTION_N_FQ_NAME())) ? afzq.INSTANCE.mapJavaToKotlin(ahnfVar) : afyo.getFunctionClassId(num.intValue());
        if (ahndVarMapJavaToKotlin != null) {
            return afyeVar.getBuiltInClassByFqName(ahndVarMapJavaToKotlin.asSingleFqName());
        }
        return null;
    }

    public final Collection<agba> mapPlatformClass(ahnf ahnfVar, afye afyeVar) {
        ahnfVar.getClass();
        afyeVar.getClass();
        agba agbaVarMapJavaToKotlin$default = mapJavaToKotlin$default(this, ahnfVar, afyeVar, null, 4, null);
        if (agbaVarMapJavaToKotlin$default == null) {
            return afbg.a;
        }
        ahnf onlyToMutable = afzq.INSTANCE.readOnlyToMutable(ahvz.getFqNameUnsafe(agbaVarMapJavaToKotlin$default));
        if (onlyToMutable == null) {
            return woy.aO(agbaVarMapJavaToKotlin$default);
        }
        agba builtInClassByFqName = afyeVar.getBuiltInClassByFqName(onlyToMutable);
        builtInClassByFqName.getClass();
        return woy.bi(agbaVarMapJavaToKotlin$default, builtInClassByFqName);
    }
}
