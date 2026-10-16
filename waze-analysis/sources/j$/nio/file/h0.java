package j$.nio.file;

import java.nio.file.WatchEvent;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class h0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WatchEvent f49752a;

    public final /* synthetic */ Object a() {
        return a.g(this.f49752a.context());
    }

    public final /* synthetic */ int b() {
        return this.f49752a.count();
    }

    public final /* synthetic */ d0 c() {
        return a.b(this.f49752a.kind());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent watchEvent = this.f49752a;
        if (obj instanceof h0) {
            obj = ((h0) obj).f49752a;
        }
        return watchEvent.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49752a.hashCode();
    }
}
