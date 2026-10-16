package android.support.v7.widget;

import android.graphics.PointF;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class dh extends fn {

    /* renamed from: b, reason: collision with root package name */
    private dv f1345b;

    /* renamed from: c, reason: collision with root package name */
    private dv f1346c;

    private final int i(en enVar, dv dvVar, int i2, int i3) {
        int[] iArrH = h(i2, i3);
        int iAs = enVar.as();
        float f2 = 1.0f;
        if (iAs != 0) {
            View view = null;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            View view2 = null;
            for (int i6 = 0; i6 < iAs; i6++) {
                View viewAI = enVar.aI(i6);
                int iBu = en.bu(viewAI);
                if (iBu != -1) {
                    int i7 = iBu < i4 ? iBu : i4;
                    if (iBu < i4) {
                        view = viewAI;
                    }
                    if (iBu > i5) {
                        view2 = viewAI;
                        i5 = iBu;
                    }
                    i4 = i7;
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(dvVar.a(view), dvVar.a(view2)) - Math.min(dvVar.d(view), dvVar.d(view2));
                if (iMax != 0) {
                    f2 = iMax / ((i5 - i4) + 1);
                }
            }
        }
        if (f2 <= 0.0f) {
            return 0;
        }
        return Math.round(iArrH[Math.abs(iArrH[0]) > Math.abs(iArrH[1]) ? (char) 0 : (char) 1] / f2);
    }

    private final dv j(en enVar) {
        dv dvVar = this.f1346c;
        if (dvVar == null || dvVar.f1376a != enVar) {
            this.f1346c = new dt(enVar);
        }
        return this.f1346c;
    }

    private final dv k(en enVar) {
        dv dvVar = this.f1345b;
        if (dvVar == null || dvVar.f1376a != enVar) {
            this.f1345b = new du(enVar);
        }
        return this.f1345b;
    }

    private static final int l(View view, dv dvVar) {
        return (dvVar.d(view) + (dvVar.b(view) / 2)) - (dvVar.j() + (dvVar.k() / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.fn
    public final int a(en enVar, int i2, int i3) {
        int iAw;
        View viewB;
        int iBu;
        int i4;
        PointF pointFP;
        int i5;
        int i6;
        if (!(enVar instanceof ez) || (iAw = enVar.aw()) == 0 || (viewB = b(enVar)) == null || (iBu = en.bu(viewB)) == -1 || (pointFP = ((ez) enVar).P(iAw - 1)) == null) {
            return -1;
        }
        if (enVar.ae()) {
            i5 = i(enVar, j(enVar), i2, 0);
            if (pointFP.x < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (enVar.af()) {
            i6 = i(enVar, k(enVar), 0, i3);
            if (pointFP.y < 0.0f) {
                i6 = -i6;
            }
        } else {
            i6 = 0;
        }
        if (true == enVar.af()) {
            i5 = i6;
        }
        if (i5 == 0) {
            return -1;
        }
        int i7 = iBu + i5;
        int i8 = i7 >= 0 ? i7 : 0;
        return i8 >= iAw ? i4 : i8;
    }

    @Override // android.support.v7.widget.fn
    public final View b(en enVar) {
        if (enVar.af()) {
            return u.a(enVar, k(enVar));
        }
        if (enVar.ae()) {
            return u.a(enVar, j(enVar));
        }
        return null;
    }

    @Override // android.support.v7.widget.fn
    public final int[] c(en enVar, View view) {
        int[] iArr = new int[2];
        if (enVar.ae()) {
            iArr[0] = l(view, j(enVar));
        } else {
            iArr[0] = 0;
        }
        if (enVar.af()) {
            iArr[1] = l(view, k(enVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }
}
