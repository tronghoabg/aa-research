package defpackage;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes.dex */
public final class rgx implements rgv {
    public static final ypf a = ols.R("CAR.BT");
    public final rgk b;
    public BluetoothDevice c;
    public final Runnable d;
    public rgu e;
    public boolean f;

    public rgx(rgk rgkVar, BluetoothDevice bluetoothDevice, Runnable runnable) {
        a.l().ai(8079).u("BluetoothProfileUtilImpl");
        this.b = rgkVar;
        this.c = bluetoothDevice;
        this.d = runnable;
    }

    @Override // defpackage.rgv
    public final boolean a() {
        rgu rguVar = this.e;
        rguVar.getClass();
        return rguVar.a(this.c) == 2;
    }

    @Override // defpackage.rgv
    public final boolean b() {
        rgu rguVar = this.e;
        rguVar.getClass();
        return rguVar.a(this.c) == 1;
    }

    @Override // defpackage.rgv
    public final boolean c() {
        a.l().ai(8083).u("isInitialized");
        return this.e != null;
    }

    public final void d() {
        a.l().ai(8082).u("BluetoothProfileUtilImpl is cleaning up internal HFP proxy");
        this.f = true;
        rgu rguVar = this.e;
        if (rguVar != null) {
            this.b.d(1, rguVar.a);
            this.e = null;
        }
    }
}
