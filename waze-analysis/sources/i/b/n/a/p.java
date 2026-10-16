package i.b.n.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class p extends dm<q, p> implements fj {
    /* synthetic */ p(byte[] bArr) {
        super(q.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((q) this.instance).addCategoryId(str);
    }

    private p() {
        throw null;
    }
}
