package l1;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.moloco.sdk.internal.publisher.H;
import java.util.WeakHashMap;
import k1.S;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC3372b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final com.unity3d.services.core.webview.b f39847a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC3372b(com.unity3d.services.core.webview.b bVar) {
        this.f39847a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC3372b) {
            return this.f39847a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC3372b) obj).f39847a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39847a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        f8.j jVar = (f8.j) this.f39847a.f32729b;
        AutoCompleteTextView autoCompleteTextView = jVar.f35143h;
        if (autoCompleteTextView == null || H.a0(autoCompleteTextView)) {
            return;
        }
        int i5 = z2 ? 2 : 1;
        WeakHashMap weakHashMap = S.f38779a;
        jVar.f35179d.setImportantForAccessibility(i5);
    }
}
