package j$.nio.channels;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements java.nio.channels.CompletionHandler {
    public final /* synthetic */ j$.nio.channels.f a;

    public /* synthetic */ e(j$.nio.channels.f fVar) {
        this.a = fVar;
    }

    public static /* synthetic */ java.nio.channels.CompletionHandler a(j$.nio.channels.f fVar) {
        if (fVar == null) {
            return null;
        }
        return fVar instanceof j$.nio.channels.d ? ((j$.nio.channels.d) fVar).a : new j$.nio.channels.e(fVar);
    }

    @Override // java.nio.channels.CompletionHandler
    public final /* synthetic */ void completed(java.lang.Object obj, java.lang.Object obj2) {
        ((j$.nio.channels.d) this.a).a(obj, obj2);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.channels.f fVar = this.a;
        if (obj instanceof j$.nio.channels.e) {
            obj = ((j$.nio.channels.e) obj).a;
        }
        return fVar.equals(obj);
    }

    @Override // java.nio.channels.CompletionHandler
    public final /* synthetic */ void failed(java.lang.Throwable th, java.lang.Object obj) {
        ((j$.nio.channels.d) this.a).c(th, obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
