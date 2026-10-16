package defpackage;

import android.util.ArrayMap;
import androidx.car.app.model.Alert;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.control.CarAction;
import com.google.android.gms.car.control.CarAreaId;
import com.google.android.gms.car.control.CarAreaIdConfig;
import com.google.android.gms.car.control.CarControl;
import com.google.android.gms.car.control.CarControlGroup;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.control.CarPropertyConfig;
import com.google.android.gms.car.control.CarPropertyControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class kjq implements lhg {
    public static final kjo a = new kjo();
    public static final afgl b = new kkp(mki.b, 1);
    public static final yph c = yph.c("GH.CarControlManager");
    public rij d;
    public boolean e;
    private List g;
    private List h;
    private eqj i;
    private Set j;
    private klj l;
    private final Map k = new ArrayMap();
    public boolean f = true;

    public static final kjq f() {
        return a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object h(defpackage.kjq r10, defpackage.klq r11, java.lang.Object r12, defpackage.afck r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof defpackage.kjp
            if (r0 == 0) goto L13
            r0 = r13
            kjp r0 = (defpackage.kjp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kjp r0 = new kjp
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r13)
            goto L4c
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            defpackage.woy.dF(r13)
            mkk r13 = defpackage.mkm.a
            aitu r13 = r13.b()
            bqi r4 = new bqi
            r8 = 0
            r9 = 11
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r3
            java.lang.Object r13 = defpackage.ahnc.a(r13, r4, r0)
            if (r13 != r1) goto L4c
            return r1
        L4c:
            aezw r13 = (defpackage.aezw) r13
            java.lang.Object r10 = r13.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjq.h(kjq, klq, java.lang.Object, afck):java.lang.Object");
    }

    public final eqj a() {
        eqj eqjVar = this.i;
        if (eqjVar != null) {
            return eqjVar;
        }
        throw new IllegalStateException("CarControlManager not initialized");
    }

    public final eqj b(kjz kjzVar) {
        eqj eqjVarA = kjzVar.a();
        if (!this.e) {
            ((ype) c.h()).u("CarControlManager not initialized, using a cached hvacPowerDependentPropertyIds");
        }
        Set set = this.j;
        if (set == null) {
            throw new IllegalStateException("CarControlManager not initialized");
        }
        klq klqVar = kjzVar.a;
        int i = klqVar.a;
        if (set.contains(Integer.valueOf(i))) {
            Iterator it = jul.e(i(), 354419984).iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (kln.c(((kln) ((kjz) next).a.b).a, klqVar.b)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = next;
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            kjz kjzVar2 = (kjz) obj;
            if (kjzVar2 == null) {
                ((ype) c.h()).B("Property %d is dependent on HVAC_POWER_ON, but the HVAC_POWER_ON property does not have expected area id: %d", i, klqVar.b.a());
            } else {
                afco afcoVar = tby.a;
                eqjVarA = tby.G(eqjVarA, kjzVar2.a(), new kbi(2));
            }
        }
        if (a.Y(i, 289408009)) {
            return eqjVarA;
        }
        kjz kjzVar3 = (kjz) woy.bP(jul.e(i(), 289408009));
        if (kjzVar3 == null) {
            ((ype) c.h()).u("Properties depend on ignition state, but ignition state property is not available.");
            return eqjVarA;
        }
        afco afcoVar2 = tby.a;
        return tby.G(eqjVarA, kjzVar3.a(), new kbi(3));
    }

    @Override // defpackage.lhg
    public final void c() {
        if (this.d != null) {
            ((ype) c.f()).u("Start not initializing CarControlManager as it already exists");
            return;
        }
        qrn qrnVarE = kio.b().e();
        qrnVarE.getClass();
        k(qrnVarE, true);
    }

    @Override // defpackage.lhg
    public final void d() {
        if (this.f) {
            m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6, types: [kjk] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    public final kjj e(CarControlGroup carControlGroup) {
        kjj kjkVar;
        Object next;
        List<CarControl> list = carControlGroup.b;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (CarControl carControl : list) {
            CarControlGroup carControlGroup2 = carControl.c;
            if (carControlGroup2 != null) {
                kjkVar = e(carControlGroup2);
            } else {
                CarPropertyControl carPropertyControl = carControl.a;
                ?? kjiVar = 0;
                kjz kjzVar = null;
                kjz kjzVar2 = null;
                if (carPropertyControl != null) {
                    boolean z = carControl.d;
                    List list2 = carControl.e;
                    list2.getClass();
                    int i = carControl.f;
                    Iterator it = i().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        klq klqVar = ((kjz) next).a;
                        CarProperty carProperty = carPropertyControl.a;
                        carProperty.getClass();
                        if (juq.d(klqVar, carProperty)) {
                            break;
                        }
                    }
                    kjz kjzVar3 = (kjz) next;
                    if (kjzVar3 == null) {
                        ype ypeVar = (ype) c.h();
                        CarProperty carProperty2 = carPropertyControl.a;
                        ypeVar.y("Creating fallback for unsupported property: %s", carProperty2);
                        carProperty2.getClass();
                        CarAreaId carAreaId = carProperty2.b;
                        kjzVar3 = new kjz(new klq(carProperty2.a, jup.g(carAreaId.b, carAreaId.a)), new kkr(kjiVar));
                    }
                    kjz kjzVar4 = kjzVar3;
                    CarAction carAction = carPropertyControl.b;
                    CarProperty carProperty3 = carPropertyControl.c;
                    if (carProperty3 != null) {
                        Iterator it2 = i().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            ?? next2 = it2.next();
                            if (juq.d(((kjz) next2).a, carProperty3)) {
                                kjzVar = next2;
                                break;
                            }
                        }
                        kjzVar2 = kjzVar;
                    }
                    kjkVar = new kjk(kjzVar4, carAction, kjzVar2, z, list2, i);
                } else {
                    CarAction carAction2 = carControl.b;
                    if (carAction2 != null) {
                        boolean z2 = carControl.d;
                        List list3 = carControl.e;
                        list3.getClass();
                        kjiVar = new kji(carAction2, z2, list3, carControl.f);
                    }
                    kjkVar = kjiVar;
                }
            }
            if (kjkVar != null) {
                arrayList.add(kjkVar);
            }
        }
        return new kjj(carControlGroup.a, arrayList, afbe.a);
    }

    public final klj g() {
        if (!this.e) {
            ((ype) c.h()).u("CarControlManager not initialized, using a cached controlsHistoryManager");
        }
        klj kljVar = this.l;
        if (kljVar != null) {
            return kljVar;
        }
        throw new IllegalStateException("CarControlManager not initialized");
    }

    public final List i() {
        if (!this.e) {
            ((ype) c.h()).u("CarControlManager not initialized, using a cached availableProperties");
        }
        List list = this.g;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("CarControlManager not initialized");
    }

    public final List j() {
        if (!this.e) {
            ((ype) c.h()).u("CarControlManager not initialized, using a cached supportedActions");
        }
        List list = this.h;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("CarControlManager not initialized");
    }

    public final void k(qrn qrnVar, boolean z) {
        if (this.d != null) {
            if (z) {
                ((ype) c.f()).u("Not setting up CarControlManager for lifetime start");
                return;
            } else {
                ((ype) c.f()).u("Not setting up CarControlManager, not for lifetime start");
                return;
            }
        }
        yph yphVar = c;
        ((ype) yphVar.f()).y("Setting up CarControlManager - forLifetimeStart? %s", Boolean.valueOf(z));
        this.f = z;
        yzz yzzVar = yzz.CAR_CONTROLS;
        Object objU = khc.u(new wci("GH.CarControlManager", yzzVar, yzy.Mf, "Car not connected when getting CarControlManager.", new Object[0]), new kbg(qrnVar, 19));
        objU.getClass();
        this.d = (rij) objU;
        CarInfo carInfo = (CarInfo) khc.u(new wci("GH.CarControlManager", yzzVar, yzy.zz, "Car not connected when getting CarControlManager.", new Object[0]), new kjy(qrnVar, 1));
        Map map = this.k;
        String str = carInfo.d;
        Object kljVar = map.get(str);
        if (kljVar == null) {
            kljVar = new klj(carInfo);
            map.put(str, kljVar);
        }
        this.l = (klj) kljVar;
        List list = (List) khc.u(new wci("GH.CarControlManager", yzzVar, yzy.Me, "Car not connected when getting available properties.", new Object[0]), new afdr() { // from class: kjn
            @Override // defpackage.afdr
            public final Object invoke() {
                kka kjuVar;
                kka kjhVar;
                rij rijVar = this.a.d;
                if (rijVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                List<CarPropertyConfig> list2 = (List) rijVar.a.b(new rdw(rijVar, 5));
                list2.getClass();
                ArrayList arrayList = new ArrayList();
                for (CarPropertyConfig carPropertyConfig : list2) {
                    carPropertyConfig.getClass();
                    List<CarAreaIdConfig> list3 = carPropertyConfig.f;
                    ArrayList<aezu> arrayList2 = new ArrayList(woy.bp(list3, 10));
                    for (CarAreaIdConfig carAreaIdConfig : list3) {
                        arrayList2.add(new aezu(jup.g(carPropertyConfig.b, carAreaIdConfig.a.a), carAreaIdConfig));
                    }
                    ArrayList arrayList3 = new ArrayList(woy.bp(arrayList2, 10));
                    for (aezu aezuVar : arrayList2) {
                        kll kllVar = (kll) aezuVar.a;
                        CarAreaIdConfig carAreaIdConfig2 = (CarAreaIdConfig) aezuVar.b;
                        klq klqVar = new klq(carPropertyConfig.a, kllVar);
                        carAreaIdConfig2.getClass();
                        int i = carPropertyConfig.c;
                        switch (i) {
                            case 1:
                                Object obj = carAreaIdConfig2.b;
                                int iIntValue = obj != null ? ((Number) obj).intValue() : Integer.MIN_VALUE;
                                Object obj2 = carAreaIdConfig2.c;
                                kjuVar = new kju(iIntValue, obj2 != null ? ((Number) obj2).intValue() : Alert.DURATION_SHOW_INDEFINITELY, carPropertyConfig.g);
                                kjhVar = kjuVar;
                                arrayList3.add(new kjz(klqVar, kjhVar));
                            case 2:
                                kjhVar = new kjh(carPropertyConfig.g);
                                arrayList3.add(new kjz(klqVar, kjhVar));
                            case 3:
                                Object obj3 = carAreaIdConfig2.b;
                                float fFloatValue = obj3 != null ? ((Number) obj3).floatValue() : Float.MIN_VALUE;
                                Object obj4 = carAreaIdConfig2.c;
                                kjuVar = new kjt(fFloatValue, obj4 != null ? ((Number) obj4).floatValue() : Float.MAX_VALUE, carPropertyConfig.g);
                                kjhVar = kjuVar;
                                arrayList3.add(new kjz(klqVar, kjhVar));
                            case 4:
                                Object obj5 = carAreaIdConfig2.b;
                                long jLongValue = obj5 != null ? ((Number) obj5).longValue() : Long.MIN_VALUE;
                                Object obj6 = carAreaIdConfig2.c;
                                kjuVar = new kjx(jLongValue, obj6 != null ? ((Number) obj6).longValue() : Long.MAX_VALUE, carPropertyConfig.g);
                                kjhVar = kjuVar;
                                arrayList3.add(new kjz(klqVar, kjhVar));
                            case 5:
                                kjhVar = new kkj(carPropertyConfig.g);
                                arrayList3.add(new kjz(klqVar, kjhVar));
                            case 6:
                                kjhVar = new kjs(carPropertyConfig.g);
                                arrayList3.add(new kjz(klqVar, kjhVar));
                            case 7:
                                kjhVar = new kjv(carPropertyConfig.g);
                                arrayList3.add(new kjz(klqVar, kjhVar));
                            case 8:
                                kjhVar = new kjw(carPropertyConfig.g);
                                arrayList3.add(new kjz(klqVar, kjhVar));
                            default:
                                throw new IllegalArgumentException(a.bp(i, "Unknown value type: "));
                        }
                    }
                    woy.cq(arrayList, arrayList3);
                }
                return arrayList;
            }
        });
        ype ypeVar = (ype) yphVar.f();
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((kjz) it.next()).a.a));
        }
        ypeVar.y("Initialized available properties: %s", arrayList);
        this.g = list;
        Object objU2 = khc.u(new wci("GH.CarControlManager", yzzVar, yzy.Md, "Car not connected when getting supported actions.", new Object[0]), new kbg(this, 20));
        objU2.getClass();
        this.h = (List) objU2;
        rij rijVar = this.d;
        if (rijVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.i = eqy.b(new kjm(rijVar), new kaa(this, 14));
        kjz kjzVar = (kjz) woy.bH(jul.e(i(), 354419984));
        this.j = kjzVar != null ? woy.cl(kjzVar.b.a()) : afbg.a;
        this.e = true;
    }

    public final void l(int i) {
        CarAction carAction = new CarAction(i);
        ((ype) c.f()).y("Requesting HU to perform action %s.", carAction);
        khc.u(new wci("GH.CarControlManager", yzz.CAR_CONTROLS, yzy.Mc, "Car not connected when requesting action.", new Object[0]), new has(this, i, carAction, 2));
    }

    public final void m() {
        this.d = null;
        this.e = false;
    }

    public final boolean n(int i) {
        if (this.h == null) {
            ((ype) c.h()).w("CarControlManager not initialized, carActionSupported(%s) returning false", i);
            return false;
        }
        List listJ = j();
        if (listJ.isEmpty()) {
            return false;
        }
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            if (((CarAction) it.next()).a == i) {
                return true;
            }
        }
        return false;
    }
}
