package k1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.wynauto.wyn.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import l1.C3373c;
import l1.C3375e;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3115b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f38799c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f38800a;

    /* renamed from: b, reason: collision with root package name */
    public final C3114a f38801b;

    public C3115b() {
        this(f38799c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f38800a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public ad.L b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f38800a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new ad.L(accessibilityNodeProvider, 13);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f38800a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, C3375e c3375e) {
        this.f38800a.onInitializeAccessibilityNodeInfo(view, c3375e.f39862a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f38800a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f38800a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i5, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z2 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                break;
            }
            C3373c c3373c = (C3373c) list.get(i10);
            if (c3373c.a() == i5) {
                l1.o oVar = c3373c.f39860d;
                if (oVar != null) {
                    Class cls = c3373c.f39859c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e7) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e7);
                        }
                    }
                    zPerformAccessibilityAction = oVar.l(view);
                }
            } else {
                i10++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f38800a.performAccessibilityAction(view, i5, bundle);
        }
        if (zPerformAccessibilityAction || i5 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i12 = 0;
            while (true) {
                if (clickableSpanArr == null || i12 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i12])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i12++;
            }
        }
        return z2;
    }

    public void h(View view, int i5) {
        this.f38800a.sendAccessibilityEvent(view, i5);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f38800a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C3115b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f38800a = accessibilityDelegate;
        this.f38801b = new C3114a(this);
    }
}
