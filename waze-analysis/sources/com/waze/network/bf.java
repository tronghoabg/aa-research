package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bf extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f32135a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f32136b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(byte[] bArr, String str, h.c.e eVar) {
        super(2, eVar);
        this.f32135a = bArr;
        this.f32136b = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bf(this.f32135a, this.f32136b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bf) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return WazeNetworkGateway.runGlobalParserNTV(this.f32135a, this.f32136b);
    }
}
