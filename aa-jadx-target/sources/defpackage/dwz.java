package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class dwz extends android.telecom.InCallService implements defpackage.eqg {
    public static final java.lang.String a = defpackage.afgw.b(android.telecom.InCallService.class).getSimpleName();
    private final defpackage.gka b = new defpackage.gka(this);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object a(defpackage.dwz dwzVar, android.telecom.Call call, defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        dwy dwyVar;
        if (afdkVar instanceof dwy) {
            dwyVar = (dwy) afdkVar;
            int i = dwyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dwyVar.b = i - Integer.MIN_VALUE;
            } else {
                dwyVar = new dwy(dwzVar, afdkVar);
            }
        } else {
            dwyVar = new dwy(dwzVar, afdkVar);
        }
        java.lang.Object obj = dwyVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = dwyVar.b;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            aiwg aiwgVarD = ahoc.d(ahoi.b(defpackage.eqy.b(dwzVar).b.plus(new aixg((aiwg) null))), (defpackage.afdo) null, 0, new defpackage.egg(dwzVar, call, affcVar, (defpackage.afdk) null, 1), 3);
            dwyVar.b = 1;
            if (aiwgVarD.n(dwyVar) == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj);
        }
        android.util.Log.d(a, "connectExtensions: complete");
        return defpackage.afbk.a;
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return (defpackage.epy) this.b.b;
    }

    @Override // android.telecom.InCallService, android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        this.b.p();
        return super.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.b.q();
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.b.r();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(android.content.Intent intent, int i) {
        this.b.s();
        super.onStart(intent, i);
    }
}
