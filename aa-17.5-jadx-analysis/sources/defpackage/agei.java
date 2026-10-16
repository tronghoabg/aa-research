package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agei {
    private static final agdl buildPossiblyInnerType(aigl aiglVar, agbe agbeVar, int i) {
        if (agbeVar == null || ailm.isError(agbeVar)) {
            return null;
        }
        int size = agbeVar.getDeclaredTypeParameters().size() + i;
        if (agbeVar.isInner()) {
            List<aiin> listSubList = aiglVar.getArguments().subList(i, size);
            agbi containingDeclaration = agbeVar.getContainingDeclaration();
            return new agdl(agbeVar, listSubList, buildPossiblyInnerType(aiglVar, containingDeclaration instanceof agbe ? (agbe) containingDeclaration : null, size));
        }
        if (size != aiglVar.getArguments().size()) {
            ahst.isLocal(agbeVar);
        }
        return new agdl(agbeVar, aiglVar.getArguments().subList(i, aiglVar.getArguments().size()), null);
    }

    private static final agay capturedCopyForInnerDeclaration(agee ageeVar, agbi agbiVar, int i) {
        return new agay(ageeVar, agbiVar, i);
    }

    public static final List<agee> computeConstructorTypeParameters(agbe agbeVar) {
        List<agee> parameters;
        Object next;
        aiid typeConstructor;
        agbeVar.getClass();
        List<agee> declaredTypeParameters = agbeVar.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        if (!agbeVar.isInner() && !(agbeVar.getContainingDeclaration() instanceof agav)) {
            return declaredTypeParameters;
        }
        List listJ = afrg.j(afrg.o(afrg.l(afrg.t(ahvz.getParents(agbeVar), agef.INSTANCE), ageg.INSTANCE), ageh.INSTANCE));
        Iterator itA = ahvz.getParents(agbeVar).a();
        while (true) {
            parameters = null;
            if (!itA.hasNext()) {
                next = null;
                break;
            }
            next = itA.next();
            if (next instanceof agba) {
                break;
            }
        }
        agba agbaVar = (agba) next;
        if (agbaVar != null && (typeConstructor = agbaVar.getTypeConstructor()) != null) {
            parameters = typeConstructor.getParameters();
        }
        if (parameters == null) {
            parameters = afbe.a;
        }
        if (listJ.isEmpty() && parameters.isEmpty()) {
            List<agee> declaredTypeParameters2 = agbeVar.getDeclaredTypeParameters();
            declaredTypeParameters2.getClass();
            return declaredTypeParameters2;
        }
        List<agee> listBY = woy.bY(listJ, parameters);
        ArrayList arrayList = new ArrayList(woy.bp(listBY, 10));
        for (agee ageeVar : listBY) {
            ageeVar.getClass();
            arrayList.add(capturedCopyForInnerDeclaration(ageeVar, agbeVar, declaredTypeParameters.size()));
        }
        return woy.bY(declaredTypeParameters, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean computeConstructorTypeParameters$lambda$0(agbi agbiVar) {
        agbiVar.getClass();
        return agbiVar instanceof agav;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean computeConstructorTypeParameters$lambda$1(agbi agbiVar) {
        agbiVar.getClass();
        return !(agbiVar instanceof agbh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final airp computeConstructorTypeParameters$lambda$2(agbi agbiVar) {
        agbiVar.getClass();
        List<agee> typeParameters = ((agav) agbiVar).getTypeParameters();
        typeParameters.getClass();
        return woy.cm(typeParameters);
    }

    public static final agdl buildPossiblyInnerType(aigl aiglVar) {
        aiglVar.getClass();
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        return buildPossiblyInnerType(aiglVar, declarationDescriptor instanceof agbe ? (agbe) declarationDescriptor : null, 0);
    }
}
