package io.flutter.view;

import a2.C1323c;
import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;
import me.C3558a;

/* loaded from: classes5.dex */
public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f37190a;

    public b(l lVar) {
        this.f37190a = lVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z2) {
        l lVar = this.f37190a;
        if (lVar.f37298u) {
            return;
        }
        boolean z10 = false;
        C3558a c3558a = lVar.f37280b;
        if (z2) {
            a aVar = lVar.f37299v;
            c3558a.f40738c = aVar;
            ((FlutterJNI) c3558a.f40737b).setAccessibilityDelegate(aVar);
            ((FlutterJNI) c3558a.f40737b).setSemanticsEnabled(true);
        } else {
            lVar.i(false);
            c3558a.f40738c = null;
            ((FlutterJNI) c3558a.f40737b).setAccessibilityDelegate(null);
            ((FlutterJNI) c3558a.f40737b).setSemanticsEnabled(false);
        }
        C1323c c1323c = lVar.f37296s;
        if (c1323c != null) {
            boolean zIsTouchExplorationEnabled = lVar.f37281c.isTouchExplorationEnabled();
            kc.r rVar = (kc.r) c1323c.f17156b;
            if (rVar.f39521h.f40252b.f37008a.getIsSoftwareRenderingEnabled()) {
                rVar.setWillNotDraw(false);
                return;
            }
            if (!z2 && !zIsTouchExplorationEnabled) {
                z10 = true;
            }
            rVar.setWillNotDraw(z10);
        }
    }
}
