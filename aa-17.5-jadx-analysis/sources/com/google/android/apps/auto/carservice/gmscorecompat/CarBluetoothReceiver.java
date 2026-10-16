package com.google.android.apps.auto.carservice.gmscorecompat;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.os.Build;
import defpackage.acvh;
import defpackage.adbu;
import defpackage.adbx;
import defpackage.adcd;
import defpackage.jfj;
import defpackage.mdd;
import defpackage.rhx;
import defpackage.sct;
import defpackage.scu;
import defpackage.scv;
import defpackage.scz;
import defpackage.sda;
import defpackage.sdb;
import defpackage.set;
import defpackage.seu;
import defpackage.sfr;
import defpackage.vky;
import defpackage.woy;
import defpackage.xxx;
import defpackage.ygr;
import defpackage.yno;
import defpackage.yns;
import defpackage.ype;
import defpackage.ypf;
import defpackage.yph;
import defpackage.zjc;
import defpackage.zjd;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class CarBluetoothReceiver extends mdd {
    private static final yph a = yph.c("CAR.BT_RCVR");

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("CarBluetoothReceiver");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) throws PackageManager.NameNotFoundException {
        scz sczVar;
        PackageInfo packageInfo;
        scu scuVar;
        if (Build.VERSION.SDK_INT < 30) {
            ((ype) ((ype) a.f()).ai((char) 2391)).u("Android is Q or below.");
            return;
        }
        intent.putExtra("android.bluetooth.device.extra.DEVICE", jfj.b(context, (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")));
        if (scz.a != null) {
            sczVar = scz.a;
        } else {
            synchronized (scz.class) {
                if (scz.a == null) {
                    scz.a = new scz(context.getApplicationContext());
                }
            }
            sczVar = scz.a;
        }
        sczVar.b = adbu.d();
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        Object obj = sczVar.c;
        ypf ypfVar = (ypf) obj;
        ypfVar.l().ai(8772).y("onHandleIntent %s", new zjd(zjc.a, intent.getAction()));
        if (bluetoothDevice == null) {
            ((yns) obj).f().ai(8776).u("Received bluetooth connected event but device details missing");
        } else if (!"android.bluetooth.device.action.UUID".equals(intent.getAction())) {
            int iA = sda.a(intent);
            if (iA == 2) {
                ypfVar.l().ai(8774).u("Handle Bluetooth connected");
                boolean z = adcd.c() && sda.b(bluetoothDevice.getUuids());
                boolean zC = sda.c(intent);
                if (z) {
                    sczVar.c(bluetoothDevice, true, false);
                } else if (sczVar.b && zC && sczVar.b(bluetoothDevice, false)) {
                    sczVar.c(bluetoothDevice, false, true);
                }
            } else if (iA == 0) {
                ypfVar.l().ai(8773).u("Handle Bluetooth disconnected and reset foregroundServiceStarted");
                ((AtomicBoolean) sczVar.e).set(false);
                boolean zC2 = sda.c(intent);
                if (sczVar.b && zC2 && sczVar.b(bluetoothDevice, true)) {
                    ((yns) obj).f().ai(8771).u("Stop CarStartupService");
                    ((Context) sczVar.d).stopService(scz.a("android.bluetooth.device.action.ACL_DISCONNECTED"));
                }
            }
        } else if (Build.VERSION.SDK_INT < 30 && sda.b(intent.getParcelableArrayExtra("android.bluetooth.device.extra.UUID"))) {
            ypfVar.l().ai(8775).u("Handle ACTION_UUID event; wireless supported");
            sczVar.c(bluetoothDevice, true, false);
        }
        if (acvh.A()) {
            return;
        }
        ypf ypfVar2 = sdb.a;
        BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice2 == null) {
            sdb.a.h().ai(8785).u("PreSetupLaunchHelper: Bluetooth device is null");
            return;
        }
        UsbAccessory[] accessoryList = ((UsbManager) context.getSystemService(UsbManager.class)).getAccessoryList();
        if (accessoryList != null && accessoryList.length > 0) {
            sdb.a.h().ai(8784).u("Suppressing WiFi triggered flow due to likely USB Head Unit connection");
            return;
        }
        if (sda.a(intent) == 2) {
            if (!sda.c(intent)) {
                ygr ygrVarM = ygr.m(xxx.c(',').b().g(adbx.a.gu().b()));
                String strAl = woy.al(bluetoothDevice2.getName());
                yno it = ygrVarM.iterator();
                while (it.hasNext()) {
                    if (strAl.contains((String) it.next())) {
                    }
                }
                return;
            }
            if (sda.b(bluetoothDevice2.getUuids())) {
                ypf ypfVar3 = scv.a;
                PackageManager packageManager = context.getPackageManager();
                if (adcd.c()) {
                    set setVar = seu.a;
                    if (setVar.c(context)) {
                        scv.a.l().ai(8767).u("Gearhead is disabled");
                        scuVar = scu.i;
                    } else if (setVar.d(context)) {
                        scv.a.l().ai(8766).u("Gearhead is up to date");
                        scuVar = scu.e;
                    } else if (Build.VERSION.SDK_INT < adbx.a.gu().a()) {
                        scv.a.h().ai(8765).u("SDK version below wifi enabled version");
                        scuVar = scu.d;
                    } else {
                        try {
                            packageInfo = packageManager.getPackageInfo("com.google.android.projection.gearhead", 4096);
                        } catch (PackageManager.NameNotFoundException unused) {
                            packageInfo = null;
                        }
                        if (packageInfo != null && packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", "com.google.android.projection.gearhead") != 0 && !adbx.a.gu().d()) {
                            scv.a.h().ai(8764).u("Location permission denied on Android Auto");
                            scuVar = scu.g;
                        } else if (((LocationManager) context.getSystemService("location")).isProviderEnabled("gps") || adbx.a.gu().c()) {
                            scv.a.l().ai(8762).u("Can show download flow");
                            scuVar = scu.a;
                        } else {
                            scv.a.h().ai(8763).u("Location Services disabled");
                            scuVar = scu.h;
                        }
                    }
                } else {
                    scv.a.l().ai(8768).u("Phone not an approved wireless device");
                    scuVar = scu.c;
                }
                if (scuVar != scu.a) {
                    sdb.a.l().ai(8782).y("WifiSupportChecker returned: %s", scuVar);
                    return;
                }
                int i = sct.a;
                int iB = sct.b(context);
                int i2 = sfr.a;
                Intent intent2 = new Intent();
                rhx rhxVar = rhx.c;
                sfr.a(context, 2, iB, intent2.setClassName("com.google.android.projection.gearhead", acvh.m()));
            }
        }
    }
}
