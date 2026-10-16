package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.auto.carservice.car.activity.virtualdevice.CarVirtualDeviceActivity;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class jfz implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jfz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                yyq yyqVar = (yyq) obj;
                abnp abnpVar = (abnp) this.a;
                abnpVar.t();
                yzi yziVar = (yzi) abnpVar.b;
                yzi yziVar2 = yzi.a;
                yyqVar.getClass();
                yziVar.u = yyqVar;
                yziVar.b |= 262144;
                return;
            case 1:
                yyq yyqVar2 = (yyq) obj;
                abnp abnpVar2 = (abnp) this.a;
                abnpVar2.t();
                yzi yziVar3 = (yzi) abnpVar2.b;
                yzi yziVar4 = yzi.a;
                yyqVar2.getClass();
                yziVar3.t = yyqVar2;
                yziVar3.b |= 131072;
                return;
            case 2:
                jmi jmiVarF = ((jmj) ((xyc) obj).gu()).f(dlz.D());
                ((ype) jou.a.l().ai((char) 2526)).y("Virtual device obtained: %s", jmiVarF);
                jou jouVar = (jou) this.a;
                ipp ippVar = jouVar.k;
                ippVar.getClass();
                if (ippVar.e != null) {
                    ((ype) ((ype) ipp.a.f()).ai((char) 1001)).u("Already started");
                } else {
                    wsj wsjVar = (wsj) ippVar.c.apply(jmiVarF);
                    wsjVar.getClass();
                    ippVar.e = wsjVar;
                    Context context = ippVar.b;
                    Intent intent = new Intent(context, (Class<?>) CarVirtualDeviceActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putBinder("extra_car_analytics_binder", new ipo(ippVar.d));
                    intent.putExtra("extra_car_analytics_binder_bundle", bundle);
                    ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                    activityOptionsMakeBasic.setLaunchDisplayId(wsjVar.h().getDisplayId());
                    intent.addFlags(276856832);
                    context.startActivity(intent, activityOptionsMakeBasic.toBundle());
                    ((ype) ipp.a.l().ai((char) 1000)).w("Activity started on display: %d", wsjVar.h().getDisplayId());
                }
                jouVar.c.O.e(yzz.CAR_SERVICE, yzy.MR);
                return;
            case 3:
                ((ket) this.a).a((mqc) obj);
                return;
            case 4:
                ((lbk) this.a).h = (Uri) obj;
                return;
            case 5:
                ((lbk) this.a).i = (File) obj;
                return;
            case 6:
                ((kon) this.a).e = (Handler) obj;
                return;
            case 7:
                Object obj2 = this.a;
                qsz qszVar = (qsz) obj;
                synchronized (((kpz) obj2).h) {
                    qszVar.g();
                    ((kpz) obj2).i = Optional.empty();
                }
                return;
            case 8:
                Object obj3 = this.a;
                ((kqb) obj3).a.e(new kpq(new kqa(obj3, (yfq) obj, 0)));
                return;
            case 9:
                ((kqf) this.a).b((Optional) obj);
                return;
            case 10:
                yxi yxiVar = (yxi) obj;
                Context context2 = (Context) this.a;
                if (Objects.equals(new ldp(context2, jri.a, "car").b(), true)) {
                    return;
                }
                ols.M(context2, yxiVar);
                return;
            case 11:
                ((Bundle) this.a).putInt("DIRECT_QUERY_TRIGGER_ID", ((osv) obj).C);
                return;
            case 12:
                ((mbn) this.a).a = (StatusBarNotification) obj;
                return;
            case 13:
                ((mbn) this.a).b = ((Boolean) obj).booleanValue();
                return;
            case 14:
                ((mbn) this.a).c = ((Boolean) obj).booleanValue();
                return;
            case 15:
                ((mbn) this.a).d = ((Boolean) obj).booleanValue();
                return;
            case 16:
                ((mbn) this.a).e = ((Boolean) obj).booleanValue();
                return;
            case 17:
                ((kmu) this.a).f("android.media.metadata.ALBUM_ART", (Bitmap) obj);
                return;
            case 18:
                ((kmu) this.a).h("android.media.metadata.ALBUM_ART_URI", ((Uri) obj).toString());
                return;
            case 19:
                ((kmu) this.a).g("com.google.android.apps.auto.radio.HD_RADIO_SIGNAL_MODE", ((Integer) obj).intValue());
                return;
            default:
                ((kmu) this.a).f("android.media.metadata.DISPLAY_ICON", (Bitmap) obj);
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
