package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j$.time.Duration;
import j$.util.Map;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class orf implements oqe {
    public static final yph a = yph.c("GH.WirelessUtils");
    public static final Duration b = Duration.ofSeconds(5);
    private ozk g;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final AtomicBoolean d = new AtomicBoolean();
    private final LinkedHashMap h = new LinkedHashMap();
    public final xyc e = wub.L(new imq(15));
    private final Random i = new Random();
    public final BroadcastReceiver f = new ore(this);

    @Override // defpackage.oqe
    public final synchronized int a() {
        int iNextInt;
        LinkedHashMap linkedHashMap = this.h;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (linkedHashMap.size() <= aczv.l()) {
                if (((Duration) entry.getValue()).compareTo(Duration.ofMillis(SystemClock.elapsedRealtime()).minus(Duration.ofSeconds(aczv.c()))) > 0) {
                    break;
                }
                it.remove();
            } else {
                it.remove();
            }
        }
        while (true) {
            iNextInt = this.i.nextInt();
            if (iNextInt == 0 || iNextInt == -1 || Map.EL.putIfAbsent(linkedHashMap, Integer.valueOf(iNextInt), Duration.ofMillis(SystemClock.elapsedRealtime())) != null) {
            }
        }
        return iNextInt;
    }

    @Override // defpackage.oqe
    public final SharedPreferences b(Context context) {
        return new kmy(context, "aaw_device_compatibility");
    }

    @Override // defpackage.oqe
    public final ozk c() {
        ozk ozkVar;
        synchronized (this) {
            if (this.g == null) {
                if (aczm.d()) {
                    this.g = new ozl(xxx.c(',').f().b().i(aczm.c()));
                } else {
                    this.g = new ozi();
                }
            }
            ozkVar = this.g;
        }
        return ozkVar;
    }

    @Override // defpackage.oqe
    public final ygr d() {
        return ygr.m(xxx.c(',').b().g(aczv.Y()));
    }

    @Override // defpackage.oqe
    public final zgp e(Context context, oyo oyoVar) {
        return f(mki.a.d, new jud(new oyr(context, mpl.f().b(), oyoVar), 5));
    }

    @Override // defpackage.oqe
    public final zgp f(Executor executor, final xxj xxjVar) {
        final zhc zhcVar = new zhc();
        final Runnable runnable = new Runnable() { // from class: orc
            @Override // java.lang.Runnable
            public final void run() {
                yph yphVar = orf.a;
                zhcVar.p(new TimeoutException("Timed out waiting for acl evaluation"));
            }
        };
        if (aczv.a.gu().as()) {
            this.c.postDelayed(runnable, acot.b());
        }
        executor.execute(new Runnable() { // from class: ord
            @Override // java.lang.Runnable
            public final void run() {
                orf orfVar = this.a;
                xxj xxjVar2 = xxjVar;
                Runnable runnable2 = runnable;
                zhc zhcVar2 = zhcVar;
                try {
                    for (BluetoothDevice bluetoothDevice : BluetoothAdapter.getDefaultAdapter().getBondedDevices()) {
                        if (bluetoothDevice.isConnected() && xxjVar2.a(bluetoothDevice)) {
                            ((ype) orf.a.l().ai(6084)).y("Found matching device %s with connected profile", bluetoothDevice);
                            if (aczv.a.gu().as()) {
                                orfVar.c.removeCallbacks(runnable2);
                            }
                            zhcVar2.o(bluetoothDevice);
                            return;
                        }
                    }
                    if (aczv.a.gu().as()) {
                        orfVar.c.removeCallbacks(runnable2);
                    }
                    zhcVar2.o(null);
                } catch (Throwable th) {
                    ((ype) ((ype) ((ype) orf.a.h()).p(th)).ai((char) 6083)).u("getAclConnectedBluetoothDevice failed");
                    if (aczv.a.gu().as()) {
                        orfVar.c.removeCallbacks(runnable2);
                    }
                    zhcVar2.p(th);
                }
            }
        });
        return zhcVar;
    }

    @Override // defpackage.oqe
    public final zgp g(BluetoothDevice bluetoothDevice, Context context) {
        return dsg.w(new fjy((Object) context, bluetoothDevice, 4));
    }

    @Override // defpackage.oqe
    public final zgp h(Executor executor) {
        return dsg.w(new fjy(this, executor, 3));
    }

    @Override // defpackage.oqe
    public final boolean i(Context context) {
        UsbAccessory[] accessoryList;
        UsbManager usbManager = (UsbManager) context.getSystemService("usb");
        if (usbManager != null && (accessoryList = usbManager.getAccessoryList()) != null) {
            for (UsbAccessory usbAccessory : accessoryList) {
                if (usbAccessory != null && ("Android Auto".equals(usbAccessory.getModel()) || "Android Open Automotive Protocol".equals(usbAccessory.getModel()))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.oqe
    public final boolean j(BluetoothDevice bluetoothDevice) {
        return bluetoothDevice != null && jlp.b(d(), bluetoothDevice);
    }

    @Override // defpackage.oqe
    public final boolean k(Context context) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, "com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver")) != 2;
    }

    @Override // defpackage.oqe
    public final void l(Context context, boolean z) {
        ComponentName componentName = new ComponentName(context, "com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver");
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 6089)).y("Enable / disable wireless projection %b", Boolean.valueOf(z));
        context.getPackageManager().setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
            defaultAdapter.disable();
            Handler handler = this.c;
            handler.removeCallbacksAndMessages(defaultAdapter);
            handler.postDelayed(new oez(defaultAdapter, 13), defaultAdapter, 2000L);
        }
        if (z) {
            return;
        }
        context.sendBroadcast(new Intent().setAction("com.google.android.apps.auto.components.wireless.impl.WirelessUtilsImpl.ACTION_WIRELESS_AA_STOP_PROJECTION").setComponent(new ComponentName(context, "com.google.android.apps.auto.carservice.service.impl.GearheadCarServiceCallbacks$CarModeBroadcastReceiver")));
        WifiManager wifiManager = (WifiManager) context.getSystemService(WifiManager.class);
        if (wifiManager.isWifiEnabled() && this.d.compareAndSet(false, true)) {
            Context applicationContext = context.getApplicationContext();
            BroadcastReceiver broadcastReceiver = this.f;
            dup.e(applicationContext, broadcastReceiver, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"), null, 2);
            Handler handler2 = this.c;
            handler2.removeCallbacksAndMessages(broadcastReceiver);
            handler2.postDelayed(new ojl(this, applicationContext, 3), broadcastReceiver, b.toMillis());
            ((ype) ((ype) yphVar.f()).ai((char) 6090)).u("Toggling Wi-Fi state");
            wifiManager.setWifiEnabled(false);
        }
    }
}
