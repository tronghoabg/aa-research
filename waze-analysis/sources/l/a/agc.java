package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class agc extends com.google.v.dm<agd, agc> implements com.google.v.fj {
    /* synthetic */ agc(byte[] bArr) {
        super(agd.DEFAULT_INSTANCE);
    }

    public final void a(agb agbVar) {
        copyOnWrite();
        ((agd) this.instance).setAction(agbVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((agd) this.instance).setMatchContent(str);
    }

    private agc() {
        throw null;
    }
}
