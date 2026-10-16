package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Network;
import android.net.wifi.WifiInfo;
import android.os.Handler;
import com.google.android.gms.car.bluetooth.data.CarBluetoothData;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class jqg implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ Handler b;
    final /* synthetic */ rwy c;
    final /* synthetic */ String d;
    final /* synthetic */ CarBluetoothData e;
    final /* synthetic */ String f;
    final /* synthetic */ int g;
    final /* synthetic */ WifiInfo h;
    final /* synthetic */ Network i;
    final /* synthetic */ boolean j;
    public final /* synthetic */ jqj k;

    public jqg(jqj jqjVar, long j, Handler handler, rwy rwyVar, String str, CarBluetoothData carBluetoothData, String str2, int i, WifiInfo wifiInfo, Network network, boolean z) {
        this.a = j;
        this.b = handler;
        this.c = rwyVar;
        this.d = str;
        this.e = carBluetoothData;
        this.f = str2;
        this.g = i;
        this.h = wifiInfo;
        this.i = network;
        this.j = z;
        this.k = jqjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jkv jkvVar = new jkv(this.k.h.getApplicationContext());
        rwy rwyVar = this.c;
        String str = this.d;
        CarBluetoothData carBluetoothData = this.e;
        long j = this.a;
        Handler handler = this.b;
        jqe jqeVar = new jqe(this, j, handler, jkvVar, rwyVar, str, carBluetoothData);
        yph yphVar = jkv.a;
        ((ype) yphVar.l().ai((char) 2272)).u("init");
        if (jkvVar.e) {
            ((ype) ((ype) yphVar.g()).ai((char) 2273)).u("Already initialized");
        } else {
            jkvVar.j = jqeVar;
            jkvVar.d = Executors.newScheduledThreadPool(1);
            Context context = jkvVar.b;
            jkvVar.h = new jej(context, Executors.newScheduledThreadPool(1));
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            dup.e(context, jkvVar.i, intentFilter, null, 2);
            jkvVar.f = 0;
            jkvVar.d(yxi.WIRELESS_WIFI_CAR_WIFI_SETUP_INITIALIZED);
            jkvVar.e = true;
        }
        handler.post(new jqf(jkvVar, this.f, this.g, this.h, this.i, this.j));
    }
}
