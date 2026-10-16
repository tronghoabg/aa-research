package defpackage;

import android.bluetooth.BluetoothDevice;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public final class rgl {
    private static final ypf b = ols.R("CAR.BT.DeviceWrapper");
    public final BluetoothDevice a;

    public rgl(BluetoothDevice bluetoothDevice) {
        this.a = bluetoothDevice;
    }

    public final int a() {
        return this.a.getBondState();
    }

    public final String b() {
        return this.a.getAddress();
    }

    final boolean c() {
        try {
            return ((Integer) BluetoothDevice.class.getMethod("getPhonebookAccessPermission", null).invoke(this.a, null)).intValue() == 1;
        } catch (ReflectiveOperationException e) {
            b.f().p(e).ai(8027).u("Failed to get phone book access permission state.");
            return false;
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean d(boolean z) {
        return this.a.setPairingConfirmation(z);
    }

    @ResultIgnorabilityUnspecified
    public final void e() {
        try {
            ((Boolean) BluetoothDevice.class.getMethod("cancelBondProcess", null).invoke(this.a, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            b.g().p(e).ai(8024).y("%s", e.getMessage());
        }
    }

    @ResultIgnorabilityUnspecified
    final void f() {
        try {
            ((Boolean) BluetoothDevice.class.getMethod("setPhonebookAccessPermission", Integer.TYPE).invoke(this.a, 2)).booleanValue();
        } catch (ReflectiveOperationException e) {
            b.f().p(e).ai(8025).u("Failed to set phone book access permission.");
        }
    }

    @ResultIgnorabilityUnspecified
    final void g() {
        try {
            ((Boolean) BluetoothDevice.class.getMethod("setPhonebookAccessPermission", Integer.TYPE).invoke(this.a, 1)).booleanValue();
        } catch (ReflectiveOperationException e) {
            b.f().p(e).ai(8026).u("Failed to set phone book access permission.");
        }
    }

    public final void h() {
        try {
            ((Boolean) BluetoothDevice.class.getMethod("removeBond", null).invoke(this.a, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            b.g().p(e).ai(8028).y("%s", e.getMessage());
        }
    }
}
