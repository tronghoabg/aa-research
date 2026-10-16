package kc;

import ad.L;
import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import io.flutter.embedding.android.FlutterActivity;
import lc.C3458b;
import uc.C4281r;

/* loaded from: classes5.dex */
public final class b implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlutterActivity f39457a;

    public b(FlutterActivity flutterActivity) {
        this.f39457a = flutterActivity;
    }

    public final void onBackCancelled() {
        FlutterActivity flutterActivity = this.f39457a;
        if (flutterActivity.u("cancelBackGesture")) {
            f fVar = flutterActivity.f36963b;
            fVar.c();
            C3458b c3458b = fVar.f39463b;
            if (c3458b != null) {
                ((C4281r) c3458b.f40260j.f17515b).a("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        FlutterActivity flutterActivity = this.f39457a;
        if (flutterActivity.u("commitBackGesture")) {
            f fVar = flutterActivity.f36963b;
            fVar.c();
            C3458b c3458b = fVar.f39463b;
            if (c3458b != null) {
                ((C4281r) c3458b.f40260j.f17515b).a("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        FlutterActivity flutterActivity = this.f39457a;
        if (flutterActivity.u("updateBackGestureProgress")) {
            f fVar = flutterActivity.f36963b;
            fVar.c();
            C3458b c3458b = fVar.f39463b;
            if (c3458b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            L l10 = c3458b.f40260j;
            l10.getClass();
            ((C4281r) l10.f17515b).a("updateBackGestureProgress", L.f(backEvent), null);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        FlutterActivity flutterActivity = this.f39457a;
        if (flutterActivity.u("startBackGesture")) {
            f fVar = flutterActivity.f36963b;
            fVar.c();
            C3458b c3458b = fVar.f39463b;
            if (c3458b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            L l10 = c3458b.f40260j;
            l10.getClass();
            ((C4281r) l10.f17515b).a("startBackGesture", L.f(backEvent), null);
        }
    }
}
