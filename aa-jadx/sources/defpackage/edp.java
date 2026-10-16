package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class edp extends defpackage.edo {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str, android.os.Bundle bundle) {
        this.a.c(i, new defpackage.edn(accessibilityNodeInfo), str, bundle);
    }
}
