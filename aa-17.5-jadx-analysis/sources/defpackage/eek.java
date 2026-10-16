package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class eek extends dzp {
    private static final Rect e = new Rect(Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager a;
    public final View b;
    private eej j;
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final int[] i = new int[2];
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    private int k = Integer.MIN_VALUE;

    public eek(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.b = view;
        this.a = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    private final AccessibilityEvent w(int i, int i2) {
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            this.b.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
        edg edgVarK = k(i);
        accessibilityEventObtain2.getText().add(edgVarK.e());
        accessibilityEventObtain2.setContentDescription(edgVarK.d());
        accessibilityEventObtain2.setScrollable(edgVarK.aa());
        accessibilityEventObtain2.setPassword(edgVarK.Z());
        accessibilityEventObtain2.setEnabled(edgVarK.W());
        accessibilityEventObtain2.setChecked(edgVarK.a.isChecked());
        n(i, accessibilityEventObtain2);
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(edgVarK.c());
        View view = this.b;
        accessibilityEventObtain2.setSource(view, i);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    private final void x(int i) {
        int i2 = this.k;
        if (i2 == i) {
            return;
        }
        this.k = i;
        v(i, 128);
        v(i2, 256);
    }

    @Override // defpackage.dzp
    public final edj a(View view) {
        eej eejVar = this.j;
        if (eejVar != null) {
            return eejVar;
        }
        eej eejVar2 = new eej(this);
        this.j = eejVar2;
        return eejVar2;
    }

    @Override // defpackage.dzp
    public void c(View view, edg edgVar) {
        super.c(view, edgVar);
        o(edgVar);
    }

    protected abstract int j(float f, float f2);

    final edg k(int i) {
        if (i == -1) {
            View view = this.b;
            edg edgVar = new edg(AccessibilityNodeInfo.obtain(view));
            int[] iArr = ebm.a;
            AccessibilityNodeInfo accessibilityNodeInfo = edgVar.a;
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (accessibilityNodeInfo.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                edgVar.i(view, ((Integer) arrayList.get(i2)).intValue());
            }
            return edgVar;
        }
        edg edgVarB = edg.b();
        edgVarB.x(true);
        edgVarB.z(true);
        edgVarB.r("android.view.View");
        Rect rect = e;
        edgVarB.n(rect);
        edgVarB.o(rect);
        View view2 = this.b;
        edgVarB.I(view2);
        p(i, edgVarB);
        if (edgVarB.e() == null && edgVarB.d() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.g;
        edgVarB.j(rect2);
        Rect rect3 = this.f;
        edgVarB.k(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = edgVarB.a.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        edgVarB.G(view2.getContext().getPackageName());
        edgVarB.O(view2, i);
        if (this.c == i) {
            edgVarB.l(true);
            edgVarB.g(128);
        } else {
            edgVarB.l(false);
            edgVarB.g(64);
        }
        boolean z = this.d == i;
        if (z) {
            edgVarB.g(2);
        } else if (edgVarB.X()) {
            edgVarB.g(1);
        }
        edgVarB.A(z);
        int[] iArr2 = this.i;
        view2.getLocationOnScreen(iArr2);
        if (rect3.equals(rect)) {
            edgVarB.n(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (edgVarB.b != -1) {
                edg edgVarB2 = edg.b();
                Rect rect5 = new Rect();
                for (int i3 = edgVarB.b; i3 != -1; i3 = edgVarB2.b) {
                    edgVarB2.J(view2, -1);
                    edgVarB2.n(rect);
                    p(i3, edgVarB2);
                    edgVarB2.j(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            view2.getLocationOnScreen(iArr2);
            rect4.offset(iArr2[0] - view2.getScrollX(), iArr2[1] - view2.getScrollY());
            edgVarB.o(rect4);
            edgVarB.k(rect3);
        }
        Rect rect6 = this.h;
        if (view2.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr2[0] - view2.getScrollX(), iArr2[1] - view2.getScrollY());
            if (rect3.intersect(rect6)) {
                edgVarB.o(rect3);
                if (rect3 != null && !rect3.isEmpty() && view2.getWindowVisibility() == 0) {
                    Object parent = view2.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view3 = (View) parent;
                            if (view3.getAlpha() <= BitmapDescriptorFactory.HUE_RED || view3.getVisibility() != 0) {
                                break;
                            }
                            parent = view3.getParent();
                        } else if (parent != null) {
                            edgVarB.U(true);
                        }
                    }
                }
            }
        }
        return edgVarB;
    }

    protected abstract void l(List list);

    public final void m(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.a.isEnabled() || (parent = (view = this.b).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventW = w(i, 2048);
        accessibilityEventW.setContentChangeTypes(i2);
        parent.requestSendAccessibilityEvent(view, accessibilityEventW);
    }

    protected abstract void p(int i, edg edgVar);

    public final boolean r(int i) {
        if (this.c != i) {
            return false;
        }
        this.c = Integer.MIN_VALUE;
        this.b.invalidate();
        v(i, 65536);
        return true;
    }

    public final boolean s(int i) {
        if (this.d != i) {
            return false;
        }
        this.d = Integer.MIN_VALUE;
        q(i, false);
        v(i, 8);
        return true;
    }

    public final boolean t(MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.k == Integer.MIN_VALUE) {
                    return false;
                }
                x(Integer.MIN_VALUE);
                return true;
            }
            int iJ = j(motionEvent.getX(), motionEvent.getY());
            x(iJ);
            if (iJ != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean u(int i, int i2);

    public final void v(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.a.isEnabled() || (parent = (view = this.b).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, w(i, i2));
    }

    protected void o(edg edgVar) {
    }

    protected void n(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected void q(int i, boolean z) {
    }
}
