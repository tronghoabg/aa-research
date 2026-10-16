package i.b.n.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a extends dm<j, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(j.DEFAULT_INSTANCE);
    }

    public final void a(g gVar) {
        copyOnWrite();
        ((j) this.instance).setSessionBasedGeometry(gVar);
    }

    public final void b(i iVar) {
        copyOnWrite();
        ((j) this.instance).setVenueLocation(iVar);
    }

    public final void c(d dVar) {
        copyOnWrite();
        ((j) this.instance).setViewport(dVar);
    }

    private a() {
        throw null;
    }
}
