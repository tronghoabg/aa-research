package defpackage;

import android.util.Log;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class dwu extends dxu {
    public static final String a = affw.b(dwu.class).getSimpleName();
    public dsq c;
    private String d = "No error occurred";
    public final CountDownLatch b = new CountDownLatch(1);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.afck r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dwt
            if (r0 == 0) goto L13
            r0 = r7
            dwt r0 = (defpackage.dwt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dwt r0 = new dwt
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.woy.dF(r7)     // Catch: defpackage.aiwl -> L44
            goto L53
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.woy.dF(r7)
            dxi r7 = new dxi     // Catch: defpackage.aiwl -> L44
            r7.<init>(r6, r3, r4)     // Catch: defpackage.aiwl -> L44
            r0.c = r4     // Catch: defpackage.aiwl -> L44
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = defpackage.aikc.a(r4, r7, r0)     // Catch: defpackage.aiwl -> L44
            if (r7 == r1) goto L43
            goto L53
        L43:
            return r1
        L44:
            java.lang.String r7 = defpackage.dwu.a
            java.lang.String r0 = "waitForResponse: coroutine timeout reached"
            android.util.Log.i(r7, r0)
            dwo r7 = new dwo
            r0 = 6
            r7.<init>(r0)
            r6.c = r7
        L53:
            dsq r6 = r6.c
            if (r6 == 0) goto L58
            return r6
        L58:
            java.lang.String r6 = "result"
            defpackage.affa.d(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwu.a(afck):java.lang.Object");
    }

    @Override // defpackage.dxv
    public final void b(int i, String str) {
        this.c = new dwo(i);
        if (str != null) {
            this.d = str;
            Log.i(a, "onFailure: ".concat(String.valueOf(str)));
        }
        this.b.countDown();
    }

    @Override // defpackage.dxv
    public final void c() {
        this.c = new dwp();
        this.b.countDown();
    }
}
