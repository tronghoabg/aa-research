package t1;

import ad.C1355I;
import ad.L;
import ad.r;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.api.f;
import com.google.android.material.chip.Chip;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.C3115b;
import k1.S;
import l1.C3375e;

/* renamed from: t1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4073b extends C3115b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f45587n = new Rect(f.API_PRIORITY_OTHER, f.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final r f45588o = new r();

    /* renamed from: p, reason: collision with root package name */
    public static final C1355I f45589p = new C1355I(13);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f45594h;

    /* renamed from: i, reason: collision with root package name */
    public final Chip f45595i;

    /* renamed from: j, reason: collision with root package name */
    public C4072a f45596j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f45590d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f45591e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f45592f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f45593g = new int[2];
    public int k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f45597l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f45598m = Integer.MIN_VALUE;

    public AbstractC4073b(Chip chip) {
        this.f45595i = chip;
        this.f45594h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = S.f38779a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // k1.C3115b
    public final L b(View view) {
        if (this.f45596j == null) {
            this.f45596j = new C4072a(this);
        }
        return this.f45596j;
    }

    @Override // k1.C3115b
    public final void d(View view, C3375e c3375e) {
        View.AccessibilityDelegate accessibilityDelegate = this.f38800a;
        AccessibilityNodeInfo accessibilityNodeInfo = c3375e.f39862a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((R7.d) this).f10375q;
        R7.f fVar = chip.f26872e;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f10397Q);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c3375e.j(chip.getAccessibilityClassName());
        c3375e.n(chip.getText());
    }

    public final boolean j(int i5) {
        if (this.f45597l != i5) {
            return false;
        }
        this.f45597l = Integer.MIN_VALUE;
        R7.d dVar = (R7.d) this;
        if (i5 == 1) {
            Chip chip = dVar.f10375q;
            chip.f26879m = false;
            chip.refreshDrawableState();
        }
        q(i5, 8);
        return true;
    }

    public final C3375e k(int i5) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C3375e c3375e = new C3375e(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c3375e.j("android.view.View");
        Rect rect = f45587n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        c3375e.f39863b = -1;
        Chip chip = this.f45595i;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i5, c3375e);
        if (c3375e.h() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f45591e;
        c3375e.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c3375e.f39864c = i5;
        accessibilityNodeInfoObtain.setSource(chip, i5);
        if (this.k == i5) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c3375e.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c3375e.a(64);
        }
        boolean z2 = this.f45597l == i5;
        if (z2) {
            c3375e.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c3375e.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z2);
        int[] iArr = this.f45593g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f45590d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c3375e.f(rect3);
            if (c3375e.f39863b != -1) {
                C3375e c3375e2 = new C3375e(AccessibilityNodeInfo.obtain());
                for (int i10 = c3375e.f39863b; i10 != -1; i10 = c3375e2.f39863b) {
                    c3375e2.f39863b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = c3375e2.f39862a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i10, c3375e2);
                    c3375e2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f45592f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = c3375e.f39862a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c3375e;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.AbstractC4073b.m(int, android.graphics.Rect):boolean");
    }

    public final C3375e n(int i5) {
        if (i5 != -1) {
            return k(i5);
        }
        Chip chip = this.f45595i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C3375e c3375e = new C3375e(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = S.f38779a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c3375e.f39862a.addChild(chip, ((Integer) arrayList.get(i10)).intValue());
        }
        return c3375e;
    }

    public abstract void o(int i5, C3375e c3375e);

    public final boolean p(int i5) {
        int i10;
        Chip chip = this.f45595i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i10 = this.f45597l) == i5) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            j(i10);
        }
        if (i5 == Integer.MIN_VALUE) {
            return false;
        }
        this.f45597l = i5;
        R7.d dVar = (R7.d) this;
        if (i5 == 1) {
            Chip chip2 = dVar.f10375q;
            chip2.f26879m = true;
            chip2.refreshDrawableState();
        }
        q(i5, 8);
        return true;
    }

    public final void q(int i5, int i10) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i5 == Integer.MIN_VALUE || !this.f45594h.isEnabled() || (parent = (view = this.f45595i).getParent()) == null) {
            return;
        }
        if (i5 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            C3375e c3375eN = n(i5);
            accessibilityEventObtain.getText().add(c3375eN.h());
            AccessibilityNodeInfo accessibilityNodeInfo = c3375eN.f39862a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i5);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i10);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
