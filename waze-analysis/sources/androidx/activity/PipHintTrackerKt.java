package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import h.ab;
import h.c.a.a;
import h.c.e;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PipHintTrackerKt {
    public static final Object trackPipAnimationHintView(final Activity activity, View view, e<? super ab> eVar) {
        Object objCollect = ai.n(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new l() { // from class: androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.2
            public final Object emit(Rect rect, e<? super ab> eVar2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return ab.f48028a;
            }

            @Override // kotlinx.coroutines.b.l
            public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar2) {
                return emit((Rect) obj, (e<? super ab>) eVar2);
            }
        }, eVar);
        return objCollect == a.f48038a ? objCollect : ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
