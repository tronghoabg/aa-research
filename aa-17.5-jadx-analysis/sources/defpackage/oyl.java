package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.SystemClock;
import com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver;
import j$.util.Objects;
import j$.util.OptionalInt;

/* loaded from: classes2.dex */
public final class oyl implements oyo {
    private final kna a = kfl.g();

    public static OptionalInt a(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null || bluetoothDevice.getAddress().length() <= 2) {
            return OptionalInt.of(0);
        }
        return OptionalInt.of(bluetoothDevice.getAddress().substring(r2.length() - 2).hashCode());
    }

    @Override // defpackage.oyo
    public final void b(BluetoothDevice bluetoothDevice, boolean z) {
        this.a.g(z ? yxi.WIRELESS_SDP_MANAGER_ANDROID_AUTO_UUID : yxi.WIRELESS_SDP_MANAGER_FETCHED_ANDROID_AUTO_UUID, a(bluetoothDevice), SystemClock.elapsedRealtime());
        ((ype) ((ype) WifiBluetoothReceiver.a.f()).ai(6156)).M("Bluetooth device %s has %s Android Auto Wireless UUID", bluetoothDevice, true != z ? "fetched" : "cached");
    }

    @Override // defpackage.oyo
    public final void c(BluetoothDevice bluetoothDevice, boolean z) {
        this.a.g(z ? yxi.WIRELESS_SDP_MANAGER_EMPTY_UUIDS : yxi.WIRELESS_SDP_MANAGER_FETCHED_EMPTY_UUIDS, a(bluetoothDevice), SystemClock.elapsedRealtime());
        ((ype) ((ype) WifiBluetoothReceiver.a.f()).ai(6157)).M("Bluetooth device %s %s an empty list of UUIDs", bluetoothDevice, true != z ? "fetched" : "cached");
    }

    @Override // defpackage.oyo
    public final void d(BluetoothDevice bluetoothDevice) {
        this.a.g(yxi.WIRELESS_SDP_MANAGER_FETCH_UUIDS_NO_WAIT_UNSUPPORTED, a(bluetoothDevice), SystemClock.elapsedRealtime());
        ((ype) ((ype) WifiBluetoothReceiver.a.f()).ai((char) 6158)).y("Bluetooth device %s has unknown or null UUIDs and did not wait for UUID fetch", bluetoothDevice);
    }

    @Override // defpackage.oyo
    public final void e(BluetoothDevice bluetoothDevice, oyq oyqVar, oyq oyqVar2) {
        yxi yxiVar = yxi.WIRELESS_SDP_MANAGER_UUIDS_FETCHED;
        if (Objects.equals(oyqVar2, oyq.UUID_ARRAY_IS_NULL)) {
            oyn oynVar = oyn.SUPPORTED;
            int iOrdinal = oyqVar.ordinal();
            if (iOrdinal == 0) {
                yxiVar = yxi.WIRELESS_SDP_MANAGER_UUIDS_FETCHED_NULL_CACHED_NULL_RESULT;
            } else if (iOrdinal == 1) {
                yxiVar = yxi.WIRELESS_SDP_MANAGER_UUIDS_FETCHED_EMPTY_CACHED_NULL_RESULT;
            } else if (iOrdinal == 2) {
                yxiVar = yxi.WIRELESS_SDP_MANAGER_UUIDS_FETCHED_NIL_CACHED_NULL_RESULT;
            } else if (iOrdinal == 4) {
                yxiVar = yxi.WIRELESS_SDP_MANAGER_UUIDS_FETCHED_NO_AAW_CACHED_NULL_RESULT;
            }
        } else if (Objects.equals(oyqVar2, oyq.UUID_ARRAY_HAS_ONLY_NIL_ITEM)) {
            oyn oynVar2 = oyn.SUPPORTED;
            int iOrdinal2 = oyqVar.ordinal();
            if (iOrdinal2 == 0) {
                yxiVar = yxi.WIRELESS_SDP_MANAGER_UUIDS_FETCHED_NULL_CACHED_NIL_RESULT;
            } else if (iOrdinal2 == 1) {
                yxiVar = yxi.WIRELESS_SDP_MANAGER_UUIDS_FETCHED_EMPTY_CACHED_NIL_RESULT;
            } else if (iOrdinal2 == 2) {
                yxiVar = yxi.WIRELESS_SDP_MANAGER_UUIDS_FETCHED_NIL_CACHED_NIL_RESULT;
            } else if (iOrdinal2 == 4) {
                yxiVar = yxi.WIRELESS_SDP_MANAGER_UUIDS_FETCHED_NO_AAW_CACHED_NIL_RESULT;
            }
        }
        this.a.g(yxiVar, a(bluetoothDevice), SystemClock.elapsedRealtime());
        ((ype) ((ype) WifiBluetoothReceiver.a.f()).ai(6159)).M("Fetched UUIDs for Bluetooth device %s, result: %s", bluetoothDevice, oyqVar2);
    }

    @Override // defpackage.oyo
    public final void f(BluetoothDevice bluetoothDevice) {
        if (aczv.aH()) {
            this.a.g(yxi.WIRELESS_SDP_MANAGER_ILLEGAL_BOND_STATE, a(bluetoothDevice), SystemClock.elapsedRealtime());
        }
    }

    @Override // defpackage.oyo
    public final void g(BluetoothDevice bluetoothDevice, boolean z) {
        this.a.g(z ? yxi.WIRELESS_SDP_MANAGER_NIL_UUIDS : yxi.WIRELESS_SDP_MANAGER_FETCHED_NIL_UUIDS, a(bluetoothDevice), SystemClock.elapsedRealtime());
        ((ype) ((ype) WifiBluetoothReceiver.a.f()).ai(6160)).M("Bluetooth device %s %s list of UUIDs that only contains nil UUID", bluetoothDevice, true != z ? "fetched" : "cached");
    }

    @Override // defpackage.oyo
    public final void h(BluetoothDevice bluetoothDevice, boolean z) {
        this.a.g(z ? yxi.WIRELESS_SDP_MANAGER_NULL_UUIDS : yxi.WIRELESS_SDP_MANAGER_FETCHED_NULL_UUIDS, a(bluetoothDevice), SystemClock.elapsedRealtime());
        ((ype) ((ype) WifiBluetoothReceiver.a.f()).ai(6161)).M("Bluetooth device %s %s null list of UUIDs", bluetoothDevice, true != z ? "fetched" : "cached");
    }

    @Override // defpackage.oyo
    public final void i(BluetoothDevice bluetoothDevice) {
        this.a.g(yxi.WIRELESS_SDP_MANAGER_PREVIOULSY_KNOWN_UUID, a(bluetoothDevice), SystemClock.elapsedRealtime());
        ((ype) ((ype) WifiBluetoothReceiver.a.f()).ai((char) 6162)).y("Bluetooth device %s is previously known to have Android Auto UUID", bluetoothDevice);
    }
}
