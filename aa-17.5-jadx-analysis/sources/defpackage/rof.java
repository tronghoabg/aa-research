package defpackage;

import android.os.Looper;
import android.os.Message;
import com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig;

/* loaded from: classes.dex */
final class rof extends sss {
    final /* synthetic */ rog a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rof(rog rogVar, Looper looper) {
        super(looper);
        this.a = rogVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        rog rogVar = this.a;
        if (rogVar.i != null) {
            if (message.what != 1) {
                return;
            }
            ajmd ajmdVar = rogVar.i;
            int i = rogVar.b;
            int i2 = rogVar.c;
            int i3 = rogVar.d;
            int i4 = rogVar.e;
            int i5 = rogVar.f;
            lzp lzpVar = (lzp) ajmdVar.a;
            if (lzpVar.b) {
                yph yphVar = lzp.a;
                ((ype) yphVar.l().ai((char) 4509)).u("Got head unit configuration");
                lzpVar.e = new CarInstrumentClusterConfig(i, i4, i3, i5, i2 == 1);
                lzpVar.l();
                if (lzpVar.h != null) {
                    ((ype) yphVar.l().ai((char) 4510)).u("Unregistering CarNavigationStatusListener");
                    lzpVar.h.a();
                }
            }
        }
    }
}
