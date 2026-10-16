package j$.nio.channels;

import java.nio.channels.CompletionHandler;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements f {
    public final /* synthetic */ CompletionHandler a;

    public /* synthetic */ d(CompletionHandler completionHandler) {
        this.a = completionHandler;
    }

    public static /* synthetic */ f b(CompletionHandler completionHandler) {
        if (completionHandler == null) {
            return null;
        }
        return completionHandler instanceof e ? ((e) completionHandler).a : new d(completionHandler);
    }

    public final /* synthetic */ void a(Object obj, Object obj2) {
        this.a.completed(obj, obj2);
    }

    public final /* synthetic */ void c(Throwable th, Object obj) {
        this.a.failed(th, obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        CompletionHandler completionHandler = this.a;
        if (obj instanceof d) {
            obj = ((d) obj).a;
        }
        return completionHandler.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
