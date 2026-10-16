package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f27948a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f27949b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f27950c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f27951d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f27948a = linkedBlockingQueue;
        this.f27949b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f27950c.poll();
        this.f27951d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f27949b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f27950c.add(bVar);
        if (this.f27951d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.a
    public void a(b bVar) {
        this.f27951d = null;
        a();
    }
}
