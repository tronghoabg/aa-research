package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class idm implements android.view.ViewTreeObserver.OnDrawListener {
    final /* synthetic */ android.view.View a;
    public final /* synthetic */ defpackage.idn b;

    public idm(defpackage.idn idnVar, android.view.View view) {
        this.a = view;
        this.b = idnVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        defpackage.igg.g(new defpackage.ae(this, this.a, (android.view.ViewTreeObserver.OnDrawListener) this, 15));
    }
}
