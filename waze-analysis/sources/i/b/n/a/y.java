package i.b.n.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class y extends dm<z, y> implements fj {
    /* synthetic */ y(byte[] bArr) {
        super(z.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((z) this.instance).addProducts(str);
    }

    private y() {
        throw null;
    }
}
