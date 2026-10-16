package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class oq extends com.google.v.dm<or, oq> implements com.google.v.fj {
    /* synthetic */ oq(byte[] bArr) {
        super(or.DEFAULT_INSTANCE);
    }

    public final void a() {
        copyOnWrite();
        ((or) this.instance).setAllowBidi(true);
    }

    public final void b(String str) {
        copyOnWrite();
        ((or) this.instance).setCityName(str);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((or) this.instance).setFromNode(j2);
    }

    public final void d(i.b.s sVar) {
        copyOnWrite();
        ((or) this.instance).setPosition(sVar);
    }

    public final void e(String str) {
        copyOnWrite();
        ((or) this.instance).setStateName(str);
    }

    public final void f(String str) {
        copyOnWrite();
        ((or) this.instance).setStreetName(str);
    }

    public final void g(long j2) {
        copyOnWrite();
        ((or) this.instance).setToNode(j2);
    }

    private oq() {
        throw null;
    }
}
