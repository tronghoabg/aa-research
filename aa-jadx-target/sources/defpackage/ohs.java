package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ohs extends android.app.Service {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.InCallService");
    public final ohq b;
    public final defpackage.oib c;
    private int e;
    private int f;
    private int g;
    private int h;
    private long i;
    public final java.util.concurrent.CopyOnWriteArraySet d = new java.util.concurrent.CopyOnWriteArraySet();
    private defpackage.xzg j = new defpackage.xzg((defpackage.xzo) defpackage.ojm.a().b);
    private final android.content.BroadcastReceiver k = new defpackage.oho(this);

    public ohs() {
        if (defpackage.acrf.m()) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5934)).u("Creating InCallServiceCompat InCallService");
            this.c = new defpackage.oib(new ajnd(this));
            this.b = null;
        } else {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5933)).u("Creating legacy InCallService");
            this.b = new ohq(this);
            this.c = null;
        }
    }

    private final defpackage.rrv e(defpackage.zbd zbdVar) {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, zbdVar);
        if (rrvVarH.y == null) {
            rrvVarH.y = defpackage.yzs.a.n();
        }
        defpackage.abor aborVar = rrvVarH.y;
        int i = this.e;
        aborVar.t();
        defpackage.yzs yzsVar = (defpackage.yzs) aborVar.b;
        defpackage.yzs yzsVar2 = defpackage.yzs.a;
        yzsVar.b |= 4;
        yzsVar.e = i;
        int i2 = this.f;
        aborVar.t();
        defpackage.yzs yzsVar3 = (defpackage.yzs) aborVar.b;
        yzsVar3.b |= 8;
        yzsVar3.f = i2;
        int i3 = this.g;
        aborVar.t();
        defpackage.yzs yzsVar4 = (defpackage.yzs) aborVar.b;
        yzsVar4.b |= 1;
        yzsVar4.c = i3;
        int i4 = this.h;
        aborVar.t();
        defpackage.yzs yzsVar5 = (defpackage.yzs) aborVar.b;
        yzsVar5.b |= 2;
        yzsVar5.d = i4;
        return rrvVarH;
    }

    private final void f(defpackage.zbd zbdVar) {
        defpackage.rrv rrvVarE = e(zbdVar);
        rrvVarE.u(android.os.SystemClock.elapsedRealtime() - this.i);
        defpackage.omf.u().F(rrvVarE.l());
    }

    private final void g() {
        this.g++;
        this.j = defpackage.xzg.b((defpackage.xzo) defpackage.ojm.a().b);
        if (d()) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.PACKAGE_CHANGED");
            intentFilter.addDataScheme("package");
            intentFilter.addDataPath(getClass().getName(), 0);
            defpackage.duw.e(a(), this.k, intentFilter, null, 2);
        }
    }

    private static boolean h(android.content.Intent intent) {
        return "android.telecom.InCallService".equals(intent.getAction());
    }

    protected final android.content.Context a() {
        return getApplication().getBaseContext();
    }

    public final void b() {
        if (d()) {
            try {
                a().unregisterReceiver(this.k);
            } catch (java.lang.IllegalArgumentException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 5935)).u("closing calling session occurred twice.");
            }
        }
        this.h++;
        defpackage.rrv rrvVarE = e(defpackage.zbd.Du);
        defpackage.xzg xzgVar = this.j;
        if (xzgVar.a) {
            rrvVarE.u(xzgVar.a(java.util.concurrent.TimeUnit.MILLISECONDS));
        }
        defpackage.omf.u().F(rrvVarE.l());
        this.j.d();
    }

    final void c(ohr ohrVar) {
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ohrVar.a((ajnd) it.next());
        }
    }

    protected boolean d() {
        return false;
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if (h(intent)) {
            g();
        } else {
            this.e++;
        }
        f(h(intent) ? defpackage.zbd.Dt : defpackage.zbd.Dr);
        java.lang.String action = intent.getAction();
        if (action == null || !action.equals("local_gearhead_ics_intent")) {
            defpackage.oib oibVar = this.c;
            if (oibVar != null) {
                oibVar.attachBaseContext(a());
                android.os.IBinder iBinderOnBind = oibVar.onBind(intent);
                iBinderOnBind.getClass();
                return iBinderOnBind;
            }
            ohq ohqVar = this.b;
            ohqVar.getClass();
            ohqVar.attachBaseContext(a());
            return ohqVar.onBind(intent);
        }
        defpackage.ohj ohjVar = new defpackage.ohj(this, this);
        android.telecom.InCallService inCallService = ohjVar.d;
        java.util.Iterator<android.telecom.Call> it = inCallService.getCalls().iterator();
        while (it.hasNext()) {
            it.next().registerCallback(ohjVar.c);
        }
        if (!inCallService.getCalls().isEmpty()) {
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.aQ);
            rrvVarH.w(inCallService.getCalls().size());
            oimVarU.F(rrvVarH.l());
        }
        return ohjVar;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.i = android.os.SystemClock.elapsedRealtime();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f(defpackage.zbd.Dq);
    }

    @Override // android.app.Service
    public final void onRebind(android.content.Intent intent) {
        if (h(intent)) {
            g();
        } else {
            this.e++;
        }
        f(h(intent) ? defpackage.zbd.Dt : defpackage.zbd.Dr);
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5940)).u("onUnbind");
        if (h(intent)) {
            b();
        } else {
            this.f++;
            f(defpackage.zbd.Ds);
        }
        java.lang.String action = intent.getAction();
        if (action != null && action.equals("android.telecom.InCallService")) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5941)).u("Triggering unbind on InCallService instance");
            defpackage.oib oibVar = this.c;
            if (oibVar != null) {
                oibVar.onUnbind(intent);
            } else {
                ohq ohqVar = this.b;
                ohqVar.getClass();
                ohqVar.onUnbind(intent);
            }
        }
        c(new defpackage.ohn());
        return true;
    }
}
