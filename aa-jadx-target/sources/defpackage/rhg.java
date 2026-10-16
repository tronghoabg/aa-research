package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rhg {
    private static final defpackage.yqk b = defpackage.omv.n("CAR.BT.DeviceWrapper");
    public final android.bluetooth.BluetoothDevice a;

    public rhg(android.bluetooth.BluetoothDevice bluetoothDevice) {
        this.a = bluetoothDevice;
    }

    public final int a() {
        return this.a.getBondState();
    }

    public final java.lang.String b() {
        return this.a.getAddress();
    }

    final boolean c() {
        try {
            return ((java.lang.Integer) android.bluetooth.BluetoothDevice.class.getMethod("getPhonebookAccessPermission", null).invoke(this.a, null)).intValue() == 1;
        } catch (java.lang.ReflectiveOperationException e) {
            b.f().p(e).ai(8052).u("Failed to get phone book access permission state.");
            return false;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean d(boolean z) {
        return this.a.setPairingConfirmation(z);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void e() {
        try {
            ((java.lang.Boolean) android.bluetooth.BluetoothDevice.class.getMethod("cancelBondProcess", null).invoke(this.a, null)).booleanValue();
        } catch (java.lang.ReflectiveOperationException e) {
            b.g().p(e).ai(8049).y("%s", e.getMessage());
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    final void f() {
        try {
            ((java.lang.Boolean) android.bluetooth.BluetoothDevice.class.getMethod("setPhonebookAccessPermission", java.lang.Integer.TYPE).invoke(this.a, 2)).booleanValue();
        } catch (java.lang.ReflectiveOperationException e) {
            b.f().p(e).ai(8050).u("Failed to set phone book access permission.");
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    final void g() {
        try {
            ((java.lang.Boolean) android.bluetooth.BluetoothDevice.class.getMethod("setPhonebookAccessPermission", java.lang.Integer.TYPE).invoke(this.a, 1)).booleanValue();
        } catch (java.lang.ReflectiveOperationException e) {
            b.f().p(e).ai(8051).u("Failed to set phone book access permission.");
        }
    }

    public final void h() {
        try {
            ((java.lang.Boolean) android.bluetooth.BluetoothDevice.class.getMethod("removeBond", null).invoke(this.a, null)).booleanValue();
        } catch (java.lang.ReflectiveOperationException e) {
            b.g().p(e).ai(8053).y("%s", e.getMessage());
        }
    }
}
