package com.waze.map.e;

import h.ab;
import h.g.a.q;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class d extends h.c.b.a.g implements q {

    /* renamed from: a, reason: collision with root package name */
    int f28795a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f28796b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f28797c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f28798d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f28799e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f28800f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(i iVar, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, h.c.e eVar) {
        super(3, eVar);
        this.f28797c = iVar;
        this.f28798d = atomicBoolean;
        this.f28799e = atomicBoolean2;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        d dVar = new d(this.f28797c, this.f28798d, this.f28799e, (h.c.e) obj3);
        dVar.f28800f = (l) obj;
        dVar.f28796b = (com.waze.z.a.e.b) obj2;
        return dVar.invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r10.f28795a
            if (r1 == 0) goto Lb
            e.b.c.b(r11)
            goto La4
        Lb:
            e.b.c.b(r11)
            java.lang.Object r11 = r10.f28800f
            kotlinx.coroutines.b.l r11 = (kotlinx.coroutines.b.l) r11
            java.lang.Object r1 = r10.f28796b
            com.waze.z.a.e.b r1 = (com.waze.z.a.e.b) r1
            java.util.concurrent.atomic.AtomicBoolean r2 = r10.f28798d
            boolean r3 = r1 instanceof com.waze.map.b.ce
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L22
            r2.set(r4)
            goto L31
        L22:
            boolean r6 = r1 instanceof com.waze.map.b.cd
            if (r6 == 0) goto L2a
            r2.set(r5)
            goto L31
        L2a:
            boolean r6 = r1 instanceof com.waze.map.b.cf
            if (r6 == 0) goto L31
            r2.set(r5)
        L31:
            java.util.concurrent.atomic.AtomicBoolean r6 = r10.f28799e
            boolean r7 = r1 instanceof com.waze.map.b.cc
            if (r7 != 0) goto L38
            goto L52
        L38:
            r8 = r1
            com.waze.map.b.cc r8 = (com.waze.map.b.cc) r8
            com.waze.destination_cell.b.e r8 = r8.j()
            boolean r9 = r8 instanceof com.waze.map.b.cn
            if (r9 == 0) goto L4f
            com.waze.map.b.cn r8 = (com.waze.map.b.cn) r8
            com.waze.z.a.e.b r5 = r8.h()
            boolean r5 = r5 instanceof com.waze.map.b.cl
            r6.set(r5)
            goto L52
        L4f:
            r6.set(r5)
        L52:
            if (r3 != 0) goto La4
            boolean r3 = r1 instanceof com.waze.map.b.cd
            if (r3 == 0) goto L59
            goto L77
        L59:
            boolean r3 = r1 instanceof com.waze.map.b.cf
            if (r3 == 0) goto L64
            boolean r2 = r6.get()
            if (r2 != 0) goto La4
            goto L77
        L64:
            if (r7 == 0) goto L9e
            boolean r2 = r2.get()
            if (r2 != 0) goto La4
            r2 = r1
            com.waze.map.b.cc r2 = (com.waze.map.b.cc) r2
            com.waze.destination_cell.b.e r2 = r2.j()
            boolean r2 = r2 instanceof com.waze.map.b.cn
            if (r2 != 0) goto La4
        L77:
            com.waze.map.e.i r2 = r10.f28797c
            com.waze.shared_infra.i.e r3 = com.waze.map.e.i.b(r2)
            java.util.Objects.toString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r5 = "Recenter event: "
            java.lang.String r1 = r5.concat(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3.a(r1)
            r1 = r10
            h.c.e r1 = (h.c.e) r1
            r3 = 0
            r10.f28800f = r3
            r10.f28795a = r4
            java.lang.Object r10 = com.waze.map.e.i.c(r2, r11, r1)
            if (r10 != r0) goto La4
            return r0
        L9e:
            h.i r10 = new h.i
            r10.<init>()
            throw r10
        La4:
            h.ab r10 = h.ab.f48028a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.e.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
