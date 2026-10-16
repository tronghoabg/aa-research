package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ViewLayer$Companion$getMatrix$1 extends y implements p<View, Matrix, ab> {
    public static final ViewLayer$Companion$getMatrix$1 INSTANCE = new ViewLayer$Companion$getMatrix$1();

    ViewLayer$Companion$getMatrix$1() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(View view, Matrix matrix) {
        invoke2(view, matrix);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View view, Matrix matrix) {
        matrix.set(view.getMatrix());
    }
}
