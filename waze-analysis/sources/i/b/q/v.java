package i.b.q;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class v extends dm<w, v> implements fj {
    /* synthetic */ v(byte[] bArr) {
        super(w.DEFAULT_INSTANCE);
    }

    public final void a(e eVar) {
        copyOnWrite();
        ((w) this.instance).setUserLocation(eVar);
    }

    public final void b(aq aqVar) {
        copyOnWrite();
        ((w) this.instance).setUserSettings(aqVar);
    }

    private v() {
        throw null;
    }
}
