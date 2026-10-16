package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class w extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27356a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ int f27357b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f27358c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f27359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(h.c.e eVar, int i2) {
        super(4, eVar);
        this.f27359d = i2;
    }

    @Override // h.g.a.r
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.f27359d != 0) {
            int iIntValue = ((Number) obj).intValue();
            w wVar = new w((h.c.e) obj4, 1, null);
            wVar.f27357b = iIntValue;
            wVar.f27356a = (Integer) obj2;
            wVar.f27358c = (com.waze.ui.l.bp) obj3;
            return wVar.invokeSuspend(h.ab.f48028a);
        }
        int iIntValue2 = ((Number) obj2).intValue();
        w wVar2 = new w((h.c.e) obj4, 0);
        wVar2.f27356a = (com.waze.ui.l.bp) obj;
        wVar2.f27357b = iIntValue2;
        wVar2.f27358c = (Integer) obj3;
        return wVar2.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f27359d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            int i2 = this.f27357b;
            return new h.p(new Integer(i2), (Integer) this.f27356a, (com.waze.ui.l.bp) this.f27358c);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.ui.l.bp bpVar = (com.waze.ui.l.bp) this.f27356a;
        int i3 = this.f27357b;
        return new h.p(bpVar, new Integer(i3), (Integer) this.f27358c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(h.c.e eVar, int i2, byte[] bArr) {
        super(4, eVar);
        this.f27359d = i2;
    }
}
