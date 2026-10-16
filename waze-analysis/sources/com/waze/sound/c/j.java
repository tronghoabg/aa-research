package com.waze.sound.c;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f39604a;

    /* renamed from: b, reason: collision with root package name */
    Object f39605b;

    /* renamed from: c, reason: collision with root package name */
    Object f39606c;

    /* renamed from: d, reason: collision with root package name */
    Object f39607d;

    /* renamed from: e, reason: collision with root package name */
    Object f39608e;

    /* renamed from: f, reason: collision with root package name */
    int f39609f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n f39610g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ com.waze.h.c.a f39611h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f39612i;

    /* renamed from: j, reason: collision with root package name */
    private /* synthetic */ Object f39613j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(n nVar, com.waze.h.c.a aVar, kotlinx.coroutines.b.k kVar, h.c.e eVar) {
        super(2, eVar);
        this.f39610g = nVar;
        this.f39611h = aVar;
        this.f39612i = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        j jVar = new j(this.f39610g, this.f39611h, this.f39612i, eVar);
        jVar.f39613j = obj;
        return jVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01af A[Catch: all -> 0x01b7, TryCatch #13 {all -> 0x01b7, blocks: (B:91:0x0191, B:93:0x0197, B:98:0x01a9, B:100:0x01af, B:101:0x01b6, B:97:0x01a5, B:90:0x018d, B:12:0x0052, B:94:0x019e, B:87:0x0186), top: B:137:0x0052, inners: #2, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[Catch: all -> 0x017e, SYNTHETIC, TRY_LEAVE, TryCatch #17 {all -> 0x017e, blocks: (B:72:0x0158, B:74:0x015e, B:79:0x0170, B:81:0x0176, B:82:0x017d, B:78:0x016c, B:71:0x0154, B:75:0x0165, B:68:0x014d), top: B:132:0x014d, inners: #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[Catch: all -> 0x01b7, SYNTHETIC, TRY_LEAVE, TryCatch #13 {all -> 0x01b7, blocks: (B:91:0x0191, B:93:0x0197, B:98:0x01a9, B:100:0x01af, B:101:0x01b6, B:97:0x01a5, B:90:0x018d, B:12:0x0052, B:94:0x019e, B:87:0x0186), top: B:137:0x0052, inners: #2, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015e A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #17 {all -> 0x017e, blocks: (B:72:0x0158, B:74:0x015e, B:79:0x0170, B:81:0x0176, B:82:0x017d, B:78:0x016c, B:71:0x0154, B:75:0x0165, B:68:0x014d), top: B:132:0x014d, inners: #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0176 A[Catch: all -> 0x017e, TryCatch #17 {all -> 0x017e, blocks: (B:72:0x0158, B:74:0x015e, B:79:0x0170, B:81:0x0176, B:82:0x017d, B:78:0x016c, B:71:0x0154, B:75:0x0165, B:68:0x014d), top: B:132:0x014d, inners: #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0197 A[Catch: all -> 0x01b7, TRY_LEAVE, TryCatch #13 {all -> 0x01b7, blocks: (B:91:0x0191, B:93:0x0197, B:98:0x01a9, B:100:0x01af, B:101:0x01b6, B:97:0x01a5, B:90:0x018d, B:12:0x0052, B:94:0x019e, B:87:0x0186), top: B:137:0x0052, inners: #2, #6 }] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.AutoCloseable] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.c.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
