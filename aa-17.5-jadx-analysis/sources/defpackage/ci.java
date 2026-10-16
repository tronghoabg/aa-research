package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes2.dex */
final class ci extends Transition.EpicenterCallback {
    final /* synthetic */ Rect a;

    public ci(Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        Rect rect = this.a;
        if (rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
