package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ahuu {
    private ahuu() {
    }

    private final aigw findCommonSuperTypeOrIntersectionType(Collection<? extends aigw> collection, ahut ahutVar) {
        if (collection.isEmpty()) {
            return null;
        }
        Iterator<T> it = collection.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            aigw aigwVar = (aigw) it.next();
            next = ahuv.Companion.fold((aigw) next, aigwVar, ahutVar);
        }
        return (aigw) next;
    }

    private final aigw fold(ahuv ahuvVar, ahuv ahuvVar2, ahut ahutVar) {
        Set setCj;
        ahut ahutVar2 = ahut.COMMON_SUPER_TYPE;
        int iOrdinal = ahutVar.ordinal();
        if (iOrdinal == 0) {
            setCj = woy.cj(ahuvVar.getPossibleTypes(), ahuvVar2.getPossibleTypes());
        } else {
            if (iOrdinal != 1) {
                throw new aezs();
            }
            Set<aigl> possibleTypes = ahuvVar.getPossibleTypes();
            Set<aigl> possibleTypes2 = ahuvVar2.getPossibleTypes();
            possibleTypes.getClass();
            possibleTypes2.getClass();
            setCj = woy.ck(possibleTypes);
            woy.cq(setCj, possibleTypes2);
        }
        return aigq.integerLiteralType(aihr.Companion.getEmpty(), new ahuv(ahuvVar.value, ahuvVar.module, setCj, null), false);
    }

    public final aigw findIntersectionType(Collection<? extends aigw> collection) {
        collection.getClass();
        return findCommonSuperTypeOrIntersectionType(collection, ahut.INTERSECTION_TYPE);
    }

    public /* synthetic */ ahuu(afeu afeuVar) {
        this();
    }

    private final aigw fold(ahuv ahuvVar, aigw aigwVar) {
        if (ahuvVar.getPossibleTypes().contains(aigwVar)) {
            return aigwVar;
        }
        return null;
    }

    private final aigw fold(aigw aigwVar, aigw aigwVar2, ahut ahutVar) {
        if (aigwVar == null || aigwVar2 == null) {
            return null;
        }
        aiid constructor = aigwVar.getConstructor();
        boolean z = constructor instanceof ahuv;
        aiid constructor2 = aigwVar2.getConstructor();
        if (z && (constructor2 instanceof ahuv)) {
            return fold((ahuv) constructor, (ahuv) constructor2, ahutVar);
        }
        if (z) {
            return fold((ahuv) constructor, aigwVar2);
        }
        if (constructor2 instanceof ahuv) {
            return fold((ahuv) constructor2, aigwVar);
        }
        return null;
    }
}
