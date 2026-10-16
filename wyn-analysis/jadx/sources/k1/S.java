package k1;

import Yf.AbstractC1300f;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.wynauto.wyn.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l1.C3373c;
import n1.C3575i;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f38779a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f38780b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f38781c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f38782d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final E f38783e = new E();

    /* renamed from: f, reason: collision with root package name */
    public static final G f38784f = new G();

    public static X a(View view) {
        if (f38779a == null) {
            f38779a = new WeakHashMap();
        }
        X x5 = (X) f38779a.get(view);
        if (x5 != null) {
            return x5;
        }
        X x10 = new X(view);
        f38779a.put(view, x10);
        return x10;
    }

    public static void b(View view, v0 v0Var) {
        int i5 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsF = v0Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = i5 >= 30 ? O.a(view, windowInsetsF) : H.a(view, windowInsetsF);
            if (windowInsetsA.equals(windowInsetsF)) {
                return;
            }
            v0.g(view, windowInsetsA);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = Q.f38775d;
        Q q4 = (Q) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (q4 == null) {
            q4 = new Q();
            q4.f38776a = null;
            q4.f38777b = null;
            q4.f38778c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, q4);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = q4.f38776a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = Q.f38775d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (q4.f38776a == null) {
                            q4.f38776a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = Q.f38775d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                q4.f38776a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    q4.f38776a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = q4.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (q4.f38777b == null) {
                    q4.f38777b = new SparseArray();
                }
                q4.f38777b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return N.a(view);
        }
        if (f38781c) {
            return null;
        }
        if (f38780b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f38780b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f38781c = true;
                return null;
            }
        }
        try {
            Object obj = f38780b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f38781c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = M.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(q.r rVar) {
        return Build.VERSION.SDK_INT >= 31 ? P.a(rVar) : (String[]) rVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(int i5, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i5);
                if (z2) {
                    accessibilityEventObtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i5 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i5);
                        return;
                    } catch (AbstractMethodError e7) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e7);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i5);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C3119f i(View view, C3119f c3119f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c3119f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return P.b(view, c3119f);
        }
        C3575i c3575i = (C3575i) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC3131s interfaceC3131s = f38783e;
        if (c3575i == null) {
            if (view instanceof InterfaceC3131s) {
                interfaceC3131s = (InterfaceC3131s) view;
            }
            return interfaceC3131s.a(c3119f);
        }
        C3119f c3119fA = C3575i.a(view, c3119f);
        if (c3119fA == null) {
            return null;
        }
        if (view instanceof InterfaceC3131s) {
            interfaceC3131s = (InterfaceC3131s) view;
        }
        return interfaceC3131s.a(c3119fA);
    }

    public static void j(int i5, View view) {
        ArrayList arrayListF = f(view);
        for (int i10 = 0; i10 < arrayListF.size(); i10++) {
            if (((C3373c) arrayListF.get(i10)).a() == i5) {
                arrayListF.remove(i10);
                return;
            }
        }
    }

    public static void k(View view, C3373c c3373c, l1.o oVar) {
        C3373c c3373c2 = new C3373c(null, c3373c.f39858b, null, oVar, c3373c.f39859c);
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        C3115b c3115b = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof C3114a ? ((C3114a) accessibilityDelegateD).f38796a : new C3115b(accessibilityDelegateD);
        if (c3115b == null) {
            c3115b = new C3115b();
        }
        m(view, c3115b);
        j(c3373c2.a(), view);
        f(view).add(c3373c2);
        h(0, view);
    }

    public static void l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            N.b(view, context, iArr, attributeSet, typedArray, i5, 0);
        }
    }

    public static void m(View view, C3115b c3115b) {
        if (c3115b == null && (d(view) instanceof C3114a)) {
            c3115b = new C3115b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c3115b == null ? null : c3115b.f38801b);
    }

    public static void n(View view, CharSequence charSequence) {
        new F(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        G g9 = f38784f;
        if (charSequence == null) {
            g9.f38771a.remove(view);
            view.removeOnAttachStateChangeListener(g9);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(g9);
        } else {
            g9.f38771a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(g9);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(g9);
            }
        }
    }

    public static void o(View view, AbstractC1300f abstractC1300f) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC1300f != null ? new d0(abstractC1300f) : null);
            return;
        }
        PathInterpolator pathInterpolator = b0.f38802e;
        View.OnApplyWindowInsetsListener a0Var = abstractC1300f != null ? new a0(view, abstractC1300f) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, a0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(a0Var);
        }
    }
}
