package i.b.n;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class k extends dm<l, k> implements fj {
    /* synthetic */ k(byte[] bArr) {
        super(l.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((l) this.instance).setVenueContext(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((l) this.instance).setVenueId(str);
    }

    private k() {
        throw null;
    }
}
