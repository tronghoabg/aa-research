package Cd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class a0 extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public tf.q f2054a;

    /* renamed from: b, reason: collision with root package name */
    public tf.q f2055b;

    /* renamed from: c, reason: collision with root package name */
    public tf.p f2056c;

    /* renamed from: d, reason: collision with root package name */
    public tf.p f2057d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2058e;

    /* renamed from: f, reason: collision with root package name */
    public Fd.c f2059f;

    /* renamed from: g, reason: collision with root package name */
    public int f2060g;

    /* renamed from: h, reason: collision with root package name */
    public int f2061h;

    /* renamed from: i, reason: collision with root package name */
    public int f2062i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Dd.h f2063j;
    public /* synthetic */ Fd.c k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ tf.q f2064l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ tf.q f2065m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2066n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ tf.p f2067o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ tf.p f2068p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Dd.b f2069q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ X f2070r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(tf.q qVar, tf.q qVar2, int i5, tf.p pVar, tf.p pVar2, Dd.b bVar, X x5, InterfaceC3103c interfaceC3103c) {
        super(3, interfaceC3103c);
        this.f2064l = qVar;
        this.f2065m = qVar2;
        this.f2066n = i5;
        this.f2067o = pVar;
        this.f2068p = pVar2;
        this.f2069q = bVar;
        this.f2070r = x5;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        tf.p pVar = this.f2067o;
        tf.q qVar = this.f2064l;
        tf.q qVar2 = this.f2065m;
        Dd.b bVar = this.f2069q;
        X x5 = this.f2070r;
        a0 a0Var = new a0(qVar, qVar2, this.f2066n, pVar, this.f2068p, bVar, x5, (InterfaceC3103c) obj3);
        a0Var.f2063j = (Dd.h) obj;
        a0Var.k = (Fd.c) obj2;
        return a0Var.invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0195: INVOKE (r2 I:java.lang.Object) = (r12 I:tf.q), (r2 I:java.lang.Object), (r9 I:java.lang.Object), (r0 I:java.lang.Object) INTERFACE call: tf.q.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object A[MD:(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object (m)] (LINE:406), block:B:57:0x0190 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x018e: IF  (r8v0 ?? I:??[int, byte, short, char]) >= (r7 I:??[int, byte, short, char])  -> B:65:0x0215 (LINE:399), block:B:56:0x018e */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x018e: IF  (r8 I:??[int, byte, short, char]) >= (r7 I:??[int, byte, short, char])  -> B:65:0x0215 (LINE:399), block:B:56:0x018e */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0195: INVOKE (r2 I:java.lang.Object) = (r12v0 ?? I:tf.q), (r2v2 ?? I:java.lang.Object), (r9 I:java.lang.Object), (r0 I:java.lang.Object) INTERFACE call: tf.q.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object A[MD:(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object (m)] (LINE:406), block:B:57:0x0190 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5 A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #0 {all -> 0x0059, blocks: (B:38:0x00e5, B:39:0x00ef, B:42:0x010d, B:44:0x0113, B:46:0x012c, B:48:0x0143, B:50:0x017c, B:51:0x0186, B:12:0x0055, B:17:0x0071), top: B:66:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d A[Catch: all -> 0x0059, PHI: r0 r2 r7 r8 r9 r10 r11 r12 r13 r14 r15
  0x010d: PHI (r0v5 java.lang.Object) = (r0v11 java.lang.Object), (r0v17 java.lang.Object) binds: [B:40:0x0109, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r2v13 int) = (r2v20 int), (r2v0 int) binds: [B:40:0x0109, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r7v4 int) = (r7v6 int), (r7v10 int) binds: [B:40:0x0109, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r8v5 int) = (r8v8 int), (r8v16 int) binds: [B:40:0x0109, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r9v2 Fd.c) = (r9v4 Fd.c), (r9v16 Fd.c) binds: [B:40:0x0109, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r10v2 tf.p) = (r10v3 tf.p), (r10v11 tf.p) binds: [B:40:0x0109, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r11v2 tf.p) = (r11v3 tf.p), (r11v13 tf.p) binds: [B:40:0x0109, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r12v3 tf.q) = (r12v16 tf.q), (r12v17 tf.q) binds: [B:40:0x0109, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r13v2 tf.q) = (r13v3 tf.q), (r13v9 tf.q) binds: [B:40:0x0109, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r14v2 Fd.c) = (r14v3 Fd.c), (r14v8 Fd.c) binds: [B:40:0x0109, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r15v2 Dd.h) = (r15v3 Dd.h), (r15v6 Dd.h) binds: [B:40:0x0109, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0059, blocks: (B:38:0x00e5, B:39:0x00ef, B:42:0x010d, B:44:0x0113, B:46:0x012c, B:48:0x0143, B:50:0x017c, B:51:0x0186, B:12:0x0055, B:17:0x0071), top: B:66:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017c A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:38:0x00e5, B:39:0x00ef, B:42:0x010d, B:44:0x0113, B:46:0x012c, B:48:0x0143, B:50:0x017c, B:51:0x0186, B:12:0x0055, B:17:0x0071), top: B:66:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0186 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:38:0x00e5, B:39:0x00ef, B:42:0x010d, B:44:0x0113, B:46:0x012c, B:48:0x0143, B:50:0x017c, B:51:0x0186, B:12:0x0055, B:17:0x0071), top: B:66:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018b A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v0, types: [tf.q] */
    /* JADX WARN: Type inference failed for: r9v0, types: [Fd.c, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01ed -> B:8:0x002f). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
