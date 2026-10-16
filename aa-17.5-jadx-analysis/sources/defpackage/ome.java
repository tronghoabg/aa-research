package defpackage;

import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.apps.auto.components.ui.image.CrossfadeImageView;

/* loaded from: classes2.dex */
public final class ome extends oln {
    final /* synthetic */ CrossfadeImageView a;

    public ome(CrossfadeImageView crossfadeImageView) {
        this.a = crossfadeImageView;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ImageView imageView = this.a.b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }
}
