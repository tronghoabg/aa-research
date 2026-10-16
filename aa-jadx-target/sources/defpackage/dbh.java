package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dbh implements java.lang.Runnable, android.content.ComponentCallbacks2, android.view.ViewTreeObserver.OnWindowFocusChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    final /* synthetic */ defpackage.dbi a;

    public dbh(defpackage.dbi dbiVar) {
        this.a = dbiVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        defpackage.dbi dbiVar = this.a;
        dbiVar.b = z;
        if (z) {
            dbiVar.i();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.a.h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        defpackage.dbi dbiVar = this.a;
        if (dbiVar.k) {
            dbiVar.k = false;
            defpackage.dbx dbxVar = dbiVar.i;
            defpackage.afer aferVar = dbiVar.l;
            defpackage.bwx bwxVar = dbxVar.a;
            if (bwxVar != null) {
                bwxVar.b(aferVar.invoke());
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        defpackage.dbi dbiVar = this.a;
        dbiVar.q.J();
        dbiVar.r.A();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        defpackage.dbi dbiVar = this.a;
        dbiVar.c = z;
        if (z && dbiVar.b) {
            dbiVar.i();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        defpackage.dbi dbiVar = this.a;
        dbiVar.q.J();
        dbiVar.r.A();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.a.i.c(z);
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.dbi dbiVar = this.a;
        java.lang.Object obj = dbiVar.t.a;
        boolean z = false;
        if (dbiVar.j <= 0) {
            dbiVar.m = false;
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) obj;
            accessibilityManager.removeAccessibilityStateChangeListener(this);
            accessibilityManager.removeTouchExplorationStateChangeListener(this);
            return;
        }
        dbiVar.m = true;
        android.view.accessibility.AccessibilityManager accessibilityManager2 = (android.view.accessibility.AccessibilityManager) obj;
        boolean zIsEnabled = accessibilityManager2.isEnabled();
        dbiVar.b = zIsEnabled;
        if (zIsEnabled && accessibilityManager2.isTouchExplorationEnabled()) {
            z = true;
        }
        dbiVar.c = z;
        if (dbiVar.b) {
            dbiVar.i();
        }
        accessibilityManager2.addAccessibilityStateChangeListener(this);
        accessibilityManager2.addTouchExplorationStateChangeListener(this);
    }
}
