package t1;

import ad.L;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import k1.S;
import l1.C3375e;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4072a extends L {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC4073b f45586c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4072a(AbstractC4073b abstractC4073b) {
        super(13);
        this.f45586c = abstractC4073b;
    }

    @Override // ad.L
    public final C3375e i(int i5) {
        return new C3375e(AccessibilityNodeInfo.obtain(this.f45586c.n(i5).f39862a));
    }

    @Override // ad.L
    public final C3375e k(int i5) {
        AbstractC4073b abstractC4073b = this.f45586c;
        int i10 = i5 == 2 ? abstractC4073b.k : abstractC4073b.f45597l;
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return i(i10);
    }

    @Override // ad.L
    public final boolean t(int i5, int i10, Bundle bundle) {
        int i11;
        AbstractC4073b abstractC4073b = this.f45586c;
        Chip chip = abstractC4073b.f45595i;
        if (i5 == -1) {
            WeakHashMap weakHashMap = S.f38779a;
            return chip.performAccessibilityAction(i10, bundle);
        }
        if (i10 == 1) {
            return abstractC4073b.p(i5);
        }
        if (i10 == 2) {
            return abstractC4073b.j(i5);
        }
        boolean z2 = false;
        if (i10 == 64) {
            AccessibilityManager accessibilityManager = abstractC4073b.f45594h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i11 = abstractC4073b.k) == i5) {
                return false;
            }
            if (i11 != Integer.MIN_VALUE) {
                abstractC4073b.k = Integer.MIN_VALUE;
                abstractC4073b.f45595i.invalidate();
                abstractC4073b.q(i11, 65536);
            }
            abstractC4073b.k = i5;
            chip.invalidate();
            abstractC4073b.q(i5, 32768);
            return true;
        }
        if (i10 == 128) {
            if (abstractC4073b.k != i5) {
                return false;
            }
            abstractC4073b.k = Integer.MIN_VALUE;
            chip.invalidate();
            abstractC4073b.q(i5, 65536);
            return true;
        }
        R7.d dVar = (R7.d) abstractC4073b;
        if (i10 == 16) {
            Chip chip2 = dVar.f10375q;
            if (i5 == 0) {
                return chip2.performClick();
            }
            if (i5 == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f26875h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z2 = true;
                }
                if (chip2.f26885s) {
                    chip2.f26884r.q(1, 1);
                }
            }
        }
        return z2;
    }
}
