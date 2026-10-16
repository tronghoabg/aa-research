package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rdp implements defpackage.saa {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rdp(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, rin] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, rik] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, rik] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, rki] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object, rkw] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object, rkw] */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.Object, rli] */
    @Override // defpackage.saa
    public final void a() throws android.os.RemoteException {
        switch (this.c) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.ref) this.a).C().aC((com.google.android.gms.car.CarFrxEvent) this.b);
                return;
            case 1:
                ((defpackage.ref) this.b).C().bj((com.google.android.gms.car.lifecycle.CarActivityLayoutConfig) this.a);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.ref refVar = (defpackage.ref) this.a;
                if (!refVar.p(defpackage.rbf.t)) {
                    throw new java.lang.IllegalStateException("This API can only be used if multi-display is enabled");
                }
                if (defpackage.omv.c("CAR.CLIENT", 3)) {
                    defpackage.rrx.a("CAR.CLIENT", null, "Multi-display client enabled. RegisterCarActivityLifecycleEventListener");
                }
                refVar.j.E(new defpackage.rdq(this.b, 1));
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.qvl qvlVarC = ((defpackage.ref) this.a).C();
                java.lang.Object obj = this.b;
                if (!qvlVarC.by((android.content.Intent) obj)) {
                    throw new java.lang.IllegalArgumentException("No matching component for intent: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
                }
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.ref) this.b).C().bb((com.google.android.gms.car.display.CarRegionId) this.a);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.ref refVar2 = (defpackage.ref) this.a;
                if (!refVar2.p(defpackage.rbf.F)) {
                    throw new java.lang.IllegalStateException("This API can only be used if coolwalk is enabled");
                }
                if (defpackage.omv.c("CAR.CLIENT", 3)) {
                    defpackage.rrx.a("CAR.CLIENT", null, "RegisterCarActivityLifecycleEventProcessor");
                }
                refVar2.i.E(new defpackage.rdq(this.b, 0));
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.ref) this.a).h.E(new defpackage.rdq(this.b, 2));
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.lam) ((defpackage.ret) this.a).d).E(new defpackage.rdq(this.b, 3));
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                rif rifVar = (rif) this.a;
                ?? r1 = rifVar.c;
                ((rim) r1).a = (ajnd) this.b;
                rifVar.b.f(r1);
                return;
            case 9:
                ((rif) this.b).b.g((com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest) this.a);
                return;
            case 10:
                ((defpackage.rjf) this.a).b.n((com.google.android.gms.car.control.CarAction) this.b);
                return;
            case 11:
                ((defpackage.lam) ((rkn) this.a).a).E(new defpackage.rdq(this.b, 6));
                return;
            case 12:
                ((rkn) this.b).c.b(this.a);
                return;
            case 13:
                ((rko) this.a).a.e((com.google.android.gms.car.display.CarDisplayId) this.b);
                return;
            case 14:
                ((rko) this.a).a.f((com.google.android.gms.car.display.CarDisplayId) this.b);
                return;
            default:
                ((defpackage.rkq) this.a).b.c((com.google.android.gms.car.display.UiStyle) this.b);
                return;
        }
    }

    public /* synthetic */ rdp(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
