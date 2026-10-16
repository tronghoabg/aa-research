package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Build;
import com.google.android.gms.car.RadioProgramSelector;
import j$.util.Optional;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class kqe implements Supplier {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kqe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v33, types: [ackk, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.b;
        if (i == 0) {
            Optional optionalOfNullable = ((kqg) this.a).b;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = Optional.ofNullable(((BluetoothDevice) optionalOfNullable.get()).getAddress());
            }
            return (String) optionalOfNullable.orElse("");
        }
        if (i == 1) {
            Optional optionalOfNullable2 = ((kqg) this.a).b;
            if (true == optionalOfNullable2.isPresent()) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) optionalOfNullable2.get();
                optionalOfNullable2 = Optional.ofNullable(Build.VERSION.SDK_INT >= 30 ? kqg.f((String) Optional.ofNullable(bluetoothDevice.getAlias()).orElse(""), bluetoothDevice.getName(), bluetoothDevice.getAddress()) : kqg.f(bluetoothDevice.getName(), bluetoothDevice.getAddress()));
            }
            return (String) optionalOfNullable2.orElse("");
        }
        if (i != 2) {
            return ((tnq) ((qrx) this.a).f.a()).l;
        }
        yph yphVar = mir.a;
        return "radio:" + ((RadioProgramSelector) this.a).hashCode();
    }
}
