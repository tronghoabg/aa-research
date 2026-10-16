package h.g.b;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f48125a = new Object[0];

    public static final Object[] a(Collection collection) {
        x.f(collection, "collection");
        int size = collection.size();
        if (size == 0) {
            return f48125a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return f48125a;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            objArrCopyOf[i2] = it.next();
            i2++;
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                x.e(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                x.e(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object[] b(java.util.Collection r5, java.lang.Object[] r6) throws java.lang.NegativeArraySizeException {
        /*
            java.lang.String r0 = "collection"
            h.g.b.x.f(r5, r0)
            r6.getClass()
            int r0 = r5.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L14
            int r5 = r6.length
            if (r5 <= 0) goto L23
            goto L21
        L14:
            java.util.Iterator r5 = r5.iterator()
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L24
            int r5 = r6.length
            if (r5 <= 0) goto L23
        L21:
            r6[r2] = r1
        L23:
            return r6
        L24:
            int r3 = r6.length
            if (r0 > r3) goto L29
            r0 = r6
            goto L3c
        L29:
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            h.g.b.x.d(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L3c:
            java.lang.Object r3 = r5.next()
            r0[r2] = r3
            int r2 = r2 + 1
            int r3 = r0.length
            java.lang.String r4 = "copyOf(...)"
            if (r2 < r3) goto L6c
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L50
            return r0
        L50:
            int r3 = r2 * 3
            int r3 = r3 + 1
            int r3 = r3 >>> 1
            if (r3 > r2) goto L64
            r3 = 2147483645(0x7ffffffd, float:NaN)
            if (r2 >= r3) goto L5e
            goto L64
        L5e:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
        L64:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            h.g.b.x.e(r0, r4)
            goto L3c
        L6c:
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L3c
            if (r0 != r6) goto L77
            r6[r2] = r1
            return r6
        L77:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r2)
            h.g.b.x.e(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g.b.n.b(java.util.Collection, java.lang.Object[]):java.lang.Object[]");
    }
}
