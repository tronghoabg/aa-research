package io.ktor.utils.io;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class M extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Object f37358a;

    /* renamed from: b, reason: collision with root package name */
    public int f37359b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37360c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3471j f37361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2880m f37362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M(tf.p pVar, C2880m c2880m, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f37361d = (AbstractC3471j) pVar;
        this.f37362e = c2880m;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [lf.j, tf.p] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        M m10 = new M(this.f37361d, this.f37362e, interfaceC3103c);
        m10.f37360c = obj;
        return m10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        if (r2.f(r8) != r0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f5, code lost:
    
        if (r2.f(r8) != r0) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:30:0x0093, B:32:0x00a1), top: B:64:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[Catch: all -> 0x003f, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x003f, blocks: (B:12:0x002c, B:47:0x00ec, B:15:0x003a, B:39:0x00c4), top: B:66:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [Ef.m0] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v16, types: [lf.j, tf.p] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.M.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
