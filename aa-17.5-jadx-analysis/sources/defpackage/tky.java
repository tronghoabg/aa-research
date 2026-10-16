package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final /* synthetic */ class tky implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ tky(gjt gjtVar, gjt gjtVar2, tla tlaVar, Duration duration, ajed ajedVar, tkw tkwVar, int i) {
        this.g = i;
        this.a = gjtVar;
        this.b = gjtVar2;
        this.c = tlaVar;
        this.d = duration;
        this.f = ajedVar;
        this.e = tkwVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, tkw] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, zgp] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (this.g == 0) {
            gjt gjtVar = (gjt) this.a;
            Object objE = gjtVar.e();
            Object obj = this.c;
            Object obj2 = this.b;
            if (objE != tkr.b) {
                gjt gjtVar2 = (gjt) obj2;
                if (gjtVar2.e() != tkx.c) {
                    if (gjtVar2.e() != tkx.a) {
                        Object objE2 = gjtVar2.e();
                        Objects.toString(objE2);
                        throw new IllegalStateException("Illegal state transition, SetupStatus=".concat(String.valueOf(objE2)));
                    }
                    ?? r0 = this.e;
                    Object obj3 = this.f;
                    tla.a.l().M("[%s] Dispatching timeout result after %s", ((tla) obj).b, this.d);
                    gjtVar2.f(tkx.b);
                    ((ajed) obj3).h();
                    r0.a(new tku());
                    return;
                }
            }
            tla.a.l().R("[%s] Timeout is obsolete: lastRequestFromClientForThisLifecycle=%s, setupStatusForThisLifecycle=%s", ((tla) obj).b, gjtVar.e(), ((gjt) obj2).e());
            return;
        }
        Object obj4 = this.d;
        boolean zA = ((lhf) obj4).j.e.a(eps.d);
        ?? r2 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.c;
        Object obj7 = this.a;
        Object obj8 = this.b;
        if (zA) {
            try {
                mqp mqpVar = (mqp) r2.get();
                mqpVar.getClass();
                mqc mqcVar = mqpVar.c;
                if (!((ComponentName) obj5).equals(mqcVar.a())) {
                    ((ype) ((ype) ((ket) obj4).a.h()).ai(2983)).M("Component name mismatch between intent component %s and app component %s", obj5, mqcVar.a());
                }
                aaew aaewVar = new aaew(null);
                aaewVar.b = obj8;
                aaewVar.d = ((Context) obj6).getString(R.string.launch_action_label);
                ComponentName componentNameA = mqcVar.a();
                String string = ((Context) obj6).getString(R.string.new_app_available, mqpVar.e);
                String string2 = ((Context) obj6).getString(true != mqcVar.c ? R.string.open_new_app : R.string.open_new_parked_app);
                num numVar = new num();
                numVar.m = string;
                numVar.n = string2;
                numVar.d = mqpVar.d;
                numVar.a = nup.HIGH;
                numVar.x = nuo.a;
                numVar.A = nun.c;
                numVar.f = componentNameA.getPackageName();
                numVar.c = (PendingIntent) obj7;
                numVar.p = new nul(aaewVar);
                nur nurVarB = numVar.b();
                ((ype) ((ket) obj4).a.l().ai(2980)).y("Notifying about new app %s", mqpVar);
                nuj.b().j("GH.AppNotifier", ((ket) obj4).c.getAndIncrement(), nurVarB);
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.APP_NOTIFIER, yzy.Ms);
                rrbVarH.p(componentNameA);
                ohsVarJ.F(rrbVarH.l());
            } catch (InterruptedException | ExecutionException e) {
                ((ype) ((ype) ((ype) ((ket) obj4).a.g()).p(e)).ai((char) 2982)).u("Could not post notification");
            }
        }
    }

    public /* synthetic */ tky(ket ketVar, zgp zgpVar, ComponentName componentName, Context context, PendingIntent pendingIntent, PendingIntent pendingIntent2, int i) {
        this.g = i;
        this.d = ketVar;
        this.f = zgpVar;
        this.e = componentName;
        this.c = context;
        this.a = pendingIntent;
        this.b = pendingIntent2;
    }
}
