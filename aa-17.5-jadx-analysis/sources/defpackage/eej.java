package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes2.dex */
final class eej extends edj {
    final /* synthetic */ eek a;

    public eej(eek eekVar) {
        this.a = eekVar;
    }

    @Override // defpackage.edj
    public final edg a(int i) {
        return new edg(AccessibilityNodeInfo.obtain(this.a.k(i).a));
    }

    @Override // defpackage.edj
    public final edg b(int i) {
        eek eekVar = this.a;
        int i2 = i == 2 ? eekVar.c : eekVar.d;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.edj
    public final boolean d(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        eek eekVar = this.a;
        if (i == -1) {
            return eekVar.b.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            View view = eekVar.b;
            if ((!view.isFocused() && !view.requestFocus()) || (i3 = eekVar.d) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                eekVar.s(i3);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            eekVar.d = i;
            eekVar.q(i, true);
            eekVar.v(i, 8);
            return true;
        }
        if (i2 == 2) {
            return eekVar.s(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? eekVar.u(i, i2) : eekVar.r(i);
        }
        AccessibilityManager accessibilityManager = eekVar.a;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i4 = eekVar.c) == i) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            eekVar.r(i4);
        }
        eekVar.c = i;
        eekVar.b.invalidate();
        eekVar.v(i, 32768);
        return true;
    }
}
