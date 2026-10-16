package android.support.v7.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class dw extends fa {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dx f1379a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dw(dx dxVar, Context context) {
        super(context);
        this.f1379a = dxVar;
    }

    @Override // android.support.v7.widget.fa
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // android.support.v7.widget.fa
    protected final int b(int i2) {
        return Math.min(100, super.b(i2));
    }

    @Override // android.support.v7.widget.fa
    protected final void c(View view, ey eyVar) {
        dx dxVar = this.f1379a;
        int[] iArrC = dxVar.c(dxVar.f1497a.n, view);
        int i2 = iArrC[0];
        int i3 = iArrC[1];
        int iN = n(Math.max(Math.abs(i2), Math.abs(i3)));
        if (iN > 0) {
            eyVar.c(i2, i3, iN, this.f1447c);
        }
    }
}
