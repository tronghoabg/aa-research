package z;

import A.F;
import A.N;
import N.C0740o;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4602g extends AbstractC3343n implements tf.q {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48222i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C4605j f48223j;
    public final /* synthetic */ C4606k k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4602g(C4605j c4605j, C4606k c4606k, int i5) {
        super(3);
        this.f48222i = i5;
        this.f48223j = c4605j;
        this.k = c4606k;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        o oVar;
        F f10;
        switch (this.f48222i) {
            case 0:
                N animateFloat = (N) obj;
                C0740o c0740o = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(animateFloat, "$this$animateFloat");
                c0740o.M(-57153604);
                EnumC4601f enumC4601f = EnumC4601f.f48218a;
                EnumC4601f enumC4601f2 = EnumC4601f.f48219b;
                if (animateFloat.a(enumC4601f, enumC4601f2)) {
                    o oVar2 = this.f48223j.f48232a.f48263a;
                    obj4 = oVar2 != null ? oVar2.f48245a : AbstractC4604i.f48229c;
                } else {
                    obj4 = (!animateFloat.a(enumC4601f2, EnumC4601f.f48220c) || (oVar = this.k.f48233a.f48263a) == null) ? AbstractC4604i.f48229c : oVar.f48245a;
                }
                c0740o.p(false);
                return obj4;
            default:
                N animateFloat2 = (N) obj;
                C0740o c0740o2 = (C0740o) obj2;
                ((Number) obj3).intValue();
                AbstractC3340k.e(animateFloat2, "$this$animateFloat");
                c0740o2.M(-53984035);
                EnumC4601f enumC4601f3 = EnumC4601f.f48218a;
                EnumC4601f enumC4601f4 = EnumC4601f.f48219b;
                if (animateFloat2.a(enumC4601f3, enumC4601f4)) {
                    w wVar = this.f48223j.f48232a;
                    f10 = AbstractC4604i.f48229c;
                } else if (animateFloat2.a(enumC4601f4, EnumC4601f.f48220c)) {
                    w wVar2 = this.k.f48233a;
                    f10 = AbstractC4604i.f48229c;
                } else {
                    f10 = AbstractC4604i.f48229c;
                }
                c0740o2.p(false);
                return f10;
        }
    }
}
