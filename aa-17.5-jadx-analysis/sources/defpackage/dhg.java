package defpackage;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class dhg extends duz {
    final /* synthetic */ aitf a;
    final /* synthetic */ dii b;

    public dhg(aitf aitfVar, dii diiVar) {
        this.a = aitfVar;
        this.b = diiVar;
    }

    @Override // defpackage.duz
    public final void a(int i) {
        this.a.g(new IllegalStateException("Unable to load font " + this.b + " (reason=" + i + ")"));
    }

    @Override // defpackage.duz
    public final void b(Typeface typeface) {
        this.a.w(typeface);
    }
}
