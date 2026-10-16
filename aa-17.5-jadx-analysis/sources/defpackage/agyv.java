package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class agyv {
    private final agvu c;
    private final agyx projectionComputer;
    private final agwa typeParameterResolver;
    private final aiim typeParameterUpperBoundEraser;

    /* JADX WARN: Multi-variable type inference failed */
    public agyv(agvu agvuVar, agwa agwaVar) {
        agvuVar.getClass();
        agwaVar.getClass();
        this.c = agvuVar;
        this.typeParameterResolver = agwaVar;
        agyx agyxVar = new agyx();
        this.projectionComputer = agyxVar;
        this.typeParameterUpperBoundEraser = new aiim(agyxVar, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean argumentsMakeSenseOnlyForMutableContainer(agzl agzlVar, agba agbaVar) {
        aijg variance;
        if (!agzz.isSuperWildcard((agzw) woy.bL(agzlVar.getTypeArguments()))) {
            return false;
        }
        List<agee> parameters = afzr.INSTANCE.convertReadOnlyToMutable(agbaVar).getTypeConstructor().getParameters();
        parameters.getClass();
        agee ageeVar = (agee) woy.bL(parameters);
        return (ageeVar == null || (variance = ageeVar.getVariance()) == null || variance == aijg.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<defpackage.aiin> computeArguments(defpackage.agzl r9, defpackage.agyr r10, defpackage.aiid r11) {
        /*
            r8 = this;
            boolean r0 = r9.isRaw()
            r1 = 1
            if (r0 != 0) goto L21
            java.util.List r0 = r9.getTypeArguments()
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 == 0) goto L20
            java.util.List r0 = r11.getParameters()
            r0.getClass()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            java.util.List r0 = r11.getParameters()
            r0.getClass()
            if (r1 == 0) goto L2f
            java.util.List r8 = r8.computeRawTypeArguments(r9, r0, r11, r10)
            return r8
        L2f:
            int r10 = r0.size()
            java.util.List r11 = r9.getTypeArguments()
            int r11 = r11.size()
            r1 = 10
            if (r10 == r11) goto L7b
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = defpackage.woy.bp(r0, r1)
            r8.<init>(r9)
            java.util.Iterator r9 = r0.iterator()
        L4c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L76
            java.lang.Object r10 = r9.next()
            agee r10 = (defpackage.agee) r10
            aiip r11 = new aiip
            aill r0 = defpackage.aill.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            ahnj r10 = r10.getName()
            java.lang.String r10 = r10.asString()
            r10.getClass()
            java.lang.String[] r10 = new java.lang.String[]{r10}
            ailj r10 = defpackage.ailm.createErrorType(r0, r10)
            r11.<init>(r10)
            r8.add(r11)
            goto L4c
        L76:
            java.util.List r8 = defpackage.woy.cf(r8)
            return r8
        L7b:
            java.util.List r9 = r9.getTypeArguments()
            java.lang.Iterable r9 = defpackage.woy.bD(r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = defpackage.woy.bp(r9, r1)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L90:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto Lc1
            java.lang.Object r11 = r9.next()
            afbh r11 = (defpackage.afbh) r11
            int r1 = r11.a
            java.lang.Object r11 = r11.b
            agzw r11 = (defpackage.agzw) r11
            r0.size()
            java.lang.Object r1 = r0.get(r1)
            agee r1 = (defpackage.agee) r1
            aija r2 = defpackage.aija.COMMON
            r6 = 7
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            agyr r2 = defpackage.agys.toAttributes$default(r2, r3, r4, r5, r6, r7)
            r1.getClass()
            aiin r11 = r8.transformToTypeProjection(r11, r2, r1)
            r10.add(r11)
            goto L90
        Lc1:
            java.util.List r8 = defpackage.woy.cf(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agyv.computeArguments(agzl, agyr, aiid):java.util.List");
    }

    private final List<aiin> computeRawTypeArguments(agzl agzlVar, List<? extends agee> list, aiid aiidVar, agyr agyrVar) {
        agyv agyvVar;
        agzl agzlVar2;
        aiid aiidVar2;
        agyr agyrVar2;
        aiin aiinVarComputeProjection;
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        for (agee ageeVar : list) {
            if (aimr.hasTypeParameterRecursiveBounds(ageeVar, null, agyrVar.getVisitedTypeParameters())) {
                aiinVarComputeProjection = aijc.makeStarProjection(ageeVar, agyrVar);
                agyvVar = this;
                agzlVar2 = agzlVar;
                aiidVar2 = aiidVar;
                agyrVar2 = agyrVar;
            } else {
                agyvVar = this;
                agzlVar2 = agzlVar;
                aiidVar2 = aiidVar;
                agyrVar2 = agyrVar;
                aiinVarComputeProjection = agyvVar.projectionComputer.computeProjection(ageeVar, agyrVar2.markIsRaw(agzlVar2.isRaw()), agyvVar.typeParameterUpperBoundEraser, new aigt(this.c.getStorageManager(), new agyu(agyvVar, ageeVar, agyrVar2, aiidVar2, agzlVar2)));
            }
            arrayList.add(aiinVarComputeProjection);
            this = agyvVar;
            agyrVar = agyrVar2;
            aiidVar = aiidVar2;
            agzlVar = agzlVar2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigl computeRawTypeArguments$lambda$0$0(agyv agyvVar, agee ageeVar, agyr agyrVar, aiid aiidVar, agzl agzlVar) {
        aiim aiimVar = agyvVar.typeParameterUpperBoundEraser;
        agbd declarationDescriptor = aiidVar.getDeclarationDescriptor();
        return aiimVar.getErasedUpperBound(ageeVar, agyrVar.withDefaultType(declarationDescriptor != null ? declarationDescriptor.getDefaultType() : null).markIsRaw(agzlVar.isRaw()));
    }

    private final aigw computeSimpleJavaClassifierType(agzl agzlVar, agyr agyrVar, aigw aigwVar) {
        agzl agzlVar2;
        aihr defaultAttributes;
        if (aigwVar == null || (defaultAttributes = aigwVar.getAttributes()) == null) {
            agzlVar2 = agzlVar;
            defaultAttributes = aihs.toDefaultAttributes(new agvq(this.c, agzlVar2, false, 4, null));
        } else {
            agzlVar2 = agzlVar;
        }
        aihr aihrVar = defaultAttributes;
        aiid aiidVarComputeTypeConstructor = computeTypeConstructor(agzlVar2, agyrVar);
        if (aiidVarComputeTypeConstructor == null) {
            return null;
        }
        boolean zIsNullable = isNullable(agyrVar);
        return (affa.f(aigwVar != null ? aigwVar.getConstructor() : null, aiidVarComputeTypeConstructor) && !agzlVar2.isRaw() && zIsNullable) ? aigwVar.makeNullableAsSpecified(true) : aigq.simpleType$default(aihrVar, aiidVarComputeTypeConstructor, computeArguments(agzlVar2, agyrVar, aiidVarComputeTypeConstructor), zIsNullable, (aiju) null, 16, (Object) null);
    }

    private final aiid computeTypeConstructor(agzl agzlVar, agyr agyrVar) {
        aiid typeConstructor;
        agzk classifier = agzlVar.getClassifier();
        if (classifier == null) {
            return createNotFoundClass(agzlVar);
        }
        if (!(classifier instanceof agzj)) {
            if (!(classifier instanceof agzx)) {
                Objects.toString(classifier);
                throw new IllegalStateException("Unknown classifier kind: ".concat(classifier.toString()));
            }
            agee ageeVarResolveTypeParameter = this.typeParameterResolver.resolveTypeParameter((agzx) classifier);
            if (ageeVarResolveTypeParameter == null) {
                return null;
            }
            return ageeVarResolveTypeParameter.getTypeConstructor();
        }
        agzj agzjVar = (agzj) classifier;
        ahnf fqName = agzjVar.getFqName();
        if (fqName == null) {
            Objects.toString(classifier);
            throw new AssertionError("Class type should have a FQ name: ".concat(classifier.toString()));
        }
        agba agbaVarMapKotlinClass = mapKotlinClass(agzlVar, agyrVar, fqName);
        if (agbaVarMapKotlinClass == null) {
            agbaVarMapKotlinClass = this.c.getComponents().getModuleClassResolver().resolveClass(agzjVar);
        }
        return (agbaVarMapKotlinClass == null || (typeConstructor = agbaVarMapKotlinClass.getTypeConstructor()) == null) ? createNotFoundClass(agzlVar) : typeConstructor;
    }

    private final aiid createNotFoundClass(agzl agzlVar) {
        aiid typeConstructor = this.c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(ahnd.Companion.topLevel(new ahnf(agzlVar.getClassifierQualifiedName())), woy.bg(0)).getTypeConstructor();
        typeConstructor.getClass();
        return typeConstructor;
    }

    private final boolean isConflictingArgumentFor(aijg aijgVar, agee ageeVar) {
        return (ageeVar.getVariance() == aijg.INVARIANT || aijgVar == ageeVar.getVariance()) ? false : true;
    }

    private final boolean isNullable(agyr agyrVar) {
        return (agyrVar.getFlexibility() == agyt.FLEXIBLE_LOWER_BOUND || agyrVar.isForAnnotationParameter() || agyrVar.getHowThisTypeIsUsed() == aija.SUPERTYPE) ? false : true;
    }

    private final agba mapKotlinClass(agzl agzlVar, agyr agyrVar, ahnf ahnfVar) {
        if (agyrVar.isForAnnotationParameter() && affa.f(ahnfVar, agyw.JAVA_LANG_CLASS_FQ_NAME)) {
            return this.c.getComponents().getReflectionTypes().getKClass();
        }
        agvu agvuVar = this.c;
        afzr afzrVar = afzr.INSTANCE;
        agba agbaVarMapJavaToKotlin$default = afzr.mapJavaToKotlin$default(afzrVar, ahnfVar, agvuVar.getModule().getBuiltIns(), null, 4, null);
        if (agbaVarMapJavaToKotlin$default == null) {
            return null;
        }
        return (afzrVar.isReadOnly(agbaVarMapJavaToKotlin$default) && (agyrVar.getFlexibility() == agyt.FLEXIBLE_LOWER_BOUND || agyrVar.getHowThisTypeIsUsed() == aija.SUPERTYPE || argumentsMakeSenseOnlyForMutableContainer(agzlVar, agbaVarMapJavaToKotlin$default))) ? afzrVar.convertReadOnlyToMutable(agbaVarMapJavaToKotlin$default) : agbaVarMapJavaToKotlin$default;
    }

    public static /* synthetic */ aigl transformArrayType$default(agyv agyvVar, agzi agziVar, agyr agyrVar, boolean z, int i, Object obj) {
        return agyvVar.transformArrayType(agziVar, agyrVar, z & ((i & 4) == 0));
    }

    private final aigl transformJavaClassifierType(agzl agzlVar, agyr agyrVar) {
        boolean z = false;
        if (!agyrVar.isForAnnotationParameter() && agyrVar.getHowThisTypeIsUsed() != aija.SUPERTYPE) {
            z = true;
        }
        boolean zIsRaw = agzlVar.isRaw();
        if (!zIsRaw && !z) {
            aigw aigwVarComputeSimpleJavaClassifierType = computeSimpleJavaClassifierType(agzlVar, agyrVar, null);
            return aigwVarComputeSimpleJavaClassifierType == null ? transformJavaClassifierType$errorType(agzlVar) : aigwVarComputeSimpleJavaClassifierType;
        }
        aigw aigwVarComputeSimpleJavaClassifierType2 = computeSimpleJavaClassifierType(agzlVar, agyrVar.withFlexibility(agyt.FLEXIBLE_LOWER_BOUND), null);
        if (aigwVarComputeSimpleJavaClassifierType2 == null) {
            return transformJavaClassifierType$errorType(agzlVar);
        }
        aigw aigwVarComputeSimpleJavaClassifierType3 = computeSimpleJavaClassifierType(agzlVar, agyrVar.withFlexibility(agyt.FLEXIBLE_UPPER_BOUND), aigwVarComputeSimpleJavaClassifierType2);
        return aigwVarComputeSimpleJavaClassifierType3 == null ? transformJavaClassifierType$errorType(agzlVar) : zIsRaw ? new agzc(aigwVarComputeSimpleJavaClassifierType2, aigwVarComputeSimpleJavaClassifierType3) : aigq.flexibleType(aigwVarComputeSimpleJavaClassifierType2, aigwVarComputeSimpleJavaClassifierType3);
    }

    private static final ailj transformJavaClassifierType$errorType(agzl agzlVar) {
        return ailm.createErrorType(aill.UNRESOLVED_JAVA_CLASS, agzlVar.getPresentableText());
    }

    private final aiin transformToTypeProjection(agzw agzwVar, agyr agyrVar, agee ageeVar) {
        if (!(agzwVar instanceof ahaa)) {
            return new aiip(aijg.INVARIANT, transformJavaType(agzwVar, agyrVar));
        }
        ahaa ahaaVar = (ahaa) agzwVar;
        agzw bound = ahaaVar.getBound();
        aijg aijgVar = ahaaVar.isExtends() ? aijg.OUT_VARIANCE : aijg.IN_VARIANCE;
        if (bound == null || isConflictingArgumentFor(aijgVar, ageeVar)) {
            return aijc.makeStarProjection(ageeVar, agyrVar);
        }
        agfc agfcVarExtractNullabilityAnnotationOnBoundedWildcard = agub.extractNullabilityAnnotationOnBoundedWildcard(this.c, ahaaVar);
        aigl aiglVarTransformJavaType = transformJavaType(bound, agys.toAttributes$default(aija.COMMON, false, false, null, 7, null));
        if (agfcVarExtractNullabilityAnnotationOnBoundedWildcard != null) {
            aiglVarTransformJavaType = aimr.replaceAnnotations(aiglVarTransformJavaType, agfk.Companion.create(woy.bX(aiglVarTransformJavaType.getAnnotations(), agfcVarExtractNullabilityAnnotationOnBoundedWildcard)));
        }
        return aimr.createProjection(aiglVarTransformJavaType, aijgVar, ageeVar);
    }

    public final aigl transformArrayType(agzi agziVar, agyr agyrVar, boolean z) {
        agziVar.getClass();
        agyrVar.getClass();
        agzw componentType = agziVar.getComponentType();
        aglf aglfVar = componentType instanceof aglf ? (aglf) componentType : null;
        afyi type = aglfVar != null ? aglfVar.getType() : null;
        agvq agvqVar = new agvq(this.c, agziVar, true);
        if (type != null) {
            aigw primitiveArrayKotlinType = this.c.getModule().getBuiltIns().getPrimitiveArrayKotlinType(type);
            primitiveArrayKotlinType.getClass();
            aigl aiglVarReplaceAnnotations = aimr.replaceAnnotations(primitiveArrayKotlinType, new agfr(primitiveArrayKotlinType.getAnnotations(), agvqVar));
            aiglVarReplaceAnnotations.getClass();
            aigw aigwVar = (aigw) aiglVarReplaceAnnotations;
            return agyrVar.isForAnnotationParameter() ? aigwVar : aigq.flexibleType(aigwVar, aigwVar.makeNullableAsSpecified(true));
        }
        aigl aiglVarTransformJavaType = transformJavaType(componentType, agys.toAttributes$default(aija.COMMON, agyrVar.isForAnnotationParameter(), false, null, 6, null));
        if (agyrVar.isForAnnotationParameter()) {
            aigw arrayType = this.c.getModule().getBuiltIns().getArrayType(z ? aijg.OUT_VARIANCE : aijg.INVARIANT, aiglVarTransformJavaType, agvqVar);
            arrayType.getClass();
            return arrayType;
        }
        aigw arrayType2 = this.c.getModule().getBuiltIns().getArrayType(aijg.INVARIANT, aiglVarTransformJavaType, agvqVar);
        arrayType2.getClass();
        return aigq.flexibleType(arrayType2, this.c.getModule().getBuiltIns().getArrayType(aijg.OUT_VARIANCE, aiglVarTransformJavaType, agvqVar).makeNullableAsSpecified(true));
    }

    public final aigl transformJavaType(agzw agzwVar, agyr agyrVar) {
        agyrVar.getClass();
        if (agzwVar instanceof aglf) {
            afyi type = ((aglf) agzwVar).getType();
            agvu agvuVar = this.c;
            aigw primitiveKotlinType = type != null ? agvuVar.getModule().getBuiltIns().getPrimitiveKotlinType(type) : agvuVar.getModule().getBuiltIns().getUnitType();
            primitiveKotlinType.getClass();
            return primitiveKotlinType;
        }
        if (agzwVar instanceof agzl) {
            return transformJavaClassifierType((agzl) agzwVar, agyrVar);
        }
        if (agzwVar instanceof agzi) {
            return transformArrayType$default(this, (agzi) agzwVar, agyrVar, false, 4, null);
        }
        if (agzwVar instanceof ahaa) {
            agzw bound = ((ahaa) agzwVar).getBound();
            if (bound != null) {
                return transformJavaType(bound, agyrVar);
            }
            aigw defaultBound = this.c.getModule().getBuiltIns().getDefaultBound();
            defaultBound.getClass();
            return defaultBound;
        }
        if (agzwVar != null) {
            Objects.toString(agzwVar);
            throw new UnsupportedOperationException("Unsupported type: ".concat(agzwVar.toString()));
        }
        aigw defaultBound2 = this.c.getModule().getBuiltIns().getDefaultBound();
        defaultBound2.getClass();
        return defaultBound2;
    }
}
