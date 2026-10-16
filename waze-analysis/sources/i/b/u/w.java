package i.b.u;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class w extends dm<x, w> implements fj {
    /* synthetic */ w(byte[] bArr) {
        super(x.DEFAULT_INSTANCE);
    }

    public final void a() {
        copyOnWrite();
        ((x) this.instance).setChannel("WAZE_UID");
    }

    public final void b(String str) {
        copyOnWrite();
        ((x) this.instance).setEmail(str);
    }

    public final void c() {
        copyOnWrite();
        ((x) this.instance).setRequirePinCode(true);
    }

    public final void d() {
        copyOnWrite();
        ((x) this.instance).setTrackEmailLink(false);
    }

    public final void e() {
        copyOnWrite();
        ((x) this.instance).setUseNewErrorScheme(true);
    }

    private w() {
        throw null;
    }
}
