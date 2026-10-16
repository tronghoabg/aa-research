package i.b;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends dm<r, q> implements fj {
    /* synthetic */ q(byte[] bArr) {
        super(r.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((r) this.instance).setAltTimes1000000(i2);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((r) this.instance).setLatTimes1000000(i2);
    }

    public final void c(int i2) {
        copyOnWrite();
        ((r) this.instance).setLonTimes1000000(i2);
    }

    private q() {
        throw null;
    }
}
