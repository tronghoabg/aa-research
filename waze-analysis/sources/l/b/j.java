package l.b;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class j extends dm<r, j> implements fj {
    /* synthetic */ j(byte[] bArr) {
        super(r.DEFAULT_INSTANCE);
    }

    public final void a(o oVar) {
        copyOnWrite();
        ((r) this.instance).setEnd(oVar);
    }

    public final void b(q qVar) {
        copyOnWrite();
        ((r) this.instance).setStart(qVar);
    }

    private j() {
        throw null;
    }
}
