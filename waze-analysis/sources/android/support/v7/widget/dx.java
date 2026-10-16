package android.support.v7.widget;

import android.graphics.PointF;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class dx extends fn {

    /* renamed from: b, reason: collision with root package name */
    private dv f1380b;

    /* renamed from: c, reason: collision with root package name */
    private dv f1381c;

    private final dv i(en enVar) {
        dv dvVar = this.f1381c;
        if (dvVar == null || dvVar.f1376a != enVar) {
            this.f1381c = new dt(enVar);
        }
        return this.f1381c;
    }

    private final dv j(en enVar) {
        dv dvVar = this.f1380b;
        if (dvVar == null || dvVar.f1376a != enVar) {
            this.f1380b = new du(enVar);
        }
        return this.f1380b;
    }

    private static final int k(View view, dv dvVar) {
        return (dvVar.d(view) + (dvVar.b(view) / 2)) - (dvVar.j() + (dvVar.k() / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.fn
    public final int a(en enVar, int i2, int i3) {
        PointF pointFP;
        int iAw = enVar.aw();
        if (iAw != 0) {
            View view = null;
            dv dvVarJ = enVar.af() ? j(enVar) : enVar.ae() ? i(enVar) : null;
            if (dvVarJ != null) {
                int iAs = enVar.as();
                boolean z = false;
                int i4 = Integer.MIN_VALUE;
                int i5 = Integer.MAX_VALUE;
                View view2 = null;
                for (int i6 = 0; i6 < iAs; i6++) {
                    View viewAI = enVar.aI(i6);
                    if (viewAI != null) {
                        int iK = k(viewAI, dvVarJ);
                        if (iK <= 0 && iK > i4) {
                            view2 = viewAI;
                            i4 = iK;
                        }
                        if (iK >= 0 && iK < i5) {
                            view = viewAI;
                            i5 = iK;
                        }
                    }
                }
                if (true != enVar.ae()) {
                    i2 = i3;
                }
                boolean z2 = i2 > 0;
                if (z2 && view != null) {
                    return en.bu(view);
                }
                if (!z2 && view2 != null) {
                    return en.bu(view2);
                }
                if (true == z2) {
                    view = view2;
                }
                if (view != null) {
                    int iBu = en.bu(view);
                    int iAw2 = enVar.aw();
                    if ((enVar instanceof ez) && (pointFP = ((ez) enVar).P(iAw2 - 1)) != null && (pointFP.x < 0.0f || pointFP.y < 0.0f)) {
                        z = true;
                    }
                    int i7 = iBu + (z == z2 ? -1 : 1);
                    if (i7 >= 0 && i7 < iAw) {
                        return i7;
                    }
                }
            }
        }
        return -1;
    }

    @Override // android.support.v7.widget.fn
    public final View b(en enVar) {
        if (enVar.af()) {
            return u.a(enVar, j(enVar));
        }
        if (enVar.ae()) {
            return u.a(enVar, i(enVar));
        }
        return null;
    }

    @Override // android.support.v7.widget.fn
    public final int[] c(en enVar, View view) {
        int[] iArr = new int[2];
        if (enVar.ae()) {
            iArr[0] = k(view, i(enVar));
        } else {
            iArr[0] = 0;
        }
        if (enVar.af()) {
            iArr[1] = k(view, j(enVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // android.support.v7.widget.fn
    protected final fa d(en enVar) {
        if (enVar instanceof ez) {
            return new dw(this, this.f1497a.getContext());
        }
        return null;
    }
}
