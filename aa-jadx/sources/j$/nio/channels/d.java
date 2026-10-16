package j$.nio.channels;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements j$.nio.channels.f {
    public final /* synthetic */ java.nio.channels.CompletionHandler a;

    public /* synthetic */ d(java.nio.channels.CompletionHandler completionHandler) {
        this.a = completionHandler;
    }

    public static /* synthetic */ j$.nio.channels.f b(java.nio.channels.CompletionHandler completionHandler) {
        if (completionHandler == null) {
            return null;
        }
        return completionHandler instanceof j$.nio.channels.e ? ((j$.nio.channels.e) completionHandler).a : new j$.nio.channels.d(completionHandler);
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Object obj2) {
        this.a.completed(obj, obj2);
    }

    public final /* synthetic */ void c(java.lang.Throwable th, java.lang.Object obj) {
        this.a.failed(th, obj);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.channels.CompletionHandler completionHandler = this.a;
        if (obj instanceof j$.nio.channels.d) {
            obj = ((j$.nio.channels.d) obj).a;
        }
        return completionHandler.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
