package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ooi implements android.view.ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ java.util.function.Function b;

    public ooi(android.view.View view, java.util.function.Function function) {
        this.a = view;
        this.b = function;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        android.view.View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        return ((java.lang.Boolean) this.b.apply(view)).booleanValue();
    }
}
