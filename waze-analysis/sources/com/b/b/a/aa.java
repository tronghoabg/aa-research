package com.b.b.a;

import android.support.v4.app.bd;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2575a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f2576b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f2577c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f2578d;

    public aa(d dVar, com.b.b.c.a.d dVar2, com.b.a.a.b.f fVar) {
        this.f2577c = dVar2;
        this.f2576b = fVar;
        this.f2578d = new com.b.b.c.a.d();
        this.f2575a = new com.b.b.d.e(new com.b.b.d.t(new com.b.b.d.c(), new com.b.b.d.c()), new com.b.b.d.j(1, dVar.f(), dVar.c(), dVar.d(), dVar.b(), dVar.e()), dVar.h(), dVar.a(), dVar.g());
        fVar.f(this);
    }

    private final void q(Object[] objArr) throws com.b.b.b.a {
        try {
            byte[] bytes = ((com.b.b.c.a.d) this.f2577c).c(Arrays.asList(objArr)).getBytes(Charset.forName("UTF-8"));
            Object obj = this.f2576b;
            int length = bytes.length;
            ((com.b.a.a.b.f) obj).e(bytes);
        } catch (com.b.b.c.b e2) {
            throw new com.b.b.b.a(e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    final y a(com.b.b.d.v vVar) {
        return (y) this.f2576b.get(vVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    final y b(Class cls) {
        y yVar = new y(e(), new b(), cls);
        this.f2576b.put(yVar.f2615a, yVar);
        return yVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    final z c(com.b.b.d.w wVar) {
        com.b.b.d.v vVar = (com.b.b.d.v) this.f2578d.get(wVar);
        if (vVar != null) {
            return d(vVar);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    final z d(com.b.b.d.v vVar) {
        return (z) this.f2577c.get(vVar);
    }

    final com.b.b.d.v e() {
        return com.b.b.d.v.b(((AtomicInteger) this.f2575a).getAndIncrement());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    final void f(com.b.b.d.v vVar, com.b.b.d.w wVar) {
        this.f2578d.put(wVar, vVar);
        if (d(vVar) != null) {
            return;
        }
        i.a(String.format("Cannot find a subscription record for [%s]", vVar), new Object[0]);
        i.e();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    final void g(com.b.b.d.v vVar) {
        this.f2576b.remove(vVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    final void h(com.b.b.d.v vVar) {
        this.f2577c.remove(vVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    final z i(Class cls) {
        z zVar = new z(e(), new x(), cls);
        this.f2577c.put(zVar.f2618a, zVar);
        return zVar;
    }

    public final void j() throws com.b.b.b.a {
        q(new Object[]{6, new com.b.b.d.n("The client is shutting down"), "wamp.client_request.system_shutdown"});
    }

    public final void k() throws com.b.b.b.a {
        q(new Object[]{1, "spotify", this.f2575a});
    }

    public final void l(com.b.b.b bVar) {
        ((com.b.b.c.a.d) this.f2578d).d(bVar);
    }

    public final void m(byte[] bArr) {
        try {
            ((com.b.b.c.a.d) this.f2578d).e(new bd(((com.b.b.c.a.d) this.f2577c).a(new String(bArr, Charset.forName("UTF-8")))));
        } catch (com.b.b.c.b e2) {
            i.d(e2, new Object[0]);
        }
    }

    public final void n(int i2, String str) throws com.b.b.b.a {
        q(new Object[]{48, Integer.valueOf(i2), com.b.b.a.f2573a, str});
    }

    public final void o(int i2, String str, Object obj) throws com.b.b.b.a {
        q(new Object[]{48, Integer.valueOf(i2), com.b.b.a.f2573a, str, null, obj});
    }

    public final void p(int i2, String str) throws com.b.b.b.a {
        q(new Object[]{32, Integer.valueOf(i2), null, str});
    }

    public aa() {
        this.f2575a = new AtomicInteger(0);
        this.f2576b = new ConcurrentHashMap();
        this.f2577c = new ConcurrentHashMap();
        this.f2578d = new ConcurrentHashMap();
    }
}
