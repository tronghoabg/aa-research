package defpackage;

import android.os.IBinder;
import android.util.Log;

/* loaded from: classes2.dex */
public final class rga implements IBinder.DeathRecipient {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public rga(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [afck, aitf, java.lang.Object] */
    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.b;
        if (i == 0) {
            ((rgb) this.a).h();
            return;
        }
        if (i == 1) {
            Log.w("CallExtensions", "waitForDestroy: binderDied called, cleaning up");
            ?? r3 = this.a;
            if (r3.h()) {
                r3.w(afak.a);
                return;
            }
            return;
        }
        Object obj = this.a;
        rgd rgdVar = (rgd) obj;
        rgdVar.c.d(yzz.AUDIO_SERVICE_MIGRATION, yzy.yx);
        rgdVar.g();
    }
}
