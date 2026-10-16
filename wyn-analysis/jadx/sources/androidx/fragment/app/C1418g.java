package androidx.fragment.app;

import Va.M6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1418g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f18437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18438c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A0 f18439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1419h f18440e;

    public C1418g(ViewGroup viewGroup, View view, boolean z2, A0 a02, C1419h c1419h) {
        this.f18436a = viewGroup;
        this.f18437b = view;
        this.f18438c = z2;
        this.f18439d = a02;
        this.f18440e = c1419h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        AbstractC3340k.e(anim, "anim");
        ViewGroup viewGroup = this.f18436a;
        View viewToAnimate = this.f18437b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z2 = this.f18438c;
        A0 a02 = this.f18439d;
        if (z2) {
            int i5 = a02.f18278a;
            AbstractC3340k.d(viewToAnimate, "viewToAnimate");
            M6.g(i5, viewToAnimate, viewGroup);
        }
        C1419h c1419h = this.f18440e;
        c1419h.f18449c.f18473a.c(c1419h);
        if (e0.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + a02 + " has ended.");
        }
    }
}
