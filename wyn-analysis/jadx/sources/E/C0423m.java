package E;

import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3909n;
import t0.C4070r;

/* renamed from: E.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423m implements InterfaceC3909n {

    /* renamed from: b, reason: collision with root package name */
    public static final C0423m f2753b = new C0423m(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0423m f2754c = new C0423m(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2755a;

    public /* synthetic */ C0423m(int i5) {
        this.f2755a = i5;
    }

    @Override // r0.InterfaceC3909n
    public final D0.b a(C4070r MeasurePolicy, P.a aVar, long j8) {
        switch (this.f2755a) {
            case 0:
                AbstractC3340k.e(MeasurePolicy, "$this$MeasurePolicy");
                return pd.f.j(MeasurePolicy, L0.a.g(j8), L0.a.f(j8), C0422l.f2750j);
            default:
                AbstractC3340k.e(MeasurePolicy, "$this$measure");
                return pd.f.j(MeasurePolicy, L0.a.e(j8) == L0.a.g(j8) ? L0.a.e(j8) : 0, L0.a.d(j8) == L0.a.f(j8) ? L0.a.d(j8) : 0, C0422l.f2751l);
        }
    }
}
