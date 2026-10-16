package io.flutter.view;

import a2.C1323c;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes5.dex */
public final class d implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f37193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f37194b;

    public d(l lVar, AccessibilityManager accessibilityManager) {
        this.f37194b = lVar;
        this.f37193a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        l lVar = this.f37194b;
        if (lVar.f37298u) {
            return;
        }
        boolean z10 = false;
        if (!z2) {
            lVar.i(false);
            h hVar = lVar.f37292o;
            if (hVar != null) {
                lVar.g(hVar.f37250b, 256);
                lVar.f37292o = null;
            }
        }
        C1323c c1323c = lVar.f37296s;
        if (c1323c != null) {
            boolean zIsEnabled = this.f37193a.isEnabled();
            kc.r rVar = (kc.r) c1323c.f17156b;
            if (rVar.f39521h.f40252b.f37008a.getIsSoftwareRenderingEnabled()) {
                rVar.setWillNotDraw(false);
                return;
            }
            if (!zIsEnabled && !z2) {
                z10 = true;
            }
            rVar.setWillNotDraw(z10);
        }
    }
}
