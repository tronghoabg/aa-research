package com.waze.car_lib;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class bo extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f19203a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(Object obj, int i2) {
        super(1, obj, bp.class, "onConnectionStateUpdated", "onConnectionStateUpdated(I)V", 0);
        this.f19203a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        int iIntValue;
        int i2 = this.f19203a;
        if (i2 == 0) {
            iIntValue = ((Number) obj).intValue();
            ((bp) this.receiver).f(iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? com.waze.an.f14320a : new com.waze.am((byte[]) null) : new com.waze.ak((byte[]) null) : com.waze.al.f14129a);
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            ((Number) obj).intValue();
            ((bp) this.receiver).f(iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? com.waze.an.f14320a : new com.waze.am((byte[]) null) : new com.waze.ak((byte[]) null) : com.waze.al.f14129a);
            return h.ab.f48028a;
        }
        com.waze.ui.ac.n nVar = (com.waze.ui.ac.n) obj;
        h.g.b.x.f(nVar, "p0");
        return com.waze.sharedui.utils.o.a((com.waze.shared_infra.o.a) this.receiver, nVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(Object obj, int i2, byte[] bArr) {
        super(1, obj, com.waze.sharedui.utils.o.class, "resString", "resString(Lcom/waze/shared_infra/string/StringProvider;Lcom/waze/ui/types/TextSource;)Ljava/lang/String;", 1);
        this.f19203a = i2;
    }
}
