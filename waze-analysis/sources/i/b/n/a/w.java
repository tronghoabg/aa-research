package i.b.n.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class w extends dm<x, w> implements fj {
    /* synthetic */ w(byte[] bArr) {
        super(x.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((x) this.instance).addAllPriceLevels(iterable);
    }

    private w() {
        throw null;
    }
}
