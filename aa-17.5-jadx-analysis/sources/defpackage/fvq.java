package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class fvq {
    public static final fvq a = new fvq();

    public static final boolean a(fvv fvvVar) {
        return (fvvVar.e == null || fzo.h(fvvVar.g)) ? false : true;
    }

    public static final boolean b(fvv fvvVar) {
        return fzo.h(fvvVar.g) && fvvVar.e != null;
    }

    public static final boolean c(List list, int i) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (f((fvu) it.next())) {
                    return false;
                }
            }
        }
        return i == -1;
    }

    public static final int d(List list) {
        if (list.isEmpty()) {
            return 1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fvu fvuVar = (fvu) it.next();
            fvv fvvVar = fvuVar.a;
            if (fvvVar != null && fvvVar.b()) {
                return 2;
            }
            fwb fwbVar = fvuVar.b;
            if (fwbVar != null && fwbVar.g()) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int e(java.util.List r6, boolean r7) {
        /*
            r0 = -1
            if (r7 == 0) goto L99
            int r7 = r6.size()
            r1 = 2
            if (r7 == r1) goto Lc
            goto L99
        Lc:
            r7 = 0
            java.lang.Object r1 = r6.get(r7)
            fvu r1 = (defpackage.fvu) r1
            r2 = 1
            java.lang.Object r3 = r6.get(r2)
            fvu r3 = (defpackage.fvu) r3
            boolean r4 = f(r1)
            if (r4 == 0) goto L27
            boolean r4 = f(r3)
            if (r4 != 0) goto L27
            return r7
        L27:
            boolean r4 = f(r3)
            if (r4 == 0) goto L34
            boolean r4 = f(r1)
            if (r4 != 0) goto L34
            return r2
        L34:
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L3b
            goto L6e
        L3b:
            java.util.Iterator r6 = r6.iterator()
        L3f:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r6.next()
            fvu r4 = (defpackage.fvu) r4
            fvv r5 = r4.a
            if (r5 == 0) goto L54
            boolean r4 = a(r5)
            goto L6b
        L54:
            fwb r4 = r4.b
            if (r4 == 0) goto L6a
            gag r5 = r4.b()
            if (r5 == 0) goto L6a
            gcs r4 = r4.c()
            boolean r4 = defpackage.fzo.h(r4)
            if (r4 != 0) goto L6a
            r4 = r2
            goto L6b
        L6a:
            r4 = r7
        L6b:
            if (r4 != 0) goto L3f
            goto L99
        L6e:
            boolean r6 = r1.c()
            if (r6 != 0) goto L7d
            boolean r6 = r1.a()
            if (r6 == 0) goto L7b
            goto L7d
        L7b:
            r6 = r7
            goto L7e
        L7d:
            r6 = r2
        L7e:
            boolean r1 = r3.c()
            if (r1 != 0) goto L8d
            boolean r1 = r3.a()
            if (r1 == 0) goto L8b
            goto L8d
        L8b:
            r1 = r7
            goto L8e
        L8d:
            r1 = r2
        L8e:
            if (r6 == 0) goto L94
            if (r1 == 0) goto L93
            goto L94
        L93:
            return r2
        L94:
            if (r1 == 0) goto L99
            if (r6 != 0) goto L99
            return r7
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvq.e(java.util.List, boolean):int");
    }

    private static final boolean f(fvu fvuVar) {
        fvv fvvVar = fvuVar.a;
        if (fvvVar != null) {
            return b(fvvVar);
        }
        fwb fwbVar = fvuVar.b;
        return (fwbVar == null || !fzo.h(fwbVar.c()) || fwbVar.b() == null) ? false : true;
    }
}
