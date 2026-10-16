package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* loaded from: classes2.dex */
public final class kdj extends oxh {
    private final boolean d;
    private final int e;
    private final int f;

    public kdj(Context context, boolean z, int i, int i2) {
        super(context, true);
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.lv
    public final void a(Rect rect, View view, RecyclerView recyclerView, ml mlVar) {
        super.a(rect, view, recyclerView, mlVar);
        if (this.d && recyclerView.c(view) == 0) {
            rect.top = this.f;
        }
        rect.bottom = this.e;
    }

    @Override // defpackage.oxh, defpackage.lv
    public final void i(Canvas canvas, RecyclerView recyclerView) {
    }
}
