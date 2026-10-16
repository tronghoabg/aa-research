package defpackage;

import android.os.Handler;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;

/* loaded from: classes2.dex */
public final class jqd implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ tgu b;
    final /* synthetic */ rwy c;
    final /* synthetic */ String d;
    final /* synthetic */ CarBluetoothData e;
    final /* synthetic */ Handler f;
    final /* synthetic */ jkv g;
    final /* synthetic */ jqe h;

    public jqd(jqe jqeVar, long j, tgu tguVar, rwy rwyVar, String str, CarBluetoothData carBluetoothData, Handler handler, jkv jkvVar) {
        this.a = j;
        this.b = tguVar;
        this.c = rwyVar;
        this.d = str;
        this.e = carBluetoothData;
        this.f = handler;
        this.g = jkvVar;
        this.h = jqeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.g.k.e.c(this.a, 2, this.b, this.c, this.d, this.e);
        this.f.post(new joo(this.g, 4));
    }
}
