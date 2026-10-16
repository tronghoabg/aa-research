package defpackage;

import android.content.res.Resources;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* loaded from: classes2.dex */
public class mvr extends tef {
    public mvr(int i) {
        super(i);
    }

    @Override // android.support.v4.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) throws Resources.NotFoundException {
        if (i2 == 0) {
            return null;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(requireContext(), i2);
        animationLoadAnimation.getClass();
        animationLoadAnimation.setAnimationListener(new mvq(this));
        return animationLoadAnimation;
    }
}
