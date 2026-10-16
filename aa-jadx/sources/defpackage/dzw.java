package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class dzw {
    private static final android.view.View.AccessibilityDelegate a = new android.view.View.AccessibilityDelegate();
    public final android.view.View.AccessibilityDelegate C;
    private final android.view.View.AccessibilityDelegate b;

    public dzw(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.b = accessibilityDelegate;
        this.C = new defpackage.dzv(this);
    }

    static java.util.List P(android.view.View view) {
        java.util.List list = (java.util.List) view.getTag(com.google.android.projection.gearhead.R.id.tag_accessibility_actions);
        return list == null ? java.util.Collections.EMPTY_LIST : list;
    }

    public defpackage.edq a(android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider = this.b.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new defpackage.edq(accessibilityNodeProvider);
        }
        return null;
    }

    public void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(android.view.View view, defpackage.edn ednVar) {
        this.b.onInitializeAccessibilityNodeInfo(view, ednVar.a);
    }

    public void d(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void e(android.view.View view, int i) {
        this.b.sendAccessibilityEvent(view, i);
    }

    public void f(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean g(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean h(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        boolean zPerformAccessibilityAction;
        java.lang.ref.WeakReference weakReference;
        android.text.style.ClickableSpan clickableSpan;
        java.util.List listP = P(view);
        int i2 = 0;
        while (true) {
            if (i2 < listP.size()) {
                defpackage.edm edmVar = (defpackage.edm) listP.get(i2);
                if (edmVar.a() == i) {
                    if (edmVar.s != null) {
                        java.lang.Class cls = edmVar.r;
                        if (cls != null) {
                            try {
                            } catch (java.lang.Exception e) {
                                java.lang.Class cls2 = edmVar.r;
                                android.util.Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(java.lang.String.valueOf(cls2 == null ? "null" : cls2.getName())), e);
                            }
                        }
                        zPerformAccessibilityAction = edmVar.s.a(view);
                        break;
                    }
                } else {
                    i2++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.b.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != com.google.android.projection.gearhead.R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(com.google.android.projection.gearhead.R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (java.lang.ref.WeakReference) sparseArray.get(i3)) == null || (clickableSpan = (android.text.style.ClickableSpan) weakReference.get()) == null) {
            return false;
        }
        java.lang.CharSequence text = view.createAccessibilityNodeInfo().getText();
        android.text.style.ClickableSpan[] clickableSpanArr = text instanceof android.text.Spanned ? (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(0, text.length(), android.text.style.ClickableSpan.class) : null;
        for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
            if (clickableSpan.equals(clickableSpanArr[i4])) {
                clickableSpan.onClick(view);
                return true;
            }
        }
        return false;
    }

    public dzw() {
        this(a);
    }
}
