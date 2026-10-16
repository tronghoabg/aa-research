package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.projection.gearhead.R;
import j$.util.Optional;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class mbm {
    public final Object a;
    public final Object b;

    public mbm(aezk aezkVar, aezk aezkVar2) {
        this.a = (SharedPreferences) aezkVar.a();
        this.b = aezkVar2 == null ? null : aezkVar2.a();
    }

    public static mbm b() {
        return (mbm) mki.a.i(mbm.class);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public static void c(PrintWriter printWriter, aezk aezkVar) {
        String strConcat;
        mbm mbmVar = new mbm(aezkVar, (aezk) null);
        printWriter.printf("Connectivity event logger history\n", new Object[0]);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        int i = 5;
        for (Map.Entry entry : xxx.d(",").b().f().j("/").k(mbmVar.a.getString("drive_session_info_key", "")).entrySet()) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            try {
                strConcat = simpleDateFormat.format(Long.valueOf((String) entry.getValue()));
            } catch (NumberFormatException unused) {
                strConcat = "unknown - ".concat(String.valueOf((String) entry.getValue()));
            }
            printWriter.printf("%s: %s\n", strConcat, entry.getKey());
            i = i2;
        }
        printWriter.println();
    }

    public static final String f(ojn ojnVar) {
        return ojnVar.c.name();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ComponentName a() {
        return new ComponentName((Context) this.b, (Class<?>) ((yfq) this.a).get(0));
    }

    public final boolean d() {
        return ((qcn) this.b).a((Context) this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v0, types: [dsx, java.lang.Object] */
    public final void e(ojn ojnVar) {
        ?? B = ojnVar.n().f() ? ojnVar.n().b() : ((Context) this.b).getString(R.string.troubleshooter_notification_call_to_action);
        String strO = ojnVar.o();
        Context context = (Context) this.b;
        ?? dsxVar = new dsx(context, strO);
        dsxVar.l();
        dsxVar.r = "status";
        dsxVar.n(R.drawable.gs_android_auto_vd_24);
        dsxVar.t = context.getColor(R.color.notification_blue);
        dsxVar.u = ojnVar.h();
        dsxVar.i = ojnVar.g();
        dsxVar.i(ojnVar.b());
        dsxVar.h(B);
        Optional optionalOf = ojnVar.i().f() ? Optional.of(PendingIntent.getActivity(context, 0, (Intent) ojnVar.i().b(), 201326592)) : Optional.ofNullable(wdu.b(context, 0, new Intent().setClassName(context, "com.google.android.apps.auto.components.settings.troubleshooter.TroubleshooterActivity").setFlags(335544320), 201326592));
        mla mlaVar = new mla(dsxVar, 5);
        if (true == optionalOf.isPresent()) {
            ((dsx) mlaVar.a).g = (PendingIntent) optionalOf.get();
        }
        if (ojnVar.f() == 4) {
            dsxVar.m(1, 0, true);
        }
        ((NotificationManager) this.a).notify(f(ojnVar), 24, dsxVar.a());
        if (ojnVar.l().f()) {
            ols.M(context, (yxi) ojnVar.l().b());
        } else {
            ols.O(context, yxi.TROUBLESHOOTER_ISSUE_NOTIFIED, ojnVar.c);
        }
    }

    public mbm(Context context, yfq yfqVar) {
        this.b = context;
        this.a = yfqVar;
    }

    public mbm(Context context) {
        this.b = context;
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        this.a = (NotificationManager) systemService;
    }

    public mbm(Context context, qcn qcnVar) {
        if (context == null || qcnVar == null) {
            throw null;
        }
        this.a = context;
        this.b = qcnVar;
    }
}
