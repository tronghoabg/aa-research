package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.apps.auto.components.telecom.impl.DoNotDisturbCallManagerImpl;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class oeu extends ieq {
    final /* synthetic */ CarCall a;
    final /* synthetic */ xya b;
    final /* synthetic */ DoNotDisturbCallManagerImpl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oeu(DoNotDisturbCallManagerImpl doNotDisturbCallManagerImpl, CarCall carCall, xya xyaVar) {
        super(256, 256);
        this.a = carCall;
        this.b = xyaVar;
        this.d = doNotDisturbCallManagerImpl;
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
        ((ype) DoNotDisturbCallManagerImpl.a.l().ai((char) 5688)).u("onLoadCleared from missed call notification CustomTarget");
    }

    @Override // defpackage.ieq, defpackage.iev
    public final void b(Drawable drawable) {
        ((ype) ((ype) DoNotDisturbCallManagerImpl.a.h()).ai((char) 5689)).u("loading contact photo failed");
        ComponentName componentNameB = mcd.A().b(this.a);
        ohs ohsVarJ = ebf.j();
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL_DND_MANAGER, yzy.Dg);
        rrbVarH.p(componentNameB);
        rrbVarH.u(this.b.a(TimeUnit.MILLISECONDS));
        ohsVarJ.F(rrbVarH.l());
    }

    @Override // defpackage.iev
    public final /* bridge */ /* synthetic */ void c(Object obj, ife ifeVar) {
        Bitmap bitmap = (Bitmap) obj;
        DoNotDisturbCallManagerImpl doNotDisturbCallManagerImpl = this.d;
        Context context = doNotDisturbCallManagerImpl.b;
        NotificationChannel notificationChannel = new NotificationChannel("gearhead_missed_calls", context.getString(R.string.dnd_missed_calls_channel_name), 3);
        notificationChannel.setShowBadge(false);
        notificationChannel.enableLights(true);
        NotificationManager notificationManager = doNotDisturbCallManagerImpl.c;
        notificationManager.createNotificationChannel(notificationChannel);
        yfq yfqVarL = DoNotDisturbCallManagerImpl.l(notificationManager);
        int iOrElse = Collection.EL.stream(yfqVarL).mapToInt(new mim(8)).max().orElse(1);
        String string = context.getString(true != yfqVarL.isEmpty() ? R.string.dnd_missed_calls_plural_title : R.string.dnd_missed_calls_single_title);
        dsx dsxVarK = doNotDisturbCallManagerImpl.k();
        CarCall carCall = this.a;
        dsxVarK.g = doNotDisturbCallManagerImpl.i(carCall);
        dsx dsxVarK2 = doNotDisturbCallManagerImpl.k();
        dsxVarK2.g = doNotDisturbCallManagerImpl.i(carCall);
        dsxVarK.i(string);
        dsxVarK2.i(string);
        dsxVarK.p = true;
        dsxVarK.v = dsxVarK.a();
        notificationManager.notify("gearhead_missed_calls_summary", 1, dsxVarK.a());
        String strP = odn.a().p(context, carCall);
        String strU = odn.a().u(carCall);
        dsx dsxVarK3 = doNotDisturbCallManagerImpl.k();
        dsxVarK3.i(context.getString(R.string.dnd_missed_calls_single_title));
        dsxVarK3.h(strP);
        dsxVarK3.b().putInt("gearhead_missed_calls_tag_id", iOrElse);
        dsxVarK3.g = doNotDisturbCallManagerImpl.h(iOrElse, carCall);
        dsx dsxVarK4 = doNotDisturbCallManagerImpl.k();
        dsxVarK4.g = doNotDisturbCallManagerImpl.h(iOrElse, carCall);
        dsxVarK3.v = dsxVarK4.a();
        dsxVarK3.k(bitmap);
        if (!TextUtils.isEmpty(strU)) {
            dsxVarK3.g(doNotDisturbCallManagerImpl.j(R.string.dnd_missed_calls_call_back, "gearhead_missed_calls_callback_action", Uri.parse("tel:".concat(String.valueOf(strU))), iOrElse, carCall));
            dsxVarK3.g(doNotDisturbCallManagerImpl.j(R.string.dnd_missed_calls_message, "gearhead_missed_calls_message_action", Uri.parse("sms:".concat(String.valueOf(strU))), iOrElse, carCall));
        }
        notificationManager.notify(String.valueOf(iOrElse), 1, dsxVarK3.a());
        DoNotDisturbCallManagerImpl.m(yzy.Dl, mcd.A().b(carCall));
        ((ype) ((ype) DoNotDisturbCallManagerImpl.a.f()).ai((char) 5696)).u("missed call notification posted");
    }
}
