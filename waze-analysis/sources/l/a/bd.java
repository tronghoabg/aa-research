package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bd extends com.google.v.dm<be, bd> implements com.google.v.fj {
    /* synthetic */ bd(byte[] bArr) {
        super(be.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((be) this.instance).setLatencyMs(j2);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((be) this.instance).setResidential(z);
    }

    public final void c(bjz bjzVar) {
        copyOnWrite();
        ((be) this.instance).setTriggeringPlatform(bjzVar);
    }

    private bd() {
        throw null;
    }
}
