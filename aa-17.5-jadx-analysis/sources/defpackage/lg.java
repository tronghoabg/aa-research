package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class lg extends mb {
    private lq c;
    private lq d;

    private final int h(lz lzVar, lq lqVar, int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int iAv = lzVar.av();
        float f = 1.0f;
        if (iAv != 0) {
            View view = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < iAv; i5++) {
                View viewAD = lzVar.aD(i5);
                int iBl = lz.bl(viewAD);
                if (iBl != -1) {
                    int i6 = iBl < i3 ? iBl : i3;
                    if (iBl < i3) {
                        view = viewAD;
                    }
                    if (iBl > i4) {
                        view2 = viewAD;
                        i4 = iBl;
                    }
                    i3 = i6;
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(lqVar.a(view), lqVar.a(view2)) - Math.min(lqVar.d(view), lqVar.d(view2));
                if (iMax != 0) {
                    f = iMax / ((i4 - i3) + 1);
                }
            }
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        return Math.round(iArr[Math.abs(iArr[0]) > Math.abs(iArr[1]) ? (char) 0 : (char) 1] / f);
    }

    private final lq i(lz lzVar) {
        lq lqVar = this.d;
        if (lqVar == null || lqVar.a != lzVar) {
            this.d = new lo(lzVar);
        }
        return this.d;
    }

    private final lq j(lz lzVar) {
        lq lqVar = this.c;
        if (lqVar == null || lqVar.a != lzVar) {
            this.c = new lp(lzVar);
        }
        return this.c;
    }

    private static final int k(View view, lq lqVar) {
        return (lqVar.d(view) + (lqVar.b(view) / 2)) - (lqVar.j() + (lqVar.k() / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mb
    public int a(lz lzVar, int i, int i2) {
        int iAx;
        View viewB;
        int iBl;
        int i3;
        PointF pointFO;
        int iH;
        int iH2;
        if (!(lzVar instanceof mj) || (iAx = lzVar.ax()) == 0 || (viewB = b(lzVar)) == null || (iBl = lz.bl(viewB)) == -1 || (pointFO = ((mj) lzVar).O(iAx - 1)) == null) {
            return -1;
        }
        if (lzVar.ag()) {
            iH = h(lzVar, i(lzVar), i, 0);
            if (pointFO.x < BitmapDescriptorFactory.HUE_RED) {
                iH = -iH;
            }
        } else {
            iH = 0;
        }
        if (lzVar.ah()) {
            iH2 = h(lzVar, j(lzVar), 0, i2);
            if (pointFO.y < BitmapDescriptorFactory.HUE_RED) {
                iH2 = -iH2;
            }
        } else {
            iH2 = 0;
        }
        if (true == lzVar.ah()) {
            iH = iH2;
        }
        if (iH == 0) {
            return -1;
        }
        int i4 = iBl + iH;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= iAx ? i3 : i5;
    }

    @Override // defpackage.mb
    public View b(lz lzVar) {
        if (lzVar.ah()) {
            return it.a(lzVar, j(lzVar));
        }
        if (lzVar.ag()) {
            return it.a(lzVar, i(lzVar));
        }
        return null;
    }

    @Override // defpackage.mb
    public int[] c(lz lzVar, View view) {
        int[] iArr = new int[2];
        if (lzVar.ag()) {
            iArr[0] = k(view, i(lzVar));
        } else {
            iArr[0] = 0;
        }
        if (lzVar.ah()) {
            iArr[1] = k(view, j(lzVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }
}
