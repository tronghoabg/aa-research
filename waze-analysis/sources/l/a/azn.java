package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class azn extends com.google.v.dm<azo, azn> implements com.google.v.fj {
    /* synthetic */ azn(byte[] bArr) {
        super(azo.DEFAULT_INSTANCE);
    }

    public final void a(ayn aynVar) {
        copyOnWrite();
        ((azo) this.instance).setCategoricalGroupSearchName(aynVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((azo) this.instance).setCategoricalSearchName(str);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((azo) this.instance).setNumberOfResults(j2);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((azo) this.instance).setNumberResultsShown(j2);
    }

    public final void e(boolean z) {
        copyOnWrite();
        ((azo) this.instance).setSearchAgain(z);
    }

    public final void f(String str) {
        copyOnWrite();
        ((azo) this.instance).setSearchId(str);
    }

    public final void g(bjz bjzVar) {
        copyOnWrite();
        ((azo) this.instance).setTriggeringPlatform(bjzVar);
    }

    private azn() {
        throw null;
    }
}
