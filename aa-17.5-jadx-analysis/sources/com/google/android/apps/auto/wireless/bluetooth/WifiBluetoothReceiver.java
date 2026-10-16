package com.google.android.apps.auto.wireless.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.companion.CompanionDeviceManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.MacAddress;
import android.os.Build;
import android.util.Range;
import defpackage.a$$ExternalSyntheticApiModelOutline0;
import defpackage.aczv;
import defpackage.dsg;
import defpackage.dup;
import defpackage.gjv;
import defpackage.jfj;
import defpackage.jky;
import defpackage.kfl;
import defpackage.khs;
import defpackage.kna;
import defpackage.kwu;
import defpackage.mki;
import defpackage.mpl;
import defpackage.omc;
import defpackage.oyc;
import defpackage.oyd;
import defpackage.oyf;
import defpackage.oyg;
import defpackage.oyh;
import defpackage.oyi;
import defpackage.oyl;
import defpackage.oyp;
import defpackage.oyr;
import defpackage.pam;
import defpackage.pan;
import defpackage.pap;
import defpackage.vky;
import defpackage.woy;
import defpackage.wub;
import defpackage.yfb;
import defpackage.yfd;
import defpackage.yfq;
import defpackage.ygr;
import defpackage.yhe;
import defpackage.ymc;
import defpackage.ymq;
import defpackage.yms;
import defpackage.yni;
import defpackage.ype;
import defpackage.yph;
import defpackage.yrm;
import defpackage.ysi;
import defpackage.yxi;
import defpackage.zfb;
import defpackage.zfk;
import defpackage.zgj;
import defpackage.zgp;
import j$.util.OptionalInt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class WifiBluetoothReceiver extends kwu {
    public static final ygr c;
    public static final gjv i;
    private static final yfd l;
    private static final yhe m;
    public final BroadcastReceiver d = new oyi(this);
    public final Object e = new Object();
    public BluetoothDevice f = null;
    private jky n;
    public static final yph a = yph.c("GH.WifiBluetoothRcvr");
    private static final Range j = Range.create(0, 100);
    private static final Object k = new Object();
    public static final Map b = new HashMap();

    public static class WifiBluetoothReceiverNonExported extends WifiBluetoothReceiver {
    }

    static {
        yhe ymqVar;
        yfb yfbVar = new yfb();
        yfbVar.c("android.intent.action.BOOT_COMPLETED", yxi.WIRELESS_SETUP_SHARED_ACTION_BOOT_COMPLETED);
        yfbVar.c("android.intent.action.MY_PACKAGE_REPLACED", yxi.WIRELESS_SETUP_SHARED_ACTION_MY_PACKAGE_REPLACED);
        yfbVar.c("com.google.android.projection.gearhead.START_WIRELESS_PROJECTION", yxi.WIRELESS_SETUP_SHARED_ACTION_START_WIRELESS_PROJECTION);
        yfbVar.c("android.bluetooth.device.action.ACL_CONNECTED", yxi.WIRELESS_SETUP_SHARED_ACTION_ACL_CONNECTED);
        yfbVar.c("com.google.android.projection.gearhead.RESCAN_AFTER_WELCOME_DOWNLOAD", yxi.WIRELESS_SETUP_SHARED_RESCAN_AFTER_WELCOME_DOWNLOAD);
        yfbVar.c("android.bluetooth.device.action.BOND_STATE_CHANGED", yxi.WIRELESS_SETUP_SHARED_ACTION_BOND_STATE_CHANGED);
        l = yfbVar.b();
        ArrayList<yni> arrayList = new ArrayList();
        ysi.i("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", 1, yxi.WIRELESS_SETUP_SHARED_HFP_CONNECTING, arrayList);
        ysi.i("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", 2, yxi.WIRELESS_SETUP_SHARED_HFP_CONNECTED, arrayList);
        ysi.i("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", 1, yxi.WIRELESS_SETUP_SHARED_A2DP_CONNECTING, arrayList);
        ysi.i("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", 2, yxi.WIRELESS_SETUP_SHARED_A2DP_CONNECTED, arrayList);
        int size = arrayList.size();
        if (size == 0) {
            ymqVar = yms.b;
        } else if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            yfq yfqVarN = yfq.n(arrayList);
            for (yni yniVar : arrayList) {
                linkedHashSet.add(yniVar.b());
                linkedHashSet2.add(yniVar.a());
            }
            ymqVar = ymc.p(yfqVarN, ygr.n(linkedHashSet), ygr.n(linkedHashSet2));
        } else {
            yni yniVar2 = (yni) yrm.ao(arrayList);
            ymqVar = new ymq(yniVar2.b(), yniVar2.a(), yniVar2.c());
        }
        m = ymqVar;
        c = ygr.q(10, 11, 12);
        i = new gjv(new HashSet());
    }

    public static BluetoothDevice d(Context context, Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice != null || intent.getStringExtra("DEVICE_ADDRESS") == null) {
            return bluetoothDevice;
        }
        BluetoothAdapter bluetoothAdapterA = jfj.a(context);
        bluetoothAdapterA.getClass();
        return bluetoothAdapterA.getRemoteDevice(intent.getStringExtra("DEVICE_ADDRESS"));
    }

    public static final zgp h(Context context, pap papVar, String str, BluetoothDevice bluetoothDevice, Executor executor, boolean z) {
        if (Build.VERSION.SDK_INT >= 33 && bluetoothDevice != null && dup.c(context, "android.permission.BLUETOOTH_CONNECT") == 0) {
            int batteryLevel = bluetoothDevice.getBatteryLevel();
            yph yphVar = a;
            ype ypeVar = (ype) ((ype) yphVar.f()).ai(6169);
            Range range = j;
            Integer numValueOf = Integer.valueOf(batteryLevel);
            if (true != range.contains((Range) numValueOf)) {
                batteryLevel = -1;
            }
            ypeVar.K("Bluetooth %s device battery level %d", bluetoothDevice, batteryLevel);
            if (range.contains((Range) numValueOf)) {
                ((ype) ((ype) yphVar.g()).ai((char) 6164)).y("Bluetooth device %s has a battery level, exiting", bluetoothDevice);
                kfl.g().d(yxi.WIRELESS_STOPPED_SETUP_WITH_HU_WITH_BT_BATTERY_LEVEL);
                papVar.k.ifPresent(new oyg());
                return wub.Y(false);
            }
        }
        if (aczv.ae() && Build.VERSION.SDK_INT >= 34) {
            synchronized (k) {
                yph yphVar2 = oyc.a;
                CompanionDeviceManager companionDeviceManagerM0m = a$$ExternalSyntheticApiModelOutline0.m0m(context.getSystemService("companiondevice"));
                kna knaVarG = kfl.g();
                if (!oyc.e(bluetoothDevice, companionDeviceManagerM0m)) {
                    ((ype) ((ype) a.f()).ai(6163)).M("Adding association for device %s on intent action %s", bluetoothDevice.getAddress(), str);
                    if (Build.VERSION.SDK_INT < 34) {
                        throw new IllegalStateException("Cannot call associate for SDK level below UPSIDE_DOWN_CAKE");
                    }
                    if (!oyc.c("android.permission.ASSOCIATE_COMPANION_DEVICES", context)) {
                        ((ype) ((ype) oyc.a.g()).ai((char) 6143)).y("ASSOCIATE_COMPANION_DEVICES permission not granted, unable to associate  with BluetoothDevice %s", bluetoothDevice.getAddress());
                        throw new SecurityException("ASSOCIATE_COMPANION_DEVICES permission not granted, unable to associate device");
                    }
                    if (oyc.e(bluetoothDevice, companionDeviceManagerM0m)) {
                        ((ype) ((ype) oyc.a.f()).ai((char) 6142)).y("Bluetooth device '%s' already associated.", bluetoothDevice.getAddress());
                    } else {
                        String packageName = context.getPackageName();
                        try {
                            Signature[] signingCertificateHistory = context.getPackageManager().getPackageInfo(packageName, 134217728).signingInfo.getSigningCertificateHistory();
                            MacAddress macAddressFromString = MacAddress.fromString(bluetoothDevice.getAddress());
                            for (Signature signature : signingCertificateHistory) {
                                byte[] bArrA = oyc.a(signature);
                                yph yphVar3 = oyc.a;
                                ((ype) yphVar3.l().ai(6144)).M("Calling associate for %s, %s with SHA256 encoded signature ... ", bluetoothDevice.getAddress(), packageName);
                                companionDeviceManagerM0m.associate(packageName, macAddressFromString, bArrA);
                                if (oyc.b(macAddressFromString, companionDeviceManagerM0m)) {
                                    knaVarG.d(yxi.WIRELESS_BLUETOOTH_DEVICE_CDM_ASSOCIATED);
                                    ((ype) ((ype) yphVar3.f()).ai(6140)).y("Bluetooth device '%s' was associated with CDM using system API", bluetoothDevice.getAddress());
                                }
                            }
                            knaVarG.d(yxi.WIRELESS_BLUETOOTH_DEVICE_CDM_ASSOCIATION_FAILED);
                            ((ype) ((ype) oyc.a.h()).ai((char) 6141)).y("Bluetooth device '%s' was not associated with CDM using system API", bluetoothDevice.getAddress());
                        } catch (PackageManager.NameNotFoundException e) {
                            throw new IllegalStateException("Unable to find gearhead package", e);
                        }
                    }
                    oyc.d(context);
                    companionDeviceManagerM0m.startObservingDevicePresence(bluetoothDevice.getAddress());
                    knaVarG.d(yxi.WIRELESS_BLUETOOTH_START_OBSERVE_COMPANION_DEVICE_PRESENCE);
                }
            }
        }
        return z ? pan.e(papVar, str, bluetoothDevice, executor) : pan.d(papVar, str, bluetoothDevice, executor);
    }

    public static final pap i(OptionalInt optionalInt) {
        mki mkiVar = mki.a;
        pap papVar = new pap(mkiVar.c, mkiVar.d);
        optionalInt.ifPresent(new oyh(papVar, 0));
        return papVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("WifiBluetoothReceiver");
    }

    @Override // defpackage.kwu
    public final void c(final Context context, final Intent intent) {
        final String strAl = woy.al(intent.getAction());
        final BluetoothDevice bluetoothDeviceD = d(context, intent);
        ((ype) ((ype) a.f()).ai(6165)).M("Connection action: %s, device %s", strAl, bluetoothDeviceD);
        oyd oydVar = new oyd(0);
        wub.ah(zfb.g(zgj.v(omc.a().h(mki.a.d)), new zfk() { // from class: oye
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x02a9, code lost:
            
                if (r3.equals("com.google.android.projection.gearhead.RESCAN_AFTER_WELCOME_DOWNLOAD") != false) goto L108;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x02af, code lost:
            
                if (defpackage.jfj.a(r7) == null) goto L112;
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x02cd, code lost:
            
                return defpackage.zfb.g(defpackage.omc.a().e(r7, new defpackage.oyl()), new defpackage.pwg(r6, r7, r8, 1, null), defpackage.mki.a.d);
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x02d2, code lost:
            
                return defpackage.wub.Y(false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x0153, code lost:
            
                if (r3.equals("android.intent.action.MY_PACKAGE_REPLACED") != false) goto L108;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x015d, code lost:
            
                if (r3.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED") != false) goto L53;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0166, code lost:
            
                if (r3.equals("android.intent.action.BOOT_COMPLETED") != false) goto L108;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0170, code lost:
            
                if (r3.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") != false) goto L53;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0172, code lost:
            
                defpackage.omc.a();
                r12 = r8.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x017b, code lost:
            
                if (r12 != 1) goto L60;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x0181, code lost:
            
                if (r4.isConnected() != false) goto L59;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0183, code lost:
            
                ((defpackage.ype) ((defpackage.ype) r13.f()).ai(6183)).R("Skipping connection state change for %s: not ACL-connected. Action %s has state %d", r4, r8.getAction(), 1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x01a2, code lost:
            
                return defpackage.wub.Y(false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x01a3, code lost:
            
                r12 = 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x01a4, code lost:
            
                ((defpackage.ype) ((defpackage.ype) r13.f()).ai(6182)).R("Processing connection state change for %s. Action %s has state %d", r4, r8.getAction(), java.lang.Integer.valueOf(r12));
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x01bf, code lost:
            
                if (r12 == 1) goto L120;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x01c1, code lost:
            
                if (r12 == 2) goto L120;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x01c7, code lost:
            
                return defpackage.wub.Y(false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x01c8, code lost:
            
                r12 = r4.getBondState();
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x01cd, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x01ce, code lost:
            
                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver.a.h()).p(r0)).ai(6166)).y("Unable to determine bond state for device %s", r4);
                r12 = 10;
             */
            @Override // defpackage.zfk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final defpackage.zgp a(java.lang.Object r13) throws android.companion.DeviceNotAssociatedException {
                /*
                    Method dump skipped, instructions count: 810
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.oye.a(java.lang.Object):zgp");
            }
        }, oydVar), new khs(5), oydVar);
    }

    public final zgp f(Context context, Intent intent, BluetoothDevice bluetoothDevice, boolean z) {
        return zfb.g(dsg.w(new pam(new oyr(context, mpl.f().b(), new oyl()), mki.a.d, bluetoothDevice, z ? oyp.REQUEST_AND_WAIT_FOR_UUID : oyp.DONT_REQUEST, 1)), new oyf(this, bluetoothDevice, context, intent, 2), mki.a.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.zgp g(android.content.Context r13, android.content.Intent r14, android.bluetooth.BluetoothDevice r15) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver.g(android.content.Context, android.content.Intent, android.bluetooth.BluetoothDevice):zgp");
    }
}
