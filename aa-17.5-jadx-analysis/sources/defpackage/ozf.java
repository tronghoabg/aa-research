package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ozf {
    public static final oze a = new oze();
    public static final afgl b = new ofw(woy.df(new mkh[]{mkh.b, mkh.a}), 5);
    public final Executor c;
    public final wgx d;
    private final wgh e;

    public ozf(Context context, Executor executor, mie mieVar) {
        this.c = executor;
        wgg wggVarA = wgh.a();
        Pattern pattern = wez.a;
        wey weyVar = new wey(context);
        weyVar.b("wifi_credentials");
        weyVar.c("wifi_credentials.pb");
        wggVarA.d(weyVar.a());
        wggVarA.c(pbn.a);
        wggVarA.a = wgj.a;
        wgh wghVarA = wggVarA.a();
        this.e = wghVarA;
        this.d = mieVar != null ? mieVar.a(wghVarA) : vqk.f().e(wghVarA);
    }

    public static final ozf a(Context context, Executor executor) {
        context.getClass();
        executor.getClass();
        return new ozf(context, executor, null);
    }

    public static final ozf b() {
        return (ozf) b.getValue(a, oze.a[0]);
    }

    public static final ozf c() {
        mki mkiVar = mki.a;
        Context context = mkiVar.c;
        context.getClass();
        Executor executor = mkiVar.d;
        executor.getClass();
        aezr aezrVar = mie.a;
        return new ozf(context, executor, mdh.e());
    }

    public final zgp d(BluetoothDevice bluetoothDevice) {
        bluetoothDevice.getClass();
        int i = 16;
        return this.d.a(new ikk(new nzf(bluetoothDevice, i), i), this.c);
    }

    public final zgp e(BluetoothDevice bluetoothDevice) {
        bluetoothDevice.getClass();
        int i = oze.b;
        String strA = oze.a(bluetoothDevice);
        if (TextUtils.isEmpty(strA)) {
            return wub.Y(Optional.empty());
        }
        int i2 = 15;
        return zfb.f(this.d.c(), new ikk(new nzf(strA, i2), i2), this.c);
    }

    public final zgp f(BluetoothDevice bluetoothDevice) {
        bluetoothDevice.getClass();
        int i = oze.b;
        String strA = oze.a(bluetoothDevice);
        return TextUtils.isEmpty(strA) ? wub.Y(Optional.empty()) : zfb.f(this.d.c(), new ikk(new nzf(strA, 18), 20), this.c);
    }

    public final zgp g() {
        return this.d.a(new ikk(new oin(12), 18), this.c);
    }

    public final zgp h(BluetoothDevice bluetoothDevice, ozy ozyVar) {
        bluetoothDevice.getClass();
        ozyVar.getClass();
        int i = oze.b;
        return this.d.a(new ikk(new nje(oze.a(bluetoothDevice), ozyVar, 12, null), 19), this.c);
    }

    public final zgp i(BluetoothDevice bluetoothDevice, xpu xpuVar) {
        bluetoothDevice.getClass();
        xpuVar.getClass();
        int i = oze.b;
        return this.d.a(new ikk(new nje(oze.a(bluetoothDevice), xpuVar, 13, null), 14), this.c);
    }
}
