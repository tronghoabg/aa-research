package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class axk extends com.google.v.dm<axm, axk> implements com.google.v.fj {
    /* synthetic */ axk(byte[] bArr) {
        super(axm.DEFAULT_INSTANCE);
    }

    public final void a(axj axjVar) {
        copyOnWrite();
        ((axm) this.instance).setAction(axjVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((axm) this.instance).setDaysAhead(j2);
    }

    public final void c(axl axlVar) {
        copyOnWrite();
        ((axm) this.instance).setFromLocation(axlVar);
    }

    private axk() {
        throw null;
    }
}
