package i.b.n.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class c extends dm<d, c> implements fj {
    /* synthetic */ c(byte[] bArr) {
        super(d.DEFAULT_INSTANCE);
    }

    public final void a(i.b.s sVar) {
        copyOnWrite();
        ((d) this.instance).addCoordinates(sVar);
    }

    private c() {
        throw null;
    }
}
