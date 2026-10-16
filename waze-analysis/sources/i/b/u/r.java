package i.b.u;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class r extends dm<s, r> implements fj {
    /* synthetic */ r(byte[] bArr) {
        super(s.DEFAULT_INSTANCE);
    }

    public final void a(u uVar) {
        copyOnWrite();
        ((s) this.instance).setFields(uVar.build());
    }

    private r() {
        throw null;
    }
}
