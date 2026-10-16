package j$.nio.channels;

import java.nio.channels.CompletionHandler;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CompletionHandler f49693a;

    public /* synthetic */ d(CompletionHandler completionHandler) {
        this.f49693a = completionHandler;
    }

    public static /* synthetic */ f b(CompletionHandler completionHandler) {
        if (completionHandler == null) {
            return null;
        }
        return completionHandler instanceof e ? ((e) completionHandler).f49694a : new d(completionHandler);
    }

    public final /* synthetic */ void a(Object obj, Object obj2) {
        this.f49693a.completed(obj, obj2);
    }

    public final /* synthetic */ void c(Throwable th, Object obj) {
        this.f49693a.failed(th, obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        CompletionHandler completionHandler = this.f49693a;
        if (obj instanceof d) {
            obj = ((d) obj).f49693a;
        }
        return completionHandler.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49693a.hashCode();
    }
}
