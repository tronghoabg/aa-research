package androidx.core.os;

import android.os.Handler;
import h.ab;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class HandlerKt {
    public static final Runnable postAtTime(Handler handler, long j2, Object obj, a<ab> aVar) {
        x.f(handler, "<this>");
        x.f(aVar, "action");
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(aVar);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j2);
        return handlerKt$postAtTime$runnable$1;
    }

    public static /* synthetic */ Runnable postAtTime$default(Handler handler, long j2, Object obj, a aVar, int i2, Object obj2) {
        x.f(handler, "<this>");
        x.f(aVar, "action");
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(aVar);
        if ((i2 & 2) != 0) {
            obj = null;
        }
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j2);
        return handlerKt$postAtTime$runnable$1;
    }

    public static final Runnable postDelayed(Handler handler, long j2, Object obj, a<ab> aVar) {
        x.f(handler, "<this>");
        x.f(aVar, "action");
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(aVar);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j2);
            return handlerKt$postDelayed$runnable$1;
        }
        HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j2);
        return handlerKt$postDelayed$runnable$1;
    }

    public static /* synthetic */ Runnable postDelayed$default(Handler handler, long j2, Object obj, a aVar, int i2, Object obj2) {
        x.f(handler, "<this>");
        x.f(aVar, "action");
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(aVar);
        if ((i2 & 2) != 0) {
            obj = null;
        }
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j2);
            return handlerKt$postDelayed$runnable$1;
        }
        HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j2);
        return handlerKt$postDelayed$runnable$1;
    }
}
