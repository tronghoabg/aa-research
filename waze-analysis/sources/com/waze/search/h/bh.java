package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class bh extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f35827a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(Object obj, int i2) {
        super(0, obj, bx.class, "handleCalendarPermissionClicked", "handleCalendarPermissionClicked()V", 0);
        this.f35827a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f35827a;
        Object obj = this.receiver;
        if (i2 != 0) {
            bx.k((bx) obj);
            return h.ab.f48028a;
        }
        bx.j((bx) obj);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(Object obj, int i2, byte[] bArr) {
        super(0, obj, bx.class, "handleContactPermissionClicked", "handleContactPermissionClicked()V", 0);
        this.f35827a = i2;
    }
}
