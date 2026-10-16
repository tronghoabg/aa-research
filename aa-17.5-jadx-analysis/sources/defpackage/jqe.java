package defpackage;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;

/* loaded from: classes2.dex */
public final class jqe {
    public final /* synthetic */ long a;
    public final /* synthetic */ Handler b;
    public final /* synthetic */ jkv c;
    public final /* synthetic */ rwy d;
    public final /* synthetic */ String e;
    public final /* synthetic */ CarBluetoothData f;
    public final /* synthetic */ jqg g;

    public jqe(jqg jqgVar, long j, Handler handler, jkv jkvVar, rwy rwyVar, String str, CarBluetoothData carBluetoothData) {
        this.a = j;
        this.b = handler;
        this.c = jkvVar;
        this.d = rwyVar;
        this.e = str;
        this.f = carBluetoothData;
        this.g = jqgVar;
    }

    public final void a(yze yzeVar, yzf yzfVar, String str) {
        ype ypeVar = (ype) ((ype) jqj.a.g()).ai(2601);
        int i = yzeVar.D;
        Integer numValueOf = Integer.valueOf(i);
        int i2 = yzfVar.az;
        ypeVar.R("Critical error %d (%d): %s", numValueOf, Integer.valueOf(i2), str);
        this.g.k.c.post(new jqx(this, this.a, this.b, this.c, 1));
        try {
            this.d.g(i, i2, str);
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) jqj.a.g()).p(e)).ai((char) 2602)).u("Error handling protocol error");
        }
    }
}
