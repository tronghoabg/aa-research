package com.waze.car_lib.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class q extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f18844a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(Object obj, int i2) {
        super(0, obj, ae.class, "onNewDriveClicked", "onNewDriveClicked()V", 0);
        this.f18844a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f18844a;
        if (i2 == 0) {
            ((ae) this.receiver).m();
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            ((ae) this.receiver).j();
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            ((ae) this.receiver).l();
            return h.ab.f48028a;
        }
        Object obj = this.receiver;
        if (i2 != 3) {
            ((ae) obj).n();
            return h.ab.f48028a;
        }
        ((ae) obj).i();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(Object obj, int i2, byte[] bArr) {
        super(0, obj, ae.class, "onAddStopClicked", "onAddStopClicked()V", 0);
        this.f18844a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(Object obj, int i2, char[] cArr) {
        super(0, obj, ae.class, "onCloseClicked", "onCloseClicked()V", 0);
        this.f18844a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(Object obj, int i2, int[] iArr) {
        super(0, obj, ae.class, "onReportClicked", "onReportClicked()V", 0);
        this.f18844a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(Object obj, int i2, short[] sArr) {
        super(0, obj, ae.class, "onAdInfoClicked", "onAdInfoClicked()V", 0);
        this.f18844a = i2;
    }
}
