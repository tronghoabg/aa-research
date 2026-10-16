package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpm extends com.google.v.dm<bpp, bpm> implements com.google.v.fj {
    /* synthetic */ bpm(byte[] bArr) {
        super(bpp.DEFAULT_INSTANCE);
    }

    public final void a(bpn bpnVar) {
        copyOnWrite();
        ((bpp) this.instance).setChangedFrom(bpnVar);
    }

    public final void b(bpn bpnVar) {
        copyOnWrite();
        ((bpp) this.instance).setChangedTo(bpnVar);
    }

    public final void c() {
        copyOnWrite();
        ((bpp) this.instance).setThisDriveOnly(false);
    }

    private bpm() {
        throw null;
    }
}
