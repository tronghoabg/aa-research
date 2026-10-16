package defpackage;

import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.Surface;
import com.google.android.apps.auto.client.activity.ghost.GhostActivity;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class ipk implements ipi {
    public static final /* synthetic */ int b = 0;
    private static final yph c;
    private static final tei d;
    public Surface a;
    private final tel e;

    static {
        yph yphVarC = yph.c("GH.GhostActivityManager");
        c = yphVarC;
        Level level = Level.FINE;
        level.getClass();
        d = new tei(2, level, yphVarC, 2);
    }

    public ipk(Context context, ComponentName componentName, ComponentName componentName2, iph iphVar) {
        yph yphVar = tel.a;
        this.e = spu.aU(ipj.a, d, null, new erl(iphVar, this, 3, (byte[]) null));
        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
        activityOptionsMakeBasic.getClass();
        activityOptionsMakeBasic.setLaunchDisplayId(iphVar.c().getDisplayId());
        yph yphVar2 = GhostActivity.m;
        acuc acucVar = acuc.a;
        Intent intentPutExtra = new Intent().addFlags(268435456).addFlags(134217728).addFlags(8388608).setComponent(componentName).putExtra("CarActivityServiceComponentName", componentName2).putExtra("DisplayDebugContent", acucVar.gu().d());
        intentPutExtra.getClass();
        ((ype) c.f()).M("Starting 👻 Activity for %s with intent: %s", componentName2, intentPutExtra);
        if (!acucVar.gu().c()) {
            context.startActivity(intentPutExtra, activityOptionsMakeBasic.toBundle());
            return;
        }
        try {
            context.startActivity(intentPutExtra, activityOptionsMakeBasic.toBundle());
        } catch (ActivityNotFoundException e) {
            ((ype) ((ype) c.g()).p(e)).y("GhostActivity for %s not found.", componentName2);
            rpz rpzVarA = rpz.a(context);
            rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.ACTIVITY_MANAGER, yzy.Nf);
            rrbVarH.p(componentName);
            rpzVarA.c(rrbVarH.l());
            throw e;
        }
    }

    @Override // defpackage.ipi
    public final void a() {
        c(ipj.d);
    }

    @Override // defpackage.ipi
    public final void b(Surface surface) {
        surface.getClass();
        this.a = surface;
    }

    public final void c(ipj ipjVar) {
        this.e.c(ipjVar);
    }
}
