package defpackage;

import android.app.ActivityOptions;
import android.companion.virtual.VirtualDeviceManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class ipc implements VirtualDeviceManager.IntentInterceptorCallback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ipc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final void onIntentIntercepted(Intent intent) throws RemoteException {
        if (this.b == 0) {
            intent.getClass();
            ((ajmd) ((usw) this.a).i).H(intent);
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        yph yphVar = ioq.E;
        ((ype) yphVar.l().ai(839)).M("Intercepting intent action: %s, data: %s", action, data);
        Intent intent2 = new Intent();
        intent2.setAction(action);
        intent2.setData(data);
        intent2.addFlags(268435456);
        Bundle bundle = ActivityOptions.makeBasic().setLaunchDisplayId(0).toBundle();
        Object obj = this.a;
        ioq ioqVar = (ioq) obj;
        Context context = ioqVar.b.d;
        context.startActivity(intent2, bundle);
        ComponentName componentName = new ComponentName(context.getPackageName(), obj.getClass().getName());
        qtu qtuVar = ioqVar.I;
        CarRegionId carRegionId = ioqVar.z;
        if (qtuVar == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 867)).u("App decor service not initialized, can't show toast.");
        } else {
            try {
                rab rabVarG = qtuVar.g(carRegionId.h.b, carRegionId.g);
                if (rabVarG == null) {
                    ((ype) ((ype) yphVar.h()).ai(866)).u("Unable to retrieve system UI service, can't show toast.");
                } else {
                    ((ype) yphVar.l().ai(864)).u("Showing toast");
                    rabVarG.g(context.getString(R.string.intent_intercepted_toast_text), 0, componentName);
                }
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) ioq.E.h()).p(e)).ai((char) 865)).u("Unable to show toast.");
            }
        }
        rpz rpzVarA = rpz.a(ioqVar.b.d);
        rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.ACTIVITY_MANAGER, yzy.LN);
        rrbVarH.p(ioqVar.d);
        rpzVarA.c(rrbVarH.l());
    }
}
