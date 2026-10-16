package i.b.s;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a extends dm<b, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(b.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((b) this.instance).setRouteId(i2);
    }

    private a() {
        throw null;
    }
}
