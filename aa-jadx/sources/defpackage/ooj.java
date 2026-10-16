package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ooj implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ java.util.function.Consumer b;

    public ooj(android.view.View view, java.util.function.Consumer consumer) {
        this.a = view;
        this.b = consumer;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        android.view.View view = this.a;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.b.accept(view);
    }
}
