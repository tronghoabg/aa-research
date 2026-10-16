package com.waze.ab.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class k extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f13729a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(Object obj, int i2) {
        super(0, obj, n.class, "onExistingPictureClicked", "onExistingPictureClicked()V", 0);
        this.f13729a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f13729a;
        Object obj = this.receiver;
        if (i2 != 0) {
            ((n) obj).i();
            return h.ab.f48028a;
        }
        ((n) obj).e();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(Object obj, int i2, byte[] bArr) {
        super(0, obj, n.class, "onTakePhotoClicked", "onTakePhotoClicked()V", 0);
        this.f13729a = i2;
    }
}
