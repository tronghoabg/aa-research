package i.b.b.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends dm<m, l> implements fj {
    /* synthetic */ l(byte[] bArr) {
        super(m.DEFAULT_INSTANCE);
    }

    public final void a(a aVar) {
        copyOnWrite();
        ((m) this.instance).addAudioChannels(aVar.build());
    }

    public final void b(e eVar) {
        copyOnWrite();
        ((m) this.instance).setEstimatedLocation(eVar);
    }

    private l() {
        throw null;
    }
}
