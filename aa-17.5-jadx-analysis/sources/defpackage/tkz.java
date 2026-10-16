package defpackage;

import j$.time.Duration;

/* loaded from: classes3.dex */
final class tkz extends afde implements afeg {
    int a;
    final /* synthetic */ Duration b;
    final /* synthetic */ tla c;
    final /* synthetic */ aivh d;
    final /* synthetic */ tkw e;
    final /* synthetic */ ajed f;
    final /* synthetic */ ajed g;
    final /* synthetic */ gjt h;
    final /* synthetic */ gjt i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkz(ajed ajedVar, Duration duration, tla tlaVar, aivh aivhVar, gjt gjtVar, gjt gjtVar2, ajed ajedVar2, tkw tkwVar, afck afckVar) {
        super(2, afckVar);
        this.f = ajedVar;
        this.b = duration;
        this.c = tlaVar;
        this.d = aivhVar;
        this.h = gjtVar;
        this.i = gjtVar2;
        this.g = ajedVar2;
        this.e = tkwVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new tkz(this.f, this.b, this.c, this.d, this.h, this.i, this.g, this.e, afckVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r9 == r0) goto L11;
     */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r8.a
            r2 = 1
            defpackage.woy.dF(r9)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L18
            goto L2e
        Ld:
            ajed r9 = r8.f
            r8.a = r2
            java.lang.Object r9 = r9.e(r8)
            if (r9 != r0) goto L18
            goto L2d
        L18:
            j$.time.Duration r9 = r8.b
            aivh r1 = r8.d
            nba r2 = new nba
            r3 = 0
            r4 = 13
            r2.<init>(r1, r3, r4)
            r1 = 2
            r8.a = r1
            java.lang.Object r9 = defpackage.aiqq.b(r9, r2, r8)
            if (r9 != r0) goto L2e
        L2d:
            return r0
        L2e:
            afak r9 = (defpackage.afak) r9
            if (r9 == 0) goto L35
            afak r8 = defpackage.afak.a
            return r8
        L35:
            tla r3 = r8.c
            gjt r1 = r8.h
            gjt r2 = r8.i
            j$.time.Duration r4 = r8.b
            ajed r5 = r8.g
            tkw r6 = r8.e
            tky r0 = new tky
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            android.os.Handler r8 = r3.d
            r8.post(r0)
            afak r8 = defpackage.afak.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkz.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((tkz) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
