package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bbw extends com.google.v.dm<bby, bbw> implements com.google.v.fj {
    /* synthetic */ bbw(byte[] bArr) {
        super(bby.DEFAULT_INSTANCE);
    }

    public final void a(yl ylVar) {
        copyOnWrite();
        ((bby) this.instance).setAction(ylVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((bby) this.instance).setButton(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((bby) this.instance).setChangedFrom(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((bby) this.instance).setChangedParam(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((bby) this.instance).setChangedTo(str);
    }

    public final void f(bbx bbxVar) {
        copyOnWrite();
        ((bby) this.instance).setScreenName(bbxVar);
    }

    private bbw() {
        throw null;
    }
}
