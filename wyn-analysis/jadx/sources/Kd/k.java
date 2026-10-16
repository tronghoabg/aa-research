package Kd;

import Ef.InterfaceC0513t;
import Gf.t;
import ef.C2515C;
import io.ktor.utils.io.C2880m;
import io.ktor.utils.io.InterfaceC2886t;
import io.ktor.utils.io.X;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes5.dex */
public final class k extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public X f6760a;

    /* renamed from: b, reason: collision with root package name */
    public Qf.a f6761b;

    /* renamed from: c, reason: collision with root package name */
    public C2880m f6762c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0513t f6763d;

    /* renamed from: e, reason: collision with root package name */
    public d f6764e;

    /* renamed from: f, reason: collision with root package name */
    public long f6765f;

    /* renamed from: g, reason: collision with root package name */
    public int f6766g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6767h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2886t f6768i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Qf.a f6769j;
    public final /* synthetic */ Long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC2886t interfaceC2886t, Qf.a aVar, Long l10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f6768i = interfaceC2886t;
        this.f6769j = aVar;
        this.k = l10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        k kVar = new k(this.f6768i, this.f6769j, this.k, interfaceC3103c);
        kVar.f6767h = obj;
        return kVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x033f, code lost:
    
        if (((Gf.s) r0).f4839d.i(r2, r19) != r7) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0374, code lost:
    
        if (((Gf.s) r0).f4839d.i(r1, r19) == r7) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[PHI: r0 r2 r3
  0x003e: PHI (r0v18 long) = (r0v16 long), (r0v21 long) binds: [B:115:0x02f7, B:9:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r2v21 io.ktor.utils.io.X) = (r2v19 io.ktor.utils.io.X), (r2v23 io.ktor.utils.io.X) binds: [B:115:0x02f7, B:9:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r3v34 Gf.t) = (r3v31 Gf.t), (r3v37 Gf.t) binds: [B:115:0x02f7, B:9:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c8 A[PHI: r2 r4 r12
  0x02c8: PHI (r2v9 long) = (r2v15 long), (r2v16 long) binds: [B:53:0x01c1, B:48:0x019e] A[DONT_GENERATE, DONT_INLINE]
  0x02c8: PHI (r4v19 io.ktor.utils.io.X) = (r4v34 io.ktor.utils.io.X), (r4v35 io.ktor.utils.io.X) binds: [B:53:0x01c1, B:48:0x019e] A[DONT_GENERATE, DONT_INLINE]
  0x02c8: PHI (r12v9 Gf.t) = (r12v12 Gf.t), (r12v13 Gf.t) binds: [B:53:0x01c1, B:48:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x028b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb A[PHI: r1 r3 r4 r5 r11
  0x00bb: PHI (r1v22 long) = (r1v11 long), (r1v26 long) binds: [B:25:0x00ac, B:59:0x01ea] A[DONT_GENERATE, DONT_INLINE]
  0x00bb: PHI (r3v26 Qf.a) = (r3v12 Qf.a), (r3v28 Qf.a) binds: [B:25:0x00ac, B:59:0x01ea] A[DONT_GENERATE, DONT_INLINE]
  0x00bb: PHI (r4v31 io.ktor.utils.io.X) = (r4v15 io.ktor.utils.io.X), (r4v33 io.ktor.utils.io.X) binds: [B:25:0x00ac, B:59:0x01ea] A[DONT_GENERATE, DONT_INLINE]
  0x00bb: PHI (r5v26 Gf.t) = (r5v16 Gf.t), (r5v28 Gf.t) binds: [B:25:0x00ac, B:59:0x01ea] A[DONT_GENERATE, DONT_INLINE]
  0x00bb: PHI (r11v11 java.lang.Object) = (r11v6 java.lang.Object), (r11v16 java.lang.Object) binds: [B:25:0x00ac, B:59:0x01ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019a A[PHI: r2 r4 r5 r12
  0x019a: PHI (r2v16 long) = (r2v4 long), (r2v6 long), (r2v14 long), (r2v17 long) binds: [B:46:0x0199, B:45:0x0195, B:62:0x01f4, B:87:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x019a: PHI (r4v35 io.ktor.utils.io.X) = (r4v6 io.ktor.utils.io.X), (r4v11 io.ktor.utils.io.X), (r4v31 io.ktor.utils.io.X), (r4v36 io.ktor.utils.io.X) binds: [B:46:0x0199, B:45:0x0195, B:62:0x01f4, B:87:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x019a: PHI (r5v31 Qf.a) = (r5v2 Qf.a), (r5v7 Qf.a), (r5v27 Qf.a), (r5v33 Qf.a) binds: [B:46:0x0199, B:45:0x0195, B:62:0x01f4, B:87:0x0295] A[DONT_GENERATE, DONT_INLINE]
  0x019a: PHI (r12v13 Gf.t) = (r12v1 Gf.t), (r12v3 Gf.t), (r12v11 Gf.t), (r12v14 Gf.t) binds: [B:46:0x0199, B:45:0x0195, B:62:0x01f4, B:87:0x0295] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0256 A[Catch: all -> 0x029f, TRY_LEAVE, TryCatch #5 {all -> 0x029f, blocks: (B:73:0x024d, B:75:0x0256), top: B:151:0x024d }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028f A[Catch: all -> 0x0298, TRY_LEAVE, TryCatch #3 {all -> 0x0298, blocks: (B:81:0x027e, B:82:0x0283, B:84:0x028b, B:85:0x028f), top: B:147:0x027e }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01f4 -> B:47:0x019a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0278 -> B:15:0x006c). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kd.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
