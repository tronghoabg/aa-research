package com.bumptech.glide.load.a.a;

import com.bumptech.glide.g.r;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f2940a;

    b() {
        int i2 = r.f2918a;
        this.f2940a = new ArrayDeque(20);
    }

    abstract m a();

    final m b() {
        m mVar = (m) this.f2940a.poll();
        return mVar == null ? a() : mVar;
    }

    public final void c(m mVar) {
        Queue queue = this.f2940a;
        if (queue.size() < 20) {
            queue.offer(mVar);
        }
    }
}
