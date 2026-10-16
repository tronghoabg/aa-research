package If;

import Cd.C0333a;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class t extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Gf.i f5509a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f5510b;

    /* renamed from: c, reason: collision with root package name */
    public int f5511c;

    /* renamed from: d, reason: collision with root package name */
    public int f5512d;

    /* renamed from: e, reason: collision with root package name */
    public int f5513e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0602l[] f5515g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0333a f5516h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0603m f5517i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(InterfaceC0602l[] interfaceC0602lArr, C0333a c0333a, InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5515g = interfaceC0602lArr;
        this.f5516h = c0333a;
        this.f5517i = interfaceC0603m;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        t tVar = new t(this.f5515g, this.f5516h, this.f5517i, interfaceC3103c);
        tVar.f5514f = obj;
        return tVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if (r6 != 0) goto L19;
     */
    /* JADX WARN: Path cross not found for [B:32:0x00d4, B:30:0x00c5], limit reached: 38 */
    /* JADX WARN: Path cross not found for [B:33:0x00d6, B:19:0x0097], limit reached: 38 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5 A[LOOP:0: B:25:0x00b5->B:38:?, LOOP_START, PHI: r6 r7
  0x00b5: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:23:0x00b2, B:38:?] A[DONT_GENERATE, DONT_INLINE]
  0x00b5: PHI (r7v5 ff.y) = (r7v4 ff.y), (r7v11 ff.y) binds: [B:23:0x00b2, B:38:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00eb -> B:19:0x0097). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: If.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
