package defpackage;

import android.os.RemoteException;
import androidx.car.app.model.Alert;
import com.google.android.gms.car.control.CarAction;
import com.google.android.gms.car.control.CarAreaId;
import com.google.android.gms.car.control.CarControl;
import com.google.android.gms.car.control.CarControlGroup;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.control.CarPropertyConfig;
import com.google.android.gms.car.control.CarPropertyControl;
import com.google.android.gms.car.control.CarPropertyState;
import com.google.android.gms.car.control.CarPropertyValue;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ijv extends ril implements jbo, iym {
    public static final yph a = yph.c("CAR.CarControlService");
    private volatile boolean d;
    private final jer e;
    private iyn f;
    private final ymf g = new yez(null);
    private final Map h = new HashMap();
    public final Set b = new HashSet();
    public final Map c = new ConcurrentHashMap();
    private final List i = new ArrayList();
    private final Set j = new HashSet();
    private final Map k = new HashMap();
    private final ymf l = new yez(null);
    private final List m = new ArrayList();
    private final String n = Integer.toHexString(hashCode());

    public ijv(jer jerVar) {
        this.e = jerVar;
    }

    public static final xgi A(CarProperty carProperty) {
        abnp abnpVarN = xgi.a.n();
        int i = carProperty.a;
        abnpVarN.t();
        xgi xgiVar = (xgi) abnpVarN.b;
        xgiVar.b |= 1;
        xgiVar.c = i;
        CarAreaId carAreaId = carProperty.b;
        int i2 = carAreaId.a;
        int i3 = carAreaId.b;
        abnp abnpVarN2 = xgj.f.n();
        if (i3 == 0) {
            abnpVarN2.t();
            xgj xgjVar = (xgj) abnpVarN2.b;
            xgjVar.h = 0;
            xgjVar.g |= 1;
        } else if (i3 == 2) {
            Iterable$EL.forEach(D(i2, xgg.values()), new iju(abnpVarN2, 0));
        } else if (i3 == 3) {
            Iterable$EL.forEach(D(i2, xge.values()), new iju(abnpVarN2, 2));
        } else if (i3 == 4) {
            Iterable$EL.forEach(D(i2, xgc.values()), new iju(abnpVarN2, 3));
        } else if (i3 == 5) {
            Iterable$EL.forEach(D(i2, xgd.values()), new iju(abnpVarN2, 4));
        } else {
            if (i3 != 6) {
                throw new IllegalArgumentException(a.bp(i3, "Unexpected area type: "));
            }
            Iterable$EL.forEach(D(i2, xgf.values()), new iju(abnpVarN2, 5));
        }
        xgj xgjVar2 = (xgj) abnpVarN2.q();
        abnpVarN.t();
        xgi xgiVar2 = (xgi) abnpVarN.b;
        xgjVar2.getClass();
        xgiVar2.d = xgjVar2;
        xgiVar2.b |= 2;
        return (xgi) abnpVarN.q();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.List] */
    private final CarControlGroup B(xid xidVar) {
        CarAction carAction;
        Optional optionalOf;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = xidVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                int iY = wox.Y(xidVar.c);
                return new CarControlGroup(aclh.g(iY != 0 ? iY : 2), arrayList);
            }
            xic xicVar = (xic) it.next();
            int i = 1;
            boolean z = (xicVar.c & 1) != 0 ? xicVar.f : true;
            int iAz = a.az(xicVar.h);
            if (iAz == 0) {
                iAz = 2;
            }
            int iC = aclh.c(iAz);
            Stream map = Collection.EL.stream(new abof(xicVar.g, xic.a)).map(new ijt(3));
            int i2 = yfq.d;
            yfq yfqVar = (yfq) map.collect(ycm.a);
            int iOrdinal = xib.a(xicVar.d).ordinal();
            if (iOrdinal == 0) {
                xgl xglVar = xicVar.d == 1 ? (xgl) xicVar.e : xgl.a;
                xgi xgiVar = xglVar.c;
                if (xgiVar == null) {
                    xgiVar = xgi.a;
                }
                List list = this.m;
                CarProperty carPropertyZ = z(xgiVar);
                list.add(carPropertyZ);
                if (carPropertyZ.a == 358614275 && Collection.EL.stream(this.i).anyMatch(new hmd(2))) {
                    ype ypeVar = (ype) a.l().ai(114);
                    CarAreaId carAreaId = carPropertyZ.b;
                    ypeVar.w("Replacing HVAC_TEMPERATURE_SET temperature control property with HMG_HVAC_TEMPERATURE_SET_CELSIUS for area id %d", carAreaId.a);
                    carPropertyZ = new CarProperty(627081341, carAreaId);
                }
                if (!y(carPropertyZ)) {
                    ((ype) ((ype) a.h()).ai(113)).D("Car property control with id %s and area id %s is not supported by HU.", carPropertyZ.a, carPropertyZ.b);
                }
                CarProperty carPropertyZ2 = null;
                if ((2 & xglVar.b) != 0) {
                    xga xgaVar = xglVar.d;
                    if (xgaVar == null) {
                        xgaVar = xga.a;
                    }
                    carAction = new CarAction(xgaVar.c);
                } else {
                    carAction = null;
                }
                if ((xglVar.b & 4) != 0) {
                    xgi xgiVar2 = xglVar.e;
                    if (xgiVar2 == null) {
                        xgiVar2 = xgi.a;
                    }
                    carPropertyZ2 = z(xgiVar2);
                }
                optionalOf = Optional.of(new CarControl(new CarPropertyControl(carPropertyZ, carAction, carPropertyZ2), null, null, z, yfqVar, iC));
            } else if (iOrdinal == 1) {
                xga xgaVar2 = (xicVar.d == 2 ? (xhz) xicVar.e : xhz.a).c;
                if (xgaVar2 == null) {
                    xgaVar2 = xga.a;
                }
                optionalOf = Optional.of(new CarControl(null, new CarAction(xgaVar2.c), null, z, yfqVar, iC));
            } else {
                if (iOrdinal != 2) {
                    ((ype) a.l().ai('p')).y("CarControl has unsupported type: %s", xicVar);
                    throw new IllegalArgumentException("Car Control Type must be set");
                }
                optionalOf = Optional.of(new CarControl(null, null, B(xicVar.d == 3 ? (xid) xicVar.e : xid.a), z, yfqVar, iC));
            }
            iln ilnVar = new iln(arrayList, i);
            optionalOf.isPresent();
            ilnVar.a.add(optionalOf.get());
        }
    }

    private static CarPropertyConfig C(xgk xgkVar, Class cls) {
        int i = xgkVar.c;
        int i2 = xgkVar.g;
        int i3 = xgkVar.d;
        int i4 = xgkVar.e;
        new ArrayList();
        new ArrayList();
        new ArrayList();
        Stream map = Collection.EL.stream(xgkVar.f).map(new ijt(2));
        int i5 = yfq.d;
        Collector collector = ycm.a;
        return new CarPropertyConfig(i, i2, i3, i4, new ArrayList((List) map.collect(collector)), new ArrayList((List) Collection.EL.stream(xgkVar.i).map(new gjm(cls, 2)).collect(collector)), new ArrayList(xgkVar.h));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static yfq D(int i, Enum[] enumArr) {
        if (i == 0) {
            return yfq.q(0);
        }
        int i2 = yfq.d;
        yfl yflVar = new yfl(4);
        for (Object[] objArr : enumArr) {
            try {
                abnz abnzVar = (abnz) objArr;
                if ((abnzVar.a() & i) != 0) {
                    yflVar.i(Integer.valueOf(abnzVar.a()));
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return yflVar.g();
    }

    private final void E() {
        this.e.d();
        if (!this.d) {
            throw new IllegalStateException("CarNotConnected");
        }
    }

    private final synchronized void F(CarControlGroup carControlGroup) {
        ArrayList arrayList = new ArrayList();
        for (rip ripVar : this.l.c(Integer.valueOf(carControlGroup.a))) {
            try {
                ripVar.e(carControlGroup);
            } catch (RemoteException unused) {
                arrayList.add(ripVar);
            }
        }
        this.l.c(Integer.valueOf(carControlGroup.a)).removeAll(arrayList);
    }

    private final synchronized void G(CarPropertyState carPropertyState) {
        ArrayList arrayList = new ArrayList();
        for (riv rivVar : this.g.c(carPropertyState.a)) {
            try {
                rivVar.e(carPropertyState);
            } catch (RemoteException unused) {
                arrayList.add(rivVar);
            }
        }
        this.g.c(carPropertyState.a).removeAll(arrayList);
    }

    private final synchronized void H(List list) {
        ((ype) ((ype) a.f()).ai((char) 129)).y("Received the following car controls on service discovery: %s", list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xic xicVar = (xic) it.next();
            wub.I(xib.a(xicVar.d).equals(xib.c), "Expected top-level control to be of type CarControlGroup but was %s", xib.a(xicVar.d));
            CarControlGroup carControlGroupB = B(xicVar.d == 3 ? (xid) xicVar.e : xid.a);
            this.k.put(Integer.valueOf(carControlGroupB.a), carControlGroupB);
        }
    }

    private final void I(List list) {
        iyn iynVar = this.f;
        abnp abnpVarN = xnm.a.n();
        Stream map = Collection.EL.stream(list).map(new ijt(0));
        int i = yfq.d;
        Iterable iterable = (Iterable) map.collect(ycm.a);
        abnpVarN.t();
        xnm xnmVar = (xnm) abnpVarN.b;
        aboh abohVar = xnmVar.b;
        if (!abohVar.c()) {
            xnmVar.b = abnv.I(abohVar);
        }
        abmc.i(iterable, xnmVar.b);
        xnm xnmVar2 = (xnm) abnpVarN.q();
        iyn.a.f().ai(1646).y("Sending RegisterCarPropertyListenersRequest: %s", xnmVar2);
        iynVar.k(32771, xnmVar2);
    }

    public static Object g(xgq xgqVar, Class cls) {
        if (cls == Integer.class) {
            return cls.cast(Integer.valueOf(xgqVar.b == 1 ? ((Integer) xgqVar.c).intValue() : 0));
        }
        if (cls == Boolean.class) {
            return cls.cast(Boolean.valueOf(xgqVar.b == 3 ? ((Boolean) xgqVar.c).booleanValue() : false));
        }
        if (cls == Float.class) {
            return cls.cast(Float.valueOf(xgqVar.b == 2 ? ((Float) xgqVar.c).floatValue() : BitmapDescriptorFactory.HUE_RED));
        }
        if (cls == Float[].class) {
            return cls.cast((xgqVar.b == 8 ? (xgn) xgqVar.c : xgn.a).b.toArray(new Float[0]));
        }
        if (cls == Integer[].class) {
            return cls.cast((xgqVar.b == 6 ? (xgo) xgqVar.c : xgo.a).b.toArray(new Integer[0]));
        }
        if (cls == Long.class) {
            return cls.cast(Long.valueOf(xgqVar.b == 4 ? ((Long) xgqVar.c).longValue() : 0L));
        }
        if (cls == Long[].class) {
            return cls.cast((xgqVar.b == 7 ? (xgp) xgqVar.c : xgp.a).b.toArray(new Long[0]));
        }
        if (cls == String.class) {
            return cls.cast(xgqVar.b == 5 ? (String) xgqVar.c : "");
        }
        throw new IllegalArgumentException("RawCarProperty does not support given type");
    }

    public static final CarProperty z(xgi xgiVar) {
        int i = xgiVar.c;
        xgj xgjVar = xgiVar.d;
        if (xgjVar == null) {
            xgjVar = xgj.f;
        }
        return new CarProperty(i, CarAreaId.a(xgjVar));
    }

    @Override // defpackage.jbo
    public final iyw a(xnz xnzVar) {
        CarPropertyConfig carPropertyConfigC;
        if ((xnzVar.b & 16384) == 0) {
            return null;
        }
        xif xifVar = xnzVar.m;
        if (xifVar == null) {
            xifVar = xif.a;
        }
        aboh<xgk> abohVar = xifVar.b;
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 132)).y("Received car properties on service discovery: %s", abohVar);
        for (xgk xgkVar : abohVar) {
            xgm xgmVarB = xgm.b(xgkVar.c);
            if (xgmVarB == null) {
                xgmVarB = xgm.UNRECOGNIZED;
            }
            int i = 2;
            if (xgmVarB == xgm.HMG_CAR_ALERTS_COUNT) {
                if (xgkVar.i.isEmpty()) {
                    ((ype) yphVar.l().ai((char) 140)).u("Adding AreaIdConfig to HMG_CAR_ALERTS_COUNT CarPropertyConfig");
                    abnp abnpVarK = xgkVar.K();
                    abnp abnpVarN = xfz.a.n();
                    abnp abnpVarN2 = xgj.f.n();
                    abnpVarN2.t();
                    xgj xgjVar = (xgj) abnpVarN2.b;
                    xgjVar.h = 0;
                    xgjVar.g |= 1;
                    abnpVarN.t();
                    xfz xfzVar = (xfz) abnpVarN.b;
                    xgj xgjVar2 = (xgj) abnpVarN2.q();
                    xgjVar2.getClass();
                    xfzVar.c = xgjVar2;
                    xfzVar.b |= 1;
                    xgq xgqVar = xgq.a;
                    abnp abnpVarN3 = xgqVar.n();
                    abnpVarN3.t();
                    xgq xgqVar2 = (xgq) abnpVarN3.b;
                    xgqVar2.b = 1;
                    xgqVar2.c = 0;
                    abnpVarN.t();
                    xfz xfzVar2 = (xfz) abnpVarN.b;
                    xgq xgqVar3 = (xgq) abnpVarN3.q();
                    xgqVar3.getClass();
                    xfzVar2.e = xgqVar3;
                    xfzVar2.b |= 4;
                    abnp abnpVarN4 = xgqVar.n();
                    abnpVarN4.t();
                    xgq xgqVar4 = (xgq) abnpVarN4.b;
                    xgqVar4.b = 1;
                    xgqVar4.c = Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY);
                    abnpVarN.t();
                    xfz xfzVar3 = (xfz) abnpVarN.b;
                    xgq xgqVar5 = (xgq) abnpVarN4.q();
                    xgqVar5.getClass();
                    xfzVar3.d = xgqVar5;
                    xfzVar3.b |= 2;
                    abnpVarK.t();
                    xgk xgkVar2 = (xgk) abnpVarK.b;
                    xfz xfzVar4 = (xfz) abnpVarN.q();
                    xfzVar4.getClass();
                    xgkVar2.b();
                    xgkVar2.i.add(xfzVar4);
                    xgkVar = (xgk) abnpVarK.q();
                } else {
                    ((ype) yphVar.l().ai((char) 141)).u("HMG_CAR_ALERTS_COUNT CarPropertyConfig has AreaIdConfig, not modifying");
                }
            }
            switch (xgkVar.d) {
                case 0:
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                default:
                    i = 0;
                    break;
            }
            switch ((i != 0 ? i : 1) - 2) {
                case 1:
                    carPropertyConfigC = C(xgkVar, Integer.class);
                    break;
                case 2:
                    carPropertyConfigC = C(xgkVar, Boolean.class);
                    break;
                case 3:
                    carPropertyConfigC = C(xgkVar, Float.class);
                    break;
                case 4:
                    carPropertyConfigC = C(xgkVar, Long.class);
                    break;
                case 5:
                    carPropertyConfigC = C(xgkVar, String.class);
                    break;
                case 6:
                    carPropertyConfigC = C(xgkVar, Float[].class);
                    break;
                case 7:
                    carPropertyConfigC = C(xgkVar, Integer[].class);
                    break;
                case 8:
                    carPropertyConfigC = C(xgkVar, Long[].class);
                    break;
                default:
                    ((ype) ((ype) yphVar.f()).ai('s')).y("Skipping createCarPropertyConfigFromProto for config %s, unsupported type", xgkVar);
                    carPropertyConfigC = null;
                    break;
            }
            if (carPropertyConfigC != null) {
                this.i.add(carPropertyConfigC);
            }
        }
        ((ype) ((ype) yphVar.f()).ai(133)).y("Storing the following car properties: %s", this.i);
        xif xifVar2 = xnzVar.m;
        if (xifVar2 == null) {
            xifVar2 = xif.a;
        }
        H(xifVar2.c);
        xif xifVar3 = xnzVar.m;
        if (xifVar3 == null) {
            xifVar3 = xif.a;
        }
        aboh abohVar2 = xifVar3.d;
        ((ype) ((ype) yphVar.f()).ai((char) 130)).y("Received supported car actions on service discovery: %s", abohVar2);
        Iterator<E> it = abohVar2.iterator();
        while (it.hasNext()) {
            xga xgaVar = ((xgb) it.next()).c;
            if (xgaVar == null) {
                xgaVar = xga.a;
            }
            int i2 = xgaVar.c;
            if (wpq.p(i2) == 0) {
                ((ype) ((ype) yphVar.h()).ai((char) 131)).w("Unrecognized action ID: %d", i2);
            } else {
                this.j.add(new CarAction(i2));
            }
        }
        return this;
    }

    @Override // defpackage.iyw
    public final jbj b(jbn jbnVar) {
        return new iyn(this, jbnVar);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    @Override // defpackage.rim
    public final synchronized CarPropertyState f(CarProperty carProperty) {
        ((ype) ((ype) a.f()).ai(116)).M("@%s getCarPropertyState for %s", this.n, carProperty);
        E();
        return (CarPropertyState) this.h.get(carProperty);
    }

    public final List h(CarControlGroup carControlGroup) {
        ArrayList arrayList = new ArrayList();
        for (CarControl carControl : carControlGroup.b) {
            CarPropertyControl carPropertyControl = carControl.a;
            if (carPropertyControl != null) {
                arrayList.add(carPropertyControl.a);
            } else {
                CarControlGroup carControlGroup2 = carControl.c;
                if (carControlGroup2 != null) {
                    arrayList.addAll(h(carControlGroup2));
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.rim
    public final synchronized List i() {
        ((ype) ((ype) a.f()).ai(117)).y("@%s getRequestedCarControlGroups", this.n);
        E();
        return yfq.o(this.k.values());
    }

    @Override // defpackage.rim
    public final List j() {
        ((ype) ((ype) a.f()).ai(118)).y("@%s getSupportedCarActions", this.n);
        E();
        return yfq.o(this.j);
    }

    @Override // defpackage.rim
    public final List k() {
        ((ype) ((ype) a.f()).ai(119)).y("@%s getSupportedCarProperties", this.n);
        E();
        return yfq.o(this.i);
    }

    @Override // defpackage.rim
    public final synchronized void l() {
        ((ype) ((ype) a.f()).ai(111)).y("@%s clearRegisteredPropertyListeners", this.n);
        this.b.clear();
        this.g.q();
    }

    @Override // defpackage.iyw
    public final synchronized void m(PrintWriter printWriter) {
        printWriter.println("**CarControlService**");
        printWriter.println("@".concat(String.valueOf(this.n)));
        printWriter.println("Supported Car Properties: ".concat(String.valueOf(String.valueOf(this.i))));
        printWriter.println("Registered Car Properties: ".concat(String.valueOf(String.valueOf(this.b))));
        printWriter.println("Car Property State: ".concat(String.valueOf(String.valueOf(this.h))));
        printWriter.println("Car Property to Listener Map: ".concat(String.valueOf(String.valueOf(this.g))));
        printWriter.println("Ongoing Set Car Property Requests: ".concat(String.valueOf(String.valueOf(this.c))));
        printWriter.println("Requested Car Controls: ".concat(String.valueOf(String.valueOf(this.k))));
        printWriter.println("Supported Car Actions: ".concat(String.valueOf(String.valueOf(this.j))));
        printWriter.println("All requested Car Properties from Car Controls: ".concat(String.valueOf(String.valueOf(this.m))));
    }

    @Override // defpackage.rim
    public final void n(CarAction carAction) {
        ((ype) ((ype) a.f()).ai(120)).y("@%s onCarAction", this.n);
        iyn iynVar = this.f;
        abnp abnpVarN = xia.a.n();
        abnp abnpVarN2 = xga.a.n();
        int iP = wpq.p(carAction.a);
        if (iP == 0) {
            throw null;
        }
        abnpVarN2.t();
        xga xgaVar = (xga) abnpVarN2.b;
        xgaVar.c = aclh.f(iP);
        xgaVar.b |= 1;
        xga xgaVar2 = (xga) abnpVarN2.q();
        abnpVarN.t();
        xia xiaVar = (xia) abnpVarN.b;
        xgaVar2.getClass();
        xiaVar.c = xgaVar2;
        xiaVar.b |= 1;
        xia xiaVar2 = (xia) abnpVarN.q();
        iyn.a.f().ai(1645).y("Sending CarActionNotification: %s", xiaVar2);
        iynVar.k(32774, xiaVar2);
    }

    @Override // defpackage.iym
    public final synchronized void o(xid xidVar) {
        ((ype) ((ype) a.f()).ai('y')).y("Received updated CarControlGroup : %s", xidVar);
        CarControlGroup carControlGroupB = B(xidVar);
        this.k.put(Integer.valueOf(carControlGroupB.a), carControlGroupB);
        F(carControlGroupB);
    }

    @Override // defpackage.iym
    public final synchronized void p(xin xinVar) {
        CarPropertyValue carPropertyValue;
        int i;
        yph yphVar = a;
        ((ype) yphVar.l().ai('z')).y("Received onCarPropertyChangeEvent %s", xinVar);
        xgi xgiVar = xinVar.c;
        if (xgiVar == null) {
            xgiVar = xgi.a;
        }
        CarProperty carPropertyZ = z(xgiVar);
        if (xinVar.e == 1) {
            xgq xgqVar = xinVar.d;
            if (xgqVar == null) {
                xgqVar = xgq.a;
            }
            int i2 = xgqVar.b;
            switch (i2) {
                case 0:
                    i = 9;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                case 7:
                    i = 7;
                    break;
                case 8:
                    i = 8;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i == 0) {
                throw null;
            }
            switch (i - 1) {
                case 0:
                    carPropertyValue = new CarPropertyValue(Integer.valueOf(i2 == 1 ? ((Integer) xgqVar.c).intValue() : 0));
                    break;
                case 1:
                    carPropertyValue = new CarPropertyValue(Float.valueOf(i2 == 2 ? ((Float) xgqVar.c).floatValue() : BitmapDescriptorFactory.HUE_RED));
                    break;
                case 2:
                    carPropertyValue = new CarPropertyValue(Boolean.valueOf(i2 == 3 ? ((Boolean) xgqVar.c).booleanValue() : false));
                    break;
                case 3:
                    carPropertyValue = new CarPropertyValue(Long.valueOf(i2 == 4 ? ((Long) xgqVar.c).longValue() : 0L));
                    break;
                case 4:
                    carPropertyValue = new CarPropertyValue(i2 == 5 ? (String) xgqVar.c : "");
                    break;
                case 5:
                    carPropertyValue = new CarPropertyValue((Integer[]) (i2 == 6 ? (xgo) xgqVar.c : xgo.a).b.toArray(new Integer[0]));
                    break;
                case 6:
                    carPropertyValue = new CarPropertyValue((Long[]) (i2 == 7 ? (xgp) xgqVar.c : xgp.a).b.toArray(new Long[0]));
                    break;
                case 7:
                    carPropertyValue = new CarPropertyValue((Float[]) (i2 == 8 ? (xgn) xgqVar.c : xgn.a).b.toArray(new Float[0]));
                    break;
                default:
                    throw new IllegalArgumentException("Car Property Value must be set");
            }
        } else {
            carPropertyValue = new CarPropertyValue(null);
        }
        CarPropertyState carPropertyState = new CarPropertyState(carPropertyZ, carPropertyValue, xinVar.e);
        ((ype) yphVar.l().ai('{')).y("Converted CarPropertyChangeEvent to CarPropertyState: %s", carPropertyState);
        Map map = this.h;
        xgi xgiVar2 = xinVar.c;
        if (xgiVar2 == null) {
            xgiVar2 = xgi.a;
        }
        map.put(z(xgiVar2), carPropertyState);
        G(carPropertyState);
    }

    @Override // defpackage.iyw
    public final synchronized void q() {
        this.d = false;
        this.h.clear();
        this.b.clear();
        this.c.clear();
        this.i.clear();
        this.j.clear();
        this.k.clear();
        this.m.clear();
        ((ype) ((ype) a.f()).ai(124)).y("Disconnected @%s", this.n);
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        yfq yfqVar;
        this.f = (iyn) jbjVar;
        this.d = true;
        synchronized (this) {
            Stream streamFilter = Collection.EL.stream(this.k.values()).flatMap(new gjm(this, 3)).filter(new ghp(this, 2));
            int i = yfq.d;
            yfqVar = (yfq) streamFilter.collect(ycm.a);
            this.b.addAll(yfqVar);
        }
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 136)).y("Registering listeners for car control properties: %s", yfqVar);
        I(yfqVar);
        ((ype) ((ype) yphVar.f()).ai(125)).y("Connected @%s", this.n);
    }

    @Override // defpackage.iym
    public final synchronized void s(List list) {
        ((ype) a.l().ai('~')).u("Received response from HU on car property listener registration status.");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xio xioVar = (xio) it.next();
            xkr xkrVarB = xkr.b(xioVar.d);
            if (xkrVarB == null) {
                xkrVarB = xkr.STATUS_UNSOLICITED_MESSAGE;
            }
            if (xkrVarB == xkr.STATUS_CAR_PROPERTY_LISTENER_REGISTRATION_FAILED) {
                xgi xgiVar = xioVar.c;
                if (xgiVar == null) {
                    xgiVar = xgi.a;
                }
                CarProperty carPropertyZ = z(xgiVar);
                CarPropertyState carPropertyState = new CarPropertyState(carPropertyZ, new CarPropertyValue(null), 2);
                this.h.put(carPropertyZ, carPropertyState);
                G(carPropertyState);
            }
        }
    }

    @Override // defpackage.rim
    public final synchronized void t(int i, rip ripVar) {
        ype ypeVar = (ype) ((ype) a.f()).ai(134);
        String str = this.n;
        Integer numValueOf = Integer.valueOf(i);
        ypeVar.R("@%s registerCarControlGroupUpdateListener(%s, %s)", str, numValueOf, ripVar);
        this.l.t(numValueOf, ripVar);
        Map map = this.k;
        if (map.containsKey(numValueOf)) {
            try {
                CarControlGroup carControlGroup = (CarControlGroup) map.get(numValueOf);
                carControlGroup.getClass();
                ripVar.e(carControlGroup);
            } catch (RemoteException unused) {
                this.l.C(Integer.valueOf(i), ripVar);
            }
        }
    }

    @Override // defpackage.rim
    public final synchronized void u(riv rivVar, List list) {
        ((ype) ((ype) a.f()).ai(135)).M("@%s Registering car property update listener for properties %s", this.n, list);
        E();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CarProperty carProperty = (CarProperty) it.next();
            this.g.t(carProperty, rivVar);
            if (this.b.contains(carProperty)) {
                Map map = this.h;
                if (map.get(carProperty) != null) {
                    try {
                        rivVar.e((CarPropertyState) map.get(carProperty));
                    } catch (RemoteException unused) {
                        this.g.C(carProperty, rivVar);
                    }
                }
            } else {
                arrayList.add(carProperty);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        I(arrayList);
        this.b.addAll(arrayList);
    }

    @Override // defpackage.rim
    public final void v(CarProperty carProperty, CarPropertyValue carPropertyValue, ris risVar) {
        ((ype) ((ype) a.f()).ai(137)).R("@%s Received set car property request for %s to %s", this.n, carProperty, carPropertyValue);
        E();
        Object obj = carPropertyValue.a;
        obj.getClass();
        abnp abnpVarN = xgq.a.n();
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            abnpVarN.t();
            xgq xgqVar = (xgq) abnpVarN.b;
            xgqVar.b = 3;
            xgqVar.c = bool;
        } else if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            num.intValue();
            abnpVarN.t();
            xgq xgqVar2 = (xgq) abnpVarN.b;
            xgqVar2.b = 1;
            xgqVar2.c = num;
        } else if (obj instanceof Float) {
            Float f = (Float) obj;
            f.floatValue();
            abnpVarN.t();
            xgq xgqVar3 = (xgq) abnpVarN.b;
            xgqVar3.b = 2;
            xgqVar3.c = f;
        } else if (obj instanceof Long) {
            Long l = (Long) obj;
            l.longValue();
            abnpVarN.t();
            xgq xgqVar4 = (xgq) abnpVarN.b;
            xgqVar4.b = 4;
            xgqVar4.c = l;
        } else if (obj instanceof String) {
            String str = (String) obj;
            abnpVarN.t();
            xgq xgqVar5 = (xgq) abnpVarN.b;
            str.getClass();
            xgqVar5.b = 5;
            xgqVar5.c = str;
        } else if (obj instanceof Integer[]) {
            abnp abnpVarN2 = xgo.a.n();
            abnpVarN2.J(Arrays.asList((Integer[]) obj));
            abnpVarN.t();
            xgq xgqVar6 = (xgq) abnpVarN.b;
            xgo xgoVar = (xgo) abnpVarN2.q();
            xgoVar.getClass();
            xgqVar6.c = xgoVar;
            xgqVar6.b = 6;
        } else if (obj instanceof Float[]) {
            abnp abnpVarN3 = xgn.a.n();
            List listAsList = Arrays.asList((Float[]) obj);
            abnpVarN3.t();
            xgn xgnVar = (xgn) abnpVarN3.b;
            aboc abocVar = xgnVar.b;
            if (!abocVar.c()) {
                xgnVar.b = abnv.F(abocVar);
            }
            abmc.i(listAsList, xgnVar.b);
            abnpVarN.t();
            xgq xgqVar7 = (xgq) abnpVarN.b;
            xgn xgnVar2 = (xgn) abnpVarN3.q();
            xgnVar2.getClass();
            xgqVar7.c = xgnVar2;
            xgqVar7.b = 8;
        } else {
            if (!(obj instanceof Long[])) {
                throw new IllegalArgumentException("CarPropertyValue is not of a supported type");
            }
            abnp abnpVarN4 = xgp.a.n();
            List listAsList2 = Arrays.asList((Long[]) obj);
            abnpVarN4.t();
            xgp xgpVar = (xgp) abnpVarN4.b;
            abog abogVar = xgpVar.b;
            if (!abogVar.c()) {
                xgpVar.b = abnv.H(abogVar);
            }
            abmc.i(listAsList2, xgpVar.b);
            abnpVarN.t();
            xgq xgqVar8 = (xgq) abnpVarN.b;
            xgp xgpVar2 = (xgp) abnpVarN4.q();
            xgpVar2.getClass();
            xgqVar8.c = xgpVar2;
            xgqVar8.b = 7;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        iyn iynVar = this.f;
        iynVar.getClass();
        abnp abnpVarN5 = xod.a.n();
        xgi xgiVarA = A(carProperty);
        abnpVarN5.t();
        xod xodVar = (xod) abnpVarN5.b;
        xgiVarA.getClass();
        xodVar.c = xgiVarA;
        xodVar.b |= 1;
        abnpVarN5.t();
        xod xodVar2 = (xod) abnpVarN5.b;
        xgq xgqVar9 = (xgq) abnpVarN.q();
        xgqVar9.getClass();
        xodVar2.d = xgqVar9;
        xodVar2.b |= 2;
        String string = uuidRandomUUID.toString();
        abnpVarN5.t();
        xod xodVar3 = (xod) abnpVarN5.b;
        string.getClass();
        xodVar3.b = 4 | xodVar3.b;
        xodVar3.e = string;
        xod xodVar4 = (xod) abnpVarN5.q();
        iyn.a.f().ai(1647).y("Sending SetCarPropertyValueRequest: %s", xodVar4);
        iynVar.k(32769, xodVar4);
        if (risVar != null) {
            this.c.put(uuidRandomUUID, risVar);
        }
    }

    @Override // defpackage.rim
    public final synchronized void w(rip ripVar) {
        ((ype) ((ype) a.f()).ai(138)).M("@%s unregisterCarControlGroupUpdateListener(%s)", this.n, ripVar);
        ArrayList arrayList = new ArrayList();
        ymf ymfVar = this.l;
        for (Map.Entry entry : ymfVar.u()) {
            if (((rip) entry.getValue()).equals(ripVar)) {
                arrayList.add((Integer) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Integer num = (Integer) arrayList.get(i);
            num.intValue();
            ymfVar.C(num, ripVar);
        }
    }

    @Override // defpackage.rim
    public final synchronized void x(riv rivVar) {
        ((ype) ((ype) a.f()).ai(139)).M("@%s Unregistering car property update listener: %s", this.n, rivVar);
        ArrayList arrayList = new ArrayList();
        ymf ymfVar = this.g;
        for (Map.Entry entry : ymfVar.u()) {
            if (((riv) entry.getValue()).equals(rivVar)) {
                arrayList.add((CarProperty) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ymfVar.C((CarProperty) arrayList.get(i), rivVar);
        }
    }

    public final boolean y(CarProperty carProperty) {
        return Collection.EL.stream(this.i).anyMatch(new ghp(carProperty, 3));
    }
}
