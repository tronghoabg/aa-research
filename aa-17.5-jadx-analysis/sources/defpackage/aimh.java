package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class aimh {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.aixv r4, defpackage.afdr r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.aixu
            if (r0 == 0) goto L13
            r0 = r6
            aixu r0 = (defpackage.aixu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aixu r0 = new aixu
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            defpackage.woy.dF(r6)     // Catch: java.lang.Throwable -> L29
            goto L65
        L29:
            r4 = move-exception
            goto L6b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.woy.dF(r6)
            afco r6 = r0.hH()
            bwi r2 = defpackage.aivh.d
            afcm r6 = r6.get(r2)
            if (r6 != r4) goto L6f
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            aitg r6 = new aitg     // Catch: java.lang.Throwable -> L29
            afck r0 = defpackage.affa.s(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r0, r3)     // Catch: java.lang.Throwable -> L29
            r6.z()     // Catch: java.lang.Throwable -> L29
            nxj r0 = new nxj     // Catch: java.lang.Throwable -> L29
            r2 = 8
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            aixl r4 = r4.b     // Catch: java.lang.Throwable -> L29
            r4.r(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.k()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L65
            return r1
        L65:
            r5.invoke()
            afak r4 = defpackage.afak.a
            return r4
        L6b:
            r5.invoke()
            throw r4
        L6f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aimh.a(aixv, afdr, afck):java.lang.Object");
    }

    public static final int argumentsCount(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.argumentsCount(ailwVar);
    }

    public static final ailz asArgumentList(aimg aimgVar, ailx ailxVar) {
        aimgVar.getClass();
        ailxVar.getClass();
        return aimgVar.asArgumentList(ailxVar);
    }

    public static final ails asCapturedTypeUnwrappingDnn(aimg aimgVar, ailx ailxVar) {
        aimgVar.getClass();
        ailxVar.getClass();
        return aimgVar.asCapturedTypeUnwrappingDnn(ailxVar);
    }

    public static final ailv asFlexibleType(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.asFlexibleType(ailwVar);
    }

    public static final ailx asRigidType(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.asRigidType(ailwVar);
    }

    public static final aima asTypeArgument(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.asTypeArgument(ailwVar);
    }

    public static final aixx c(aitx aitxVar, afco afcoVar, int i, int i2, int i3, afeg afegVar) {
        aixv aixvVar = new aixv(aits.b(aitxVar, afcoVar), afpt.r(i, i2, 4));
        ahno.a(i3, afegVar, aixvVar, aixvVar);
        return aixvVar;
    }

    public static final ailq captureStatus(aimg aimgVar, ails ailsVar) {
        aimgVar.getClass();
        ailsVar.getClass();
        return aimgVar.captureStatus(ailsVar);
    }

    public static final List<aily> fastCorrespondingSupertypes(aimg aimgVar, ailx ailxVar, aimd aimdVar) {
        aimgVar.getClass();
        ailxVar.getClass();
        aimdVar.getClass();
        return aimgVar.fastCorrespondingSupertypes(ailxVar, aimdVar);
    }

    public static final aima get(aimg aimgVar, ailz ailzVar, int i) {
        aimgVar.getClass();
        ailzVar.getClass();
        return aimgVar.get(ailzVar, i);
    }

    public static final aima getArgument(aimg aimgVar, ailw ailwVar, int i) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.getArgument(ailwVar, i);
    }

    public static final aima getArgumentOrNull(aimg aimgVar, ailx ailxVar, int i) {
        aimgVar.getClass();
        ailxVar.getClass();
        return aimgVar.getArgumentOrNull(ailxVar, i);
    }

    public static final aime getParameter(aimg aimgVar, aimd aimdVar, int i) {
        aimgVar.getClass();
        aimdVar.getClass();
        return aimgVar.getParameter(aimdVar, i);
    }

    public static final ailw getType(aimg aimgVar, aima aimaVar) {
        aimgVar.getClass();
        aimaVar.getClass();
        return aimgVar.getType(aimaVar);
    }

    public static final aime getTypeParameter(aimg aimgVar, aiml aimlVar) {
        aimgVar.getClass();
        aimlVar.getClass();
        return aimgVar.getTypeParameter(aimlVar);
    }

    public static final aimm getVariance(aimg aimgVar, aima aimaVar) {
        aimgVar.getClass();
        aimaVar.getClass();
        return aimgVar.getVariance(aimaVar);
    }

    public static final boolean hasRecursiveBounds(aimg aimgVar, aime aimeVar, aimd aimdVar) {
        aimgVar.getClass();
        aimeVar.getClass();
        return aimgVar.hasRecursiveBounds(aimeVar, aimdVar);
    }

    public static final boolean isAnyConstructor(aimg aimgVar, aimd aimdVar) {
        aimgVar.getClass();
        aimdVar.getClass();
        return aimgVar.isAnyConstructor(aimdVar);
    }

    public static final boolean isCapturedType(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.isCapturedType(ailwVar);
    }

    public static final boolean isClassType(aimg aimgVar, ailx ailxVar) {
        aimgVar.getClass();
        ailxVar.getClass();
        return aimgVar.isClassType(ailxVar);
    }

    public static final boolean isClassTypeConstructor(aimg aimgVar, aimd aimdVar) {
        aimgVar.getClass();
        aimdVar.getClass();
        return aimgVar.isClassTypeConstructor(aimdVar);
    }

    public static final boolean isCommonFinalClassConstructor(aimg aimgVar, aimd aimdVar) {
        aimgVar.getClass();
        aimdVar.getClass();
        return aimgVar.isCommonFinalClassConstructor(aimdVar);
    }

    public static final boolean isDefinitelyNotNullType(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.isDefinitelyNotNullType(ailwVar);
    }

    public static final boolean isDenotable(aimg aimgVar, aimd aimdVar) {
        aimgVar.getClass();
        aimdVar.getClass();
        return aimgVar.isDenotable(aimdVar);
    }

    public static final boolean isDynamic(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.isDynamic(ailwVar);
    }

    public static final boolean isError(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.isError(ailwVar);
    }

    public static final boolean isFlexible(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.isFlexible(ailwVar);
    }

    public static final boolean isFlexibleWithDifferentTypeConstructors(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.isFlexibleWithDifferentTypeConstructors(ailwVar);
    }

    public static final boolean isIntegerLiteralType(aimg aimgVar, ailx ailxVar) {
        aimgVar.getClass();
        ailxVar.getClass();
        return aimgVar.isIntegerLiteralType(ailxVar);
    }

    public static final boolean isIntegerLiteralTypeConstructor(aimg aimgVar, aimd aimdVar) {
        aimgVar.getClass();
        aimdVar.getClass();
        return aimgVar.isIntegerLiteralTypeConstructor(aimdVar);
    }

    public static final boolean isIntersection(aimg aimgVar, aimd aimdVar) {
        aimgVar.getClass();
        aimdVar.getClass();
        return aimgVar.isIntersection(aimdVar);
    }

    public static final boolean isMarkedNullable(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.isMarkedNullable(ailwVar);
    }

    public static final boolean isNotNullTypeParameter(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.isNotNullTypeParameter(ailwVar);
    }

    public static final boolean isNothingConstructor(aimg aimgVar, aimd aimdVar) {
        aimgVar.getClass();
        aimdVar.getClass();
        return aimgVar.isNothingConstructor(aimdVar);
    }

    public static final boolean isOldCapturedType(aimg aimgVar, ails ailsVar) {
        aimgVar.getClass();
        ailsVar.getClass();
        return aimgVar.isOldCapturedType(ailsVar);
    }

    public static final boolean isSingleClassifierType(aimg aimgVar, ailx ailxVar) {
        aimgVar.getClass();
        ailxVar.getClass();
        return aimgVar.isSingleClassifierType(ailxVar);
    }

    public static final boolean isStarProjection(aimg aimgVar, aima aimaVar) {
        aimgVar.getClass();
        aimaVar.getClass();
        return aimgVar.isStarProjection(aimaVar);
    }

    public static final boolean isStubType(aimg aimgVar, ailx ailxVar) {
        aimgVar.getClass();
        ailxVar.getClass();
        return aimgVar.isStubType(ailxVar);
    }

    public static final boolean isStubTypeForBuilderInference(aimg aimgVar, ailx ailxVar) {
        aimgVar.getClass();
        ailxVar.getClass();
        return aimgVar.isStubTypeForBuilderInference(ailxVar);
    }

    public static final ailx lowerBound(aimg aimgVar, ailv ailvVar) {
        aimgVar.getClass();
        ailvVar.getClass();
        return aimgVar.lowerBound(ailvVar);
    }

    public static final ailx lowerBoundIfFlexible(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.lowerBoundIfFlexible(ailwVar);
    }

    public static final ailw lowerType(aimg aimgVar, ails ailsVar) {
        aimgVar.getClass();
        ailsVar.getClass();
        return aimgVar.lowerType(ailsVar);
    }

    public static final ailw makeDefinitelyNotNullOrNotNull(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.makeDefinitelyNotNullOrNotNull(ailwVar);
    }

    public static final aily originalIfDefinitelyNotNullable(aimg aimgVar, ailx ailxVar) {
        aimgVar.getClass();
        ailxVar.getClass();
        return aimgVar.originalIfDefinitelyNotNullable(ailxVar);
    }

    public static final int parametersCount(aimg aimgVar, aimd aimdVar) {
        aimgVar.getClass();
        aimdVar.getClass();
        return aimgVar.parametersCount(aimdVar);
    }

    public static final Collection<ailw> possibleIntegerTypes(aimg aimgVar, ailx ailxVar) {
        aimgVar.getClass();
        ailxVar.getClass();
        return aimgVar.possibleIntegerTypes(ailxVar);
    }

    public static final aima projection(aimg aimgVar, ailr ailrVar) {
        aimgVar.getClass();
        ailrVar.getClass();
        return aimgVar.projection(ailrVar);
    }

    public static final int size(aimg aimgVar, ailz ailzVar) {
        aimgVar.getClass();
        ailzVar.getClass();
        return aimgVar.size(ailzVar);
    }

    public static final Collection<ailw> supertypes(aimg aimgVar, aimd aimdVar) {
        aimgVar.getClass();
        aimdVar.getClass();
        return aimgVar.supertypes(aimdVar);
    }

    public static final ailr typeConstructor(aimg aimgVar, ails ailsVar) {
        aimgVar.getClass();
        ailsVar.getClass();
        return aimgVar.typeConstructor(ailsVar);
    }

    public static final ailx upperBoundIfFlexible(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.upperBoundIfFlexible(ailwVar);
    }

    public static final ailw withNullability(aimg aimgVar, ailw ailwVar, boolean z) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.withNullability(ailwVar, z);
    }

    public static final aimm getVariance(aimg aimgVar, aime aimeVar) {
        aimgVar.getClass();
        aimeVar.getClass();
        return aimgVar.getVariance(aimeVar);
    }

    public static final boolean isDefinitelyNotNullType(aimg aimgVar, ailx ailxVar) {
        aimgVar.getClass();
        ailxVar.getClass();
        return aimgVar.isDefinitelyNotNullType(ailxVar);
    }

    public static final aimd typeConstructor(aimg aimgVar, ailw ailwVar) {
        aimgVar.getClass();
        ailwVar.getClass();
        return aimgVar.typeConstructor(ailwVar);
    }

    public static final ailx withNullability(aimg aimgVar, ailx ailxVar, boolean z) {
        aimgVar.getClass();
        ailxVar.getClass();
        return aimgVar.withNullability(ailxVar, z);
    }

    public static final aimd typeConstructor(aimg aimgVar, ailx ailxVar) {
        aimgVar.getClass();
        ailxVar.getClass();
        return aimgVar.typeConstructor(ailxVar);
    }
}
