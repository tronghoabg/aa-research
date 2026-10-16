package defpackage;

/* loaded from: classes3.dex */
final class ztz implements zts {
    final /* synthetic */ float a;
    private final /* synthetic */ int b;

    public ztz(float f, int i) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.zts
    public final void a(ztt zttVar, int i, zys zysVar) {
        if (this.b != 0) {
            zysVar.b(aahu.CAMERA_UPDATE_ZOOM_TO);
            zttVar.v(this.a, i);
        } else {
            zysVar.b(aahu.CAMERA_UPDATE_ZOOM_BY);
            zttVar.t(this.a, i);
        }
    }

    public final String toString() {
        return this.b != 0 ? "CAMERA_UPDATE_ZOOM_TO" : "CAMERA_UPDATE_ZOOM_BY";
    }
}
