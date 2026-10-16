package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
final class mvo extends afde implements afeg {
    int a;
    final /* synthetic */ bbt b;
    final /* synthetic */ List c;
    final /* synthetic */ afeg d;
    final /* synthetic */ afec e;
    final /* synthetic */ int f;
    final /* synthetic */ opr g;
    final /* synthetic */ afeg h;
    final /* synthetic */ bym i;
    final /* synthetic */ bym j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvo(bbt bbtVar, List list, afeg afegVar, afec afecVar, int i, opr oprVar, afeg afegVar2, bym bymVar, bym bymVar2, afck afckVar) {
        super(2, afckVar);
        this.b = bbtVar;
        this.c = list;
        this.d = afegVar;
        this.e = afecVar;
        this.f = i;
        this.g = oprVar;
        this.h = afegVar2;
        this.i = bymVar;
        this.j = bymVar2;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new mvo(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, afckVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r11.a
            defpackage.woy.dF(r12)
            if (r1 == 0) goto Lb
            goto Le4
        Lb:
            bbt r12 = r11.b
            boolean r1 = r12.i()
            if (r1 != 0) goto Le4
            java.util.List r1 = r11.c
            bym r2 = r11.i
            int r3 = r1.size()
            java.util.List r4 = defpackage.roc.ag(r2)
            int r4 = r4.size()
            afeg r5 = r11.d
            int r6 = r12.j()
            bym r7 = r11.j
            int r7 = defpackage.roc.ah(r7)
            int r6 = defpackage.mcd.n(r6, r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            java.util.List r6 = defpackage.roc.ag(r2)
            java.lang.Object r5 = r5.invoke(r7, r6)
            java.lang.String r5 = (java.lang.String) r5
            afec r6 = r11.e
            r6.invoke(r1)
            int r6 = r1.size()
            r7 = 1
            int r6 = r6 + r7
            if (r3 <= r4) goto Lc4
            java.lang.String r3 = "choose_widget"
            boolean r4 = defpackage.affa.f(r5, r3)
            if (r4 == 0) goto Lc4
            int r4 = r11.f
            opr r8 = r11.g
            r9 = 0
        L5c:
            if (r9 >= r4) goto L6e
            java.lang.String r10 = r8.e(r9)
            if (r10 == 0) goto Lc4
            boolean r10 = defpackage.affa.f(r10, r3)
            if (r10 == 0) goto L6b
            goto Lc4
        L6b:
            int r9 = r9 + 1
            goto L5c
        L6e:
            java.util.Iterator r3 = r1.iterator()
        L72:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La5
            java.lang.Object r4 = r3.next()
            r5 = r4
            oqb r5 = (defpackage.oqb) r5
            java.util.List r8 = defpackage.roc.ag(r2)
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L8e
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L8e
            goto La6
        L8e:
            java.util.Iterator r8 = r8.iterator()
        L92:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La6
            java.lang.Object r9 = r8.next()
            oqb r9 = (defpackage.oqb) r9
            int r9 = r9.a
            int r10 = r5.a
            if (r9 != r10) goto L92
            goto L72
        La5:
            r4 = 0
        La6:
            oqb r4 = (defpackage.oqb) r4
            if (r4 != 0) goto Lb1
            java.lang.Object r2 = defpackage.woy.bK(r1)
            r4 = r2
            oqb r4 = (defpackage.oqb) r4
        Lb1:
            afeg r2 = r11.h
            int r3 = r4.a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object r1 = r2.invoke(r3, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto Ld0
        Lc4:
            afeg r2 = r11.h
            java.lang.Object r1 = r2.invoke(r5, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        Ld0:
            int r2 = defpackage.mcd.m(r12, r6)
            int r2 = r2 + r1
            int r1 = r12.j()
            if (r1 == r2) goto Le4
            r11.a = r7
            java.lang.Object r11 = r12.A(r2, r11)
            if (r11 != r0) goto Le4
            return r0
        Le4:
            afak r11 = defpackage.afak.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvo.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((mvo) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
