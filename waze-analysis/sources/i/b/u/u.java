package i.b.u;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class u extends dm<v, u> implements fj {
    /* synthetic */ u(byte[] bArr) {
        super(v.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((v) this.instance).setBirthdateSeconds(j2);
    }

    public final void b() {
        copyOnWrite();
        ((v) this.instance).setIsAgeConfirmed(true);
    }

    private u() {
        throw null;
    }
}
