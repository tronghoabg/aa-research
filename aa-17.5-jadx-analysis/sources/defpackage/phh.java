package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.SharedPreferences;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import j$.util.Collection;

/* loaded from: classes2.dex */
public final class phh implements ozc {
    public final zhc a = new zhc();
    final /* synthetic */ WirelessSetupSharedService b;
    private final BluetoothDevice c;

    public phh(WirelessSetupSharedService wirelessSetupSharedService, BluetoothDevice bluetoothDevice) {
        this.b = wirelessSetupSharedService;
        this.c = bluetoothDevice;
    }

    private final void g(BluetoothDevice bluetoothDevice) {
        WirelessSetupSharedService wirelessSetupSharedService = this.b;
        Object obj = wirelessSetupSharedService.B.a;
        SharedPreferences.Editor editorEdit = new kmy(wirelessSetupSharedService, "dongle_associations").edit();
        BluetoothDevice bluetoothDevice2 = this.c;
        String address = bluetoothDevice2.getAddress();
        ygp ygpVar = new ygp();
        ygpVar.k(wirelessSetupSharedService.a(bluetoothDevice2));
        ygpVar.c(bluetoothDevice.getAddress());
        editorEdit.putStringSet(address, ygpVar.g()).apply();
        ((kny) wirelessSetupSharedService.B.e).d(yxi.WIRELESS_SETUP_INTERCOOLER_HFP_ASSOCIATION_ADDED);
    }

    @Override // defpackage.ozc
    public final void d(ygr ygrVar, ygu yguVar) {
        zhc zhcVar = this.a;
        if (zhcVar.isDone()) {
            return;
        }
        yph yphVar = WirelessSetupSharedService.a;
        ype ypeVar = (ype) ((ype) yphVar.f()).ai(6645);
        BluetoothDevice bluetoothDevice = this.c;
        ypeVar.M("Found device candidates %s for dongle %s", yguVar, bluetoothDevice);
        WirelessSetupSharedService wirelessSetupSharedService = this.b;
        jlo jloVar = new jlo(wirelessSetupSharedService);
        try {
            ygr ygrVar2 = (ygr) Collection.EL.stream(ygr.n(yguVar.d())).filter(new pcx(jloVar, 7)).collect(ycm.b);
            if (!ygrVar2.isEmpty()) {
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) Collection.EL.stream(ygrVar2).iterator().next();
                ((ype) ((ype) yphVar.f()).ai(6646)).M("Associated device %s for dongle %s already connected", bluetoothDevice2, bluetoothDevice);
                ozd ozdVar = wirelessSetupSharedService.v;
                ozdVar.getClass();
                ozdVar.g(this);
                zhcVar.o(bluetoothDevice2);
                g(bluetoothDevice2);
                if (ygrVar2.size() > 1) {
                    ((ype) ((ype) yphVar.h()).ai(6647)).y("Multiple connected HUs found: %s", yguVar);
                }
            }
            jloVar.close();
        } catch (Throwable th) {
            try {
                jloVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ozc
    public final void f(BluetoothDevice bluetoothDevice, int i) {
        zhc zhcVar = this.a;
        if (!zhcVar.isDone() && i == 2) {
            yph yphVar = WirelessSetupSharedService.a;
            ype ypeVar = (ype) ((ype) yphVar.f()).ai(6643);
            BluetoothDevice bluetoothDevice2 = this.c;
            ypeVar.M("Found device candidate %s for dongle %s", bluetoothDevice, bluetoothDevice2);
            WirelessSetupSharedService wirelessSetupSharedService = this.b;
            jlo jloVar = new jlo(wirelessSetupSharedService);
            try {
                if (jloVar.c(bluetoothDevice.getAddress(), false).f()) {
                    ((ype) ((ype) yphVar.f()).ai(6644)).M("Found associated device %s for dongle %s", bluetoothDevice, bluetoothDevice2);
                    ozd ozdVar = wirelessSetupSharedService.v;
                    ozdVar.getClass();
                    ozdVar.g(this);
                    zhcVar.o(bluetoothDevice);
                    g(bluetoothDevice);
                }
                jloVar.close();
            } catch (Throwable th) {
                try {
                    jloVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.ozc
    public final void e() {
    }

    @Override // defpackage.ozc
    public final void a(BluetoothDevice bluetoothDevice) {
    }

    @Override // defpackage.ozc
    public final void b(BluetoothDevice bluetoothDevice) {
    }

    @Override // defpackage.ozc
    public final void c(BluetoothDevice bluetoothDevice) {
    }
}
