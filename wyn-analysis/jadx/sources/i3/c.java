package i3;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f36770b;

    public /* synthetic */ c(Context context, int i5) {
        this.f36769a = i5;
        this.f36770b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f36769a
            switch(r0) {
                case 0: goto L9b;
                case 1: goto L8c;
                default: goto L5;
            }
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 1
            if (r0 < r1) goto L89
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r11.f36770b
            java.lang.String r3 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r1, r3)
            android.content.pm.PackageManager r3 = r1.getPackageManager()
            int r3 = r3.getComponentEnabledSetting(r0)
            if (r3 == r2) goto L89
            boolean r3 = g1.AbstractC2665a.b()
            java.lang.String r4 = "locale"
            if (r3 == 0) goto L62
            x.f r3 = j.l.f38470g
            r3.getClass()
            x.a r5 = new x.a
            r5.<init>(r3)
        L31:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L50
            java.lang.Object r3 = r5.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            j.l r3 = (j.l) r3
            if (r3 == 0) goto L31
            j.w r3 = (j.w) r3
            android.content.Context r3 = r3.k
            if (r3 == 0) goto L31
            java.lang.Object r3 = r3.getSystemService(r4)
            goto L51
        L50:
            r3 = 0
        L51:
            if (r3 == 0) goto L67
            android.os.LocaleList r3 = j.k.a(r3)
            g1.d r5 = new g1.d
            g1.g r6 = new g1.g
            r6.<init>(r3)
            r5.<init>(r6)
            goto L69
        L62:
            g1.d r5 = j.l.f38466c
            if (r5 == 0) goto L67
            goto L69
        L67:
            g1.d r5 = g1.C2668d.f35496b
        L69:
            g1.f r3 = r5.f35497a
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L82
            java.lang.String r3 = A6.h.G(r1)
            java.lang.Object r4 = r1.getSystemService(r4)
            if (r4 == 0) goto L82
            android.os.LocaleList r3 = j.j.a(r3)
            j.k.b(r4, r3)
        L82:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r1.setComponentEnabledSetting(r0, r2, r2)
        L89:
            j.l.f38469f = r2
            return
        L8c:
            com.applovin.impl.T0 r0 = new com.applovin.impl.T0
            r1 = 1
            r0.<init>(r1)
            ad.r r1 = i3.b.f36759a
            r2 = 0
            android.content.Context r3 = r11.f36770b
            i3.b.s(r3, r0, r1, r2)
            return
        L9b:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r6 = 1
            r7 = 0
            r5 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            i3.c r0 = new i3.c
            android.content.Context r1 = r11.f36770b
            r2 = 1
            r0.<init>(r1, r2)
            r4.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.c.run():void");
    }
}
