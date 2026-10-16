package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.hardware.usb.UsbManager;
import android.hardware.usb.UsbPort;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.lang.Iterable$EL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pbf extends ijo implements pbg {
    public final Map a;
    final /* synthetic */ WirelessSetupSharedService b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbf(WirelessSetupSharedService wirelessSetupSharedService) {
        super("com.google.android.apps.auto.wireless.setup.service.IWirelessSetupSharedService");
        this.b = wirelessSetupSharedService;
        this.a = new HashMap();
    }

    public final byte[] a() throws RemoteException {
        String strAl;
        WirelessSetupSharedService wirelessSetupSharedService = this.b;
        wirelessSetupSharedService.b();
        ygr ygrVarA = yly.a;
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            String strAl2 = woy.al(Build.getSerial());
            BluetoothAdapter bluetoothAdapterA = jfj.a(wirelessSetupSharedService);
            if (bluetoothAdapterA == null) {
                ((ype) ((ype) WirelessSetupSharedService.a.h()).ai(6653)).u("Failed to get BluetoothAdapter - running under emulator?");
                strAl = "";
            } else {
                strAl = woy.al(bluetoothAdapterA.getAddress());
            }
            try {
                ygrVarA = new pez(wirelessSetupSharedService).a();
            } catch (NoSuchMethodError | SecurityException | pey e) {
                ((ype) ((ype) ((ype) WirelessSetupSharedService.a.g()).p(e)).ai(6652)).u("Unable to get Wi-Fi channels");
            }
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            if (TextUtils.isEmpty(strAl2) || "unknown".equals(strAl2)) {
                ((ype) ((ype) WirelessSetupSharedService.a.h()).ai((char) 6649)).u("Failed to retrieve serial number.");
            }
            if (ygrVarA.isEmpty()) {
                ((ype) ((ype) WirelessSetupSharedService.a.h()).ai((char) 6651)).u("Failed to retrieve supported Wi-Fi channels");
            }
            if (TextUtils.isEmpty(strAl) || "02:00:00:00:00:00".equals(strAl)) {
                ((ype) ((ype) WirelessSetupSharedService.a.h()).ai((char) 6650)).u("Failed to retrieve MAC address.");
            }
            abnp abnpVarN = pbl.a.n();
            abnpVarN.t();
            pbl pblVar = (pbl) abnpVarN.b;
            pblVar.b |= 1;
            pblVar.c = strAl2;
            abnpVarN.t();
            pbl pblVar2 = (pbl) abnpVarN.b;
            pblVar2.b |= 2;
            pblVar2.d = strAl;
            abnpVarN.t();
            pbl pblVar3 = (pbl) abnpVarN.b;
            abod abodVar = pblVar3.e;
            if (!abodVar.c()) {
                pblVar3.e = abnv.G(abodVar);
            }
            abmc.i(ygrVarA, pblVar3.e);
            return ((pbl) abnpVarN.q()).h();
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }

    @Override // defpackage.pbg
    public final int e() throws RemoteException {
        WirelessSetupSharedService wirelessSetupSharedService = this.b;
        wirelessSetupSharedService.b();
        yph yphVar = WirelessSetupSharedService.a;
        ((ype) yphVar.l().ai((char) 6654)).u("Wireless getsetupstate");
        phj phjVar = wirelessSetupSharedService.o;
        if (phjVar != null) {
            return phjVar.a.a().Y;
        }
        ((ype) ((ype) yphVar.h()).ai((char) 6655)).u("getWirelessSetupState called before wireless setup started");
        return pag.IDLE.Y;
    }

    @Override // defpackage.pbg
    @ResultIgnorabilityUnspecified
    public final boolean f(IBinder iBinder, pbj pbjVar) throws RemoteException {
        this.b.b();
        Map map = this.a;
        synchronized (map) {
            woy.O(pdj.a(iBinder, map) == null, "Token already registered");
            ((ype) WirelessSetupSharedService.a.l().ai(6656)).y("register client %s", iBinder);
            synchronized (map) {
                pdj pdjVar = new pdj(this, iBinder, pbjVar);
                map.put(pdjVar.a, pdjVar);
                pdjVar.b.linkToDeath(pdjVar, 0);
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        pbj pbhVar;
        int i2 = 0;
        switch (i) {
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    pbhVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.apps.auto.wireless.setup.service.IWirelessSetupSharedServiceCallback");
                    pbhVar = iInterfaceQueryLocalInterface instanceof pbj ? (pbj) iInterfaceQueryLocalInterface : new pbh(strongBinder2);
                }
                ijp.d(parcel);
                f(strongBinder, pbhVar);
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 3:
                IBinder strongBinder3 = parcel.readStrongBinder();
                ijp.d(parcel);
                h(strongBinder3);
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 4:
            case 13:
            default:
                return false;
            case 5:
                int iE = e();
                parcel2.writeNoException();
                parcel2.writeInt(iE);
                return true;
            case 6:
                IBinder strongBinder4 = parcel.readStrongBinder();
                ijp.d(parcel);
                boolean zG = g(strongBinder4);
                parcel2.writeNoException();
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 7:
                byte[] bArrA = a();
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrA);
                return true;
            case 8:
                WirelessSetupSharedService wirelessSetupSharedService = this.b;
                wirelessSetupSharedService.b();
                ((ype) WirelessSetupSharedService.a.l().ai((char) 6664)).u("Performing USB reset");
                ((UsbManager) jfj.c(wirelessSetupSharedService.getApplicationContext()).getSystemService("usb")).resetUsbGadget();
                parcel2.writeNoException();
                return true;
            case 9:
                int i3 = parcel.readInt();
                ijp.d(parcel);
                WirelessSetupSharedService wirelessSetupSharedService2 = this.b;
                wirelessSetupSharedService2.b();
                UsbManager usbManager = (UsbManager) jfj.c(wirelessSetupSharedService2.getApplicationContext()).getSystemService("usb");
                ((ype) ((ype) WirelessSetupSharedService.a.f()).ai((char) 6660)).u("Setting USB function");
                if (i3 == 1) {
                    usbManager.setCurrentFunctions(0L);
                } else if (i3 == 3) {
                    usbManager.setCurrentFunctions(8L);
                } else if (i3 == 2) {
                    usbManager.setCurrentFunctions(16L);
                } else if (i3 == 4) {
                    usbManager.setCurrentFunctions(4L);
                } else if (i3 == 5) {
                    usbManager.setCurrentFunctions(32L);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zJ = ijp.j(parcel);
                ijp.d(parcel);
                WirelessSetupSharedService wirelessSetupSharedService3 = this.b;
                wirelessSetupSharedService3.b();
                PackageManager packageManager = wirelessSetupSharedService3.getPackageManager();
                ComponentName componentName = new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.carservice.gmscorecompat.CarUsbReceiverTPlus");
                int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
                ype ypeVar = (ype) WirelessSetupSharedService.a.l().ai(6659);
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                Integer numValueOf = Integer.valueOf(componentEnabledSetting);
                int i4 = true == zJ ? 1 : 2;
                ypeVar.S("Changing component %s/%s enabled state from %d to %d", packageName, className, numValueOf, Integer.valueOf(i4));
                packageManager.setComponentEnabledSetting(componentName, i4, 1);
                parcel2.writeNoException();
                return true;
            case 11:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) ijp.a(parcel, BluetoothDevice.CREATOR);
                ijp.d(parcel);
                WirelessSetupSharedService wirelessSetupSharedService4 = this.b;
                wirelessSetupSharedService4.b();
                abnp abnpVarN = pbk.a.n();
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    if (dup.c(wirelessSetupSharedService4.getApplicationContext(), "android.permission.BLUETOOTH_CONNECT") != 0 || bluetoothDevice == null) {
                        ((ype) ((ype) WirelessSetupSharedService.a.g()).ai(6648)).y("Missing BLUETOOTH_CONNECT permission, unable to retrieve system only info for device %s", bluetoothDevice);
                    } else {
                        String address = bluetoothDevice.getAddress();
                        abnpVarN.t();
                        pbk pbkVar = (pbk) abnpVarN.b;
                        address.getClass();
                        pbkVar.b |= 1;
                        pbkVar.c = address;
                        int batteryLevel = bluetoothDevice.getBatteryLevel();
                        abnpVarN.t();
                        pbk pbkVar2 = (pbk) abnpVarN.b;
                        pbkVar2.b = 2 | pbkVar2.b;
                        pbkVar2.d = batteryLevel;
                    }
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    byte[] bArrH = ((pbk) abnpVarN.q()).h();
                    parcel2.writeNoException();
                    parcel2.writeByteArray(bArrH);
                    return true;
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            case 12:
                WirelessSetupSharedService wirelessSetupSharedService5 = this.b;
                wirelessSetupSharedService5.b();
                Iterator it = ((UsbManager) jfj.c(wirelessSetupSharedService5.getApplicationContext()).getSystemService("usb")).getPorts().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((UsbPort) it.next()).getStatus().isConnected()) {
                            i2 = 1;
                        }
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader = ijp.a;
                parcel2.writeInt(i2);
                return true;
            case 14:
                byte[] bArrCreateByteArray = parcel.createByteArray();
                ijp.d(parcel);
                this.b.b();
                if (koo.n()) {
                    try {
                        aboh abohVar = ((pbb) abnv.B(pbb.a, bArrCreateByteArray, abnj.a())).b;
                        rla rlaVarM = koo.m();
                        rlaVarM.getClass();
                        Iterable$EL.forEach(abohVar, new kok(rlaVarM, 20));
                        i2 = 1;
                    } catch (abon e) {
                        throw new RemoteException(String.format(Locale.US, "Failed to parse failure injection: %s", e));
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            case 15:
                this.b.b();
                if (koo.n()) {
                    koo.m().i();
                    i2 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = ijp.a;
                parcel2.writeInt(i2);
                return true;
            case 16:
                boolean zJ2 = ijp.j(parcel);
                ijp.d(parcel);
                WirelessSetupSharedService wirelessSetupSharedService6 = this.b;
                wirelessSetupSharedService6.b();
                rxs rxsVar = (rxs) rxr.a(wirelessSetupSharedService6.getApplicationContext());
                rxsVar.d = zJ2;
                if (!zJ2) {
                    rxsVar.c.clear();
                    rxsVar.b.e(false);
                }
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // defpackage.pbg
    @ResultIgnorabilityUnspecified
    public final boolean g(IBinder iBinder) throws RemoteException {
        WirelessSetupSharedService wirelessSetupSharedService = this.b;
        wirelessSetupSharedService.b();
        yph yphVar = WirelessSetupSharedService.a;
        ((ype) yphVar.l().ai((char) 6661)).u("Starting wireless projection");
        Map map = this.a;
        synchronized (map) {
            pdj.a(iBinder, map).getClass();
            phj phjVar = wirelessSetupSharedService.o;
            if (phjVar == null) {
                ((ype) ((ype) yphVar.h()).ai(6662)).u("startWirelessProjection called before wireless setup started");
                return false;
            }
            phjVar.a.d();
            pgt pgtVar = wirelessSetupSharedService.n;
            dsx dsxVarD = pgtVar.d();
            dsxVarD.r = "service";
            dsxVarD.i(pgtVar.b.getText(R.string.wireless_service_connecting_notification_title));
            dsxVarD.m(0, 0, true);
            pgtVar.e(dsxVarD.a());
            if (pgtVar.f) {
                pgtVar.c.postDelayed(pgtVar.w, pgtVar.e);
            }
            return true;
        }
    }

    @Override // defpackage.pbg
    @ResultIgnorabilityUnspecified
    public final void h(IBinder iBinder) throws RemoteException {
        this.b.b();
        Map map = this.a;
        synchronized (map) {
            woy.O(pdj.a(iBinder, map) != null, "Token not registered");
            ((ype) WirelessSetupSharedService.a.l().ai(6663)).y("unregister client %s", iBinder);
            pdj pdjVarA = pdj.a(iBinder, map);
            if (pdjVarA != null) {
                pdjVarA.b(map, false);
            }
        }
    }
}
