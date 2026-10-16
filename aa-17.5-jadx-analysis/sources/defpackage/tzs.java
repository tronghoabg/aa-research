package defpackage;

/* loaded from: classes3.dex */
final class tzs implements Runnable {
    final /* synthetic */ tzt a;
    public final usy b;
    public final gjv c;

    public tzs(tzt tztVar, usy usyVar, gjv gjvVar) {
        this.a = tztVar;
        this.b = usyVar;
        this.c = gjvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vaq.d();
        this.c.n(this);
        this.a.h(this.b);
    }
}
