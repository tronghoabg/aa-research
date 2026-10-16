package Hf;

import Cd.C0333a;
import Ef.C0499l0;
import Ef.H0;
import If.AbstractC0622c;
import ef.C2515C;
import jf.C3109i;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import ka.AbstractC3256n;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final H6.g f5154a = new H6.g("NO_VALUE", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final H6.g f5155b = new H6.g("NONE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final H6.g f5156c = new H6.g("PENDING", 1);

    public static final j0 a(int i5, int i10, Gf.a aVar) {
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "replay cannot be negative, but was ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i10, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i5 <= 0 && i10 <= 0 && aVar != Gf.a.f4780a) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i11 = i10 + i5;
        if (i11 < 0) {
            i11 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return new j0(i5, i11, aVar);
    }

    public static /* synthetic */ j0 b(int i5, int i10, int i11) {
        Gf.a aVar = Gf.a.f4781b;
        if ((i11 & 1) != 0) {
            i5 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            aVar = Gf.a.f4780a;
        }
        return a(i5, i10, aVar);
    }

    public static final x0 c(Object obj) {
        if (obj == null) {
            obj = AbstractC0622c.f5464b;
        }
        return new x0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(Hf.InterfaceC0603m r4, java.lang.Object r5, java.lang.Object r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof Hf.D
            if (r0 == 0) goto L13
            r0 = r7
            Hf.D r0 = (Hf.D) r0
            int r1 = r0.f5030c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5030c = r1
            goto L18
        L13:
            Hf.D r0 = new Hf.D
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5029b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5030c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r6 = r0.f5028a
            Fe.e.U(r7)
            goto L3f
        L31:
            Fe.e.U(r7)
            r0.f5028a = r6
            r0.f5030c = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L3f
            return
        L3f:
            If.a r4 = new If.a
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.k0.d(Hf.m, java.lang.Object, java.lang.Object, lf.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(Hf.D0 r4, tf.q r5, java.lang.Throwable r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof Hf.r
            if (r0 == 0) goto L13
            r0 = r7
            Hf.r r0 = (Hf.r) r0
            int r1 = r0.f5186c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5186c = r1
            goto L18
        L13:
            Hf.r r0 = new Hf.r
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5185b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5186c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f5184a
            Fe.e.U(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            Fe.e.U(r7)
            r0.f5184a = r6     // Catch: java.lang.Throwable -> L29
            r0.f5186c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            ef.C r4 = ef.C2515C.f34653a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            Fe.b.d(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.k0.e(Hf.D0, tf.q, java.lang.Throwable, lf.c):java.lang.Object");
    }

    public static final void f(Object[] objArr, long j8, Object obj) {
        objArr[((int) j8) & (objArr.length - 1)] = obj;
    }

    public static InterfaceC0602l g(InterfaceC0602l interfaceC0602l, int i5) {
        Gf.a aVar = Gf.a.f4780a;
        if (i5 < 0 && i5 != -2 && i5 != -1) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i5 == -1) {
            aVar = Gf.a.f4781b;
            i5 = 0;
        }
        int i10 = i5;
        Gf.a aVar2 = aVar;
        return interfaceC0602l instanceof If.w ? AbstractC0622c.a((If.w) interfaceC0602l, null, i10, aVar2, 1) : new If.j(interfaceC0602l, null, i10, aVar2, 2);
    }

    public static final C0591c h(tf.p pVar) {
        return new C0591c(pVar, C3109i.f38759a, -2, Gf.a.f4780a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable i(Hf.InterfaceC0602l r5, Hf.InterfaceC0603m r6, lf.AbstractC3464c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof Hf.C0613x
            if (r0 == 0) goto L13
            r0 = r7
            Hf.x r0 = (Hf.C0613x) r0
            int r1 = r0.f5226c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5226c = r1
            goto L18
        L13:
            Hf.x r0 = new Hf.x
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5225b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5226c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.G r5 = r0.f5224a
            Fe.e.U(r7)     // Catch: java.lang.Throwable -> L29
            goto L48
        L29:
            r6 = move-exception
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r7)
            Hf.z r2 = new Hf.z     // Catch: java.lang.Throwable -> L4a
            r4 = 0
            r2.<init>(r4, r6, r7)     // Catch: java.lang.Throwable -> L4a
            r0.f5224a = r7     // Catch: java.lang.Throwable -> L4a
            r0.f5226c = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: java.lang.Throwable -> L4a
            if (r5 != r1) goto L48
            return r1
        L48:
            r5 = 0
            return r5
        L4a:
            r6 = move-exception
            r5 = r7
        L4c:
            java.lang.Object r5 = r5.f39740a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L58
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto L7a
        L58:
            jf.h r7 = r0.getContext()
            Ef.l0 r0 = Ef.C0499l0.f3748a
            jf.f r7 = r7.get(r0)
            Ef.m0 r7 = (Ef.InterfaceC0501m0) r7
            if (r7 == 0) goto L7b
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L6d
            goto L7b
        L6d:
            java.util.concurrent.CancellationException r7 = r7.getCancellationException()
            if (r7 == 0) goto L7b
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L7a
            goto L7b
        L7a:
            throw r6
        L7b:
            if (r5 != 0) goto L7e
            return r6
        L7e:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L86
            Fe.b.d(r5, r6)
            throw r5
        L86:
            Fe.b.d(r6, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.k0.i(Hf.l, Hf.m, lf.c):java.io.Serializable");
    }

    public static final C0598h j(tf.p pVar) {
        return new C0598h(pVar, C3109i.f38759a, -2, Gf.a.f4780a);
    }

    public static final Object k(InterfaceC0602l interfaceC0602l, tf.p pVar, AbstractC3471j abstractC3471j) {
        int i5 = K.f5051a;
        Object objCollect = g(new If.o(new C0333a(pVar, (InterfaceC3103c) null), interfaceC0602l, C3109i.f38759a, -2, Gf.a.f4780a), 0).collect(If.y.f5521a, abstractC3471j);
        kf.a aVar = kf.a.f39711a;
        C2515C c2515c = C2515C.f34653a;
        if (objCollect != aVar) {
            objCollect = c2515c;
        }
        return objCollect == aVar ? objCollect : c2515c;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final u6.o l(Hf.InterfaceC0602l r7, int r8) {
        /*
            Gf.h r0 = Gf.i.f4824J8
            r0.getClass()
            int r0 = Gf.h.f4823b
            if (r8 >= r0) goto La
            goto Lb
        La:
            r0 = r8
        Lb:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof If.g
            if (r1 == 0) goto L3b
            r1 = r7
            If.g r1 = (If.g) r1
            Hf.l r2 = r1.f()
            if (r2 == 0) goto L3b
            u6.o r7 = new u6.o
            r3 = -3
            Gf.a r4 = r1.f5475c
            int r5 = r1.f5474b
            if (r5 == r3) goto L29
            r3 = -2
            if (r5 == r3) goto L29
            if (r5 == 0) goto L29
            r0 = r5
            goto L35
        L29:
            Gf.a r3 = Gf.a.f4780a
            r6 = 0
            if (r4 != r3) goto L32
            if (r5 != 0) goto L35
        L30:
            r0 = r6
            goto L35
        L32:
            if (r8 != 0) goto L30
            r0 = 1
        L35:
            jf.h r8 = r1.f5473a
            r7.<init>(r0, r4, r2, r8)
            return r7
        L3b:
            u6.o r8 = new u6.o
            Gf.a r1 = Gf.a.f4780a
            jf.i r2 = jf.C3109i.f38759a
            r8.<init>(r0, r1, r7, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.k0.l(Hf.l, int):u6.o");
    }

    public static final InterfaceC0602l m(InterfaceC0602l interfaceC0602l) {
        if (interfaceC0602l instanceof v0) {
            return interfaceC0602l;
        }
        if (!(interfaceC0602l instanceof C0601k)) {
            return new C0601k(interfaceC0602l);
        }
        ((C0601k) interfaceC0602l).getClass();
        return interfaceC0602l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005d, B:29:0x0071, B:31:0x0079, B:20:0x0048, B:24:0x0053), top: B:50:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v5, types: [Gf.v] */
    /* JADX WARN: Type inference failed for: r8v7, types: [Gf.v] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008b -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(Hf.InterfaceC0603m r7, Gf.s r8, boolean r9, lf.AbstractC3464c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof Hf.C0606p
            if (r0 == 0) goto L13
            r0 = r10
            Hf.p r0 = (Hf.C0606p) r0
            int r1 = r0.f5177f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5177f = r1
            goto L18
        L13:
            Hf.p r0 = new Hf.p
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f5176e
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5177f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            boolean r9 = r0.f5175d
            Gf.b r7 = r0.f5174c
            Gf.v r8 = r0.f5173b
            Hf.m r2 = r0.f5172a
            Fe.e.U(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r6 = r2
            r2 = r7
            r7 = r6
            goto L5d
        L36:
            r7 = move-exception
            goto L96
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            boolean r9 = r0.f5175d
            Gf.b r7 = r0.f5174c
            Gf.v r8 = r0.f5173b
            Hf.m r2 = r0.f5172a
            Fe.e.U(r10)     // Catch: java.lang.Throwable -> L36
            goto L71
        L4c:
            Fe.e.U(r10)
            boolean r10 = r7 instanceof Hf.D0
            if (r10 != 0) goto Lad
            Gf.e r10 = r8.f4839d     // Catch: java.lang.Throwable -> L36
            r10.getClass()     // Catch: java.lang.Throwable -> L36
            Gf.b r2 = new Gf.b     // Catch: java.lang.Throwable -> L36
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L36
        L5d:
            r0.f5172a = r7     // Catch: java.lang.Throwable -> L36
            r0.f5173b = r8     // Catch: java.lang.Throwable -> L36
            r0.f5174c = r2     // Catch: java.lang.Throwable -> L36
            r0.f5175d = r9     // Catch: java.lang.Throwable -> L36
            r0.f5177f = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r1) goto L6e
            goto L8d
        L6e:
            r6 = r2
            r2 = r7
            r7 = r6
        L71:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L36
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r10 == 0) goto L8e
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L36
            r0.f5172a = r2     // Catch: java.lang.Throwable -> L36
            r0.f5173b = r8     // Catch: java.lang.Throwable -> L36
            r0.f5174c = r7     // Catch: java.lang.Throwable -> L36
            r0.f5175d = r9     // Catch: java.lang.Throwable -> L36
            r0.f5177f = r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r1) goto L32
        L8d:
            return r1
        L8e:
            if (r9 == 0) goto L93
            r8.cancel(r3)
        L93:
            ef.C r7 = ef.C2515C.f34653a
            return r7
        L96:
            throw r7     // Catch: java.lang.Throwable -> L97
        L97:
            r10 = move-exception
            if (r9 == 0) goto Lac
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto La1
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        La1:
            if (r3 != 0) goto La9
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r3 = Ef.H.a(r9, r7)
        La9:
            r8.cancel(r3)
        Lac:
            throw r10
        Lad:
            Hf.D0 r7 = (Hf.D0) r7
            java.lang.Throwable r7 = r7.f5031a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.k0.n(Hf.m, Gf.s, boolean, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(Hf.InterfaceC0602l r6, jf.InterfaceC3103c r7) {
        /*
            boolean r0 = r7 instanceof Hf.N
            if (r0 == 0) goto L13
            r0 = r7
            Hf.N r0 = (Hf.N) r0
            int r1 = r0.f5062d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5062d = r1
            goto L18
        L13:
            Hf.N r0 = new Hf.N
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5061c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5062d
            H6.g r3 = If.AbstractC0622c.f5464b
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            Hf.L r6 = r0.f5060b
            kotlin.jvm.internal.G r1 = r0.f5059a
            Fe.e.U(r7)     // Catch: If.C0620a -> L2d
            goto L61
        L2d:
            r7 = move-exception
            goto L56
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r7)
            r7.f39740a = r3
            Hf.L r2 = new Hf.L
            r5 = 0
            r2.<init>(r7, r5)
            r0.f5059a = r7     // Catch: If.C0620a -> L52
            r0.f5060b = r2     // Catch: If.C0620a -> L52
            r0.f5062d = r4     // Catch: If.C0620a -> L52
            java.lang.Object r6 = r6.collect(r2, r0)     // Catch: If.C0620a -> L52
            if (r6 != r1) goto L50
            return r1
        L50:
            r1 = r7
            goto L61
        L52:
            r6 = move-exception
            r1 = r7
            r7 = r6
            r6 = r2
        L56:
            java.lang.Object r2 = r7.f5458a
            if (r2 != r6) goto L6e
            jf.h r6 = r0.getContext()
            Ef.H.p(r6)
        L61:
            java.lang.Object r6 = r1.f39740a
            if (r6 == r3) goto L66
            return r6
        L66:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.k0.o(Hf.l, jf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(Hf.InterfaceC0602l r6, tf.p r7, jf.InterfaceC3103c r8) {
        /*
            boolean r0 = r8 instanceof Hf.O
            if (r0 == 0) goto L13
            r0 = r8
            Hf.O r0 = (Hf.O) r0
            int r1 = r0.f5066d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5066d = r1
            goto L18
        L13:
            Hf.O r0 = new Hf.O
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5065c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5066d
            H6.g r3 = If.AbstractC0622c.f5464b
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            Hf.z r6 = r0.f5064b
            kotlin.jvm.internal.G r7 = r0.f5063a
            Fe.e.U(r8)     // Catch: If.C0620a -> L2d
            goto L61
        L2d:
            r8 = move-exception
            goto L56
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.jvm.internal.G r8 = A7.AbstractC0279p0.s(r8)
            r8.f39740a = r3
            Hf.z r2 = new Hf.z
            r5 = 2
            r2.<init>(r5, r7, r8)
            r0.f5063a = r8     // Catch: If.C0620a -> L52
            r0.f5064b = r2     // Catch: If.C0620a -> L52
            r0.f5066d = r4     // Catch: If.C0620a -> L52
            java.lang.Object r6 = r6.collect(r2, r0)     // Catch: If.C0620a -> L52
            if (r6 != r1) goto L50
            return r1
        L50:
            r7 = r8
            goto L61
        L52:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r2
        L56:
            java.lang.Object r1 = r8.f5458a
            if (r1 != r6) goto L6e
            jf.h r6 = r0.getContext()
            Ef.H.p(r6)
        L61:
            java.lang.Object r6 = r7.f39740a
            if (r6 == r3) goto L66
            return r6
        L66:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element matching the predicate"
            r6.<init>(r7)
            throw r6
        L6e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.k0.p(Hf.l, tf.p, jf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(Hf.InterfaceC0602l r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof Hf.Q
            if (r0 == 0) goto L13
            r0 = r6
            Hf.Q r0 = (Hf.Q) r0
            int r1 = r0.f5075d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5075d = r1
            goto L18
        L13:
            Hf.Q r0 = new Hf.Q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5074c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5075d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Hf.L r5 = r0.f5073b
            kotlin.jvm.internal.G r1 = r0.f5072a
            Fe.e.U(r6)     // Catch: If.C0620a -> L2b
            goto L5d
        L2b:
            r6 = move-exception
            goto L52
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.jvm.internal.G r6 = A7.AbstractC0279p0.s(r6)
            Hf.L r2 = new Hf.L
            r4 = 1
            r2.<init>(r6, r4)
            r0.f5072a = r6     // Catch: If.C0620a -> L4e
            r0.f5073b = r2     // Catch: If.C0620a -> L4e
            r0.f5075d = r3     // Catch: If.C0620a -> L4e
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: If.C0620a -> L4e
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r1 = r6
            goto L5d
        L4e:
            r5 = move-exception
            r1 = r6
            r6 = r5
            r5 = r2
        L52:
            java.lang.Object r2 = r6.f5458a
            if (r2 != r5) goto L60
            jf.h r5 = r0.getContext()
            Ef.H.p(r5)
        L5d:
            java.lang.Object r5 = r1.f39740a
            return r5
        L60:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.k0.q(Hf.l, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(Hf.InterfaceC0602l r4, tf.p r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof Hf.S
            if (r0 == 0) goto L13
            r0 = r6
            Hf.S r0 = (Hf.S) r0
            int r1 = r0.f5079d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5079d = r1
            goto L18
        L13:
            Hf.S r0 = new Hf.S
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5078c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5079d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Hf.z r4 = r0.f5077b
            kotlin.jvm.internal.G r5 = r0.f5076a
            Fe.e.U(r6)     // Catch: If.C0620a -> L2b
            goto L5c
        L2b:
            r6 = move-exception
            goto L51
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.jvm.internal.G r6 = A7.AbstractC0279p0.s(r6)
            Hf.z r2 = new Hf.z
            r2.<init>(r5, r6)
            r0.f5076a = r6     // Catch: If.C0620a -> L4d
            r0.f5077b = r2     // Catch: If.C0620a -> L4d
            r0.f5079d = r3     // Catch: If.C0620a -> L4d
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: If.C0620a -> L4d
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r5 = r6
            goto L5c
        L4d:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L51:
            java.lang.Object r1 = r6.f5458a
            if (r1 != r4) goto L5f
            jf.h r4 = r0.getContext()
            Ef.H.p(r4)
        L5c:
            java.lang.Object r4 = r5.f39740a
            return r4
        L5f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.k0.r(Hf.l, tf.p, lf.c):java.lang.Object");
    }

    public static final InterfaceC0602l s(InterfaceC0602l interfaceC0602l, Ff.e eVar) {
        if (eVar.get(C0499l0.f3748a) == null) {
            return eVar.equals(C3109i.f38759a) ? interfaceC0602l : interfaceC0602l instanceof If.w ? AbstractC0622c.a((If.w) interfaceC0602l, eVar, 0, null, 6) : new If.j(interfaceC0602l, eVar, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + eVar).toString());
    }

    public static final InterfaceC0602l t(g0 g0Var, InterfaceC3108h interfaceC3108h, int i5, Gf.a aVar) {
        return ((i5 == 0 || i5 == -3) && aVar == Gf.a.f4780a) ? g0Var : new If.j(i5, aVar, g0Var, interfaceC3108h);
    }

    public static final H0 u(InterfaceC0602l interfaceC0602l, Ef.E e7) {
        return Ef.H.D(e7, null, new C0607q(interfaceC0602l, null), 3);
    }

    public static final C0594d0 v(InterfaceC0602l interfaceC0602l, Ef.E e7, int i5) {
        p0 p0Var = n0.f5168a;
        u6.o oVarL = l(interfaceC0602l, i5);
        j0 j0VarA = a(i5, oVarL.f46706a, (Gf.a) oVarL.f46708c);
        H6.g gVar = f5154a;
        Ef.H.C(e7, (InterfaceC3108h) oVarL.f46709d, p0Var.equals(p0Var) ? Ef.F.f3663a : Ef.F.f3666d, new W(p0Var, (InterfaceC0602l) oVarL.f46707b, j0VarA, gVar, null));
        return new C0594d0(j0VarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(Hf.InterfaceC0602l r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof Hf.T
            if (r0 == 0) goto L13
            r0 = r7
            Hf.T r0 = (Hf.T) r0
            int r1 = r0.f5082c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5082c = r1
            goto L18
        L13:
            Hf.T r0 = new Hf.T
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5081b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5082c
            H6.g r3 = If.AbstractC0622c.f5464b
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            kotlin.jvm.internal.G r6 = r0.f5080a
            Fe.e.U(r7)
            goto L4b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.jvm.internal.G r7 = A7.AbstractC0279p0.s(r7)
            r7.f39740a = r3
            Hf.L r2 = new Hf.L
            r5 = 2
            r2.<init>(r7, r5)
            r0.f5080a = r7
            r0.f5082c = r4
            java.lang.Object r6 = r6.collect(r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r6 = r7
        L4b:
            java.lang.Object r6 = r6.f39740a
            if (r6 == r3) goto L50
            return r6
        L50:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Flow is empty"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.k0.w(Hf.l, lf.c):java.lang.Object");
    }

    public static final e0 x(InterfaceC0602l interfaceC0602l, Ef.E e7, o0 o0Var, Object obj) {
        u6.o oVarL = l(interfaceC0602l, 1);
        x0 x0VarC = c(obj);
        Ef.H.C(e7, (InterfaceC3108h) oVarL.f46709d, o0Var.equals(n0.f5168a) ? Ef.F.f3663a : Ef.F.f3666d, new W(o0Var, (InterfaceC0602l) oVarL.f46707b, x0VarC, obj, null));
        return new e0(x0VarC);
    }
}
