package defpackage;

/* loaded from: classes3.dex */
final class xcm implements qse {
    final /* synthetic */ xco a;
    private int b = 31;

    public xcm(xco xcoVar) {
        this.a = xcoVar;
    }

    @Override // defpackage.qse
    public final void d(int i, long j, float[] fArr, byte[] bArr) {
        byte b = bArr[0];
        if (this.b == b) {
            return;
        }
        this.b = b;
        int i2 = b & 8;
        xco xcoVar = this.a;
        if (i2 == 0) {
            xcoVar.d.f("EVENT_CAR_PARKED", null);
        } else {
            xcoVar.d.f("EVENT_CAR_STARTED_MOVING", null);
        }
    }
}
