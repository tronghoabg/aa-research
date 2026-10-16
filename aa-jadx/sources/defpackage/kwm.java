package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kwm implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor b;
    final /* synthetic */ android.view.ViewTreeObserver c;

    public kwm(android.view.View view, com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor focusInterceptor, android.view.ViewTreeObserver viewTreeObserver) {
        this.a = view;
        this.b = focusInterceptor;
        this.c = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        android.view.View view = this.a;
        if (view.isAttachedToWindow()) {
            this.b.setVisibility(view.getVisibility());
        } else {
            this.c.removeOnGlobalLayoutListener(this);
        }
    }
}
