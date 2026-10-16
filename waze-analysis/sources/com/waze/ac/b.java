package com.waze.ac;

import android.content.Context;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13828a;

    public b(Context context) {
        x.f(context, "appContext");
        this.f13828a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "url"
            h.g.b.x.f(r8, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            android.net.Uri r2 = android.net.Uri.parse(r8)
            r0.<init>(r1, r2)
            android.content.Context r7 = r7.f13828a
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            r2 = 0
            java.util.List r1 = r1.queryIntentActivities(r0, r2)
            java.lang.String r2 = "queryIntentActivities(...)"
            h.g.b.x.e(r1, r2)
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        L2f:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L48
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ActivityInfo r4 = r4.activityInfo
            if (r4 == 0) goto L42
            java.lang.String r5 = r4.packageName
        L42:
            if (r5 == 0) goto L2f
            r3.add(r5)
            goto L2f
        L48:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Set r2 = h.a.i.au(r3)
            java.lang.String r7 = r7.getPackageName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "creating intent: url{"
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r4 = "} myPackage{"
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = "} wazeAppPrefix{com.waze} destinationPackages{"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = "}"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.waze.shared_infra.i.h.a(r3)
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto Lbd
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L95
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L95
            goto Lae
        L95:
            java.util.Iterator r3 = r3.iterator()
        L99:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lae
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r6 = "com.waze"
            boolean r4 = h.n.o.ah(r4, r6)
            if (r4 != 0) goto L99
            goto Lbd
        Lae:
            boolean r2 = r2.contains(r7)
            if (r2 == 0) goto Lbd
            java.lang.String r8 = "multiple flavors of waze can open this intent, setting only our app as destination"
            com.waze.shared_infra.i.h.a(r8)
            r0.setPackage(r7)
            return r0
        Lbd:
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto Ldb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "packageManager says no one can handle this url {"
            r7.<init>(r0)
            r7.append(r8)
            java.lang.String r8 = "}, ignoring"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.waze.shared_infra.i.h.c(r7)
            return r5
        Ldb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ac.b.a(java.lang.String):android.content.Intent");
    }
}
