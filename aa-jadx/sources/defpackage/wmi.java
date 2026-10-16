package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wmi implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ android.view.View a;
    public final /* synthetic */ defpackage.dsn b;
    private final /* synthetic */ int c;

    public /* synthetic */ wmi(defpackage.dsn dsnVar, android.view.View view, int i) {
        this.c = i;
        this.b = dsnVar;
        this.a = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        if (this.c != 0) {
            if (z) {
                com.google.android.material.behavior.HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (com.google.android.material.behavior.HideBottomViewOnScrollBehavior) this.b;
                if (hideBottomViewOnScrollBehavior.y()) {
                    hideBottomViewOnScrollBehavior.z(this.a);
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            com.google.android.material.behavior.HideViewOnScrollBehavior hideViewOnScrollBehavior = (com.google.android.material.behavior.HideViewOnScrollBehavior) this.b;
            if (hideViewOnScrollBehavior.y()) {
                hideViewOnScrollBehavior.z(this.a);
            }
        }
    }
}
