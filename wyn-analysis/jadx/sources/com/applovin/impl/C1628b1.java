package com.applovin.impl;

import A.AbstractC0213f;
import android.os.Handler;
import cb.AbstractC1593a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1628b1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21116a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f21117b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f21118c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f21119d = new AtomicInteger();

    /* renamed from: com.applovin.impl.b1$b */
    public interface b {
        void a();

        boolean b();
    }

    /* renamed from: com.applovin.impl.b1$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f21120a;

        /* renamed from: b, reason: collision with root package name */
        private final b f21121b;

        /* renamed from: c, reason: collision with root package name */
        private final long f21122c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f21120a;
            String str2 = ((c) obj).f21120a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f21120a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("CountdownProxy{identifier='");
            sb2.append(this.f21120a);
            sb2.append("', countdownStepMillis=");
            return AbstractC0213f.e(sb2, this.f21122c, '}');
        }

        private c(String str, long j8, b bVar) {
            this.f21120a = str;
            this.f21122c = j8;
            this.f21121b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a() {
            return this.f21121b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f21122c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f21120a;
        }
    }

    public C1628b1(Handler handler, com.applovin.impl.sdk.k kVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f21117b = handler;
        this.f21116a = kVar.O();
    }

    public void b() {
        HashSet hashSet = new HashSet(this.f21118c);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21116a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.f21119d.incrementAndGet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21116a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + iIncrementAndGet + "...");
            }
            a(cVar, iIncrementAndGet);
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21116a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f21119d.incrementAndGet();
        this.f21117b.removeCallbacksAndMessages(null);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21116a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f21118c.clear();
    }

    public void a(String str, long j8, b bVar) {
        if (j8 > 0) {
            if (this.f21117b != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    AbstractC1593a.s("Adding countdown: ", str, this.f21116a, "CountdownManager");
                }
                this.f21118c.add(new c(str, j8, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i5) {
        b bVarA = cVar.a();
        if (bVarA.b()) {
            if (this.f21119d.get() == i5) {
                try {
                    bVarA.a();
                    a(cVar, i5);
                    return;
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21116a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f21116a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            AbstractC1593a.w(new StringBuilder("Ending countdown for "), cVar.c(), this.f21116a, "CountdownManager");
        }
    }

    private void a(c cVar, int i5) {
        this.f21117b.postDelayed(new D(this, cVar, i5, 0), cVar.b());
    }
}
