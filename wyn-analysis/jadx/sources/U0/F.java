package u0;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import t0.C4064l;

/* loaded from: classes.dex */
public final class F extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f46101a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f46102b;

    public F(Context context) {
        super(context);
        setClipChildren(false);
        this.f46101a = new HashMap();
        this.f46102b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @NotNull
    public final HashMap<M0.i, t0.t> getHolderToLayoutNode() {
        return this.f46101a;
    }

    @NotNull
    public final HashMap<t0.t, M0.i> getLayoutNodeToHolder() {
        return this.f46102b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View child, View target) {
        AbstractC3340k.e(child, "child");
        AbstractC3340k.e(target, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        Set<M0.i> setKeySet = this.f46101a.keySet();
        AbstractC3340k.d(setKeySet, "holderToLayoutNode.keys");
        for (M0.i iVar : setKeySet) {
            iVar.layout(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        int i11;
        if (View.MeasureSpec.getMode(i5) != 1073741824) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i5), View.MeasureSpec.getSize(i10));
        Set<M0.i> setKeySet = this.f46101a.keySet();
        AbstractC3340k.d(setKeySet, "holderToLayoutNode.keys");
        for (M0.i iVar : setKeySet) {
            int i12 = iVar.f7264p;
            if (i12 != Integer.MIN_VALUE && (i11 = iVar.f7265q) != Integer.MIN_VALUE) {
                iVar.measure(i12, i11);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            t0.t tVar = (t0.t) this.f46101a.get(childAt);
            if (childAt.isLayoutRequested() && tVar != null) {
                C4064l c4064l = t0.t.f45491R;
                tVar.z(false);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
