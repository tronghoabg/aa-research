package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eho implements defpackage.egw {
    private final ajey b = new ajey();
    private final defpackage.ldx c = new defpackage.ldx((char[]) null, (byte[]) null);
    private final aizj a = new aiza(new defpackage.axu((defpackage.afdk) null, 2, (char[]) null));

    @Override // defpackage.egw
    public final java.lang.Object a(defpackage.afdk afdkVar) {
        return new java.lang.Integer(this.c.w());
    }

    @Override // defpackage.egw
    public final java.lang.Object b(defpackage.afdk afdkVar) {
        return new java.lang.Integer(((java.util.concurrent.atomic.AtomicInteger) this.c.a).incrementAndGet());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [affc] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // defpackage.egw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.affc r7, defpackage.afdk r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ehm
            if (r0 == 0) goto L13
            r0 = r8
            ehm r0 = (defpackage.ehm) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ehm r0 = new ehm
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            afdr r1 = defpackage.afdr.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            int r6 = r0.c
            int r6 = r0.b
            ajey r6 = r0.g
            java.lang.Object r7 = r0.a
            defpackage.afga.cz(r8)     // Catch: java.lang.Throwable -> L33
            goto L6c
        L33:
            r7 = move-exception
            goto L70
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            int r6 = r0.b
            ajey r6 = r0.g
            java.lang.Object r7 = r0.a
            defpackage.afga.cz(r8)
            goto L5a
        L47:
            defpackage.afga.cz(r8)
            ajey r6 = r6.b
            r0.a = r7
            r0.g = r6
            r0.b = r5
            r0.f = r4
            java.lang.Object r8 = r6.b(r0)
            if (r8 == r1) goto L74
        L5a:
            r8 = 0
            r0.a = r8     // Catch: java.lang.Throwable -> L33
            r0.g = r6     // Catch: java.lang.Throwable -> L33
            r0.b = r5     // Catch: java.lang.Throwable -> L33
            r0.c = r5     // Catch: java.lang.Throwable -> L33
            r0.f = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L33
            if (r8 != r1) goto L6c
            goto L74
        L6c:
            r6.d()
            return r8
        L70:
            r6.d()
            throw r7
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eho.c(affc, afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.egw
    public final java.lang.Object d(defpackage.affg affgVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        ehn ehnVar;
        ajey ajeyVar;
        boolean z;
        java.lang.Throwable th;
        if (afdkVar instanceof ehn) {
            ehnVar = (ehn) afdkVar;
            int i = ehnVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ehnVar.h = i - Integer.MIN_VALUE;
            } else {
                ehnVar = new ehn(this, afdkVar);
            }
        } else {
            ehnVar = new ehn(this, afdkVar);
        }
        java.lang.Object obj = ehnVar.f;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = ehnVar.h;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = ehnVar.c;
            boolean z2 = ehnVar.e;
            z = ehnVar.d;
            int i4 = ehnVar.b;
            ajeyVar = ehnVar.i;
            java.lang.Object obj2 = ehnVar.a;
            try {
                defpackage.afga.cz(obj);
                if (z) {
                    ajeyVar.d();
                }
                return obj;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (z) {
                    ajeyVar.d();
                }
                throw th;
            }
        }
        defpackage.afga.cz(obj);
        ajey ajeyVar2 = this.b;
        boolean zC = ajeyVar2.c();
        try {
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zC);
            ehnVar.a = null;
            ehnVar.i = ajeyVar2;
            ehnVar.b = 0;
            ehnVar.d = zC;
            ehnVar.e = zC;
            ehnVar.c = 0;
            ehnVar.h = 1;
            java.lang.Object objInvoke = affgVar.invoke(boolValueOf, ehnVar);
            if (objInvoke == afdrVar) {
                return afdrVar;
            }
            ajeyVar = ajeyVar2;
            z = zC;
            obj = objInvoke;
            if (z) {
                ajeyVar.d();
            }
            return obj;
        } catch (java.lang.Throwable th3) {
            ajeyVar = ajeyVar2;
            z = zC;
            th = th3;
            if (z) {
                ajeyVar.d();
            }
            throw th;
        }
    }

    @Override // defpackage.egw
    public final aizj e() {
        return this.a;
    }
}
