package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rql extends defpackage.stt {
    public final /* synthetic */ defpackage.rqm a;

    public rql(defpackage.rqm rqmVar) {
        this.a = rqmVar;
    }

    @Override // defpackage.stt
    public final void a(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        java.lang.String interfaceDescriptor;
        defpackage.rqe rqcVar;
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PLSCM", null, "Connected to %s", componentName.toShortString());
        }
        try {
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (android.os.RemoteException unused) {
            if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 5)) {
                defpackage.rrx.d(5, "CAR.PROJECTION.PLSCM", null, "RemoteException received getting interface descriptor", new java.lang.Object[0]);
            }
            interfaceDescriptor = null;
        }
        if (!"com.google.android.gms.car.lifetime.IProjectionLifetime".equals(interfaceDescriptor)) {
            if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 5)) {
                defpackage.rrx.d(5, "CAR.PROJECTION.PLSCM", null, "Lifetime service connected but unable to cast interface descriptor. Proceeding without lifetime verification.", new java.lang.Object[0]);
            }
            new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.rid(this, 15));
            return;
        }
        defpackage.rqm rqmVar = this.a;
        rqmVar.f = true;
        if (iBinder == null) {
            rqcVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.lifetime.IProjectionLifetime");
            rqcVar = iInterfaceQueryLocalInterface instanceof defpackage.rqe ? (defpackage.rqe) iInterfaceQueryLocalInterface : new defpackage.rqc(iBinder);
        }
        rqmVar.i = rqcVar;
        defpackage.ysr.bk(rqmVar.f, "Lifetime service not bound.");
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PLSCM", null, "registerLifetimeCallback", new java.lang.Object[0]);
        }
        if (rqmVar.i == null) {
            throw new java.lang.IllegalStateException("Lifetime service not bound.");
        }
        if (rqmVar.d != null) {
            if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
                defpackage.rrx.d(3, "CAR.PROJECTION.PLSCM", null, "registerLifetimeCallback: Callback already registered.", new java.lang.Object[0]);
                return;
            }
            return;
        }
        rqmVar.d = new defpackage.rqg(rqmVar);
        try {
            rqmVar.i.e(rqmVar.d);
        } catch (android.os.RemoteException e) {
            if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 5)) {
                defpackage.rrx.d(5, "CAR.PROJECTION.PLSCM", e, "RemoteException calling registerProjectionLifetimeCallback. Removing callback and unbinding service.", new java.lang.Object[0]);
            }
            rqmVar.d = null;
            rqmVar.d();
        }
    }

    @Override // defpackage.stt
    public final void b(android.content.ComponentName componentName) {
        defpackage.rqm rqmVar = this.a;
        if (!rqmVar.f) {
            if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
                defpackage.rrx.a("CAR.PROJECTION.PLSCM", null, "doServiceDisconnected called when not bound. Ignoring.");
                return;
            }
            return;
        }
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PLSCM", null, "Disconnected from %s. Unbinding service.", componentName.toShortString());
        }
        rqmVar.g = 0;
        rqmVar.e();
        rqmVar.d();
        if (rqmVar.b && rqmVar.c && rqmVar.e.isEmpty()) {
            if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
                defpackage.rrx.a("CAR.PROJECTION.PLSCM", null, "No pending callbacks, not attempting to rebind");
            }
        } else {
            if (rqmVar.f(defpackage.rqm.a(rqmVar.a)) || !defpackage.rrx.e("CAR.PROJECTION.PLSCM", 4)) {
                return;
            }
            defpackage.rrx.c("CAR.PROJECTION.PLSCM", null, "Lifetime service could not be rebound. Unregistering callback.");
        }
    }
}
