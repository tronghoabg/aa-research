package androidx.preference;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.eb;
import android.support.v7.widget.fg;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public class PreferenceRecyclerViewAccessibilityDelegate extends fg {
    final AccessibilityDelegateCompat mDefaultItemDelegate;
    final AccessibilityDelegateCompat mItemDelegate;
    final RecyclerView mRecyclerView;

    public PreferenceRecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        super(recyclerView);
        this.mDefaultItemDelegate = super.getItemDelegate();
        this.mItemDelegate = new AccessibilityDelegateCompat() { // from class: androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                Preference item;
                PreferenceRecyclerViewAccessibilityDelegate.this.mDefaultItemDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                int iE = PreferenceRecyclerViewAccessibilityDelegate.this.mRecyclerView.e(view);
                eb ebVarJ = PreferenceRecyclerViewAccessibilityDelegate.this.mRecyclerView.j();
                if ((ebVarJ instanceof PreferenceGroupAdapter) && (item = ((PreferenceGroupAdapter) ebVarJ).getItem(iE)) != null) {
                    item.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
                return PreferenceRecyclerViewAccessibilityDelegate.this.mDefaultItemDelegate.performAccessibilityAction(view, i2, bundle);
            }
        };
        this.mRecyclerView = recyclerView;
    }

    @Override // android.support.v7.widget.fg
    public AccessibilityDelegateCompat getItemDelegate() {
        return this.mItemDelegate;
    }
}
