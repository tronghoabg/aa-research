package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import k1.C3115b;
import l1.C3375e;

/* loaded from: classes.dex */
public final class n0 extends C3115b {

    /* renamed from: d, reason: collision with root package name */
    public final o0 f18925d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f18926e = new WeakHashMap();

    public n0(o0 o0Var) {
        this.f18925d = o0Var;
    }

    @Override // k1.C3115b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C3115b c3115b = (C3115b) this.f18926e.get(view);
        return c3115b != null ? c3115b.a(view, accessibilityEvent) : this.f38800a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // k1.C3115b
    public final ad.L b(View view) {
        C3115b c3115b = (C3115b) this.f18926e.get(view);
        return c3115b != null ? c3115b.b(view) : super.b(view);
    }

    @Override // k1.C3115b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C3115b c3115b = (C3115b) this.f18926e.get(view);
        if (c3115b != null) {
            c3115b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // k1.C3115b
    public final void d(View view, C3375e c3375e) {
        o0 o0Var = this.f18925d;
        boolean zHasPendingAdapterUpdates = o0Var.f18928d.hasPendingAdapterUpdates();
        View.AccessibilityDelegate accessibilityDelegate = this.f38800a;
        AccessibilityNodeInfo accessibilityNodeInfo = c3375e.f39862a;
        if (!zHasPendingAdapterUpdates) {
            RecyclerView recyclerView = o0Var.f18928d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c3375e);
                C3115b c3115b = (C3115b) this.f18926e.get(view);
                if (c3115b != null) {
                    c3115b.d(view, c3375e);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // k1.C3115b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C3115b c3115b = (C3115b) this.f18926e.get(view);
        if (c3115b != null) {
            c3115b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // k1.C3115b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C3115b c3115b = (C3115b) this.f18926e.get(viewGroup);
        return c3115b != null ? c3115b.f(viewGroup, view, accessibilityEvent) : this.f38800a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // k1.C3115b
    public final boolean g(View view, int i5, Bundle bundle) {
        o0 o0Var = this.f18925d;
        if (!o0Var.f18928d.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = o0Var.f18928d;
            if (recyclerView.getLayoutManager() != null) {
                C3115b c3115b = (C3115b) this.f18926e.get(view);
                if (c3115b != null) {
                    if (c3115b.g(view, i5, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i5, bundle)) {
                    return true;
                }
                return recyclerView.getLayoutManager().performAccessibilityActionForItem(view, i5, bundle);
            }
        }
        return super.g(view, i5, bundle);
    }

    @Override // k1.C3115b
    public final void h(View view, int i5) {
        C3115b c3115b = (C3115b) this.f18926e.get(view);
        if (c3115b != null) {
            c3115b.h(view, i5);
        } else {
            super.h(view, i5);
        }
    }

    @Override // k1.C3115b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C3115b c3115b = (C3115b) this.f18926e.get(view);
        if (c3115b != null) {
            c3115b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
