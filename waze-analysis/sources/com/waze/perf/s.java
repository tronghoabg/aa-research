package com.waze.perf;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class s extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f33064a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(Object obj, int i2) {
        super(0, obj, com.waze.config.c.class, "getValue", "getValue()Ljava/lang/Long;", 0);
        this.f33064a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f33064a;
        Object obj = this.receiver;
        return i2 != 0 ? ((com.waze.config.b) obj).b() : ((com.waze.config.c) obj).b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(Object obj, int i2, byte[] bArr) {
        super(0, obj, com.waze.config.b.class, "getValue", "getValue()Ljava/lang/Boolean;", 0);
        this.f33064a = i2;
    }
}
