package defpackage;

import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class lvq implements ltx {
    public static final yph a = yph.c("GH.ConversationUpdater");
    private final Handler b = new Handler(Looper.getMainLooper());
    private boolean c;

    public static void f(lwz lwzVar) {
        wer.c();
        mlq.e().j(lwzVar);
    }

    @Override // defpackage.ltx
    public final void a(lue lueVar, boolean z) {
        if (this.c) {
            this.b.post(new jgv(lueVar, z, 8));
        }
    }

    @Override // defpackage.ltx
    public final void b(yzr yzrVar, long j, int i) {
        if (this.c) {
            ((ype) a.l().ai(4328)).R("updateMessagingStreamItemAsRead. Type: %s Id: %d numRead: %d", yzrVar, Long.valueOf(j), Integer.valueOf(i));
            boolean z = true;
            if (yzrVar != yzr.IM_NOTIFICATION && yzrVar != yzr.SMS_NOTIFICATION) {
                z = false;
            }
            woy.N(z);
            this.b.post(new lvm(yzrVar, j, i, 2));
        }
    }

    @Override // defpackage.lhg
    public final void c() {
        this.c = true;
    }

    @Override // defpackage.lhg
    public final void d() {
        this.c = false;
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.ltx
    public final void e(lue lueVar) {
        if (this.c) {
            yph yphVar = a;
            if (yphVar.l().Z()) {
                ((ype) yphVar.l().ai((char) 4329)).y("updateSmsConversation: %s", Objects.toString(lueVar));
            }
            this.b.post(new lqj(lueVar, 8));
        }
    }
}
