package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class edf {
    public static final edf a = new edf(null, 1, null, null, null);
    public static final edf b = new edf(null, 2, null, null, null);
    public static final edf c;
    public static final edf d;
    public static final edf e;
    public static final edf f;
    public static final edf g;
    public static final edf h;
    public static final edf i;
    public static final edf j;
    public static final edf k;
    public static final edf l;
    public static final edf m;
    public static final edf n;
    public static final edf o;
    final Object p;
    public final int q;
    public final Class r;
    public final edr s;

    static {
        new edf(null, 4, null, null, null);
        new edf(null, 8, null, null, null);
        c = new edf(null, 16, null, null, null);
        new edf(null, 32, null, null, null);
        d = new edf(null, 64, null, null, null);
        e = new edf(null, 128, null, null, null);
        new edf(null, 256, null, null, edk.class);
        new edf(null, sk.AUDIO_CONTENT_BUFFER_SIZE, null, null, edk.class);
        new edf(null, 1024, null, null, edl.class);
        new edf(null, 2048, null, null, edl.class);
        f = new edf(null, 4096, null, null, null);
        g = new edf(null, 8192, null, null, null);
        new edf(null, 16384, null, null, null);
        new edf(null, 32768, null, null, null);
        new edf(null, 65536, null, null, null);
        new edf(null, 131072, null, null, edp.class);
        h = new edf(null, 262144, null, null, null);
        new edf(null, 524288, null, null, null);
        i = new edf(null, 1048576, null, null, null);
        new edf(null, 2097152, null, null, edq.class);
        new edf(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        j = new edf(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, edn.class);
        k = new edf(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        l = new edf(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        m = new edf(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        n = new edf(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new edf(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new edf(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new edf(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new edf(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new edf(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new edf(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, edo.class);
        new edf(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, edm.class);
        new edf(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new edf(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new edf(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new edf(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new edf(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new edf(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new edf(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new edf(Build.VERSION.SDK_INT >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        o = new edf(Build.VERSION.SDK_INT >= 34 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        int i2 = dvv.a;
        if (Build.VERSION.SDK_INT >= 36) {
            if ((Build.VERSION.SDK_INT < 36 ? Build.VERSION.SDK_INT * 100000 : Build.VERSION.SDK_INT_FULL) >= 3600001) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
            }
        }
        new edf(accessibilityAction, R.id.ALT, null, null, null);
    }

    public edf(Object obj, int i2, CharSequence charSequence, edr edrVar, Class cls) {
        this.q = i2;
        this.s = edrVar;
        this.p = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.r = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.p).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.p).getLabel();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof edf) && this.p.equals(((edf) obj).p);
    }

    public final int hashCode() {
        return this.p.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strF = edg.f(this.q);
        if (strF.equals("ACTION_UNKNOWN") && b() != null) {
            strF = b().toString();
        }
        sb.append(strF);
        return sb.toString();
    }
}
