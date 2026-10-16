package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agat {
    public static final aiig createMappedTypeParametersSubstitution(agba agbaVar, agba agbaVar2) {
        agbaVar.getClass();
        agbaVar2.getClass();
        agbaVar.getDeclaredTypeParameters().size();
        agbaVar2.getDeclaredTypeParameters().size();
        aiif aiifVar = aiig.Companion;
        List<agee> declaredTypeParameters = agbaVar.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(declaredTypeParameters, 10));
        Iterator<T> it = declaredTypeParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((agee) it.next()).getTypeConstructor());
        }
        List<agee> declaredTypeParameters2 = agbaVar2.getDeclaredTypeParameters();
        declaredTypeParameters2.getClass();
        ArrayList arrayList2 = new ArrayList(woy.bp(declaredTypeParameters2, 10));
        Iterator<T> it2 = declaredTypeParameters2.iterator();
        while (it2.hasNext()) {
            aigw defaultType = ((agee) it2.next()).getDefaultType();
            defaultType.getClass();
            arrayList2.add(aimr.asTypeProjection(defaultType));
        }
        return aiif.createByConstructorsMap$default(aiifVar, woy.bc(woy.ci(arrayList, arrayList2)), false, 2, null);
    }
}
