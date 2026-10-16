package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class aiqw {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ajhg a(defpackage.ajhv r24) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiqw.a(ajhv):ajhg");
    }

    private static final afib eraseToUpperBoundsAndMakeItRawRecursively(afib afibVar, afib afibVar2) {
        afib afibVar3 = (afib) afrg.i(afrg.f(afibVar, aiqv.INSTANCE));
        List<afid> arguments = afibVar3.getArguments();
        if (arguments.isEmpty()) {
            return afibVar3;
        }
        aird airdVar = aird.INSTANCE;
        afibVar3.getClass();
        aimd aimdVarTypeConstructor = airdVar.typeConstructor((ailx) afibVar3);
        int iParametersCount = airdVar.parametersCount(aimdVarTypeConstructor);
        ArrayList<afic> arrayList = new ArrayList(iParametersCount);
        for (int i = 0; i < iParametersCount; i++) {
            arrayList.add(airdVar.getParameter(aimdVarTypeConstructor, i));
        }
        if (arrayList.size() != arguments.size()) {
            throw new IllegalStateException("Error inside type '" + afibVar2 + "'. '" + afibVar3 + "' params (" + arrayList.size() + ") vs args (" + arguments.size() + ") mismatch.");
        }
        ArrayList arrayList2 = new ArrayList(woy.bp(arrayList, 10));
        for (afic aficVar : arrayList) {
            afib afibVar4 = (afib) woy.bH(aficVar.getUpperBounds());
            if (afibVar4 == null) {
                throw new IllegalStateException(a.bw(aficVar, afibVar2, "Error inside type '", "'. Parameter '", "' has no upper bounds. There must always be at least the default 'Any?' upper bound"));
            }
            afib afibVarEraseToUpperBoundsAndMakeItRawRecursively = eraseToUpperBoundsAndMakeItRawRecursively(afibVar4, afibVar2);
            afid afidVar = afid.a;
            arrayList2.add(afik.f(afibVarEraseToUpperBoundsAndMakeItRawRecursively));
        }
        afhf classifier = afibVar3.getClassifier();
        if (classifier == null) {
            throw new IllegalStateException(a.bw(afibVar3, afibVar2, "Error inside type '", "'. The current type '", "' is not denotable"));
        }
        afib afibVarK = afik.k(classifier, arrayList2, afibVar3.isMarkedNullable(), 4);
        int size = arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList3.add(afid.a);
        }
        return airf.createPlatformKType(afibVarK, afik.k(classifier, arrayList3, afibVar3.isMarkedNullable(), 4), true);
    }

    static /* synthetic */ afib eraseToUpperBoundsAndMakeItRawRecursively$default(afib afibVar, afib afibVar2, int i, Object obj) {
        if (1 == (i & 1)) {
            afibVar2 = afibVar;
        }
        return eraseToUpperBoundsAndMakeItRawRecursively(afibVar, afibVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afib eraseToUpperBoundsAndMakeItRawRecursively$lambda$0(afib afibVar) {
        List<afib> upperBounds;
        afibVar.getClass();
        afhf classifier = afibVar.getClassifier();
        afic aficVar = classifier instanceof afic ? (afic) classifier : null;
        if (aficVar == null || (upperBounds = aficVar.getUpperBounds()) == null) {
            return null;
        }
        return (afib) woy.bH(upperBounds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afie intersectWith(afie afieVar, afie afieVar2) {
        afie afieVar3 = afie.a;
        if (afieVar == afieVar3) {
            return afieVar2;
        }
        if (afieVar2 == afieVar3 || afieVar == afieVar2) {
            return afieVar;
        }
        throw new IllegalStateException("CONFLICTING_PROJECTION");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNullabilityFlexible(afib afibVar) {
        if (!(afibVar instanceof aiqc)) {
            return false;
        }
        aiqc aiqcVar = (aiqc) afibVar;
        aiqc aiqcVarLowerBoundIfFlexible = aiqcVar.lowerBoundIfFlexible();
        Boolean boolValueOf = aiqcVarLowerBoundIfFlexible != null ? Boolean.valueOf(aiqcVarLowerBoundIfFlexible.isMarkedNullable()) : null;
        aiqc aiqcVarUpperBoundIfFlexible = aiqcVar.upperBoundIfFlexible();
        return !affa.f(boolValueOf, aiqcVarUpperBoundIfFlexible != null ? Boolean.valueOf(aiqcVarUpperBoundIfFlexible.isMarkedNullable()) : null);
    }
}
