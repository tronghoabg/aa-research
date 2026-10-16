package com.bumptech.glide.load.a;

import com.google.android.gms.common.api.internal.be;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bc implements l, k {

    /* renamed from: a, reason: collision with root package name */
    private final m f3097a;

    /* renamed from: b, reason: collision with root package name */
    private final k f3098b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f3099c;

    /* renamed from: d, reason: collision with root package name */
    private volatile h f3100d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f3101e;

    /* renamed from: f, reason: collision with root package name */
    private volatile i f3102f;

    /* renamed from: g, reason: collision with root package name */
    private volatile be f3103g;

    bc(m mVar, k kVar) {
        this.f3097a = mVar;
        this.f3098b = kVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    @Override // com.bumptech.glide.load.a.l
    public final void a() {
        be beVar = this.f3103g;
        if (beVar != null) {
            beVar.f4791b.bk();
        }
    }

    @Override // com.bumptech.glide.load.a.k
    public final void b() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7 A[Catch: IOException -> 0x00ff, TRY_ENTER, TryCatch #2 {IOException -> 0x00ff, blocks: (B:15:0x0099, B:31:0x00f7, B:32:0x00fe), top: B:60:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.bumptech.glide.load.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.bumptech.glide.load.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.bumptech.glide.load.o, java.lang.Object] */
    @Override // com.bumptech.glide.load.a.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.bc.c():boolean");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    @Override // com.bumptech.glide.load.a.k
    public final void d(com.bumptech.glide.load.o oVar, Exception exc, com.bumptech.glide.load.data.e eVar, int i2) {
        this.f3098b.d(oVar, exc, eVar, this.f3103g.f4791b.g());
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    @Override // com.bumptech.glide.load.a.k
    public final void e(com.bumptech.glide.load.o oVar, Object obj, com.bumptech.glide.load.data.e eVar, int i2, com.bumptech.glide.load.o oVar2) {
        this.f3098b.e(oVar, obj, eVar, this.f3103g.f4791b.g(), oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.load.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    final void f(be beVar, Object obj) {
        y yVarJ = this.f3097a.j();
        if (obj != null && yVarJ.c(beVar.f4791b.g())) {
            this.f3101e = obj;
            this.f3098b.b();
        } else {
            k kVar = this.f3098b;
            ?? r1 = beVar.f4792c;
            ?? r3 = beVar.f4791b;
            kVar.e(r1, obj, r3, r3.g(), this.f3102f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.bumptech.glide.load.data.e, java.lang.Object] */
    final void g(be beVar, Exception exc) {
        i iVar = this.f3102f;
        ?? r3 = beVar.f4791b;
        this.f3098b.d(iVar, exc, r3, r3.g());
    }

    final boolean h(be beVar) {
        be beVar2 = this.f3103g;
        return beVar2 != null && beVar2 == beVar;
    }
}
