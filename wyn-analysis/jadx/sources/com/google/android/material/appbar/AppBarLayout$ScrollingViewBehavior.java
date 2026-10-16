package com.google.android.material.appbar;

import K7.a;
import S3.f;
import V0.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes4.dex */
public class AppBarLayout$ScrollingViewBehavior extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f26767b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
        }
    }

    @Override // V0.a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        V0.a aVar = ((d) view2.getLayoutParams()).f12869a;
        if (aVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) aVar).getClass();
            int i5 = this.f26767b;
            int iM = bottom - (i5 == 0 ? 0 : f.m((int) (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * i5), 0, i5));
            WeakHashMap weakHashMap = S.f38779a;
            view.offsetTopAndBottom(iM);
        }
        return false;
    }

    @Override // V0.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i5, int i10, int i11) {
        int i12 = view.getLayoutParams().height;
        if (i12 != -1 && i12 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // V0.a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // K7.a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i5) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(i5, view);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I7.a.f5417t);
        this.f26767b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // V0.a
    public final void b(View view) {
    }
}
