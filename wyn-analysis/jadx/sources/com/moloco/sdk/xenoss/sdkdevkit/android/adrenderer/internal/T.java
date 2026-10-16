package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.wynauto.wyn.R;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC3340k;
import l1.AccessibilityManagerTouchExplorationStateChangeListenerC3372b;
import p.ViewOnKeyListenerC3748C;
import p.ViewOnKeyListenerC3754e;
import u0.AbstractC4162a;
import u0.C4195s;

/* loaded from: classes4.dex */
public final class T implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30037b;

    public /* synthetic */ T(Object obj, int i5) {
        this.f30036a = i5;
        this.f30037b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View p02) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f30037b;
        switch (this.f30036a) {
            case 0:
                AbstractC3340k.e(p02, "p0");
                ((Gf.s) ((Gf.t) obj)).c(Boolean.TRUE);
                break;
            case 1:
                f8.m mVar = (f8.m) obj;
                if (mVar.f35174u != null && (accessibilityManager = mVar.f35173t) != null) {
                    WeakHashMap weakHashMap = k1.S.f38779a;
                    if (mVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC3372b(mVar.f35174u));
                        break;
                    }
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
                AbstractC3340k.e(p02, "view");
                break;
            case 5:
                AbstractC3340k.e(p02, "v");
                break;
            default:
                AbstractC3340k.e(p02, "v");
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View p02) {
        AccessibilityManager accessibilityManager;
        boolean z2;
        switch (this.f30036a) {
            case 0:
                AbstractC3340k.e(p02, "p0");
                ((Gf.s) ((Gf.t) this.f30037b)).c(Boolean.FALSE);
                break;
            case 1:
                f8.m mVar = (f8.m) this.f30037b;
                com.unity3d.services.core.webview.b bVar = mVar.f35174u;
                if (bVar != null && (accessibilityManager = mVar.f35173t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC3372b(bVar));
                    break;
                }
                break;
            case 2:
                ViewOnKeyListenerC3754e viewOnKeyListenerC3754e = (ViewOnKeyListenerC3754e) this.f30037b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC3754e.f43021x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC3754e.f43021x = p02.getViewTreeObserver();
                    }
                    viewOnKeyListenerC3754e.f43021x.removeGlobalOnLayoutListener(viewOnKeyListenerC3754e.f43007i);
                }
                p02.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                ViewOnKeyListenerC3748C viewOnKeyListenerC3748C = (ViewOnKeyListenerC3748C) this.f30037b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC3748C.f42973o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC3748C.f42973o = p02.getViewTreeObserver();
                    }
                    viewOnKeyListenerC3748C.f42973o.removeGlobalOnLayoutListener(viewOnKeyListenerC3748C.f42968i);
                }
                p02.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                AbstractC3340k.e(p02, "view");
                C4195s c4195s = (C4195s) this.f30037b;
                c4195s.f46341g.removeCallbacks(c4195s.f46356w);
                break;
            case 5:
                AbstractC3340k.e(p02, "v");
                AbstractC4162a abstractC4162a = (AbstractC4162a) this.f30037b;
                Iterator it = Af.n.a0(abstractC4162a.getParent(), k1.V.f38787a).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view = (View) obj;
                            AbstractC3340k.e(view, "<this>");
                            Object tag = view.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z2 = true;
                            }
                        }
                    }
                }
                if (!z2) {
                    u0.M0 m02 = abstractC4162a.f46181c;
                    if (m02 != null) {
                        m02.dispose();
                    }
                    abstractC4162a.f46181c = null;
                    abstractC4162a.requestLayout();
                    break;
                }
                break;
            default:
                AbstractC3340k.e(p02, "v");
                p02.removeOnAttachStateChangeListener(this);
                ((Ef.H0) this.f30037b).cancel(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
