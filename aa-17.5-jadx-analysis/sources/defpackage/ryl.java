package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbManager;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class ryl implements ryb {
    private final Context a;
    private final int b;
    private final boolean c;
    private final boolean d;
    private int f = 1;
    private long e = 0;

    public ryl(Context context, boolean z, boolean z2, int i) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    private final UsbManager h() {
        Object systemService = this.a.getSystemService("usb");
        systemService.getClass();
        return (UsbManager) systemService;
    }

    private final void i(boolean z) {
        int i = 3;
        if (this.e == 0 || SystemClock.elapsedRealtime() - this.e >= 10000) {
            if (!z) {
                int i2 = this.f;
                if (i2 == 3 && this.d) {
                    ols.N(this.a, yxi.SETTING_USB_FUNCTION_ON_USB_DISCONNECT, this.b);
                    this.e = SystemClock.elapsedRealtime();
                    g(h());
                } else if (this.c && i2 == 1) {
                    ols.N(this.a, yxi.SETTING_USB_FUNCTION_ON_BLUETOOTH_CONNECT, this.b);
                    this.e = SystemClock.elapsedRealtime();
                    g(h());
                }
                i = 2;
            }
        } else if (!z) {
            i = 2;
        }
        this.f = i;
    }

    @Override // defpackage.ryb
    public final void c(ryx ryxVar) {
        i(ryxVar.c);
    }

    @Override // defpackage.ryb
    public final void d() {
        Intent intentRegisterReceiver = this.a.registerReceiver(null, new IntentFilter("android.hardware.usb.action.USB_STATE"));
        if (intentRegisterReceiver != null) {
            i(intentRegisterReceiver.getBooleanExtra("connected", false));
        }
    }

    @Override // defpackage.ryb
    public final void e() {
        this.f = 1;
    }

    @Override // defpackage.ryb
    public final /* synthetic */ String[] f() {
        return roc.g();
    }

    protected final void g(UsbManager usbManager) {
        int i = this.b;
        if (i >= 0) {
            usbManager.setCurrentFunctions(i);
        }
    }

    @Override // defpackage.ryb
    public final void b(ryv ryvVar) {
    }

    @Override // defpackage.ryb
    public final /* synthetic */ void v(String str, xxh xxhVar) {
    }
}
