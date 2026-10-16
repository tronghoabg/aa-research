package androidx.work;

import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class LoggerExtKt {
    public static final void logd(String str, Throwable th, a<String> aVar) {
        x.f(str, "tag");
        x.f(th, "t");
        x.f(aVar, "block");
        Logger.get().debug(str, aVar.invoke(), th);
    }

    public static final void loge(String str, Throwable th, a<String> aVar) {
        x.f(str, "tag");
        x.f(th, "t");
        x.f(aVar, "block");
        Logger.get().error(str, aVar.invoke(), th);
    }

    public static final void logi(String str, Throwable th, a<String> aVar) {
        x.f(str, "tag");
        x.f(th, "t");
        x.f(aVar, "block");
        Logger.get().info(str, aVar.invoke(), th);
    }

    public static final void logd(String str, a<String> aVar) {
        x.f(str, "tag");
        x.f(aVar, "block");
        Logger.get().debug(str, aVar.invoke());
    }

    public static final void loge(String str, a<String> aVar) {
        x.f(str, "tag");
        x.f(aVar, "block");
        Logger.get().error(str, aVar.invoke());
    }

    public static final void logi(String str, a<String> aVar) {
        x.f(str, "tag");
        x.f(aVar, "block");
        Logger.get().info(str, aVar.invoke());
    }
}
