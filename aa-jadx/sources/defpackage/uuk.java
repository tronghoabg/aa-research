package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class uuk implements defpackage.uum {
    final /* synthetic */ android.view.View a;
    private final /* synthetic */ int b;

    public uuk(android.view.View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // defpackage.uum
    public final boolean a(android.view.MotionEvent motionEvent) {
        int i = this.b;
        android.view.View view = this.a;
        return i != 0 ? super/*android.view.SurfaceView*/.onHoverEvent(motionEvent) : super/*android.view.TextureView*/.onHoverEvent(motionEvent);
    }
}
