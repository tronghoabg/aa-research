package com.waze.search;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class j extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f35974a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(Object obj, int i2) {
        super(0, obj, com.waze.config.d.class, "getValue", "getValue()Ljava/lang/String;", 0);
        this.f35974a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        switch (this.f35974a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                ((com.waze.search.e.p) this.receiver).g();
                break;
            case 5:
                ((com.waze.search.e.p) this.receiver).h();
                break;
            case 6:
                ((com.waze.search.e.v) this.receiver).c();
                break;
            case 7:
                ((com.waze.search.e.p) this.receiver).g();
                break;
            default:
                ((com.waze.search.e.p) this.receiver).h();
                break;
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(Object obj, int i2, byte[] bArr) {
        super(0, obj, com.waze.location.o.class, "lastCoordinate", "lastCoordinate()Lcom/waze/shared_infra/geo/Coordinate;", 0);
        this.f35974a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(Object obj, int i2, float[] fArr) {
        super(0, obj, com.waze.search.e.v.class, "onClick", "onClick()V", 0);
        this.f35974a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(Object obj, int i2, int[] iArr) {
        super(0, obj, com.waze.search.e.p.class, "onClick", "onClick()V", 0);
        this.f35974a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(Object obj, int i2, boolean[] zArr) {
        super(0, obj, com.waze.search.e.p.class, "onLongClick", "onLongClick()V", 0);
        this.f35974a = i2;
    }
}
