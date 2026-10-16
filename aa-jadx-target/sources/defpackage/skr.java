package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class skr extends defpackage.sks {
    private static volatile java.lang.Boolean f;
    private spx g;
    private static final java.lang.Object e = new java.lang.Object();
    public static final defpackage.skr a = new defpackage.skr();
    public static final int b = defpackage.sks.c;

    public final android.app.PendingIntent a(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult) {
        return connectionResult.b() ? connectionResult.d : super.n(context, connectionResult.c, null);
    }

    public final defpackage.swx b(defpackage.sma smaVar, defpackage.sma... smaVarArr) {
        return c(defpackage.sxb.a, smaVar, smaVarArr);
    }

    public final defpackage.swx c(java.util.concurrent.Executor executor, defpackage.sma smaVar, defpackage.sma... smaVarArr) {
        defpackage.snf snfVar;
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(smaVar);
        arrayList.addAll(java.util.Arrays.asList(smaVarArr));
        synchronized (defpackage.snf.c) {
            defpackage.sqs.aB(defpackage.snf.d, "Must guarantee manager is non-null before using getInstance");
            snfVar = defpackage.snf.d;
        }
        smp smpVar = new smp(arrayList);
        android.os.Handler handler = snfVar.q;
        handler.sendMessage(handler.obtainMessage(2, smpVar));
        defpackage.lhe lheVar = smpVar.c;
        return ((defpackage.swx) lheVar.a).c(executor, new skp(0));
    }

    public final void d(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult, boolean z) {
        java.lang.Integer num = connectionResult.f;
        com.google.android.gms.common.internal.ClientNotificationEvent clientNotificationEvent = new com.google.android.gms.common.internal.ClientNotificationEvent(num == null ? -1 : num.intValue(), context.getPackageName(), java.lang.System.currentTimeMillis(), connectionResult.c, z);
        spx spxVar = this.g;
        if (spxVar == null) {
            spxVar = new spx(context);
            this.g = spxVar;
        }
        spxVar.a(clientNotificationEvent);
    }

    public final void e(android.app.Activity activity, android.app.Dialog dialog, java.lang.String str, android.content.DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof defpackage.bc) {
                defpackage.bt btVarA = ((defpackage.bc) activity).a();
                slk slkVar = new slk();
                defpackage.sqs.aB(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                slkVar.g = dialog;
                if (onCancelListener != null) {
                    slkVar.h = onCancelListener;
                }
                slkVar.e(btVarA, str);
                return;
            }
        } catch (java.lang.NoClassDefFoundError unused) {
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        sko skoVar = new sko();
        defpackage.sqs.aB(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        skoVar.a = dialog;
        if (onCancelListener != null) {
            skoVar.b = onCancelListener;
        }
        skoVar.show(fragmentManager, str);
    }

    public final boolean f(int i) {
        if (i == 9) {
            return true;
        }
        switch (i) {
            case 1:
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
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

    public final android.app.Dialog g(android.content.Context context, int i, soq soqVar, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        android.app.AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new android.app.AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new android.app.AlertDialog.Builder(context);
        }
        builder.setMessage(son.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        java.lang.String strB = son.b(context, i);
        if (strB != null) {
            builder.setPositiveButton((java.lang.CharSequence) strB, (android.content.DialogInterface.OnClickListener) soqVar);
        }
        java.lang.String strD = son.d(context, i);
        if (strD != null) {
            builder.setTitle(strD);
        }
        android.util.Log.w("GoogleApiAvailability", java.lang.String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", java.lang.Integer.valueOf(i)), new java.lang.IllegalArgumentException());
        return builder.create();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void h(android.app.Activity activity, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog dialogG = g(activity, i, new soo(m(activity, i, "d"), activity, i2), onCancelListener);
        if (dialogG == null) {
            return;
        }
        e(activity, dialogG, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void i(android.content.Context context, int i) {
        j(context, new com.google.android.gms.common.ConnectionResult(1, i, super.n(context, i, "n"), null, null));
    }

    public final void j(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult) {
        int i;
        java.lang.String strD;
        boolean z;
        int i2;
        java.lang.Object obj = e;
        synchronized (obj) {
            if (f == null) {
                f = java.lang.Boolean.FALSE;
            }
        }
        int i3 = connectionResult.c;
        f.booleanValue();
        android.util.Log.w("GoogleApiAvailability", java.lang.String.format("GMS core API Availability. ConnectionResult=%s, methodKey=%d, tag=%s", java.lang.Integer.valueOf(i3), connectionResult.f, null), new java.lang.IllegalArgumentException());
        if (i3 == 18) {
            new skq(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        android.app.PendingIntent pendingIntent = connectionResult.d;
        if (pendingIntent == null) {
            if (i3 == 6) {
                android.util.Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i3 == 6) {
            strD = son.f(context, "common_google_play_services_resolution_required_title");
            i = 6;
        } else {
            i = i3;
            strD = son.d(context, i3);
        }
        if (strD == null) {
            strD = context.getResources().getString(2132083581);
        }
        java.lang.String strE = (i == 6 || i == 19) ? son.e(context, "common_google_play_services_resolution_required_text", son.a(context)) : son.c(context, i);
        android.content.res.Resources resources = context.getResources();
        java.lang.Object systemService = context.getSystemService("notification");
        defpackage.sqs.aA(systemService);
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
        defpackage.dte dteVar = new defpackage.dte(context, null);
        dteVar.l();
        dteVar.e(16, true);
        dteVar.i(strD);
        dtd dtdVar = new dtd();
        dtdVar.d(strE);
        dteVar.o(dtdVar);
        boolean zI = defpackage.sqj.i(context);
        int i4 = android.R.drawable.stat_sys_warning;
        if (zI) {
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            dteVar.n(i4);
            dteVar.i = 2;
            if (defpackage.sqj.k(context)) {
                dteVar.f(2131231183, resources.getString(2132083665), pendingIntent);
            } else {
                dteVar.g = pendingIntent;
            }
        } else {
            dteVar.n(android.R.drawable.stat_sys_warning);
            dteVar.y.tickerText = defpackage.dte.c(resources.getString(2132083577));
            dteVar.p(java.lang.System.currentTimeMillis());
            dteVar.g = pendingIntent;
            dteVar.h(strE);
        }
        synchronized (obj) {
        }
        android.app.NotificationChannel notificationChannelM = ep$.ExternalSyntheticApiModelOutline1.m(notificationManager, "com.google.android.gms.availability");
        java.lang.String string = context.getResources().getString(2132083576);
        if (notificationChannelM == null) {
            ep$.ExternalSyntheticApiModelOutline1.m(notificationManager, new android.app.NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(ep$.ExternalSyntheticApiModelOutline1.m(notificationChannelM))) {
            ep$.ExternalSyntheticApiModelOutline1.m(notificationChannelM, string);
            ep$.ExternalSyntheticApiModelOutline1.m(notificationManager, notificationChannelM);
        }
        dteVar.x = "com.google.android.gms.availability";
        android.app.Notification notificationA = dteVar.a();
        if (i == 1 || i == 2 || i == 3 || i == 21) {
            z = false;
            defpackage.sli.c.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
            z = false;
        }
        notificationManager.notify(i2, notificationA);
        d(context, connectionResult, z);
    }
}
