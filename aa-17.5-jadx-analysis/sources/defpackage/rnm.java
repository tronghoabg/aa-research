package defpackage;

import android.os.IBinder;

/* loaded from: classes.dex */
public final class rnm implements IBinder.DeathRecipient {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rnm(jgy jgyVar, int i) {
        this.b = i;
        this.a = jgyVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        if (this.b == 0) {
            rbe.h(((rnw) this.a).d);
        } else {
            ((ype) jgy.a.l().ai((char) 2090)).u("ICarWindowCallback binder died.");
            rbe.h(new jgu(this.a, 1));
        }
    }

    public rnm(rnw rnwVar, int i) {
        this.b = i;
        this.a = rnwVar;
    }
}
