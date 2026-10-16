package d7;

import A7.AbstractC0279p0;
import X0.C1283k;
import X0.C1287o;
import X0.C1289q;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.C1409a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e0;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC1700n;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.B;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.ads.AbstractC1749m;
import com.unity3d.services.UnityAdsConstants;
import ka.AbstractC3256n;
import n7.AbstractC3598c;

/* loaded from: classes3.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f34126c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f34127d = new e();

    public static AlertDialog f(Activity activity, int i5, C c10, DialogInterface.OnCancelListener onCancelListener) {
        if (i5 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(B.b(activity, i5));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i5 != 1 ? i5 != 2 ? i5 != 3 ? resources.getString(R.string.ok) : resources.getString(com.wynauto.wyn.R.string.common_google_play_services_enable_button) : resources.getString(com.wynauto.wyn.R.string.common_google_play_services_update_button) : resources.getString(com.wynauto.wyn.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, c10);
        }
        String strC = B.c(activity, i5);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", AbstractC3256n.g(i5, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                e0 supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                k kVar = new k();
                AbstractC1732v.j(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                kVar.f34139o = alertDialog;
                if (onCancelListener != null) {
                    kVar.f34140p = onCancelListener;
                }
                kVar.f18545l = false;
                kVar.f18546m = true;
                supportFragmentManager.getClass();
                C1409a c1409a = new C1409a(supportFragmentManager);
                c1409a.f18364p = true;
                c1409a.e(0, kVar, str, 1);
                c1409a.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        AbstractC1732v.j(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f34119a = alertDialog;
        if (onCancelListener != null) {
            cVar.f34120b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    @Override // d7.f
    public final int c(Context context) {
        return d(context, f.f34128a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i5, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogF = f(googleApiActivity, i5, new C(super.b(googleApiActivity, i5, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogF == null) {
            return;
        }
        g(googleApiActivity, alertDialogF, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void h(Context context, int i5, PendingIntent pendingIntent) {
        C1289q c1289q;
        int i10;
        Log.w("GoogleApiAvailability", AbstractC0279p0.i(i5, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i5 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            return;
        }
        if (pendingIntent == null) {
            if (i5 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i5 == 6 ? B.e(context, "common_google_play_services_resolution_required_title") : B.c(context, i5);
        if (strE == null) {
            strE = context.getResources().getString(com.wynauto.wyn.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i5 == 6 || i5 == 19) ? B.d(context, "common_google_play_services_resolution_required_text", B.a(context)) : B.b(context, i5);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC1732v.i(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C1289q c1289q2 = new C1289q(context, null);
        c1289q2.f15893u = true;
        c1289q2.c(16, true);
        c1289q2.f15878e = C1289q.b(strE);
        C1287o c1287o = new C1287o(0);
        c1287o.f15864f = C1289q.b(strD);
        c1289q2.f(c1287o);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC3598c.f40924c == null) {
            AbstractC3598c.f40924c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC3598c.f40924c.booleanValue()) {
            c1289q2.f15871G.icon = context.getApplicationInfo().icon;
            c1289q2.k = 2;
            if (AbstractC3598c.l(context)) {
                c1289q = c1289q2;
                c1289q2.f15875b.add(new C1283k(IconCompat.g(null, "", 2131230920), resources.getString(com.wynauto.wyn.R.string.common_open_on_phone), pendingIntent, new Bundle(), null, null, true, 0, true, false));
            } else {
                c1289q = c1289q2;
                c1289q.f15880g = pendingIntent;
            }
        } else {
            c1289q = c1289q2;
            c1289q.f15871G.icon = R.drawable.stat_sys_warning;
            c1289q.f15871G.tickerText = C1289q.b(resources.getString(com.wynauto.wyn.R.string.common_google_play_services_notification_ticker));
            c1289q.f15871G.when = System.currentTimeMillis();
            c1289q.f15880g = pendingIntent;
            c1289q.f15879f = C1289q.b(strD);
        }
        if (AbstractC3598c.h()) {
            AbstractC1732v.l(AbstractC3598c.h());
            synchronized (f34126c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.wynauto.wyn.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(AbstractC1749m.b(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            c1289q.f15866B = "com.google.android.gms.availability";
        }
        Notification notificationA = c1289q.a();
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            i.f34131a.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, notificationA);
    }

    public final void i(Activity activity, InterfaceC1700n interfaceC1700n, int i5, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogF = f(activity, i5, new C(super.b(activity, i5, "d"), interfaceC1700n, 1), onCancelListener);
        if (alertDialogF == null) {
            return;
        }
        g(activity, alertDialogF, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
