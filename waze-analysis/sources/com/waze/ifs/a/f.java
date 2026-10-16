package com.waze.ifs.a;

import android.os.Handler;
import android.util.SparseArray;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray f24461a = new SparseArray();

    private final void e(int i2, Handler handler, d dVar) {
        SparseArray sparseArray = this.f24461a;
        SparseArray sparseArray2 = (SparseArray) sparseArray.get(i2);
        if (sparseArray2 == null) {
            sparseArray2 = new SparseArray(2);
            sparseArray.put(i2, sparseArray2);
        }
        sparseArray2.put(handler.hashCode(), dVar);
    }

    public final void a(int i2, Handler handler) {
        e(i2, handler, new b(handler));
    }

    public final void b(int i2, Handler handler) {
        e(i2, handler, new e(handler));
    }

    public final void c(int i2, Handler handler) {
        SparseArray sparseArray = this.f24461a;
        SparseArray sparseArray2 = (SparseArray) sparseArray.get(i2);
        if (sparseArray2 == null || handler == null) {
            return;
        }
        sparseArray2.remove(handler.hashCode());
        handler.removeMessages(i2);
        if (sparseArray2.size() == 0) {
            sparseArray.remove(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r8, android.os.Bundle r9) {
        /*
            r7 = this;
            android.util.SparseArray r0 = r7.f24461a
            java.lang.Object r1 = r0.get(r8)
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            if (r1 != 0) goto Lc
            goto L8a
        Lc:
            int r2 = r1.size()
            if (r2 != 0) goto L16
            r0.remove(r8)
            return
        L16:
            int r0 = r1.size()
            r2 = 1
            r3 = 0
            r4 = r3
        L1d:
            if (r4 >= r0) goto L3e
            java.lang.Object r5 = r1.valueAt(r4)     // Catch: java.lang.Exception -> L3b
            com.waze.ifs.a.d r5 = (com.waze.ifs.a.d) r5     // Catch: java.lang.Exception -> L3b
            if (r5 == 0) goto L3a
            android.os.Handler r5 = r5.a()     // Catch: java.lang.Exception -> L3b
            if (r5 == 0) goto L3a
            android.os.Message r6 = r5.obtainMessage(r8)     // Catch: java.lang.Exception -> L3b
            r6.setData(r9)     // Catch: java.lang.Exception -> L3b
            boolean r5 = r5.sendMessage(r6)     // Catch: java.lang.Exception -> L3b
            if (r5 != 0) goto L3b
        L3a:
            r2 = r3
        L3b:
            int r4 = r4 + 1
            goto L1d
        L3e:
            if (r2 != 0) goto L8a
            java.util.ArrayList r9 = new java.util.ArrayList
            r0 = 4
            r9.<init>(r0)
            int r0 = r1.size()
            r2 = r3
        L4b:
            if (r2 >= r0) goto L69
            java.lang.Object r4 = r1.valueAt(r2)
            com.waze.ifs.a.d r4 = (com.waze.ifs.a.d) r4
            if (r4 == 0) goto L5b
            android.os.Handler r4 = r4.a()
            if (r4 != 0) goto L66
        L5b:
            int r4 = r1.keyAt(r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9.add(r4)
        L66:
            int r2 = r2 + 1
            goto L4b
        L69:
            int r0 = r9.size()
        L6d:
            if (r3 >= r0) goto L7f
            java.lang.Object r2 = r9.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.remove(r2)
            int r3 = r3 + 1
            goto L6d
        L7f:
            int r9 = r1.size()
            if (r9 != 0) goto L8a
            android.util.SparseArray r7 = r7.f24461a
            r7.remove(r8)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ifs.a.f.d(int, android.os.Bundle):void");
    }
}
