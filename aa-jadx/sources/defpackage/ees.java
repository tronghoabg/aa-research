package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ees extends defpackage.dzw {
    private static final android.graphics.Rect e = new android.graphics.Rect(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final android.view.accessibility.AccessibilityManager a;
    public final android.view.View b;
    private defpackage.eer j;
    private final android.graphics.Rect f = new android.graphics.Rect();
    private final android.graphics.Rect g = new android.graphics.Rect();
    private final android.graphics.Rect h = new android.graphics.Rect();
    private final int[] i = new int[2];
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    private int k = Integer.MIN_VALUE;

    public ees(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("View may not be null");
        }
        this.b = view;
        this.a = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    private final android.view.accessibility.AccessibilityEvent w(int i, int i2) {
        if (i == -1) {
            android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain(i2);
            this.b.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        android.view.accessibility.AccessibilityEvent accessibilityEventObtain2 = android.view.accessibility.AccessibilityEvent.obtain(i2);
        defpackage.edn ednVarK = k(i);
        accessibilityEventObtain2.getText().add(ednVarK.e());
        accessibilityEventObtain2.setContentDescription(ednVarK.d());
        accessibilityEventObtain2.setScrollable(ednVarK.aa());
        accessibilityEventObtain2.setPassword(ednVarK.Z());
        accessibilityEventObtain2.setEnabled(ednVarK.W());
        accessibilityEventObtain2.setChecked(ednVarK.a.isChecked());
        n(i, accessibilityEventObtain2);
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(ednVarK.c());
        android.view.View view = this.b;
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

    @Override // defpackage.dzw
    public final defpackage.edq a(android.view.View view) {
        defpackage.eer eerVar = this.j;
        if (eerVar != null) {
            return eerVar;
        }
        defpackage.eer eerVar2 = new defpackage.eer(this);
        this.j = eerVar2;
        return eerVar2;
    }

    @Override // defpackage.dzw
    public void c(android.view.View view, defpackage.edn ednVar) {
        super.c(view, ednVar);
        o(ednVar);
    }

    protected abstract int j(float f, float f2);

    final defpackage.edn k(int i) {
        if (i == -1) {
            android.view.View view = this.b;
            defpackage.edn ednVar = new defpackage.edn(android.view.accessibility.AccessibilityNodeInfo.obtain(view));
            int[] iArr = defpackage.ebt.a;
            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = ednVar.a;
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            l(arrayList);
            if (accessibilityNodeInfo.getChildCount() > 0 && arrayList.size() > 0) {
                throw new java.lang.RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ednVar.i(view, ((java.lang.Integer) arrayList.get(i2)).intValue());
            }
            return ednVar;
        }
        defpackage.edn ednVarB = defpackage.edn.b();
        ednVarB.x(true);
        ednVarB.z(true);
        ednVarB.r("android.view.View");
        android.graphics.Rect rect = e;
        ednVarB.n(rect);
        ednVarB.o(rect);
        android.view.View view2 = this.b;
        ednVarB.I(view2);
        p(i, ednVarB);
        if (ednVarB.e() == null && ednVarB.d() == null) {
            throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        android.graphics.Rect rect2 = this.g;
        ednVarB.j(rect2);
        android.graphics.Rect rect3 = this.f;
        ednVarB.k(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            throw new java.lang.RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = ednVarB.a.getActions();
        if ((actions & 64) != 0) {
            throw new java.lang.RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new java.lang.RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        ednVarB.G(view2.getContext().getPackageName());
        ednVarB.O(view2, i);
        if (this.c == i) {
            ednVarB.l(true);
            ednVarB.g(128);
        } else {
            ednVarB.l(false);
            ednVarB.g(64);
        }
        boolean z = this.d == i;
        if (z) {
            ednVarB.g(2);
        } else if (ednVarB.X()) {
            ednVarB.g(1);
        }
        ednVarB.A(z);
        int[] iArr2 = this.i;
        view2.getLocationOnScreen(iArr2);
        if (rect3.equals(rect)) {
            ednVarB.n(rect2);
            android.graphics.Rect rect4 = new android.graphics.Rect();
            rect4.set(rect2);
            if (ednVarB.b != -1) {
                defpackage.edn ednVarB2 = defpackage.edn.b();
                android.graphics.Rect rect5 = new android.graphics.Rect();
                for (int i3 = ednVarB.b; i3 != -1; i3 = ednVarB2.b) {
                    ednVarB2.J(view2, -1);
                    ednVarB2.n(rect);
                    p(i3, ednVarB2);
                    ednVarB2.j(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            view2.getLocationOnScreen(iArr2);
            rect4.offset(iArr2[0] - view2.getScrollX(), iArr2[1] - view2.getScrollY());
            ednVarB.o(rect4);
            ednVarB.k(rect3);
        }
        android.graphics.Rect rect6 = this.h;
        if (view2.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr2[0] - view2.getScrollX(), iArr2[1] - view2.getScrollY());
            if (rect3.intersect(rect6)) {
                ednVarB.o(rect3);
                if (rect3 != null && !rect3.isEmpty() && view2.getWindowVisibility() == 0) {
                    java.lang.Object parent = view2.getParent();
                    while (parent instanceof android.view.View) {
                        android.view.View view3 = (android.view.View) parent;
                        if (view3.getAlpha() > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && view3.getVisibility() == 0) {
                            parent = view3.getParent();
                        }
                    }
                    if (parent != null) {
                        ednVarB.U(true);
                    }
                }
            }
        }
        return ednVarB;
    }

    protected abstract void l(java.util.List list);

    public final void m(int i, int i2) {
        android.view.View view;
        android.view.ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.a.isEnabled() || (parent = (view = this.b).getParent()) == null) {
            return;
        }
        android.view.accessibility.AccessibilityEvent accessibilityEventW = w(i, 2048);
        accessibilityEventW.setContentChangeTypes(i2);
        parent.requestSendAccessibilityEvent(view, accessibilityEventW);
    }

    protected abstract void p(int i, defpackage.edn ednVar);

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

    public final boolean t(android.view.MotionEvent motionEvent) {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.a;
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
        android.view.View view;
        android.view.ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.a.isEnabled() || (parent = (view = this.b).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, w(i, i2));
    }

    protected void o(defpackage.edn ednVar) {
    }

    protected void n(int i, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
    }

    protected void q(int i, boolean z) {
    }
}
