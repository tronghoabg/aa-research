package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class y {
    static void a(final Context context, s sVar, final boolean z) {
        SharedPreferences sharedPreferencesS = s(context);
        if (sharedPreferencesS.contains("proxy_retention") && sharedPreferencesS.getBoolean("proxy_retention", false) == z) {
            return;
        }
        sVar.c(z).q(new com.google.android.gms.f.v(8), new com.google.android.gms.o.o() { // from class: com.google.firebase.messaging.x
            @Override // com.google.android.gms.o.o
            public final void onSuccess(Object obj) {
                y.b(context, z);
            }
        });
    }

    static void b(Context context, boolean z) {
        SharedPreferences.Editor editorEdit = s(context).edit();
        editorEdit.putBoolean("proxy_retention", z);
        editorEdit.apply();
    }

    static boolean c(Context context) {
        return s(context).getBoolean("proxy_notification_initialized", false);
    }

    static void d(Context context) {
        SharedPreferences.Editor editorEdit = s(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", true);
        editorEdit.apply();
    }

    static void e(Context context) {
        ApplicationInfo applicationInfo;
        if (c(context)) {
            return;
        }
        com.google.android.gms.f.v vVar = new com.google.android.gms.f.v(7);
        boolean z = true;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        vVar.execute(new w(context, z, new com.google.android.gms.o.w(), 0));
    }

    static /* synthetic */ void f(Context context, boolean z, com.google.android.gms.o.w wVar) {
        try {
            if (t(context)) {
                d(context);
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
            }
        } finally {
            wVar.e(null);
        }
    }

    static boolean g(Context context) {
        if (!t(context)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package ".concat(String.valueOf(context.getPackageName())));
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "GMS core is set for proxying");
        return true;
    }

    static String h(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    static String i(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String j(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    static String k(Bundle bundle) {
        String string = bundle.getString(TypedValues.TransitionType.S_FROM);
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static void l(Intent intent) {
        n("_nd", intent.getExtras());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y.m(android.content.Intent):void");
    }

    static void n(String str, Bundle bundle) {
        try {
            com.google.firebase.e.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String strH = h(bundle);
            if (strH != null) {
                bundle2.putString("_nmn", strH);
            }
            String strJ = j(bundle);
            if (!TextUtils.isEmpty(strJ)) {
                bundle2.putString("label", strJ);
            }
            String string2 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string2)) {
                bundle2.putString("message_channel", string2);
            }
            String strK = k(bundle);
            if (strK != null) {
                bundle2.putString("_nt", strK);
            }
            String string3 = bundle.getString("google.c.a.ts");
            if (string3 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string3));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String string4 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string4 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string4));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String str2 = true != v.i(bundle) ? "data" : "display";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2.toString());
            }
            com.google.firebase.a.a.c cVar = (com.google.firebase.a.a.c) com.google.firebase.e.b().f(com.google.firebase.a.a.c.class);
            if (cVar != null) {
                cVar.e();
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    static boolean o() {
        ApplicationInfo applicationInfo;
        try {
            com.google.firebase.e.b();
            Context contextA = com.google.firebase.e.b().a();
            SharedPreferences sharedPreferences = contextA.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = contextA.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static boolean p(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return q(intent.getExtras());
    }

    public static boolean q(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString("google.c.a.e"));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final boolean r(java.util.concurrent.ExecutorService r11, android.content.Context r12, com.google.firebase.messaging.v r13) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y.r(java.util.concurrent.ExecutorService, android.content.Context, com.google.firebase.messaging.v):boolean");
    }

    private static SharedPreferences s(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    private static boolean t(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    private static boolean u(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    private static final void v(NotificationCompat.Builder builder, t tVar) {
        if (tVar == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) com.google.android.gms.o.ag.g(tVar.a(), 5L, TimeUnit.SECONDS);
            builder.setLargeIcon(bitmap);
            NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
            bigPictureStyle.bigPicture(bitmap);
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            builder.setStyle(bigPictureStyle);
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            tVar.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(String.valueOf(e2.getCause()))));
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            tVar.close();
        }
    }
}
