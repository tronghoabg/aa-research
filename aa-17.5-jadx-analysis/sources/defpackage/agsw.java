package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class agsw {
    private agsw() {
    }

    private final boolean isPrimitiveCompareTo(agcj agcjVar) {
        if (agcjVar.getValueParameters().size() != 1) {
            return false;
        }
        agbi containingDeclaration = agcjVar.getContainingDeclaration();
        agba agbaVar = containingDeclaration instanceof agba ? (agba) containingDeclaration : null;
        if (agbaVar == null) {
            return false;
        }
        List<agel> valueParameters = agcjVar.getValueParameters();
        valueParameters.getClass();
        agbd declarationDescriptor = ((agel) woy.bN(valueParameters)).getType().getConstructor().getDeclarationDescriptor();
        agba agbaVar2 = declarationDescriptor instanceof agba ? (agba) declarationDescriptor : null;
        return agbaVar2 != null && afye.isPrimitiveClass(agbaVar) && affa.f(ahvz.getFqNameSafe(agbaVar), ahvz.getFqNameSafe(agbaVar2));
    }

    private final ahew mapValueParameterType(agcj agcjVar, agel agelVar) {
        if (ahfp.forceSingleValueParameterBoxing(agcjVar) || isPrimitiveCompareTo(agcjVar)) {
            aigl type = agelVar.getType();
            type.getClass();
            return ahfp.mapToJvmType(aimr.makeNullable(type));
        }
        aigl type2 = agelVar.getType();
        type2.getClass();
        return ahfp.mapToJvmType(type2);
    }

    public final boolean doesJavaOverrideHaveIncompatibleValueParameterKinds(agav agavVar, agav agavVar2) {
        agavVar.getClass();
        agavVar2.getClass();
        if ((agavVar2 instanceof agve) && (agavVar instanceof agcj)) {
            agve agveVar = (agve) agavVar2;
            agveVar.getValueParameters().size();
            agcj agcjVar = (agcj) agavVar;
            agcjVar.getValueParameters().size();
            List<agel> valueParameters = agveVar.getOriginal().getValueParameters();
            valueParameters.getClass();
            List<agel> valueParameters2 = agcjVar.getOriginal().getValueParameters();
            valueParameters2.getClass();
            for (aezu aezuVar : woy.ci(valueParameters, valueParameters2)) {
                agel agelVar = (agel) aezuVar.a;
                agel agelVar2 = (agel) aezuVar.b;
                agelVar.getClass();
                boolean z = mapValueParameterType((agcj) agavVar2, agelVar) instanceof ahev;
                agelVar2.getClass();
                if (z != (mapValueParameterType(agcjVar, agelVar2) instanceof ahev)) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ agsw(afeu afeuVar) {
        this();
    }
}
