package defpackage;

import android.graphics.PointF;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class ls extends mb {
    private lq c;
    private lq d;

    private final lq h(lz lzVar) {
        lq lqVar = this.d;
        if (lqVar == null || lqVar.a != lzVar) {
            this.d = new lo(lzVar);
        }
        return this.d;
    }

    private final lq i(lz lzVar) {
        lq lqVar = this.c;
        if (lqVar == null || lqVar.a != lzVar) {
            this.c = new lp(lzVar);
        }
        return this.c;
    }

    private static final int j(View view, lq lqVar) {
        return (lqVar.d(view) + (lqVar.b(view) / 2)) - (lqVar.j() + (lqVar.k() / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mb
    public final int a(lz lzVar, int i, int i2) {
        PointF pointFO;
        int iAx = lzVar.ax();
        if (iAx != 0) {
            View view = null;
            lq lqVarI = lzVar.ah() ? i(lzVar) : lzVar.ag() ? h(lzVar) : null;
            if (lqVarI != null) {
                int iAv = lzVar.av();
                boolean z = false;
                int i3 = Integer.MIN_VALUE;
                int i4 = Integer.MAX_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < iAv; i5++) {
                    View viewAD = lzVar.aD(i5);
                    if (viewAD != null) {
                        int iJ = j(viewAD, lqVarI);
                        if (iJ <= 0 && iJ > i3) {
                            view2 = viewAD;
                            i3 = iJ;
                        }
                        if (iJ >= 0 && iJ < i4) {
                            view = viewAD;
                            i4 = iJ;
                        }
                    }
                }
                if (true != lzVar.ag()) {
                    i = i2;
                }
                boolean z2 = i > 0;
                if (z2 && view != null) {
                    return lz.bl(view);
                }
                if (!z2 && view2 != null) {
                    return lz.bl(view2);
                }
                if (true == z2) {
                    view = view2;
                }
                if (view != null) {
                    int iBl = lz.bl(view);
                    int iAx2 = lzVar.ax();
                    if ((lzVar instanceof mj) && (pointFO = ((mj) lzVar).O(iAx2 - 1)) != null && (pointFO.x < BitmapDescriptorFactory.HUE_RED || pointFO.y < BitmapDescriptorFactory.HUE_RED)) {
                        z = true;
                    }
                    int i6 = iBl + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < iAx) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.mb
    public final View b(lz lzVar) {
        if (lzVar.ah()) {
            return it.a(lzVar, i(lzVar));
        }
        if (lzVar.ag()) {
            return it.a(lzVar, h(lzVar));
        }
        return null;
    }

    @Override // defpackage.mb
    public final int[] c(lz lzVar, View view) {
        int[] iArr = new int[2];
        if (lzVar.ag()) {
            iArr[0] = j(view, h(lzVar));
        } else {
            iArr[0] = 0;
        }
        if (lzVar.ah()) {
            iArr[1] = j(view, i(lzVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // defpackage.mb
    public final mk d(lz lzVar) {
        if (lzVar instanceof mj) {
            return new lr(this, this.a.getContext());
        }
        return null;
    }
}
