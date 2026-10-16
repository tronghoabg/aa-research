package defpackage;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.SystemClock;
import android.telecom.Call;
import android.telecom.InCallService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ogy extends Service {
    public static final yph a = yph.c("GH.InCallService");
    public final ogw b;
    public final ohh c;
    private int e;
    private int f;
    private int g;
    private int h;
    private long i;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    private xya j = new xya((xyi) oit.a().b);
    private final BroadcastReceiver k = new ogu(this);

    public ogy() {
        if (acqd.m()) {
            ((ype) ((ype) a.f()).ai((char) 5908)).u("Creating InCallServiceCompat InCallService");
            this.c = new ohh(new ajmd(this));
            this.b = null;
        } else {
            ((ype) ((ype) a.f()).ai((char) 5907)).u("Creating legacy InCallService");
            this.b = new ogw(this);
            this.c = null;
        }
    }

    private final rrb e(yzy yzyVar) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzyVar);
        if (rrbVarH.y == null) {
            rrbVarH.y = yyn.a.n();
        }
        abnp abnpVar = rrbVarH.y;
        int i = this.e;
        abnpVar.t();
        yyn yynVar = (yyn) abnpVar.b;
        yyn yynVar2 = yyn.a;
        yynVar.b |= 4;
        yynVar.e = i;
        int i2 = this.f;
        abnpVar.t();
        yyn yynVar3 = (yyn) abnpVar.b;
        yynVar3.b |= 8;
        yynVar3.f = i2;
        int i3 = this.g;
        abnpVar.t();
        yyn yynVar4 = (yyn) abnpVar.b;
        yynVar4.b |= 1;
        yynVar4.c = i3;
        int i4 = this.h;
        abnpVar.t();
        yyn yynVar5 = (yyn) abnpVar.b;
        yynVar5.b |= 2;
        yynVar5.d = i4;
        return rrbVarH;
    }

    private final void f(yzy yzyVar) {
        rrb rrbVarE = e(yzyVar);
        rrbVarE.u(SystemClock.elapsedRealtime() - this.i);
        ebf.j().F(rrbVarE.l());
    }

    private final void g() {
        this.g++;
        this.j = xya.b((xyi) oit.a().b);
        if (d()) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_CHANGED");
            intentFilter.addDataScheme("package");
            intentFilter.addDataPath(getClass().getName(), 0);
            dup.e(a(), this.k, intentFilter, null, 2);
        }
    }

    private static boolean h(Intent intent) {
        return "android.telecom.InCallService".equals(intent.getAction());
    }

    protected final Context a() {
        return getApplication().getBaseContext();
    }

    public final void b() {
        if (d()) {
            try {
                a().unregisterReceiver(this.k);
            } catch (IllegalArgumentException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 5909)).u("closing calling session occurred twice.");
            }
        }
        this.h++;
        rrb rrbVarE = e(yzy.Dq);
        xya xyaVar = this.j;
        if (xyaVar.a) {
            rrbVarE.u(xyaVar.a(TimeUnit.MILLISECONDS));
        }
        ebf.j().F(rrbVarE.l());
        this.j.d();
    }

    final void c(ogx ogxVar) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ogxVar.a((ajmd) it.next());
        }
    }

    protected boolean d() {
        return false;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (h(intent)) {
            g();
        } else {
            this.e++;
        }
        f(h(intent) ? yzy.Dp : yzy.Dn);
        String action = intent.getAction();
        if (action == null || !action.equals("local_gearhead_ics_intent")) {
            ohh ohhVar = this.c;
            if (ohhVar != null) {
                ohhVar.attachBaseContext(a());
                IBinder iBinderOnBind = ohhVar.onBind(intent);
                iBinderOnBind.getClass();
                return iBinderOnBind;
            }
            ogw ogwVar = this.b;
            ogwVar.getClass();
            ogwVar.attachBaseContext(a());
            return ogwVar.onBind(intent);
        }
        ogp ogpVar = new ogp(this, this);
        InCallService inCallService = ogpVar.d;
        Iterator<Call> it = inCallService.getCalls().iterator();
        while (it.hasNext()) {
            it.next().registerCallback(ogpVar.c);
        }
        if (!inCallService.getCalls().isEmpty()) {
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.aQ);
            rrbVarH.w(inCallService.getCalls().size());
            ohsVarJ.F(rrbVarH.l());
        }
        return ogpVar;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.i = SystemClock.elapsedRealtime();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f(yzy.Dm);
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        if (h(intent)) {
            g();
        } else {
            this.e++;
        }
        f(h(intent) ? yzy.Dp : yzy.Dn);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 5914)).u("onUnbind");
        if (h(intent)) {
            b();
        } else {
            this.f++;
            f(yzy.Do);
        }
        String action = intent.getAction();
        if (action != null && action.equals("android.telecom.InCallService")) {
            ((ype) ((ype) yphVar.f()).ai((char) 5915)).u("Triggering unbind on InCallService instance");
            ohh ohhVar = this.c;
            if (ohhVar != null) {
                ohhVar.onUnbind(intent);
            } else {
                ogw ogwVar = this.b;
                ogwVar.getClass();
                ogwVar.onUnbind(intent);
            }
        }
        c(new ogt());
        return true;
    }
}
