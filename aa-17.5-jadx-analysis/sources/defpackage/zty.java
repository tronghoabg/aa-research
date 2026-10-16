package defpackage;

/* loaded from: classes3.dex */
final class zty implements zts {
    private final /* synthetic */ int a;

    public zty(int i) {
        this.a = i;
    }

    @Override // defpackage.zts
    public final void a(ztt zttVar, int i, zys zysVar) {
        if (this.a != 0) {
            zysVar.b(aahu.CAMERA_UPDATE_ZOOM_IN);
            zttVar.t(1.0f, i);
        } else {
            zysVar.b(aahu.CAMERA_UPDATE_ZOOM_OUT);
            zttVar.t(-1.0f, i);
        }
    }

    public final String toString() {
        return this.a != 0 ? "CAMERA_UPDATE_ZOOM_IN" : "CAMERA_UPDATE_ZOOM_OUT";
    }
}
