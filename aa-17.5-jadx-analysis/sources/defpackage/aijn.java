package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aijn {
    public static afdb a(List list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return new aiwb(i, list);
    }

    public static boolean b(StackTraceElement stackTraceElement) {
        return afyh.g(stackTraceElement.getMethodName(), "runBlocking", false) && afyh.g(stackTraceElement.getClassName(), "kotlinx.coroutines.BuildersKt", false);
    }

    public static final aijf intersectTypes(Collection<? extends aijf> collection) {
        aigw lowerBound;
        collection.getClass();
        int size = collection.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (aijf) woy.bM(collection);
        }
        ArrayList arrayList = new ArrayList(woy.bp(collection, 10));
        boolean z = false;
        boolean z2 = false;
        for (aijf aijfVar : collection) {
            z = z || aigr.isError(aijfVar);
            if (aijfVar instanceof aigw) {
                lowerBound = (aigw) aijfVar;
            } else {
                if (!(aijfVar instanceof aiga)) {
                    throw new aezs();
                }
                if (aifw.isDynamic(aijfVar)) {
                    return aijfVar;
                }
                lowerBound = ((aiga) aijfVar).getLowerBound();
                z2 = true;
            }
            arrayList.add(lowerBound);
        }
        if (z) {
            return ailm.createErrorType(aill.INTERSECTION_OF_ERROR_TYPES, collection.toString());
        }
        if (!z2) {
            return aikw.INSTANCE.intersectTypes$org_jetbrains_kotlin_descriptors(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(woy.bp(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(aige.upperIfFlexible((aijf) it.next()));
        }
        return aigq.flexibleType(aikw.INSTANCE.intersectTypes$org_jetbrains_kotlin_descriptors(arrayList), aikw.INSTANCE.intersectTypes$org_jetbrains_kotlin_descriptors(arrayList2));
    }
}
