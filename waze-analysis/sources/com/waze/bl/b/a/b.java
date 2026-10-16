package com.waze.bl.b.a;

import com.waze.bm.a.a.ai;
import com.waze.bm.a.a.an;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f16897a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f16898b;

    public /* synthetic */ b(j jVar, int i2) {
        this.f16898b = i2;
        this.f16897a = jVar;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f16898b != 0) {
            return j.f(this.f16897a, (an) obj);
        }
        return j.e(this.f16897a, (ai) obj);
    }
}
