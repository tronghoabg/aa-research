package i.b.n.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class m extends dm<n, m> implements fj {
    /* synthetic */ m(byte[] bArr) {
        super(n.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((n) this.instance).addBrandNames(str);
    }

    private m() {
        throw null;
    }
}
