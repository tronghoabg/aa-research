package defpackage;

/* loaded from: classes3.dex */
final class zua implements zts {
    final /* synthetic */ float a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    public zua(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.zts
    public final void a(ztt zttVar, int i, zys zysVar) {
        zysVar.b(aahu.CAMERA_UPDATE_ZOOM_BY_FIXING);
        zttVar.u(this.a, this.b, this.c, i);
    }

    public final String toString() {
        return "CAMERA_UPDATE_ZOOM_BY_FIXING";
    }
}
