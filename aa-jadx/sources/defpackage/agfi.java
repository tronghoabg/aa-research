package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agfi {
    private static final defpackage.agel buildPossiblyInnerType(defpackage.aihl aihlVar, defpackage.agce agceVar, int i) {
        if (agceVar == null || defpackage.aimm.isError(agceVar)) {
            return null;
        }
        int size = agceVar.getDeclaredTypeParameters().size() + i;
        if (agceVar.isInner()) {
            java.util.List<defpackage.aijn> listSubList = aihlVar.getArguments().subList(i, size);
            defpackage.agci containingDeclaration = agceVar.getContainingDeclaration();
            return new defpackage.agel(agceVar, listSubList, buildPossiblyInnerType(aihlVar, containingDeclaration instanceof defpackage.agce ? (defpackage.agce) containingDeclaration : null, size));
        }
        if (size != aihlVar.getArguments().size()) {
            defpackage.ahtt.isLocal(agceVar);
        }
        return new defpackage.agel(agceVar, aihlVar.getArguments().subList(i, aihlVar.getArguments().size()), null);
    }

    private static final defpackage.agby capturedCopyForInnerDeclaration(defpackage.agfe agfeVar, defpackage.agci agciVar, int i) {
        return new defpackage.agby(agfeVar, agciVar, i);
    }

    public static final java.util.List<defpackage.agfe> computeConstructorTypeParameters(defpackage.agce agceVar) {
        java.util.List<defpackage.agfe> parameters;
        java.lang.Object next;
        defpackage.aijd typeConstructor;
        agceVar.getClass();
        java.util.List<defpackage.agfe> declaredTypeParameters = agceVar.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        if (!agceVar.isInner() && !(agceVar.getContainingDeclaration() instanceof defpackage.agbv)) {
            return declaredTypeParameters;
        }
        java.util.List listJ = defpackage.afsg.j(defpackage.afsg.o(defpackage.afsg.l(defpackage.afsg.t(defpackage.ahwz.getParents(agceVar), defpackage.agff.INSTANCE), defpackage.agfg.INSTANCE), defpackage.agfh.INSTANCE));
        java.util.Iterator itA = defpackage.ahwz.getParents(agceVar).a();
        do {
            parameters = null;
            if (!itA.hasNext()) {
                next = null;
                break;
            }
            next = itA.next();
        } while (!(next instanceof defpackage.agca));
        defpackage.agca agcaVar = (defpackage.agca) next;
        if (agcaVar != null && (typeConstructor = agcaVar.getTypeConstructor()) != null) {
            parameters = typeConstructor.getParameters();
        }
        if (parameters == null) {
            parameters = defpackage.afce.a;
        }
        if (listJ.isEmpty() && parameters.isEmpty()) {
            java.util.List<defpackage.agfe> declaredTypeParameters2 = agceVar.getDeclaredTypeParameters();
            declaredTypeParameters2.getClass();
            return declaredTypeParameters2;
        }
        java.util.List<defpackage.agfe> listAS = defpackage.afga.aS(listJ, parameters);
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(listAS, 10));
        for (defpackage.agfe agfeVar : listAS) {
            agfeVar.getClass();
            arrayList.add(capturedCopyForInnerDeclaration(agfeVar, agceVar, declaredTypeParameters.size()));
        }
        return defpackage.afga.aS(declaredTypeParameters, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean computeConstructorTypeParameters$lambda$0(defpackage.agci agciVar) {
        agciVar.getClass();
        return agciVar instanceof defpackage.agbv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean computeConstructorTypeParameters$lambda$1(defpackage.agci agciVar) {
        agciVar.getClass();
        return !(agciVar instanceof defpackage.agch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aisp computeConstructorTypeParameters$lambda$2(defpackage.agci agciVar) {
        agciVar.getClass();
        java.util.List<defpackage.agfe> typeParameters = ((defpackage.agbv) agciVar).getTypeParameters();
        typeParameters.getClass();
        return defpackage.afga.bg(typeParameters);
    }

    public static final defpackage.agel buildPossiblyInnerType(defpackage.aihl aihlVar) {
        aihlVar.getClass();
        defpackage.agcd declarationDescriptor = aihlVar.getConstructor().getDeclarationDescriptor();
        return buildPossiblyInnerType(aihlVar, declarationDescriptor instanceof defpackage.agce ? (defpackage.agce) declarationDescriptor : null, 0);
    }
}
