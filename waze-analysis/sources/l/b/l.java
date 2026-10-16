package l.b;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class l extends dm<o, l> implements fj {
    /* synthetic */ l(byte[] bArr) {
        super(o.DEFAULT_INSTANCE);
    }

    public final void a(m mVar) {
        copyOnWrite();
        ((o) this.instance).setApi(mVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((o) this.instance).setAttemptsCount(j2);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((o) this.instance).setErrorCode(j2);
    }

    public final void d(String str) {
        copyOnWrite();
        ((o) this.instance).setFailureReason(str);
    }

    public final void e(n nVar) {
        copyOnWrite();
        ((o) this.instance).setResult(nVar);
    }

    private l() {
        throw null;
    }
}
