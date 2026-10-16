package com.waze.modules.navigation;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f30421a;

    /* renamed from: b, reason: collision with root package name */
    Object f30422b;

    /* renamed from: c, reason: collision with root package name */
    Object f30423c;

    /* renamed from: d, reason: collision with root package name */
    int f30424d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f30425e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f30426f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ com.waze.av.d.t f30427g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, com.waze.av.d.t tVar, CompletableDeferred completableDeferred, h.c.e eVar) {
        super(2, eVar);
        this.f30425e = fVar;
        this.f30427g = tVar;
        this.f30426f = completableDeferred;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f30425e, this.f30427g, this.f30426f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5 A[Catch: all -> 0x003e, PHI: r11
  0x00e5: PHI (r11v22 java.lang.Object) = (r11v21 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x00e3, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x003e, blocks: (B:10:0x0034, B:35:0x00e5, B:37:0x00eb, B:41:0x00fa, B:43:0x00fe, B:44:0x0105, B:38:0x00f4, B:40:0x00f8, B:54:0x0138, B:55:0x013d, B:11:0x0039, B:33:0x00d8, B:25:0x008d, B:27:0x00a0, B:28:0x00af, B:30:0x00ca, B:29:0x00b4), top: B:74:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:10:0x0034, B:35:0x00e5, B:37:0x00eb, B:41:0x00fa, B:43:0x00fe, B:44:0x0105, B:38:0x00f4, B:40:0x00f8, B:54:0x0138, B:55:0x013d, B:11:0x0039, B:33:0x00d8, B:25:0x008d, B:27:0x00a0, B:28:0x00af, B:30:0x00ca, B:29:0x00b4), top: B:74:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:10:0x0034, B:35:0x00e5, B:37:0x00eb, B:41:0x00fa, B:43:0x00fe, B:44:0x0105, B:38:0x00f4, B:40:0x00f8, B:54:0x0138, B:55:0x013d, B:11:0x0039, B:33:0x00d8, B:25:0x008d, B:27:0x00a0, B:28:0x00af, B:30:0x00ca, B:29:0x00b4), top: B:74:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:10:0x0034, B:35:0x00e5, B:37:0x00eb, B:41:0x00fa, B:43:0x00fe, B:44:0x0105, B:38:0x00f4, B:40:0x00f8, B:54:0x0138, B:55:0x013d, B:11:0x0039, B:33:0x00d8, B:25:0x008d, B:27:0x00a0, B:28:0x00af, B:30:0x00ca, B:29:0x00b4), top: B:74:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
