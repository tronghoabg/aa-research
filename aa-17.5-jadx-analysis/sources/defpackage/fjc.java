package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fjc {
    public static final fjc a = dsr.o(new LinkedHashMap());
    public final Map b;

    public fjc(fjc fjcVar) {
        fjcVar.getClass();
        this.b = new HashMap(fjcVar.b);
    }

    public final boolean a(String str, Class cls) {
        Object obj = this.b.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L68
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            boolean r2 = defpackage.affa.f(r2, r3)
            if (r2 != 0) goto L16
            goto L68
        L16:
            fjc r8 = (defpackage.fjc) r8
            java.util.Map r7 = r7.b
            java.util.Map r8 = r8.b
            java.util.Set r2 = r7.keySet()
            java.util.Set r3 = r8.keySet()
            boolean r3 = defpackage.affa.f(r2, r3)
            if (r3 != 0) goto L2b
            return r1
        L2b:
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.get(r3)
            java.lang.Object r3 = r8.get(r3)
            if (r4 == 0) goto L5f
            if (r3 != 0) goto L48
            goto L5f
        L48:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L5a
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L5a
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = defpackage.woy.cC(r5, r3)
            goto L64
        L5a:
            boolean r3 = defpackage.affa.f(r4, r3)
            goto L64
        L5f:
            if (r4 != r3) goto L63
            r3 = r0
            goto L64
        L63:
            r3 = r1
        L64:
            if (r3 != 0) goto L2f
            return r1
        L67:
            return r0
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return "Data {" + woy.cu(this.b.entrySet(), null, null, null, new ewc(10), 31) + "}";
    }

    public fjc(Map map) {
        this.b = new HashMap(map);
    }
}
