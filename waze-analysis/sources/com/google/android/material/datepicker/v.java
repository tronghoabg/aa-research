package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ej;
import android.support.v7.widget.fb;
import android.view.View;
import androidx.core.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class v extends ej {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f6490a;

    /* renamed from: b, reason: collision with root package name */
    private final Calendar f6491b;

    /* renamed from: c, reason: collision with root package name */
    private final Calendar f6492c;

    v(z zVar) {
        Objects.requireNonNull(zVar);
        this.f6490a = zVar;
        this.f6491b = ax.k();
        this.f6492c = ax.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.ej
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, fb fbVar) {
        if ((recyclerView.j() instanceof ba) && (recyclerView.l() instanceof GridLayoutManager)) {
            ba baVar = (ba) recyclerView.j();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.l();
            z zVar = this.f6490a;
            for (Pair pair : new ArrayList()) {
                F f2 = pair.first;
                if (f2 != 0 && pair.second != 0) {
                    Calendar calendar = this.f6491b;
                    calendar.setTimeInMillis(((Long) f2).longValue());
                    Calendar calendar2 = this.f6492c;
                    calendar2.setTimeInMillis(((Long) pair.second).longValue());
                    int iA = baVar.a(calendar.get(1));
                    int iA2 = baVar.a(calendar2.get(1));
                    View viewS = gridLayoutManager.S(iA);
                    View viewS2 = gridLayoutManager.S(iA2);
                    int iD = iA / gridLayoutManager.d();
                    int iD2 = iA2 / gridLayoutManager.d();
                    int i2 = iD;
                    while (i2 <= iD2) {
                        View viewS3 = gridLayoutManager.S(gridLayoutManager.d() * i2);
                        if (viewS3 != null) {
                            int top = viewS3.getTop() + zVar.f6501f.f6457d.b();
                            int bottom = viewS3.getBottom() - zVar.f6501f.f6457d.a();
                            int left = 0;
                            if (i2 == iD && viewS != null) {
                                left = viewS.getLeft() + (viewS.getWidth() / 2);
                            }
                            canvas.drawRect(left, top, (i2 != iD2 || viewS2 == null) ? recyclerView.getWidth() : viewS2.getLeft() + (viewS2.getWidth() / 2), bottom, zVar.f6501f.f6461h);
                        }
                        i2++;
                    }
                }
            }
        }
    }
}
