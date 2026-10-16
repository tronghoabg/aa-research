package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ome {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.AnimController");
    public final defpackage.omd b;
    public final java.util.Queue c;
    public defpackage.usc d;
    private final android.view.animation.Animation.AnimationListener e;
    private final android.view.animation.Animation f;
    private final android.view.animation.Animation g;
    private final android.view.animation.Animation h;
    private final android.view.animation.Animation i;
    private final android.view.animation.Animation j;
    private final android.view.animation.Animation k;
    private final android.view.animation.Animation l;
    private final android.view.animation.Animation m;
    private final android.view.animation.Animation n;
    private final android.view.animation.Animation o;
    private final android.view.animation.Animation p;
    private final android.view.animation.Animation q;

    public ome(android.content.Context context, defpackage.omd omdVar) {
        defpackage.fcz fczVar = new defpackage.fcz(this, 2);
        this.e = fczVar;
        this.c = new java.util.ArrayDeque();
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.slide_in_from_right);
        this.f = animationLoadAnimation;
        android.view.animation.Animation animationLoadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.slide_out_to_left);
        this.g = animationLoadAnimation2;
        android.view.animation.Animation animationLoadAnimation3 = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.slide_in_from_left);
        this.h = animationLoadAnimation3;
        android.view.animation.Animation animationLoadAnimation4 = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.slide_out_to_right);
        this.i = animationLoadAnimation4;
        android.view.animation.Animation animationLoadAnimation5 = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.fade_in_stationary);
        this.j = animationLoadAnimation5;
        android.view.animation.Animation animationLoadAnimation6 = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.fade_out_stationary);
        this.k = animationLoadAnimation6;
        android.view.animation.Animation animationLoadAnimation7 = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.slide_in_from_bottom);
        this.l = animationLoadAnimation7;
        android.view.animation.Animation animationLoadAnimation8 = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.slide_out_to_bottom);
        this.m = animationLoadAnimation8;
        android.view.animation.Animation animationLoadAnimation9 = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.quick_transition_slide_in_from_left);
        this.n = animationLoadAnimation9;
        android.view.animation.Animation animationLoadAnimation10 = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.quick_transition_slide_in_from_right);
        this.o = animationLoadAnimation10;
        android.view.animation.Animation animationLoadAnimation11 = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.quick_transition_slide_out_to_left);
        this.p = animationLoadAnimation11;
        android.view.animation.Animation animationLoadAnimation12 = android.view.animation.AnimationUtils.loadAnimation(context, com.google.android.projection.gearhead.R.anim.quick_transition_slide_out_to_right);
        this.q = animationLoadAnimation12;
        animationLoadAnimation2.setAnimationListener(fczVar);
        animationLoadAnimation.setAnimationListener(fczVar);
        animationLoadAnimation3.setAnimationListener(fczVar);
        animationLoadAnimation4.setAnimationListener(fczVar);
        animationLoadAnimation5.setAnimationListener(fczVar);
        animationLoadAnimation6.setAnimationListener(fczVar);
        animationLoadAnimation7.setAnimationListener(fczVar);
        animationLoadAnimation8.setAnimationListener(fczVar);
        animationLoadAnimation9.setAnimationListener(fczVar);
        animationLoadAnimation10.setAnimationListener(fczVar);
        animationLoadAnimation11.setAnimationListener(fczVar);
        animationLoadAnimation12.setAnimationListener(fczVar);
        this.b = omdVar;
    }
}
