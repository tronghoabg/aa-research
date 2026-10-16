package com.google.android.gms.common;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.support.v4.app.av;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.ak;
import com.google.android.gms.common.api.internal.ao;
import com.google.android.gms.common.api.internal.bm;
import com.google.android.gms.common.api.internal.bn;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h extends i {

    /* renamed from: c, reason: collision with root package name */
    private static volatile Boolean f4946c;

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.gms.common.internal.b.g f4948e;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f4945b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final h f4947d = new h();

    public static h b() {
        return f4947d;
    }

    static final Dialog f(Context context, int i2, com.google.android.gms.common.internal.y yVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.s.b(context, i2));
        builder.setOnCancelListener(onCancelListener);
        Resources resources = context.getResources();
        String string = i2 != 1 ? i2 != 2 ? i2 != 3 ? resources.getString(R.string.ok) : resources.getString(com.waze.R.string.common_google_play_services_enable_button) : resources.getString(com.waze.R.string.common_google_play_services_update_button) : resources.getString(com.waze.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, yVar);
        }
        String strE = com.google.android.gms.common.internal.s.e(context, i2);
        if (strE != null) {
            builder.setTitle(strE);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i2)), new IllegalArgumentException());
        return builder.create();
    }

    static final void h(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof av) {
                ai.a(dialog, onCancelListener).show(((av) activity).bv(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        e.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final Dialog a(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.s.b(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        h(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final void c(Context context, d dVar, boolean z) {
        Integer numC = dVar.c();
        com.google.android.gms.common.internal.n nVar = new com.google.android.gms.common.internal.n(numC == null ? -1 : numC.intValue(), context.getPackageName(), System.currentTimeMillis(), dVar.a(), z);
        com.google.android.gms.common.internal.b.g gVar = this.f4948e;
        if (gVar == null) {
            gVar = new com.google.android.gms.common.internal.b.g(context);
            this.f4948e = gVar;
        }
        bm bmVarB = bn.b();
        bmVarB.e(com.google.android.gms.e.a.f5203b);
        bmVarB.d();
        bmVarB.c(new com.google.android.gms.auth.a.b.a.c(nVar, 4));
        gVar.n(bmVarB.b());
    }

    public final boolean d(int i2) {
        if (i2 == 9) {
            return true;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i2) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean e(Context context, d dVar, int i2) throws Resources.NotFoundException {
        if (com.google.android.gms.common.util.g.d(context)) {
            return false;
        }
        PendingIntent pendingIntentB = dVar.f() ? dVar.b() : p(context, dVar.a(), null);
        if (pendingIntentB == null) {
            return false;
        }
        k(context, new d(dVar.a(), com.google.android.gms.k.d.a.a(context, GoogleApiActivity.a(context, pendingIntentB, i2, true), com.google.android.gms.k.d.a.f5570a | 134217728), dVar.d(), dVar.c()));
        return true;
    }

    public final void g(Context context, com.google.android.gms.common.api.internal.aj ajVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        ak akVar = new ak(ajVar);
        ContextCompat.registerReceiver(context, akVar, intentFilter, 2);
        akVar.a(context);
        if (ag.d(context)) {
            return;
        }
        ajVar.a();
        akVar.b();
    }

    public final void i(Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogF = f(activity, i2, com.google.android.gms.common.internal.y.b(activity, n(activity, i2, "d")), onCancelListener);
        if (dialogF == null) {
            return;
        }
        h(activity, dialogF, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void j(Activity activity, ao aoVar, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogF = f(activity, i2, com.google.android.gms.common.internal.y.c(aoVar, n(activity, i2, "d")), onCancelListener);
        if (dialogF == null) {
            return;
        }
        h(activity, dialogF, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    final void k(Context context, d dVar) throws Resources.NotFoundException {
        int i2;
        int iA = dVar.a();
        Object obj = f4945b;
        synchronized (obj) {
            if (f4946c == null) {
                f4946c = false;
            }
        }
        f4946c.booleanValue();
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, methodKey=%d, tag=%s", Integer.valueOf(dVar.a()), dVar.c(), null), new IllegalArgumentException());
        if (iA == 18) {
            new g(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        PendingIntent pendingIntentB = dVar.b();
        if (pendingIntentB == null) {
            if (iA == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strD = com.google.android.gms.common.internal.s.d(context, iA);
        String strC = com.google.android.gms.common.internal.s.c(context, iA);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        com.google.android.gms.common.api.internal.av.m(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setLocalOnly(true);
        builder.setAutoCancel(true);
        builder.setContentTitle(strD);
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.bigText(strC);
        builder.setStyle(bigTextStyle);
        boolean zD = com.google.android.gms.common.util.b.d(context);
        int i3 = R.drawable.stat_sys_warning;
        if (zD) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            builder.setSmallIcon(i3);
            builder.setPriority(2);
            if (com.google.android.gms.common.util.b.f(context)) {
                builder.addAction(com.waze.R.drawable.common_full_open_on_phone, resources.getString(com.waze.R.string.common_open_on_phone), pendingIntentB);
            } else {
                builder.setContentIntent(pendingIntentB);
            }
        } else {
            builder.setSmallIcon(R.drawable.stat_sys_warning);
            builder.setTicker(resources.getString(com.waze.R.string.common_google_play_services_notification_ticker));
            builder.setWhen(System.currentTimeMillis());
            builder.setContentIntent(pendingIntentB);
            builder.setContentText(strC);
        }
        com.google.android.gms.common.api.internal.av.i(true);
        synchronized (obj) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.waze.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        builder.setChannelId("com.google.android.gms.availability");
        Notification notificationBuild = builder.build();
        if (iA == 1 || iA == 2 || iA == 3) {
            ag.f4673c.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationBuild);
        c(context, dVar, false);
    }
}
