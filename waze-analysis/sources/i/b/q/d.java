package i.b.q;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class d extends dm<e, d> implements fj {
    /* synthetic */ d(byte[] bArr) {
        super(e.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((e) this.instance).setLastUpdateTimeInEpochSec(j2);
    }

    public final void b(i.b.s sVar) {
        copyOnWrite();
        ((e) this.instance).setLocation(sVar);
    }

    private d() {
        throw null;
    }
}
