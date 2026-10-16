package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f28075a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f28076b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f28077c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f28078d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f28075a = linkedBlockingQueue;
        this.f28076b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f28077c.poll();
        this.f28078d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f28076b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f28077c.add(bVar);
        if (this.f28078d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.a
    public void a(b bVar) {
        this.f28078d = null;
        a();
    }
}
