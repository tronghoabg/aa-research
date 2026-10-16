package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class raa extends defpackage.ijw implements defpackage.rab {
    public final java.lang.Object a;
    public volatile defpackage.inc b;
    public final java.util.List c;
    private final java.lang.ref.WeakReference d;
    private final defpackage.jfe e;

    public raa(defpackage.inh inhVar, defpackage.jfe jfeVar) {
        super("com.google.android.gms.car.ICarWindowManager");
        this.a = new java.lang.Object();
        this.c = new java.util.ArrayList();
        this.d = new java.lang.ref.WeakReference(inhVar);
        this.e = jfeVar;
    }

    public final void a(qxd qxdVar) {
        this.e.ao();
        ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai((char) 451)).u("FRAME DEBUG disabled!");
        synchronized (this.a) {
            this.b.getClass();
            defpackage.ysr.bk(((defpackage.ijv) this.b.a).asBinder().equals(qxdVar.asBinder()), "Some other client is using the frame debug callback.");
            qxdVar.asBinder().unlinkToDeath(this.b, 0);
            this.b = null;
        }
        defpackage.inh inhVar = (defpackage.inh) this.d.get();
        if (inhVar != null) {
            inhVar.ad();
        }
    }

    @Override // defpackage.rab
    public final int e() {
        defpackage.jkr jkrVar = (defpackage.jkr) this.d.get();
        if (jkrVar != null) {
            return jkrVar.d();
        }
        return 0;
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        qxd qzqVar = null;
        switch (i) {
            case 1:
                boolean zP = p();
                parcel2.writeNoException();
                java.lang.ClassLoader classLoader = defpackage.ijx.a;
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    qxd qxdVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarVideoFocusListener");
                    qzqVar = qxdVarQueryLocalInterface instanceof defpackage.qzs ? (defpackage.qzs) qxdVarQueryLocalInterface : new qzq(strongBinder);
                }
                defpackage.ijx.d(parcel);
                h(qzqVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    qxd qxdVarQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarVideoFocusListener");
                    qzqVar = qxdVarQueryLocalInterface2 instanceof defpackage.qzs ? (defpackage.qzs) qxdVarQueryLocalInterface2 : new qzq(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                k(qzqVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                defpackage.inh inhVar = (defpackage.inh) this.d.get();
                if (inhVar != null) {
                    inhVar.x.e(i2);
                }
                parcel2.writeNoException();
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null || (strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarInputCallback") instanceof qxl)) {
                }
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null || (strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarInputCallback") instanceof qxl)) {
                }
                defpackage.ijx.d(parcel);
                throw new java.lang.UnsupportedOperationException();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                l();
                parcel2.writeNoException();
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.String string = parcel.readString();
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams = (com.google.android.gms.car.CarWindowLayoutParams) defpackage.ijx.a(parcel, com.google.android.gms.car.CarWindowLayoutParams.CREATOR);
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    qxd qxdVarQueryLocalInterface3 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarWindowCallback");
                    qzqVar = qxdVarQueryLocalInterface3 instanceof defpackage.qzy ? (defpackage.qzy) qxdVarQueryLocalInterface3 : new defpackage.qzw(strongBinder5);
                }
                defpackage.ijx.d(parcel);
                defpackage.qzv qzvVarG = g(new com.google.android.gms.car.CarWindowSpec(string, string2, carWindowLayoutParams, 0), qzqVar);
                parcel2.writeNoException();
                defpackage.ijx.i(parcel2, qzvVarG);
                return true;
            case 9:
                android.graphics.Point pointF = f();
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, pointF);
                return true;
            case 10:
                int iE = e();
                parcel2.writeNoException();
                parcel2.writeInt(iE);
                return true;
            case 11:
                com.google.android.gms.car.CarWindowSpec carWindowSpec = (com.google.android.gms.car.CarWindowSpec) defpackage.ijx.a(parcel, com.google.android.gms.car.CarWindowSpec.CREATOR);
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    qxd qxdVarQueryLocalInterface4 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarWindowCallback");
                    qzqVar = qxdVarQueryLocalInterface4 instanceof defpackage.qzy ? (defpackage.qzy) qxdVarQueryLocalInterface4 : new defpackage.qzw(strongBinder6);
                }
                defpackage.ijx.d(parcel);
                defpackage.qzv qzvVarG2 = g(carWindowSpec, qzqVar);
                parcel2.writeNoException();
                defpackage.ijx.i(parcel2, qzvVarG2);
                return true;
            case 12:
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    qxd qxdVarQueryLocalInterface5 = strongBinder7.queryLocalInterface("com.google.android.gms.car.ICarFrameDebugCallback");
                    qzqVar = qxdVarQueryLocalInterface5 instanceof qxd ? qxdVarQueryLocalInterface5 : new qxd(strongBinder7);
                }
                defpackage.ijx.d(parcel);
                this.e.ao();
                ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai((char) 446)).u("FRAME DEBUG enabled!");
                synchronized (this.a) {
                    defpackage.ysr.bk(this.b == null, "Some other client is using the frame debug callback.");
                    try {
                        defpackage.inc incVar = new defpackage.inc(qzqVar, this, 0);
                        qzqVar.asBinder().linkToDeath(incVar, 0);
                        this.b = incVar;
                        break;
                    } catch (android.os.RemoteException unused) {
                    }
                    break;
                }
                defpackage.inh inhVar2 = (defpackage.inh) this.d.get();
                if (inhVar2 != null) {
                    inhVar2.ad();
                }
                parcel2.writeNoException();
                return true;
            case 13:
                android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    qxd qxdVarQueryLocalInterface6 = strongBinder8.queryLocalInterface("com.google.android.gms.car.ICarFrameDebugCallback");
                    qzqVar = qxdVarQueryLocalInterface6 instanceof qxd ? qxdVarQueryLocalInterface6 : new qxd(strongBinder8);
                }
                defpackage.ijx.d(parcel);
                a(qzqVar);
                parcel2.writeNoException();
                return true;
            case 14:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                defpackage.ijx.d(parcel);
                m(i3, i4);
                parcel2.writeNoException();
                return true;
            case 15:
                com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) defpackage.ijx.a(parcel, com.google.android.gms.car.display.CarRegionId.CREATOR);
                android.view.KeyEvent keyEvent = (android.view.KeyEvent) defpackage.ijx.a(parcel, android.view.KeyEvent.CREATOR);
                defpackage.ijx.d(parcel);
                i(carRegionId, keyEvent);
                parcel2.writeNoException();
                return true;
            case 16:
                android.os.IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    qxd qxdVarQueryLocalInterface7 = strongBinder9.queryLocalInterface("com.google.android.gms.car.ICarGestureListener");
                    qzqVar = qxdVarQueryLocalInterface7 instanceof defpackage.qxk ? (defpackage.qxk) qxdVarQueryLocalInterface7 : new qxi(strongBinder9);
                }
                defpackage.ijx.d(parcel);
                j(qzqVar);
                parcel2.writeNoException();
                return true;
            case 17:
                android.os.IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    qxd qxdVarQueryLocalInterface8 = strongBinder10.queryLocalInterface("com.google.android.gms.car.ICarGestureListener");
                    qzqVar = qxdVarQueryLocalInterface8 instanceof defpackage.qxk ? (defpackage.qxk) qxdVarQueryLocalInterface8 : new qxi(strongBinder10);
                }
                defpackage.ijx.d(parcel);
                o(qzqVar);
                parcel2.writeNoException();
                return true;
            case 18:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                defpackage.ijx.d(parcel);
                n(i5, i6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.rab
    public final android.graphics.Point f() {
        defpackage.jkr jkrVar = (defpackage.jkr) this.d.get();
        if (jkrVar != null) {
            return jkrVar.h();
        }
        return null;
    }

    @Override // defpackage.rab
    public final defpackage.qzv g(com.google.android.gms.car.CarWindowSpec carWindowSpec, defpackage.qzy qzyVar) throws android.os.RemoteException {
        defpackage.jhe jheVar;
        try {
            defpackage.inh inhVar = (defpackage.inh) this.d.get();
            if (inhVar != null) {
                java.lang.String str = carWindowSpec.a;
                java.lang.String str2 = carWindowSpec.b;
                com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams = carWindowSpec.c;
                int i = carWindowSpec.d;
                ((defpackage.yqj) defpackage.inh.a.l().ai((char) 483)).y("createCarWindow %s", str);
                synchronized (inhVar.ab) {
                    try {
                        try {
                            jheVar = new defpackage.jhe(str, str2, carWindowLayoutParams, inhVar, qzyVar, i, inhVar.m, inhVar.ag, inhVar.as, inhVar.i);
                            com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams2 = jheVar.g;
                            if (carWindowLayoutParams2.j.a > 0 || carWindowLayoutParams2.k.a > 0) {
                                android.content.Context contextU = jheVar.u(jheVar.c);
                                if (contextU == null) {
                                    throw new java.lang.IllegalArgumentException("Failed to init window");
                                }
                                com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams = jheVar.g.j;
                                if (projectionWindowAnimationParams.a > 0) {
                                    jheVar.j = ((defpackage.inh) jheVar.d).Y.b(contextU, projectionWindowAnimationParams, jheVar.t(), jheVar.s());
                                }
                                com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams2 = jheVar.g.k;
                                if (projectionWindowAnimationParams2.a > 0) {
                                    jheVar.k = ((defpackage.inh) jheVar.d).Y.b(contextU, projectionWindowAnimationParams2, jheVar.t(), jheVar.s());
                                }
                            }
                            inhVar.ac.add(jheVar);
                            defpackage.jhi jhiVar = inhVar.w;
                            defpackage.ina inaVar = inhVar.s;
                            if (inaVar != null && jhiVar != null) {
                                boolean zR = defpackage.acwv.a.fF().r();
                                if (!zR || jheVar.h == null) {
                                    jheVar.r(jhiVar);
                                    if (!zR) {
                                        ((defpackage.yqj) defpackage.inh.a.l().ai(484)).y("createCarWindow initializing %s", jheVar);
                                        inaVar.g(jheVar.h);
                                    }
                                } else {
                                    ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai(486)).y("Window for %s already created, skipping", jheVar);
                                }
                                if (jheVar.q()) {
                                    ((defpackage.yqj) defpackage.inh.a.l().ai(484)).y("createCarWindow initializing %s", jheVar);
                                    inaVar.g(jheVar.h);
                                } else {
                                    ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai(485)).y("Window for %s already initialized, skipping", jheVar);
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    } catch (android.os.RemoteException e) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.g()).p(e)).ai(487)).u("Error creating CarWindow: RemoteException");
                        return null;
                    }
                }
                return jheVar.u;
            }
        } catch (java.lang.Exception e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.g()).p(e2)).ai((char) 445)).u("createCarWindow exception");
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, qzs] */
    @Override // defpackage.rab
    public final void h(defpackage.qzs qzsVar) {
        synchronized (this.a) {
            java.util.List list = this.c;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((defpackage.inc) it.next()).a.asBinder().equals(qzsVar.asBinder())) {
                    return;
                }
            }
            try {
                list.add(new defpackage.inc(qzsVar, this, 1));
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @Override // defpackage.rab
    public final void i(com.google.android.gms.car.display.CarRegionId carRegionId, android.view.KeyEvent keyEvent) {
        defpackage.jhl jhlVarK;
        defpackage.inh inhVar = (defpackage.inh) this.d.get();
        if (inhVar == null || (jhlVarK = inhVar.k(carRegionId, false)) == null) {
            return;
        }
        jhlVarK.N(keyEvent);
    }

    @Override // defpackage.rab
    public final void j(defpackage.qxk qxkVar) {
        defpackage.inh inhVar = (defpackage.inh) this.d.get();
        if (inhVar == null) {
            return;
        }
        inhVar.am.c(qxkVar);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, qzs] */
    @Override // defpackage.rab
    public final void k(defpackage.qzs qzsVar) {
        defpackage.inc incVar;
        synchronized (this.a) {
            java.util.List list = this.c;
            java.util.Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    incVar = null;
                    break;
                }
                incVar = (defpackage.inc) it.next();
            } while (!incVar.a.asBinder().equals(qzsVar.asBinder()));
            if (incVar != null) {
                qzsVar.asBinder().unlinkToDeath(incVar, 0);
                list.remove(incVar);
            }
        }
    }

    @Override // defpackage.rab
    public final void l() {
        defpackage.jkr jkrVar;
        if (p() || (jkrVar = (defpackage.jkr) this.d.get()) == null) {
            return;
        }
        jkrVar.U();
    }

    @Override // defpackage.rab
    public final void m(int i, int i2) {
        defpackage.yqm yqmVar = defpackage.inh.a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(447)).B("setBackgroundColors darkBackgroundColor: %08X lightBackgroundColor: %08X", i, i2);
        defpackage.inh inhVar = (defpackage.inh) this.d.get();
        if (inhVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 448)).u("ProjectionWindowManager was null when setting background colors");
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 449)).u("ProjectionWindowManager available, setting background colors.");
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(493)).B("Immediately updating background colors to %08X and %08X", i, i2);
        inhVar.F = new defpackage.tlk(i, i2);
        new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.bgf(inhVar, 12));
    }

    @Override // defpackage.rab
    public final void n(int i, int i2) {
        defpackage.inh inhVar = (defpackage.inh) this.d.get();
        if (inhVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.h()).ai((char) 450)).u("ProjectionWindowManager was null when setting border colors");
        } else {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.f()).ai(575)).B("Update border colors to dark theme %08X and light theme %08X", i, i2);
            inhVar.ae = new defpackage.tlk(i, i2);
        }
    }

    @Override // defpackage.rab
    public final void o(defpackage.qxk qxkVar) {
        defpackage.inh inhVar = (defpackage.inh) this.d.get();
        if (inhVar == null) {
            return;
        }
        inhVar.am.d(qxkVar);
    }

    @Override // defpackage.rab
    public final boolean p() {
        defpackage.jkr jkrVar = (defpackage.jkr) this.d.get();
        return jkrVar != null && jkrVar.ae();
    }
}
