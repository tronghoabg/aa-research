package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class gk extends com.google.v.dm<gl, gk> implements com.google.v.fj {
    /* synthetic */ gk(byte[] bArr) {
        super(gl.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((gl) this.instance).setLatencyMs(j2);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((gl) this.instance).setNewQuery(z);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((gl) this.instance).setQueryCharactersCount(j2);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((gl) this.instance).setVoiceSearch(z);
    }

    private gk() {
        throw null;
    }
}
