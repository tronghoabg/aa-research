package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class aijs extends aife {
    private final aigw transformToNewType(aigw aigwVar) {
        aigl type;
        aiid constructor = aigwVar.getConstructor();
        aigk alternative = null;
        aijfVarUnwrap = null;
        aijf aijfVarUnwrap = null;
        if (constructor instanceof ahtx) {
            ahtx ahtxVar = (ahtx) constructor;
            aiin projection = ahtxVar.getProjection();
            if (projection.getProjectionKind() != aijg.IN_VARIANCE) {
                projection = null;
            }
            if (projection != null && (type = projection.getType()) != null) {
                aijfVarUnwrap = type.unwrap();
            }
            aijf aijfVar = aijfVarUnwrap;
            if (ahtxVar.getNewTypeConstructor() == null) {
                aiin projection2 = ahtxVar.getProjection();
                Collection<aigl> collectionMo89getSupertypes = ahtxVar.mo89getSupertypes();
                ArrayList arrayList = new ArrayList(woy.bp(collectionMo89getSupertypes, 10));
                Iterator<T> it = collectionMo89getSupertypes.iterator();
                while (it.hasNext()) {
                    arrayList.add(((aigl) it.next()).unwrap());
                }
                ahtxVar.setNewTypeConstructor(new aikb(projection2, arrayList, null, 4, null));
            }
            ailq ailqVar = ailq.FOR_SUBTYPING;
            aikb newTypeConstructor = ahtxVar.getNewTypeConstructor();
            newTypeConstructor.getClass();
            return new aijw(ailqVar, newTypeConstructor, aijfVar, aigwVar.getAttributes(), aigwVar.isMarkedNullable(), false, 32, null);
        }
        boolean z = false;
        if (constructor instanceof ahux) {
            Collection<aigl> collectionMo89getSupertypes2 = ((ahux) constructor).mo89getSupertypes();
            ArrayList arrayList2 = new ArrayList(woy.bp(collectionMo89getSupertypes2, 10));
            Iterator<T> it2 = collectionMo89getSupertypes2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(aijc.makeNullableAsSpecified((aigl) it2.next(), aigwVar.isMarkedNullable()));
            }
            return aigq.simpleTypeWithNonTrivialMemberScope(aigwVar.getAttributes(), new aigk(arrayList2), afbe.a, false, aigwVar.getMemberScope());
        }
        if (!(constructor instanceof aigk) || !aigwVar.isMarkedNullable()) {
            return aigwVar;
        }
        aigk aigkVar = (aigk) constructor;
        Collection<aigl> collectionMo89getSupertypes3 = aigkVar.mo89getSupertypes();
        ArrayList arrayList3 = new ArrayList(woy.bp(collectionMo89getSupertypes3, 10));
        Iterator<T> it3 = collectionMo89getSupertypes3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(aimr.makeNullable((aigl) it3.next()));
            z = true;
        }
        if (z) {
            aigl alternativeType = aigkVar.getAlternativeType();
            alternative = new aigk(arrayList3).setAlternative(alternativeType != null ? aimr.makeNullable(alternativeType) : null);
        }
        if (alternative != null) {
            aigkVar = alternative;
        }
        return aigkVar.createType();
    }

    @Override // defpackage.aife
    public aijf prepareType(ailw ailwVar) {
        aijf aijfVarFlexibleType;
        ailwVar.getClass();
        if (!(ailwVar instanceof aigl)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        aijf aijfVarUnwrap = ((aigl) ailwVar).unwrap();
        if (aijfVarUnwrap instanceof aigw) {
            aijfVarFlexibleType = transformToNewType((aigw) aijfVarUnwrap);
        } else {
            if (!(aijfVarUnwrap instanceof aiga)) {
                throw new aezs();
            }
            aiga aigaVar = (aiga) aijfVarUnwrap;
            aigw aigwVarTransformToNewType = transformToNewType(aigaVar.getLowerBound());
            aigw aigwVarTransformToNewType2 = transformToNewType(aigaVar.getUpperBound());
            aijfVarFlexibleType = (aigwVarTransformToNewType == aigaVar.getLowerBound() && aigwVarTransformToNewType2 == aigaVar.getUpperBound()) ? aijfVarUnwrap : aigq.flexibleType(aigwVarTransformToNewType, aigwVarTransformToNewType2);
        }
        return aije.inheritEnhancement(aijfVarFlexibleType, aijfVarUnwrap, new aijr(this));
    }
}
