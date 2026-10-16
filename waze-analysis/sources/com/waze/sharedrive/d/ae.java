package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f38173a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f38174b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aq f38175c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ q f38176d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f38177e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(boolean z, boolean z2, aq aqVar, q qVar, h.c.e eVar) {
        super(2, eVar);
        this.f38173a = z;
        this.f38174b = z2;
        this.f38175c = aqVar;
        this.f38176d = qVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ae aeVar = new ae(this.f38173a, this.f38174b, this.f38175c, this.f38176d, eVar);
        aeVar.f38177e = obj;
        return aeVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ae) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f38177e;
        if (this.f38173a) {
            kotlinx.coroutines.aj.z(afVar, null, null, new v(this.f38175c, this.f38176d, (h.c.e) null, 2), 3);
        }
        if (this.f38174b) {
            kotlinx.coroutines.aj.z(afVar, null, null, new v(this.f38175c, this.f38176d, (h.c.e) null, 3, (byte[]) null), 3);
        }
        return h.ab.f48028a;
    }
}
