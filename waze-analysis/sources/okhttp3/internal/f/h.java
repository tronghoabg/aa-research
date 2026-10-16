package okhttp3.internal.f;

import java.net.Socket;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Socket f56182a;

    /* renamed from: b, reason: collision with root package name */
    public String f56183b;

    /* renamed from: c, reason: collision with root package name */
    public k.j f56184c;

    /* renamed from: d, reason: collision with root package name */
    public k.i f56185d;

    /* renamed from: e, reason: collision with root package name */
    private final okhttp3.internal.b.e f56186e;

    /* renamed from: f, reason: collision with root package name */
    private j f56187f;

    /* renamed from: g, reason: collision with root package name */
    private final ai f56188g;

    public h(okhttp3.internal.b.e eVar) {
        h.g.b.x.f(eVar, "taskRunner");
        this.f56186e = eVar;
        this.f56187f = j.f56189b;
        this.f56188g = ai.f56137a;
    }

    public final okhttp3.internal.b.e a() {
        return this.f56186e;
    }

    public final h b(j jVar) {
        h.g.b.x.f(jVar, "listener");
        this.f56187f = jVar;
        return this;
    }

    public final j c() {
        return this.f56187f;
    }

    public final ai d() {
        return this.f56188g;
    }
}
