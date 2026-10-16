package com.google.firebase.components;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u implements com.google.firebase.e.c, com.google.firebase.e.b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f8973a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue f8974b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f8975c;

    u(Executor executor) {
        this.f8975c = executor;
    }

    private final synchronized Set d() {
        throw null;
    }

    final void a() {
        Queue<com.google.firebase.e.a> queue;
        synchronized (this) {
            queue = this.f8974b;
            if (queue != null) {
                this.f8974b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (com.google.firebase.e.a aVar : queue) {
                com.google.firebase.concurrent.v.d(aVar);
                synchronized (this) {
                    Queue queue2 = this.f8974b;
                    if (queue2 != null) {
                        queue2.add(aVar);
                    } else {
                        for (Map.Entry entry : d()) {
                            ((Executor) entry.getValue()).execute(new android.support.v7.app.p(entry, 4));
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.firebase.e.c
    public final void b(Class cls, com.google.firebase.messaging.p pVar) {
        c(cls, this.f8975c, pVar);
    }

    public final synchronized void c(Class cls, Executor executor, com.google.firebase.messaging.p pVar) {
        com.google.firebase.concurrent.v.d(pVar);
        com.google.firebase.concurrent.v.d(executor);
        Map map = this.f8973a;
        if (!map.containsKey(cls)) {
            map.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) map.get(cls)).put(pVar, executor);
    }
}
