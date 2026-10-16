package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aiks extends defpackage.aige {
    private final defpackage.aihw transformToNewType(defpackage.aihw aihwVar) {
        defpackage.aihl type;
        defpackage.aijd constructor = aihwVar.getConstructor();
        defpackage.aihk alternative = null;
        aikfVarUnwrap = null;
        defpackage.aikf aikfVarUnwrap = null;
        if (constructor instanceof defpackage.ahux) {
            defpackage.ahux ahuxVar = (defpackage.ahux) constructor;
            defpackage.aijn projection = ahuxVar.getProjection();
            if (projection.getProjectionKind() != defpackage.aikg.IN_VARIANCE) {
                projection = null;
            }
            if (projection != null && (type = projection.getType()) != null) {
                aikfVarUnwrap = type.unwrap();
            }
            defpackage.aikf aikfVar = aikfVarUnwrap;
            if (ahuxVar.getNewTypeConstructor() == null) {
                defpackage.aijn projection2 = ahuxVar.getProjection();
                java.util.Collection<defpackage.aihl> collectionMo89getSupertypes = ahuxVar.mo89getSupertypes();
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(collectionMo89getSupertypes, 10));
                java.util.Iterator<T> it = collectionMo89getSupertypes.iterator();
                while (it.hasNext()) {
                    arrayList.add(((defpackage.aihl) it.next()).unwrap());
                }
                ahuxVar.setNewTypeConstructor(new defpackage.ailb(projection2, arrayList, null, 4, null));
            }
            defpackage.aimq aimqVar = defpackage.aimq.FOR_SUBTYPING;
            defpackage.ailb newTypeConstructor = ahuxVar.getNewTypeConstructor();
            newTypeConstructor.getClass();
            return new defpackage.aikw(aimqVar, newTypeConstructor, aikfVar, aihwVar.getAttributes(), aihwVar.isMarkedNullable(), false, 32, null);
        }
        boolean z = false;
        if (constructor instanceof defpackage.ahvx) {
            java.util.Collection<defpackage.aihl> collectionMo89getSupertypes2 = ((defpackage.ahvx) constructor).mo89getSupertypes();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(collectionMo89getSupertypes2, 10));
            java.util.Iterator<T> it2 = collectionMo89getSupertypes2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(defpackage.aikc.makeNullableAsSpecified((defpackage.aihl) it2.next(), aihwVar.isMarkedNullable()));
            }
            return defpackage.aihq.simpleTypeWithNonTrivialMemberScope(aihwVar.getAttributes(), new defpackage.aihk(arrayList2), defpackage.afce.a, false, aihwVar.getMemberScope());
        }
        if (!(constructor instanceof defpackage.aihk) || !aihwVar.isMarkedNullable()) {
            return aihwVar;
        }
        defpackage.aihk aihkVar = (defpackage.aihk) constructor;
        java.util.Collection<defpackage.aihl> collectionMo89getSupertypes3 = aihkVar.mo89getSupertypes();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.afga.aj(collectionMo89getSupertypes3, 10));
        java.util.Iterator<T> it3 = collectionMo89getSupertypes3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(defpackage.ainr.makeNullable((defpackage.aihl) it3.next()));
            z = true;
        }
        if (z) {
            defpackage.aihl alternativeType = aihkVar.getAlternativeType();
            alternative = new defpackage.aihk(arrayList3).setAlternative(alternativeType != null ? defpackage.ainr.makeNullable(alternativeType) : null);
        }
        if (alternative != null) {
            aihkVar = alternative;
        }
        return aihkVar.createType();
    }

    @Override // defpackage.aige
    public defpackage.aikf prepareType(defpackage.aimw aimwVar) {
        defpackage.aikf aikfVarFlexibleType;
        aimwVar.getClass();
        if (!(aimwVar instanceof defpackage.aihl)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        defpackage.aikf aikfVarUnwrap = ((defpackage.aihl) aimwVar).unwrap();
        if (aikfVarUnwrap instanceof defpackage.aihw) {
            aikfVarFlexibleType = transformToNewType((defpackage.aihw) aikfVarUnwrap);
        } else {
            if (!(aikfVarUnwrap instanceof defpackage.aiha)) {
                throw new defpackage.afas();
            }
            defpackage.aiha aihaVar = (defpackage.aiha) aikfVarUnwrap;
            defpackage.aihw aihwVarTransformToNewType = transformToNewType(aihaVar.getLowerBound());
            defpackage.aihw aihwVarTransformToNewType2 = transformToNewType(aihaVar.getUpperBound());
            aikfVarFlexibleType = (aihwVarTransformToNewType == aihaVar.getLowerBound() && aihwVarTransformToNewType2 == aihaVar.getUpperBound()) ? aikfVarUnwrap : defpackage.aihq.flexibleType(aihwVarTransformToNewType, aihwVarTransformToNewType2);
        }
        return defpackage.aike.inheritEnhancement(aikfVarFlexibleType, aikfVarUnwrap, new defpackage.aikr(this));
    }
}
