package defpackage;

/* loaded from: classes2.dex */
public final class fao extends afde implements afeg {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ ezc f;
    final /* synthetic */ afec g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fao(boolean z, boolean z2, ezc ezcVar, afck afckVar, afec afecVar) {
        super(2, afckVar);
        this.d = z;
        this.e = z2;
        this.f = ezcVar;
        this.g = afecVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        fao faoVar = new fao(this.d, this.e, this.f, afckVar, this.g);
        faoVar.c = obj;
        return faoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r8.a(r7) != r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[PHI: r3 r8
  0x008c: PHI (r3v4 faf) = (r3v3 faf), (r3v10 faf) binds: [B:30:0x008a, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r8v13 java.lang.Object) = (r8v12 java.lang.Object), (r8v0 java.lang.Object) binds: [B:30:0x008a, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af A[RETURN] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r7.b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1d
            java.lang.Object r3 = r7.c
            if (r1 == r2) goto L16
            defpackage.woy.dF(r8)
            goto L9d
        L16:
            faf r3 = (defpackage.faf) r3
            defpackage.woy.dF(r8)
            goto L8c
        L1d:
            java.lang.Object r1 = r7.a
            java.lang.Object r3 = r7.c
            faf r3 = (defpackage.faf) r3
            defpackage.woy.dF(r8)
            goto L75
        L27:
            java.lang.Object r1 = r7.a
            java.lang.Object r4 = r7.c
            faf r4 = (defpackage.faf) r4
            defpackage.woy.dF(r8)
            goto L57
        L31:
            defpackage.woy.dF(r8)
            java.lang.Object r8 = r7.c
            faf r8 = (defpackage.faf) r8
            boolean r1 = r7.d
            if (r1 == 0) goto Lb1
            boolean r1 = r7.e
            if (r1 == 0) goto L43
            ezk r5 = defpackage.ezk.a
            goto L45
        L43:
            ezk r5 = defpackage.ezk.b
        L45:
            if (r1 != 0) goto L73
            r7.c = r8
            r7.a = r5
            r7.b = r4
            java.lang.Object r1 = r8.e()
            if (r1 != r0) goto L54
            goto Lb0
        L54:
            r4 = r8
            r8 = r1
            r1 = r5
        L57:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L71
            ezc r8 = r7.f
            eys r8 = r8.b()
            r7.c = r4
            r7.a = r1
            r7.b = r3
            java.lang.Object r8 = r8.a(r7)
            if (r8 == r0) goto Lb0
        L71:
            r3 = r4
            goto L75
        L73:
            r3 = r8
            r1 = r5
        L75:
            afec r8 = r7.g
            fan r4 = new fan
            r5 = 0
            r6 = 0
            r4.<init>(r6, r8, r5)
            r7.c = r3
            r7.a = r6
            r7.b = r2
            ezk r1 = (defpackage.ezk) r1
            java.lang.Object r8 = r3.d(r1, r4, r7)
            if (r8 == r0) goto Lb0
        L8c:
            boolean r1 = r7.e
            if (r1 != 0) goto Laf
            r7.c = r8
            r1 = 4
            r7.b = r1
            java.lang.Object r1 = r3.e()
            if (r1 == r0) goto Lb0
            r3 = r8
            r8 = r1
        L9d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto Lae
            ezc r7 = r7.f
            eys r7 = r7.b()
            r7.b()
        Lae:
            return r3
        Laf:
            return r8
        Lb0:
            return r0
        Lb1:
            r8.getClass()
            afec r7 = r7.g
            fca r8 = r8.a
            java.lang.Object r7 = r7.invoke(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fao.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fao) b((faf) obj, (afck) obj2)).hT(afak.a);
    }
}
