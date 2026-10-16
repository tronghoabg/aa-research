package j$.nio.file;

import java.nio.file.WatchEvent;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements r0 {
    public final /* synthetic */ WatchEvent a;

    public /* synthetic */ p0(WatchEvent watchEvent) {
        this.a = watchEvent;
    }

    public final /* synthetic */ Object a() {
        return a.g(this.a.context());
    }

    public final /* synthetic */ int b() {
        return this.a.count();
    }

    public final /* synthetic */ l0 c() {
        return a.b(this.a.kind());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent watchEvent = this.a;
        if (obj instanceof p0) {
            obj = ((p0) obj).a;
        }
        return watchEvent.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
