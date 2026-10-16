package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bm extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f31664a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f31665b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f31666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bm(LocationPreviewActivity locationPreviewActivity, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31666c = i2;
        this.f31665b = locationPreviewActivity;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f31666c;
        Object obj2 = this.f31665b;
        return i2 != 0 ? new bm((LocationPreviewActivity) obj2, eVar, 1) : new bm((bn) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f31666c != 0 ? ((bm) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bm) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f31666c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f31664a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f31664a = 1;
                if (((LocationPreviewActivity) this.f31665b).o().b(com.waze.ui.m.ao.f42792a, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f31664a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj2 = this.f31665b;
            this.f31664a = 1;
            if (((bn) obj2).b(com.waze.ui.m.by.f42842a, this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bm(bn bnVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31666c = i2;
        this.f31665b = bnVar;
    }
}
