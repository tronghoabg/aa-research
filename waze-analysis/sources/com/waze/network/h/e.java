package com.waze.network.h;

import h.ab;
import h.g.a.l;
import h.g.b.w;
import h.g.b.x;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f32394a = new AtomicLong(0);

    /* renamed from: b, reason: collision with root package name */
    private final o f32395b = w.c(1, kotlinx.coroutines.a.a.f51271a, null, 4);

    /* renamed from: c, reason: collision with root package name */
    private final PriorityQueue f32396c = new PriorityQueue(new b());

    public static final /* synthetic */ a a(e eVar) {
        a aVar;
        PriorityQueue priorityQueue = eVar.f32396c;
        synchronized (priorityQueue) {
            aVar = (a) priorityQueue.poll();
        }
        return aVar;
    }

    public final Object b(h.c.e eVar) {
        Object objD = aj.d(new d(this, null), eVar);
        return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
    }

    public final void d(Comparable comparable, l lVar) {
        x.f(lVar, "task");
        a aVar = new a(comparable, this.f32394a.getAndIncrement(), lVar);
        PriorityQueue priorityQueue = this.f32396c;
        synchronized (priorityQueue) {
            priorityQueue.add(aVar);
        }
        this.f32395b.i(ab.f48028a);
    }
}
