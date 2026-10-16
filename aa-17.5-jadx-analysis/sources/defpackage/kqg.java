package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Build;
import com.google.android.apps.auto.components.connectivity.models.CarInfoWrapper$Core;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class kqg {
    public final Optional a;
    public final Optional b;
    public final int c;
    public final int d;

    public kqg(Optional optional, Optional optional2, int i, int i2) {
        this.a = optional;
        this.b = optional2;
        this.c = i;
        this.d = i2;
    }

    public static kqf a() {
        kqf kqfVar = new kqf();
        kqfVar.e(1);
        kqfVar.d(3);
        return kqfVar;
    }

    public static kqg c() {
        return a().a();
    }

    public static kqg d(CarInfoWrapper$Core carInfoWrapper$Core) {
        BluetoothDevice bluetoothDevice = carInfoWrapper$Core.a;
        kqf kqfVarA = a();
        kqfVarA.b(Optional.ofNullable(bluetoothDevice));
        kqfVarA.c(Optional.ofNullable(carInfoWrapper$Core.b));
        kqfVarA.d(carInfoWrapper$Core.c);
        kqfVarA.e(carInfoWrapper$Core.d);
        return kqfVarA.a();
    }

    public static String f(String... strArr) {
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                return str;
            }
        }
        return "";
    }

    private final boolean p() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    public final CarInfoWrapper$Core b() {
        return new CarInfoWrapper$Core((BluetoothDevice) this.b.orElse(null), (CarInfoInternal) this.a.orElse(null), this.d, this.c);
    }

    public final String e() {
        Object obj;
        Optional optionalOfNullable = this.a;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((CarInfoInternal) optionalOfNullable.get()).f);
        }
        kqe kqeVar = new kqe(this, 0);
        if (true != optionalOfNullable.isPresent()) {
            Optional optionalOfNullable2 = ((kqg) kqeVar.a).b;
            if (true == optionalOfNullable2.isPresent()) {
                optionalOfNullable2 = Optional.ofNullable(((BluetoothDevice) optionalOfNullable2.get()).getAddress());
            }
            obj = (String) optionalOfNullable2.orElse("");
        } else {
            obj = optionalOfNullable.get();
        }
        return (String) obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kqg) {
            kqg kqgVar = (kqg) obj;
            if (this.a.equals(kqgVar.a) && this.b.equals(kqgVar.b)) {
                int i = this.c;
                int i2 = kqgVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.d;
                    int i4 = kqgVar.d;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String g() {
        Object obj;
        Optional optionalOfNullable = this.a;
        int i = 1;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((CarInfoInternal) optionalOfNullable.get()).a);
        }
        if (true == optionalOfNullable.isPresent()) {
            CarInfo carInfo = (CarInfo) optionalOfNullable.get();
            optionalOfNullable = Optional.ofNullable(f(carInfo.q, carInfo.p, carInfo.a));
        }
        kqe kqeVar = new kqe(this, i);
        if (true != optionalOfNullable.isPresent()) {
            Optional optionalOfNullable2 = ((kqg) kqeVar.a).b;
            if (true == optionalOfNullable2.isPresent()) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) optionalOfNullable2.get();
                optionalOfNullable2 = Optional.ofNullable(Build.VERSION.SDK_INT >= 30 ? f((String) Optional.ofNullable(bluetoothDevice.getAlias()).orElse(""), bluetoothDevice.getName(), bluetoothDevice.getAddress()) : f(bluetoothDevice.getName(), bluetoothDevice.getAddress()));
            }
            obj = (String) optionalOfNullable2.orElse("");
        } else {
            obj = optionalOfNullable.get();
        }
        return (String) obj;
    }

    public final String h() {
        Optional optionalOfNullable = this.a;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((CarInfoInternal) optionalOfNullable.get()).a.d);
        }
        return (String) optionalOfNullable.orElse("");
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.c;
        a.aJ(i);
        int i2 = this.d;
        a.aJ(i2);
        return i2 ^ (((iHashCode * 1000003) ^ i) * 1000003);
    }

    public final boolean i() {
        return this.a.isPresent();
    }

    public final boolean j() {
        Optional optionalOfNullable = this.a;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((CarInfoInternal) optionalOfNullable.get()).p));
        }
        return ((Boolean) optionalOfNullable.orElse(true)).booleanValue();
    }

    public final boolean k() {
        return this.b.isPresent();
    }

    public final boolean l() {
        return m() || k();
    }

    public final boolean m() {
        return this.d != 3;
    }

    public final boolean n(kqg kqgVar) {
        if (kqgVar.p() || p()) {
            return false;
        }
        return (h().equals(kqgVar.h()) && !h().isEmpty()) || (e().equals(kqgVar.e()) && !e().isEmpty());
    }

    public final boolean o() {
        return this.c == 2;
    }

    public final String toString() {
        int i = this.c;
        Optional optional = this.b;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(optional);
        String str = "null";
        String str2 = i != 1 ? i != 2 ? i != 3 ? "null" : "USB" : "WIRELESS" : "UNKNOWN";
        int i2 = this.d;
        if (i2 == 1) {
            str = "PROJECTING_WIRELESS";
        } else if (i2 == 2) {
            str = "PROJECTING_USB";
        } else if (i2 == 3) {
            str = "NOT_PROJECTING";
        }
        return "CarInfoWrapper{carInfoInternal=" + strValueOf + ", bluetoothDevice=" + strValueOf2 + ", supportedConnection=" + str2 + ", projectionType=" + str + "}";
    }

    public kqg() {
        throw null;
    }
}
