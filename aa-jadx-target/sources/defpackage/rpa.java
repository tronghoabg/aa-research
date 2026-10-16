package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rpa extends defpackage.stq {
    final /* synthetic */ defpackage.rpb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpa(defpackage.rpb rpbVar, android.os.Looper looper) {
        super(looper);
        this.a = rpbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        defpackage.rpb rpbVar = this.a;
        if (rpbVar.i != null) {
            if (message.what != 1) {
                return;
            }
            ajnd ajndVar = rpbVar.i;
            int i = rpbVar.b;
            int i2 = rpbVar.c;
            int i3 = rpbVar.d;
            int i4 = rpbVar.e;
            int i5 = rpbVar.f;
            defpackage.lzw lzwVar = (defpackage.lzw) ajndVar.a;
            if (lzwVar.b) {
                defpackage.yqm yqmVar = defpackage.lzw.a;
                ((defpackage.yqj) yqmVar.l().ai((char) 4512)).u("Got head unit configuration");
                lzwVar.e = new com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig(i, i4, i3, i5, i2 == 1);
                lzwVar.l();
                if (lzwVar.h != null) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 4513)).u("Unregistering CarNavigationStatusListener");
                    lzwVar.h.a();
                }
            }
        }
    }
}
