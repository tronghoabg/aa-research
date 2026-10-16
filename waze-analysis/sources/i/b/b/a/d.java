package i.b.b.a;

import com.google.v.dm;
import com.google.v.fj;
import i.b.s;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends dm<e, d> implements fj {
    /* synthetic */ d(byte[] bArr) {
        super(e.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((e) this.instance).setAccuracyRadiusMeters(j2);
    }

    public final void b(s sVar) {
        copyOnWrite();
        ((e) this.instance).setLocation(sVar);
    }

    private d() {
        throw null;
    }
}
