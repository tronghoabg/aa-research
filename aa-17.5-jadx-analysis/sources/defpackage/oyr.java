package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.ParcelUuid;
import j$.util.Optional;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class oyr {
    public static final yph a = yph.c("CAR.BTCapsStore");
    static final UUID b = UUID.fromString("4de17a00-52cb-11e6-bdf4-0800200c9a66");
    static final UUID c = UUID.fromString("669a0c20-0008-f4bd-e611-cb52007ae14d");
    private static final xyc f = wub.L(new joa(13));
    public final scx d;
    public final oyo e;
    private final Context g;

    public oyr(Context context, scx scxVar, oyo oyoVar) {
        this.d = scxVar;
        this.g = context.getApplicationContext();
        this.e = oyoVar;
    }

    public static oyq c(List list) {
        return list == null ? oyq.UUID_ARRAY_IS_NULL : list.isEmpty() ? oyq.UUID_ARRAY_IS_EMPTY : (list.size() == 1 && ((ParcelUuid) list.get(0)).getUuid().equals(new UUID(0L, 0L))) ? oyq.UUID_ARRAY_HAS_ONLY_NIL_ITEM : j((ParcelUuid[]) list.toArray(new ParcelUuid[0])) != null ? oyq.UUID_ARRAY_HAS_AA_UUID : oyq.UUID_ARRAY_HAS_OTHER_ITEM;
    }

    public static void e(oyo oyoVar, BluetoothDevice bluetoothDevice, oyq oyqVar, boolean z) {
        int iOrdinal = oyqVar.ordinal();
        if (iOrdinal == 0) {
            oyoVar.h(bluetoothDevice, z);
            return;
        }
        if (iOrdinal == 1) {
            oyoVar.c(bluetoothDevice, z);
        } else if (iOrdinal == 2) {
            oyoVar.g(bluetoothDevice, z);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            oyoVar.b(bluetoothDevice, z);
        }
    }

    public static final oyq g(ParcelUuid[] parcelUuidArr) {
        return c(parcelUuidArr == null ? null : Arrays.asList(parcelUuidArr));
    }

    public static final boolean h(BluetoothDevice bluetoothDevice) {
        try {
            if (bluetoothDevice.getBondState() == 12) {
                return false;
            }
            ((ype) ((ype) a.h()).ai(6200)).u("Device not bonded, thus it's not currently AAW capable.");
            return true;
        } catch (NullPointerException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 6201)).y("Unable to determine bond state for device %s.", bluetoothDevice);
            return true;
        }
    }

    public static final zgp i(oyn oynVar) {
        ((ype) ((ype) a.f()).ai((char) 6204)).y("AAW status (%s).", oynVar.name());
        return wub.Y(oynVar);
    }

    private static ParcelUuid j(ParcelUuid[] parcelUuidArr) {
        for (ParcelUuid parcelUuid : parcelUuidArr) {
            if (parcelUuid != null && (b.equals(parcelUuid.getUuid()) || c.equals(parcelUuid.getUuid()))) {
                return parcelUuid;
            }
        }
        return null;
    }

    public final oyq a(ParcelUuid[] parcelUuidArr, BluetoothDevice bluetoothDevice) {
        oyq oyqVarG = g(parcelUuidArr);
        if (oyqVarG.equals(oyq.UUID_ARRAY_HAS_AA_UUID)) {
            ((ype) ((ype) a.f()).ai((char) 6188)).u("This device has known UUID, added it to BT Caps store");
            String address = bluetoothDevice.getAddress();
            UUID uuid = j(parcelUuidArr).getUuid();
            if (b.equals(uuid)) {
                this.d.c(address, scw.b);
                return oyqVarG;
            }
            if (c.equals(uuid)) {
                this.d.c(address, scw.c);
            }
        }
        return oyqVarG;
    }

    public final oyq b(BluetoothDevice bluetoothDevice) {
        oyq oyqVarA = a(bluetoothDevice.getUuids(), bluetoothDevice);
        e(this.e, bluetoothDevice, oyqVarA, true);
        return oyqVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [zgp] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, oyo] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, zgp] */
    public final zgp d(Executor executor, BluetoothDevice bluetoothDevice, oyp oypVar) {
        ?? r12;
        if (h(bluetoothDevice)) {
            this.e.f(bluetoothDevice);
            return i(oyn.NOT_BONDED);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            Context context = this.g;
            if (dup.c(context, "android.permission.BLUETOOTH_CONNECT") == 0 && dup.c(context, "android.permission.BLUETOOTH_PRIVILEGED") == 0) {
                try {
                    byte[] metadata = bluetoothDevice.getMetadata(17);
                    if (metadata != null) {
                        String str = new String(metadata);
                        if (((ygr) f.gu()).contains(str)) {
                            ((ype) ((ype) a.f()).ai((char) 6202)).y("Device of type %s found, which is known to not be a car. Skipping setup.", str);
                            return i(oyn.NOT_SUPPORTED);
                        }
                    }
                } catch (SecurityException e) {
                    ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 6203)).u("SecurityException thrown despite permissions being granted for BluetoothDevice#getMetadata");
                    kfl.g().d(yxi.WIRELESS_SDP_MANAGER_GET_METADATA_API_FAILED);
                }
            }
        }
        String address = bluetoothDevice.getAddress();
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 6189)).y("Checking device with address %s", address);
        scx scxVar = this.d;
        EnumSet enumSetA = scxVar.a(address);
        if (enumSetA.contains(scw.b) || enumSetA.contains(scw.c)) {
            ((ype) ((ype) yphVar.f()).ai((char) 6195)).u("This device previously has known UUID.");
            this.e.i(bluetoothDevice);
            return i(oyn.SUPPORTED);
        }
        oyq oyqVarB = b(bluetoothDevice);
        if (oyqVarB.equals(oyq.UUID_ARRAY_HAS_AA_UUID)) {
            return i(oyn.SUPPORTED);
        }
        boolean z = oyqVarB.f;
        int i = 1;
        if (!z) {
            ((ype) ((ype) yphVar.h()).ai(6194)).y("Error while obtaining cached UUIDs%s", true != oypVar.d ? "." : ", issuing SDP request.");
        }
        scy scyVar = (scy) scxVar;
        scyVar.f();
        if (scyVar.a.getStringSet("SDP_REQUESTED_MAC_ADDRESS_STORE", yly.a).contains(address) && z) {
            ((ype) yphVar.l().ai((char) 6193)).u("This device with address has already requested sdp.");
            return i(oyn.NOT_SUPPORTED);
        }
        if (oypVar == oyp.DONT_REQUEST) {
            ((ype) ((ype) yphVar.h()).ai(6192)).y("Device have %s and won't request SDP.", true != z ? "invalid UUIDs" : "valid UUIDs but doesn't contain AA UUID");
            return i(oyn.UNKNOWN_AND_DONT_TRY_RFCOMM);
        }
        ((ype) ((ype) yphVar.f()).ai((char) 6190)).u("Perform a service discovery on the remote device to get the supported UUIDs.");
        if (oypVar == oyp.REQUEST_AND_IGNORE_RESULT || executor == null) {
            bluetoothDevice.fetchUuidsWithSdp();
            this.e.d(bluetoothDevice);
            this.d.b(address);
            ((ype) ((ype) yphVar.h()).ai((char) 6191)).u("Request SDP and immediately return");
            return i(oyn.UNKNOWN_AND_DONT_TRY_RFCOMM);
        }
        if (oypVar != oyp.REQUEST_AND_WAIT_FOR_UUID) {
            throw new IllegalArgumentException("Unknown SdpRequestType");
        }
        Context context2 = this.g;
        oyo oyoVar = this.e;
        oyw oywVarA = oyw.a(context2);
        Optional optionalOf = Optional.of(oyoVar);
        Optional optionalOf2 = Optional.of(oyqVarB);
        ((ype) oyw.a.l().ai((char) 6206)).y("fetchUuidsAsync called for %s", bluetoothDevice);
        Map map = oywVarA.d;
        synchronized (map) {
            if (map.containsKey(bluetoothDevice)) {
                ((ype) oyw.a.l().ai(6207)).u("SDP query ongoing so simply return");
                r12 = ((trd) oywVarA.d.get(bluetoothDevice)).a;
            } else {
                synchronized (map) {
                    if (!oywVarA.h) {
                        dup.e(oywVarA.c, oywVarA.f, new IntentFilter("android.bluetooth.device.action.UUID"), null, 2);
                        oywVarA.h = true;
                    }
                    Handler handler = oywVarA.e;
                    Runnable runnable = oywVarA.g;
                    handler.removeCallbacks(runnable);
                    handler.postDelayed(runnable, oyw.b.toMillis());
                    trd trdVar = new trd(null);
                    trdVar.a = dsg.w(new fjy((Object) trdVar, bluetoothDevice, 5));
                    oywVarA.d.put(bluetoothDevice, trdVar);
                    oys oysVar = new oys(trdVar, optionalOf2, bluetoothDevice, 0);
                    optionalOf.isPresent();
                    ?? r1 = optionalOf.get();
                    wub.ah(((trd) oysVar.a).a, new oyu((oyo) r1, (Optional) oysVar.b, (BluetoothDevice) oysVar.c, 0), mki.a.d);
                    bluetoothDevice.fetchUuidsWithSdp();
                    r12 = trdVar.a;
                }
            }
        }
        return zfb.g(r12, new vzf(this, address, i), executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(BluetoothDevice bluetoothDevice, boolean z) {
        try {
            zgp zgpVarD = d(null, bluetoothDevice, z ? oyp.REQUEST_AND_IGNORE_RESULT : oyp.DONT_REQUEST);
            if (zgpVarD.isDone()) {
                return ((oyn) zgpVarD.get()).f;
            }
            throw new IllegalStateException("This method was expecting an already completed ListenableFuture.");
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException("This method was expecting an already completed ListenableFuture.", e);
        }
    }

    public oyr(Context context, scx scxVar) {
        this(context, scxVar, new oym());
    }
}
