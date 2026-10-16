package j$.nio.file;

import java.nio.file.WatchEvent;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements WatchEvent {
    public final /* synthetic */ r0 a;

    public /* synthetic */ q0(r0 r0Var) {
        this.a = r0Var;
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ Object context() {
        return a.g(((p0) this.a).a());
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ int count() {
        return ((p0) this.a).b();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        r0 r0Var = this.a;
        if (obj instanceof q0) {
            obj = ((q0) obj).a;
        }
        return r0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ WatchEvent.Kind kind() {
        return a.f(((p0) this.a).c());
    }
}
