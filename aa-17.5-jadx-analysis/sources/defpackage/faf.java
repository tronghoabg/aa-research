package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class faf implements fai, eyx {
    public final fca a;
    private final afeg b;
    private final AtomicInteger c;
    private ezk d;

    public faf(afeg afegVar, fca fcaVar) {
        fcaVar.getClass();
        this.b = afegVar;
        this.a = fcaVar;
        this.c = new AtomicInteger(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.eyx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.afec r7, defpackage.afck r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.fac
            if (r0 == 0) goto L13
            r0 = r8
            fac r0 = (defpackage.fac) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fac r0 = new fac
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.woy.dF(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r7 = r0.a
            java.lang.String r6 = r0.e
            defpackage.woy.dF(r8)
            goto L49
        L3a:
            defpackage.woy.dF(r8)
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r5.e()
            if (r8 == r1) goto L7c
        L49:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 == 0) goto L67
            afeg r8 = r5.b
            fad r4 = new fad
            r4.<init>(r5, r6, r7, r2)
            r0.e = r2
            r0.a = r2
            r0.d = r3
            java.lang.Object r5 = r8.invoke(r4, r0)
            if (r5 != r1) goto L66
            goto L7c
        L66:
            return r5
        L67:
            fca r5 = r5.a
            fbk r5 = r5.a(r6)
            java.lang.Object r6 = r7.invoke(r5)     // Catch: java.lang.Throwable -> L75
            defpackage.affa.m(r5, r2)
            return r6
        L75:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L77
        L77:
            r7 = move-exception
            defpackage.affa.m(r5, r6)
            throw r7
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.faf.a(java.lang.String, afec, afck):java.lang.Object");
    }

    @Override // defpackage.fai
    public final fca b() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ezk r7, defpackage.afeg r8, defpackage.afck r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.fab
            if (r0 == 0) goto L13
            r0 = r9
            fab r0 = (defpackage.fab) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fab r0 = new fab
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            java.lang.String r3 = "ROLLBACK TRANSACTION"
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            int r5 = r0.a
            defpackage.woy.dF(r9)     // Catch: java.lang.Throwable -> L2c
            goto L7a
        L2c:
            r7 = move-exception
            goto L93
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.woy.dF(r9)
            int r9 = r7.ordinal()
            if (r9 == 0) goto L5a
            if (r9 == r5) goto L52
            r2 = 2
            if (r9 != r2) goto L4c
            fca r9 = r6.a
            java.lang.String r2 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.dan.j(r9, r2)
            goto L61
        L4c:
            aezs r6 = new aezs
            r6.<init>()
            throw r6
        L52:
            fca r9 = r6.a
            java.lang.String r2 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.dan.j(r9, r2)
            goto L61
        L5a:
            fca r9 = r6.a
            java.lang.String r2 = "BEGIN DEFERRED TRANSACTION"
            defpackage.dan.j(r9, r2)
        L61:
            java.util.concurrent.atomic.AtomicInteger r9 = r6.c
            int r9 = r9.incrementAndGet()
            if (r9 <= 0) goto L6b
            r6.d = r7
        L6b:
            faa r7 = new faa     // Catch: java.lang.Throwable -> L2c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L2c
            r0.a = r5     // Catch: java.lang.Throwable -> L2c
            r0.d = r5     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L2c
            if (r9 == r1) goto L92
        L7a:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.c
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L84
            r6.d = r4
        L84:
            fca r6 = r6.a
            if (r5 == 0) goto L8e
            java.lang.String r7 = "END TRANSACTION"
            defpackage.dan.j(r6, r7)
            return r9
        L8e:
            defpackage.dan.j(r6, r3)
            return r9
        L92:
            return r1
        L93:
            boolean r8 = r7 instanceof defpackage.ezw     // Catch: java.lang.Throwable -> L9d
            if (r8 == 0) goto L9a
            ezw r7 = (defpackage.ezw) r7     // Catch: java.lang.Throwable -> L9d
            throw r4     // Catch: java.lang.Throwable -> L9d
        L9a:
            throw r7     // Catch: java.lang.Throwable -> L9b
        L9b:
            r8 = move-exception
            goto La0
        L9d:
            r7 = move-exception
            r8 = r7
            r7 = r4
        La0:
            java.util.concurrent.atomic.AtomicInteger r9 = r6.c     // Catch: android.database.SQLException -> Lb0
            int r9 = r9.decrementAndGet()     // Catch: android.database.SQLException -> Lb0
            if (r9 != 0) goto Laa
            r6.d = r4     // Catch: android.database.SQLException -> Lb0
        Laa:
            fca r6 = r6.a     // Catch: android.database.SQLException -> Lb0
            defpackage.dan.j(r6, r3)     // Catch: android.database.SQLException -> Lb0
            goto Lb6
        Lb0:
            r6 = move-exception
            if (r7 == 0) goto Lb7
            defpackage.adqs.y(r7, r6)
        Lb6:
            throw r8
        Lb7:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.faf.c(ezk, afeg, afck):java.lang.Object");
    }

    public final Object d(ezk ezkVar, afeg afegVar, afck afckVar) {
        return this.b.invoke(new fae(this, ezkVar, afegVar, null), afckVar);
    }

    public final Object e() {
        boolean z = true;
        if (this.d == null && !this.a.a.g()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
