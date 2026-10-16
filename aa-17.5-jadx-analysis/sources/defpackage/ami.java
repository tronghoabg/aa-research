package defpackage;

/* loaded from: classes.dex */
public final class ami extends afde implements afei {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ amv d;
    final /* synthetic */ aec e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ami(amv amvVar, aec aecVar, afck afckVar) {
        super(4, afckVar);
        this.d = amvVar;
        this.e = aecVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r10.a
            defpackage.woy.dF(r11)
            if (r1 == 0) goto La
            goto L5d
        La:
            java.lang.Object r11 = r10.f
            java.lang.Object r1 = r10.b
            java.lang.Object r2 = r10.c
            amv r3 = r10.d
            aec r7 = r10.e
            float r6 = r3.a()
            r4 = 0
            r10.f = r4
            r10.b = r4
            r5 = 1
            r10.a = r5
            anf r1 = (defpackage.anf) r1
            float r1 = r1.a(r2)
            affs r2 = new affs
            r2.<init>()
            float r8 = r3.b()
            boolean r8 = java.lang.Float.isNaN(r8)
            if (r8 == 0) goto L37
            r3 = 0
            goto L3b
        L37:
            float r3 = r3.b()
        L3b:
            r2.a = r3
            boolean r3 = java.lang.Float.isNaN(r1)
            if (r3 != 0) goto L58
            r3 = r4
            float r4 = r2.a
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 != 0) goto L4b
            goto L58
        L4b:
            apn r8 = new apn
            r8.<init>(r11, r2, r5, r3)
            r9 = r10
            r5 = r1
            java.lang.Object r10 = defpackage.afp.e(r4, r5, r6, r7, r8, r9)
            if (r10 == r0) goto L5a
        L58:
            afak r10 = defpackage.afak.a
        L5a:
            if (r10 != r0) goto L5d
            return r0
        L5d:
            afak r10 = defpackage.afak.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ami.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afei
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ami amiVar = new ami(this.d, this.e, (afck) obj4);
        amiVar.f = (amu) obj;
        amiVar.b = (anf) obj2;
        amiVar.c = obj3;
        return amiVar.hT(afak.a);
    }
}
