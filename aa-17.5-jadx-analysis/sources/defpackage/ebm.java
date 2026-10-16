package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.projection.gearhead.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ebm {
    private static WeakHashMap b = null;
    private static Field c = null;
    private static boolean d = false;
    public static final int[] a = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final eba e = new eba();

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ebj.fI(view);
        }
        if (d) {
            return null;
        }
        if (c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                d = true;
                return null;
            }
        }
        Object obj = c.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static dzp b(View view) {
        View.AccessibilityDelegate accessibilityDelegateA = a(view);
        if (accessibilityDelegateA == null) {
            return null;
        }
        return accessibilityDelegateA instanceof dzo ? ((dzo) accessibilityDelegateA).a : new dzp(accessibilityDelegateA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dzw c(View view, dzw dzwVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + dzwVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return ebl.a(view, dzwVar);
        }
        if (((ecx) view.getTag(R.id.tag_on_receive_content_listener)) == null) {
            return view.a(dzwVar);
        }
        dzw dzwVarB = ecx.b(view, dzwVar);
        if (dzwVarB == null) {
            return null;
        }
        return view.a(dzwVarB);
    }

    public static ecy d(View view, ecy ecyVar) {
        WindowInsets windowInsetsE = ecyVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? ebk.a(view, windowInsetsE) : ebc.a(view, windowInsetsE);
            if (!windowInsetsA.equals(windowInsetsE)) {
                return ecy.q(windowInsetsA, view);
            }
        }
        return ecyVar;
    }

    public static ecy e(View view, ecy ecyVar) {
        WindowInsets windowInsetsE = ecyVar.e();
        if (windowInsetsE != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsE);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsE)) {
                return ecy.q(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return ecyVar;
    }

    public static CharSequence f(View view) {
        return (CharSequence) new eax(CharSequence.class).d(view);
    }

    public static List g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void h(View view, edf edfVar) {
        j(view);
        m(edfVar.a(), view);
        g(view).add(edfVar);
        k(view, 0);
    }

    public static void i(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    static void j(View view) {
        dzp dzpVarB = b(view);
        if (dzpVarB == null) {
            dzpVarB = new dzp();
        }
        r(view);
        view.setAccessibilityDelegate(dzpVarB.C);
    }

    public static void k(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = false;
            if (((CharSequence) new eax(CharSequence.class).d(view)) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                int i2 = true != z ? 2048 : 32;
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(i2);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add((CharSequence) new eax(CharSequence.class).d(view));
                    r(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(32);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add((CharSequence) new eax(CharSequence.class).d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void l(View view, int i) {
        m(i, view);
        k(view, 0);
    }

    public static void m(int i, View view) {
        List listG = g(view);
        for (int i2 = 0; i2 < listG.size(); i2++) {
            if (((edf) listG.get(i2)).a() == i) {
                listG.remove(i2);
                return;
            }
        }
    }

    public static void n(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            ebj.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void o(View view, dzp dzpVar) {
        if (dzpVar == null && (a(view) instanceof dzo)) {
            dzpVar = new dzp();
        }
        r(view);
        view.setAccessibilityDelegate(dzpVar == null ? null : dzpVar.C);
    }

    public static void p(View view, boolean z) {
        new eaz(Boolean.class).e(view, Boolean.valueOf(z));
    }

    public static void q(View view, CharSequence charSequence) {
        new eax(CharSequence.class).e(view, charSequence);
        if (charSequence == null) {
            eba ebaVar = e;
            ebaVar.a.remove(view);
            view.removeOnAttachStateChangeListener(ebaVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(ebaVar);
            return;
        }
        eba ebaVar2 = e;
        WeakHashMap weakHashMap = ebaVar2.a;
        boolean z = false;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(ebaVar2);
        if (view.isAttachedToWindow()) {
            ebaVar2.a(view);
        }
    }

    public static void r(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void s(View view, CharSequence charSequence) {
        new eay(CharSequence.class).e(view, charSequence);
    }

    public static String[] t(View view) {
        return Build.VERSION.SDK_INT >= 31 ? ebl.b(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void u(View view, edf edfVar, edr edrVar) {
        if (edrVar == null) {
            l(view, edfVar.a());
        } else {
            h(view, new edf(null, edfVar.q, null, edrVar, edfVar.r));
        }
    }

    @Deprecated
    public static erb v(View view) {
        WeakHashMap weakHashMap = b;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            b = weakHashMap;
        }
        erb erbVar = (erb) weakHashMap.get(view);
        if (erbVar != null) {
            return erbVar;
        }
        erb erbVar2 = new erb(view);
        b.put(view, erbVar2);
        return erbVar2;
    }
}
