package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class eia {
    public final erb a;
    private final Map b;

    public eia(Map map, boolean z) {
        this.b = map;
        this.a = new erb(z);
    }

    public final Object a(ehz ehzVar) {
        Object obj = this.b.get(ehzVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return bArrCopyOf;
    }

    public final Map b() {
        aezu aezuVar;
        Set<Map.Entry> setEntrySet = this.b.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf.getClass();
                aezuVar = new aezu(key, bArrCopyOf);
            } else {
                aezuVar = new aezu(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(aezuVar.a, aezuVar.b);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void c() {
        if (((AtomicBoolean) this.a.a).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void d(ehz ehzVar, Object obj) {
        c();
        if (obj == null) {
            c();
            this.b.remove(ehzVar);
            return;
        }
        if (obj instanceof Set) {
            Map map = this.b;
            Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(woy.cl((Set) obj));
            setUnmodifiableSet.getClass();
            map.put(ehzVar, setUnmodifiableSet);
            return;
        }
        boolean z = obj instanceof byte[];
        Map map2 = this.b;
        if (!z) {
            map2.put(ehzVar, obj);
            return;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        map2.put(ehzVar, bArrCopyOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.eia
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            eia r6 = (defpackage.eia) r6
            java.util.Map r6 = r6.b
            java.util.Map r5 = r5.b
            r0 = 1
            if (r6 != r5) goto L10
            return r0
        L10:
            int r2 = r6.size()
            int r3 = r5.size()
            if (r2 == r3) goto L1b
            return r1
        L1b:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L22
            return r0
        L22:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r5.get(r3)
            if (r3 == 0) goto L5d
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L58
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L5d
            byte[] r2 = (byte[]) r2
            byte[] r3 = (byte[]) r3
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L5d
            r2 = r0
            goto L5e
        L58:
            boolean r2 = defpackage.affa.f(r2, r3)
            goto L5e
        L5d:
            r2 = r1
        L5e:
            if (r2 != 0) goto L2a
            return r1
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eia.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = this.b.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return woy.cu(this.b.entrySet(), ",\n", "{\n", "\n}", new dmw(8), 24);
    }

    public eia() {
        throw null;
    }

    public /* synthetic */ eia(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
