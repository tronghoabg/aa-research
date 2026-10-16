package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class dup {
    public static int c(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new dug(context).c() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static ColorStateList d(Context context, int i) {
        return dvb.b(context.getResources(), i, context.getTheme());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (defpackage.dln.o(r6, r10, r0, r1, r2) == 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent e(android.content.Context r6, android.content.BroadcastReceiver r7, android.content.IntentFilter r8, android.os.Handler r9, int r10) {
        /*
            r0 = r10 & 1
            if (r0 == 0) goto L11
            r1 = r10 & 4
            if (r1 != 0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED"
            r6.<init>(r7)
            throw r6
        L11:
            if (r0 == 0) goto L15
            r10 = r10 | 2
        L15:
            r5 = r10
            r10 = r5 & 4
            r0 = r5 & 2
            if (r0 != 0) goto L27
            if (r10 == 0) goto L1f
            goto L29
        L1f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required"
            r6.<init>(r7)
            throw r6
        L27:
            if (r10 != 0) goto La3
        L29:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L99
            if (r10 == 0) goto L8d
            android.content.Context r10 = r6.getApplicationContext()
            java.lang.String r10 = r10.getPackageName()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r3 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            java.lang.String r10 = r10.concat(r3)
            int r0 = defpackage.dln.o(r6, r10, r0, r1, r2)
            if (r0 == 0) goto L88
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L7a
            java.lang.String r10 = defpackage.alc$$ExternalSyntheticApiModelOutline0.m(r6)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r10 = r10.concat(r3)
            int r0 = defpackage.dln.o(r6, r10, r0, r1, r2)
            if (r0 != 0) goto L7a
            goto L88
        L7a:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Permission "
            java.lang.String r8 = " is required by your application to receive broadcasts, please add it to your manifest"
            java.lang.String r7 = defpackage.a.bq(r10, r7, r8)
            r6.<init>(r7)
            throw r6
        L88:
            android.content.Intent r6 = r6.registerReceiver(r7, r8, r10, r9)
            return r6
        L8d:
            r3 = 0
            r5 = r5 & 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            android.content.Intent r6 = defpackage.ep$$ExternalSyntheticApiModelOutline1.m(r0, r1, r2, r3, r4, r5)
            return r6
        L99:
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r3 = 0
            android.content.Intent r6 = defpackage.ep$$ExternalSyntheticApiModelOutline1.m(r0, r1, r2, r3, r4, r5)
            return r6
        La3:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dup.e(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, android.os.Handler, int):android.content.Intent");
    }
}
