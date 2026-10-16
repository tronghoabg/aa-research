package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cj extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Rect f267a;

    cj(Rect rect) {
        this.f267a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f267a;
    }
}
