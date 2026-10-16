package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eer extends defpackage.edq {
    final /* synthetic */ defpackage.ees a;

    public eer(defpackage.ees eesVar) {
        this.a = eesVar;
    }

    @Override // defpackage.edq
    public final defpackage.edn a(int i) {
        return new defpackage.edn(android.view.accessibility.AccessibilityNodeInfo.obtain(this.a.k(i).a));
    }

    @Override // defpackage.edq
    public final defpackage.edn b(int i) {
        defpackage.ees eesVar = this.a;
        int i2 = i == 2 ? eesVar.c : eesVar.d;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.edq
    public final boolean d(int i, int i2, android.os.Bundle bundle) {
        int i3;
        int i4;
        defpackage.ees eesVar = this.a;
        if (i == -1) {
            return eesVar.b.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            android.view.View view = eesVar.b;
            if ((!view.isFocused() && !view.requestFocus()) || (i3 = eesVar.d) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                eesVar.s(i3);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            eesVar.d = i;
            eesVar.q(i, true);
            eesVar.v(i, 8);
            return true;
        }
        if (i2 == 2) {
            return eesVar.s(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? eesVar.u(i, i2) : eesVar.r(i);
        }
        android.view.accessibility.AccessibilityManager accessibilityManager = eesVar.a;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i4 = eesVar.c) == i) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            eesVar.r(i4);
        }
        eesVar.c = i;
        eesVar.b.invalidate();
        eesVar.v(i, 32768);
        return true;
    }
}
