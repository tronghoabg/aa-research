package P;

import Af.m;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3470i;
import tf.p;

/* loaded from: classes.dex */
public final class e extends AbstractC3470i implements p {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f8973a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f8974b;

    /* renamed from: c, reason: collision with root package name */
    public int f8975c;

    /* renamed from: d, reason: collision with root package name */
    public int f8976d;

    /* renamed from: e, reason: collision with root package name */
    public int f8977e;

    /* renamed from: f, reason: collision with root package name */
    public int f8978f;

    /* renamed from: g, reason: collision with root package name */
    public long f8979g;

    /* renamed from: h, reason: collision with root package name */
    public int f8980h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f8981i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f8982j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f8982j = fVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        e eVar = new e(this.f8982j, interfaceC3103c);
        eVar.f8981i = obj;
        return eVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:19:0x008a). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            kf.a r2 = kf.a.f39711a
            int r3 = r0.f8980h
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2c
            if (r3 != r1) goto L24
            int r3 = r0.f8978f
            int r6 = r0.f8977e
            long r7 = r0.f8979g
            int r9 = r0.f8976d
            int r10 = r0.f8975c
            long[] r11 = r0.f8974b
            java.lang.Object[] r12 = r0.f8973a
            java.lang.Object r13 = r0.f8981i
            Af.m r13 = (Af.m) r13
            Fe.e.U(r21)
            goto L8a
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            Fe.e.U(r21)
            java.lang.Object r3 = r0.f8981i
            Af.m r3 = (Af.m) r3
            P.f r6 = r0.f8982j
            x.r r6 = r6.f8983a
            java.lang.Object[] r7 = r6.f47554b
            long[] r6 = r6.f47553a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L97
            r9 = r4
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L93
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r3
            r3 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L62:
            if (r3 >= r6) goto L8d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8a
            int r4 = r9 << 3
            int r4 = r4 + r3
            r4 = r12[r4]
            r0.f8981i = r13
            r0.f8973a = r12
            r0.f8974b = r11
            r0.f8975c = r10
            r0.f8976d = r9
            r0.f8979g = r7
            r0.f8977e = r6
            r0.f8978f = r3
            r0.f8980h = r1
            r13.c(r4, r0)
            kf.a r1 = kf.a.f39711a
            return r2
        L8a:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L62
        L8d:
            if (r6 != r5) goto L97
            r8 = r10
            r6 = r11
            r7 = r12
            r3 = r13
        L93:
            if (r9 == r8) goto L97
            int r9 = r9 + r1
            goto L41
        L97:
            ef.C r1 = ef.C2515C.f34653a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
