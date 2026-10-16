package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class imo extends defpackage.riq {
    final /* synthetic */ defpackage.imr a;

    public imo(defpackage.imr imrVar) {
        this.a = imrVar;
    }

    @Override // defpackage.riq
    public final void a(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        defpackage.rao ramVar;
        defpackage.yqm yqmVar = defpackage.imr.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 412)).y("Connected to %s", componentName.toShortString());
        if (iBinder == null) {
            ramVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.IProjectionLifecycle");
            ramVar = iInterfaceQueryLocalInterface instanceof defpackage.rao ? (defpackage.rao) iInterfaceQueryLocalInterface : new defpackage.ram(iBinder);
        }
        defpackage.imr imrVar = this.a;
        imrVar.m = ramVar;
        imrVar.k = defpackage.imq.d;
        try {
            ((defpackage.yqj) yqmVar.l().ai(413)).u("Invoking service onProjectionStart");
            defpackage.rao raoVar = imrVar.m;
            raoVar.getClass();
            raoVar.h(imrVar.j, imrVar.f);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.imr.a.h()).p(e)).ai((char) 414)).u("Error while invoking onProjectionStart");
        }
        defpackage.imr imrVar2 = this.a;
        if (imrVar2.s) {
            imrVar2.r.postDelayed(imrVar2.u, j$.time.Duration.ofSeconds(defpackage.actq.b()).toMillis());
        }
    }

    @Override // defpackage.riq
    public final void b(android.content.ComponentName componentName) {
        defpackage.imr imrVar = this.a;
        defpackage.imq imqVar = imrVar.k;
        defpackage.imq imqVar2 = defpackage.imq.c;
        if (imqVar != imqVar2) {
            defpackage.yqm yqmVar = defpackage.imr.a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 415)).y("Disconnected from %s", componentName.toShortString());
            imrVar.k = imqVar2;
            imrVar.m = null;
            defpackage.imp impVar = imrVar.d;
            impVar.d();
            if (imrVar.s) {
                imrVar.r.removeCallbacks(imrVar.u);
                imrVar.t++;
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(416)).w("Disconnect count: %s", imrVar.t);
                if (imrVar.t > defpackage.actq.c()) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 417)).u("Exceeded max disconnects, terminating projection");
                    impVar.er();
                    defpackage.sqf.a().c(imrVar.g, this);
                    return;
                }
            }
            defpackage.sqf.a().c(imrVar.g, this);
            imrVar.a();
        }
    }
}
