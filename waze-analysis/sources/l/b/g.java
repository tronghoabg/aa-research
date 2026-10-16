package l.b;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class g extends dm<i, g> implements fj {
    /* synthetic */ g(byte[] bArr) {
        super(i.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((i) this.instance).setAttemptsCount(j2);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((i) this.instance).setErrorCode(j2);
    }

    public final void c(String str) {
        copyOnWrite();
        ((i) this.instance).setFailureReason(str);
    }

    public final void d(h hVar) {
        copyOnWrite();
        ((i) this.instance).setResult(hVar);
    }

    private g() {
        throw null;
    }
}
