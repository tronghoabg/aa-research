package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.BugreportManager$BugreportCallback;
import com.google.android.apps.auto.components.bugreport.BugreportProjectionNotificationReceiver;
import com.google.android.apps.auto.components.bugreport.BugreportRequester;
import com.google.android.projection.gearhead.R;
import j$.time.Instant;

/* loaded from: classes2.dex */
public final class kgd extends BugreportManager$BugreportCallback {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ Instant e;
    final /* synthetic */ String f;
    final /* synthetic */ BugreportRequester g;
    private final dsx h;
    private boolean i;

    public kgd(BugreportRequester bugreportRequester, Context context, String str, String str2, int i, Instant instant, String str3) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = instant;
        this.f = str3;
        this.g = bugreportRequester;
        mas.c();
        dsx dsxVar = new dsx(context, "gearhead_surveys_and_feedback");
        dsxVar.n(R.drawable.gs_android_auto_vd_24);
        dsxVar.l();
        dsxVar.e(2, true);
        dsxVar.i(str == null ? str2 : str);
        dsxVar.h(context.getString(R.string.bugreport_notification_generating_description));
        this.h = dsxVar;
        this.i = true;
    }

    public final void onError(int i) {
        ((ype) ((ype) BugreportRequester.a.h()).ai((char) 3010)).w("Bug report creation failed with error code %d", i);
        this.g.h.set(false);
    }

    public final void onFinished(String str) {
        ((ype) ((ype) BugreportRequester.a.f()).ai((char) 3011)).y("Bug report %s finished being written", str);
        Context context = this.a;
        dug dugVar = new dug(context);
        int i = this.d;
        dugVar.a(null, i);
        context.stopService(new Intent(context, (Class<?>) BugreportRequester.BugreportProgressService.class));
        Intent intent = new Intent(context, (Class<?>) BugreportRequester.RetrieveBugreportReceiver.class);
        String str2 = this.c;
        Intent intentPutExtra = intent.putExtra("android.intent.extra.SUBJECT", str2).putExtra("EXTRA_BUGREPORT_SRC_FILE", str);
        Instant instant = this.e;
        Intent intentPutExtra2 = intentPutExtra.putExtra("EXTRA_BUGREPORT_DST_FILE", kgi.d(instant)).putExtra("EXTRA_HAPPENED_TIME", instant.toEpochMilli());
        mas.c();
        dsx dsxVar = new dsx(context, "gearhead_surveys_and_feedback");
        dsxVar.n(R.drawable.gs_android_auto_vd_24);
        dsxVar.l();
        String str3 = this.b;
        dsxVar.i(str3 != null ? str3 : str2);
        String str4 = this.f;
        dsxVar.h(str4);
        dsxVar.g = wdu.c(context, i, intentPutExtra2, 1140850688);
        dsxVar.e(16, true);
        new dug(context).b(null, i, dsxVar.a());
        this.g.h.set(false);
        context.sendBroadcast(new Intent(context, (Class<?>) BugreportProjectionNotificationReceiver.class).setAction("START_NOTIFICATION").putExtra("android.intent.extra.SUBJECT", str2).putExtra("TRUNCATED_SUBJECT", str3).putExtra("DESCRIPTION", str4).putExtra("EXTRA_HAPPENED_TIME", instant.toEpochMilli()).putExtra("EXTRA_NOTIFICATION_ID", i).putExtra("EXTRA_BUGREPORT_SRC_FILE", str).putExtra("EXTRA_BUGREPORT_DST_FILE", kgi.d(instant)));
    }

    public final void onProgress(float f) {
        boolean z = this.i;
        Context context = this.a;
        if (!z) {
            dug dugVar = new dug(context);
            int i = this.d;
            dsx dsxVar = this.h;
            dsxVar.m(100, (int) f, false);
            dugVar.b(null, i, dsxVar.a());
            return;
        }
        Intent intent = new Intent(context, (Class<?>) BugreportRequester.BugreportProgressService.class);
        String str = this.b;
        if (str == null) {
            str = this.c;
        }
        context.startForegroundService(intent.putExtra("EXTRA_NOTIFICATION_TITLE", str).putExtra("EXTRA_NOTIFICATION_ID", this.d));
        this.i = false;
    }
}
