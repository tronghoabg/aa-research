package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes2.dex */
final class ce extends Transition.EpicenterCallback {
    final /* synthetic */ Rect a;

    public ce(Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}
