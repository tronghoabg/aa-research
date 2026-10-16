package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dhn extends defpackage.dvg {
    final /* synthetic */ defpackage.aiuf a;
    final /* synthetic */ defpackage.dip b;

    public dhn(defpackage.aiuf aiufVar, defpackage.dip dipVar) {
        this.a = aiufVar;
        this.b = dipVar;
    }

    @Override // defpackage.dvg
    public final void a(int i) {
        this.a.g(new java.lang.IllegalStateException("Unable to load font " + this.b + " (reason=" + i + ")"));
    }

    @Override // defpackage.dvg
    public final void b(android.graphics.Typeface typeface) {
        this.a.w(typeface);
    }
}
