package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final /* synthetic */ class oyf implements zfk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ oyf(WifiBluetoothReceiver wifiBluetoothReceiver, BluetoothDevice bluetoothDevice, Context context, Intent intent, int i) {
        this.e = i;
        this.a = wifiBluetoothReceiver;
        this.d = bluetoothDevice;
        this.b = context;
        this.c = intent;
    }

    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, keu] */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    @Override // defpackage.zfk
    public final zgp a(Object obj) {
        zgp zgpVar;
        int i = this.e;
        if (i == 0) {
            if (!((Boolean) obj).booleanValue()) {
                ((ype) WifiBluetoothReceiver.a.l().ai((char) 6176)).u("Rfcomm failed");
                return wub.Y(false);
            }
            Object obj2 = this.d;
            Object obj3 = this.c;
            Object obj4 = this.b;
            Object obj5 = this.a;
            ((ype) WifiBluetoothReceiver.a.l().ai((char) 6177)).u("Rfcomm succeed, start wireless setup service");
            return ((WifiBluetoothReceiver) obj5).g((Context) obj4, (Intent) obj3, (BluetoothDevice) obj2);
        }
        if (i == 1) {
            kex kexVar = (kex) this.a;
            ?? r2 = kexVar.a;
            Object obj6 = this.d;
            Object obj7 = this.b;
            zgp zgpVarAe = wub.ae(this.c.a((Context) obj7, (ComponentName) obj6), 10L, TimeUnit.SECONDS, r2);
            kew kewVar = new kew(obj7, 0);
            Object obj8 = kexVar.c;
            return zfb.f(zet.g(zgpVarAe, TimeoutException.class, kewVar, new fpe(obj8, 3)), new ikk((yfq) obj, 7), new fpe(obj8, 3));
        }
        if (i != 2) {
            if (i != 3) {
                Object obj9 = this.a;
                if (!((String) obj).equals(obj9)) {
                    return zgl.a;
                }
                wyd wydVar = wdf.a;
                if (wydVar != null && wydVar.b(((wcw) this.b).a, (String) obj9)) {
                    return zgl.a;
                }
                return ((wae) this.d).e().e(((wdo) this.c).c);
            }
            wdo wdoVar = (wdo) wub.af(this.c);
            if (wdoVar.c.isEmpty()) {
                return zgl.a;
            }
            Object obj10 = this.a;
            Object obj11 = this.b;
            wae waeVar = (wae) this.d;
            wcw wcwVar = (wcw) obj11;
            return zfb.g(zgj.v(zgj.v(wcy.b(waeVar).c()).w(new rgf(wcwVar.a, 13), waeVar.b())), new oyf((String) obj10, wcwVar, waeVar, wdoVar, 4), waeVar.b());
        }
        oyn oynVar = (oyn) obj;
        oyq oyqVar = oyq.UUID_ARRAY_IS_NULL;
        oyn oynVar2 = oyn.SUPPORTED;
        int iOrdinal = oynVar.ordinal();
        Object obj12 = this.c;
        Object obj13 = this.b;
        Object obj14 = this.d;
        Object obj15 = this.a;
        if (iOrdinal == 0) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) obj14;
            ((ype) ((ype) WifiBluetoothReceiver.a.f()).ai((char) 6173)).y("Connected: %s", bluetoothDevice.getName());
            return ((WifiBluetoothReceiver) obj15).g((Context) obj13, (Intent) obj12, bluetoothDevice);
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                wub.ah(ozf.b().e((BluetoothDevice) obj14), new ikn(obj14, 12), mki.a.d);
            } else {
                if (iOrdinal == 3) {
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) obj14;
                    ((ype) ((ype) WifiBluetoothReceiver.a.f()).ai((char) 6174)).y("Try rfcomm connection on %s after invalid SDP query", bluetoothDevice2.getName());
                    Map map = WifiBluetoothReceiver.b;
                    synchronized (map) {
                        if (map.containsKey(obj14)) {
                            zgpVar = (zgp) map.get(obj14);
                        } else {
                            map.put(obj14, omc.a().g((BluetoothDevice) obj14, (Context) obj13));
                            zgpVar = (zgp) map.get(obj14);
                            wub.ah(zgpVar, new ikn(obj14, 11), mki.a.d);
                        }
                    }
                    return zfb.g(zgpVar, new oyf((WifiBluetoothReceiver) obj15, (Context) obj13, (Intent) obj12, bluetoothDevice2, 0), mki.a.d);
                }
                if (iOrdinal != 4) {
                    throw new AssertionError("Unexpected DeviceAawStatus: ".concat(String.valueOf(String.valueOf(oynVar))));
                }
            }
        }
        ((BluetoothDevice) obj14).getName();
        return wub.Y(false);
    }

    public /* synthetic */ oyf(WifiBluetoothReceiver wifiBluetoothReceiver, Context context, Intent intent, BluetoothDevice bluetoothDevice, int i) {
        this.e = i;
        this.a = wifiBluetoothReceiver;
        this.b = context;
        this.c = intent;
        this.d = bluetoothDevice;
    }

    public /* synthetic */ oyf(String str, wcw wcwVar, wae waeVar, wdo wdoVar, int i) {
        this.e = i;
        this.a = str;
        this.b = wcwVar;
        this.d = waeVar;
        this.c = wdoVar;
    }

    public /* synthetic */ oyf(kex kexVar, keu keuVar, Context context, ComponentName componentName, int i) {
        this.e = i;
        this.a = kexVar;
        this.c = keuVar;
        this.b = context;
        this.d = componentName;
    }

    public /* synthetic */ oyf(wae waeVar, zgp zgpVar, wcw wcwVar, String str, int i) {
        this.e = i;
        this.d = waeVar;
        this.c = zgpVar;
        this.b = wcwVar;
        this.a = str;
    }
}
