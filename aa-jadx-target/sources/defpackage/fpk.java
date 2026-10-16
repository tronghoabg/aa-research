package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class fpk implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ fpk(aiuw aiuwVar, fxd fxdVar, defpackage.bwx bwxVar, defpackage.aeb aebVar, int i) {
        this.e = i;
        this.b = aiuwVar;
        this.a = fxdVar;
        this.c = bwxVar;
        this.d = aebVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [bys, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        int i = this.e;
        boolean z = true;
        if (i == 0) {
            java.lang.String string = ((java.util.UUID) this.b).toString();
            fpl fplVar = (fpl) this.a;
            fok fokVarC = fplVar.b.c(string);
            java.lang.Object obj = this.c;
            if (fokVarC == null || fokVarC.b.a()) {
                throw new java.lang.IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            fku fkuVar = fplVar.a;
            synchronized (fkuVar.k) {
                fjv.a();
                android.util.Log.i(fku.a, defpackage.a.bp(string, "Moving WorkSpec (", ") to the foreground"));
                fmg fmgVar = (fmg) fkuVar.g.remove(string);
                if (fmgVar != null) {
                    if (fkuVar.b == null) {
                        android.content.Context context = fkuVar.c;
                        int i2 = fpg.a;
                        context.getClass();
                        java.lang.Object systemService = context.getApplicationContext().getSystemService("power");
                        systemService.getClass();
                        android.os.PowerManager.WakeLock wakeLockNewWakeLock = ((android.os.PowerManager) systemService).newWakeLock(1, "WorkManager: ProcessorForegroundLck");
                        synchronized (fph.a) {
                        }
                        wakeLockNewWakeLock.getClass();
                        fkuVar.b = wakeLockNewWakeLock;
                        fkuVar.b.acquire();
                    }
                    fkuVar.f.put(string, fmgVar);
                    android.content.Context context2 = fkuVar.c;
                    fof fofVarA = fmgVar.a();
                    int i3 = fnp.k;
                    android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
                    intent.setAction("ACTION_START_FOREGROUND");
                    intent.putExtra("KEY_WORKSPEC_ID", fofVarA.a);
                    intent.putExtra("KEY_GENERATION", fofVarA.b);
                    intent.putExtra("KEY_NOTIFICATION_ID", ((fjn) obj).a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ((fjn) obj).b);
                    intent.putExtra("KEY_NOTIFICATION", ((fjn) obj).c);
                    a$.ExternalSyntheticApiModelOutline1.m(context2, intent);
                }
            }
            java.lang.Object obj2 = this.d;
            fof fofVarQ = dtb.q(fokVarC);
            int i4 = fnp.k;
            android.content.Context context3 = (android.content.Context) obj2;
            android.content.Intent intent2 = new android.content.Intent(context3, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
            intent2.setAction("ACTION_NOTIFY");
            fjn fjnVar = (fjn) obj;
            intent2.putExtra("KEY_NOTIFICATION_ID", fjnVar.a);
            intent2.putExtra("KEY_FOREGROUND_SERVICE_TYPE", fjnVar.b);
            intent2.putExtra("KEY_NOTIFICATION", fjnVar.c);
            intent2.putExtra("KEY_WORKSPEC_ID", fofVarQ.a);
            intent2.putExtra("KEY_GENERATION", fofVarQ.b);
            context3.startService(intent2);
            return null;
        }
        if (i == 1) {
            if (defpackage.bt.ac(2)) {
                android.util.Log.v("FragmentManager", "Attempting to create TransitionSeekController");
            }
            java.lang.Object obj3 = this.a;
            java.lang.Object obj4 = this.c;
            java.lang.Object obj5 = this.d;
            ai aiVar = (ai) obj5;
            aiVar.g = aiVar.d.s((android.view.ViewGroup) obj4, obj3);
            if (aiVar.g == null) {
                if (defpackage.bt.ac(2)) {
                    android.util.Log.v("FragmentManager", "TransitionSeekController was not created.");
                }
                aiVar.h = true;
                return defpackage.afbk.a;
            }
            ((defpackage.afgv) this.b).a = new defpackage.ah(obj5, obj3, obj4, 1, (byte[]) null);
            if (defpackage.bt.ac(2)) {
                android.util.Log.v("FragmentManager", "Started executing operations from " + aiVar.b + " to " + aiVar.c);
            }
            return defpackage.afbk.a;
        }
        if (i == 2) {
            ?? r0 = this.c;
            if (!((java.lang.Boolean) r0.a()).booleanValue()) {
                java.lang.Object obj6 = this.d;
                java.lang.Object obj7 = this.a;
                ?? r11 = this.b;
                r0.b(java.lang.Boolean.TRUE);
                ((defpackage.ype) fxc.a.e().o(defpackage.yqn.a, "CarApp.H.Action.TimedBn").ai(3)).u("Button clicked");
                ahoc.d((aiuw) r11, (defpackage.afdo) null, 0, new ggc((defpackage.aeb) obj6, (defpackage.afdk) null, 1), 3);
                defpackage.afer aferVar = ((fxd) obj7).b.d;
                if (aferVar != null) {
                    aferVar.invoke();
                }
            }
            return defpackage.afbk.a;
        }
        if (i == 3) {
            if (defpackage.afga.f(((defpackage.eqp) this.d).e(), java.lang.Boolean.TRUE)) {
                java.lang.Object obj8 = this.b;
                java.lang.Object obj9 = this.a;
                java.lang.Object obj10 = this.c;
                ((lkv) obj9).a((java.lang.String) obj8);
                java.lang.Object objE = ((defpackage.eqp) obj10).e();
                if (objE instanceof lkr) {
                    ((lkr) objE).a();
                }
            }
            return defpackage.afbk.a;
        }
        if (i != 4) {
            ((defpackage.nbg) this.b).e((android.content.Context) this.d, defpackage.afga.aX(defpackage.tna.aq(this.a), ((defpackage.byj) this.c).e()));
            return defpackage.afbk.a;
        }
        ?? r1 = this.d;
        defpackage.yqm yqmVar = defpackage.mzk.a;
        if (!((java.lang.Boolean) r1.a()).booleanValue() && ((java.lang.Boolean) this.c.a()).booleanValue() && !((java.lang.Boolean) this.a.a()).booleanValue() && !((java.lang.Boolean) this.b.a()).booleanValue()) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public /* synthetic */ fpk(fpl fplVar, java.util.UUID uuid, fjn fjnVar, android.content.Context context, int i) {
        this.e = i;
        this.a = fplVar;
        this.b = uuid;
        this.c = fjnVar;
        this.d = context;
    }

    public /* synthetic */ fpk(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.e = i;
        this.d = obj;
        this.c = obj2;
        this.a = obj3;
        this.b = obj4;
    }

    public /* synthetic */ fpk(defpackage.nbg nbgVar, android.content.Context context, defpackage.bys bysVar, defpackage.byj byjVar, int i) {
        this.e = i;
        this.b = nbgVar;
        this.d = context;
        this.a = bysVar;
        this.c = byjVar;
    }
}
