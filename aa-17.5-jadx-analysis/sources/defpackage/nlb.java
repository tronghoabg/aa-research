package defpackage;

import com.google.android.gms.car.control.CarAction;

/* loaded from: classes2.dex */
final class nlb extends afde implements afeg {
    int a;
    final /* synthetic */ CarAction b;
    final /* synthetic */ afec c;
    final /* synthetic */ npe d;
    final /* synthetic */ int e;
    final /* synthetic */ bym f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlb(CarAction carAction, afec afecVar, npe npeVar, int i, bym bymVar, afck afckVar) {
        super(2, afckVar);
        this.b = carAction;
        this.c = afecVar;
        this.d = npeVar;
        this.e = i;
        this.f = bymVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new nlb(this.b, this.c, this.d, this.e, this.f, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r5.invoke(r4) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r5.b(r1, r4) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r1.b(r5, r4) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        return r0;
     */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r4.a
            r2 = 2
            r3 = 1
            defpackage.woy.dF(r5)
            if (r1 == 0) goto Lc
            goto L66
        Lc:
            com.google.android.gms.car.control.CarAction r5 = r4.b
            if (r5 == 0) goto L1c
            kjo r4 = defpackage.kjq.a
            kjq r4 = r4.a()
            int r5 = r5.a
            r4.l(r5)
            goto L66
        L1c:
            bym r5 = r4.f
            kkf r5 = defpackage.roc.ao(r5)
            java.lang.Object r5 = defpackage.kkg.b(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L2b
            goto L3c
        L2b:
            int r1 = r5.intValue()
            if (r1 != r3) goto L3c
            afec r5 = r4.c
            r4.a = r3
            java.lang.Object r4 = r5.invoke(r4)
            if (r4 != r0) goto L66
            goto L65
        L3c:
            if (r5 != 0) goto L3f
            goto L52
        L3f:
            int r1 = r5.intValue()
            if (r1 != 0) goto L52
            npe r5 = r4.d
            int r1 = r4.e
            r4.a = r2
            java.lang.Object r4 = r5.b(r1, r4)
            if (r4 != r0) goto L66
            goto L65
        L52:
            if (r5 == 0) goto L66
            npe r1 = r4.d
            int r5 = r5.intValue()
            int r5 = r5 + (-1)
            r2 = 3
            r4.a = r2
            java.lang.Object r4 = r1.b(r5, r4)
            if (r4 != r0) goto L66
        L65:
            return r0
        L66:
            afak r4 = defpackage.afak.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlb.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((nlb) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
