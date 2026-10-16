package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ebt {
    private static java.util.WeakHashMap b = null;
    private static java.lang.reflect.Field c = null;
    private static boolean d = false;
    public static final int[] a = {com.google.android.projection.gearhead.R.id.accessibility_custom_action_0, com.google.android.projection.gearhead.R.id.accessibility_custom_action_1, com.google.android.projection.gearhead.R.id.accessibility_custom_action_2, com.google.android.projection.gearhead.R.id.accessibility_custom_action_3, com.google.android.projection.gearhead.R.id.accessibility_custom_action_4, com.google.android.projection.gearhead.R.id.accessibility_custom_action_5, com.google.android.projection.gearhead.R.id.accessibility_custom_action_6, com.google.android.projection.gearhead.R.id.accessibility_custom_action_7, com.google.android.projection.gearhead.R.id.accessibility_custom_action_8, com.google.android.projection.gearhead.R.id.accessibility_custom_action_9, com.google.android.projection.gearhead.R.id.accessibility_custom_action_10, com.google.android.projection.gearhead.R.id.accessibility_custom_action_11, com.google.android.projection.gearhead.R.id.accessibility_custom_action_12, com.google.android.projection.gearhead.R.id.accessibility_custom_action_13, com.google.android.projection.gearhead.R.id.accessibility_custom_action_14, com.google.android.projection.gearhead.R.id.accessibility_custom_action_15, com.google.android.projection.gearhead.R.id.accessibility_custom_action_16, com.google.android.projection.gearhead.R.id.accessibility_custom_action_17, com.google.android.projection.gearhead.R.id.accessibility_custom_action_18, com.google.android.projection.gearhead.R.id.accessibility_custom_action_19, com.google.android.projection.gearhead.R.id.accessibility_custom_action_20, com.google.android.projection.gearhead.R.id.accessibility_custom_action_21, com.google.android.projection.gearhead.R.id.accessibility_custom_action_22, com.google.android.projection.gearhead.R.id.accessibility_custom_action_23, com.google.android.projection.gearhead.R.id.accessibility_custom_action_24, com.google.android.projection.gearhead.R.id.accessibility_custom_action_25, com.google.android.projection.gearhead.R.id.accessibility_custom_action_26, com.google.android.projection.gearhead.R.id.accessibility_custom_action_27, com.google.android.projection.gearhead.R.id.accessibility_custom_action_28, com.google.android.projection.gearhead.R.id.accessibility_custom_action_29, com.google.android.projection.gearhead.R.id.accessibility_custom_action_30, com.google.android.projection.gearhead.R.id.accessibility_custom_action_31};
    private static final defpackage.ebh e = new defpackage.ebh();

    public static android.view.View.AccessibilityDelegate a(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return defpackage.ebq.a(view);
        }
        if (d) {
            return null;
        }
        if (c == null) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAccessibilityDelegate");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.Throwable unused) {
                d = true;
                return null;
            }
        }
        java.lang.Object obj = c.get(view);
        if (obj instanceof android.view.View.AccessibilityDelegate) {
            return (android.view.View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static defpackage.dzw b(android.view.View view) {
        android.view.View.AccessibilityDelegate accessibilityDelegateA = a(view);
        if (accessibilityDelegateA == null) {
            return null;
        }
        return accessibilityDelegateA instanceof defpackage.dzv ? ((defpackage.dzv) accessibilityDelegateA).a : new defpackage.dzw(accessibilityDelegateA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.ead c(android.view.View view, defpackage.ead eadVar) {
        if (android.util.Log.isLoggable("ViewCompat", 3)) {
            android.util.Log.d("ViewCompat", "performReceiveContent: " + eadVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return defpackage.ebs.a(view, eadVar);
        }
        if (((defpackage.dtg) view.getTag(com.google.android.projection.gearhead.R.id.tag_on_receive_content_listener)) == null) {
            return view.a(eadVar);
        }
        defpackage.ead eadVarK = defpackage.dtg.k(view, eadVar);
        if (eadVarK == null) {
            return null;
        }
        return view.a(eadVarK);
    }

    public static defpackage.edf d(android.view.View view, defpackage.edf edfVar) {
        android.view.WindowInsets windowInsetsE = edfVar.e();
        if (windowInsetsE != null) {
            android.view.WindowInsets windowInsetsA = android.os.Build.VERSION.SDK_INT >= 30 ? defpackage.ebr.a(view, windowInsetsE) : defpackage.ebj.c(view, windowInsetsE);
            if (!windowInsetsA.equals(windowInsetsE)) {
                return defpackage.edf.q(windowInsetsA, view);
            }
        }
        return edfVar;
    }

    public static defpackage.edf e(android.view.View view, defpackage.edf edfVar) {
        android.view.WindowInsets windowInsetsE = edfVar.e();
        if (windowInsetsE != null) {
            android.view.WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsE);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsE)) {
                return defpackage.edf.q(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return edfVar;
    }

    public static java.lang.CharSequence f(android.view.View view) {
        return (java.lang.CharSequence) new defpackage.ebe(java.lang.CharSequence.class).d(view);
    }

    public static java.util.List g(android.view.View view) {
        java.util.ArrayList arrayList = (java.util.ArrayList) view.getTag(com.google.android.projection.gearhead.R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        view.setTag(com.google.android.projection.gearhead.R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void h(android.view.View view, defpackage.edm edmVar) {
        j(view);
        v(edmVar.a(), view);
        g(view).add(edmVar);
        k(view, 0);
    }

    public static void i(android.view.ViewGroup viewGroup, android.view.View view) {
        viewGroup.getOverlay().add(view);
        android.view.View view2 = (android.view.View) view.getParent();
        view2.getClass();
        view2.setTag(com.google.android.projection.gearhead.R.id.view_tree_disjoint_parent, viewGroup);
    }

    static void j(android.view.View view) {
        defpackage.dzw dzwVarB = b(view);
        if (dzwVarB == null) {
            dzwVarB = new defpackage.dzw();
        }
        n(view, dzwVarB);
    }

    static void k(android.view.View view, int i) {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = false;
            if (f(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                int i2 = true != z ? 2048 : 32;
                android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(i2);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(f(view));
                    q(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (java.lang.AbstractMethodError e2) {
                        android.util.Log.e("ViewCompat", java.lang.String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            android.view.accessibility.AccessibilityEvent accessibilityEventObtain2 = android.view.accessibility.AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(32);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(f(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void l(android.view.View view, int i) {
        v(i, view);
        k(view, 0);
    }

    public static void m(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            defpackage.ebq.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void n(android.view.View view, defpackage.dzw dzwVar) {
        if (dzwVar == null && (a(view) instanceof defpackage.dzv)) {
            dzwVar = new defpackage.dzw();
        }
        q(view);
        view.setAccessibilityDelegate(dzwVar == null ? null : dzwVar.C);
    }

    public static void o(android.view.View view, boolean z) {
        new defpackage.ebg(java.lang.Boolean.class).e(view, java.lang.Boolean.valueOf(z));
    }

    public static void p(android.view.View view, java.lang.CharSequence charSequence) {
        new defpackage.ebe(java.lang.CharSequence.class).e(view, charSequence);
        if (charSequence == null) {
            defpackage.ebh ebhVar = e;
            ebhVar.a.remove(view);
            view.removeOnAttachStateChangeListener(ebhVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(ebhVar);
            return;
        }
        defpackage.ebh ebhVar2 = e;
        java.util.WeakHashMap weakHashMap = ebhVar2.a;
        boolean z = false;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, java.lang.Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(ebhVar2);
        if (view.isAttachedToWindow()) {
            ebhVar2.a(view);
        }
    }

    public static void q(android.view.View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void r(android.view.View view, java.lang.CharSequence charSequence) {
        new defpackage.ebf(java.lang.CharSequence.class).e(view, charSequence);
    }

    public static java.lang.String[] s(android.view.View view) {
        return android.os.Build.VERSION.SDK_INT >= 31 ? defpackage.ebs.b(view) : (java.lang.String[]) view.getTag(com.google.android.projection.gearhead.R.id.tag_on_receive_content_mime_types);
    }

    public static void t(android.view.View view, defpackage.edm edmVar, defpackage.edy edyVar) {
        if (edyVar == null) {
            l(view, edmVar.a());
        } else {
            h(view, new defpackage.edm(null, edmVar.q, null, edyVar, edmVar.r));
        }
    }

    @java.lang.Deprecated
    public static defpackage.erh u(android.view.View view) {
        java.util.WeakHashMap weakHashMap = b;
        if (weakHashMap == null) {
            weakHashMap = new java.util.WeakHashMap();
            b = weakHashMap;
        }
        defpackage.erh erhVar = (defpackage.erh) weakHashMap.get(view);
        if (erhVar != null) {
            return erhVar;
        }
        defpackage.erh erhVar2 = new defpackage.erh(view);
        b.put(view, erhVar2);
        return erhVar2;
    }

    private static void v(int i, android.view.View view) {
        java.util.List listG = g(view);
        for (int i2 = 0; i2 < listG.size(); i2++) {
            if (((defpackage.edm) listG.get(i2)).a() == i) {
                listG.remove(i2);
                return;
            }
        }
    }
}
