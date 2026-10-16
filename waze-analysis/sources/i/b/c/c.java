package i.b.c;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends dm<d, c> implements fj {
    /* synthetic */ c(byte[] bArr) {
        super(d.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((d) this.instance).setButtonId(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((d) this.instance).setEngagementId(str);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((d) this.instance).setOptedOut(z);
    }

    private c() {
        throw null;
    }
}
