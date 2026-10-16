package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jbr implements defpackage.xzi {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jbr(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v23, types: [aclm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v36, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r11v44, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r11v51, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                defpackage.jbs jbsVar = (defpackage.jbs) this.b;
                android.content.Context context = jbsVar.b;
                defpackage.izz izzVar = jbsVar.k;
                java.lang.String str = jbsVar.l;
                java.lang.String str2 = jbsVar.o;
                defpackage.xjw xjwVar = jbsVar.s;
                defpackage.jcb jcbVar = jbsVar.v;
                defpackage.jag jagVar = jbsVar.p;
                defpackage.jbw jbwVar = (defpackage.jbw) this.a;
                return new defpackage.jab(context, izzVar, jbwVar.c, jbwVar.b, str, str2, xjwVar, jcbVar, jagVar);
            case 1:
                return ((defpackage.imi) this.b).m((com.google.android.gms.car.display.CarDisplayId) this.a);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar = defpackage.jod.a;
                return new defpackage.jnx((android.content.Context) this.b, (android.os.Handler) this.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return ((defpackage.jod) this.b).c((defpackage.jog) this.a);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((defpackage.jog) this.b).b(this.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar2 = com.google.android.apps.auto.components.bugreport.BugreportRequester.a;
                java.lang.Object obj = this.a;
                android.content.Context context2 = (android.content.Context) this.b;
                return context2.getSharedPreferences("bugreport_shared_preferences_".concat(((defpackage.jrm) obj).c(context2)), 0);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj2 = this.a;
                defpackage.yqm yqmVar3 = defpackage.kit.a;
                defpackage.zke zkeVar = defpackage.zke.a;
                final defpackage.kit kitVar = (defpackage.kit) obj2;
                defpackage.qrb qrbVar = kitVar.n;
                ((defpackage.yqj) yqmVar3.l().ai((char) 3122)).y("Registering listener %s with CarClientToken", new defpackage.zkf(zkeVar, qrbVar));
                java.lang.Object obj3 = this.b;
                obj3.getClass();
                return defpackage.omv.b((android.content.Context) obj3, kitVar.m, new defpackage.rcq() { // from class: kin
                    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
                    @Override // defpackage.rcq
                    public final void a(rcp rcpVar) throws wfo {
                        defpackage.wfp.c();
                        defpackage.yqm yqmVar4 = defpackage.kit.a;
                        defpackage.ypu ypuVarH = yqmVar4.h();
                        defpackage.zke zkeVar2 = defpackage.zke.a;
                        ((defpackage.yqj) ((defpackage.yqj) ypuVarH).ai((char) 3142)).y("CarClientToken connection failed: %s", new defpackage.zkf(zkeVar2, rcpVar));
                        defpackage.kit kitVar2 = kitVar;
                        kitVar2.e = rcpVar;
                        kitVar2.m(defpackage.kis.b);
                        defpackage.wfp.c();
                        ((defpackage.yqj) yqmVar4.l().ai((char) 3131)).u("notifyListenersOnConnectionFailed entered");
                        java.util.concurrent.CopyOnWriteArraySet<defpackage.kfp> copyOnWriteArraySet = kitVar2.k;
                        synchronized (copyOnWriteArraySet) {
                            for (defpackage.kfp kfpVar : copyOnWriteArraySet) {
                                ((defpackage.yqj) yqmVar4.l().ai(3132)).y("calling onConnectionFailed on %s", new defpackage.zkf(zkeVar2, kfpVar));
                                kfpVar.d(rcpVar);
                            }
                        }
                    }
                }, qrbVar, 2);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int i = defpackage.qfn.g;
                return new ora((android.content.Context) this.b, (java.util.concurrent.Executor) this.a);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.rvk rvkVar = (defpackage.rvk) this.b;
                android.content.Context context3 = rvkVar.c;
                defpackage.rty rtyVar = rvkVar.k;
                defpackage.ruq ruqVar = rvkVar.o;
                defpackage.rvp rvpVar = (defpackage.rvp) this.a;
                return new defpackage.rua(context3, rtyVar, rvpVar.c, rvpVar.b, ruqVar);
            case 9:
                return ((defpackage.row) this.b).e(((defpackage.vxv) this.a.a()).a);
            case 10:
                return ((defpackage.yuv) ((defpackage.ngb) this.b).b).i(((defpackage.abnv) this.a).D());
            case 11:
                defpackage.sim simVar = (defpackage.sim) this.b;
                java.lang.String str3 = simVar.i;
                java.lang.String str4 = simVar.h;
                return defpackage.wde.b(str4, (java.util.concurrent.atomic.AtomicReference) ((defpackage.wde) ((defpackage.sjr) this.a).a).d.get(new defpackage.xyo(str3, str4)));
            case 12:
                return defpackage.wde.b("", (java.util.concurrent.atomic.AtomicReference) ((defpackage.wde) ((defpackage.sjr) this.a).a).e.get(((defpackage.sim) this.b).i));
            case 13:
                return java.lang.String.valueOf(defpackage.way.b((android.content.Context) this.b)) + java.io.File.separator + "phenotype_storage_info" + java.io.File.separator + "shared" + java.io.File.separator + ((java.lang.String) this.a);
            case 14:
                int i2 = com.google.android.projection.gearhead.GhApplication.b;
                return new defpackage.kmy(this.a, (android.content.Context) this.b);
            default:
                defpackage.yqm yqmVar4 = com.google.android.projection.gearhead.GhCrashHandler.a;
                java.lang.Object obj4 = this.a;
                android.content.Context context4 = (android.content.Context) this.b;
                return context4.getSharedPreferences("crash_shared_preferences_".concat(((defpackage.jrm) obj4).c(context4)), 0);
        }
    }

    public /* synthetic */ jbr(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
