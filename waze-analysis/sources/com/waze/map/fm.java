package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class fm extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f28958a;

    /* renamed from: b, reason: collision with root package name */
    Object f28959b;

    /* renamed from: c, reason: collision with root package name */
    Object f28960c;

    /* renamed from: d, reason: collision with root package name */
    Object f28961d;

    /* renamed from: e, reason: collision with root package name */
    Object f28962e;

    /* renamed from: f, reason: collision with root package name */
    Object f28963f;

    /* renamed from: g, reason: collision with root package name */
    Object f28964g;

    /* renamed from: h, reason: collision with root package name */
    int f28965h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f28966i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ gb f28967j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.bn f28968k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ boolean f28969l;
    final /* synthetic */ h.g.b.am m;
    final /* synthetic */ com.waze.map.canvas.a.e n;
    final /* synthetic */ kotlinx.coroutines.b.bn o;
    final /* synthetic */ cw p;
    final /* synthetic */ com.waze.map.main.v q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fm(gb gbVar, com.waze.map.main.v vVar, kotlinx.coroutines.b.bn bnVar, boolean z, h.g.b.am amVar, com.waze.map.canvas.a.e eVar, kotlinx.coroutines.b.bn bnVar2, cw cwVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f28967j = gbVar;
        this.q = vVar;
        this.f28968k = bnVar;
        this.f28969l = z;
        this.m = amVar;
        this.n = eVar;
        this.o = bnVar2;
        this.p = cwVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        fm fmVar = new fm(this.f28967j, this.q, this.f28968k, this.f28969l, this.m, this.n, this.o, this.p, eVar);
        fmVar.f28966i = obj;
        return fmVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fm) create((cq) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c0, code lost:
    
        if (kotlinx.coroutines.b.ai.i(r16.f28968k, new com.waze.map.gi(null, 1, null), r16) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02a5, code lost:
    
        if (kotlinx.coroutines.b.ai.D(kotlinx.coroutines.b.ai.B(new com.waze.map.fl(r16.p.d().c().a(), r7, r4), new com.waze.map.fg(r3, null))).collect(new com.waze.map.fi(r7, r16.n, r2, r6), r16) != r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0231 A[PHI: r2 r3 r4 r5
  0x0231: PHI (r2v26 h.g.b.am) = (r2v25 h.g.b.am), (r2v36 h.g.b.am) binds: [B:56:0x022f, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0231: PHI (r3v13 h.g.b.aq) = (r3v12 h.g.b.aq), (r3v19 h.g.b.aq) binds: [B:56:0x022f, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0231: PHI (r4v3 com.waze.map.b.ec) = (r4v2 com.waze.map.b.ec), (r4v11 com.waze.map.b.ec) binds: [B:56:0x022f, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0231: PHI (r5v12 com.waze.map.cq) = (r5v11 com.waze.map.cq), (r5v33 com.waze.map.cq) binds: [B:56:0x022f, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.fm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
