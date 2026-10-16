package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes2.dex */
final class lr extends mk {
    final /* synthetic */ ls a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(ls lsVar, Context context) {
        super(context);
        this.a = lsVar;
    }

    @Override // defpackage.mk
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.mk
    protected final int b(int i) {
        return Math.min(100, super.b(i));
    }

    @Override // defpackage.mk
    protected final void c(View view, mi miVar) {
        ls lsVar = this.a;
        int[] iArrC = lsVar.c(lsVar.a.g(), view);
        int i = iArrC[0];
        int i2 = iArrC[1];
        int iK = k(Math.max(Math.abs(i), Math.abs(i2)));
        if (iK > 0) {
            miVar.b(i, i2, iK, this.j);
        }
    }
}
