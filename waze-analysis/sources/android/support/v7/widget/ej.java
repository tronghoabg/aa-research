package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.widget.EdgeEffect;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ej {
    public ej() {
    }

    public static /* synthetic */ Object k(com.airbnb.lottie.b.b bVar, com.airbnb.lottie.h hVar, int i2, boolean z, float f2, com.airbnb.lottie.b.u uVar, float f3, com.airbnb.lottie.b.t tVar, h.c.e eVar, int i3) {
        int iF = (i3 & 2) != 0 ? bVar.f() : 0;
        if ((i3 & 4) != 0) {
            i2 = bVar.g();
        }
        if ((i3 & 8) != 0) {
            z = bVar.t();
        }
        if ((i3 & 16) != 0) {
            f2 = bVar.e();
        }
        if ((i3 & 32) != 0) {
            uVar = bVar.j();
        }
        if ((i3 & 64) != 0) {
            f3 = com.airbnb.lottie.b.o.k(hVar, uVar, f2);
        }
        if ((i3 & 256) != 0) {
            tVar = com.airbnb.lottie.b.t.f2074a;
        }
        com.airbnb.lottie.b.t tVar2 = tVar;
        float f4 = f3;
        com.airbnb.lottie.b.u uVar2 = uVar;
        float f5 = f2;
        return bVar.a(hVar, iF, i2, z, f5, uVar2, f4, tVar2, eVar);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, fb fbVar) {
        getItemOffsets(rect, ((eo) view.getLayoutParams()).a(), recyclerView);
    }

    protected EdgeEffect j(RecyclerView recyclerView) {
        throw null;
    }

    public Typeface l() {
        return null;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, fb fbVar) {
        onDraw(canvas, recyclerView);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, fb fbVar) {
        onDrawOver(canvas, recyclerView);
    }

    public ej(byte[] bArr) {
    }

    @Deprecated
    public void onDraw(Canvas canvas, RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
    }

    @Deprecated
    public void getItemOffsets(Rect rect, int i2, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }
}
