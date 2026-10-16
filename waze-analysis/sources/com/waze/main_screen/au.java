package com.waze.main_screen;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class au extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f25842a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25843b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f25844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(h.c.e eVar, int i2) {
        super(3, eVar);
        this.f25844c = i2;
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f25844c != 0) {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            au auVar = new au((h.c.e) obj3, 1, null);
            auVar.f25843b = (String) obj;
            auVar.f25842a = zBooleanValue;
            return auVar.invokeSuspend(h.ab.f48028a);
        }
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        au auVar2 = new au((h.c.e) obj3, 0);
        auVar2.f25842a = zBooleanValue2;
        auVar2.f25843b = (com.waze.bi.f) obj2;
        return auVar2.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f25844c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return new h.k((String) this.f25843b, Boolean.valueOf(this.f25842a));
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f25842a;
        return new h.k(Boolean.valueOf(z), (com.waze.bi.f) this.f25843b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(h.c.e eVar, int i2, byte[] bArr) {
        super(3, eVar);
        this.f25844c = i2;
    }
}
