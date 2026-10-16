package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tu {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c = new defpackage.oe(this, 17);
    public java.lang.Object d;

    public final long a(long j, long j2, int i) {
        defpackage.cqc cqcVarC = c();
        if (cqcVarC != null) {
            return cqcVarC.a(j, j2, i);
        }
        return 0L;
    }

    public final long b(long j, int i) {
        defpackage.cqc cqcVarC = c();
        if (cqcVarC != null) {
            return cqcVarC.b(j, i);
        }
        return 0L;
    }

    public final defpackage.cqc c() {
        java.lang.Object obj = this.b;
        if (obj != null) {
            return ((defpackage.cqi) obj).f();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r0 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r0 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r8, long r10, defpackage.afdk r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.cqd
            if (r0 == 0) goto L13
            r0 = r12
            cqd r0 = (defpackage.cqd) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cqd r0 = new cqd
            r0.<init>(r7, r12)
        L18:
            r12 = r0
            java.lang.Object r0 = r12.a
            afdr r1 = defpackage.afdr.a
            int r2 = r12.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.afga.cz(r0)
            goto L63
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.afga.cz(r0)
            goto L50
        L37:
            defpackage.afga.cz(r0)
            cqc r0 = r7.c()
            r5 = 0
            if (r0 != 0) goto L55
            java.lang.Object r7 = r7.a
            if (r7 == 0) goto L69
            r12.b = r4
            cqi r7 = (defpackage.cqi) r7
            java.lang.Object r0 = r7.c(r8, r10, r12)
            if (r0 == r1) goto L68
        L50:
            dmd r0 = (defpackage.dmd) r0
            long r5 = r0.a
            goto L69
        L55:
            cqc r7 = r7.c()
            if (r7 == 0) goto L69
            r12.b = r3
            java.lang.Object r0 = r7.c(r8, r10, r12)
            if (r0 == r1) goto L68
        L63:
            dmd r0 = (defpackage.dmd) r0
            long r5 = r0.a
            goto L69
        L68:
            return r1
        L69:
            dmd r7 = new dmd
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu.d(long, long, afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(long j, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.cqe cqeVar;
        long j2;
        if (afdkVar instanceof defpackage.cqe) {
            cqeVar = (defpackage.cqe) afdkVar;
            int i = cqeVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cqeVar.b = i - Integer.MIN_VALUE;
            } else {
                cqeVar = new defpackage.cqe(this, afdkVar);
            }
        } else {
            cqeVar = new defpackage.cqe(this, afdkVar);
        }
        java.lang.Object objD = cqeVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = cqeVar.b;
        if (i2 == 0) {
            defpackage.afga.cz(objD);
            defpackage.cqc cqcVarC = c();
            if (cqcVarC != null) {
                cqeVar.b = 1;
                objD = cqcVarC.d(j, cqeVar);
                if (objD == afdrVar) {
                    return afdrVar;
                }
            } else {
                j2 = 0;
            }
            return new defpackage.dmd(j2);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.afga.cz(objD);
        j2 = ((defpackage.dmd) objD).a;
        return new defpackage.dmd(j2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afer, java.lang.Object] */
    public final aiuw f() {
        aiuw aiuwVar = (aiuw) this.c.invoke();
        return aiuwVar == null ? defpackage.cqj.b : aiuwVar;
    }
}
