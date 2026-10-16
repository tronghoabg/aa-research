package e.a.d;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k implements en {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f47265a = new AtomicLong();

    k() {
    }

    @Override // e.a.d.en
    public final void a() {
        this.f47265a.getAndAdd(1L);
    }
}
