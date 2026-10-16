package u0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.wynauto.wyn.R;
import e0.AbstractC2451c;
import e0.C2450b;
import e0.InterfaceC2463o;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public class S extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f46168a;

    public S(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(InterfaceC2463o canvas, s0 s0Var, long j8) {
        AbstractC3340k.e(canvas, "canvas");
        Canvas canvas2 = AbstractC2451c.f34360a;
        super.drawChild(((C2450b) canvas).f34357a, s0Var, j8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        AbstractC3340k.e(canvas, "canvas");
        int childCount = super.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            }
            if (((s0) childAt).f46371h) {
                this.f46168a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f46168a = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f46168a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
    }
}
