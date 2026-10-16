package j$.nio.channels;

import java.nio.channels.CompletionHandler;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class e implements CompletionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f49694a;

    public /* synthetic */ e(f fVar) {
        this.f49694a = fVar;
    }

    public static /* synthetic */ CompletionHandler a(f fVar) {
        if (fVar == null) {
            return null;
        }
        return fVar instanceof d ? ((d) fVar).f49693a : new e(fVar);
    }

    @Override // java.nio.channels.CompletionHandler
    public final /* synthetic */ void completed(Object obj, Object obj2) {
        ((d) this.f49694a).a(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        f fVar = this.f49694a;
        if (obj instanceof e) {
            obj = ((e) obj).f49694a;
        }
        return fVar.equals(obj);
    }

    @Override // java.nio.channels.CompletionHandler
    public final /* synthetic */ void failed(Throwable th, Object obj) {
        ((d) this.f49694a).c(th, obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49694a.hashCode();
    }
}
