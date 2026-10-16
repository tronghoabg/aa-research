package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class gd extends com.google.v.dm<ge, gd> implements com.google.v.fj {
    /* synthetic */ gd(byte[] bArr) {
        super(ge.DEFAULT_INSTANCE);
    }

    public final void a(gc gcVar) {
        copyOnWrite();
        ((ge) this.instance).setAction(gcVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ge) this.instance).setPartnerName(str);
    }

    private gd() {
        throw null;
    }
}
