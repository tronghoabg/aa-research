package l.b;

import com.google.v.dm;
import com.google.v.fj;
import l.a.awx;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class s extends dm<u, s> implements fj {
    /* synthetic */ s(byte[] bArr) {
        super(u.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((u) this.instance).setAttemptNum(j2);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((u) this.instance).setErrorCode(j2);
    }

    public final void c(t tVar) {
        copyOnWrite();
        ((u) this.instance).setResult(tVar);
    }

    public final void d(awx awxVar) {
        copyOnWrite();
        ((u) this.instance).setUseCase(awxVar);
    }

    private s() {
        throw null;
    }
}
