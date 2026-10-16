package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class o extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f14497a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(Object obj, int i2) {
        super(0, obj, p.class, "onFteInsightDisplayed", "onFteInsightDisplayed()V", 0);
        this.f14497a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f14497a;
        Object obj = this.receiver;
        if (i2 != 0) {
            p.e((p) obj);
            return h.ab.f48028a;
        }
        p.f((p) obj);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(Object obj, int i2, byte[] bArr) {
        super(0, obj, p.class, "dismissFteInsight", "dismissFteInsight()V", 0);
        this.f14497a = i2;
    }
}
