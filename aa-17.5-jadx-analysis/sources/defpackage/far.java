package defpackage;

import android.bluetooth.BluetoothDevice;
import android.telecom.Call;
import com.google.android.gms.car.control.CarAction;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes2.dex */
public final class far extends afde implements afeg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public far(afck afckVar, ezc ezcVar, boolean z, afec afecVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = ezcVar;
        this.b = z;
        this.d = afecVar;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [afec, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        switch (this.e) {
            case 0:
                return new far(afckVar, (ezc) this.c, this.b, (afec) this.d, 0);
            case 1:
                return new far((btp) this.c, this.b, (btx) this.d, afckVar, 1);
            case 2:
                return new far((kjz) this.d, this.b, (qn) this.c, afckVar, 2);
            case 3:
                return new far(this.b, (xya) this.d, (bwq) this.c, afckVar, 3);
            case 4:
                Object obj2 = this.d;
                return new far((CarAction) obj2, (npy) this.c, this.b, afckVar, 4);
            case 5:
                Object obj3 = this.d;
                return new far((CarAction) obj3, (npy) this.c, this.b, afckVar, 5, (byte[]) null);
            case 6:
                Object obj4 = this.d;
                return new far((CarAction) obj4, (npy) this.c, this.b, afckVar, 6, (char[]) null);
            case 7:
                Object obj5 = this.d;
                return new far((CarAction) obj5, (npy) this.c, this.b, afckVar, 7, (short[]) null);
            case 8:
                Object obj6 = this.d;
                return new far((ohh) obj6, (Call) this.c, this.b, afckVar, 8);
            case 9:
                return new far(this.b, (oqc) this.d, (byb) this.c, afckVar, 9);
            default:
                Object obj7 = this.d;
                return new far((kzt) obj7, (BluetoothDevice) this.c, this.b, afckVar, 10);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [bwq, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Object objG;
        switch (this.e) {
            case 0:
                afcr afcrVar = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                ezc ezcVar = (ezc) this.c;
                fat fatVar = new fat(this.b, ezcVar, null, this.d);
                this.a = 1;
                Object objR = ezcVar.r(fatVar, this);
                return objR == afcrVar ? afcrVar : objR;
            case 1:
                woy.dF(obj);
                boolean z = this.b;
                new Float(true != z ? BitmapDescriptorFactory.HUE_RED : 1.0f);
                Object obj2 = this.d;
                if (z) {
                    throw null;
                }
                throw null;
            case 2:
                afcr afcrVar2 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    objG = ((aezw) obj).a;
                } else {
                    woy.dF(obj);
                    Object obj3 = this.d;
                    Boolean boolValueOf = Boolean.valueOf(this.b);
                    this.a = 1;
                    objG = jul.g((kjz) obj3, boolValueOf, this);
                    if (objG == afcrVar2) {
                        return afcrVar2;
                    }
                }
                kkz.t(objG, (qn) this.c, (kjz) this.d);
                return afak.a;
            case 3:
                afcr afcrVar3 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    if (this.b) {
                        this.c.b(Boolean.valueOf(true));
                        xya xyaVar = (xya) this.d;
                        xyaVar.d();
                        xyaVar.e();
                        return afak.a;
                    }
                    long millis = 1600 - ((xya) this.d).c().toMillis();
                    if (millis > 0) {
                        this.a = 1;
                        if (aiow.c(millis, this) == afcrVar3) {
                            return afcrVar3;
                        }
                    }
                }
                this.c.b(Boolean.valueOf(false));
                return afak.a;
            case 4:
                afcr afcrVar4 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj4 = this.d;
                    if (obj4 != null) {
                        kjq.a.a().l(((CarAction) obj4).a);
                    } else {
                        Object obj5 = this.c;
                        boolean z2 = this.b;
                        this.a = 1;
                        if (((npy) obj5).b(z2, this) == afcrVar4) {
                            return afcrVar4;
                        }
                    }
                }
                return afak.a;
            case 5:
                afcr afcrVar5 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj6 = this.d;
                    if (obj6 != null) {
                        kjq.a.a().l(((CarAction) obj6).a);
                    } else {
                        Object obj7 = this.c;
                        boolean z3 = this.b;
                        this.a = 1;
                        if (((npy) obj7).b(z3, this) == afcrVar5) {
                            return afcrVar5;
                        }
                    }
                }
                return afak.a;
            case 6:
                afcr afcrVar6 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj8 = this.d;
                    if (obj8 != null) {
                        kjq.a.a().l(((CarAction) obj8).a);
                    } else {
                        Object obj9 = this.c;
                        boolean z4 = this.b;
                        this.a = 1;
                        if (((npy) obj9).b(z4, this) == afcrVar6) {
                            return afcrVar6;
                        }
                    }
                }
                return afak.a;
            case 7:
                afcr afcrVar7 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj10 = this.d;
                    if (obj10 != null) {
                        kjq.a.a().l(((CarAction) obj10).a);
                    } else {
                        Object obj11 = this.c;
                        boolean z5 = this.b;
                        this.a = 1;
                        if (((npy) obj11).b(z5, this) == afcrVar7) {
                            return afcrVar7;
                        }
                    }
                }
                return afak.a;
            case 8:
                afcr afcrVar8 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj12 = this.d;
                    Object obj13 = this.c;
                    Map map = ((ohh) obj12).c;
                    if (map.containsKey(obj13)) {
                        ype ypeVar = (ype) ohh.b.f();
                        boolean z6 = this.b;
                        ypeVar.y("Requesting call silence state: %s", Boolean.valueOf(z6));
                        Object obj14 = map.get(obj13);
                        obj14.getClass();
                        dyn dynVar = ((ohf) obj14).a;
                        this.a = 1;
                        if (dynVar.a(z6, this) == afcrVar8) {
                            return afcrVar8;
                        }
                    } else {
                        ((ype) ohh.b.h()).u("Cannot request call silence, no available extension");
                    }
                }
                return afak.a;
            case 9:
                afcr afcrVar9 = afcr.a;
                if (this.a == 0) {
                    woy.dF(obj);
                    if (this.b) {
                        this.a = 1;
                        if (aiow.c(150L, this) == afcrVar9) {
                            return afcrVar9;
                        }
                    }
                    return afak.a;
                }
                woy.dF(obj);
                ((byb) this.c).h(1.0f);
                ((oqc) this.d).a(-1);
                return afak.a;
            default:
                afcr afcrVar10 = afcr.a;
                int i = this.a;
                woy.dF(obj);
                if (i != 0) {
                    return null;
                }
                Object obj15 = this.d;
                Object obj16 = this.c;
                boolean z7 = this.b;
                this.a = 1;
                if (((kzt) obj15).f((BluetoothDevice) obj16, z7, this) == afcrVar10) {
                    return afcrVar10;
                }
                return null;
        }
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((far) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 1:
                return ((far) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 2:
                return ((far) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 3:
                return ((far) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 4:
                return ((far) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 5:
                return ((far) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 6:
                return ((far) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 7:
                return ((far) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 8:
                return ((far) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 9:
                return ((far) b((aitx) obj, (afck) obj2)).hT(afak.a);
            default:
                return ((far) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public far(btp btpVar, boolean z, btx btxVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = btpVar;
        this.b = z;
        this.d = btxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public far(CarAction carAction, npy npyVar, boolean z, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = carAction;
        this.c = npyVar;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public far(CarAction carAction, npy npyVar, boolean z, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.e = i;
        this.d = carAction;
        this.c = npyVar;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public far(CarAction carAction, npy npyVar, boolean z, afck afckVar, int i, char[] cArr) {
        super(2, afckVar);
        this.e = i;
        this.d = carAction;
        this.c = npyVar;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public far(CarAction carAction, npy npyVar, boolean z, afck afckVar, int i, short[] sArr) {
        super(2, afckVar);
        this.e = i;
        this.d = carAction;
        this.c = npyVar;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public far(kjz kjzVar, boolean z, qn qnVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = kjzVar;
        this.b = z;
        this.c = qnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public far(kzt kztVar, BluetoothDevice bluetoothDevice, boolean z, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = kztVar;
        this.c = bluetoothDevice;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public far(ohh ohhVar, Call call, boolean z, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.d = ohhVar;
        this.c = call;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public far(boolean z, oqc oqcVar, byb bybVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = z;
        this.d = oqcVar;
        this.c = bybVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public far(boolean z, xya xyaVar, bwq bwqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = z;
        this.d = xyaVar;
        this.c = bwqVar;
    }
}
