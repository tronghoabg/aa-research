package com.waze.network.b;

import androidx.core.app.NotificationCompat;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.network.g.a f32102a;

    /* renamed from: b, reason: collision with root package name */
    private final aa f32103b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32104c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f32105d;

    public w(com.waze.network.g.a aVar, aa aaVar, long j2) {
        h.g.b.x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        h.g.b.x.f(aaVar, "resultHandler");
        this.f32102a = aVar;
        this.f32103b = aaVar;
        this.f32104c = j2;
        this.f32105d = new AtomicReference(aVar);
    }

    public final long a() {
        return this.f32104c;
    }

    public final com.waze.network.g.a b() {
        return (com.waze.network.g.a) this.f32105d.get();
    }

    public final com.waze.network.g.a c() {
        return this.f32102a;
    }

    public final boolean d(bf bfVar) {
        h.g.b.x.f(bfVar, "result");
        if (((com.waze.network.g.a) this.f32105d.getAndSet(null)) == null) {
            return false;
        }
        this.f32103b.a(this.f32102a, bfVar);
        return true;
    }
}
