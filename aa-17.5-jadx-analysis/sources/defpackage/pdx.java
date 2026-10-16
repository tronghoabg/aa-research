package defpackage;

import android.bluetooth.BluetoothAdapter;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class pdx implements tks {
    final /* synthetic */ pdy a;
    final /* synthetic */ phq b;

    public pdx(pdy pdyVar, phq phqVar) {
        this.a = pdyVar;
        this.b = phqVar;
    }

    @Override // defpackage.tks
    public final /* bridge */ /* synthetic */ Object a() {
        pdy pdyVar = this.a;
        pdyVar.d(yxi.WIRELESS_RFCOMM_CONNECTION_RUNNABLE_DEQUEUED, null);
        yph yphVar = pdy.a;
        yphVar.l().u("Connecting Bluetooth RFCOMM socket.");
        wer.b();
        phq phqVar = this.b;
        try {
            BluetoothAdapter bluetoothAdapterA = jfj.a(pdyVar.d);
            if (bluetoothAdapterA == null) {
                throw new IllegalStateException("Bluetooth adapter is null, cannot connect RFCOMM socket.");
            }
            bluetoothAdapterA.cancelDiscovery();
            xya xyaVarB = xya.b(xvx.a);
            phqVar.f();
            yphVar.l().y("Connecting Bluetooth RFCOMM socket succeed. Connecting duration %s", xyaVarB.c());
            return pdw.a;
        } catch (IOException e) {
            ((ype) pdy.a.l().p(e)).u("Connecting Bluetooth RFCOMM socket failed");
            return new pdv(e);
        } catch (SecurityException e2) {
            ((ype) pdy.a.l().p(e2)).u("Connecting Bluetooth RFCOMM socket failed");
            return new pdv(e2);
        }
    }

    @Override // defpackage.tks
    public final void b() {
        this.a.d(yxi.WIRELESS_RFCOMM_SOCKET_CLOSED, null);
        pdy.a.l().u("Closing Bluetooth WPP RFCOMM socket connection.");
        this.b.a();
    }
}
