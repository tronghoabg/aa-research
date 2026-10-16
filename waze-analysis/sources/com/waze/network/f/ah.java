package com.waze.network.f;

import com.waze.realtime.RealtimeNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ah extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f32281a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f32282b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(af afVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f32282b = i2;
        this.f32281a = afVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f32282b;
        return i2 != 0 ? i2 != 1 ? new ah(this.f32281a, eVar, 2, null) : new ah((af) this.f32281a, eVar, 1) : new ah((h.g.a.l) this.f32281a, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f32282b;
        return i2 != 0 ? i2 != 1 ? ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f32282b;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            this.f32281a.invoke(true);
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            this.f32281a.invoke(false);
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        af afVar = (af) this.f32281a;
        RealtimeNativeManager.getInstance().realtimeOnSessionCreation(afVar.e(), afVar.d(), (int) afVar.a(), afVar.c());
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f32282b = i2;
        this.f32281a = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(h.g.a.l lVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f32282b = i2;
        this.f32281a = lVar;
    }
}
