package defpackage;

import android.bluetooth.BluetoothDevice;
import android.net.wifi.ScanResult;
import android.os.ParcelUuid;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.auto.components.ui.appbar.AppBarImpl;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class oly implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ oly(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                int i = AppBarImpl.r;
            case 1:
                int i2 = AppBarImpl.r;
                return ((olt) obj).a != null;
            case 2:
                int i3 = AppBarImpl.r;
                return ((olt) obj).b != null;
            case 3:
                int i4 = AppBarImpl.r;
                return !((olt) obj).d.isEmpty();
            case 4:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                yph yphVar = oqg.a;
                if (bluetoothDevice != null) {
                    return true;
                }
                ((ype) oqg.a.l().ai((char) 6074)).u("Bluetooth device is invalid due to being null");
                return false;
            case 5:
                return jlq.a.equals(((ParcelUuid) obj).getUuid());
            case 6:
                oqo oqoVar = (oqo) obj;
                return oqoVar.b || oqoVar.a;
            case 7:
                yph yphVar2 = pdh.a;
                return SystemClock.elapsedRealtime() - (((ScanResult) obj).timestamp / 1000) <= aczv.f();
            case 8:
                yph yphVar3 = pdh.a;
                return ((Method) obj).getName().equals("setPreferSecondarySta");
            case 9:
                yph yphVar4 = pdh.a;
                return ((pdf) obj).b == 1;
            case 10:
                yph yphVar5 = pgr.a;
                return true;
            case 11:
                int iOrdinal = ((pfu) obj).ordinal();
                if (iOrdinal == 0) {
                    return true;
                }
                if (iOrdinal == 1) {
                    return false;
                }
                throw new RuntimeException(null, null);
            case 12:
                pfz pfzVar = (pfz) obj;
                return pfzVar == pfz.a || pfzVar == pfz.b;
            case 13:
                return (((aceg) obj).b & 2) != 0;
            case 14:
                return ((qii) obj).d;
            case 15:
                return ((qii) obj).d;
            case 16:
                return Objects.nonNull((StatusBarNotification) obj);
            case 17:
                return ((CarBluetoothData) obj).b();
            case 18:
                tfy tfyVar = (tfy) obj;
                return tgj.e.contains(tfyVar) || tgj.f.contains(tfyVar);
            case 19:
                return Objects.nonNull((Map.Entry) obj);
            default:
                pxj pxjVar = ((ulq) obj).e;
                return pxjVar != null && pxjVar.a();
        }
    }
}
