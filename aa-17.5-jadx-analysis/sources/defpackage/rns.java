package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
public final /* synthetic */ class rns implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ rns(ConnectivityManager.NetworkCallback networkCallback, Runnable runnable, Network network, String str, int i, WifiInfo wifiInfo, int i2) {
        this.g = i2;
        this.f = networkCallback;
        this.c = runnable;
        this.d = network;
        this.b = str;
        this.a = i;
        this.e = wifiInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException {
        int i = this.g;
        if (i == 0) {
            CarRegionId carRegionId = new CarRegionId(0, new CarDisplayId(this.a));
            SparseArray sparseArray = rnw.a;
            Object obj = this.f;
            Object obj2 = this.e;
            Object obj3 = this.d;
            ((rnw) this.b).p(carRegionId, (DrawingSpec) this.c, (Intent) obj3, (Configuration) obj2, (Bundle) obj);
            return;
        }
        Object obj4 = this.f;
        if (i != 1) {
            sbi sbiVar = (sbi) obj4;
            if (sbiVar.a) {
                return;
            }
            Object obj5 = this.e;
            int i2 = this.a;
            Object obj6 = this.b;
            Object obj7 = this.d;
            ?? r9 = this.c;
            sbm sbmVar = sbiVar.f;
            sbmVar.e.removeCallbacks(r9);
            sbiVar.a = true;
            sbmVar.a((Network) obj7, (String) obj6, i2, (WifiInfo) obj5, false);
            sbmVar.d();
            return;
        }
        jks jksVar = (jks) obj4;
        if (jksVar.a) {
            return;
        }
        Object obj8 = this.e;
        int i3 = this.a;
        Object obj9 = this.b;
        Object obj10 = this.d;
        ?? r92 = this.c;
        jkv jkvVar = jksVar.f;
        jkvVar.c.removeCallbacks(r92);
        jksVar.a = true;
        jkvVar.d(yxi.WIRELESS_WIFI_LEGACY_NETWORK_REQUEST_NETWORK_AVAILABLE);
        jkvVar.a((Network) obj10, (String) obj9, i3, (WifiInfo) obj8, false);
        jkvVar.g();
    }

    public /* synthetic */ rns(rnw rnwVar, int i, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle, int i2) {
        this.g = i2;
        this.b = rnwVar;
        this.a = i;
        this.c = drawingSpec;
        this.d = intent;
        this.e = configuration;
        this.f = bundle;
    }
}
