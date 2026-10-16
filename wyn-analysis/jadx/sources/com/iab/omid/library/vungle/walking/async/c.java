package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.walking.async.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f28238a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f28239b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f28240c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f28241d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f28238a = linkedBlockingQueue;
        this.f28239b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f28240c.poll();
        this.f28241d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f28239b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f28240c.add(bVar);
        if (this.f28241d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.a
    public void a(b bVar) {
        this.f28241d = null;
        a();
    }
}
