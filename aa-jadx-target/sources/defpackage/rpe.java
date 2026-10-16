package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rpe {
    public final defpackage.qzd a;
    public defpackage.rpd b;
    public final android.util.SparseArray c = new android.util.SparseArray();
    public final android.os.Handler d;

    public rpe(defpackage.qzd qzdVar, android.os.Looper looper) {
        this.a = qzdVar;
        this.d = new defpackage.rpc(this, looper);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public final defpackage.qsz a(int i) throws defpackage.qst, rlo {
        try {
            com.google.android.gms.car.CarSensorEvent carSensorEventH = this.a.h(i);
            if (carSensorEventH == null) {
                return null;
            }
            return new defpackage.qsz(carSensorEventH.b, carSensorEventH.c, carSensorEventH.d, carSensorEventH.e);
        } catch (android.os.RemoteException e) {
            defpackage.oml.I(e);
            return null;
        } catch (java.lang.IllegalStateException e2) {
            defpackage.oml.G(e2);
            return null;
        }
    }

    public final void b(defpackage.qsy qsyVar) {
        android.util.SparseArray sparseArray = this.c;
        synchronized (sparseArray) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                if (c(qsyVar, iKeyAt)) {
                    arrayList.add(java.lang.Integer.valueOf(iKeyAt));
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sparseArray.remove(((java.lang.Integer) it.next()).intValue());
            }
        }
    }

    public final boolean c(defpackage.qsy qsyVar, int i) {
        defpackage.skb skbVar = (defpackage.skb) this.c.get(i);
        if (skbVar == null) {
            return false;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) skbVar.b;
        if (linkedList.contains(qsyVar)) {
            linkedList.remove(qsyVar);
        }
        if (!linkedList.isEmpty()) {
            return false;
        }
        try {
            this.a.fl(i, this.b);
            return true;
        } catch (android.os.RemoteException unused) {
            return true;
        }
    }

    public final boolean d(int i) throws defpackage.qst {
        int[] iArrT;
        try {
            iArrT = this.a.t();
        } catch (android.os.RemoteException unused) {
            iArrT = new int[0];
        } catch (java.lang.IllegalStateException e) {
            defpackage.oml.G(e);
            iArrT = new int[0];
        }
        for (int i2 : iArrT) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public final int[] e() throws defpackage.qst {
        int[] iArrS;
        try {
            iArrS = this.a.s();
        } catch (android.os.RemoteException unused) {
            iArrS = null;
        } catch (java.lang.IllegalStateException e) {
            defpackage.oml.G(e);
            iArrS = null;
        }
        if (iArrS == null || iArrS.length <= 0 || iArrS[0] != 0) {
            return iArrS;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        if (r5.a.o(r7, r8, r5.b) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.qsy r6, int r7, int r8) throws defpackage.qst {
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
            rpd r2 = r5.b     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L1f
            rpd r2 = new rpd     // Catch: java.lang.Throwable -> L68
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L68
            r5.b = r2     // Catch: java.lang.Throwable -> L68
        L1f:
            java.lang.Object r2 = r1.get(r7)     // Catch: java.lang.Throwable -> L68
            skb r2 = (defpackage.skb) r2     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L30
            skb r2 = new skb     // Catch: java.lang.Throwable -> L68
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
            qzd r6 = r5.a     // Catch: android.os.RemoteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L68
            rpd r5 = r5.b     // Catch: android.os.RemoteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L68
            boolean r5 = r6.o(r7, r8, r5)     // Catch: android.os.RemoteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L68
            if (r5 != 0) goto L66
        L60:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
            goto L67
        L62:
            r5 = move-exception
            defpackage.oml.G(r5)     // Catch: java.lang.Throwable -> L68
        L66:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
        L67:
            return
        L68:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpe.f(qsy, int, int):void");
    }
}
