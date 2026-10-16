package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class tnb {
    public static final AtomicInteger a = new AtomicInteger(2);
    private static final String b = "tnb";

    private tnb() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void a(android.content.Context r9) {
        /*
            java.lang.Class<tnb> r0 = defpackage.tnb.class
            monitor-enter(r0)
            java.io.File r9 = r9.getFilesDir()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r9 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r1 = defpackage.tnb.b     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = "Incrementing crash counter."
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r3 = "Checking for existing crash count markers at: "
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> Lb1
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> Lb1
            int r1 = defpackage.tnd.a     // Catch: java.lang.Throwable -> Lb1
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lb1
            r1.<init>(r9)     // Catch: java.lang.Throwable -> Lb1
            tnc r2 = new tnc     // Catch: java.lang.Throwable -> Lb1
            r3 = 1
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String[] r1 = r1.list(r2)     // Catch: java.lang.Throwable -> Lb1
            r2 = 0
            if (r1 == 0) goto L63
            r4 = r2
            r5 = r4
        L35:
            int r6 = r1.length     // Catch: java.lang.Throwable -> Lb1
            if (r4 >= r6) goto L62
            r6 = r1[r4]     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r7 = "_"
            int r7 = r6.lastIndexOf(r7)     // Catch: java.lang.Throwable -> Lb1
            int r7 = r7 + r3
            java.lang.String r6 = r6.substring(r7)     // Catch: java.lang.NumberFormatException -> L4a java.lang.Throwable -> Lb1
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L4c java.lang.Throwable -> Lb1
            goto L5c
        L4a:
            java.lang.String r6 = ""
        L4c:
            java.lang.String r7 = "Couldn't parse crash count from marker file name: "
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r8 = defpackage.tnb.b     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r6 = r7.concat(r6)     // Catch: java.lang.Throwable -> Lb1
            android.util.Log.i(r8, r6)     // Catch: java.lang.Throwable -> Lb1
            r6 = r2
        L5c:
            if (r6 <= r5) goto L5f
            r5 = r6
        L5f:
            int r4 = r4 + 1
            goto L35
        L62:
            r2 = r5
        L63:
            java.lang.String r1 = "Returning existing crash count of: "
            java.lang.String r4 = defpackage.tnb.b     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r1 = defpackage.a.bp(r2, r1)     // Catch: java.lang.Throwable -> Lb1
            android.util.Log.d(r4, r1)     // Catch: java.lang.Throwable -> Lb1
            int r1 = r2 + 1
            java.lang.String r5 = "_google_maps_sdk_crash_count_"
            java.lang.String r2 = defpackage.a.bp(r2, r5)     // Catch: java.lang.Throwable -> Lb1
            java.util.concurrent.atomic.AtomicInteger r5 = defpackage.tnb.a     // Catch: java.lang.Throwable -> Lb1
            int r5 = r5.get()     // Catch: java.lang.Throwable -> Lb1
            if (r1 < r5) goto L94
            java.lang.String r1 = "Crash loop detected."
            android.util.Log.d(r4, r1)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r1 = "_google_maps_sdk_recovery_needed_"
            boolean r1 = defpackage.tnd.b(r9, r1)     // Catch: java.lang.Throwable -> Lb1
            if (r1 == 0) goto Laa
            defpackage.tnd.a(r9, r2)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r9 = "Recovery marker created."
            android.util.Log.d(r4, r9)     // Catch: java.lang.Throwable -> Lb1
            goto Laa
        L94:
            java.lang.String r5 = "_google_maps_sdk_crash_count_"
            java.lang.String r5 = defpackage.a.bp(r1, r5)     // Catch: java.lang.Throwable -> Lb1
            boolean r5 = defpackage.tnd.b(r9, r5)     // Catch: java.lang.Throwable -> Lb1
            if (r5 == 0) goto Laa
            if (r1 <= r3) goto La5
            defpackage.tnd.a(r9, r2)     // Catch: java.lang.Throwable -> Lb1
        La5:
            java.lang.String r9 = "Crash count marker created."
            android.util.Log.d(r4, r9)     // Catch: java.lang.Throwable -> Lb1
        Laa:
            java.lang.String r9 = "Crash counter increment done."
            android.util.Log.d(r4, r9)     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r0)
            return
        Lb1:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tnb.a(android.content.Context):void");
    }
}
