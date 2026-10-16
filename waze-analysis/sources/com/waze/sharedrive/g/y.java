package com.waze.sharedrive.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class y extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f38756a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(Object obj, int i2) {
        super(1, obj, com.waze.sharedrive.e.at.class, "onSharingLocationChanged", "onSharingLocationChanged(Z)V", 0);
        this.f38756a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.f38756a != 0) {
            ((com.waze.sharedrive.e.r) this.receiver).f(((Boolean) obj).booleanValue());
            return h.ab.f48028a;
        }
        ((com.waze.sharedrive.e.at) this.receiver).r(((Boolean) obj).booleanValue());
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(Object obj, int i2, byte[] bArr) {
        super(1, obj, com.waze.sharedrive.e.r.class, "onLocationSharingEnabledChanged", "onLocationSharingEnabledChanged(Z)V", 0);
        this.f38756a = i2;
    }
}
