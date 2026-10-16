package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class rct implements rzd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rct(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v54, types: [java.lang.Object, rkm] */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.lang.Object, rkj] */
    @Override // defpackage.rzd, java.util.concurrent.Callable
    public final Object call() throws RemoteException {
        switch (this.b) {
            case 0:
                qup qupVarC = ((rdj) this.a).C();
                int i = yfq.d;
                return ygr.n(qupVarC.ad("car_module_feature_set", yls.a));
            case 1:
                return ((rdj) this.a).C().aa();
            case 2:
                final rdj rdjVar = (rdj) this.a;
                final int i2 = 1;
                return (rjt) rdjVar.g.b(rjt.class, new rdn() { // from class: rcr
                    @Override // defpackage.rdn
                    public final Object a() throws RemoteException {
                        int i3 = i2;
                        if (i3 == 0) {
                            rdj rdjVar2 = rdjVar;
                            qyh qyhVarJ = rdjVar2.C().J();
                            qyhVarJ.getClass();
                            return new roj(qyhVarJ, rdjVar2.c);
                        }
                        rdj rdjVar3 = rdjVar;
                        if (i3 != 1) {
                            if (i3 == 2) {
                                return new rij(rdjVar3.C().O());
                            }
                            rkm rkmVarT = rdjVar3.C().T();
                            rkmVarT.getClass();
                            return new rju(rkmVarT);
                        }
                        if (!rdjVar3.p(raj.t)) {
                            return new rkq(rdjVar3.C().L(), rdjVar3.d);
                        }
                        if (omc.c("CAR.CLIENT", 3)) {
                            boolean z = rrd.a;
                            rrd.d(3, "CAR.CLIENT", null, "Multi-display client enabled. Get ICarDisplayManager", new Object[0]);
                        }
                        rkj rkjVarS = rdjVar3.C().S();
                        rkjVarS.getClass();
                        return new rkr(rkjVarS);
                    }
                });
            case 3:
                final rdj rdjVar2 = (rdj) this.a;
                if (!rdjVar2.p(raj.U)) {
                    throw new IllegalStateException("This API can only be used if the hero theming feature is enabled");
                }
                final int i3 = 3;
                return (rju) rdjVar2.g.b(rju.class, new rdn() { // from class: rcr
                    @Override // defpackage.rdn
                    public final Object a() throws RemoteException {
                        int i32 = i3;
                        if (i32 == 0) {
                            rdj rdjVar22 = rdjVar2;
                            qyh qyhVarJ = rdjVar22.C().J();
                            qyhVarJ.getClass();
                            return new roj(qyhVarJ, rdjVar22.c);
                        }
                        rdj rdjVar3 = rdjVar2;
                        if (i32 != 1) {
                            if (i32 == 2) {
                                return new rij(rdjVar3.C().O());
                            }
                            rkm rkmVarT = rdjVar3.C().T();
                            rkmVarT.getClass();
                            return new rju(rkmVarT);
                        }
                        if (!rdjVar3.p(raj.t)) {
                            return new rkq(rdjVar3.C().L(), rdjVar3.d);
                        }
                        if (omc.c("CAR.CLIENT", 3)) {
                            boolean z = rrd.a;
                            rrd.d(3, "CAR.CLIENT", null, "Multi-display client enabled. Get ICarDisplayManager", new Object[0]);
                        }
                        rkj rkjVarS = rdjVar3.C().S();
                        rkjVarS.getClass();
                        return new rkr(rkjVarS);
                    }
                });
            case 4:
                final rdj rdjVar3 = (rdj) this.a;
                final int i4 = 0;
                return (roj) rdjVar3.g.b(roj.class, new rdn() { // from class: rcr
                    @Override // defpackage.rdn
                    public final Object a() throws RemoteException {
                        int i32 = i4;
                        if (i32 == 0) {
                            rdj rdjVar22 = rdjVar3;
                            qyh qyhVarJ = rdjVar22.C().J();
                            qyhVarJ.getClass();
                            return new roj(qyhVarJ, rdjVar22.c);
                        }
                        rdj rdjVar32 = rdjVar3;
                        if (i32 != 1) {
                            if (i32 == 2) {
                                return new rij(rdjVar32.C().O());
                            }
                            rkm rkmVarT = rdjVar32.C().T();
                            rkmVarT.getClass();
                            return new rju(rkmVarT);
                        }
                        if (!rdjVar32.p(raj.t)) {
                            return new rkq(rdjVar32.C().L(), rdjVar32.d);
                        }
                        if (omc.c("CAR.CLIENT", 3)) {
                            boolean z = rrd.a;
                            rrd.d(3, "CAR.CLIENT", null, "Multi-display client enabled. Get ICarDisplayManager", new Object[0]);
                        }
                        rkj rkjVarS = rdjVar32.C().S();
                        rkjVarS.getClass();
                        return new rkr(rkjVarS);
                    }
                });
            case 5:
                return ((rdj) this.a).C().s();
            case 6:
                final rdj rdjVar4 = (rdj) this.a;
                if (!rdjVar4.p(raj.Q)) {
                    throw new IllegalStateException("This API can only be used if the hero car controls feature is enabled");
                }
                final int i5 = 2;
                return (rij) rdjVar4.g.b(rij.class, new rdn() { // from class: rcr
                    @Override // defpackage.rdn
                    public final Object a() throws RemoteException {
                        int i32 = i5;
                        if (i32 == 0) {
                            rdj rdjVar22 = rdjVar4;
                            qyh qyhVarJ = rdjVar22.C().J();
                            qyhVarJ.getClass();
                            return new roj(qyhVarJ, rdjVar22.c);
                        }
                        rdj rdjVar32 = rdjVar4;
                        if (i32 != 1) {
                            if (i32 == 2) {
                                return new rij(rdjVar32.C().O());
                            }
                            rkm rkmVarT = rdjVar32.C().T();
                            rkmVarT.getClass();
                            return new rju(rkmVarT);
                        }
                        if (!rdjVar32.p(raj.t)) {
                            return new rkq(rdjVar32.C().L(), rdjVar32.d);
                        }
                        if (omc.c("CAR.CLIENT", 3)) {
                            boolean z = rrd.a;
                            rrd.d(3, "CAR.CLIENT", null, "Multi-display client enabled. Get ICarDisplayManager", new Object[0]);
                        }
                        rkj rkjVarS = rdjVar32.C().S();
                        rkjVarS.getClass();
                        return new rkr(rkjVarS);
                    }
                });
            case 7:
                return ((sgk) ((rdx) this.a).e).b().a();
            case 8:
                return ((sgk) ((rdx) this.a).e).b().c();
            case 9:
                return ((sgk) ((rdx) this.a).e).b().g();
            case 10:
                return Integer.valueOf(this.a.a());
            default:
                return this.a.f();
        }
    }
}
