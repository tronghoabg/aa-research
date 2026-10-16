package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class fbj {
    public final fbg a;
    public boolean b;
    public Bundle c;
    public boolean d;
    public boolean e;
    public final aan f;
    public final ebi g = new ebi(null);
    private final afdr h;

    public fbj(fbg fbgVar, afdr afdrVar) {
        this.a = fbgVar;
        this.h = afdrVar;
        long[] jArr = aao.a;
        this.f = new aan(6);
        this.e = true;
    }

    public final void a() {
        fbg fbgVar = this.a;
        if (fbgVar.getLifecycle().a() != eps.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.h.invoke();
        fbgVar.getLifecycle().c(new ny(this, 6));
        this.b = true;
    }
}
