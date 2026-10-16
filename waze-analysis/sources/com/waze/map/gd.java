package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class gd extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f29140a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gd(Object obj, int i2) {
        super(1, obj, gf.class, "onCanvasReady", "onCanvasReady(Ljava/lang/String;)V", 0);
        this.f29140a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.f29140a == 0) {
            String str = (String) obj;
            h.g.b.x.f(str, "p0");
            gf.e((gf) this.receiver, str);
            return h.ab.f48028a;
        }
        long jLongValue = ((Number) obj).longValue();
        return "%alt_route%" + jLongValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gd(Object obj, int i2, byte[] bArr) {
        super(1, obj, gb.class, "routeAltIdToPolylineTag", "routeAltIdToPolylineTag(J)Ljava/lang/String;", 0);
        this.f29140a = i2;
    }
}
