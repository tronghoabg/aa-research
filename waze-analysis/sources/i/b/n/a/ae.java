package i.b.n.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ae extends dm<ah, ae> implements fj {
    /* synthetic */ ae(byte[] bArr) {
        super(ah.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((ah) this.instance).addAllSearchFilters(iterable);
    }

    public final void b(o oVar) {
        copyOnWrite();
        ((ah) this.instance).addSearchFilters(oVar.build());
    }

    public final void c(int i2) {
        copyOnWrite();
        ((ah) this.instance).setPageSize(i2);
    }

    public final void d(a aVar) {
        copyOnWrite();
        ((ah) this.instance).setSearchArea(aVar.build());
    }

    @Deprecated
    public final void e(ay ayVar) {
        copyOnWrite();
        ((ah) this.instance).setVenuePreference(ayVar.build());
    }

    private ae() {
        throw null;
    }
}
