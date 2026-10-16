package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import k1.C3115b;
import l1.C3375e;

/* loaded from: classes.dex */
public final class o0 extends C3115b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f18928d;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f18929e;

    public o0(RecyclerView recyclerView) {
        this.f18928d = recyclerView;
        n0 n0Var = this.f18929e;
        if (n0Var != null) {
            this.f18929e = n0Var;
        } else {
            this.f18929e = new n0(this);
        }
    }

    @Override // k1.C3115b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f18928d.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // k1.C3115b
    public final void d(View view, C3375e c3375e) {
        this.f38800a.onInitializeAccessibilityNodeInfo(view, c3375e.f39862a);
        RecyclerView recyclerView = this.f18928d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c3375e);
    }

    @Override // k1.C3115b
    public final boolean g(View view, int i5, Bundle bundle) {
        if (super.g(view, i5, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f18928d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i5, bundle);
    }
}
