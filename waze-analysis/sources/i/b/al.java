package i.b;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class al extends dm<am, al> implements fj {
    /* synthetic */ al(byte[] bArr) {
        super(am.DEFAULT_INSTANCE);
    }

    public final void a(ai aiVar) {
        copyOnWrite();
        ((am) this.instance).addEntry(aiVar.build());
    }

    private al() {
        throw null;
    }
}
