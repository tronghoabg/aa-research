package i.b.j;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends dm<t, l> implements fj {
    /* synthetic */ l(byte[] bArr) {
        super(t.DEFAULT_INSTANCE);
    }

    public final void a(n nVar) {
        copyOnWrite();
        ((t) this.instance).setFeedbackClicked(nVar.build());
    }

    public final void b(p pVar) {
        copyOnWrite();
        ((t) this.instance).setFeedbackDismissed(pVar.build());
    }

    public final void c(r rVar) {
        copyOnWrite();
        ((t) this.instance).setFeedbackReceived(rVar.build());
    }

    public final void d(String str) {
        copyOnWrite();
        ((t) this.instance).setOriginator(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((t) this.instance).setRequestId(str);
    }

    private l() {
        throw null;
    }
}
