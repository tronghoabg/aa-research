package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class myu extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myu(afdr afdrVar, afec afecVar, bbt bbtVar, Map map, nbf nbfVar, afck afckVar, int i) {
        super(2, afckVar);
        this.g = i;
        this.b = afdrVar;
        this.c = afecVar;
        this.d = bbtVar;
        this.e = map;
        this.f = nbfVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [gku, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.g == 0) {
            return new myu((afdr) this.b, (afec) this.c, (bbt) this.d, (Map) this.e, (nbf) this.f, afckVar, 0);
        }
        Object obj2 = this.f;
        ?? r2 = this.d;
        Object obj3 = this.c;
        return new myu((ieb) obj2, (asf) r2, (affv) obj3, (affq) this.b, (gku) this.e, afckVar, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (defpackage.myv.g((defpackage.bbt) r1, r8, r2, r7) == r0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [gku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.g
            r1 = 1
            if (r0 == 0) goto L36
            afcr r0 = defpackage.afcr.a
            int r2 = r7.a
            defpackage.woy.dF(r8)
            if (r2 != 0) goto L30
            java.lang.Object r8 = r7.f
            java.lang.Object r2 = r7.d
            java.lang.Object r3 = r7.c
            java.lang.Object r4 = r7.b
            java.lang.Object r5 = r7.e
            gbo r6 = new gbo
            affq r4 = (defpackage.affq) r4
            affv r3 = (defpackage.affv) r3
            r6.<init>(r2, r3, r4, r5)
            r7.a = r1
            ieb r8 = (defpackage.ieb) r8
            java.lang.Object r8 = r8.a
            aizp r8 = (defpackage.aizp) r8
            java.lang.Object r7 = defpackage.aizp.g(r8, r6, r7)
            if (r7 != r0) goto L30
            return r0
        L30:
            aezp r7 = new aezp
            r7.<init>()
            throw r7
        L36:
            afcr r0 = defpackage.afcr.a
            int r2 = r7.a
            if (r2 == 0) goto L46
            if (r2 == r1) goto L42
            defpackage.woy.dF(r8)
            goto L99
        L42:
            defpackage.woy.dF(r8)
            goto L54
        L46:
            defpackage.woy.dF(r8)
            r7.a = r1
            r1 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r8 = defpackage.aiow.c(r1, r7)
            if (r8 != r0) goto L54
            goto L98
        L54:
            java.lang.Object r8 = r7.b
            java.lang.Object r8 = r8.invoke()
            if (r8 != 0) goto L5e
            afbe r8 = defpackage.afbe.a
        L5e:
            java.lang.Object r1 = r7.f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r8.iterator()
        L69:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L80
            java.lang.Object r4 = r3.next()
            r5 = r4
            nbf r5 = (defpackage.nbf) r5
            boolean r5 = defpackage.affa.f(r5, r1)
            if (r5 != 0) goto L69
            r2.add(r4)
            goto L69
        L80:
            boolean r1 = defpackage.affa.f(r8, r2)
            if (r1 != 0) goto L99
            java.lang.Object r1 = r7.c
            r1.invoke(r2)
            java.lang.Object r1 = r7.d
            r3 = 2
            r7.a = r3
            bbt r1 = (defpackage.bbt) r1
            java.lang.Object r8 = defpackage.myv.g(r1, r8, r2, r7)
            if (r8 != r0) goto L99
        L98:
            return r0
        L99:
            java.lang.Object r8 = r7.e
            java.lang.Object r7 = r7.f
            r8.remove(r7)
            yph r8 = defpackage.myv.a
            yop r8 = r8.l()
            java.lang.String r0 = "Item removed after timeout: %s"
            r8.y(r0, r7)
            afak r7 = defpackage.afak.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myu.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.g != 0) {
            return ((myu) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((myu) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myu(ieb iebVar, asf asfVar, affv affvVar, affq affqVar, gku gkuVar, afck afckVar, int i) {
        super(2, afckVar);
        this.g = i;
        this.f = iebVar;
        this.d = asfVar;
        this.c = affvVar;
        this.b = affqVar;
        this.e = gkuVar;
    }
}
