package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class airw {
    public static final java.lang.String a(byte[] bArr) {
        bArr.getClass();
        return new java.lang.String(bArr, defpackage.aitd.a);
    }

    public static final byte[] b(java.lang.String str) {
        byte[] bytes = str.getBytes(defpackage.aitd.a);
        bytes.getClass();
        return bytes;
    }

    private static final defpackage.afjb eraseToUpperBoundsAndMakeItRawRecursively(defpackage.afjb afjbVar, defpackage.afjb afjbVar2) {
        defpackage.afjb afjbVar3 = (defpackage.afjb) defpackage.afsg.i(defpackage.afsg.f(afjbVar, defpackage.airv.INSTANCE));
        java.util.List<defpackage.afjd> arguments = afjbVar3.getArguments();
        if (arguments.isEmpty()) {
            return afjbVar3;
        }
        defpackage.aisd aisdVar = defpackage.aisd.INSTANCE;
        afjbVar3.getClass();
        defpackage.aind aindVarTypeConstructor = aisdVar.typeConstructor((defpackage.aimx) afjbVar3);
        int iParametersCount = aisdVar.parametersCount(aindVarTypeConstructor);
        java.util.ArrayList<defpackage.afjc> arrayList = new java.util.ArrayList(iParametersCount);
        for (int i = 0; i < iParametersCount; i++) {
            arrayList.add(aisdVar.getParameter(aindVarTypeConstructor, i));
        }
        if (arrayList.size() != arguments.size()) {
            throw new java.lang.IllegalStateException("Error inside type '" + afjbVar2 + "'. '" + afjbVar3 + "' params (" + arrayList.size() + ") vs args (" + arguments.size() + ") mismatch.");
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(arrayList, 10));
        for (defpackage.afjc afjcVar : arrayList) {
            defpackage.afjb afjbVar4 = (defpackage.afjb) defpackage.afga.aB(afjcVar.getUpperBounds());
            if (afjbVar4 == null) {
                throw new java.lang.IllegalStateException(defpackage.a.bv(afjcVar, afjbVar2, "Error inside type '", "'. Parameter '", "' has no upper bounds. There must always be at least the default 'Any?' upper bound"));
            }
            defpackage.afjb afjbVarEraseToUpperBoundsAndMakeItRawRecursively = eraseToUpperBoundsAndMakeItRawRecursively(afjbVar4, afjbVar2);
            defpackage.afjd afjdVar = defpackage.afjd.a;
            arrayList2.add(defpackage.afjk.g(afjbVarEraseToUpperBoundsAndMakeItRawRecursively));
        }
        defpackage.afif classifier = afjbVar3.getClassifier();
        if (classifier == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bv(afjbVar3, afjbVar2, "Error inside type '", "'. The current type '", "' is not denotable"));
        }
        defpackage.afjb afjbVarG = defpackage.afjr.g(classifier, arrayList2, afjbVar3.isMarkedNullable(), 4);
        int size = arrayList.size();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList3.add(defpackage.afjd.a);
        }
        return defpackage.aisf.createPlatformKType(afjbVarG, defpackage.afjr.g(classifier, arrayList3, afjbVar3.isMarkedNullable(), 4), true);
    }

    static /* synthetic */ defpackage.afjb eraseToUpperBoundsAndMakeItRawRecursively$default(defpackage.afjb afjbVar, defpackage.afjb afjbVar2, int i, java.lang.Object obj) {
        if (1 == (i & 1)) {
            afjbVar2 = afjbVar;
        }
        return eraseToUpperBoundsAndMakeItRawRecursively(afjbVar, afjbVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afjb eraseToUpperBoundsAndMakeItRawRecursively$lambda$0(defpackage.afjb afjbVar) {
        java.util.List<defpackage.afjb> upperBounds;
        afjbVar.getClass();
        defpackage.afif classifier = afjbVar.getClassifier();
        defpackage.afjc afjcVar = classifier instanceof defpackage.afjc ? (defpackage.afjc) classifier : null;
        if (afjcVar == null || (upperBounds = afjcVar.getUpperBounds()) == null) {
            return null;
        }
        return (defpackage.afjb) defpackage.afga.aB(upperBounds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afje intersectWith(defpackage.afje afjeVar, defpackage.afje afjeVar2) {
        defpackage.afje afjeVar3 = defpackage.afje.a;
        if (afjeVar == afjeVar3) {
            return afjeVar2;
        }
        if (afjeVar2 == afjeVar3 || afjeVar == afjeVar2) {
            return afjeVar;
        }
        throw new java.lang.IllegalStateException("CONFLICTING_PROJECTION");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNullabilityFlexible(defpackage.afjb afjbVar) {
        if (!(afjbVar instanceof defpackage.airc)) {
            return false;
        }
        defpackage.airc aircVar = (defpackage.airc) afjbVar;
        defpackage.airc aircVarLowerBoundIfFlexible = aircVar.lowerBoundIfFlexible();
        java.lang.Boolean boolValueOf = aircVarLowerBoundIfFlexible != null ? java.lang.Boolean.valueOf(aircVarLowerBoundIfFlexible.isMarkedNullable()) : null;
        defpackage.airc aircVarUpperBoundIfFlexible = aircVar.upperBoundIfFlexible();
        return !defpackage.afga.f(boolValueOf, aircVarUpperBoundIfFlexible != null ? java.lang.Boolean.valueOf(aircVarUpperBoundIfFlexible.isMarkedNullable()) : null);
    }
}
