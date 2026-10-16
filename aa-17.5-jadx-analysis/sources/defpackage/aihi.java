package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aihi {
    public static final aihh Companion = new aihh(null);
    private static final aihi NON_REPORTING = new aihi(aihl.INSTANCE, false);
    private final aihm reportStrategy;
    private final boolean shouldCheckBounds;

    public aihi(aihm aihmVar, boolean z) {
        aihmVar.getClass();
        this.reportStrategy = aihmVar;
        this.shouldCheckBounds = z;
    }

    private final void checkRepeatedAnnotations(agfk agfkVar, agfk agfkVar2) {
        HashSet hashSet = new HashSet();
        Iterator<agfc> it = agfkVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getFqName());
        }
        for (agfc agfcVar : agfkVar2) {
            if (hashSet.contains(agfcVar.getFqName())) {
                this.reportStrategy.repeatedAnnotation(agfcVar);
            }
        }
    }

    private final void checkTypeArgumentsSubstitution(aigl aiglVar, aigl aiglVar2) {
        aiiy aiiyVarCreate = aiiy.create(aiglVar2);
        int i = 0;
        for (Object obj : aiglVar2.getArguments()) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            aiin aiinVar = (aiin) obj;
            if (!aiinVar.isStarProjection()) {
                aigl type = aiinVar.getType();
                type.getClass();
                if (!aimr.containsTypeAliasParameters(type)) {
                    aiin aiinVar2 = aiglVar.getArguments().get(i);
                    agee ageeVar = aiglVar.getConstructor().getParameters().get(i);
                    if (this.shouldCheckBounds) {
                        aihm aihmVar = this.reportStrategy;
                        aigl type2 = aiinVar2.getType();
                        type2.getClass();
                        aigl type3 = aiinVar.getType();
                        type3.getClass();
                        ageeVar.getClass();
                        aihmVar.boundsViolationInSubstitution(aiiyVarCreate, type2, type3, ageeVar);
                    }
                }
            }
            i = i2;
        }
    }

    private final aigw combineAttributes(aigw aigwVar, aihr aihrVar) {
        return aigr.isError(aigwVar) ? aigwVar : aiiu.replace$default(aigwVar, null, createdCombinedAttributes(aigwVar, aihrVar), 1, null);
    }

    private final aigw combineNullability(aigw aigwVar, aigl aiglVar) {
        aigw aigwVarMakeNullableIfNeeded = aijc.makeNullableIfNeeded(aigwVar, aiglVar.isMarkedNullable());
        aigwVarMakeNullableIfNeeded.getClass();
        return aigwVarMakeNullableIfNeeded;
    }

    private final aigw combineNullabilityAndAnnotations(aigw aigwVar, aigl aiglVar) {
        return combineAttributes(combineNullability(aigwVar, aiglVar), aiglVar.getAttributes());
    }

    private final aigw createAbbreviation(aihk aihkVar, aihr aihrVar, boolean z) {
        aiid typeConstructor = aihkVar.getDescriptor().getTypeConstructor();
        typeConstructor.getClass();
        return aigq.simpleTypeWithNonTrivialMemberScope(aihrVar, typeConstructor, aihkVar.getArguments(), z, ahxd.INSTANCE);
    }

    private final aihr createdCombinedAttributes(aigl aiglVar, aihr aihrVar) {
        return aigr.isError(aiglVar) ? aiglVar.getAttributes() : aihrVar.add(aiglVar.getAttributes());
    }

    private final aiin expandNonArgumentTypeProjection(aiin aiinVar, aihk aihkVar, int i) {
        aijf aijfVarUnwrap = aiinVar.getType().unwrap();
        if (!aifw.isDynamic(aijfVarUnwrap)) {
            aigw aigwVarAsSimpleType = aiiu.asSimpleType(aijfVarUnwrap);
            if (!aigr.isError(aigwVarAsSimpleType) && aimr.requiresTypeAliasExpansion(aigwVarAsSimpleType)) {
                aiid constructor = aigwVarAsSimpleType.getConstructor();
                agbd declarationDescriptor = constructor.getDeclarationDescriptor();
                constructor.getParameters().size();
                aigwVarAsSimpleType.getArguments().size();
                if (!(declarationDescriptor instanceof agee)) {
                    if (!(declarationDescriptor instanceof aged)) {
                        aigw aigwVarSubstituteArguments = substituteArguments(aigwVarAsSimpleType, aihkVar, i);
                        checkTypeArgumentsSubstitution(aigwVarAsSimpleType, aigwVarSubstituteArguments);
                        return new aiip(aiinVar.getProjectionKind(), aigwVarSubstituteArguments);
                    }
                    aged agedVar = (aged) declarationDescriptor;
                    if (aihkVar.isRecursion(agedVar)) {
                        this.reportStrategy.recursiveTypeAlias(agedVar);
                        aijg aijgVar = aijg.INVARIANT;
                        aill aillVar = aill.RECURSIVE_TYPE_ALIAS;
                        String string = agedVar.getName().toString();
                        string.getClass();
                        return new aiip(aijgVar, ailm.createErrorType(aillVar, string));
                    }
                    int i2 = i + 1;
                    List<aiin> arguments = aigwVarAsSimpleType.getArguments();
                    ArrayList arrayList = new ArrayList(woy.bp(arguments, 10));
                    int i3 = 0;
                    for (Object obj : arguments) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            woy.bo();
                        }
                        arrayList.add(expandTypeProjection((aiin) obj, aihkVar, constructor.getParameters().get(i3), i2));
                        i3 = i4;
                    }
                    aigw aigwVarExpandRecursively = expandRecursively(aihk.Companion.create(aihkVar, agedVar, arrayList), aigwVarAsSimpleType.getAttributes(), aigwVarAsSimpleType.isMarkedNullable(), i2, false);
                    aigw aigwVarSubstituteArguments2 = substituteArguments(aigwVarAsSimpleType, aihkVar, i);
                    if (!aifw.isDynamic(aigwVarExpandRecursively)) {
                        aigwVarExpandRecursively = aiha.withAbbreviation(aigwVarExpandRecursively, aigwVarSubstituteArguments2);
                    }
                    return new aiip(aiinVar.getProjectionKind(), aigwVarExpandRecursively);
                }
            }
        }
        return aiinVar;
    }

    private final aigw expandRecursively(aihk aihkVar, aihr aihrVar, boolean z, int i, boolean z2) {
        aiin aiinVarExpandTypeProjection = expandTypeProjection(new aiip(aijg.INVARIANT, aihkVar.getDescriptor().getUnderlyingType()), aihkVar, null, i);
        aigl type = aiinVarExpandTypeProjection.getType();
        type.getClass();
        aigw aigwVarAsSimpleType = aiiu.asSimpleType(type);
        if (aigr.isError(aigwVarAsSimpleType)) {
            return aigwVarAsSimpleType;
        }
        aiinVarExpandTypeProjection.getProjectionKind();
        checkRepeatedAnnotations(aigwVarAsSimpleType.getAnnotations(), aifi.getAnnotations(aihrVar));
        aigw aigwVarMakeNullableIfNeeded = aijc.makeNullableIfNeeded(combineAttributes(aigwVarAsSimpleType, aihrVar), z);
        aigwVarMakeNullableIfNeeded.getClass();
        return z2 ? aiha.withAbbreviation(aigwVarMakeNullableIfNeeded, createAbbreviation(aihkVar, aihrVar, z)) : aigwVarMakeNullableIfNeeded;
    }

    private final aiin expandTypeProjection(aiin aiinVar, aihk aihkVar, agee ageeVar, int i) {
        aijg variance;
        aijg aijgVar;
        aijg aijgVar2;
        Companion.assertRecursionDepth(i, aihkVar.getDescriptor());
        if (aiinVar.isStarProjection()) {
            ageeVar.getClass();
            return aijc.makeStarProjection(ageeVar);
        }
        aigl type = aiinVar.getType();
        type.getClass();
        aiin replacement = aihkVar.getReplacement(type.getConstructor());
        if (replacement == null) {
            return expandNonArgumentTypeProjection(aiinVar, aihkVar, i);
        }
        if (replacement.isStarProjection()) {
            ageeVar.getClass();
            return aijc.makeStarProjection(ageeVar);
        }
        aijf aijfVarUnwrap = replacement.getType().unwrap();
        aijg projectionKind = replacement.getProjectionKind();
        projectionKind.getClass();
        aijg projectionKind2 = aiinVar.getProjectionKind();
        projectionKind2.getClass();
        if (projectionKind2 != projectionKind && projectionKind2 != (aijgVar2 = aijg.INVARIANT)) {
            if (projectionKind != aijgVar2) {
                this.reportStrategy.conflictingProjection(aihkVar.getDescriptor(), ageeVar, aijfVarUnwrap);
            } else {
                projectionKind = projectionKind2;
            }
        }
        if (ageeVar == null || (variance = ageeVar.getVariance()) == null) {
            variance = aijg.INVARIANT;
        }
        if (variance != projectionKind && variance != (aijgVar = aijg.INVARIANT)) {
            if (projectionKind == aijgVar) {
                projectionKind = aijgVar;
            } else {
                this.reportStrategy.conflictingProjection(aihkVar.getDescriptor(), ageeVar, aijfVarUnwrap);
            }
        }
        checkRepeatedAnnotations(type.getAnnotations(), aijfVarUnwrap.getAnnotations());
        return new aiip(projectionKind, aijfVarUnwrap instanceof aifv ? combineAttributes((aifv) aijfVarUnwrap, type.getAttributes()) : combineNullabilityAndAnnotations(aiiu.asSimpleType(aijfVarUnwrap), type));
    }

    private final aigw substituteArguments(aigw aigwVar, aihk aihkVar, int i) {
        aiid constructor = aigwVar.getConstructor();
        List<aiin> arguments = aigwVar.getArguments();
        ArrayList arrayList = new ArrayList(woy.bp(arguments, 10));
        int i2 = 0;
        for (Object obj : arguments) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                woy.bo();
            }
            aiin aiinVar = (aiin) obj;
            aiin aiinVarExpandTypeProjection = expandTypeProjection(aiinVar, aihkVar, constructor.getParameters().get(i2), i + 1);
            if (!aiinVarExpandTypeProjection.isStarProjection()) {
                aiinVarExpandTypeProjection = new aiip(aiinVarExpandTypeProjection.getProjectionKind(), aijc.makeNullableIfNeeded(aiinVarExpandTypeProjection.getType(), aiinVar.getType().isMarkedNullable()));
            }
            arrayList.add(aiinVarExpandTypeProjection);
            i2 = i3;
        }
        return aiiu.replace$default(aigwVar, arrayList, null, 2, null);
    }

    public final aigw expand(aihk aihkVar, aihr aihrVar) {
        aihkVar.getClass();
        aihrVar.getClass();
        return expandRecursively(aihkVar, aihrVar, false, 0, true);
    }

    private final aifv combineAttributes(aifv aifvVar, aihr aihrVar) {
        return aifvVar.replaceAttributes(createdCombinedAttributes(aifvVar, aihrVar));
    }
}
