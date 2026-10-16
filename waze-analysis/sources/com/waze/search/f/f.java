package com.waze.search.f;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class f implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f35684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.waze.search.v2.o f35686c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f35687d;

    public /* synthetic */ f(com.waze.search.v2.o oVar, h.g.a.l lVar, int i2, int i3) {
        this.f35687d = i3;
        this.f35686c = oVar;
        this.f35684a = lVar;
        this.f35685b = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f35687d != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f35685b;
            h.g.a.l lVar = this.f35684a;
            return x.n(this.f35686c, lVar, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f35685b;
        h.g.a.l lVar2 = this.f35684a;
        return x.o(this.f35686c, lVar2, i3, (Composer) obj);
    }
}
