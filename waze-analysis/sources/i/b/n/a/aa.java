package i.b.n.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aa extends dm<ab, aa> implements fj {
    /* synthetic */ aa(byte[] bArr) {
        super(ab.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((ab) this.instance).addServiceId(str);
    }

    private aa() {
        throw null;
    }
}
