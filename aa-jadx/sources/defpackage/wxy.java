package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wxy extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ android.widget.TextView b;
    final /* synthetic */ int c;
    final /* synthetic */ android.widget.TextView d;
    final /* synthetic */ defpackage.wxz e;

    public wxy(defpackage.wxz wxzVar, int i, android.widget.TextView textView, int i2, android.widget.TextView textView2) {
        this.a = i;
        this.b = textView;
        this.c = i2;
        this.d = textView2;
        this.e = wxzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        android.widget.TextView textView;
        defpackage.wxz wxzVar = this.e;
        wxzVar.d = this.a;
        wxzVar.c = null;
        android.widget.TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.c == 1 && (textView = wxzVar.h) != null) {
                textView.setText((java.lang.CharSequence) null);
            }
        }
        android.widget.TextView textView3 = this.d;
        if (textView3 != null) {
            textView3.setTranslationY(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            textView3.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        android.widget.TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        }
    }
}
