package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ad extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f30958a;

    /* renamed from: b, reason: collision with root package name */
    Object f30959b;

    /* renamed from: c, reason: collision with root package name */
    Object f30960c;

    /* renamed from: d, reason: collision with root package name */
    Object f30961d;

    /* renamed from: e, reason: collision with root package name */
    Object f30962e;

    /* renamed from: f, reason: collision with root package name */
    Object f30963f;

    /* renamed from: g, reason: collision with root package name */
    int f30964g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ af f30965h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f30966i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ com.waze.av.b.n f30967j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f30968k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ long f30969l;
    final /* synthetic */ com.waze.av.d.k m;
    private /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ad(af afVar, h.g.b.aq aqVar, com.waze.av.b.n nVar, kotlinx.coroutines.b.l lVar, long j2, com.waze.av.d.k kVar, h.c.e eVar) {
        super(2, eVar);
        this.f30965h = afVar;
        this.f30966i = aqVar;
        this.f30967j = nVar;
        this.f30968k = lVar;
        this.f30969l = j2;
        this.m = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ad adVar = new ad(this.f30965h, this.f30966i, this.f30967j, this.f30968k, this.f30969l, this.m, eVar);
        adVar.n = obj;
        return adVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ad) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x04d6, code lost:
    
        if (r34.f30968k.emit(r3.f48105a, r34) != r1) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0494 A[PHI: r2
  0x0494: PHI (r2v57 java.lang.Object) = (r2v54 java.lang.Object), (r2v62 java.lang.Object) binds: [B:105:0x0492, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02aa A[PHI: r2 r3 r8 r9 r10 r11 r12 r13
  0x02aa: PHI (r2v20 kotlinx.coroutines.am) = (r2v17 kotlinx.coroutines.am), (r2v22 kotlinx.coroutines.am) binds: [B:44:0x02a8, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x02aa: PHI (r3v11 java.lang.Object) = (r3v10 java.lang.Object), (r3v18 java.lang.Object) binds: [B:44:0x02a8, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x02aa: PHI (r8v9 kotlinx.coroutines.am) = (r8v6 kotlinx.coroutines.am), (r8v11 kotlinx.coroutines.am) binds: [B:44:0x02a8, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x02aa: PHI (r9v8 com.waze.av.d.k) = (r9v5 com.waze.av.d.k), (r9v10 com.waze.av.d.k) binds: [B:44:0x02a8, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x02aa: PHI (r10v10 kotlinx.coroutines.am) = (r10v6 kotlinx.coroutines.am), (r10v14 kotlinx.coroutines.am) binds: [B:44:0x02a8, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x02aa: PHI (r11v17 kotlinx.coroutines.am) = (r11v13 kotlinx.coroutines.am), (r11v19 kotlinx.coroutines.am) binds: [B:44:0x02a8, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x02aa: PHI (r12v10 kotlinx.coroutines.am) = (r12v8 kotlinx.coroutines.am), (r12v12 kotlinx.coroutines.am) binds: [B:44:0x02a8, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x02aa: PHI (r13v11 kotlinx.coroutines.af) = (r13v9 kotlinx.coroutines.af), (r13v13 kotlinx.coroutines.af) binds: [B:44:0x02a8, B:14:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x036d A[PHI: r2 r3 r4 r5
  0x036d: PHI (r2v29 kotlinx.coroutines.am) = (r2v26 kotlinx.coroutines.am), (r2v31 kotlinx.coroutines.am) binds: [B:75:0x036b, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x036d: PHI (r3v37 java.lang.Object) = (r3v34 java.lang.Object), (r3v48 java.lang.Object) binds: [B:75:0x036b, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x036d: PHI (r4v21 kotlinx.coroutines.am) = (r4v18 kotlinx.coroutines.am), (r4v25 kotlinx.coroutines.am) binds: [B:75:0x036b, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]
  0x036d: PHI (r5v11 kotlinx.coroutines.am) = (r5v8 kotlinx.coroutines.am), (r5v12 kotlinx.coroutines.am) binds: [B:75:0x036b, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03d7 A[PHI: r2 r3 r4
  0x03d7: PHI (r2v35 kotlinx.coroutines.am) = (r2v32 kotlinx.coroutines.am), (r2v37 kotlinx.coroutines.am) binds: [B:86:0x03d5, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x03d7: PHI (r3v53 java.lang.Object) = (r3v50 java.lang.Object), (r3v61 java.lang.Object) binds: [B:86:0x03d5, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x03d7: PHI (r4v29 kotlinx.coroutines.am) = (r4v26 kotlinx.coroutines.am), (r4v30 kotlinx.coroutines.am) binds: [B:86:0x03d5, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0434 A[PHI: r2 r3
  0x0434: PHI (r2v42 java.lang.Object) = (r2v39 java.lang.Object), (r2v52 java.lang.Object) binds: [B:94:0x0432, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0434: PHI (r3v65 kotlinx.coroutines.am) = (r3v62 kotlinx.coroutines.am), (r3v66 kotlinx.coroutines.am) binds: [B:94:0x0432, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0438  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.ad.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
