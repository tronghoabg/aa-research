package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.car.CarSensorEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class roj {
    public final qyh a;
    public roi b;
    public final SparseArray c = new SparseArray();
    public final Handler d;

    public roj(qyh qyhVar, Looper looper) {
        this.a = qyhVar;
        this.d = new roh(this, looper);
    }

    public final qsf a(int i) throws qrz {
        try {
            CarSensorEvent carSensorEventH = this.a.h(i);
            if (carSensorEventH == null) {
                return null;
            }
            return new qsf(carSensorEventH.b, carSensorEventH.c, carSensorEventH.d, carSensorEventH.e);
        } catch (RemoteException e) {
            olm.h(e);
            return null;
        } catch (IllegalStateException e2) {
            olm.f(e2);
            return null;
        }
    }

    public final void b(qse qseVar) {
        SparseArray sparseArray = this.c;
        synchronized (sparseArray) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                if (c(qseVar, iKeyAt)) {
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sparseArray.remove(((Integer) it.next()).intValue());
            }
        }
    }

    public final boolean c(qse qseVar, int i) {
        sjg sjgVar = (sjg) this.c.get(i);
        if (sjgVar == null) {
            return false;
        }
        LinkedList linkedList = (LinkedList) sjgVar.b;
        if (linkedList.contains(qseVar)) {
            linkedList.remove(qseVar);
        }
        if (!linkedList.isEmpty()) {
            return false;
        }
        try {
            this.a.gd(i, this.b);
            return true;
        } catch (RemoteException unused) {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(int r5) throws defpackage.qrz {
        /*
            r4 = this;
            r0 = 0
            qyh r4 = r4.a     // Catch: java.lang.IllegalStateException -> L8 android.os.RemoteException -> Lc
            int[] r4 = r4.t()     // Catch: java.lang.IllegalStateException -> L8 android.os.RemoteException -> Lc
            goto Le
        L8:
            r4 = move-exception
            defpackage.olm.f(r4)
        Lc:
            int[] r4 = new int[r0]
        Le:
            int r1 = r4.length
            r2 = r0
        L10:
            if (r2 >= r1) goto L1b
            r3 = r4[r2]
            if (r5 != r3) goto L18
            r4 = 1
            return r4
        L18:
            int r2 = r2 + 1
            goto L10
        L1b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.roj.d(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] e() throws defpackage.qrz {
        /*
            r2 = this;
            r0 = 0
            qyh r2 = r2.a     // Catch: java.lang.IllegalStateException -> L8 android.os.RemoteException -> Lc
            int[] r2 = r2.s()     // Catch: java.lang.IllegalStateException -> L8 android.os.RemoteException -> Lc
            goto Ld
        L8:
            r2 = move-exception
            defpackage.olm.f(r2)
        Lc:
            r2 = r0
        Ld:
            if (r2 == 0) goto L18
            int r1 = r2.length
            if (r1 <= 0) goto L18
            r1 = 0
            r1 = r2[r1]
            if (r1 != 0) goto L18
            return r0
        L18:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.roj.e():int[]");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:45|12|(1:14)|15|(1:17)(1:18)|19|(1:21)|22|(1:30)(3:(0)|39|40)|46|33) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        if (r5.a.o(r7, r8, r5.b) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
    
        defpackage.olm.f(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.qse r6, int r7, int r8) throws defpackage.qrz {
        /*
            r5 = this;
            r0 = 1
            if (r8 == 0) goto L11
            r1 = 3
            if (r8 == r1) goto L11
            if (r8 != r0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Illegal sensor rate 2"
            r5.<init>(r6)
            throw r5
        L11:
            android.util.SparseArray r1 = r5.c
            monitor-enter(r1)
            roi r2 = r5.b     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L1f
            roi r2 = new roi     // Catch: java.lang.Throwable -> L68
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L68
            r5.b = r2     // Catch: java.lang.Throwable -> L68
        L1f:
            java.lang.Object r2 = r1.get(r7)     // Catch: java.lang.Throwable -> L68
            sjg r2 = (defpackage.sjg) r2     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L30
            sjg r2 = new sjg     // Catch: java.lang.Throwable -> L68
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L68
            r1.put(r7, r2)     // Catch: java.lang.Throwable -> L68
            goto L31
        L30:
            r0 = 0
        L31:
            java.lang.Object r3 = r2.b     // Catch: java.lang.Throwable -> L68
            r4 = r3
            java.util.LinkedList r4 = (java.util.LinkedList) r4     // Catch: java.lang.Throwable -> L68
            boolean r4 = r4.contains(r6)     // Catch: java.lang.Throwable -> L68
            if (r4 != 0) goto L41
            java.util.LinkedList r3 = (java.util.LinkedList) r3     // Catch: java.lang.Throwable -> L68
            r3.add(r6)     // Catch: java.lang.Throwable -> L68
        L41:
            int r6 = r2.a     // Catch: java.lang.Throwable -> L68
            if (r6 != r8) goto L46
            goto L54
        L46:
            if (r6 == 0) goto L54
            if (r8 != 0) goto L4b
            goto L51
        L4b:
            int r6 = java.lang.Integer.compare(r6, r8)     // Catch: java.lang.Throwable -> L68
            if (r6 >= 0) goto L54
        L51:
            r2.a = r8     // Catch: java.lang.Throwable -> L68
            goto L56
        L54:
            if (r0 == 0) goto L66
        L56:
            qyh r6 = r5.a     // Catch: android.os.RemoteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L68
            roi r5 = r5.b     // Catch: android.os.RemoteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L68
            boolean r5 = r6.o(r7, r8, r5)     // Catch: android.os.RemoteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L68
            if (r5 != 0) goto L66
        L60:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
            goto L67
        L62:
            r5 = move-exception
            defpackage.olm.f(r5)     // Catch: java.lang.Throwable -> L68
        L66:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
        L67:
            return
        L68:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.roj.f(qse, int, int):void");
    }
}
