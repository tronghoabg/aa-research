package com.bumptech.glide.load.c.d;

import com.bumptech.glide.g.r;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f3398a;

    a() {
        int i2 = r.f2918a;
        this.f3398a = new ArrayDeque(0);
    }

    final synchronized com.bumptech.glide.b.d a(ByteBuffer byteBuffer) {
        com.bumptech.glide.b.d dVar;
        dVar = (com.bumptech.glide.b.d) this.f3398a.poll();
        if (dVar == null) {
            dVar = new com.bumptech.glide.b.d();
        }
        dVar.c(byteBuffer);
        return dVar;
    }

    final synchronized void b(com.bumptech.glide.b.d dVar) {
        dVar.b();
        this.f3398a.offer(dVar);
    }
}
