package defpackage;

import android.bluetooth.BluetoothDevice;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class zit {
    public final Object a;
    public int b;
    public final Object c;

    public zit() {
        this.b = 0;
        this.a = new aetl(1000);
        this.c = new uaz(0, abeg.a);
    }

    public static final float c(float f) {
        double dSignum = Math.signum(f);
        float fAbs = Math.abs(f);
        return (float) (dSignum * Math.sqrt(fAbs + fAbs));
    }

    final boolean a() {
        return ((LinkedHashMap) this.c).isEmpty();
    }

    public final void b(long j, float f) {
        int i = (this.b + 1) % 20;
        this.b = i;
        ((long[]) this.a)[i] = j;
        ((float[]) this.c)[i] = f;
    }

    public zit(hwh hwhVar) {
        this.c = igf.a(150, new hwg(this, 1));
        this.a = hwhVar;
    }

    public zit(BluetoothDevice bluetoothDevice, ajmd ajmdVar) {
        this.c = bluetoothDevice;
        this.a = ajmdVar;
        this.b = 1;
    }

    public zit(byte[] bArr) {
        long[] jArr = new long[20];
        this.a = jArr;
        this.c = new float[20];
        this.b = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public zit(Object obj, int i) {
        this.c = new LinkedHashMap();
        this.a = obj;
        this.b = i;
    }
}
