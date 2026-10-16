package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class baj extends com.google.v.dm<bak, baj> implements com.google.v.fj {
    /* synthetic */ baj(byte[] bArr) {
        super(bak.DEFAULT_INSTANCE);
    }

    public final void a(bai baiVar) {
        copyOnWrite();
        ((bak) this.instance).setAction(baiVar);
    }

    public final void b(afx afxVar) {
        copyOnWrite();
        ((bak) this.instance).setCoordinates(afxVar);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((bak) this.instance).setSubtype(j2);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((bak) this.instance).setType(j2);
    }

    private baj() {
        throw null;
    }
}
