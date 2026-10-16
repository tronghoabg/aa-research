package A;

import U8.v0;
import d0.C2384c;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import vf.AbstractC4345a;

/* loaded from: classes.dex */
public final class a0 extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120i;

    /* renamed from: j, reason: collision with root package name */
    public static final a0 f104j = new a0(1, 0);
    public static final a0 k = new a0(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final a0 f105l = new a0(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final a0 f106m = new a0(1, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final a0 f107n = new a0(1, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final a0 f108o = new a0(1, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final a0 f109p = new a0(1, 6);

    /* renamed from: q, reason: collision with root package name */
    public static final a0 f110q = new a0(1, 7);

    /* renamed from: r, reason: collision with root package name */
    public static final a0 f111r = new a0(1, 8);

    /* renamed from: s, reason: collision with root package name */
    public static final a0 f112s = new a0(1, 9);

    /* renamed from: t, reason: collision with root package name */
    public static final a0 f113t = new a0(1, 10);

    /* renamed from: u, reason: collision with root package name */
    public static final a0 f114u = new a0(1, 11);

    /* renamed from: v, reason: collision with root package name */
    public static final a0 f115v = new a0(1, 12);

    /* renamed from: w, reason: collision with root package name */
    public static final a0 f116w = new a0(1, 13);

    /* renamed from: x, reason: collision with root package name */
    public static final a0 f117x = new a0(1, 14);

    /* renamed from: y, reason: collision with root package name */
    public static final a0 f118y = new a0(1, 15);

    /* renamed from: z, reason: collision with root package name */
    public static final a0 f119z = new a0(1, 16);

    /* renamed from: A, reason: collision with root package name */
    public static final a0 f103A = new a0(1, 17);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i5, int i10) {
        super(i5);
        this.f120i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f120i) {
            case 0:
                long j8 = ((L0.e) obj).f6798a;
                long j10 = L0.e.f6796b;
                if (j8 == j10) {
                    throw new IllegalStateException("DpOffset is unspecified");
                }
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                if (j8 != j10) {
                    return new C0219l(fIntBitsToFloat, Float.intBitsToFloat((int) (4294967295L & j8)));
                }
                throw new IllegalStateException("DpOffset is unspecified");
            case 1:
                C0219l it = (C0219l) obj;
                AbstractC3340k.e(it, "it");
                return new L0.e(A6.c.a(it.f173a, it.f174b));
            case 2:
                return new C0218k(((L0.d) obj).f6795a);
            case 3:
                C0218k it2 = (C0218k) obj;
                AbstractC3340k.e(it2, "it");
                return new L0.d(it2.f172a);
            case 4:
                return new C0218k(((Number) obj).floatValue());
            case 5:
                C0218k it3 = (C0218k) obj;
                AbstractC3340k.e(it3, "it");
                return Float.valueOf(it3.f172a);
            case 6:
                long j11 = ((L0.g) obj).f6804a;
                int i5 = L0.g.f6803c;
                return new C0219l((int) (j11 >> 32), (int) (4294967295L & j11));
            case 7:
                C0219l it4 = (C0219l) obj;
                AbstractC3340k.e(it4, "it");
                return new L0.g(A6.h.b(AbstractC4345a.H(it4.f173a), AbstractC4345a.H(it4.f174b)));
            case 8:
                long j12 = ((L0.h) obj).f6805a;
                return new C0219l((int) (j12 >> 32), (int) (4294967295L & j12));
            case 9:
                C0219l it5 = (C0219l) obj;
                AbstractC3340k.e(it5, "it");
                return new L0.h(Ba.c.a(AbstractC4345a.H(it5.f173a), AbstractC4345a.H(it5.f174b)));
            case 10:
                return new C0218k(((Number) obj).intValue());
            case 11:
                C0218k it6 = (C0218k) obj;
                AbstractC3340k.e(it6, "it");
                return Integer.valueOf((int) it6.f172a);
            case 12:
                long j13 = ((C2384c) obj).f33935a;
                return new C0219l(C2384c.b(j13), C2384c.c(j13));
            case 13:
                C0219l it7 = (C0219l) obj;
                AbstractC3340k.e(it7, "it");
                return new C2384c(v0.f(it7.f173a, it7.f174b));
            case 14:
                d0.d it8 = (d0.d) obj;
                AbstractC3340k.e(it8, "it");
                return new C0220m(it8.f33937a, it8.f33938b, it8.f33939c, it8.f33940d);
            case 15:
                C0220m it9 = (C0220m) obj;
                AbstractC3340k.e(it9, "it");
                return new d0.d(it9.f175a, it9.f176b, it9.f177c, it9.f178d);
            case 16:
                long j14 = ((d0.f) obj).f33952a;
                return new C0219l(d0.f.d(j14), d0.f.b(j14));
            default:
                C0219l it10 = (C0219l) obj;
                AbstractC3340k.e(it10, "it");
                return new d0.f(com.moloco.sdk.internal.publisher.H.I(it10.f173a, it10.f174b));
        }
    }
}
