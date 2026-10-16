package B9;

import android.app.Activity;
import android.view.View;

/* loaded from: classes4.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N9.a f1616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f1617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f1618c;

    public b(f fVar, N9.a aVar, Activity activity) {
        this.f1618c = fVar;
        this.f1616a = aVar;
        this.f1617b = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            B9.f r8 = r7.f1618c
            z9.E r0 = r8.k
            N9.a r1 = r7.f1616a
            java.lang.String r2 = r1.f8601a
            if (r0 == 0) goto L57
            java.lang.String r0 = "Calling callback for click action"
            D9.e.e(r0)
            z9.E r0 = r8.k
            J9.o r0 = (J9.C0656o) r0
            java.lang.Object r3 = r0.f5968h
            J9.i r3 = (J9.C0650i) r3
            boolean r3 = r3.a()
            if (r3 == 0) goto L4a
            if (r2 != 0) goto L25
            z9.C r1 = z9.EnumC4624C.f48423c
            r0.f(r1)
            goto L57
        L25:
            java.lang.String r3 = "Attempting to record: message click to metrics logger"
            ic.d.E(r3)
            J9.n r3 = new J9.n
            r3.<init>(r0, r1)
            Qe.b r1 = new Qe.b
            r4 = 1
            r1.<init>(r3, r4)
            boolean r3 = r0.f5961a
            if (r3 != 0) goto L3c
            r0.b()
        L3c:
            He.g r1 = r1.f()
            java.lang.Object r0 = r0.f5964d
            J9.X r0 = (J9.X) r0
            He.m r0 = r0.f5906a
            J9.C0656o.e(r1, r0)
            goto L57
        L4a:
            java.lang.String r1 = "message click to metrics logger"
            r0.c(r1)
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r0.getTask()
        L57:
            android.net.Uri r0 = android.net.Uri.parse(r2)
            android.app.Activity r1 = r7.f1617b
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            if (r0 != 0) goto L65
            goto Lac
        L65:
            java.lang.String r5 = r0.getScheme()
            if (r5 == 0) goto Lac
            java.lang.String r6 = "http"
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 != 0) goto L7b
            java.lang.String r6 = "https"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto Lac
        L7b:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.support.customtabs.action.CustomTabsService"
            r5.<init>(r6)
            java.lang.String r6 = "com.android.chrome"
            r5.setPackage(r6)
            android.content.pm.PackageManager r6 = r1.getPackageManager()
            java.util.List r5 = r6.queryIntentServices(r5, r4)
            if (r5 == 0) goto Lac
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto Lac
            p9.C r4 = new p9.C
            r4.<init>()
            u.k r4 = r4.b()
            android.content.Intent r5 = r4.f46072a
            r5.addFlags(r3)
            r5.addFlags(r2)
            r4.a(r1, r0)
            goto Lcc
        Lac:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r5.<init>(r6, r0)
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            android.content.pm.ResolveInfo r0 = r0.resolveActivity(r5, r4)
            r5.addFlags(r3)
            r5.addFlags(r2)
            if (r0 == 0) goto Lc7
            r1.startActivity(r5)
            goto Lcc
        Lc7:
            java.lang.String r0 = "Device cannot resolve intent for: android.intent.action.VIEW"
            D9.e.d(r0)
        Lcc:
            r8.e(r1)
            r0 = 0
            r8.f1636j = r0
            r8.k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B9.b.onClick(android.view.View):void");
    }
}
