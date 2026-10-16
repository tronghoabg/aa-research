package s;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3986f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C3983c f44821a;

    /* renamed from: b, reason: collision with root package name */
    public C3983c f44822b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f44823c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f44824d = 0;

    public C3983c a(Object obj) {
        C3983c c3983c = this.f44821a;
        while (c3983c != null && !c3983c.f44814a.equals(obj)) {
            c3983c = c3983c.f44816c;
        }
        return c3983c;
    }

    public Object b(Object obj) {
        C3983c c3983cA = a(obj);
        if (c3983cA == null) {
            return null;
        }
        this.f44824d--;
        WeakHashMap weakHashMap = this.f44823c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC3985e) it.next()).a(c3983cA);
            }
        }
        C3983c c3983c = c3983cA.f44817d;
        if (c3983c != null) {
            c3983c.f44816c = c3983cA.f44816c;
        } else {
            this.f44821a = c3983cA.f44816c;
        }
        C3983c c3983c2 = c3983cA.f44816c;
        if (c3983c2 != null) {
            c3983c2.f44817d = c3983c;
        } else {
            this.f44822b = c3983c;
        }
        c3983cA.f44816c = null;
        c3983cA.f44817d = null;
        return c3983cA.f44815b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((s.C3982b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof s.C3986f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s.f r7 = (s.C3986f) r7
            int r1 = r6.f44824d
            int r3 = r7.f44824d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            s.b r3 = (s.C3982b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            s.b r4 = (s.C3982b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            s.b r7 = (s.C3982b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C3986f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C3982b c3982b = (C3982b) it;
            if (!c3982b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c3982b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C3982b c3982b = new C3982b(this.f44821a, this.f44822b, 0);
        this.f44823c.put(c3982b, Boolean.FALSE);
        return c3982b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C3982b c3982b = (C3982b) it;
            if (!c3982b.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) c3982b.next()).toString());
            if (c3982b.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
