package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class aimr {
    public static final Object a(aiyk aiykVar, afck afckVar) {
        return aiykVar.hR(ajba.a, afckVar);
    }

    public static final aiin asTypeProjection(aigl aiglVar) {
        aiglVar.getClass();
        return new aiip(aiglVar);
    }

    public static final Object b(aiyk aiykVar, afeg afegVar, afck afckVar) {
        return a(aimv.b(aizc.a(aiykVar, afegVar), 0), afckVar);
    }

    public static final Object c(aiyl aiylVar, aiyk aiykVar, afck afckVar) throws Throwable {
        ainf.b(aiylVar);
        return aiykVar.hR(aiylVar, afckVar);
    }

    public static final boolean contains(aigl aiglVar, afec<? super aijf, Boolean> afecVar) {
        aiglVar.getClass();
        afecVar.getClass();
        return aijc.contains(aiglVar, afecVar);
    }

    private static final boolean containsSelfTypeParameter(aigl aiglVar, aiid aiidVar, Set<? extends agee> set) {
        boolean zContainsSelfTypeParameter;
        if (affa.f(aiglVar.getConstructor(), aiidVar)) {
            return true;
        }
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        agbe agbeVar = declarationDescriptor instanceof agbe ? (agbe) declarationDescriptor : null;
        List<agee> declaredTypeParameters = agbeVar != null ? agbeVar.getDeclaredTypeParameters() : null;
        Iterator it = woy.bD(aiglVar.getArguments()).iterator();
        do {
            zContainsSelfTypeParameter = false;
            if (!it.hasNext()) {
                return false;
            }
            afbh afbhVar = (afbh) it.next();
            int i = afbhVar.a;
            aiin aiinVar = (aiin) afbhVar.b;
            agee ageeVar = declaredTypeParameters != null ? (agee) woy.bI(declaredTypeParameters, i) : null;
            if ((ageeVar == null || set == null || !set.contains(ageeVar)) && !aiinVar.isStarProjection()) {
                aigl type = aiinVar.getType();
                type.getClass();
                zContainsSelfTypeParameter = containsSelfTypeParameter(type, aiidVar, set);
            }
        } while (!zContainsSelfTypeParameter);
        return true;
    }

    public static final boolean containsTypeAliasParameters(aigl aiglVar) {
        aiglVar.getClass();
        return contains(aiglVar, aimo.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsTypeAliasParameters$lambda$0(aijf aijfVar) {
        aijfVar.getClass();
        agbd declarationDescriptor = aijfVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            return isTypeAliasParameter(declarationDescriptor);
        }
        return false;
    }

    public static final boolean containsTypeParameter(aigl aiglVar) {
        aiglVar.getClass();
        return aijc.contains(aiglVar, aimn.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean containsTypeParameter$lambda$0(aijf aijfVar) {
        return Boolean.valueOf(aijc.isTypeParameter(aijfVar));
    }

    public static final aiin createProjection(aigl aiglVar, aijg aijgVar, agee ageeVar) {
        aiglVar.getClass();
        aijgVar.getClass();
        if ((ageeVar != null ? ageeVar.getVariance() : null) == aijgVar) {
            aijgVar = aijg.INVARIANT;
        }
        return new aiip(aijgVar, aiglVar);
    }

    public static final void d(aiyk aiykVar, aitx aitxVar) {
        ahnc.d(aitxVar, null, 0, new nba(aiykVar, (afck) null, 16), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void extractTypeParametersFromUpperBounds(aigl aiglVar, aigl aiglVar2, Set<agee> set, Set<? extends agee> set2) {
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof agee) {
            if (!affa.f(aiglVar.getConstructor(), aiglVar2.getConstructor())) {
                set.add(declarationDescriptor);
                return;
            }
            for (aigl aiglVar3 : ((agee) declarationDescriptor).getUpperBounds()) {
                aiglVar3.getClass();
                extractTypeParametersFromUpperBounds(aiglVar3, aiglVar2, set, set2);
            }
            return;
        }
        agbd declarationDescriptor2 = aiglVar.getConstructor().getDeclarationDescriptor();
        agbe agbeVar = declarationDescriptor2 instanceof agbe ? (agbe) declarationDescriptor2 : null;
        List<agee> declaredTypeParameters = agbeVar != null ? agbeVar.getDeclaredTypeParameters() : null;
        int i = 0;
        for (aiin aiinVar : aiglVar.getArguments()) {
            int i2 = i + 1;
            agee ageeVar = declaredTypeParameters != null ? (agee) woy.bI(declaredTypeParameters, i) : null;
            if ((ageeVar == null || set2 == null || !set2.contains(ageeVar)) && !aiinVar.isStarProjection() && !woy.cn(set, aiinVar.getType().getConstructor().getDeclarationDescriptor()) && !affa.f(aiinVar.getType().getConstructor(), aiglVar2.getConstructor())) {
                aigl type = aiinVar.getType();
                type.getClass();
                extractTypeParametersFromUpperBounds(type, aiglVar2, set, set2);
            }
            i = i2;
        }
    }

    public static final afye getBuiltIns(aigl aiglVar) {
        aiglVar.getClass();
        afye builtIns = aiglVar.getConstructor().getBuiltIns();
        builtIns.getClass();
        return builtIns;
    }

    public static final aigl getRepresentativeUpperBound(agee ageeVar) {
        Object obj;
        ageeVar.getClass();
        List<aigl> upperBounds = ageeVar.getUpperBounds();
        upperBounds.getClass();
        upperBounds.isEmpty();
        List<aigl> upperBounds2 = ageeVar.getUpperBounds();
        upperBounds2.getClass();
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            agbd declarationDescriptor = ((aigl) next).getConstructor().getDeclarationDescriptor();
            agba agbaVar = declarationDescriptor instanceof agba ? (agba) declarationDescriptor : null;
            if (agbaVar != null && agbaVar.getKind() != agbb.INTERFACE && agbaVar.getKind() != agbb.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        aigl aiglVar = (aigl) obj;
        if (aiglVar != null) {
            return aiglVar;
        }
        List<aigl> upperBounds3 = ageeVar.getUpperBounds();
        upperBounds3.getClass();
        Object objBF = woy.bF(upperBounds3);
        objBF.getClass();
        return (aigl) objBF;
    }

    public static final boolean hasTypeParameterRecursiveBounds(agee ageeVar, aiid aiidVar, Set<? extends agee> set) {
        ageeVar.getClass();
        List<aigl> upperBounds = ageeVar.getUpperBounds();
        upperBounds.getClass();
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (aigl aiglVar : upperBounds) {
            aiglVar.getClass();
            if (containsSelfTypeParameter(aiglVar, ageeVar.getDefaultType().getConstructor(), set) && (aiidVar == null || affa.f(aiglVar.getConstructor(), aiidVar))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean hasTypeParameterRecursiveBounds$default(agee ageeVar, aiid aiidVar, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            aiidVar = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return hasTypeParameterRecursiveBounds(ageeVar, aiidVar, set);
    }

    public static final boolean isBoolean(aigl aiglVar) {
        aiglVar.getClass();
        return afye.isBoolean(aiglVar);
    }

    public static final boolean isNothing(aigl aiglVar) {
        aiglVar.getClass();
        return afye.isNothing(aiglVar);
    }

    public static final boolean isStubType(aigl aiglVar) {
        aiglVar.getClass();
        if (aiglVar instanceof aieo) {
            return true;
        }
        return (aiglVar instanceof aifo) && (((aifo) aiglVar).getOriginal() instanceof aieo);
    }

    public static final boolean isStubTypeForBuilderInference(aigl aiglVar) {
        aiglVar.getClass();
        if (aiglVar instanceof aihg) {
            return true;
        }
        return (aiglVar instanceof aifo) && (((aifo) aiglVar).getOriginal() instanceof aihg);
    }

    public static final boolean isSubtypeOf(aigl aiglVar, aigl aiglVar2) {
        aiglVar.getClass();
        aiglVar2.getClass();
        return aijp.DEFAULT.isSubtypeOf(aiglVar, aiglVar2);
    }

    public static final boolean isTypeAliasParameter(agbd agbdVar) {
        agbdVar.getClass();
        return (agbdVar instanceof agee) && (((agee) agbdVar).getContainingDeclaration() instanceof aged);
    }

    public static final boolean isTypeParameter(aigl aiglVar) {
        aiglVar.getClass();
        return aijc.isTypeParameter(aiglVar);
    }

    public static final boolean isUnresolvedType(aigl aiglVar) {
        aiglVar.getClass();
        return (aiglVar instanceof ailj) && ((ailj) aiglVar).getKind().isUnresolved();
    }

    public static final aigl makeNotNullable(aigl aiglVar) {
        aiglVar.getClass();
        aigl aiglVarMakeNotNullable = aijc.makeNotNullable(aiglVar);
        aiglVarMakeNotNullable.getClass();
        return aiglVarMakeNotNullable;
    }

    public static final aigl makeNullable(aigl aiglVar) {
        aiglVar.getClass();
        aigl aiglVarMakeNullable = aijc.makeNullable(aiglVar);
        aiglVarMakeNullable.getClass();
        return aiglVarMakeNullable;
    }

    public static final aigl replaceAnnotations(aigl aiglVar, agfk agfkVar) {
        aiglVar.getClass();
        agfkVar.getClass();
        return (aiglVar.getAnnotations().isEmpty() && agfkVar.isEmpty()) ? aiglVar : aiglVar.unwrap().replaceAttributes(aihs.replaceAnnotations(aiglVar.getAttributes(), agfkVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [aijf] */
    public static final aigl replaceArgumentsWithStarProjections(aigl aiglVar) {
        aigw aigwVarReplace$default;
        aiglVar.getClass();
        aijf aijfVarUnwrap = aiglVar.unwrap();
        if (aijfVarUnwrap instanceof aiga) {
            aiga aigaVar = (aiga) aijfVarUnwrap;
            aigw lowerBound = aigaVar.getLowerBound();
            if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().getDeclarationDescriptor() != null) {
                List<agee> parameters = lowerBound.getConstructor().getParameters();
                parameters.getClass();
                ArrayList arrayList = new ArrayList(woy.bp(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new aihd((agee) it.next()));
                }
                lowerBound = aiiu.replace$default(lowerBound, arrayList, null, 2, null);
            }
            aigw upperBound = aigaVar.getUpperBound();
            if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().getDeclarationDescriptor() != null) {
                List<agee> parameters2 = upperBound.getConstructor().getParameters();
                parameters2.getClass();
                ArrayList arrayList2 = new ArrayList(woy.bp(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new aihd((agee) it2.next()));
                }
                upperBound = aiiu.replace$default(upperBound, arrayList2, null, 2, null);
            }
            aigwVarReplace$default = aigq.flexibleType(lowerBound, upperBound);
        } else {
            if (!(aijfVarUnwrap instanceof aigw)) {
                throw new aezs();
            }
            aigw aigwVar = (aigw) aijfVarUnwrap;
            boolean zIsEmpty = aigwVar.getConstructor().getParameters().isEmpty();
            aigwVarReplace$default = aigwVar;
            if (!zIsEmpty) {
                agbd declarationDescriptor = aigwVar.getConstructor().getDeclarationDescriptor();
                aigwVarReplace$default = aigwVar;
                if (declarationDescriptor != null) {
                    List<agee> parameters3 = aigwVar.getConstructor().getParameters();
                    parameters3.getClass();
                    ArrayList arrayList3 = new ArrayList(woy.bp(parameters3, 10));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new aihd((agee) it3.next()));
                    }
                    aigwVarReplace$default = aiiu.replace$default(aigwVar, arrayList3, null, 2, null);
                }
            }
        }
        return aije.inheritEnhancement(aigwVarReplace$default, aijfVarUnwrap);
    }

    public static final boolean requiresTypeAliasExpansion(aigl aiglVar) {
        aiglVar.getClass();
        return contains(aiglVar, aimp.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean requiresTypeAliasExpansion$lambda$0(aijf aijfVar) {
        aijfVar.getClass();
        agbd declarationDescriptor = aijfVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            return (declarationDescriptor instanceof aged) || (declarationDescriptor instanceof agee);
        }
        return false;
    }

    public static final boolean shouldBeUpdated(aigl aiglVar) {
        return aiglVar == null || contains(aiglVar, aimq.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldBeUpdated$lambda$0(aijf aijfVar) {
        aijfVar.getClass();
        return (aijfVar instanceof aihg) || (aijfVar.getConstructor() instanceof aiml) || aigr.isError(aijfVar);
    }

    public static final boolean hasTypeParameterRecursiveBounds(agee ageeVar) {
        ageeVar.getClass();
        return hasTypeParameterRecursiveBounds$default(ageeVar, null, null, 6, null);
    }

    public static final Set<agee> extractTypeParametersFromUpperBounds(aigl aiglVar, Set<? extends agee> set) {
        aiglVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        extractTypeParametersFromUpperBounds(aiglVar, aiglVar, linkedHashSet, set);
        return linkedHashSet;
    }
}
