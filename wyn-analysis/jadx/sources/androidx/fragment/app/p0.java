package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class p0 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f18522b;

    public /* synthetic */ p0(int i5, Rect rect) {
        this.f18521a = i5;
        this.f18522b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f18521a) {
            case 0:
                return this.f18522b;
            default:
                Rect rect = this.f18522b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
