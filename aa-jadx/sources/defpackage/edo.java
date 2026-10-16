package defpackage;

/* JADX INFO: loaded from: classes.dex */
class edo extends android.view.accessibility.AccessibilityNodeProvider {
    final defpackage.edq a;

    public edo(defpackage.edq edqVar) {
        this.a = edqVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        defpackage.edn ednVarA = this.a.a(i);
        if (ednVarA == null) {
            return null;
        }
        return ednVarA.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final java.util.List findAccessibilityNodeInfosByText(java.lang.String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final android.view.accessibility.AccessibilityNodeInfo findFocus(int i) {
        defpackage.edn ednVarB = this.a.b(i);
        if (ednVarB == null) {
            return null;
        }
        return ednVarB.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, android.os.Bundle bundle) {
        return this.a.d(i, i2, bundle);
    }
}
