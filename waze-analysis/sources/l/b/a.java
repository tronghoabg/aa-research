package l.b;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class a extends dm<c, a> implements fj {
    /* synthetic */ a(byte[] bArr) {
        super(c.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((c) this.instance).setLatencyMs(j2);
    }

    public final void b(i iVar) {
        copyOnWrite();
        ((c) this.instance).setLoginRequestLabels(iVar);
    }

    public final void c(r rVar) {
        copyOnWrite();
        ((c) this.instance).setOnboardingRequestLabels(rVar);
    }

    public final void d(u uVar) {
        copyOnWrite();
        ((c) this.instance).setRoutingRequestLabels(uVar);
    }

    private a() {
        throw null;
    }
}
