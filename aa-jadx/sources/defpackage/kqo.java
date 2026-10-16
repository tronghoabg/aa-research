package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kqo {
    public final j$.util.Optional a;
    public final j$.util.Optional b;
    public final int c;
    public final int d;

    public kqo(j$.util.Optional optional, j$.util.Optional optional2, int i, int i2) {
        this.a = optional;
        this.b = optional2;
        this.c = i;
        this.d = i2;
    }

    public static defpackage.kqn a() {
        defpackage.kqn kqnVar = new defpackage.kqn();
        kqnVar.e(1);
        kqnVar.d(3);
        return kqnVar;
    }

    public static defpackage.kqo c() {
        return a().a();
    }

    public static defpackage.kqo d(com.google.android.apps.auto.components.connectivity.models.CarInfoWrapper$Core carInfoWrapper$Core) {
        android.bluetooth.BluetoothDevice bluetoothDevice = carInfoWrapper$Core.a;
        defpackage.kqn kqnVarA = a();
        kqnVarA.b(j$.util.Optional.ofNullable(bluetoothDevice));
        kqnVarA.c(j$.util.Optional.ofNullable(carInfoWrapper$Core.b));
        kqnVarA.d(carInfoWrapper$Core.c);
        kqnVarA.e(carInfoWrapper$Core.d);
        return kqnVarA.a();
    }

    public static java.lang.String f(java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (str != null && !str.isEmpty()) {
                return str;
            }
        }
        return "";
    }

    private final boolean p() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    public final com.google.android.apps.auto.components.connectivity.models.CarInfoWrapper$Core b() {
        return new com.google.android.apps.auto.components.connectivity.models.CarInfoWrapper$Core((android.bluetooth.BluetoothDevice) this.b.orElse(null), (com.google.android.gms.carsetup.CarInfoInternal) this.a.orElse(null), this.d, this.c);
    }

    public final java.lang.String e() {
        java.lang.Object obj;
        j$.util.Optional optionalOfNullable = this.a;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(((com.google.android.gms.carsetup.CarInfoInternal) optionalOfNullable.get()).f);
        }
        defpackage.kqm kqmVar = new defpackage.kqm(this, 0);
        if (true != optionalOfNullable.isPresent()) {
            j$.util.Optional optionalOfNullable2 = ((defpackage.kqo) kqmVar.a).b;
            if (true == optionalOfNullable2.isPresent()) {
                optionalOfNullable2 = j$.util.Optional.ofNullable(((android.bluetooth.BluetoothDevice) optionalOfNullable2.get()).getAddress());
            }
            obj = (java.lang.String) optionalOfNullable2.orElse("");
        } else {
            obj = optionalOfNullable.get();
        }
        return (java.lang.String) obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.kqo) {
            defpackage.kqo kqoVar = (defpackage.kqo) obj;
            if (this.a.equals(kqoVar.a) && this.b.equals(kqoVar.b)) {
                int i = this.c;
                int i2 = kqoVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.d;
                    int i4 = kqoVar.d;
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

    public final java.lang.String g() {
        java.lang.Object obj;
        j$.util.Optional optionalOfNullable = this.a;
        int i = 1;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(((com.google.android.gms.carsetup.CarInfoInternal) optionalOfNullable.get()).a);
        }
        if (true == optionalOfNullable.isPresent()) {
            com.google.android.gms.car.CarInfo carInfo = (com.google.android.gms.car.CarInfo) optionalOfNullable.get();
            optionalOfNullable = j$.util.Optional.ofNullable(f(carInfo.q, carInfo.p, carInfo.a));
        }
        defpackage.kqm kqmVar = new defpackage.kqm(this, i);
        if (true != optionalOfNullable.isPresent()) {
            j$.util.Optional optionalOfNullable2 = ((defpackage.kqo) kqmVar.a).b;
            if (true == optionalOfNullable2.isPresent()) {
                android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) optionalOfNullable2.get();
                optionalOfNullable2 = j$.util.Optional.ofNullable(android.os.Build.VERSION.SDK_INT >= 30 ? f((java.lang.String) j$.util.Optional.ofNullable(bluetoothDevice.getAlias()).orElse(""), bluetoothDevice.getName(), bluetoothDevice.getAddress()) : f(bluetoothDevice.getName(), bluetoothDevice.getAddress()));
            }
            obj = (java.lang.String) optionalOfNullable2.orElse("");
        } else {
            obj = optionalOfNullable.get();
        }
        return (java.lang.String) obj;
    }

    public final java.lang.String h() {
        j$.util.Optional optionalOfNullable = this.a;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(((com.google.android.gms.carsetup.CarInfoInternal) optionalOfNullable.get()).a.d);
        }
        return (java.lang.String) optionalOfNullable.orElse("");
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.c;
        defpackage.a.aI(i);
        int i2 = this.d;
        defpackage.a.aI(i2);
        return i2 ^ (((iHashCode * 1000003) ^ i) * 1000003);
    }

    public final boolean i() {
        return this.a.isPresent();
    }

    public final boolean j() {
        j$.util.Optional optionalOfNullable = this.a;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((com.google.android.gms.carsetup.CarInfoInternal) optionalOfNullable.get()).p));
        }
        return ((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.TRUE)).booleanValue();
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

    public final boolean n(defpackage.kqo kqoVar) {
        if (kqoVar.p() || p()) {
            return false;
        }
        return (h().equals(kqoVar.h()) && !h().isEmpty()) || (e().equals(kqoVar.e()) && !e().isEmpty());
    }

    public final boolean o() {
        return this.c == 2;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.c;
        j$.util.Optional optional = this.b;
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        java.lang.String strValueOf2 = java.lang.String.valueOf(optional);
        java.lang.String str2 = "null";
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i != 2) {
            str = i != 3 ? "null" : "USB";
        } else {
            str = "WIRELESS";
        }
        int i2 = this.d;
        if (i2 == 1) {
            str2 = "PROJECTING_WIRELESS";
        } else if (i2 == 2) {
            str2 = "PROJECTING_USB";
        } else if (i2 == 3) {
            str2 = "NOT_PROJECTING";
        }
        return "CarInfoWrapper{carInfoInternal=" + strValueOf + ", bluetoothDevice=" + strValueOf2 + ", supportedConnection=" + str + ", projectionType=" + str2 + "}";
    }

    public kqo() {
        throw null;
    }
}
