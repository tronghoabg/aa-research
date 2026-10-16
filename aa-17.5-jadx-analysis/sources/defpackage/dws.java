package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.telecom.InCallService;

/* loaded from: classes.dex */
public class dws extends InCallService implements eqa {
    public static final String a = affw.b(InCallService.class).getSimpleName();
    private final gjt b = new gjt(this);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(defpackage.dws r11, android.telecom.Call r12, defpackage.afec r13, defpackage.afck r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof defpackage.dwr
            if (r0 == 0) goto L13
            r0 = r14
            dwr r0 = (defpackage.dwr) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dwr r0 = new dwr
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r14)
            goto L5f
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.woy.dF(r14)
            epv r14 = defpackage.dty.f(r11)
            afco r14 = r14.b
            aiwh r2 = new aiwh
            r4 = 0
            r2.<init>(r4)
            afco r14 = r14.plus(r2)
            aitx r14 = defpackage.ahni.b(r14)
            efz r5 = new efz
            r9 = 0
            r10 = 1
            r6 = r11
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r11 = 3
            r12 = 0
            aivh r11 = defpackage.ahnc.d(r14, r4, r12, r5, r11)
            r0.b = r3
            java.lang.Object r11 = r11.n(r0)
            if (r11 != r1) goto L5f
            return r1
        L5f:
            java.lang.String r11 = defpackage.dws.a
            java.lang.String r12 = "connectExtensions: complete"
            android.util.Log.d(r11, r12)
            afak r11 = defpackage.afak.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dws.a(dws, android.telecom.Call, afec, afck):java.lang.Object");
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return (ept) this.b.b;
    }

    @Override // android.telecom.InCallService, android.app.Service
    public final IBinder onBind(Intent intent) {
        this.b.p();
        return super.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.b.q();
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.b.r();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.b.s();
        super.onStart(intent, i);
    }
}
