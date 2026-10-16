package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eom extends defpackage.eor {
    final /* synthetic */ defpackage.eor a;
    final /* synthetic */ defpackage.eor b;

    public eom(defpackage.eor eorVar, defpackage.eor eorVar2) {
        this.a = eorVar;
        this.b = eorVar2;
    }

    @Override // defpackage.eor
    public final int a(android.view.View view, int i, int i2) {
        return (view.getLayoutDirection() == 1 ? this.b : this.a).a(view, i, i2);
    }

    @Override // defpackage.eor
    public final int b(android.view.View view, int i) {
        return (view.getLayoutDirection() == 1 ? this.b : this.a).b(view, i);
    }

    @Override // defpackage.eor
    public final java.lang.String c() {
        return "SWITCHING[L:" + this.a.c() + ", R:" + this.b.c() + "]";
    }
}
