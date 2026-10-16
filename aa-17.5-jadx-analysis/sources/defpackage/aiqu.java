package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aiqu {
    public static final aiqt Companion;
    private static final aiqu EMPTY;
    private static final aiqu RAW_SUBSTITUTION = new aiqu(afbf.a, true);
    private final boolean eraseToUpperBoundsAfterSubstitution;
    private final Map<afic, afid> substitution;

    static {
        afeu afeuVar = null;
        Companion = new aiqt(afeuVar);
        EMPTY = new aiqu(afbf.a, false, 2, afeuVar);
    }

    public /* synthetic */ aiqu(Map map, boolean z, int i, afeu afeuVar) {
        this(map, z & ((i & 2) == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aiqu copy(boolean z) {
        return z != this.eraseToUpperBoundsAfterSubstitution ? (!this.substitution.isEmpty() || z) ? (this.substitution.isEmpty() && z) ? RAW_SUBSTITUTION : new aiqu(this.substitution, z) : EMPTY : this;
    }

    private final afid lowerBoundIfFlexible(afid afidVar) {
        aiqc aiqcVarLowerBoundIfFlexible;
        afib afibVar = afidVar.c;
        aiqc aiqcVar = afibVar instanceof aiqc ? (aiqc) afibVar : null;
        return (aiqcVar == null || (aiqcVarLowerBoundIfFlexible = aiqcVar.lowerBoundIfFlexible()) == null) ? afidVar : new afid(afidVar.b, aiqcVarLowerBoundIfFlexible);
    }

    public static /* synthetic */ afid substitute$default(aiqu aiquVar, afib afibVar, afie afieVar, int i, Object obj) {
        if ((i & 2) != 0) {
            afieVar = afie.a;
        }
        return aiquVar.substitute(afibVar, afieVar);
    }

    private final afid substituteWithoutErasureRecursively(afib afibVar, afie afieVar) {
        afie afieVar2;
        if (this.substitution.isEmpty()) {
            return new afid(afieVar, afibVar);
        }
        boolean z = afibVar instanceof aiqc;
        aiqc aiqcVar = z ? (aiqc) afibVar : null;
        aiqc aiqcVarLowerBoundIfFlexible = aiqcVar != null ? aiqcVar.lowerBoundIfFlexible() : null;
        aiqc aiqcVar2 = z ? (aiqc) afibVar : null;
        aiqc aiqcVarUpperBoundIfFlexible = aiqcVar2 != null ? aiqcVar2.upperBoundIfFlexible() : null;
        if (aiqcVarLowerBoundIfFlexible != null && aiqcVarUpperBoundIfFlexible != null) {
            afid afidVarLowerBoundIfFlexible = lowerBoundIfFlexible(substituteWithoutErasureRecursively(aiqcVarLowerBoundIfFlexible, afieVar));
            afib afibVar2 = upperBoundIfFlexible(substituteWithoutErasureRecursively(aiqcVarUpperBoundIfFlexible, afieVar)).c;
            afib afibVar3 = afidVarLowerBoundIfFlexible.c;
            return (afibVar2 == null || afibVar3 == null) ? afid.a : new afid(afidVarLowerBoundIfFlexible.b, airf.createPlatformKType(afibVar3, afibVar2, ((aiqc) afibVar).isRawType()));
        }
        afhf classifier = afibVar.getClassifier();
        if (classifier == null) {
            return new afid(afieVar, afibVar);
        }
        afid afidVar = this.substitution.get(classifier);
        if (afidVar != null) {
            afib afibVar4 = afidVar.c;
            return (afibVar4 == null || (afieVar2 = afidVar.b) == null) ? afidVar : new afid(aiqw.intersectWith(afieVar2, afieVar), withWorseNullabilityOfBoth(afibVar4, afibVar));
        }
        if (!afibVar.getArguments().isEmpty()) {
            List<afid> arguments = afibVar.getArguments();
            ArrayList arrayList = new ArrayList(woy.bp(arguments, 10));
            for (afid afidVar2 : arguments) {
                afie afieVar3 = afidVar2.b;
                afib afibVar5 = afidVar2.c;
                arrayList.add((afibVar5 == null || afieVar3 == null) ? afid.a : substituteWithoutErasureRecursively(afibVar5, afieVar3));
            }
            boolean zIsMarkedNullable = afibVar.isMarkedNullable();
            List<Annotation> annotations = afibVar.getAnnotations();
            aiqc aiqcVar3 = z ? (aiqc) afibVar : null;
            afibVar = afik.i(classifier, arrayList, zIsMarkedNullable, annotations, aiqcVar3 != null ? aiqcVar3.getMutableCollectionClass() : null);
        }
        return new afid(afieVar, afibVar);
    }

    private final afid upperBoundIfFlexible(afid afidVar) {
        aiqc aiqcVarUpperBoundIfFlexible;
        afib afibVar = afidVar.c;
        aiqc aiqcVar = afibVar instanceof aiqc ? (aiqc) afibVar : null;
        return (aiqcVar == null || (aiqcVarUpperBoundIfFlexible = aiqcVar.upperBoundIfFlexible()) == null) ? afidVar : new afid(afidVar.b, aiqcVarUpperBoundIfFlexible);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Type inference failed for: r5v6, types: [afib, ailx, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.afib withWorseNullabilityOfBoth(defpackage.afib r5, defpackage.afib r6) {
        /*
            r4 = this;
            boolean r4 = r6 instanceof defpackage.ailw
            if (r4 == 0) goto L73
            aird r4 = defpackage.aird.INSTANCE
            r0 = r6
            ailw r0 = (defpackage.ailw) r0
            boolean r4 = r4.isFlexible(r0)
            if (r4 != 0) goto L73
            boolean r4 = defpackage.aiqw.access$isNullabilityFlexible(r5)
            if (r4 == 0) goto L1c
            boolean r4 = r6.isMarkedNullable()
            if (r4 != 0) goto L1c
            return r5
        L1c:
            r5.getClass()
            r4 = r5
            ailx r4 = (defpackage.ailx) r4
            aird r0 = defpackage.aird.INSTANCE
            boolean r1 = r6.isMarkedNullable()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L35
            boolean r5 = r5.isMarkedNullable()
            if (r5 == 0) goto L33
            goto L35
        L33:
            r5 = r2
            goto L36
        L35:
            r5 = r3
        L36:
            ailx r5 = r0.withNullability(r4, r5)
            boolean r0 = r5 instanceof defpackage.aiqc
            if (r0 == 0) goto L6f
            boolean r0 = r6 instanceof defpackage.aiqc
            r1 = 0
            if (r0 == 0) goto L47
            r0 = r6
            aiqc r0 = (defpackage.aiqc) r0
            goto L48
        L47:
            r0 = r1
        L48:
            if (r0 == 0) goto L52
            boolean r0 = r0.isDefinitelyNotNullType()
            if (r0 != r3) goto L52
        L50:
            r2 = r3
            goto L68
        L52:
            boolean r0 = r4 instanceof defpackage.aiqc
            if (r0 == 0) goto L59
            r1 = r4
            aiqc r1 = (defpackage.aiqc) r1
        L59:
            if (r1 == 0) goto L68
            boolean r4 = r1.isDefinitelyNotNullType()
            if (r4 != r3) goto L68
            boolean r4 = r6.isMarkedNullable()
            if (r4 != 0) goto L68
            goto L50
        L68:
            aiqc r5 = (defpackage.aiqc) r5
            aiqc r4 = r5.makeDefinitelyNotNullAsSpecified(r2)
            return r4
        L6f:
            r5.getClass()
            return r5
        L73:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "'"
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r5 = "' must be non flexible"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiqu.withWorseNullabilityOfBoth(afib, afib):afib");
    }

    public final aiqu chainedWith(aiqu aiquVar) {
        aiquVar.getClass();
        if (this.eraseToUpperBoundsAfterSubstitution) {
            return this;
        }
        if (this.substitution.isEmpty()) {
            return EMPTY.copy(aiquVar.eraseToUpperBoundsAfterSubstitution);
        }
        if (aiquVar.substitution.isEmpty()) {
            return copy(aiquVar.eraseToUpperBoundsAfterSubstitution);
        }
        Map<afic, afid> map = this.substitution;
        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            afid afidVarSubstitute = (afid) entry.getValue();
            afib afibVar = afidVarSubstitute.c;
            afie afieVar = afidVarSubstitute.b;
            if (afibVar != null && afieVar != null) {
                afidVarSubstitute = aiquVar.substitute(afibVar, afieVar);
            }
            linkedHashMap.put(key, afidVarSubstitute);
        }
        return new aiqu(linkedHashMap, aiquVar.eraseToUpperBoundsAfterSubstitution);
    }

    public final aiqu disjointSumWith(aiqu aiquVar, String str) {
        aiquVar.getClass();
        str.getClass();
        boolean z = true;
        if (!this.eraseToUpperBoundsAfterSubstitution && !aiquVar.eraseToUpperBoundsAfterSubstitution) {
            z = false;
        }
        if (this.substitution.isEmpty()) {
            return aiquVar.copy(z);
        }
        if (aiquVar.substitution.isEmpty()) {
            return copy(z);
        }
        Set setCj = woy.cj(this.substitution.keySet(), aiquVar.substitution.keySet());
        if (setCj.isEmpty()) {
            return new aiqu(woy.bb(this.substitution, aiquVar.substitution), z);
        }
        throw new IllegalStateException("Substitutors must not have intersecting keys: " + woy.cu(setCj, null, null, null, null, 63) + ". Member: " + str);
    }

    public final afid substitute(afib afibVar, afie afieVar) {
        afibVar.getClass();
        afieVar.getClass();
        boolean z = this.eraseToUpperBoundsAfterSubstitution;
        afid afidVarSubstituteWithoutErasureRecursively = substituteWithoutErasureRecursively(afibVar, afieVar);
        if (!z) {
            return afidVarSubstituteWithoutErasureRecursively;
        }
        afib afibVar2 = afidVarSubstituteWithoutErasureRecursively.c;
        return afid.a(afidVarSubstituteWithoutErasureRecursively, afibVar2 != null ? aiqw.eraseToUpperBoundsAndMakeItRawRecursively$default(afibVar2, null, 1, null) : null);
    }

    public aiqu(Map<afic, afid> map, boolean z) {
        map.getClass();
        this.substitution = map;
        this.eraseToUpperBoundsAfterSubstitution = z;
    }
}
