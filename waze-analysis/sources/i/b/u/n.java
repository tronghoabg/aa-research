package i.b.u;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class n extends dm<o, n> implements fj {
    /* synthetic */ n(byte[] bArr) {
        super(o.DEFAULT_INSTANCE);
    }

    public final void a(r rVar) {
        copyOnWrite();
        ((o) this.instance).setRequest(rVar.build());
    }

    private n() {
        throw null;
    }
}
