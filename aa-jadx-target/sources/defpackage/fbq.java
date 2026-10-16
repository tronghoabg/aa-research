package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class fbq {
    public final defpackage.fbm a;
    public boolean b;
    public android.os.Bundle c;
    public boolean d;
    public boolean e;
    public final defpackage.aau f;
    public final defpackage.ebq g = new defpackage.ebq(null);
    private final defpackage.afer h;

    public fbq(defpackage.fbm fbmVar, defpackage.afer aferVar) {
        this.a = fbmVar;
        this.h = aferVar;
        long[] jArr = defpackage.aav.a;
        this.f = new defpackage.aau(6);
        this.e = true;
    }

    public final void a() {
        defpackage.fbm fbmVar = this.a;
        if (fbmVar.getLifecycle().a() != defpackage.epx.b) {
            throw new java.lang.IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.b) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.h.invoke();
        fbmVar.getLifecycle().c(new defpackage.oa(this, 7));
        this.b = true;
    }
}
