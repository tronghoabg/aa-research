package l.a;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aco extends com.google.v.dm<acp, aco> implements com.google.v.fj {
    /* synthetic */ aco(byte[] bArr) {
        super(acp.DEFAULT_INSTANCE);
    }

    public final List a() {
        return ((acp) this.instance).getMapButtonsList();
    }

    public final void b(ack ackVar) {
        copyOnWrite();
        ((acp) this.instance).addMapButtons(ackVar);
    }

    private aco() {
        throw null;
    }
}
