package i.b;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends dm<s, p> implements t {
    /* synthetic */ p(byte[] bArr) {
        super(s.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((s) this.instance).setLatTimes1000000(i2);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((s) this.instance).setLonTimes1000000(i2);
    }

    private p() {
        throw null;
    }
}
