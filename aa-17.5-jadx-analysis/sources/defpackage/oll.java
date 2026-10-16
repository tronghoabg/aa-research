package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.projection.gearhead.R;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class oll {
    public static final yph a = yph.c("GH.AnimController");
    public final olk b;
    public final Queue c;
    public urf d;
    private final Animation.AnimationListener e;
    private final Animation f;
    private final Animation g;
    private final Animation h;
    private final Animation i;
    private final Animation j;
    private final Animation k;
    private final Animation l;
    private final Animation m;
    private final Animation n;
    private final Animation o;
    private final Animation p;
    private final Animation q;

    public oll(Context context, olk olkVar) throws Resources.NotFoundException {
        fcs fcsVar = new fcs(this, 2);
        this.e = fcsVar;
        this.c = new ArrayDeque();
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_in_from_right);
        this.f = animationLoadAnimation;
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.slide_out_to_left);
        this.g = animationLoadAnimation2;
        Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.slide_in_from_left);
        this.h = animationLoadAnimation3;
        Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.slide_out_to_right);
        this.i = animationLoadAnimation4;
        Animation animationLoadAnimation5 = AnimationUtils.loadAnimation(context, R.anim.fade_in_stationary);
        this.j = animationLoadAnimation5;
        Animation animationLoadAnimation6 = AnimationUtils.loadAnimation(context, R.anim.fade_out_stationary);
        this.k = animationLoadAnimation6;
        Animation animationLoadAnimation7 = AnimationUtils.loadAnimation(context, R.anim.slide_in_from_bottom);
        this.l = animationLoadAnimation7;
        Animation animationLoadAnimation8 = AnimationUtils.loadAnimation(context, R.anim.slide_out_to_bottom);
        this.m = animationLoadAnimation8;
        Animation animationLoadAnimation9 = AnimationUtils.loadAnimation(context, R.anim.quick_transition_slide_in_from_left);
        this.n = animationLoadAnimation9;
        Animation animationLoadAnimation10 = AnimationUtils.loadAnimation(context, R.anim.quick_transition_slide_in_from_right);
        this.o = animationLoadAnimation10;
        Animation animationLoadAnimation11 = AnimationUtils.loadAnimation(context, R.anim.quick_transition_slide_out_to_left);
        this.p = animationLoadAnimation11;
        Animation animationLoadAnimation12 = AnimationUtils.loadAnimation(context, R.anim.quick_transition_slide_out_to_right);
        this.q = animationLoadAnimation12;
        animationLoadAnimation2.setAnimationListener(fcsVar);
        animationLoadAnimation.setAnimationListener(fcsVar);
        animationLoadAnimation3.setAnimationListener(fcsVar);
        animationLoadAnimation4.setAnimationListener(fcsVar);
        animationLoadAnimation5.setAnimationListener(fcsVar);
        animationLoadAnimation6.setAnimationListener(fcsVar);
        animationLoadAnimation7.setAnimationListener(fcsVar);
        animationLoadAnimation8.setAnimationListener(fcsVar);
        animationLoadAnimation9.setAnimationListener(fcsVar);
        animationLoadAnimation10.setAnimationListener(fcsVar);
        animationLoadAnimation11.setAnimationListener(fcsVar);
        animationLoadAnimation12.setAnimationListener(fcsVar);
        this.b = olkVar;
    }
}
