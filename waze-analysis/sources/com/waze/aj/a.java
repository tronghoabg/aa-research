package com.waze.aj;

import com.waze.shared_infra.i.e;
import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    Object f14071a;

    /* renamed from: b, reason: collision with root package name */
    Object f14072b;

    /* renamed from: c, reason: collision with root package name */
    Object f14073c;

    /* renamed from: d, reason: collision with root package name */
    int f14074d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ p f14075e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f14076f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f14077g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ e f14078h;

    /* renamed from: i, reason: collision with root package name */
    private /* synthetic */ Object f14079i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(p pVar, Object obj, Object obj2, e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f14075e = pVar;
        this.f14076f = obj;
        this.f14077g = obj2;
        this.f14078h = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        a aVar = new a(this.f14075e, this.f14076f, this.f14077g, this.f14078h, eVar);
        aVar.f14079i = obj;
        return aVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (r5.emit(r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.f14074d
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 == r2) goto Le
            e.b.c.b(r9)
            goto La3
        Le:
            java.lang.Object r1 = r8.f14073c
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r8.f14072b
            kotlinx.coroutines.b.l r3 = (kotlinx.coroutines.b.l) r3
            java.lang.Object r4 = r8.f14071a
            com.waze.shared_infra.i.e r4 = (com.waze.shared_infra.i.e) r4
            java.lang.Object r5 = r8.f14079i
            kotlinx.coroutines.b.l r5 = (kotlinx.coroutines.b.l) r5
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L22
            goto L3d
        L22:
            r9 = move-exception
            goto L77
        L24:
            e.b.c.b(r9)
            java.lang.Object r9 = r8.f14079i
            r3 = r9
            kotlinx.coroutines.b.l r3 = (kotlinx.coroutines.b.l) r3
            h.g.a.p r9 = r8.f14075e
            java.lang.Object r1 = r8.f14076f
            java.lang.Object r4 = r8.f14077g
            com.waze.shared_infra.i.e r5 = r8.f14078h
            java.lang.Object r9 = r9.invoke(r1, r4)     // Catch: java.lang.Throwable -> L75
            r1 = r9
            java.util.Iterator r1 = (java.util.Iterator) r1     // Catch: java.lang.Throwable -> L75
            r4 = r5
            r5 = r3
        L3d:
            boolean r9 = r1.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r9 == 0) goto L72
            java.lang.Object r9 = r1.next()     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r6.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r7 = "Received new response: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L22
            r6.append(r9)     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L22
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Throwable -> L22
            r4.a(r6)     // Catch: java.lang.Throwable -> L22
            h.m r9 = h.m.d(r9)     // Catch: java.lang.Throwable -> L22
            r8.f14079i = r5     // Catch: java.lang.Throwable -> L22
            r8.f14071a = r4     // Catch: java.lang.Throwable -> L22
            r8.f14072b = r3     // Catch: java.lang.Throwable -> L22
            r8.f14073c = r1     // Catch: java.lang.Throwable -> L22
            r8.f14074d = r2     // Catch: java.lang.Throwable -> L22
            java.lang.Object r9 = r3.emit(r9, r8)     // Catch: java.lang.Throwable -> L22
            if (r9 != r0) goto L3d
            goto La2
        L72:
            h.ab r9 = h.ab.f48028a     // Catch: java.lang.Throwable -> L22
            goto L7b
        L75:
            r9 = move-exception
            r5 = r3
        L77:
            java.lang.Object r9 = e.b.c.a(r9)
        L7b:
            java.lang.Throwable r1 = h.m.c(r9)
            if (r1 == 0) goto La3
            com.waze.shared_infra.i.e r2 = r8.f14078h
            java.lang.String r3 = "gRPC streaming call failed"
            r2.c(r3, r1)
            java.lang.Object r1 = e.b.c.a(r1)
            h.m r1 = h.m.d(r1)
            r8.f14079i = r9
            r9 = 0
            r8.f14071a = r9
            r8.f14072b = r9
            r8.f14073c = r9
            r9 = 2
            r8.f14074d = r9
            java.lang.Object r8 = r5.emit(r1, r8)
            if (r8 != r0) goto La3
        La2:
            return r0
        La3:
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.aj.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
