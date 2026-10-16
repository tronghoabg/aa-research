package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Calendar;

/* loaded from: classes3.dex */
final class wnx extends lv {
    final /* synthetic */ woa a;
    private final Calendar b = woq.e(null);
    private final Calendar c = woq.e(null);

    public wnx(woa woaVar) {
        this.a = woaVar;
    }

    @Override // defpackage.lv
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Object obj;
        if ((recyclerView.m instanceof wos) && (recyclerView.g() instanceof GridLayoutManager)) {
            wos wosVar = (wos) recyclerView.m;
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.g();
            woa woaVar = this.a;
            for (dzi dziVar : woaVar.a.b()) {
                Object obj2 = dziVar.a;
                if (obj2 != null && (obj = dziVar.b) != null) {
                    Calendar calendar = this.b;
                    calendar.setTimeInMillis(((Long) obj2).longValue());
                    Calendar calendar2 = this.c;
                    calendar2.setTimeInMillis(((Long) obj).longValue());
                    int iB = wosVar.b(calendar.get(1));
                    int iB2 = wosVar.b(calendar2.get(1));
                    View viewU = gridLayoutManager.U(iB);
                    View viewU2 = gridLayoutManager.U(iB2);
                    int i = gridLayoutManager.b;
                    int i2 = iB / i;
                    int i3 = iB2 / i;
                    int i4 = i2;
                    while (i4 <= i3) {
                        View viewU3 = gridLayoutManager.U(gridLayoutManager.b * i4);
                        if (viewU3 != null) {
                            int top = viewU3.getTop() + woaVar.d.d.b();
                            int bottom = viewU3.getBottom() - woaVar.d.d.a();
                            int left = 0;
                            if (i4 == i2 && viewU != null) {
                                left = viewU.getLeft() + (viewU.getWidth() / 2);
                            }
                            canvas.drawRect(left, top, (i4 != i3 || viewU2 == null) ? recyclerView.getWidth() : viewU2.getLeft() + (viewU2.getWidth() / 2), bottom, woaVar.d.h);
                        }
                        i4++;
                    }
                }
            }
        }
    }
}
