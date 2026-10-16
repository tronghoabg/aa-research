package androidx.lifecycle;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class N extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.G f18613a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.G f18614b;

    /* renamed from: c, reason: collision with root package name */
    public int f18615c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1451o f18616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EnumC1450n f18617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ef.E f18618f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ G1.c f18619g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(AbstractC1451o abstractC1451o, EnumC1450n enumC1450n, Ef.E e7, G1.c cVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f18616d = abstractC1451o;
        this.f18617e = enumC1450n;
        this.f18618f = e7;
        this.f18619g = cVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new N(this.f18616d, this.f18617e, this.f18618f, this.f18619g, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[SYNTHETIC] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r14.f18615c
            ef.C r2 = ef.C2515C.f34653a
            r3 = 0
            androidx.lifecycle.o r4 = r14.f18616d
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 != r5) goto L1b
            kotlin.jvm.internal.G r1 = r14.f18614b
            kotlin.jvm.internal.G r5 = r14.f18613a
            Fe.e.U(r15)     // Catch: java.lang.Throwable -> L17
            goto L8f
        L17:
            r0 = move-exception
            r15 = r0
            goto La5
        L1b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L23:
            Fe.e.U(r15)
            androidx.lifecycle.n r15 = r4.b()
            androidx.lifecycle.n r1 = androidx.lifecycle.EnumC1450n.f18676a
            if (r15 != r1) goto L30
            goto La1
        L30:
            kotlin.jvm.internal.G r8 = new kotlin.jvm.internal.G
            r8.<init>()
            kotlin.jvm.internal.G r1 = new kotlin.jvm.internal.G
            r1.<init>()
            androidx.lifecycle.n r15 = r14.f18617e     // Catch: java.lang.Throwable -> La2
            Ef.E r9 = r14.f18618f     // Catch: java.lang.Throwable -> La2
            G1.c r13 = r14.f18619g     // Catch: java.lang.Throwable -> La2
            r14.f18613a = r8     // Catch: java.lang.Throwable -> La2
            r14.f18614b = r1     // Catch: java.lang.Throwable -> La2
            r14.f18615c = r5     // Catch: java.lang.Throwable -> La2
            Ef.n r11 = new Ef.n     // Catch: java.lang.Throwable -> La2
            jf.c r6 = A6.h.A(r14)     // Catch: java.lang.Throwable -> La2
            r11.<init>(r5, r6)     // Catch: java.lang.Throwable -> La2
            r11.t()     // Catch: java.lang.Throwable -> La2
            androidx.lifecycle.k r5 = androidx.lifecycle.EnumC1449m.Companion     // Catch: java.lang.Throwable -> La2
            r5.getClass()     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = "state"
            kotlin.jvm.internal.AbstractC3340k.e(r15, r5)     // Catch: java.lang.Throwable -> La2
            int r5 = r15.ordinal()     // Catch: java.lang.Throwable -> La2
            r6 = 2
            if (r5 == r6) goto L72
            r6 = 3
            if (r5 == r6) goto L6f
            r6 = 4
            if (r5 == r6) goto L6b
            r7 = r3
            goto L75
        L6b:
            androidx.lifecycle.m r5 = androidx.lifecycle.EnumC1449m.ON_RESUME     // Catch: java.lang.Throwable -> La2
        L6d:
            r7 = r5
            goto L75
        L6f:
            androidx.lifecycle.m r5 = androidx.lifecycle.EnumC1449m.ON_START     // Catch: java.lang.Throwable -> La2
            goto L6d
        L72:
            androidx.lifecycle.m r5 = androidx.lifecycle.EnumC1449m.ON_CREATE     // Catch: java.lang.Throwable -> La2
            goto L6d
        L75:
            androidx.lifecycle.m r10 = androidx.lifecycle.C1447k.a(r15)     // Catch: java.lang.Throwable -> La2
            Nf.d r12 = Nf.e.a()     // Catch: java.lang.Throwable -> La2
            androidx.lifecycle.M r6 = new androidx.lifecycle.M     // Catch: java.lang.Throwable -> La2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> La2
            r1.f39740a = r6     // Catch: java.lang.Throwable -> La2
            r4.a(r6)     // Catch: java.lang.Throwable -> La2
            java.lang.Object r15 = r11.s()     // Catch: java.lang.Throwable -> La2
            if (r15 != r0) goto L8e
            return r0
        L8e:
            r5 = r8
        L8f:
            java.lang.Object r15 = r5.f39740a
            Ef.m0 r15 = (Ef.InterfaceC0501m0) r15
            if (r15 == 0) goto L98
            r15.cancel(r3)
        L98:
            java.lang.Object r15 = r1.f39740a
            androidx.lifecycle.t r15 = (androidx.lifecycle.InterfaceC1455t) r15
            if (r15 == 0) goto La1
            r4.c(r15)
        La1:
            return r2
        La2:
            r0 = move-exception
            r15 = r0
            r5 = r8
        La5:
            java.lang.Object r0 = r5.f39740a
            Ef.m0 r0 = (Ef.InterfaceC0501m0) r0
            if (r0 == 0) goto Lae
            r0.cancel(r3)
        Lae:
            java.lang.Object r0 = r1.f39740a
            androidx.lifecycle.t r0 = (androidx.lifecycle.InterfaceC1455t) r0
            if (r0 == 0) goto Lb7
            r4.c(r0)
        Lb7:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.N.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
