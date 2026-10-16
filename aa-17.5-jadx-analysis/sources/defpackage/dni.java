package defpackage;

import android.view.View;
import java.util.List;

/* loaded from: classes2.dex */
public final class dni extends ebx {
    final /* synthetic */ dnj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dni(dnj dnjVar) {
        super(1);
        this.a = dnjVar;
    }

    @Override // defpackage.ebx
    public final ecy b(ecy ecyVar, List list) {
        dnj dnjVar = this.a;
        if (!dnjVar.c) {
            int i = 0;
            View childAt = dnjVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, dnjVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, dnjVar.getHeight() - childAt.getBottom());
            if (iMax != 0) {
                i = iMax;
            } else if (iMax2 == 0) {
                if (iMax3 != 0) {
                    iMax2 = 0;
                } else if (iMax4 != 0) {
                    iMax2 = 0;
                    iMax3 = 0;
                }
            }
            return ecyVar.o(i, iMax2, iMax3, iMax4);
        }
        return ecyVar;
    }

    @Override // defpackage.ebx
    public final ebw c(lds ldsVar, ebw ebwVar) {
        dnj dnjVar = this.a;
        if (!dnjVar.c) {
            int i = 0;
            View childAt = dnjVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, dnjVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, dnjVar.getHeight() - childAt.getBottom());
            if (iMax != 0) {
                i = iMax;
            } else if (iMax2 == 0) {
                if (iMax3 != 0) {
                    iMax2 = 0;
                } else if (iMax4 != 0) {
                    iMax2 = 0;
                    iMax3 = 0;
                }
            }
            dve dveVar = ebwVar.a;
            dve dveVarE = dve.e(i, iMax2, iMax3, iMax4);
            int i2 = dveVarE.b;
            int i3 = dveVarE.c;
            int i4 = dveVarE.d;
            int i5 = dveVarE.e;
            return new ebw(ecy.j(dveVar, i2, i3, i4, i5), ecy.j(ebwVar.b, i2, i3, i4, i5));
        }
        return ebwVar;
    }
}
