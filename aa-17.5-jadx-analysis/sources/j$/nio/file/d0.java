package j$.nio.file;

import java.nio.file.PathMatcher;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements f0 {
    public final /* synthetic */ PathMatcher a;

    public /* synthetic */ d0(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    @Override // j$.nio.file.f0
    public final /* synthetic */ boolean c(Path path) {
        return this.a.matches(y.h(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof d0) {
            obj = ((d0) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
