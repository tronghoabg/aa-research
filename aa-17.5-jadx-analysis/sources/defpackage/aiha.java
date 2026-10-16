package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aiha {
    public static final aiej getAbbreviatedType(aigl aiglVar) {
        aiglVar.getClass();
        aijf aijfVarUnwrap = aiglVar.unwrap();
        if (aijfVarUnwrap instanceof aiej) {
            return (aiej) aijfVarUnwrap;
        }
        return null;
    }

    public static final aigw getAbbreviation(aigl aiglVar) {
        aiglVar.getClass();
        aiej abbreviatedType = getAbbreviatedType(aiglVar);
        if (abbreviatedType != null) {
            return abbreviatedType.getAbbreviation();
        }
        return null;
    }

    public static final boolean isDefinitelyNotNullType(aigl aiglVar) {
        aiglVar.getClass();
        return aiglVar.unwrap() instanceof aifo;
    }

    private static final aigk makeDefinitelyNotNullOrNotNull(aigk aigkVar) {
        Collection<aigl> collectionMo89getSupertypes = aigkVar.mo89getSupertypes();
        ArrayList arrayList = new ArrayList(woy.bp(collectionMo89getSupertypes, 10));
        Iterator<T> it = collectionMo89getSupertypes.iterator();
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aigl aiglVarMakeDefinitelyNotNullOrNotNull$default = (aigl) it.next();
            if (aijc.isNullableType(aiglVarMakeDefinitelyNotNullOrNotNull$default)) {
                aiglVarMakeDefinitelyNotNullOrNotNull$default = makeDefinitelyNotNullOrNotNull$default(aiglVarMakeDefinitelyNotNullOrNotNull$default.unwrap(), false, 1, null);
                z = true;
            }
            arrayList.add(aiglVarMakeDefinitelyNotNullOrNotNull$default);
        }
        if (!z) {
            return null;
        }
        aigl alternativeType = aigkVar.getAlternativeType();
        return new aigk(arrayList).setAlternative(alternativeType != null ? aijc.isNullableType(alternativeType) ? makeDefinitelyNotNullOrNotNull$default(alternativeType.unwrap(), false, 1, null) : alternativeType : null);
    }

    public static /* synthetic */ aijf makeDefinitelyNotNullOrNotNull$default(aijf aijfVar, boolean z, int i, Object obj) {
        return makeDefinitelyNotNullOrNotNull(aijfVar, 1 == ((z ? 1 : 0) & ((i & 1) ^ 1)));
    }

    private static final aigw makeIntersectionTypeDefinitelyNotNullOrNotNull(aigl aiglVar) {
        aigk aigkVarMakeDefinitelyNotNullOrNotNull;
        aiid constructor = aiglVar.getConstructor();
        aigk aigkVar = constructor instanceof aigk ? (aigk) constructor : null;
        if (aigkVar == null || (aigkVarMakeDefinitelyNotNullOrNotNull = makeDefinitelyNotNullOrNotNull(aigkVar)) == null) {
            return null;
        }
        return aigkVarMakeDefinitelyNotNullOrNotNull.createType();
    }

    public static final aigw makeSimpleTypeDefinitelyNotNullOrNotNull(aigw aigwVar, boolean z) {
        aigwVar.getClass();
        aifo aifoVarMakeDefinitelyNotNull = aifo.Companion.makeDefinitelyNotNull(aigwVar, z & ((4 & 2) == 0), false & ((4 & 4) == 0));
        if (aifoVarMakeDefinitelyNotNull != null) {
            return aifoVarMakeDefinitelyNotNull;
        }
        aigw aigwVarMakeIntersectionTypeDefinitelyNotNullOrNotNull = makeIntersectionTypeDefinitelyNotNullOrNotNull(aigwVar);
        return aigwVarMakeIntersectionTypeDefinitelyNotNullOrNotNull != null ? aigwVarMakeIntersectionTypeDefinitelyNotNullOrNotNull : aigwVar.makeNullableAsSpecified(false);
    }

    public static final aigw withAbbreviation(aigw aigwVar, aigw aigwVar2) {
        aigwVar.getClass();
        aigwVar2.getClass();
        return aigr.isError(aigwVar) ? aigwVar : new aiej(aigwVar, aigwVar2);
    }

    public static final aijw withNotNullProjection(aijw aijwVar) {
        aijwVar.getClass();
        return new aijw(aijwVar.getCaptureStatus(), aijwVar.getConstructor(), aijwVar.getLowerType(), aijwVar.getAttributes(), aijwVar.isMarkedNullable(), true);
    }

    public static final aijf makeDefinitelyNotNullOrNotNull(aijf aijfVar, boolean z) {
        aijfVar.getClass();
        aifo aifoVarMakeDefinitelyNotNull = aifo.Companion.makeDefinitelyNotNull(aijfVar, z & ((4 & 2) == 0), false & ((4 & 4) == 0));
        if (aifoVarMakeDefinitelyNotNull != null) {
            return aifoVarMakeDefinitelyNotNull;
        }
        aigw aigwVarMakeIntersectionTypeDefinitelyNotNullOrNotNull = makeIntersectionTypeDefinitelyNotNullOrNotNull(aijfVar);
        return aigwVarMakeIntersectionTypeDefinitelyNotNullOrNotNull != null ? aigwVarMakeIntersectionTypeDefinitelyNotNullOrNotNull : aijfVar.makeNullableAsSpecified(false);
    }
}
