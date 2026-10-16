package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class vg extends com.google.v.dm<vi, vg> implements com.google.v.fj {
    /* synthetic */ vg(byte[] bArr) {
        super(vi.DEFAULT_INSTANCE);
    }

    public final void a(vh vhVar) {
        copyOnWrite();
        ((vi) this.instance).addDisplayedSpecialRoutes(vhVar);
    }

    public final void b(vf vfVar) {
        copyOnWrite();
        ((vi) this.instance).setAction(vfVar);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((vi) this.instance).setLockScreenMode(z);
    }

    public final void d(String str) {
        copyOnWrite();
        ((vi) this.instance).setVenueId(str);
    }

    public final void e() {
        copyOnWrite();
        ((vi) this.instance).setDrawerOpen(true);
    }

    public final void f() {
        copyOnWrite();
        ((vi) this.instance).setShareSuggestionDisplayed(false);
    }

    private vg() {
        throw null;
    }
}
