package com.applovin.impl;

import android.os.Process;
import j1.InterfaceC3073a;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b4 {

    /* renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f21123a = new PriorityBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21124b;

    public static class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final BlockingQueue f21125a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f21126b;

        private void a() {
            b((c) this.f21125a.take());
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private b(BlockingQueue blockingQueue, int i5, com.applovin.impl.sdk.k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f21125a = blockingQueue;
            this.f21126b = kVar;
            setPriority(((Integer) kVar.a(y4.f23688S)).intValue());
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x00d1 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #12 {all -> 0x00dd, blocks: (B:57:0x00b9, B:59:0x00d1, B:80:0x0108, B:64:0x00e2, B:67:0x00ee, B:79:0x0107, B:78:0x0104, B:75:0x00ff, B:65:0x00e6), top: B:108:0x00b9, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(com.applovin.impl.b4.c r17) {
            /*
                Method dump skipped, instructions count: 349
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b4.b.b(com.applovin.impl.b4$c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f21133f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f21128a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f21129b);
            httpURLConnection.setConnectTimeout(cVar.f21132e);
            httpURLConnection.setReadTimeout(cVar.f21132e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f21130c.isEmpty()) {
                for (Map.Entry entry : cVar.f21130c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    public static class c implements Comparable {

        /* renamed from: i, reason: collision with root package name */
        private static final AtomicInteger f21127i = new AtomicInteger();

        /* renamed from: a, reason: collision with root package name */
        private final String f21128a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21129b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f21130c;

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f21131d;

        /* renamed from: e, reason: collision with root package name */
        private final int f21132e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC3073a f21133f;

        /* renamed from: g, reason: collision with root package name */
        private final Executor f21134g;

        /* renamed from: h, reason: collision with root package name */
        private final int f21135h;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f21136a;

            /* renamed from: b, reason: collision with root package name */
            private String f21137b;

            /* renamed from: c, reason: collision with root package name */
            private Map f21138c = new HashMap();

            /* renamed from: d, reason: collision with root package name */
            private byte[] f21139d;

            /* renamed from: e, reason: collision with root package name */
            private int f21140e;

            /* renamed from: f, reason: collision with root package name */
            private InterfaceC3073a f21141f;

            /* renamed from: g, reason: collision with root package name */
            private Executor f21142g;

            public a a(String str) {
                this.f21136a = str;
                return this;
            }

            public a b(String str) {
                this.f21137b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f21138c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.f21138c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.f21139d = bArr;
                return this;
            }

            public a a(int i5) {
                this.f21140e = i5;
                return this;
            }

            public a a(InterfaceC3073a interfaceC3073a) {
                this.f21141f = interfaceC3073a;
                return this;
            }

            public a a(Executor executor) {
                this.f21142g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f21135h - cVar.f21135h;
        }

        private c(a aVar) {
            this.f21128a = aVar.f21136a;
            this.f21129b = aVar.f21137b;
            this.f21130c = aVar.f21138c != null ? aVar.f21138c : Collections.EMPTY_MAP;
            this.f21131d = aVar.f21139d;
            this.f21132e = aVar.f21140e;
            this.f21133f = aVar.f21141f;
            this.f21134g = aVar.f21142g;
            this.f21135h = f21127i.incrementAndGet();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f21143a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f21144b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f21145c;

        /* renamed from: d, reason: collision with root package name */
        private final long f21146d;

        /* renamed from: e, reason: collision with root package name */
        private final Throwable f21147e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f21148a;

            /* renamed from: b, reason: collision with root package name */
            private byte[] f21149b;

            /* renamed from: c, reason: collision with root package name */
            private byte[] f21150c;

            /* renamed from: d, reason: collision with root package name */
            private long f21151d;

            /* renamed from: e, reason: collision with root package name */
            private Throwable f21152e;

            public a a(int i5) {
                this.f21148a = i5;
                return this;
            }

            public a b(byte[] bArr) {
                this.f21150c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.f21149b = bArr;
                return this;
            }

            public a a(Throwable th) {
                this.f21152e = th;
                return this;
            }

            public a a(long j8) {
                this.f21151d = j8;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f21143a;
        }

        public int c() throws Throwable {
            Throwable th = this.f21147e;
            if (th == null) {
                return this.f21143a;
            }
            throw th;
        }

        public byte[] d() throws Throwable {
            Throwable th = this.f21147e;
            if (th == null) {
                return this.f21144b;
            }
            throw th;
        }

        public long e() {
            return this.f21146d;
        }

        public byte[] f() {
            return this.f21145c;
        }

        private d(a aVar) {
            this.f21143a = aVar.f21148a;
            this.f21144b = aVar.f21149b;
            this.f21145c = aVar.f21150c;
            this.f21146d = aVar.f21151d;
            this.f21147e = aVar.f21152e;
        }
    }

    public b4(com.applovin.impl.sdk.k kVar) {
        this.f21124b = kVar;
    }

    public void a() {
        for (int i5 = 0; i5 < ((Integer) this.f21124b.a(y4.f23680R)).intValue(); i5++) {
            new b(this.f21123a, i5, this.f21124b).start();
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f21123a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}
