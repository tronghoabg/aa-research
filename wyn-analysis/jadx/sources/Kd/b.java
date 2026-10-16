package Kd;

import ef.C2515C;
import java.util.Iterator;
import jf.InterfaceC3103c;
import lf.AbstractC3470i;
import tf.p;

/* loaded from: classes5.dex */
public final class b extends AbstractC3470i implements p {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f6733a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f6734b;

    /* renamed from: c, reason: collision with root package name */
    public int f6735c;

    /* renamed from: d, reason: collision with root package name */
    public int f6736d;

    /* renamed from: e, reason: collision with root package name */
    public int f6737e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f6739g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f6739g = cVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        b bVar = new b(this.f6739g, interfaceC3103c);
        bVar.f6738f = obj;
        return bVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((Af.m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003b -> B:12:0x0045). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0068 -> B:19:0x006c). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r11.f6737e
            Kd.c r2 = r11.f6739g
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 != r4) goto L1f
            int r1 = r11.f6736d
            int r5 = r11.f6735c
            int[] r6 = r11.f6734b
            java.util.Iterator r7 = r11.f6733a
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r11.f6738f
            Af.m r8 = (Af.m) r8
            Fe.e.U(r12)
            r12 = r8
            goto L6c
        L1f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L27:
            Fe.e.U(r12)
            java.lang.Object r12 = r11.f6738f
            Af.m r12 = (Af.m) r12
            java.util.ArrayList r1 = r2.f6740a
            java.util.Iterator r1 = r1.iterator()
            r5 = r3
        L35:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L78
            java.lang.Object r6 = r1.next()
            int[] r6 = (int[]) r6
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r3
        L45:
            int r8 = r7.length
            if (r1 >= r8) goto L75
            int r8 = r2.a(r6)
            r9 = -1
            if (r8 == r9) goto L68
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r6)
            r11.f6738f = r12
            java.util.Iterator r5 = (java.util.Iterator) r5
            r11.f6733a = r5
            r11.f6734b = r7
            r11.f6735c = r6
            r11.f6736d = r1
            r11.f6737e = r4
            r12.c(r2, r11)
            kf.a r12 = kf.a.f39711a
            return r0
        L68:
            r10 = r7
            r7 = r5
            r5 = r6
            r6 = r10
        L6c:
            int r1 = r1 + 6
            int r5 = r5 + 6
            r10 = r6
            r6 = r5
            r5 = r7
            r7 = r10
            goto L45
        L75:
            r1 = r5
            r5 = r6
            goto L35
        L78:
            ef.C r12 = ef.C2515C.f34653a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Kd.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
