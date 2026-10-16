package android.support.v7.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class fm extends fa {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fn f1496a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fm(fn fnVar, Context context) {
        super(context);
        this.f1496a = fnVar;
    }

    @Override // android.support.v7.widget.fa
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // android.support.v7.widget.fa
    protected final void c(View view, ey eyVar) {
        fn fnVar = this.f1496a;
        RecyclerView recyclerView = fnVar.f1497a;
        if (recyclerView == null) {
            return;
        }
        int[] iArrC = fnVar.c(recyclerView.n, view);
        int i2 = iArrC[0];
        int i3 = iArrC[1];
        int iN = n(Math.max(Math.abs(i2), Math.abs(i3)));
        if (iN > 0) {
            eyVar.c(i2, i3, iN, this.f1447c);
        }
    }
}
