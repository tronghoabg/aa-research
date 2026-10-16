package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC1415d implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0 f18388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f18390c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1416e f18391d;

    public AnimationAnimationListenerC1415d(A0 a02, ViewGroup viewGroup, View view, C1416e c1416e) {
        this.f18388a = a02;
        this.f18389b = viewGroup;
        this.f18390c = view;
        this.f18391d = c1416e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC3340k.e(animation, "animation");
        View view = this.f18390c;
        C1416e c1416e = this.f18391d;
        ViewGroup viewGroup = this.f18389b;
        viewGroup.post(new Ab.a(viewGroup, view, c1416e, 18));
        if (e0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f18388a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        AbstractC3340k.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        AbstractC3340k.e(animation, "animation");
        if (e0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f18388a + " has reached onAnimationStart.");
        }
    }
}
