package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dp extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f39795a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dr f39796b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ jo f39797c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f39798d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f39799e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f39800f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dp(dr drVar, jo joVar, String str, long j2, long j3, h.c.e eVar) {
        super(2, eVar);
        this.f39796b = drVar;
        this.f39797c = joVar;
        this.f39798d = str;
        this.f39799e = j2;
        this.f39800f = j3;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new dp(this.f39796b, this.f39797c, this.f39798d, this.f39799e, this.f39800f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dp) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f39795a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f39795a = 1;
            obj = this.f39796b.E(this.f39797c, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.f39796b.f39817k.d(this.f39798d, this.f39799e, this.f39800f, ((Integer) obj) != null ? new Long(r8.intValue()) : null);
        return h.ab.f48028a;
    }
}
