package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class omx extends defpackage.omg {
    final /* synthetic */ com.google.android.apps.auto.components.ui.image.CrossfadeImageView a;

    public omx(com.google.android.apps.auto.components.ui.image.CrossfadeImageView crossfadeImageView) {
        this.a = crossfadeImageView;
    }

    @Override // defpackage.omg, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        android.widget.ImageView imageView = this.a.b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }
}
