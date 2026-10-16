package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ei {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RecyclerView f1403a;

    ei(RecyclerView recyclerView) {
        this.f1403a = recyclerView;
    }

    public final fe a(int i2) {
        RecyclerView recyclerView = this.f1403a;
        int iB = recyclerView.f940g.b();
        int i3 = 0;
        fe feVar = null;
        while (true) {
            if (i3 >= iB) {
                break;
            }
            fe feVarP = RecyclerView.p(recyclerView.f940g.e(i3));
            if (feVarP != null && !feVarP.isRemoved() && feVarP.mPosition == i2) {
                if (!recyclerView.f940g.m(feVarP.itemView)) {
                    feVar = feVarP;
                    break;
                }
                feVar = feVarP;
            }
            i3++;
        }
        if (feVar == null || recyclerView.f940g.m(feVar.itemView)) {
            return null;
        }
        return feVar;
    }

    final void b(u uVar) {
        int i2 = uVar.f1616a;
        if (i2 == 1) {
            this.f1403a.n.z(uVar.f1617b, uVar.f1619d);
            return;
        }
        if (i2 == 2) {
            this.f1403a.n.C(uVar.f1617b, uVar.f1619d);
            return;
        }
        if (i2 != 4) {
            if (i2 != 8) {
                return;
            }
            this.f1403a.n.B(uVar.f1617b, uVar.f1619d);
        } else {
            en enVar = this.f1403a.n;
            int i3 = uVar.f1617b;
            int i4 = uVar.f1619d;
            Object obj = uVar.f1618c;
            enVar.D(i3, i4);
        }
    }

    public final void c(int i2, int i3, Object obj) {
        int i4;
        int i5;
        int i6;
        RecyclerView recyclerView = this.f1403a;
        int iB = recyclerView.f940g.b();
        int i7 = 0;
        while (true) {
            i4 = i2 + i3;
            if (i7 >= iB) {
                break;
            }
            View viewE = recyclerView.f940g.e(i7);
            fe feVarP = RecyclerView.p(viewE);
            if (feVarP != null && !feVarP.shouldIgnore() && (i6 = feVarP.mPosition) >= i2 && i6 < i4) {
                feVarP.addFlags(2);
                feVarP.addChangePayload(obj);
                ((eo) viewE.getLayoutParams()).f1420e = true;
            }
            i7++;
        }
        et etVar = recyclerView.f937d;
        ArrayList arrayList = etVar.f1431c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.G = true;
                return;
            }
            fe feVar = (fe) arrayList.get(size);
            if (feVar != null && (i5 = feVar.mPosition) >= i2 && i5 < i4) {
                feVar.addFlags(2);
                etVar.k(size);
            }
        }
    }

    public final void d(int i2, int i3) {
        RecyclerView recyclerView = this.f1403a;
        int iB = recyclerView.f940g.b();
        for (int i4 = 0; i4 < iB; i4++) {
            fe feVarP = RecyclerView.p(recyclerView.f940g.e(i4));
            if (feVarP != null && !feVarP.shouldIgnore() && feVarP.mPosition >= i2) {
                feVarP.offsetPosition(i3, false);
                recyclerView.E.f1462f = true;
            }
        }
        ArrayList arrayList = recyclerView.f937d.f1431c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            fe feVar = (fe) arrayList.get(i5);
            if (feVar != null && feVar.mPosition >= i2) {
                feVar.offsetPosition(i3, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.F = true;
    }

    public final void e(int i2, int i3) {
        int i4;
        RecyclerView recyclerView = this.f1403a;
        int iB = recyclerView.f940g.b();
        int i5 = 0;
        while (true) {
            if (i5 >= iB) {
                break;
            }
            fe feVarP = RecyclerView.p(recyclerView.f940g.e(i5));
            if (feVarP != null) {
                int i6 = i2 < i3 ? i2 : i3;
                int i7 = feVarP.mPosition;
                if (i7 >= i6) {
                    if (i7 <= (i2 < i3 ? i3 : i2)) {
                        if (i7 == i2) {
                            feVarP.offsetPosition(i3 - i2, false);
                        } else {
                            feVarP.offsetPosition(i2 >= i3 ? 1 : -1, false);
                        }
                        recyclerView.E.f1462f = true;
                    }
                }
            }
            i5++;
        }
        et etVar = recyclerView.f937d;
        int i8 = i2 < i3 ? i3 : i2;
        int i9 = i2 < i3 ? i2 : i3;
        ArrayList arrayList = etVar.f1431c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            fe feVar = (fe) arrayList.get(i10);
            if (feVar != null && (i4 = feVar.mPosition) >= i9 && i4 <= i8) {
                if (i4 == i2) {
                    feVar.offsetPosition(i3 - i2, false);
                } else {
                    feVar.offsetPosition(i2 < i3 ? -1 : 1, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.F = true;
    }

    public final void f(int i2, int i3) {
        RecyclerView recyclerView = this.f1403a;
        recyclerView.X(i2, i3, true);
        recyclerView.F = true;
        recyclerView.E.f1459c += i3;
    }

    public final int g() {
        return this.f1403a.getChildCount();
    }

    public final int h(View view) {
        return this.f1403a.indexOfChild(view);
    }

    public final View i(int i2) {
        return this.f1403a.getChildAt(i2);
    }

    public final void j(View view) {
        fe feVarP = RecyclerView.p(view);
        if (feVarP != null) {
            feVarP.onLeftHiddenState(this.f1403a);
        }
    }

    public final void k(int i2) {
        RecyclerView recyclerView = this.f1403a;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            recyclerView.K(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i2);
    }

    public final void l(fe feVar, eg egVar, eg egVar2) {
        int i2;
        int i3;
        feVar.setIsRecyclable(false);
        RecyclerView recyclerView = this.f1403a;
        eh ehVar = recyclerView.y;
        if (egVar == null || ((i2 = egVar.f1389a) == (i3 = egVar2.f1389a) && egVar.f1390b == egVar2.f1390b)) {
            ehVar.n(feVar);
        } else if (!ehVar.l(feVar, i2, egVar.f1390b, i3, egVar2.f1390b)) {
            return;
        }
        recyclerView.ab();
    }

    public final void m(fe feVar, eg egVar, eg egVar2) {
        RecyclerView recyclerView = this.f1403a;
        recyclerView.f937d.o(feVar);
        recyclerView.C(feVar, egVar, egVar2);
    }

    public final void n(fe feVar) {
        RecyclerView recyclerView = this.f1403a;
        recyclerView.n.aX(feVar.itemView, recyclerView.f937d);
    }
}
