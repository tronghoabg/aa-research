package com.airbnb.lottie.d.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.d.b.o;
import com.airbnb.lottie.s;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.a.a.e f2257g;

    /* renamed from: h, reason: collision with root package name */
    private final c f2258h;

    g(s sVar, e eVar, c cVar, com.airbnb.lottie.h hVar) {
        super(sVar, eVar);
        this.f2258h = cVar;
        com.airbnb.lottie.a.a.e eVar2 = new com.airbnb.lottie.a.a.e(sVar, this, new o("__container", eVar.v(), false), hVar);
        this.f2257g = eVar2;
        eVar2.f(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    @Override // com.airbnb.lottie.d.c.b, com.airbnb.lottie.a.a.f
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.f2257g.c(rectF, this.f2221a, z);
    }

    @Override // com.airbnb.lottie.d.c.b
    public final com.airbnb.lottie.d.b.a i() {
        com.airbnb.lottie.d.b.a aVarI = super.i();
        return aVarI != null ? aVarI : this.f2258h.i();
    }

    @Override // com.airbnb.lottie.d.c.b
    public final com.airbnb.lottie.f.i j() {
        com.airbnb.lottie.f.i iVarJ = super.j();
        return iVarJ != null ? iVarJ : this.f2258h.j();
    }

    @Override // com.airbnb.lottie.d.c.b
    final void m(Canvas canvas, Matrix matrix, int i2) {
        this.f2257g.b(canvas, matrix, i2);
    }

    @Override // com.airbnb.lottie.d.c.b
    protected final void o(com.airbnb.lottie.d.e eVar, int i2, List list, com.airbnb.lottie.d.e eVar2) {
        this.f2257g.e(eVar, i2, list, eVar2);
    }
}
