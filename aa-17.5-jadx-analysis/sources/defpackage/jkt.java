package defpackage;

import android.net.wifi.WifiInfo;

/* loaded from: classes2.dex */
final class jkt extends jku {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ WifiInfo c;
    final /* synthetic */ jkv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkt(jkv jkvVar, String str, int i, WifiInfo wifiInfo) {
        super(jkvVar);
        this.a = str;
        this.b = i;
        this.c = wifiInfo;
        this.d = jkvVar;
    }

    @Override // defpackage.jku
    public final boolean a() {
        this.d.c(this.a, this.b, this.c);
        return true;
    }
}
