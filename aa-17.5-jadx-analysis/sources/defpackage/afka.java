package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class afka implements Comparator {
    public static final afka INSTANCE = new afka();

    private afka() {
    }

    @Override // java.util.Comparator
    public int compare(afue<?> afueVar, afue<?> afueVar2) {
        afueVar.getClass();
        afueVar2.getClass();
        aiqu aiquVarSubstitutedWith = afmz.substitutedWith(afueVar.getTypeParameters(), afueVar2.getTypeParameters());
        if (aiquVarSubstitutedWith == null) {
            throw new IllegalStateException(a.cj((byte) 39, afueVar2, afueVar, "Intersection overrides can't have different type parameters sizes. It must have been reported by the compiler. The following members appear to be violating intersection overrides: '", "' '"));
        }
        afib afibVar = aiqu.substitute$default(aiquVarSubstitutedWith, afueVar.getReturnType(), null, 2, null).c;
        if (afibVar == null) {
            afmz.starProjectionInTopLevelTypeIsNotPossible(afueVar.getName());
            throw new aezp();
        }
        afib returnType = afueVar2.getReturnType();
        boolean zG = afik.g(afibVar, returnType);
        boolean zG2 = afik.g(returnType, afibVar);
        if (zG && !zG2) {
            return -1;
        }
        if (zG2 && !zG) {
            return 1;
        }
        boolean z = afibVar instanceof aiqc;
        aird airdVar = aird.INSTANCE;
        aiqc aiqcVar = z ? (aiqc) afibVar : null;
        boolean z2 = aiqcVar != null && airdVar.isFlexible(aiqcVar);
        boolean z3 = returnType instanceof aiqc;
        aird airdVar2 = aird.INSTANCE;
        aiqc aiqcVar2 = z3 ? (aiqc) returnType : null;
        boolean z4 = aiqcVar2 != null && airdVar2.isFlexible(aiqcVar2);
        if (!z4 || z2) {
            return (!z2 || z4) ? 0 : 1;
        }
        return -1;
    }
}
