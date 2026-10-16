package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class aiow {
    public static final long a(long j) {
        long j2 = aisq.a;
        if (j > 0) {
            return aisq.e(aisq.h(j, afzc.d(999999L, aiss.a)));
        }
        return 0L;
    }

    public static final <T> void addIfNotNull(Collection<T> collection, T t) {
        collection.getClass();
        if (t != null) {
            collection.add(t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.afck r4) throws java.lang.Throwable {
        /*
            boolean r0 = r4 instanceof defpackage.aiug
            if (r0 == 0) goto L13
            r0 = r4
            aiug r0 = (defpackage.aiug) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aiug r0 = new aiug
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            defpackage.woy.dF(r4)
            goto L47
        L2f:
            defpackage.woy.dF(r4)
            r0.b = r3
            aitg r4 = new aitg
            afck r0 = defpackage.affa.s(r0)
            r4.<init>(r0, r3)
            r4.z()
            java.lang.Object r4 = r4.k()
            if (r4 != r1) goto L47
            return r1
        L47:
            aezp r4 = new aezp
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiow.b(afck):java.lang.Object");
    }

    public static final Object c(long j, afck afckVar) {
        if (j > 0) {
            aitg aitgVar = new aitg(affa.s(afckVar), 1);
            aitgVar.z();
            if (j < Long.MAX_VALUE) {
                e(aitgVar.b).c(j, aitgVar);
            }
            Object objK = aitgVar.k();
            afcr afcrVar = afcr.a;
            if (objK == afcrVar) {
                afckVar.getClass();
            }
            if (objK == afcrVar) {
                return objK;
            }
        }
        return afak.a;
    }

    private static final int capacity(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    public static final <T> List<T> compact(ArrayList<T> arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        if (size == 0) {
            return afbe.a;
        }
        if (size == 1) {
            return woy.bg(woy.bF(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final Object d(long j, afck afckVar) {
        return c(a(j), afckVar);
    }

    public static final aiuf e(afco afcoVar) {
        afcm afcmVar = afcoVar.get(afcl.k);
        aiuf aiufVar = afcmVar instanceof aiuf ? (aiuf) afcmVar : null;
        return aiufVar == null ? aiuc.a : aiufVar;
    }

    public static final <K> Map<K, Integer> mapToIndex(Iterable<? extends K> iterable) {
        iterable.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i) {
        return new HashMap<>(capacity(i));
    }

    public static final <E> HashSet<E> newHashSetWithExpectedSize(int i) {
        return new HashSet<>(capacity(i));
    }

    public static final <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i) {
        return new LinkedHashSet<>(capacity(i));
    }
}
