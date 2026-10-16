package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class dzv extends android.view.View.AccessibilityDelegate {
    final defpackage.dzw a;

    public dzv(defpackage.dzw dzwVar) {
        this.a = dzwVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.a.g(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        defpackage.edq edqVarA = this.a.a(view);
        if (edqVarA != null) {
            return (android.view.accessibility.AccessibilityNodeProvider) edqVarA.b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.a.b(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        edn ednVar = new edn(accessibilityNodeInfo);
        int[] iArr = defpackage.ebt.a;
        java.lang.Boolean bool = (java.lang.Boolean) new ebd(java.lang.Boolean.class).d(view);
        ednVar.L(bool != null && bool.booleanValue());
        java.lang.Boolean bool2 = (java.lang.Boolean) new ebg(java.lang.Boolean.class).d(view);
        ednVar.B(bool2 != null && bool2.booleanValue());
        ednVar.H(defpackage.ebt.f(view));
        ednVar.P((java.lang.CharSequence) new ebf(java.lang.CharSequence.class).d(view));
        this.a.c(view, ednVar);
        accessibilityNodeInfo.getText();
        java.util.List listP = defpackage.dzw.P(view);
        for (int i = 0; i < listP.size(); i++) {
            ednVar.h((defpackage.edm) listP.get(i));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.a.h(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        return this.a.i(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(android.view.View view, int i) {
        this.a.e(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.a.f(view, accessibilityEvent);
    }
}
