package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class eog extends eol {
    final /* synthetic */ eol a;
    final /* synthetic */ eol b;

    public eog(eol eolVar, eol eolVar2) {
        this.a = eolVar;
        this.b = eolVar2;
    }

    @Override // defpackage.eol
    public final int a(View view, int i, int i2) {
        return (view.getLayoutDirection() == 1 ? this.b : this.a).a(view, i, i2);
    }

    @Override // defpackage.eol
    public final int b(View view, int i) {
        return (view.getLayoutDirection() == 1 ? this.b : this.a).b(view, i);
    }

    @Override // defpackage.eol
    public final String c() {
        return "SWITCHING[L:" + this.a.c() + ", R:" + this.b.c() + "]";
    }
}
