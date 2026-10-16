package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class egz {
    public final aitm a;
    public List b;
    final /* synthetic */ egd c;
    private final ajdz d;
    private final afco e;

    public egz(egd egdVar, List list, afco afcoVar) {
        afcoVar.getClass();
        this.c = egdVar;
        this.d = new ajdz();
        this.a = new aitm();
        this.e = afcoVar;
        this.b = woy.cf(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.afck r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.egy
            if (r0 == 0) goto L13
            r0 = r6
            egy r0 = (defpackage.egy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            egy r0 = new egy
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            ajdz r0 = r0.d
            defpackage.woy.dF(r6)     // Catch: java.lang.Throwable -> L2c
            goto L70
        L2c:
            r5 = move-exception
            goto L7f
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            ajdz r2 = r0.d
            defpackage.woy.dF(r6)
            r6 = r2
            goto L57
        L3d:
            defpackage.woy.dF(r6)
            aitm r6 = r5.a
            boolean r6 = r6.x()
            if (r6 == 0) goto L4b
            afak r5 = defpackage.afak.a
            return r5
        L4b:
            ajdz r6 = r5.d
            r0.d = r6
            r0.c = r4
            java.lang.Object r2 = r6.b(r0)
            if (r2 == r1) goto L83
        L57:
            aitm r2 = r5.a     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r2.x()     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L65
            afak r5 = defpackage.afak.a     // Catch: java.lang.Throwable -> L7d
            r6.d()
            return r5
        L65:
            r0.d = r6     // Catch: java.lang.Throwable -> L7d
            r0.c = r3     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r5.b(r0)     // Catch: java.lang.Throwable -> L7d
            if (r0 == r1) goto L83
            r0 = r6
        L70:
            aitm r5 = r5.a     // Catch: java.lang.Throwable -> L2c
            afak r6 = defpackage.afak.a     // Catch: java.lang.Throwable -> L2c
            r5.O(r6)     // Catch: java.lang.Throwable -> L2c
            r0.d()
            afak r5 = defpackage.afak.a
            return r5
        L7d:
            r5 = move-exception
            r0 = r6
        L7f:
            r0.d()
            throw r5
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egz.a(afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object b(defpackage.afck r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.efb
            if (r0 == 0) goto L13
            r0 = r11
            efb r0 = (defpackage.efb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            efb r0 = new efb
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.woy.dF(r11)
            goto L54
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            defpackage.woy.dF(r11)
            goto L3c
        L36:
            defpackage.woy.dF(r11)
            r0.b = r4
            r11 = 0
        L3c:
            afco r2 = r10.e
            egd r5 = r10.c
            r6 = r11
            fdf r6 = (defpackage.fdf) r6
            bqi r4 = new bqi
            r8 = 0
            r9 = 2
            r7 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.b = r3
            java.lang.Object r10 = defpackage.ahnc.a(r2, r4, r0)
            if (r10 != r1) goto L54
            return r1
        L54:
            afak r10 = defpackage.afak.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egz.b(afck):java.lang.Object");
    }
}
