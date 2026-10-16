package i.b.n.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class h extends dm<i, h> implements fj {
    /* synthetic */ h(byte[] bArr) {
        super(i.DEFAULT_INSTANCE);
    }

    public final void a(i.b.s sVar) {
        copyOnWrite();
        ((i) this.instance).setLocation(sVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((i) this.instance).setVenueId(str);
    }

    private h() {
        throw null;
    }
}
