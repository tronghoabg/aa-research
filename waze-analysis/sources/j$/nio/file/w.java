package j$.nio.file;

import java.nio.file.PathMatcher;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class w implements PathMatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f49782a;

    public /* synthetic */ w(x xVar) {
        this.f49782a = xVar;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        x xVar = this.f49782a;
        if (obj instanceof w) {
            obj = ((w) obj).f49782a;
        }
        return xVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49782a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(java.nio.file.Path path) {
        return this.f49782a.e(p.f(path));
    }
}
