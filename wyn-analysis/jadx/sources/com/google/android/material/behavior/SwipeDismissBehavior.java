package com.google.android.material.behavior;

import V0.a;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import k1.S;
import l1.C3373c;
import t1.C4075d;
import y3.C4552j;

/* loaded from: classes4.dex */
public class SwipeDismissBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public C4075d f26782a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26783b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26784c;

    /* renamed from: d, reason: collision with root package name */
    public int f26785d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f26786e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* renamed from: f, reason: collision with root package name */
    public float f26787f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final L7.a f26788g = new L7.a(this);

    @Override // V0.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f26783b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f26783b = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f26783b = false;
        }
        if (zO) {
            if (this.f26782a == null) {
                this.f26782a = new C4075d(coordinatorLayout.getContext(), coordinatorLayout, this.f26788g);
            }
            if (!this.f26784c && this.f26782a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // V0.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i5) {
        WeakHashMap weakHashMap = S.f38779a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            S.j(1048576, view);
            S.h(0, view);
            if (r(view)) {
                S.k(view, C3373c.f39854l, new C4552j(this, 16));
            }
        }
        return false;
    }

    @Override // V0.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f26782a == null) {
            return false;
        }
        if (this.f26784c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f26782a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
