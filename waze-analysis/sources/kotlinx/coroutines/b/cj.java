package kotlinx.coroutines.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cj<T> extends kotlinx.coroutines.b.a.b<cl> implements bn, k, kotlinx.coroutines.b.a.y {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.a.d f51658a;

    /* renamed from: b, reason: collision with root package name */
    private int f51659b;

    public cj(Object obj) {
        this.f51658a = h.e.b.h(obj);
    }

    private final boolean g(Object obj, Object obj2) {
        int i2;
        kotlinx.coroutines.b.a.d[] dVarArrQ;
        synchronized (this) {
            kotlinx.a.d dVar = this.f51658a;
            Object objB = dVar.b();
            if (obj != null && !h.g.b.x.n(objB, obj)) {
                return false;
            }
            if (h.g.b.x.n(objB, obj2)) {
                return true;
            }
            dVar.d(obj2);
            int i3 = this.f51659b;
            if ((i3 & 1) != 0) {
                this.f51659b = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f51659b = i4;
            kotlinx.coroutines.b.a.d[] dVarArrQ2 = q();
            while (true) {
                cl[] clVarArr = (cl[]) dVarArrQ2;
                if (clVarArr != null) {
                    for (cl clVar : clVarArr) {
                        if (clVar != null) {
                            clVar.d();
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f51659b;
                    if (i2 == i4) {
                        this.f51659b = i4 + 1;
                        return true;
                    }
                    dVarArrQ = q();
                }
                dVarArrQ2 = dVarArrQ;
                i4 = i2;
            }
        }
    }

    @Override // kotlinx.coroutines.b.bm
    public final void b() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.b.bm
    public final boolean c(Object obj) {
        e(obj);
        return true;
    }

    @Override // kotlinx.coroutines.b.a.y
    public final k cc(h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        return ck.a(this, jVar, i2, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (((kotlinx.coroutines.b.cn) r10).a(r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        if (h.g.b.x.n(r10, r11) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:34:0x0096, B:49:0x00c7], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:38:0x00a3, B:40:0x00a9], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:40:0x00a9, B:38:0x00a3], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:40:0x00a9, B:47:0x00c1], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:49:0x00c7, B:34:0x0096], limit reached: 55 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:14:0x0038, B:34:0x0096, B:36:0x009e, B:38:0x00a3, B:47:0x00c1, B:49:0x00c7, B:40:0x00a9, B:44:0x00b0, B:19:0x0052, B:22:0x0060, B:33:0x0085), top: B:57:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:14:0x0038, B:34:0x0096, B:36:0x009e, B:38:0x00a3, B:47:0x00c1, B:49:0x00c7, B:40:0x00a9, B:44:0x00b0, B:19:0x0052, B:22:0x0060, B:33:0x0085), top: B:57:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #0 {all -> 0x0064, blocks: (B:14:0x0038, B:34:0x0096, B:36:0x009e, B:38:0x00a3, B:47:0x00c1, B:49:0x00c7, B:40:0x00a9, B:44:0x00b0, B:19:0x0052, B:22:0x0060, B:33:0x0085), top: B:57:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c5 -> B:34:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00d5 -> B:34:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.b.bq, kotlinx.coroutines.b.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.b.l<? super T> r10, h.c.e<?> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.cj.collect(kotlinx.coroutines.b.l, h.c.e):java.lang.Object");
    }

    @Override // kotlinx.coroutines.b.bn, kotlinx.coroutines.b.ch
    public final Object d() {
        kotlinx.a.d dVar = this.f51658a;
        kotlinx.coroutines.e.ak akVar = kotlinx.coroutines.b.a.ab.f51383a;
        Object objB = dVar.b();
        if (objB == akVar) {
            return null;
        }
        return objB;
    }

    @Override // kotlinx.coroutines.b.bn
    public final void e(Object obj) {
        if (obj == null) {
            obj = kotlinx.coroutines.b.a.ab.f51383a;
        }
        g(null, obj);
    }

    @Override // kotlinx.coroutines.b.bm, kotlinx.coroutines.b.l
    public final Object emit(T t, h.c.e<? super h.ab> eVar) {
        e(t);
        return h.ab.f48028a;
    }

    @Override // kotlinx.coroutines.b.bn
    public final boolean f(Object obj, Object obj2) {
        if (obj == null) {
            obj = kotlinx.coroutines.b.a.ab.f51383a;
        }
        if (obj2 == null) {
            obj2 = kotlinx.coroutines.b.a.ab.f51383a;
        }
        return g(obj, obj2);
    }

    @Override // kotlinx.coroutines.b.a.b
    public final /* synthetic */ kotlinx.coroutines.b.a.d h() {
        return new cl();
    }

    @Override // kotlinx.coroutines.b.a.b
    public final /* bridge */ /* synthetic */ kotlinx.coroutines.b.a.d[] k() {
        return new cl[2];
    }
}
