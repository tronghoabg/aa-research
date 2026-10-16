package android.support.v7.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class fg extends AccessibilityDelegateCompat {
    private final ff mItemDelegate;
    final RecyclerView mRecyclerView;

    public fg(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        AccessibilityDelegateCompat itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof ff)) {
            this.mItemDelegate = new ff(this);
        } else {
            this.mItemDelegate = (ff) itemDelegate;
        }
    }

    public AccessibilityDelegateCompat getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        en enVar;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || shouldIgnore() || (enVar = ((RecyclerView) view).n) == null) {
            return;
        }
        enVar.Y(accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        en enVar;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (shouldIgnore() || (enVar = this.mRecyclerView.n) == null) {
            return;
        }
        RecyclerView recyclerView = enVar.s;
        enVar.o(recyclerView.f937d, recyclerView.E, accessibilityNodeInfoCompat);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        en enVar;
        if (super.performAccessibilityAction(view, i2, bundle)) {
            return true;
        }
        if (shouldIgnore() || (enVar = this.mRecyclerView.n) == null) {
            return false;
        }
        return enVar.x(i2, bundle);
    }

    boolean shouldIgnore() {
        return this.mRecyclerView.au();
    }
}
