package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes3.dex */
public final class zta {
    private static final String b = "zta";
    public static final zta a = new zta();
    private static volatile String c = null;

    private zta() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:5:0x002b, B:7:0x0031, B:21:0x004a, B:23:0x0053), top: B:34:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[PHI: r4 r11
  0x0068: PHI (r4v3 java.lang.String) = (r4v7 java.lang.String), (r4v6 java.lang.String) binds: [B:24:0x0066, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x0068: PHI (r11v6 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v10 android.database.Cursor) binds: [B:24:0x0066, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String d(android.content.Context r11) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "value"
            java.lang.String r1 = "Error getting distribution channel for key maps_client_id: "
            zrr r2 = defpackage.zrr.a
            android.os.StrictMode$ThreadPolicy r2 = r2.a()
            java.lang.String r3 = "maps_client_id"
            r4 = 0
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L45 java.lang.RuntimeException -> L47
            java.lang.String r11 = "content://com.google.settings/partner"
            android.net.Uri r6 = android.net.Uri.parse(r11)     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L45 java.lang.RuntimeException -> L47
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L45 java.lang.RuntimeException -> L47
            java.lang.String r11 = "name='"
            java.lang.String r8 = "'"
            java.lang.String r8 = defpackage.a.bq(r3, r11, r8)     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L45 java.lang.RuntimeException -> L47
            r9 = 0
            r10 = 0
            android.database.Cursor r11 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L42 java.lang.Error -> L45 java.lang.RuntimeException -> L47
            if (r11 == 0) goto L3f
            boolean r3 = r11.moveToFirst()     // Catch: java.lang.Error -> L3b java.lang.RuntimeException -> L3d java.lang.Throwable -> L71
            if (r3 == 0) goto L3f
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch: java.lang.Error -> L3b java.lang.RuntimeException -> L3d java.lang.Throwable -> L71
            java.lang.String r0 = r11.getString(r0)     // Catch: java.lang.Error -> L3b java.lang.RuntimeException -> L3d java.lang.Throwable -> L71
            r4 = r0
            goto L3f
        L3b:
            r0 = move-exception
            goto L4a
        L3d:
            r0 = move-exception
            goto L4a
        L3f:
            if (r11 == 0) goto L6b
            goto L68
        L42:
            r0 = move-exception
            r11 = r0
            goto L73
        L45:
            r0 = move-exception
            goto L48
        L47:
            r0 = move-exception
        L48:
            r11 = r0
            r11 = r4
        L4a:
            java.lang.String r3 = defpackage.zta.b     // Catch: java.lang.Throwable -> L71
            r5 = 3
            boolean r5 = defpackage.zrn.e(r3, r5)     // Catch: java.lang.Throwable -> L71
            if (r5 == 0) goto L66
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L71
            r5.append(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L71
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> L71
        L66:
            if (r11 == 0) goto L6b
        L68:
            r11.close()
        L6b:
            zrr r11 = defpackage.zrr.a
            r11.d(r2)
            return r4
        L71:
            r0 = move-exception
            r4 = r11
        L73:
            if (r4 == 0) goto L78
            r4.close()
        L78:
            zrr r11 = defpackage.zrr.a
            r11.d(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zta.d(android.content.Context):java.lang.String");
    }

    public final PackageInfo a(Context context, String str) {
        zkt.n(context, "context");
        zkt.n(str, "packageName");
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            throw new AssertionError(e);
        }
    }

    public final String b(Context context) throws Throwable {
        zkt.n(context, "context");
        String strD = d(context);
        StringBuilder sb = new StringBuilder();
        if (strD == null || strD.length() == 0) {
            sb.append("Web");
        } else {
            sb.append(strD);
        }
        return sb.toString();
    }

    public final String c(boolean z) {
        String str = String.format("android:%s-%s-%s", Build.MANUFACTURER.replace('-', '_'), Build.DEVICE.replace('-', '_'), Build.MODEL.replace('-', '_'));
        return z ? String.valueOf(str).concat("-wear") : str;
    }
}
