package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
final class dzo extends View.AccessibilityDelegate {
    final dzp a;

    public dzo(dzp dzpVar) {
        this.a = dzpVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.g(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        edj edjVarA = this.a.a(view);
        if (edjVarA != null) {
            return (AccessibilityNodeProvider) edjVarA.b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.b(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        edg edgVar = new edg(accessibilityNodeInfo);
        int[] iArr = ebm.a;
        Boolean bool = (Boolean) new eaw(Boolean.class).d(view);
        edgVar.L(bool != null && bool.booleanValue());
        Boolean bool2 = (Boolean) new eaz(Boolean.class).d(view);
        edgVar.B(bool2 != null && bool2.booleanValue());
        edgVar.H(ebm.f(view));
        edgVar.P((CharSequence) new eay(CharSequence.class).d(view));
        this.a.c(view, edgVar);
        accessibilityNodeInfo.getText();
        List listP = dzp.P(view);
        for (int i = 0; i < listP.size(); i++) {
            edgVar.h((edf) listP.get(i));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.h(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.i(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.e(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.f(view, accessibilityEvent);
    }
}
