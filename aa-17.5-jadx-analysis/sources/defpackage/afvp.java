package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class afvp {
    private afvp() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final afvq create(List<agon> list, afvq afvqVar, afrx afrxVar, ClassLoader classLoader) {
        afrx afrxVarUnbindAllReceivers;
        Object[] objArr;
        list.getClass();
        afrxVar.getClass();
        classLoader.getClass();
        ArrayList<afrv> arrayList = new ArrayList(woy.bp(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            objArr = 0;
            if (!it.hasNext()) {
                break;
            }
            agon agonVar = (agon) it.next();
            afue afueVar = afrxVar instanceof afue ? (afue) afrxVar : null;
            if (afueVar == null || (afrxVarUnbindAllReceivers = afuh.unbindAllReceivers(afueVar)) == null) {
                afrxVarUnbindAllReceivers = afrxVar;
            }
            arrayList.add(new afrv(afrxVarUnbindAllReceivers, agonVar.getName(), afjz.toKVariance(agonVar.getVariance()), agmo.isReified(agonVar)));
        }
        Iterable<afbh> iterableBD = woy.bD(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(iterableBD, 10)), 16));
        for (afbh afbhVar : iterableBD) {
            aezu aezuVar = new aezu(Integer.valueOf(((agon) afbhVar.b).getId()), arrayList.get(afbhVar.a));
            linkedHashMap.put(aezuVar.a, aezuVar.b);
        }
        afvq afvqVar2 = new afvq(arrayList, linkedHashMap, afvqVar, objArr == true ? 1 : 0);
        int i = 0;
        for (afrv afrvVar : arrayList) {
            int i2 = i + 1;
            List<agol> upperBounds = list.get(i).getUpperBounds();
            List<? extends afib> arrayList2 = new ArrayList<>(woy.bp(upperBounds, 10));
            Iterator<T> it2 = upperBounds.iterator();
            while (it2.hasNext()) {
                arrayList2.add(afjz.toKType$default((agol) it2.next(), classLoader, afvqVar2, true, null, 8, null));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = woy.bg(afvm.INSTANCE.getNULLABLE_ANY());
            }
            afrvVar.setUpperBounds(arrayList2);
            i = i2;
        }
        return afvqVar2;
    }

    public /* synthetic */ afvp(afeu afeuVar) {
        this();
    }
}
