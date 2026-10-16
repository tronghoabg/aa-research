package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public abstract class mdd extends BroadcastReceiver {
    private static boolean a = false;
    private final vky b = a();
    private ComponentName c;
    public boolean g;
    public rpz h;

    protected abstract vky a();

    public abstract void b(Context context, Intent intent);

    public final mmc e() {
        vky vkyVarA;
        wer.c();
        rrc rrcVar = null;
        if (this.g) {
            vkyVarA = vky.a(this.b, new vky(".goAsync"));
            vla.a().e(vkyVarA);
            rpz rpzVar = this.h;
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.COMPONENT_RELIABILITY, yzy.qu);
            rrbVarH.p(this.c);
            rpzVar.c(rrbVarH.l());
        } else {
            vkyVarA = null;
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = super.goAsync();
        if (this.g) {
            rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.COMPONENT_RELIABILITY, yzy.qv);
            rrbVarH2.p(this.c);
            rrcVar = (rrc) rrbVarH2.l();
        }
        return new mmc(pendingResultGoAsync, new rpp(this, vkyVarA, rrcVar));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        vky vkyVarA;
        if (!a) {
            if (context.getPackageName().equals("com.google.devtools.hawkeye")) {
                context.getClass();
                ebe.o(context);
            }
            a = true;
        }
        aboh abohVar = acur.a.gu().d().b;
        vky vkyVar = this.b;
        String str = vkyVar.a;
        boolean zContains = abohVar.contains(str);
        this.g = zContains;
        if (zContains) {
            this.h = rpz.a(context);
            this.c = ComponentName.createRelative(context, str);
            vkyVarA = vky.a(vkyVar, new vky(".onReceive"));
            vla.a().e(vkyVarA);
            rpz rpzVar = this.h;
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.COMPONENT_RELIABILITY, yzy.qs);
            rrbVarH.p(this.c);
            rpzVar.c(rrbVarH.l());
        } else {
            vkyVarA = null;
        }
        try {
            b(context, intent);
            if (this.g) {
                vla.a().f(vkyVarA);
            }
            if (this.g) {
                rpz rpzVar2 = this.h;
                rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.COMPONENT_RELIABILITY, yzy.qt);
                rrbVarH2.p(this.c);
                rpzVar2.c(rrbVarH2.l());
            }
        } catch (Throwable th) {
            if (this.g) {
                vla.a().f(vkyVarA);
            }
            throw th;
        }
    }
}
