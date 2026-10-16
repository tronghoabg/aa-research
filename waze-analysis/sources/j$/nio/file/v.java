package j$.nio.file;

import java.nio.file.PathMatcher;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class v implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PathMatcher f49781a;

    public /* synthetic */ v(PathMatcher pathMatcher) {
        this.f49781a = pathMatcher;
    }

    @Override // j$.nio.file.x
    public final /* synthetic */ boolean e(Path path) {
        return this.f49781a.matches(q.f(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.f49781a;
        if (obj instanceof v) {
            obj = ((v) obj).f49781a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49781a.hashCode();
    }
}
