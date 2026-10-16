package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class jmy implements jnd {
    public final jne a;
    private final int b;

    public jmy(int i, jne jneVar) {
        this.b = i;
        this.a = jneVar;
    }

    private static final xio d(jmy jmyVar, xgi xgiVar, afec afecVar) {
        abnp abnpVarN = xin.a.n();
        abnpVarN.getClass();
        wox.R(xgiVar, abnpVarN);
        oct octVarZ = wox.Z(xgq.a.n());
        afecVar.invoke(octVarZ);
        wox.S(octVarZ.o(), abnpVarN);
        wox.T(abnpVarN);
        jmyVar.a.e(jnf.a(jmyVar.b, (short) -32763, wox.Q(abnpVarN), false));
        abnp abnpVarN2 = xio.a.n();
        abnpVarN2.getClass();
        wox.H(xgiVar, abnpVarN2);
        wox.I(xkr.STATUS_SUCCESS, abnpVarN2);
        return wox.G(abnpVarN2);
    }

    @Override // defpackage.jnd
    public final jcn a(int i, jcn jcnVar, boolean z) {
        boolean z2;
        xoe xoeVarT;
        xgq xgqVar;
        xio xioVarD;
        int i2 = this.b;
        if (i != i2) {
            return jcnVar;
        }
        jcnVar.q(0);
        short sJ = jcnVar.j();
        char c = (char) sJ;
        byte[] bArr = null;
        if (!z) {
            int iF = wox.F(c);
            if (iF == 0) {
                ((ype) jnf.a.g()).y("Received message type that did not match existing CarControlMessageId: %d", new afah(sJ));
                return null;
            }
            xgm xgmVar = xgm.UNKNOWN;
            int i3 = 16;
            int i4 = 4;
            if (iF == 32769) {
                xod xodVar = (xod) abnv.w(xod.a, jcnVar.h());
                xodVar.getClass();
                if (acrz.p()) {
                    xgi xgiVar = xodVar.c;
                    if (xgiVar == null) {
                        xgiVar = xgi.a;
                    }
                    xgm xgmVarB = xgm.b(xgiVar.c);
                    if (xgmVarB == null) {
                        xgmVarB = xgm.UNRECOGNIZED;
                    }
                    if (xgmVarB == xgm.HVAC_FAN_SPEED) {
                        if ((xodVar.b & 2) != 0) {
                            xgqVar = xodVar.d;
                            if (xgqVar == null) {
                                xgqVar = xgq.a;
                            }
                        } else {
                            xgqVar = null;
                        }
                        if (xgqVar != null && (xgqVar.b != 1 || ((Integer) xgqVar.c).intValue() == 0)) {
                            jne jneVar = this.a;
                            xin xinVar = xin.a;
                            abnp abnpVarN = xinVar.n();
                            abnpVarN.getClass();
                            xgi xgiVar2 = xgi.a;
                            abnp abnpVarN2 = xgiVar2.n();
                            abnpVarN2.getClass();
                            wox.L(xgm.HMG_HVAC_TEMPERATURE_SET_CELSIUS, abnpVarN2);
                            xgi xgiVar3 = xodVar.c;
                            if (xgiVar3 == null) {
                                xgiVar3 = xgiVar2;
                            }
                            xgj xgjVar = xgiVar3.d;
                            if (xgjVar == null) {
                                xgjVar = xgj.f;
                            }
                            xgjVar.getClass();
                            wox.K(xgjVar, abnpVarN2);
                            wox.R(wox.J(abnpVarN2), abnpVarN);
                            xgq xgqVar2 = xgq.a;
                            oct octVarZ = wox.Z(xgqVar2.n());
                            octVarZ.q(BitmapDescriptorFactory.HUE_RED);
                            wox.S(octVarZ.o(), abnpVarN);
                            wox.T(abnpVarN);
                            jneVar.e(jnf.a(i2, (short) -32763, wox.Q(abnpVarN), false));
                            abnp abnpVarN3 = xinVar.n();
                            abnpVarN3.getClass();
                            abnp abnpVarN4 = xgiVar2.n();
                            abnpVarN4.getClass();
                            wox.L(xgm.HMG_HVAC_TEMPERATURE_SET_FAHRENHEIT, abnpVarN4);
                            xgi xgiVar4 = xodVar.c;
                            if (xgiVar4 != null) {
                                xgiVar2 = xgiVar4;
                            }
                            xgj xgjVar2 = xgiVar2.d;
                            if (xgjVar2 == null) {
                                xgjVar2 = xgj.f;
                            }
                            xgjVar2.getClass();
                            wox.K(xgjVar2, abnpVarN4);
                            wox.R(wox.J(abnpVarN4), abnpVarN3);
                            oct octVarZ2 = wox.Z(xgqVar2.n());
                            octVarZ2.q(BitmapDescriptorFactory.HUE_RED);
                            wox.S(octVarZ2.o(), abnpVarN3);
                            wox.T(abnpVarN3);
                            jneVar.e(jnf.a(i2, (short) -32763, wox.Q(abnpVarN3), false));
                        }
                    }
                }
                xgi xgiVar5 = xodVar.c;
                if (xgiVar5 == null) {
                    xgiVar5 = xgi.a;
                }
                xgm xgmVarB2 = xgm.b(xgiVar5.c);
                if (xgmVarB2 == null) {
                    xgmVarB2 = xgm.UNRECOGNIZED;
                }
                int iOrdinal = xgmVarB2.ordinal();
                if (iOrdinal == 1 || iOrdinal == 12 || iOrdinal == 14 || iOrdinal == 16 || iOrdinal == 22 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 9 || iOrdinal == 10 || iOrdinal == 24 || iOrdinal == 25) {
                    jne jneVar2 = this.a;
                    abnp abnpVarN5 = xin.a.n();
                    abnpVarN5.getClass();
                    xgi xgiVar6 = xodVar.c;
                    if (xgiVar6 == null) {
                        xgiVar6 = xgi.a;
                    }
                    xgiVar6.getClass();
                    wox.R(xgiVar6, abnpVarN5);
                    xgq xgqVar3 = xodVar.d;
                    if (xgqVar3 == null) {
                        xgqVar3 = xgq.a;
                    }
                    xgqVar3.getClass();
                    wox.S(xgqVar3, abnpVarN5);
                    wox.T(abnpVarN5);
                    jneVar2.e(jnf.a(i2, (short) -32763, wox.Q(abnpVarN5), false));
                    abnp abnpVarN6 = xoe.a.n();
                    abnpVarN6.getClass();
                    xgi xgiVar7 = xodVar.c;
                    if (xgiVar7 == null) {
                        xgiVar7 = xgi.a;
                    }
                    xgiVar7.getClass();
                    wox.v(xgiVar7, abnpVarN6);
                    z2 = false;
                    wox.u(0, abnpVarN6);
                    String str = xodVar.e;
                    str.getClass();
                    wox.w(str, abnpVarN6);
                    wox.x(xkr.STATUS_SUCCESS, abnpVarN6);
                    xoeVarT = wox.t(abnpVarN6);
                } else {
                    abnp abnpVarN7 = xoe.a.n();
                    abnpVarN7.getClass();
                    xgi xgiVar8 = xodVar.c;
                    if (xgiVar8 == null) {
                        xgiVar8 = xgi.a;
                    }
                    xgiVar8.getClass();
                    wox.v(xgiVar8, abnpVarN7);
                    wox.u(3, abnpVarN7);
                    String str2 = xodVar.e;
                    str2.getClass();
                    wox.w(str2, abnpVarN7);
                    wox.x(xkr.STATUS_CAR_PROPERTY_SET_REQUEST_FAILED, abnpVarN7);
                    xoeVarT = wox.t(abnpVarN7);
                    z2 = false;
                }
                this.a.e(jnf.a(i2, (short) -32766, xoeVarT, z2));
                return null;
            }
            if (iF == 32771) {
                xnm xnmVar = (xnm) abnv.w(xnm.a, jcnVar.h());
                xnmVar.getClass();
                abnp abnpVarN8 = xnn.a.n();
                abnpVarN8.getClass();
                DesugarCollections.unmodifiableList(((xnn) abnpVarN8.b).b).getClass();
                aboh<xgi> abohVar = xnmVar.b;
                abohVar.getClass();
                ArrayList arrayList = new ArrayList(woy.bp(abohVar, 10));
                for (xgi xgiVar9 : abohVar) {
                    xgm xgmVarB3 = xgm.b(xgiVar9.c);
                    if (xgmVarB3 == null) {
                        xgmVarB3 = xgm.UNRECOGNIZED;
                    }
                    switch (xgmVarB3.ordinal()) {
                        case 1:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(8));
                            continue;
                            arrayList.add(xioVarD);
                            i3 = 16;
                        case 2:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(17));
                            break;
                        case 3:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(18));
                            break;
                        case 4:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(6));
                            break;
                        case 5:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(3));
                            break;
                        case 6:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(11));
                            break;
                        case 7:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(12));
                            break;
                        case 8:
                        case 11:
                        case 13:
                        case 15:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        default:
                            abnp abnpVarN9 = xio.a.n();
                            abnpVarN9.getClass();
                            xgiVar9.getClass();
                            wox.H(xgiVar9, abnpVarN9);
                            wox.I(xkr.STATUS_CAR_PROPERTY_LISTENER_REGISTRATION_FAILED, abnpVarN9);
                            xioVarD = wox.G(abnpVarN9);
                            continue;
                            arrayList.add(xioVarD);
                            i3 = 16;
                        case 9:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(7));
                            break;
                        case 10:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(10));
                            break;
                        case 12:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(9));
                            break;
                        case 14:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(4));
                            break;
                        case 16:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(5));
                            break;
                        case 22:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(13));
                            break;
                        case 23:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(14));
                            break;
                        case 24:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(15));
                            break;
                        case 25:
                            xgiVar9.getClass();
                            xioVarD = d(this, xgiVar9, new hkh(i3));
                            break;
                    }
                    arrayList.add(xioVarD);
                    i3 = 16;
                }
                abnpVarN8.t();
                xnn xnnVar = (xnn) abnpVarN8.b;
                aboh abohVar2 = xnnVar.b;
                if (!abohVar2.c()) {
                    xnnVar.b = abnv.I(abohVar2);
                }
                abmc.i(arrayList, xnnVar.b);
                abnv abnvVarQ = abnpVarN8.q();
                abnvVarQ.getClass();
                this.a.e(jnf.a(i2, (short) -32764, (xnn) abnvVarQ, false));
                return null;
            }
            if (iF != 32774) {
                ((ype) jnf.a.g()).y("Received unexpected car control message %s", wox.E(iF));
            } else {
                szp.u(new jlh(jcnVar, this, i4, bArr));
            }
        } else if (c == 7) {
            jnf.a.l().u("Sending channel open response");
            jne jneVar3 = this.a;
            abnp abnpVarN10 = xir.a.n();
            abnpVarN10.getClass();
            xkr xkrVar = xkr.STATUS_SUCCESS;
            abnpVarN10.t();
            xir xirVar = (xir) abnpVarN10.b;
            xirVar.c = xkrVar.I;
            xirVar.b |= 1;
            abnv abnvVarQ2 = abnpVarN10.q();
            abnvVarQ2.getClass();
            jneVar3.e(jnf.a(i2, (short) 8, (xir) abnvVarQ2, true));
        } else if (c != '\t') {
            throw new IllegalArgumentException(a.bp(c, "Unknown control message type: "));
        }
        return null;
    }

    @Override // defpackage.jnd
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.jnd
    public final /* synthetic */ ByteBuffer c(ByteBuffer byteBuffer) {
        return byteBuffer;
    }
}
