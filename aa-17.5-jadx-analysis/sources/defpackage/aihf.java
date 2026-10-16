package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aihf {
    private static final aigl buildStarProjectionTypeByTypeParameters(List<? extends aiid> list, List<? extends aigl> list2, afye afyeVar) {
        aigl aiglVarSubstitute = aiiy.create(new aihe(list)).substitute((aigl) woy.bF(list2), aijg.OUT_VARIANCE);
        if (aiglVarSubstitute != null) {
            return aiglVarSubstitute;
        }
        aigw defaultBound = afyeVar.getDefaultBound();
        defaultBound.getClass();
        return defaultBound;
    }

    public static final aigl starProjectionType(agee ageeVar) {
        ageeVar.getClass();
        agbi containingDeclaration = ageeVar.getContainingDeclaration();
        containingDeclaration.getClass();
        if (containingDeclaration instanceof agbe) {
            List<agee> parameters = ((agbe) containingDeclaration).getTypeConstructor().getParameters();
            parameters.getClass();
            ArrayList arrayList = new ArrayList(woy.bp(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((agee) it.next()).getTypeConstructor());
            }
            List<aigl> upperBounds = ageeVar.getUpperBounds();
            upperBounds.getClass();
            return buildStarProjectionTypeByTypeParameters(arrayList, upperBounds, ahvz.getBuiltIns(ageeVar));
        }
        if (!(containingDeclaration instanceof agcj)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<agee> typeParameters = ((agcj) containingDeclaration).getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList2 = new ArrayList(woy.bp(typeParameters, 10));
        Iterator<T> it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((agee) it2.next()).getTypeConstructor());
        }
        List<aigl> upperBounds2 = ageeVar.getUpperBounds();
        upperBounds2.getClass();
        return buildStarProjectionTypeByTypeParameters(arrayList2, upperBounds2, ahvz.getBuiltIns(ageeVar));
    }
}
