package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class an implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao f27955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27957c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f27958d;

    public /* synthetic */ an(ao aoVar, int i2, int i3, int i4) {
        this.f27958d = i4;
        this.f27955a = aoVar;
        this.f27956b = i2;
        this.f27957c = i3;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f27958d;
        int i3 = this.f27957c;
        if (i2 != 0) {
            return ao.findIntersectionMetadata$lambda$0(this.f27955a, this.f27956b, i3);
        }
        return ao.findNearestLine$lambda$0(this.f27955a, this.f27956b, i3);
    }
}
