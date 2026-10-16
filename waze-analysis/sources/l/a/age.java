package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class age extends com.google.v.dm<agg, age> implements com.google.v.fj {
    /* synthetic */ age(byte[] bArr) {
        super(agg.DEFAULT_INSTANCE);
    }

    public final void a(agf agfVar) {
        copyOnWrite();
        ((agg) this.instance).addAvailableOptions(agfVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((agg) this.instance).setInCarSubtitle(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((agg) this.instance).setInCarTitle(str);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((agg) this.instance).setSoundEnabled(z);
    }

    public final void e(String str) {
        copyOnWrite();
        ((agg) this.instance).setSubtitle(str);
    }

    public final void f(long j2) {
        copyOnWrite();
        ((agg) this.instance).setTimeoutSeconds(j2);
    }

    public final void g(String str) {
        copyOnWrite();
        ((agg) this.instance).setTitle(str);
    }

    private age() {
        throw null;
    }
}
