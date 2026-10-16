package j$.nio.file;

import java.nio.file.WatchEvent;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class b0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WatchEvent.Kind f49741a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.f49741a;
        if (obj instanceof b0) {
            obj = ((b0) obj).f49741a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49741a.hashCode();
    }

    @Override // j$.nio.file.d0
    public final /* synthetic */ String name() {
        return this.f49741a.name();
    }

    @Override // j$.nio.file.d0
    public final /* synthetic */ Class type() {
        return this.f49741a.type();
    }
}
