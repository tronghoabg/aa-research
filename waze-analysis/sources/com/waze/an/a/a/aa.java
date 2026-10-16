package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class aa implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.waze.asks.av f14327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14328b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f14329c;

    public /* synthetic */ aa(Object obj, com.waze.asks.av avVar, int i2) {
        this.f14329c = i2;
        this.f14328b = obj;
        this.f14327a = avVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f14329c;
        com.waze.asks.av avVar = this.f14327a;
        return i2 != 0 ? y.f((y) this.f14328b, avVar) : ac.d((ac) this.f14328b, avVar);
    }
}
