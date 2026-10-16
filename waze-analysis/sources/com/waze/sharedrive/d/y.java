package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f38283a;

    /* renamed from: b, reason: collision with root package name */
    Object f38284b;

    /* renamed from: c, reason: collision with root package name */
    Object f38285c;

    /* renamed from: d, reason: collision with root package name */
    Object f38286d;

    /* renamed from: e, reason: collision with root package name */
    int f38287e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ aq f38288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(aq aqVar, h.c.e eVar) {
        super(2, eVar);
        this.f38288f = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new y(this.f38288f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:6:0x001a, B:38:0x00c5, B:40:0x00cd, B:41:0x00da), top: B:52:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #1 {all -> 0x001f, blocks: (B:6:0x001a, B:38:0x00c5, B:40:0x00cd, B:41:0x00da), top: B:52:0x001a }] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.d.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
