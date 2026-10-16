package z;

import A.C0219l;
import A.N;
import e0.C2447J;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4597b extends AbstractC3343n implements tf.l {

    /* renamed from: j, reason: collision with root package name */
    public static final C4597b f48201j = new C4597b(1, 0);
    public static final C4597b k = new C4597b(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C4597b f48202l = new C4597b(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C4597b f48203m = new C4597b(1, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final C4597b f48204n = new C4597b(1, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final C4597b f48205o = new C4597b(1, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final C4597b f48206p = new C4597b(1, 6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48207i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4597b(int i5, int i10) {
        super(i5);
        this.f48207i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f48207i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return obj;
            case 2:
                long j8 = ((C2447J) obj).f34355a;
                return new C0219l(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)));
            case 3:
                C0219l it = (C0219l) obj;
                AbstractC3340k.e(it, "it");
                float f10 = it.f173a;
                float f11 = it.f174b;
                return new C2447J((Float.floatToIntBits(f10) << 32) | (Float.floatToIntBits(f11) & 4294967295L));
            case 4:
                long j10 = ((L0.h) obj).f6805a;
                return new L0.h(Ba.c.a(0, 0));
            case 5:
                long j11 = ((L0.h) obj).f6805a;
                return new L0.h(Ba.c.a(0, 0));
            default:
                N animate = (N) obj;
                AbstractC3340k.e(animate, "$this$animate");
                return AbstractC4604i.f48230d;
        }
    }
}
