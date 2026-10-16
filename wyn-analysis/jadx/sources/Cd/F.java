package Cd;

import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* loaded from: classes5.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final vg.b f2000a = vg.d.c("io.ktor.client.plugins.HttpCallValidator");

    /* renamed from: b, reason: collision with root package name */
    public static final Dd.c f2001b = U8.v0.s("HttpResponseValidator", C0356y.f2190a, new Ad.g(9));

    /* renamed from: c, reason: collision with root package name */
    public static final Nd.a f2002c;

    static {
        KType kTypeB;
        KClass orCreateKotlinClass = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(Boolean.class);
        try {
            kTypeB = kotlin.jvm.internal.H.b(Boolean.TYPE);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f2002c = new Nd.a("ExpectSuccessAttributeKey", new Sd.a(orCreateKotlinClass, kTypeB));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.util.List r4, java.lang.Throwable r5, Fd.b r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof Cd.C
            if (r0 == 0) goto L13
            r0 = r7
            Cd.C r0 = (Cd.C) r0
            int r1 = r0.f1991b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1991b = r1
            goto L18
        L13:
            Cd.C r0 = new Cd.C
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1990a
            kf.a r1 = kf.a.f39711a
            int r0 = r0.f1991b
            if (r0 == 0) goto L34
            r4 = 1
            if (r0 == r4) goto L26
            r4 = 2
            if (r0 != r4) goto L2a
        L26:
            Fe.e.U(r7)
            goto L32
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            r4 = 0
            goto L5c
        L34:
            Fe.e.U(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Processing exception "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = " for request "
            r7.append(r5)
            Jd.H r5 = r6.getUrl()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            vg.b r6 = Cd.F.f2000a
            r6.s(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L5c:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L63
            return
        L63:
            java.lang.Object r4 = r4.next()
            if (r4 != 0) goto L72
            E5.Q r4 = new E5.Q
            r5 = 9
            r6 = 0
            r4.<init>(r6, r5)
            throw r4
        L72:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.F.a(java.util.List, java.lang.Throwable, Fd.b, lf.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.util.List r4, Gd.a r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof Cd.D
            if (r0 == 0) goto L13
            r0 = r6
            Cd.D r0 = (Cd.D) r0
            int r1 = r0.f1995d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1995d = r1
            goto L18
        L13:
            Cd.D r0 = new Cd.D
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1994c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f1995d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.Iterator r4 = r0.f1993b
            java.util.Iterator r4 = (java.util.Iterator) r4
            Gd.a r5 = r0.f1992a
            Fe.e.U(r6)
            goto L5d
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Fe.e.U(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Validating response for request "
            r6.<init>(r2)
            xd.c r2 = r5.c()
            Fd.b r2 = r2.d()
            Jd.H r2 = r2.getUrl()
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            vg.b r2 = Cd.F.f2000a
            r2.s(r6)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L5d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L79
            java.lang.Object r6 = r4.next()
            tf.p r6 = (tf.p) r6
            r0.f1992a = r5
            r2 = r4
            java.util.Iterator r2 = (java.util.Iterator) r2
            r0.f1993b = r2
            r0.f1995d = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L5d
            return r1
        L79:
            ef.C r4 = ef.C2515C.f34653a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.F.b(java.util.List, Gd.a, lf.c):java.lang.Object");
    }
}
