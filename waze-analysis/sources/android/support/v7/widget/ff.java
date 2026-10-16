package android.support.v7.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ff extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    final fg f1476a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f1477b = new WeakHashMap();

    public ff(fg fgVar) {
        this.f1476a = fgVar;
    }

    final AccessibilityDelegateCompat a(View view) {
        return (AccessibilityDelegateCompat) this.f1477b.remove(view);
    }

    final void b(View view) {
        AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(view);
        if (accessibilityDelegate == null || accessibilityDelegate == this) {
            return;
        }
        this.f1477b.put(view, accessibilityDelegate);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f1477b.get(view);
        return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f1477b.get(view);
        return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f1477b.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        en enVar;
        fg fgVar = this.f1476a;
        if (fgVar.shouldIgnore() || (enVar = fgVar.mRecyclerView.n) == null) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            return;
        }
        enVar.aT(view, accessibilityNodeInfoCompat);
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f1477b.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f1477b.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f1477b.get(viewGroup);
        return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        fg fgVar = this.f1476a;
        if (fgVar.shouldIgnore() || fgVar.mRecyclerView.n == null) {
            return super.performAccessibilityAction(view, i2, bundle);
        }
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f1477b.get(view);
        if (accessibilityDelegateCompat != null) {
            if (accessibilityDelegateCompat.performAccessibilityAction(view, i2, bundle)) {
                return true;
            }
        } else if (super.performAccessibilityAction(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = fgVar.mRecyclerView.n.s;
        et etVar = recyclerView.f937d;
        fb fbVar = recyclerView.E;
        return false;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void sendAccessibilityEvent(View view, int i2) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f1477b.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.sendAccessibilityEvent(view, i2);
        } else {
            super.sendAccessibilityEvent(view, i2);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f1477b.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
