package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class bi extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f14451a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(Object obj, int i2) {
        super(1, obj, bm.class, "remove", "remove(Lcom/waze/insight/data/InsightId$Notification;)V", 0);
        this.f14451a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        int i2 = this.f14451a;
        if (i2 == 0) {
            com.waze.an.a.u uVar = (com.waze.an.a.u) obj;
            h.g.b.x.f(uVar, "p0");
            bm.f((bm) this.receiver, uVar);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            com.waze.an.a.l lVar = (com.waze.an.a.l) obj;
            h.g.b.x.f(lVar, "p0");
            bm.e((bm) this.receiver, lVar);
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            com.waze.an.a.u uVar2 = (com.waze.an.a.u) obj;
            h.g.b.x.f(uVar2, "p0");
            bm.f((bm) this.receiver, uVar2);
            return h.ab.f48028a;
        }
        com.waze.an.a.l lVar2 = (com.waze.an.a.l) obj;
        h.g.b.x.f(lVar2, "p0");
        bm.e((bm) this.receiver, lVar2);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(Object obj, int i2, byte[] bArr) {
        super(1, obj, bm.class, "add", "add(Lcom/waze/insight/data/InsightDescriptor$NotificationInsightDescriptor;)V", 0);
        this.f14451a = i2;
    }
}
