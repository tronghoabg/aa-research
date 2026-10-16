package com.waze.car_lib.i.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class ab extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f19849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(Object obj, int i2) {
        super(0, obj, ac.class, "onLoaderHidden", "onLoaderHidden()V", 0);
        this.f19849a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f19849a;
        Object obj = this.receiver;
        if (i2 != 0) {
            ac.d((ac) obj);
            return h.ab.f48028a;
        }
        ac.c((ac) obj);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(Object obj, int i2, byte[] bArr) {
        super(0, obj, ac.class, "onLoaderShown", "onLoaderShown()V", 0);
        this.f19849a = i2;
    }
}
