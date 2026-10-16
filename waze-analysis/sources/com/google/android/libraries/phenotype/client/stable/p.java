package com.google.android.libraries.phenotype.client.stable;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6144a;

    /* synthetic */ p() {
        this.f6144a = new ConcurrentHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public static /* synthetic */ void a(p pVar, String str) {
        p pVar2 = (p) pVar.f6144a.get(str);
        if (pVar2 != null) {
            pVar2.i();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public static /* synthetic */ boolean b(p pVar, String str, String str2) {
        return ((p) pVar.f6144a.get(str)) != null && str2.equals("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public static /* bridge */ /* synthetic */ boolean c(p pVar, Collection collection) {
        boolean zH = false;
        if (collection != null) {
            if (collection.isEmpty()) {
                return false;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                p pVar2 = (p) pVar.f6144a.get((String) it.next());
                if (pVar2 != null) {
                    zH |= pVar2.h();
                }
            }
        }
        return zH;
    }

    public static p f(int i2) {
        return new p(com.google.e.a.k.a.b(com.google.e.a.e.al.b(i2)));
    }

    public static p g(byte[] bArr) {
        return new p(com.google.e.a.k.a.b(bArr));
    }

    public final int d() {
        return ((com.google.e.a.k.a) this.f6144a).a();
    }

    public final byte[] e() {
        return ((com.google.e.a.k.a) this.f6144a).c();
    }

    public final boolean h() {
        return q.j((q) this.f6144a);
    }

    public final void i() {
        ((q) this.f6144a).q();
    }

    public final q j() {
        com.google.d.b.an.l(true);
        return (q) this.f6144a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.libraries.phenotype.client.stable.r, java.lang.Object] */
    public final k k() {
        return new g(this.f6144a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final p l(final com.google.android.libraries.phenotype.client.h hVar, final n nVar) {
        final boolean[] zArr = new boolean[1];
        p pVar = (p) ConcurrentMap.EL.computeIfAbsent(this.f6144a, nVar.b(hVar.a()), new Function() { // from class: com.google.android.libraries.phenotype.client.stable.o
            public final /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                p pVar2 = new p(new q(hVar, nVar));
                zArr[0] = true;
                return pVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (zArr[0]) {
            if (hVar.f().h(com.google.g.a.a.b.FILE)) {
                aq.a(hVar.a(), new com.google.firebase.messaging.l(this), new com.google.firebase.messaging.l(this));
                return pVar;
            }
            aq.a(hVar.a(), null, new com.google.firebase.messaging.l(this));
        }
        return pVar;
    }

    public p(r rVar) {
        this.f6144a = rVar;
    }

    private p(com.google.e.a.k.a aVar) {
        this.f6144a = aVar;
    }

    /* synthetic */ p(q qVar) {
        this.f6144a = qVar;
    }
}
