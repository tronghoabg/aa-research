package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class pfh implements pfc {
    public static final yph a = yph.c("GH.WIRELESS.CDM");
    public final jlu b;
    public int c;
    public int d;
    private final Context e;
    private final kny f;
    private final aitx g;
    private aiud h;
    private aiud i;
    private zgp j;
    private zgp k;

    public pfh(Context context) {
        jme jmeVarA = jme.a.a(context);
        kny knyVar = new kny(context);
        Executor mainExecutor = context.getMainExecutor();
        mainExecutor.getClass();
        this.e = context;
        this.b = jmeVarA;
        this.f = knyVar;
        this.g = ahni.b(aiji.b(mainExecutor).plus(new aitw("GH.WIRELESS.CDM")));
        pfd pfdVar = pfd.a;
        this.h = aiir.a(pfdVar);
        this.i = aiir.a(pfdVar);
        afak afakVar = afak.a;
        this.j = wub.Y(afakVar);
        this.k = wub.Y(afakVar);
        this.c = 1;
        this.d = 1;
    }

    @Override // defpackage.pfc
    public final zgp a() {
        wer.c();
        if (this.e.checkSelfPermission("android.permission.REQUEST_COMPANION_SELF_MANAGED") != 0) {
            d(yxi.WIRELESS_CDM_REJECTED_NO_SELF_MANAGED_PERMISSION);
            throw new SecurityException("Lacking permission REQUEST_COMPANION_SELF_MANAGED");
        }
        if (this.c == 2) {
            a.l().u("Client already requested appear, returning existing result");
            return this.j;
        }
        this.c = 2;
        this.k.cancel(false);
        aiud aiudVar = this.i;
        aitx aitxVar = this.g;
        aiud aiudVarB = ahnc.b(aitxVar, null, new nkn(aiudVar, this, (afck) null, 11), 3);
        this.h = aiudVarB;
        zgp zgpVarB = aiqd.b(aitxVar, aivt.a, new nkn(this, aiudVarB, (afck) null, 12));
        this.j = zgpVarB;
        return zgpVarB;
    }

    @Override // defpackage.pfc
    public final void b() {
        wer.c();
        if (this.c == 1) {
            a.l().u("Client already requested disappear, returning existing result");
            return;
        }
        this.c = 1;
        this.j.cancel(false);
        aiud aiudVar = this.h;
        aitx aitxVar = this.g;
        aiud aiudVarB = ahnc.b(aitxVar, null, new nkn(aiudVar, this, (afck) null, 13, (byte[]) null), 3);
        this.i = aiudVarB;
        this.k = aiqd.b(aitxVar, aivt.a, new nkn(this, aiudVarB, (afck) null, 14, (byte[]) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.aiud r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.pfg
            if (r0 == 0) goto L13
            r0 = r6
            pfg r0 = (defpackage.pfg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pfg r0 = new pfg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.a
            afcr r6 = defpackage.afcr.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.woy.dF(r4)
            goto L3a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.woy.dF(r4)
            r0.c = r2
            java.lang.Object r4 = r5.a(r0)
            if (r4 == r6) goto L53
        L3a:
            pfd r5 = defpackage.pfd.b
            if (r4 == r5) goto L41
            afak r4 = defpackage.afak.a
            return r4
        L41:
            pfa r4 = new pfa
            long r5 = defpackage.aczv.e()
            java.lang.String r0 = "CDM did not return appear callback within "
            java.lang.String r1 = " ms"
            java.lang.String r5 = defpackage.a.bI(r5, r0, r1)
            r4.<init>(r5)
            throw r4
        L53:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfh.c(aiud, afck):java.lang.Object");
    }

    public final void d(yxi yxiVar) {
        this.f.d(yxiVar);
    }
}
