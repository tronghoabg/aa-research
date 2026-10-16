package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xgy extends defpackage.omf {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.GearheadCallNotifica");
    public boolean b;
    public final android.content.Context c;
    public final defpackage.oed d;
    public defpackage.qsb e;
    public final defpackage.qyn f;
    public final defpackage.kfp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgy(android.content.Context context) {
        super(null);
        defpackage.oed oedVar = (defpackage.oed) defpackage.mkp.a.i(defpackage.oed.class);
        this.f = new defpackage.qyn(this);
        this.g = new defpackage.xgv(this);
        this.d = oedVar;
        context.getClass();
        this.c = context;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    private final void A(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws rlo {
        if (defpackage.mkc.Q().g(carCall)) {
            return;
        }
        z();
    }

    public static defpackage.xgy p() {
        return defpackage.wzc.a.c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @Override // defpackage.omf
    public final void a(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws rlo {
        A(carCall);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @Override // defpackage.omf
    public final void b(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws rlo {
        A(carCall);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @Override // defpackage.omf
    public final void c(com.google.android.apps.auto.components.telecom.call.CarCall carCall, int i) throws rlo {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 10301)).w("onStateChanged: state=%d", i);
        A(carCall);
    }

    public final void y() {
        defpackage.qsb qsbVar = this.e;
        if (qsbVar != null && qsbVar.a()) {
            defpackage.qyn qynVar = this.f;
            if (qsbVar.b == null) {
                throw new java.lang.IllegalStateException("Cannot remove CarPhoneStatusEventListener if carPhoneStatus is null");
            }
            ((defpackage.rps) qsbVar.c).c(new defpackage.rdt(qsbVar, qynVar, 1));
        }
        this.e = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, qyl] */
    public final void z() throws rlo {
        long j;
        long epochMilli;
        int i;
        defpackage.oed oedVar = this.d;
        java.util.List listK = oedVar.k();
        com.google.android.gms.car.CarPhoneStatus carPhoneStatus = new com.google.android.gms.car.CarPhoneStatus();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < listK.size(); i2++) {
            com.google.android.apps.auto.components.telecom.call.CarCall carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) listK.get(i2);
            if (!defpackage.mkc.Q().g(carCall)) {
                com.google.android.gms.car.CarPhoneStatus.CarCall carCall2 = new com.google.android.gms.car.CarPhoneStatus.CarCall();
                if (carCall == null) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 10304)).u("CarCall is null. Skipping.");
                } else {
                    switch (carCall.e) {
                        case defpackage.abnt.b /* 0 */:
                        case 1:
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                            i = 1;
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            i = 4;
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            i = 2;
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        default:
                            if (carCall.b != null) {
                                carCall2.a = 5;
                            }
                            if (oedVar.z(carCall.a)) {
                                carCall2.a = 6;
                            }
                            j = carCall.f.d;
                            epochMilli = 0;
                            if (j > 0) {
                                defpackage.ojm.a();
                                epochMilli = (j$.time.Instant.now().toEpochMilli() - j) / 1000;
                            }
                            carCall2.b = (int) epochMilli;
                            java.lang.String strU = defpackage.oeh.a().u(carCall);
                            android.content.Context context = this.c;
                            carCall2.c = defpackage.oeh.a().r(context, strU);
                            carCall2.d = defpackage.oeh.a().p(context, carCall);
                            carCall2.e = defpackage.oeh.a().m(context, strU).toString();
                            hsc.c(context).b().f(jvb.d().b(carCall2.c, carCall2.d)).q(new xgw(carCall2));
                            arrayList.add(carCall2);
                            continue;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        case 10:
                            i = 3;
                            break;
                    }
                    carCall2.a = i;
                    if (carCall.b != null) {
                        carCall2.a = 5;
                    }
                    if (oedVar.z(carCall.a)) {
                        carCall2.a = 6;
                    }
                    j = carCall.f.d;
                    epochMilli = 0;
                    if (j > 0) {
                        defpackage.ojm.a();
                        epochMilli = (j$.time.Instant.now().toEpochMilli() - j) / 1000;
                    }
                    carCall2.b = (int) epochMilli;
                    java.lang.String strU2 = defpackage.oeh.a().u(carCall);
                    android.content.Context context2 = this.c;
                    carCall2.c = defpackage.oeh.a().r(context2, strU2);
                    carCall2.d = defpackage.oeh.a().p(context2, carCall);
                    carCall2.e = defpackage.oeh.a().m(context2, strU2).toString();
                    hsc.c(context2).b().f(jvb.d().b(carCall2.c, carCall2.d)).q(new xgw(carCall2));
                    arrayList.add(carCall2);
                    continue;
                }
            }
        }
        carPhoneStatus.a = (com.google.android.gms.car.CarPhoneStatus.CarCall[]) arrayList.toArray(new com.google.android.gms.car.CarPhoneStatus.CarCall[arrayList.size()]);
        try {
            defpackage.qsb qsbVar = this.e;
            if (qsbVar == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(10303)).u("carCallManager is null while updating remote status.");
                return;
            }
            if (qsbVar.b()) {
                defpackage.qsb qsbVar2 = this.e;
                if (!qsbVar2.b()) {
                    throw new defpackage.qsu("Car does not support telephony status.");
                }
                try {
                    qsbVar2.b.g(carPhoneStatus);
                } catch (android.os.RemoteException e) {
                    defpackage.oml.I(e);
                } catch (java.lang.IllegalArgumentException e2) {
                    defpackage.rrx.b("CAR.TEL.Manager", e2, "Error sending phone status.");
                } catch (java.lang.IllegalStateException e3) {
                    defpackage.oml.G(e3);
                }
            }
        } catch (defpackage.qst | defpackage.qsu e4) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e4)).ai((char) 10302)).u("Unable to update CarPhoneStatus");
        }
    }
}
