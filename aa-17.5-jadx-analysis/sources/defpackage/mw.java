package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes2.dex */
final class mw extends mk {
    final /* synthetic */ mb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(mb mbVar, Context context) {
        super(context);
        this.a = mbVar;
    }

    @Override // defpackage.mk
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.mk
    protected final void c(View view, mi miVar) {
        mb mbVar = this.a;
        RecyclerView recyclerView = mbVar.a;
        if (recyclerView == null) {
            return;
        }
        int[] iArrC = mbVar.c(recyclerView.g(), view);
        int i = iArrC[0];
        int i2 = iArrC[1];
        int iK = k(Math.max(Math.abs(i), Math.abs(i2)));
        if (iK > 0) {
            miVar.b(i, i2, iK, this.j);
        }
    }
}
