package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class dax implements Runnable, ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener, ViewTreeObserver.OnGlobalLayoutListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    final /* synthetic */ day a;

    public dax(day dayVar) {
        this.a = dayVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        day dayVar = this.a;
        dayVar.b = z;
        if (z) {
            dayVar.i();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        day dayVar = this.a;
        if (dayVar.k) {
            dayVar.k = false;
            dbp dbpVar = dayVar.i;
            afdr afdrVar = dayVar.l;
            bwq bwqVar = dbpVar.a;
            if (bwqVar != null) {
                bwqVar.b(afdrVar.invoke());
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        day dayVar = this.a;
        dayVar.q.m();
        dayVar.r.Z();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        day dayVar = this.a;
        dayVar.c = z;
        if (z && dayVar.b) {
            dayVar.i();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        day dayVar = this.a;
        dayVar.q.m();
        dayVar.r.Z();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.a.i.c(z);
    }

    @Override // java.lang.Runnable
    public final void run() {
        day dayVar = this.a;
        Object obj = dayVar.t.a;
        boolean z = false;
        if (dayVar.j <= 0) {
            dayVar.m = false;
            AccessibilityManager accessibilityManager = (AccessibilityManager) obj;
            accessibilityManager.removeAccessibilityStateChangeListener(this);
            accessibilityManager.removeTouchExplorationStateChangeListener(this);
            return;
        }
        dayVar.m = true;
        AccessibilityManager accessibilityManager2 = (AccessibilityManager) obj;
        boolean zIsEnabled = accessibilityManager2.isEnabled();
        dayVar.b = zIsEnabled;
        if (zIsEnabled && accessibilityManager2.isTouchExplorationEnabled()) {
            z = true;
        }
        dayVar.c = z;
        if (dayVar.b) {
            dayVar.i();
        }
        accessibilityManager2.addAccessibilityStateChangeListener(this);
        accessibilityManager2.addTouchExplorationStateChangeListener(this);
    }
}
