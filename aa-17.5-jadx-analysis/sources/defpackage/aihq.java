package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class aihq extends aioo {
    public /* synthetic */ aihq(afeu afeuVar) {
        this();
    }

    public final aihr create(List<? extends aihn<?>> list) {
        list.getClass();
        return list.isEmpty() ? getEmpty() : new aihr(list, null);
    }

    @Override // defpackage.aioo
    public int customComputeIfAbsent(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, afec<? super String, Integer> afecVar) {
        int iIntValue;
        concurrentHashMap.getClass();
        str.getClass();
        afecVar.getClass();
        Integer num = concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            Integer num2 = concurrentHashMap.get(str);
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                Integer numInvoke = afecVar.invoke(str);
                concurrentHashMap.putIfAbsent(str, Integer.valueOf(numInvoke.intValue()));
                iIntValue = numInvoke.intValue();
            }
        }
        return iIntValue;
    }

    public final aihr getEmpty() {
        return aihr.Empty;
    }

    private aihq() {
    }
}
