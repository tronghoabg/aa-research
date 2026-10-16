package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bro extends com.google.v.dm<brz, bro> implements com.google.v.fj {
    /* synthetic */ bro(byte[] bArr) {
        super(brz.DEFAULT_INSTANCE);
    }

    public final void a(brt brtVar) {
        copyOnWrite();
        ((brz) this.instance).addSuggestedAnswers(brtVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((brz) this.instance).setAlertId(j2);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((brz) this.instance).setAlertSubtypeInt(j2);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((brz) this.instance).setAlertTypeInt(j2);
    }

    public final void e(brp brpVar) {
        copyOnWrite();
        ((brz) this.instance).setQuestionTitleType(brpVar);
    }

    public final void f(String str) {
        copyOnWrite();
        ((brz) this.instance).setUgcContextId(str);
    }

    public final void g(bry bryVar) {
        copyOnWrite();
        ((brz) this.instance).setWazeAsksQuestionType(bryVar);
    }

    private bro() {
        throw null;
    }
}
