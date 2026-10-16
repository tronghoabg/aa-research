package defpackage;

/* loaded from: classes2.dex */
public final class fat extends afde implements afeg {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ezc d;
    final /* synthetic */ afec e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fat(boolean z, ezc ezcVar, afck afckVar, afec afecVar) {
        super(2, afckVar);
        this.c = z;
        this.d = ezcVar;
        this.e = afecVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        fat fatVar = new fat(this.c, this.d, afckVar, this.e);
        fatVar.b = obj;
        return fatVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[RETURN] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r6.a
            if (r1 == 0) goto L7c
            r2 = 1
            r3 = 3
            r4 = 2
            if (r1 == r2) goto L24
            if (r1 == r4) goto L1b
            java.lang.Object r2 = r6.b
            if (r1 == r3) goto L15
            defpackage.woy.dF(r7)
            goto L68
        L15:
            faf r2 = (defpackage.faf) r2
            defpackage.woy.dF(r7)
            goto L57
        L1b:
            java.lang.Object r1 = r6.b
            faf r1 = (defpackage.faf) r1
            defpackage.woy.dF(r7)
        L22:
            r2 = r1
            goto L44
        L24:
            java.lang.Object r1 = r6.b
            faf r1 = (defpackage.faf) r1
            defpackage.woy.dF(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L22
            ezc r7 = r6.d
            eys r7 = r7.b()
            r6.b = r1
            r6.a = r4
            java.lang.Object r7 = r7.a(r6)
            if (r7 == r0) goto L7a
            goto L22
        L44:
            afec r7 = r6.e
            fan r1 = new fan
            r5 = 0
            r1.<init>(r5, r7, r4, r5)
            r6.b = r2
            r6.a = r3
            java.lang.Object r7 = r2.d(r5, r1, r6)
            if (r7 != r0) goto L57
            goto L7a
        L57:
            boolean r1 = r6.c
            if (r1 != 0) goto L7b
            r6.b = r7
            r1 = 4
            r6.a = r1
            java.lang.Object r1 = r2.e()
            if (r1 == r0) goto L7a
            r2 = r7
            r7 = r1
        L68:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L79
            ezc r6 = r6.d
            eys r6 = r6.b()
            r6.b()
        L79:
            return r2
        L7a:
            return r0
        L7b:
            return r7
        L7c:
            defpackage.woy.dF(r7)
            java.lang.Object r7 = r6.b
            faf r7 = (defpackage.faf) r7
            r7.getClass()
            afec r6 = r6.e
            fca r7 = r7.a
            java.lang.Object r6 = r6.invoke(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fat.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fat) b((faf) obj, (afck) obj2)).hT(afak.a);
    }
}
