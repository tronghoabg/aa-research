package com.waze.design_components.a;

import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.g.a.l;
import h.g.b.x;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class c extends CoordinatorLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23291a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final View f23292b;

    /* renamed from: c, reason: collision with root package name */
    private l f23293c;

    /* renamed from: d, reason: collision with root package name */
    private final BottomSheetBehavior f23294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, View view, l lVar) {
        super(context);
        x.f(context, "context");
        x.f(view, "content");
        x.f(lVar, "onDraggingOffsetChanged");
        this.f23292b = view;
        this.f23293c = lVar;
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
        this.f23294d = bottomSheetBehavior;
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -1);
        layoutParams.setBehavior(bottomSheetBehavior);
        bottomSheetBehavior.u(false);
        bottomSheetBehavior.w(false);
        bottomSheetBehavior.P();
        addView(view, layoutParams);
        bottomSheetBehavior.p(new b(this));
    }

    public final d b(int i2) {
        BottomSheetBehavior bottomSheetBehavior = this.f23294d;
        d dVar = new d(0.0f, bottomSheetBehavior.f(), bottomSheetBehavior.e());
        int iG = bottomSheetBehavior.g();
        float f2 = 1.0f;
        if (iG != 3) {
            if (iG == 4) {
                return dVar;
            }
            if (iG != 5) {
                if (iG != 6) {
                    return null;
                }
                a aVar = new a(i2, bottomSheetBehavior.a());
                x.f(dVar, "<this>");
                x.f(aVar, "absoluteOffset");
                return d.f(dVar, n.g((aVar.b() - dVar.d()) / ((aVar.c() - dVar.b()) - dVar.d()), 0.0f, 1.0f));
            }
            f2 = -1.0f;
        }
        return d.f(dVar, f2);
    }

    public final void d(boolean z) {
        this.f23294d.s(z);
    }

    public final void e(int i2) {
        this.f23294d.t(i2);
    }

    public final void f(l lVar) {
        x.f(lVar, "newVal");
        this.f23293c = lVar;
    }

    public final void g(float f2) {
        this.f23294d.v(f2);
    }

    public final void h(int i2, boolean z) {
        this.f23294d.x(i2);
        d(z);
    }

    public final void i(int i2) {
        this.f23294d.O(i2);
    }
}
