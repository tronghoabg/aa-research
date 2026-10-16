package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class osc implements defpackage.oqy {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.WirelessUtils");
    public static final j$.time.Duration b = j$.time.Duration.ofSeconds(5);
    private pah g;
    public final android.os.Handler c = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.LinkedHashMap h = new java.util.LinkedHashMap();
    public final defpackage.xzi e = defpackage.ysr.aQ(new defpackage.imy(14));
    private final java.util.Random i = new java.util.Random();
    public final android.content.BroadcastReceiver f = new defpackage.osb(this);

    @Override // defpackage.oqy
    public final synchronized int a() {
        int iNextInt;
        java.util.LinkedHashMap linkedHashMap = this.h;
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (linkedHashMap.size() <= defpackage.adax.l()) {
                if (((j$.time.Duration) entry.getValue()).compareTo(j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime()).minus(j$.time.Duration.ofSeconds(defpackage.adax.c()))) > 0) {
                    break;
                }
                it.remove();
            } else {
                it.remove();
            }
        }
        while (true) {
            iNextInt = this.i.nextInt();
            if (iNextInt == 0 || iNextInt == -1 || j$.util.Map.-EL.putIfAbsent(linkedHashMap, java.lang.Integer.valueOf(iNextInt), j$.time.Duration.ofMillis(android.os.SystemClock.elapsedRealtime())) != null) {
            }
        }
        return iNextInt;
    }

    @Override // defpackage.oqy
    public final android.content.SharedPreferences b(android.content.Context context) {
        return new defpackage.knf(context, "aaw_device_compatibility");
    }

    @Override // defpackage.oqy
    public final pah c() {
        pah pahVar;
        synchronized (this) {
            if (this.g == null) {
                if (adao.d()) {
                    this.g = new pai(defpackage.xzd.c(',').f().b().i(adao.c()));
                } else {
                    this.g = new paf();
                }
            }
            pahVar = this.g;
        }
        return pahVar;
    }

    @Override // defpackage.oqy
    public final defpackage.yhx d() {
        return defpackage.yhx.m(defpackage.xzd.c(',').b().g(defpackage.adax.Y()));
    }

    @Override // defpackage.oqy
    public final defpackage.zhs e(android.content.Context context, ozm ozmVar) {
        return f(defpackage.mkp.a.d, new defpackage.juh(new ozp(context, defpackage.mpr.f().b(), ozmVar), 5));
    }

    @Override // defpackage.oqy
    public final defpackage.zhs f(java.util.concurrent.Executor executor, final defpackage.xyp xypVar) {
        final defpackage.zif zifVar = new defpackage.zif();
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: ory
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.yqm yqmVar = defpackage.osc.a;
                zifVar.p(new java.util.concurrent.TimeoutException("Timed out waiting for acl evaluation"));
            }
        };
        if (defpackage.adax.a.fF().as()) {
            this.c.postDelayed(runnable, defpackage.acpv.b());
        }
        executor.execute(new java.lang.Runnable() { // from class: orz
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.osc oscVar = this.a;
                defpackage.xyp xypVar2 = xypVar;
                java.lang.Runnable runnable2 = runnable;
                defpackage.zif zifVar2 = zifVar;
                try {
                    for (android.bluetooth.BluetoothDevice bluetoothDevice : android.bluetooth.BluetoothAdapter.getDefaultAdapter().getBondedDevices()) {
                        if (bluetoothDevice.isConnected() && xypVar2.a(bluetoothDevice)) {
                            ((defpackage.yqj) defpackage.osc.a.l().ai(6110)).y("Found matching device %s with connected profile", bluetoothDevice);
                            if (defpackage.adax.a.fF().as()) {
                                oscVar.c.removeCallbacks(runnable2);
                            }
                            zifVar2.o(bluetoothDevice);
                            return;
                        }
                    }
                    if (defpackage.adax.a.fF().as()) {
                        oscVar.c.removeCallbacks(runnable2);
                    }
                    zifVar2.o(null);
                } catch (java.lang.Throwable th) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.osc.a.h()).p(th)).ai((char) 6109)).u("getAclConnectedBluetoothDevice failed");
                    if (defpackage.adax.a.fF().as()) {
                        oscVar.c.removeCallbacks(runnable2);
                    }
                    zifVar2.p(th);
                }
            }
        });
        return zifVar;
    }

    @Override // defpackage.oqy
    public final defpackage.zhs g(android.bluetooth.BluetoothDevice bluetoothDevice, android.content.Context context) {
        return defpackage.dlv.n(new fkg(context, bluetoothDevice, 4));
    }

    @Override // defpackage.oqy
    public final defpackage.zhs h(java.util.concurrent.Executor executor) {
        return defpackage.dlv.n(new fkg(this, executor, 3));
    }

    @Override // defpackage.oqy
    public final boolean i(android.content.Context context) {
        android.hardware.usb.UsbAccessory[] accessoryList;
        android.hardware.usb.UsbManager usbManager = (android.hardware.usb.UsbManager) context.getSystemService("usb");
        if (usbManager != null && (accessoryList = usbManager.getAccessoryList()) != null) {
            for (android.hardware.usb.UsbAccessory usbAccessory : accessoryList) {
                if (usbAccessory != null && ("Android Auto".equals(usbAccessory.getModel()) || "Android Open Automotive Protocol".equals(usbAccessory.getModel()))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.oqy
    public final boolean j(android.bluetooth.BluetoothDevice bluetoothDevice) {
        return bluetoothDevice != null && jlw.b(d(), bluetoothDevice);
    }

    @Override // defpackage.oqy
    public final boolean k(android.content.Context context) {
        return context.getPackageManager().getComponentEnabledSetting(new android.content.ComponentName(context, "com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver")) != 2;
    }

    @Override // defpackage.oqy
    public final void l(android.content.Context context, boolean z) {
        android.content.ComponentName componentName = new android.content.ComponentName(context, "com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver");
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 6115)).y("Enable / disable wireless projection %b", java.lang.Boolean.valueOf(z));
        context.getPackageManager().setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
            defaultAdapter.disable();
            android.os.Handler handler = this.c;
            handler.removeCallbacksAndMessages(defaultAdapter);
            jx$.ExternalSyntheticApiModelOutline3.m(handler, new osa(defaultAdapter, 0), defaultAdapter, 2000L);
        }
        if (z) {
            return;
        }
        context.sendBroadcast(new android.content.Intent().setAction("com.google.android.apps.auto.components.wireless.impl.WirelessUtilsImpl.ACTION_WIRELESS_AA_STOP_PROJECTION").setComponent(new android.content.ComponentName(context, "com.google.android.apps.auto.carservice.service.impl.GearheadCarServiceCallbacks$CarModeBroadcastReceiver")));
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) context.getSystemService(android.net.wifi.WifiManager.class);
        if (wifiManager.isWifiEnabled() && this.d.compareAndSet(false, true)) {
            android.content.Context applicationContext = context.getApplicationContext();
            android.content.BroadcastReceiver broadcastReceiver = this.f;
            defpackage.duw.e(applicationContext, broadcastReceiver, new android.content.IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"), null, 2);
            android.os.Handler handler2 = this.c;
            handler2.removeCallbacksAndMessages(broadcastReceiver);
            jx$.ExternalSyntheticApiModelOutline3.m(handler2, new oft(this, applicationContext, 6), broadcastReceiver, b.toMillis());
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 6116)).u("Toggling Wi-Fi state");
            wifiManager.setWifiEnabled(false);
        }
    }
}
