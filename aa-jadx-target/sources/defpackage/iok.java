package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class iok extends defpackage.riq {
    final /* synthetic */ defpackage.iol a;

    public iok(defpackage.iol iolVar) {
        this.a = iolVar;
    }

    @Override // defpackage.riq
    public final void a(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        rnb rmzVar;
        defpackage.ill.d();
        defpackage.yqm yqmVar = defpackage.iol.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 811)).u("onServiceConnected");
        defpackage.iol iolVar = this.a;
        if (iolVar.d != 1) {
            ((defpackage.yqj) yqmVar.l().ai((char) 812)).u("Input no longer starting when service connected");
            return;
        }
        if (iBinder == null) {
            rmzVar = null;
        } else {
            rnb rnbVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.input.ICarProjectionInputService");
            rmzVar = rnbVarQueryLocalInterface instanceof rnb ? rnbVarQueryLocalInterface : new rmz(iBinder);
        }
        iolVar.c = rmzVar;
        try {
            iolVar.c.f(iolVar.h);
            try {
                defpackage.iol iolVar2 = this.a;
                iolVar2.i(iolVar2.e, iolVar2.f, iolVar2.g);
                defpackage.iol iolVar3 = this.a;
                iolVar3.f();
                iolVar3.d = 2;
            } catch (android.os.RemoteException e) {
                this.a.h("Failed to notify input service of start", e);
            }
        } catch (android.os.RemoteException e2) {
            this.a.h("Unable to register input service callback", e2);
        }
    }

    @Override // defpackage.riq
    public final void b(android.content.ComponentName componentName) {
        defpackage.ill.d();
        ((defpackage.yqj) ((defpackage.yqj) defpackage.iol.a.g()).ai((char) 813)).u("Input service disconnected.");
        defpackage.iol iolVar = this.a;
        iolVar.c = null;
        iolVar.g();
    }
}
