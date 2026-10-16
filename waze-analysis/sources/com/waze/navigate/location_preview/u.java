package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class u implements com.waze.z.a.c.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.b.bn f31757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ai f31758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ay f31759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.b.bm f31760d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f31761e;

    public /* synthetic */ u(ai aiVar, ay ayVar, kotlinx.coroutines.b.bm bmVar, kotlinx.coroutines.b.bn bnVar, int i2) {
        this.f31761e = i2;
        this.f31758b = aiVar;
        this.f31759c = ayVar;
        this.f31760d = bmVar;
        this.f31757a = bnVar;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f31761e != 0) {
            kotlinx.coroutines.b.bn bnVar = this.f31757a;
            kotlinx.coroutines.b.bm bmVar = this.f31760d;
            ay ayVar = this.f31759c;
            return ai.c(this.f31758b, ayVar, bmVar, bnVar, (com.waze.z.a.c.c) obj, (com.waze.z.a.c.d) obj2);
        }
        kotlinx.coroutines.b.bm bmVar2 = this.f31760d;
        ay ayVar2 = this.f31759c;
        ai aiVar = this.f31758b;
        return ai.b(this.f31757a, aiVar, ayVar2, bmVar2, (com.waze.z.a.c.c) obj, (com.waze.z.a.c.d) obj2);
    }

    public /* synthetic */ u(kotlinx.coroutines.b.bn bnVar, ai aiVar, ay ayVar, kotlinx.coroutines.b.bm bmVar, int i2) {
        this.f31761e = i2;
        this.f31757a = bnVar;
        this.f31758b = aiVar;
        this.f31759c = ayVar;
        this.f31760d = bmVar;
    }
}
