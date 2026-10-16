package com.google.android.gms.common.internal;

import android.net.Uri;

/* loaded from: classes3.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f26605a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent a(android.content.Context r5, com.google.android.gms.common.internal.U r6) {
        /*
            java.lang.String r0 = "ServiceBindIntentUtils"
            java.lang.String r1 = r6.f26618a
            if (r1 != 0) goto L12
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.ComponentName r6 = r6.f26620c
            android.content.Intent r5 = r5.setComponent(r6)
            return r5
        L12:
            boolean r2 = r6.f26621d
            r3 = 0
            if (r2 == 0) goto La3
            java.lang.String r2 = "serviceActionBundleKey"
            android.os.Bundle r2 = ka.AbstractC3256n.b(r2, r1)
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            android.net.Uri r4 = com.google.android.gms.common.internal.M.f26605a     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            android.content.ContentProviderClient r5 = r5.acquireUnstableContentProviderClient(r4)     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            if (r5 == 0) goto L3c
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r2 = r5.call(r4, r3, r2)     // Catch: java.lang.Throwable -> L37
            r5.release()     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            goto L52
        L33:
            r5 = move-exception
            goto L44
        L35:
            r5 = move-exception
            goto L44
        L37:
            r2 = move-exception
            r5.release()     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            throw r2     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
        L3c:
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            java.lang.String r2 = "Failed to acquire ContentProviderClient"
            r5.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
            throw r5     // Catch: java.lang.IllegalArgumentException -> L33 android.os.RemoteException -> L35
        L44:
            java.lang.String r2 = "Dynamic intent resolution failed: "
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r2.concat(r5)
            android.util.Log.w(r0, r5)
            r2 = r3
        L52:
            if (r2 != 0) goto L55
            goto L6b
        L55:
            java.lang.String r5 = "serviceResponseIntentKey"
            android.os.Parcelable r5 = r2.getParcelable(r5)
            android.content.Intent r5 = (android.content.Intent) r5
            if (r5 == 0) goto L61
            r3 = r5
            goto L6b
        L61:
            java.lang.String r5 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r5 = r2.getParcelable(r5)
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
            if (r5 != 0) goto L77
        L6b:
            if (r3 != 0) goto La3
            java.lang.String r5 = "Dynamic lookup for intent failed for action: "
            java.lang.String r5 = r5.concat(r1)
            android.util.Log.w(r0, r5)
            goto La3
        L77:
            int r6 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r6 = r6 + 72
            r2.<init>(r6)
            java.lang.String r6 = "Dynamic lookup for intent failed for action "
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = " but has possible resolution"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            android.util.Log.w(r0, r6)
            com.google.android.gms.common.internal.L r6 = new com.google.android.gms.common.internal.L
            d7.b r0 = new d7.b
            r1 = 25
            r0.<init>(r1, r3, r5)
            r6.<init>(r0)
            throw r6
        La3:
            if (r3 != 0) goto Lb1
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r1)
            java.lang.String r6 = r6.f26619b
            android.content.Intent r5 = r5.setPackage(r6)
            return r5
        Lb1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.M.a(android.content.Context, com.google.android.gms.common.internal.U):android.content.Intent");
    }
}
