package com.waze.bj;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.waze.shared_infra.i.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final e f16835a = com.waze.shared_infra.i.a.d("ReferrerTracker");

    /* renamed from: b, reason: collision with root package name */
    private static final Object f16836b = c.class;

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(android.content.Context r5) {
        /*
            java.lang.String r0 = "Loading prefs. Deep link: "
            java.lang.Object r1 = com.waze.bj.c.f16836b
            monitor-enter(r1)
            r2 = 0
            android.content.SharedPreferences r5 = i(r5)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            java.lang.String r3 = "deeplink"
            java.lang.String r4 = ""
            java.lang.String r5 = r5.getString(r3, r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            com.waze.shared_infra.i.e r3 = com.waze.bj.c.f16835a     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2f
            r4.<init>(r0)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2f
            r4.append(r5)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2f
            r3.a(r0)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2f
            int r0 = r5.length()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2f
            if (r0 != 0) goto L2a
            goto L3a
        L2a:
            r2 = r5
            goto L3a
        L2c:
            r0 = move-exception
            r2 = r5
            goto L33
        L2f:
            r5 = move-exception
            goto L43
        L31:
            r5 = move-exception
            r0 = r5
        L33:
            com.waze.shared_infra.i.e r3 = com.waze.bj.c.f16835a     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = "Failed to read referrer file"
            r3.c(r5, r0)     // Catch: java.lang.Throwable -> L2f
        L3a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L42
            java.lang.String r5 = "Deep link is empty"
            r3.a(r5)
        L42:
            return r2
        L43:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bj.c.c(android.content.Context):java.lang.String");
    }

    public static void e(Context context) {
        try {
            k(context, null, "");
        } catch (Exception e2) {
            f16835a.c("Failed to invalidate referrer file", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(android.content.Context r6) {
        /*
            java.lang.String r0 = "Loading prefs. Referrer: "
            java.lang.Object r1 = com.waze.bj.c.f16836b
            monitor-enter(r1)
            r2 = 0
            android.content.SharedPreferences r3 = i(r6)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.String r4 = "referrer"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            com.waze.shared_infra.i.e r4 = com.waze.bj.c.f16835a     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L2d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L2d
            r5.<init>(r0)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L2d
            r5.append(r3)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L2d
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L2d
            r4.a(r0)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L2d
            int r0 = r3.length()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L2d
            if (r0 != 0) goto L38
            r3 = r2
            goto L38
        L2b:
            r0 = move-exception
            goto L31
        L2d:
            r6 = move-exception
            goto L7e
        L2f:
            r0 = move-exception
            r3 = r2
        L31:
            com.waze.shared_infra.i.e r4 = com.waze.bj.c.f16835a     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "Failed to read referrer file"
            r4.c(r5, r0)     // Catch: java.lang.Throwable -> L2d
        L38:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L40
            java.lang.String r0 = "Referrer is empty"
            r4.a(r0)
        L40:
            if (r3 == 0) goto L7d
            java.lang.String r0 = ""
            k(r6, r0, r2)
            com.waze.bj.a.a r6 = com.waze.bj.a.b.f16829a
            org.a.d.a.a r6 = (org.a.d.a.a) r6
            boolean r0 = r6 instanceof org.a.d.a.b
            if (r0 == 0) goto L5f
            org.a.d.a.b r6 = (org.a.d.a.b) r6
            org.a.d.k.b r6 = r6.l()
            int r0 = h.g.b.ar.f48106a
            h.g.b.m r0 = new h.g.b.m
            java.lang.Class<com.waze.bj.a.b> r1 = com.waze.bj.a.b.class
            r0.<init>(r1)
            goto L74
        L5f:
            org.a.d.a r6 = r6.getKoin()
            org.a.d.j.a r6 = r6.a()
            org.a.d.k.b r6 = r6.c()
            int r0 = h.g.b.ar.f48106a
            h.g.b.m r0 = new h.g.b.m
            java.lang.Class<com.waze.bj.a.b> r1 = com.waze.bj.a.b.class
            r0.<init>(r1)
        L74:
            java.lang.Object r6 = r6.a(r0, r2, r2)
            com.waze.bj.a.b r6 = (com.waze.bj.a.b) r6
            r6.a(r3)
        L7d:
            return
        L7e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bj.c.f(android.content.Context):void");
    }

    public static void g(Context context) {
        com.a.a.a.a aVar = new com.a.a.a.a(context);
        try {
            aVar.a(new b(aVar, context));
        } catch (SecurityException e2) {
            f16835a.c("Unable to request installation referrer.", e2);
        }
    }

    static /* bridge */ /* synthetic */ String h(android.support.v4.a.a.a aVar) {
        try {
            String strB = aVar.b();
            return strB != null ? j(Uri.decode(strB)) : strB;
        } catch (Exception e2) {
            f16835a.c("Referrer extraction error", e2);
            return null;
        }
    }

    private static SharedPreferences i(Context context) {
        return context.getSharedPreferences("referrer", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String j(String str) {
        return str.startsWith("invite_") ? str.replaceAll("&", "|") : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(Context context, String str, String str2) {
        synchronized (f16836b) {
            try {
                f16835a.a("Saving to prefs. Referrer: " + str);
                SharedPreferences.Editor editorEdit = i(context).edit();
                if (str != null) {
                    editorEdit.putString("referrer", str);
                }
                if (str2 != null) {
                    editorEdit.putString("deeplink", str2);
                }
                editorEdit.apply();
            } catch (Exception e2) {
                f16835a.c("Failed to update referrer prefs", e2);
            }
        }
    }
}
