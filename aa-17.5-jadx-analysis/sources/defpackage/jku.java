package defpackage;

/* loaded from: classes2.dex */
public class jku {
    public int e = 0;
    public final /* synthetic */ jkv f;

    public jku(jkv jkvVar) {
        this.f = jkvVar;
    }

    public boolean a() {
        return false;
    }

    public final void b(jed jedVar) {
        if (jedVar instanceof jec) {
            jkv jkvVar = this.f;
            jkvVar.d(yxi.WIRELESS_WIFI_NO_DATA_SOCKET_RECONNECTION_ERROR);
            if (jedVar.a) {
                jkvVar.d(yxi.WIRELESS_WIFI_NO_DATA_SOCKET_RETRY);
                return;
            }
            return;
        }
        if (jedVar instanceof jee) {
            boolean z = jedVar.a;
            jkv jkvVar2 = this.f;
            if (z) {
                jkvVar2.d(yxi.WIRELESS_WIFI_NO_DATA_SOCKET_RETRY);
                return;
            } else {
                jkvVar2.d(yxi.WIRELESS_WIFI_NO_DATA_SOCKET_MAX_RETRIES_FAILURE);
                return;
            }
        }
        this.e++;
        jkv jkvVar3 = this.f;
        jkvVar3.e(rrx.c);
        if (jedVar.a) {
            return;
        }
        jkvVar3.c.post(new ino(this, jedVar, 20, null));
    }
}
