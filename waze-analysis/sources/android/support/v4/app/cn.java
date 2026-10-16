package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cn extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Rect f278a;

    cn(Rect rect) {
        this.f278a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f278a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
