package u1;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: u1.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4229r extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f46482a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4209G f46484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4229r(C4209G c4209g, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46484c = c4209g;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C4229r c4229r = new C4229r(this.f46484c, interfaceC3103c);
        c4229r.f46483b = obj;
        return c4229r;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4229r) create((AbstractC4228q) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079 A[RETURN] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r6.f46482a
            ef.C r2 = ef.C2515C.f34653a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            Fe.e.U(r7)
            return r2
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            Fe.e.U(r7)
            return r2
        L1e:
            Fe.e.U(r7)
            java.lang.Object r7 = r6.f46483b
            u1.q r7 = (u1.AbstractC4228q) r7
            boolean r1 = r7 instanceof u1.C4226o
            u1.G r5 = r6.f46484c
            if (r1 == 0) goto L6a
            u1.o r7 = (u1.C4226o) r7
            r6.f46482a = r4
            Hf.x0 r1 = r5.f46450g
            java.lang.Object r1 = r1.getValue()
            u1.H r1 = (u1.AbstractC4210H) r1
            boolean r3 = r1 instanceof u1.C4214c
            if (r3 == 0) goto L3c
            goto L5e
        L3c:
            boolean r3 = r1 instanceof u1.C4223l
            if (r3 == 0) goto L4b
            u1.H r7 = r7.f46477a
            if (r1 != r7) goto L5e
            java.lang.Object r7 = r5.f(r6)
            if (r7 != r0) goto L5e
            goto L5f
        L4b:
            u1.I r7 = u1.C4211I.f46453a
            boolean r7 = kotlin.jvm.internal.AbstractC3340k.a(r1, r7)
            if (r7 == 0) goto L5a
            java.lang.Object r7 = r5.f(r6)
            if (r7 != r0) goto L5e
            goto L5f
        L5a:
            boolean r7 = r1 instanceof u1.C4222k
            if (r7 != 0) goto L62
        L5e:
            r7 = r2
        L5f:
            if (r7 != r0) goto L79
            goto L78
        L62:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            r7.<init>(r0)
            throw r7
        L6a:
            boolean r1 = r7 instanceof u1.C4227p
            if (r1 == 0) goto L79
            u1.p r7 = (u1.C4227p) r7
            r6.f46482a = r3
            java.lang.Object r7 = u1.C4209G.b(r5, r7, r6)
            if (r7 != r0) goto L79
        L78:
            return r0
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C4229r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
