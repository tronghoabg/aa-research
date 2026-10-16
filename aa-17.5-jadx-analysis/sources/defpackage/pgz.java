package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Handler;
import com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService;
import j$.time.Duration;
import j$.util.OptionalInt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class pgz implements zge {
    final /* synthetic */ boolean a;
    final /* synthetic */ BluetoothDevice b;
    final /* synthetic */ OptionalInt c;
    final /* synthetic */ zhc d;
    final /* synthetic */ Intent e;
    final /* synthetic */ boolean f;
    public final /* synthetic */ WirelessSetupSharedService g;

    public pgz(WirelessSetupSharedService wirelessSetupSharedService, boolean z, BluetoothDevice bluetoothDevice, OptionalInt optionalInt, zhc zhcVar, Intent intent, boolean z2) {
        this.a = z;
        this.b = bluetoothDevice;
        this.c = optionalInt;
        this.d = zhcVar;
        this.e = intent;
        this.f = z2;
        this.g = wirelessSetupSharedService;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        this.d.o(null);
        yph yphVar = WirelessSetupSharedService.a;
        ((ype) ((ype) ((ype) yphVar.g()).p(th)).ai(6633)).y("Failed to load WirelessSetupSharedService: %s", th);
        if ((th instanceof TimeoutException) || (th instanceof phi)) {
            this.g.q.d(this.f ? yxi.WIRELESS_SETUP_FAILED_TO_START_NO_ACL_FROM_HU_PRESENCE : yxi.WIRELESS_SETUP_FAILED_TO_START_NO_HFP_FROM_HU_PRESENCE);
            if (th instanceof phi) {
                OptionalInt optionalInt = this.c;
                optionalInt.ifPresent(new oyh(this, 8));
                optionalInt.ifPresent(new oyh(this, 9));
            }
        } else if (th instanceof CancellationException) {
            ((ype) yphVar.l().ai((char) 6634)).u("Cancelled waiting for CDM or HFP/A2DP connection.");
            return;
        } else {
            if (th instanceof pfa) {
                throw new IllegalStateException("CDM appear timed out", th);
            }
            this.g.q.d(yxi.WIRELESS_SETUP_FAILED_TO_START_FROM_HU_PRESENCE_WITH_UNKNOWN_REASON);
        }
        this.g.d();
    }

    @Override // defpackage.zge
    public final void b(Object obj) {
        if (!this.a) {
            this.d.o(null);
            this.g.c(this.b, new phg(null, null), this.c, this.e);
            return;
        }
        WirelessSetupSharedService wirelessSetupSharedService = this.g;
        BluetoothDevice bluetoothDevice = this.b;
        ygr ygrVarA = wirelessSetupSharedService.a(bluetoothDevice);
        if (ygrVarA.isEmpty()) {
            ((ype) ((ype) WirelessSetupSharedService.a.f()).ai((char) 6636)).y("No associations found for %s, starting immediately.", bluetoothDevice);
            OptionalInt optionalInt = this.c;
            zhc zhcVar = this.d;
            Intent intent = this.e;
            phh phhVar = new phh(wirelessSetupSharedService, bluetoothDevice);
            ozd ozdVar = wirelessSetupSharedService.v;
            ozdVar.getClass();
            zgj zgjVarV = zgj.v(ozdVar.a(phhVar));
            phf phfVar = new phf(wirelessSetupSharedService, zhcVar, bluetoothDevice, phhVar, optionalInt, intent);
            Handler handler = wirelessSetupSharedService.h;
            handler.getClass();
            wub.ah(zgjVarV, phfVar, new fpe(handler, 7));
            wirelessSetupSharedService.s = zgjVarV;
            return;
        }
        ((ype) ((ype) WirelessSetupSharedService.a.f()).ai(6635)).M("Associations found for %s, waiting for HU's BT: %s", bluetoothDevice, ygrVarA);
        OptionalInt optionalInt2 = this.c;
        zhc zhcVar2 = this.d;
        Intent intent2 = this.e;
        wirelessSetupSharedService.q.e(yxi.WIRELESS_LOOKING_FOR_DONGLE_ASSOCIATED_CAR, optionalInt2);
        phh phhVar2 = new phh(wirelessSetupSharedService, bluetoothDevice);
        Duration durationAh = wox.ah(aczv.A());
        ozd ozdVar2 = wirelessSetupSharedService.v;
        ozdVar2.getClass();
        zgj zgjVarV2 = zgj.v(ozdVar2.a(phhVar2));
        kew kewVar = new kew(phhVar2, 3);
        Handler handler2 = wirelessSetupSharedService.h;
        handler2.getClass();
        zgj zgjVarX = ((zgj) zfb.g(zgjVarV2, kewVar, new fpe(handler2, 7))).x(durationAh.toNanos(), TimeUnit.NANOSECONDS, wirelessSetupSharedService.u);
        wub.ah(zgjVarX, new phe(wirelessSetupSharedService, zhcVar2, bluetoothDevice, optionalInt2, intent2, phhVar2, durationAh), new phd(wirelessSetupSharedService, optionalInt2, 0));
        oyj oyjVar = new oyj(wirelessSetupSharedService, optionalInt2, 2);
        Handler handler3 = wirelessSetupSharedService.i;
        handler3.getClass();
        wub.ah(zgjVarX, oyjVar, new fpe(handler3, 7));
        wirelessSetupSharedService.s = zgjVarX;
    }
}
