package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ClientNotificationEvent;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class sjv extends sjw {
    private static volatile Boolean f;
    private spc g;
    private static final Object e = new Object();
    public static final sjv a = new sjv();
    public static final int b = sjw.c;

    public final PendingIntent a(Context context, ConnectionResult connectionResult) {
        return connectionResult.b() ? connectionResult.d : super.n(context, connectionResult.c, null);
    }

    public final svz b(sle sleVar, sle... sleVarArr) {
        return c(swd.a, sleVar, sleVarArr);
    }

    public final svz c(Executor executor, sle sleVar, sle... sleVarArr) {
        smi smiVar;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(sleVar);
        arrayList.addAll(Arrays.asList(sleVarArr));
        synchronized (smi.c) {
            spu.ax(smi.d, "Must guarantee manager is non-null before using getInstance");
            smiVar = smi.d;
        }
        wkm wkmVar = new wkm(arrayList);
        Handler handler = smiVar.o;
        handler.sendMessage(handler.obtainMessage(2, wkmVar));
        Object obj = wkmVar.e;
        return ((svz) ((nok) obj).a).c(executor, new sjt(0));
    }

    public final void d(Context context, ConnectionResult connectionResult, boolean z) {
        Integer num = connectionResult.f;
        ClientNotificationEvent clientNotificationEvent = new ClientNotificationEvent(num == null ? -1 : num.intValue(), context.getPackageName(), System.currentTimeMillis(), connectionResult.c, z);
        spc spcVar = this.g;
        if (spcVar == null) {
            spcVar = new spc(context);
            this.g = spcVar;
        }
        spcVar.a(clientNotificationEvent);
    }

    public final void e(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof bc) {
                bt btVarA = ((bc) activity).a();
                sko skoVar = new sko();
                spu.ax(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                skoVar.g = dialog;
                if (onCancelListener != null) {
                    skoVar.h = onCancelListener;
                }
                skoVar.e(btVarA, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        sjs sjsVar = new sjs();
        spu.ax(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        sjsVar.a = dialog;
        if (onCancelListener != null) {
            sjsVar.b = onCancelListener;
        }
        sjsVar.show(fragmentManager, str);
    }

    public final boolean f(int i) {
        if (i == 9) {
            return true;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final Dialog g(Context context, int i, snv snvVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(sns.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = sns.b(context, i);
        if (strB != null) {
            builder.setPositiveButton(strB, snvVar);
        }
        String strD = sns.d(context, i);
        if (strD != null) {
            builder.setTitle(strD);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    @ResultIgnorabilityUnspecified
    public final void h(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogG = g(activity, i, new snt(m(activity, i, "d"), activity, i2), onCancelListener);
        if (dialogG == null) {
            return;
        }
        e(activity, dialogG, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void i(Context context, int i) {
        j(context, new ConnectionResult(1, i, super.n(context, i, "n"), null, null));
    }

    public final void j(Context context, ConnectionResult connectionResult) {
        int i;
        String strD;
        int i2;
        Object obj = e;
        synchronized (obj) {
            if (f == null) {
                f = false;
            }
        }
        int i3 = connectionResult.c;
        f.booleanValue();
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, methodKey=%d, tag=%s", Integer.valueOf(i3), connectionResult.f, null), new IllegalArgumentException());
        if (i3 == 18) {
            new sju(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        PendingIntent pendingIntent = connectionResult.d;
        if (pendingIntent == null) {
            if (i3 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i3 == 6) {
            strD = sns.f(context, "common_google_play_services_resolution_required_title");
            i = 6;
        } else {
            i = i3;
            strD = sns.d(context, i3);
        }
        if (strD == null) {
            strD = context.getResources().getString(com.google.android.projection.gearhead.R.string.common_google_play_services_try_again_title);
        }
        String strE = (i == 6 || i == 19) ? sns.e(context, "common_google_play_services_resolution_required_text", sns.a(context)) : sns.c(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        spu.aw(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        dsx dsxVar = new dsx(context, null);
        dsxVar.l();
        dsxVar.e(16, true);
        dsxVar.i(strD);
        dsw dswVar = new dsw();
        dswVar.d(strE);
        dsxVar.o(dswVar);
        boolean zI = spl.i(context);
        int i4 = R.drawable.stat_sys_warning;
        if (zI) {
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            dsxVar.n(i4);
            dsxVar.i = 2;
            if (spl.k(context)) {
                dsxVar.f(2131231183, resources.getString(com.google.android.projection.gearhead.R.string.common_open_on_phone), pendingIntent);
            } else {
                dsxVar.g = pendingIntent;
            }
        } else {
            dsxVar.n(R.drawable.stat_sys_warning);
            dsxVar.y.tickerText = dsx.c(resources.getString(com.google.android.projection.gearhead.R.string.common_google_play_services_notification_ticker));
            dsxVar.p(System.currentTimeMillis());
            dsxVar.g = pendingIntent;
            dsxVar.h(strE);
        }
        synchronized (obj) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.google.android.projection.gearhead.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        dsxVar.x = "com.google.android.gms.availability";
        Notification notificationA = dsxVar.a();
        if (i == 1 || i == 2 || i == 3 || i == 21) {
            skm.c.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationA);
        d(context, connectionResult, false);
    }
}
