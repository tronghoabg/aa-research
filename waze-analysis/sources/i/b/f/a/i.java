package i.b.f.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends dm<l, i> implements fj {
    /* synthetic */ i(byte[] bArr) {
        super(l.DEFAULT_INSTANCE);
    }

    public final void a(k kVar) {
        copyOnWrite();
        ((l) this.instance).setOptions(kVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((l) this.instance).setUserId(j2);
    }

    private i() {
        throw null;
    }
}
