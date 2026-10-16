package u1;

import A.W;
import Ef.C0499l0;
import Ef.C0514u;
import Ef.InterfaceC0501m0;
import Hf.InterfaceC0602l;
import Hf.f0;
import Hf.k0;
import Hf.x0;
import ef.C2532p;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import t0.C4068p;

/* renamed from: u1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4209G implements InterfaceC4220i {

    /* renamed from: j, reason: collision with root package name */
    public static final LinkedHashSet f46443j = new LinkedHashSet();
    public static final Object k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final tf.a f46444a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4224m f46445b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4213b f46446c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f46447d;

    /* renamed from: e, reason: collision with root package name */
    public final String f46448e;

    /* renamed from: f, reason: collision with root package name */
    public final C2532p f46449f;

    /* renamed from: g, reason: collision with root package name */
    public final x0 f46450g;

    /* renamed from: h, reason: collision with root package name */
    public List f46451h;

    /* renamed from: i, reason: collision with root package name */
    public final S3.n f46452i;

    public C4209G(tf.a aVar, InterfaceC4224m serializer, List list, InterfaceC4213b interfaceC4213b, Ef.E scope) {
        AbstractC3340k.e(serializer, "serializer");
        AbstractC3340k.e(scope, "scope");
        this.f46444a = aVar;
        this.f46445b = serializer;
        this.f46446c = interfaceC4213b;
        this.f46447d = new f0(new C4232u(this, null));
        this.f46448e = ".tmp";
        this.f46449f = Fe.c.z(new C4068p(this, 6));
        this.f46450g = k0.c(C4211I.f46453a);
        this.f46451h = ff.o.S0(list);
        B.F f10 = new B.F(this, 21);
        C4229r c4229r = new C4229r(this, null);
        AbstractC3340k.e(scope, "scope");
        S3.n nVar = new S3.n();
        nVar.f10970a = scope;
        nVar.f10971b = c4229r;
        nVar.f10972c = ic.d.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 6, null);
        nVar.f10973d = new AtomicInteger(0);
        InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) scope.getCoroutineContext().get(C0499l0.f3748a);
        if (interfaceC0501m0 != null) {
            interfaceC0501m0.invokeOnCompletion(new W(26, f10, nVar));
        }
        this.f46452i = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r8 != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r2v10, types: [lf.j, tf.p] */
    /* JADX WARN: Type inference failed for: r2v3, types: [lf.j, tf.p] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(u1.C4209G r8, u1.C4227p r9, lf.AbstractC3464c r10) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C4209G.b(u1.G, u1.p, lf.c):java.lang.Object");
    }

    @Override // u1.InterfaceC4220i
    public final Object a(tf.p pVar, InterfaceC3103c interfaceC3103c) throws Throwable {
        C0514u c0514uB = Ef.H.b();
        this.f46452i.b(new C4227p(pVar, c0514uB, (AbstractC4210H) this.f46450g.getValue(), interfaceC3103c.getContext()));
        Object objP = c0514uB.p(interfaceC3103c);
        kf.a aVar = kf.a.f39711a;
        return objP;
    }

    public final File c() {
        return (File) this.f46449f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(lf.AbstractC3464c r14) throws u1.C4212a, java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C4209G.d(lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(lf.AbstractC3464c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof u1.C4237z
            if (r0 == 0) goto L13
            r0 = r5
            u1.z r0 = (u1.C4237z) r0
            int r1 = r0.f46523d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46523d = r1
            goto L18
        L13:
            u1.z r0 = new u1.z
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f46521b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f46523d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            u1.G r0 = r0.f46520a
            Fe.e.U(r5)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            Fe.e.U(r5)
            r0.f46520a = r4     // Catch: java.lang.Throwable -> L46
            r0.f46523d = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L46
            if (r5 != r1) goto L41
            return r1
        L41:
            ef.C r5 = ef.C2515C.f34653a
            return r5
        L44:
            r0 = r4
            goto L48
        L46:
            r5 = move-exception
            goto L44
        L48:
            Hf.x0 r0 = r0.f46450g
            u1.l r1 = new u1.l
            r1.<init>(r5)
            r0.getClass()
            r2 = 0
            r0.k(r2, r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C4209G.e(lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(lf.AbstractC3464c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof u1.C4203A
            if (r0 == 0) goto L13
            r0 = r5
            u1.A r0 = (u1.C4203A) r0
            int r1 = r0.f46416d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46416d = r1
            goto L18
        L13:
            u1.A r0 = new u1.A
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f46414b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f46416d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            u1.G r0 = r0.f46413a
            Fe.e.U(r5)     // Catch: java.lang.Throwable -> L29
            goto L53
        L29:
            r5 = move-exception
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            Fe.e.U(r5)
            r0.f46413a = r4     // Catch: java.lang.Throwable -> L43
            r0.f46416d = r3     // Catch: java.lang.Throwable -> L43
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L43
            if (r5 != r1) goto L53
            return r1
        L41:
            r0 = r4
            goto L45
        L43:
            r5 = move-exception
            goto L41
        L45:
            Hf.x0 r0 = r0.f46450g
            u1.l r1 = new u1.l
            r1.<init>(r5)
            r0.getClass()
            r5 = 0
            r0.k(r5, r1)
        L53:
            ef.C r5 = ef.C2515C.f34653a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C4209G.f(lf.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [u1.G] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [jf.c, u1.B] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [u1.G] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v2, types: [u1.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(lf.AbstractC3464c r5) throws java.io.FileNotFoundException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof u1.C4204B
            if (r0 == 0) goto L13
            r0 = r5
            u1.B r0 = (u1.C4204B) r0
            int r1 = r0.f46421e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46421e = r1
            goto L18
        L13:
            u1.B r0 = new u1.B
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f46419c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f46421e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileInputStream r1 = r0.f46418b
            u1.G r0 = r0.f46417a
            Fe.e.U(r5)     // Catch: java.lang.Throwable -> L2b
            goto L53
        L2b:
            r5 = move-exception
            goto L5e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            Fe.e.U(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L64
            java.io.File r2 = r4.c()     // Catch: java.io.FileNotFoundException -> L64
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L64
            u1.m r2 = r4.f46445b     // Catch: java.lang.Throwable -> L5a
            r0.f46417a = r4     // Catch: java.lang.Throwable -> L5a
            r0.f46418b = r5     // Catch: java.lang.Throwable -> L5a
            r0.f46421e = r3     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r0 = r2.readFrom(r5, r0)     // Catch: java.lang.Throwable -> L5a
            if (r0 != r1) goto L50
            return r1
        L50:
            r1 = r5
            r5 = r0
            r0 = r4
        L53:
            r2 = 0
            Ba.c.n(r1, r2)     // Catch: java.io.FileNotFoundException -> L58
            return r5
        L58:
            r5 = move-exception
            goto L66
        L5a:
            r0 = move-exception
            r1 = r5
            r5 = r0
            r0 = r4
        L5e:
            throw r5     // Catch: java.lang.Throwable -> L5f
        L5f:
            r2 = move-exception
            Ba.c.n(r1, r5)     // Catch: java.io.FileNotFoundException -> L58
            throw r2     // Catch: java.io.FileNotFoundException -> L58
        L64:
            r5 = move-exception
            r0 = r4
        L66:
            java.io.File r1 = r0.c()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L77
            u1.m r5 = r0.f46445b
            java.lang.Object r5 = r5.getDefaultValue()
            return r5
        L77:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C4209G.g(lf.c):java.lang.Object");
    }

    @Override // u1.InterfaceC4220i
    public final InterfaceC0602l getData() {
        return this.f46447d;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(lf.AbstractC3464c r8) throws u1.C4212a, java.io.FileNotFoundException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof u1.C4205C
            if (r0 == 0) goto L13
            r0 = r8
            u1.C r0 = (u1.C4205C) r0
            int r1 = r0.f46426e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46426e = r1
            goto L18
        L13:
            u1.C r0 = new u1.C
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f46424c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f46426e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f46423b
            java.lang.Object r0 = r0.f46422a
            u1.a r0 = (u1.C4212a) r0
            Fe.e.U(r8)     // Catch: java.io.IOException -> L33
            return r1
        L33:
            r8 = move-exception
            goto L8b
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.f46423b
            u1.a r2 = (u1.C4212a) r2
            java.lang.Object r4 = r0.f46422a
            u1.G r4 = (u1.C4209G) r4
            Fe.e.U(r8)
            goto L79
        L49:
            java.lang.Object r2 = r0.f46422a
            u1.G r2 = (u1.C4209G) r2
            Fe.e.U(r8)     // Catch: u1.C4212a -> L51
            return r8
        L51:
            r8 = move-exception
            goto L66
        L53:
            Fe.e.U(r8)
            r0.f46422a = r7     // Catch: u1.C4212a -> L64
            r0.f46426e = r5     // Catch: u1.C4212a -> L64
            java.lang.Object r8 = r7.g(r0)     // Catch: u1.C4212a -> L64
            if (r8 != r1) goto L61
            goto L85
        L61:
            return r8
        L62:
            r2 = r7
            goto L66
        L64:
            r8 = move-exception
            goto L62
        L66:
            u1.b r5 = r2.f46446c
            r0.f46422a = r2
            r0.f46423b = r8
            r0.f46426e = r4
            java.lang.Object r4 = r5.u(r8)
            if (r4 != r1) goto L75
            goto L85
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f46422a = r2     // Catch: java.io.IOException -> L89
            r0.f46423b = r8     // Catch: java.io.IOException -> L89
            r0.f46426e = r3     // Catch: java.io.IOException -> L89
            java.lang.Object r0 = r4.j(r8, r0)     // Catch: java.io.IOException -> L89
            if (r0 != r1) goto L86
        L85:
            return r1
        L86:
            return r8
        L87:
            r0 = r2
            goto L8b
        L89:
            r8 = move-exception
            goto L87
        L8b:
            Fe.b.d(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C4209G.h(lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(tf.p r10, jf.InterfaceC3108h r11, lf.AbstractC3464c r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof u1.C4206D
            if (r0 == 0) goto L13
            r0 = r12
            u1.D r0 = (u1.C4206D) r0
            int r1 = r0.f46432f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46432f = r1
            goto L18
        L13:
            u1.D r0 = new u1.D
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f46430d
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f46432f
            java.lang.String r3 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L47
            if (r2 == r6) goto L3b
            if (r2 != r5) goto L33
            java.lang.Object r10 = r0.f46428b
            u1.G r11 = r0.f46427a
            Fe.e.U(r12)
            goto La0
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            java.lang.Object r10 = r0.f46429c
            java.lang.Object r11 = r0.f46428b
            u1.c r11 = (u1.C4214c) r11
            u1.G r2 = r0.f46427a
            Fe.e.U(r12)
            goto L7a
        L47:
            Fe.e.U(r12)
            Hf.x0 r12 = r9.f46450g
            java.lang.Object r12 = r12.getValue()
            u1.c r12 = (u1.C4214c) r12
            java.lang.Object r2 = r12.f46454a
            if (r2 == 0) goto L5b
            int r2 = r2.hashCode()
            goto L5c
        L5b:
            r2 = r4
        L5c:
            int r8 = r12.f46455b
            if (r2 != r8) goto Lba
            u1.E r2 = new u1.E
            java.lang.Object r8 = r12.f46454a
            r2.<init>(r10, r8, r7)
            r0.f46427a = r9
            r0.f46428b = r12
            r0.f46429c = r8
            r0.f46432f = r6
            java.lang.Object r10 = Ef.H.P(r11, r2, r0)
            if (r10 != r1) goto L76
            goto L9d
        L76:
            r2 = r9
            r11 = r12
            r12 = r10
            r10 = r8
        L7a:
            java.lang.Object r6 = r11.f46454a
            if (r6 == 0) goto L83
            int r6 = r6.hashCode()
            goto L84
        L83:
            r6 = r4
        L84:
            int r11 = r11.f46455b
            if (r6 != r11) goto Lb4
            boolean r11 = kotlin.jvm.internal.AbstractC3340k.a(r10, r12)
            if (r11 == 0) goto L8f
            return r10
        L8f:
            r0.f46427a = r2
            r0.f46428b = r12
            r0.f46429c = r7
            r0.f46432f = r5
            java.lang.Object r10 = r2.j(r12, r0)
            if (r10 != r1) goto L9e
        L9d:
            return r1
        L9e:
            r10 = r12
            r11 = r2
        La0:
            Hf.x0 r11 = r11.f46450g
            u1.c r12 = new u1.c
            if (r10 == 0) goto Laa
            int r4 = r10.hashCode()
        Laa:
            r12.<init>(r10, r4)
            r11.getClass()
            r11.k(r7, r12)
            return r10
        Lb4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r3)
            throw r10
        Lba:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C4209G.i(tf.p, jf.h, lf.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r8, lf.AbstractC3464c r9) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = "Unable to rename "
            boolean r1 = r9 instanceof u1.C4208F
            if (r1 == 0) goto L15
            r1 = r9
            u1.F r1 = (u1.C4208F) r1
            int r2 = r1.f46442g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f46442g = r2
            goto L1a
        L15:
            u1.F r1 = new u1.F
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f46440e
            kf.a r2 = kf.a.f39711a
            int r3 = r1.f46442g
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            java.io.FileOutputStream r8 = r1.f46439d
            java.io.FileOutputStream r2 = r1.f46438c
            java.io.File r3 = r1.f46437b
            u1.G r1 = r1.f46436a
            Fe.e.U(r9)     // Catch: java.lang.Throwable -> L31
            goto L8a
        L31:
            r8 = move-exception
            goto Lbd
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            Fe.e.U(r9)
            java.io.File r9 = r7.c()
            java.io.File r3 = r9.getCanonicalFile()
            java.io.File r3 = r3.getParentFile()
            if (r3 != 0) goto L4e
            goto L57
        L4e:
            r3.mkdirs()
            boolean r3 = r3.isDirectory()
            if (r3 == 0) goto Lcd
        L57:
            java.io.File r3 = new java.io.File
            java.io.File r9 = r7.c()
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.String r5 = r7.f46448e
            java.lang.String r9 = kotlin.jvm.internal.AbstractC3340k.k(r5, r9)
            r3.<init>(r9)
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lb9
            r9.<init>(r3)     // Catch: java.io.IOException -> Lb9
            u1.m r5 = r7.f46445b     // Catch: java.lang.Throwable -> Lbb
            od.Y0 r6 = new od.Y0     // Catch: java.lang.Throwable -> Lbb
            r6.<init>(r9)     // Catch: java.lang.Throwable -> Lbb
            r1.f46436a = r7     // Catch: java.lang.Throwable -> Lbb
            r1.f46437b = r3     // Catch: java.lang.Throwable -> Lbb
            r1.f46438c = r9     // Catch: java.lang.Throwable -> Lbb
            r1.f46439d = r9     // Catch: java.lang.Throwable -> Lbb
            r1.f46442g = r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r8 = r5.writeTo(r8, r6, r1)     // Catch: java.lang.Throwable -> Lbb
            if (r8 != r2) goto L87
            return r2
        L87:
            r1 = r7
            r8 = r9
            r2 = r8
        L8a:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L31
            r8.sync()     // Catch: java.lang.Throwable -> L31
            r8 = 0
            Ba.c.n(r2, r8)     // Catch: java.io.IOException -> Lb9
            java.io.File r8 = r1.c()     // Catch: java.io.IOException -> Lb9
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lb9
            if (r8 == 0) goto La2
            ef.C r8 = ef.C2515C.f34653a
            return r8
        La2:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lb9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb9
            r9.<init>(r0)     // Catch: java.io.IOException -> Lb9
            r9.append(r3)     // Catch: java.io.IOException -> Lb9
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lb9
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lb9
            r8.<init>(r9)     // Catch: java.io.IOException -> Lb9
            throw r8     // Catch: java.io.IOException -> Lb9
        Lb9:
            r8 = move-exception
            goto Lc3
        Lbb:
            r8 = move-exception
            r2 = r9
        Lbd:
            throw r8     // Catch: java.lang.Throwable -> Lbe
        Lbe:
            r9 = move-exception
            Ba.c.n(r2, r8)     // Catch: java.io.IOException -> Lb9
            throw r9     // Catch: java.io.IOException -> Lb9
        Lc3:
            boolean r9 = r3.exists()
            if (r9 == 0) goto Lcc
            r3.delete()
        Lcc:
            throw r8
        Lcd:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Unable to create parent directories of "
            java.lang.String r9 = kotlin.jvm.internal.AbstractC3340k.k(r9, r0)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C4209G.j(java.lang.Object, lf.c):java.lang.Object");
    }
}
