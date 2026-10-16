package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class mdl extends android.content.BroadcastReceiver {
    private static boolean a = false;
    private final defpackage.vlu b = a();
    private android.content.ComponentName c;
    public boolean g;
    public defpackage.rqt h;

    protected abstract defpackage.vlu a();

    public abstract void b(android.content.Context context, android.content.Intent intent);

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final defpackage.mmi e() throws wfo {
        defpackage.vlu vluVarA;
        defpackage.wfp.c();
        defpackage.rrw rrwVar = null;
        if (this.g) {
            vluVarA = defpackage.vlu.a(this.b, new defpackage.vlu(".goAsync"));
            defpackage.vlw.a().e(vluVarA);
            defpackage.rqt rqtVar = this.h;
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.COMPONENT_RELIABILITY, defpackage.zbd.qw);
            rrvVarH.p(this.c);
            rqtVar.c(rrvVarH.l());
        } else {
            vluVarA = null;
        }
        android.content.BroadcastReceiver.PendingResult pendingResultGoAsync = super.goAsync();
        if (this.g) {
            defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.COMPONENT_RELIABILITY, defpackage.zbd.qx);
            rrvVarH2.p(this.c);
            rrwVar = (defpackage.rrw) rrvVarH2.l();
        }
        return new defpackage.mmi(pendingResultGoAsync, new defpackage.rqj(this, vluVarA, rrwVar));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.vlu vluVarA;
        if (!a) {
            if (context.getPackageName().equals("com.google.devtools.hawkeye")) {
                context.getClass();
                defpackage.ebo.s(context);
            }
            a = true;
        }
        defpackage.abpj abpjVar = defpackage.acvt.a.fF().d().b;
        defpackage.vlu vluVar = this.b;
        java.lang.String str = vluVar.a;
        boolean zContains = abpjVar.contains(str);
        this.g = zContains;
        if (zContains) {
            this.h = defpackage.rqt.a(context);
            this.c = android.content.ComponentName.createRelative(context, str);
            vluVarA = defpackage.vlu.a(vluVar, new defpackage.vlu(".onReceive"));
            defpackage.vlw.a().e(vluVarA);
            defpackage.rqt rqtVar = this.h;
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.COMPONENT_RELIABILITY, defpackage.zbd.qu);
            rrvVarH.p(this.c);
            rqtVar.c(rrvVarH.l());
        } else {
            vluVarA = null;
        }
        try {
            b(context, intent);
            if (this.g) {
                defpackage.vlw.a().f(vluVarA);
            }
            if (this.g) {
                defpackage.rqt rqtVar2 = this.h;
                defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.COMPONENT_RELIABILITY, defpackage.zbd.qv);
                rrvVarH2.p(this.c);
                rqtVar2.c(rrvVarH2.l());
            }
        } catch (java.lang.Throwable th) {
            if (this.g) {
                defpackage.vlw.a().f(vluVarA);
            }
            throw th;
        }
    }
}
