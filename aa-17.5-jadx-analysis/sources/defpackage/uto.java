package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
final class uto implements utq {
    final /* synthetic */ View a;
    private final /* synthetic */ int b;

    public uto(View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // defpackage.utq
    public final boolean a(MotionEvent motionEvent) {
        int i = this.b;
        View view = this.a;
        return i != 0 ? super/*android.view.SurfaceView*/.onHoverEvent(motionEvent) : super/*android.view.TextureView*/.onHoverEvent(motionEvent);
    }
}
