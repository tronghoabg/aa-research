package com.waze.map.canvas;

import androidx.compose.ui.unit.Dp;
import com.waze.search.v2.cu;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f28634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28635b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f28636c;

    public /* synthetic */ g(Object obj, float f2, int i2) {
        this.f28636c = i2;
        this.f28635b = obj;
        this.f28634a = f2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f28636c == 0) {
            float f2 = this.f28634a;
            return CanvasDelegatorImpl.n((CanvasDelegatorImpl) this.f28635b, f2, (String) obj);
        }
        int i2 = cu.f36302a;
        this.f28635b.invoke(Dp.m11162boximpl(((Dp) obj).m11178unboximpl() + this.f28634a));
        return h.ab.f48028a;
    }
}
