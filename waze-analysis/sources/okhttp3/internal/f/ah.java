package okhttp3.internal.f;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class ah implements ai {
    @Override // okhttp3.internal.f.ai
    public final void a(k.j jVar, int i2) {
        h.g.b.x.f(jVar, "source");
        jVar.Q(i2);
    }

    @Override // okhttp3.internal.f.ai
    public final void b(List list) {
        h.g.b.x.f(list, "responseHeaders");
    }

    @Override // okhttp3.internal.f.ai
    public final void c(List list) {
        h.g.b.x.f(list, "requestHeaders");
    }

    @Override // okhttp3.internal.f.ai
    public final void d(b bVar) {
        h.g.b.x.f(bVar, "errorCode");
    }
}
