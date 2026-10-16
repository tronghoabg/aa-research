package z;

import A.N;
import E5.Q;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class t extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48255i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f48256j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar) {
        super(1);
        this.f48256j = vVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f48255i) {
            case 0:
                EnumC4601f it = (EnumC4601f) obj;
                AbstractC3340k.e(it, "it");
                v vVar = this.f48256j;
                vVar.getClass();
                if (vVar.f48260b.getValue() != null) {
                    throw new ClassCastException();
                }
                long j8 = L0.g.f6802b;
                if (vVar.f48261c.getValue() != null) {
                    throw new ClassCastException();
                }
                int iOrdinal = it.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                    return new L0.g(j8);
                }
                throw new Q((byte) 0, 9);
            default:
                N n10 = (N) obj;
                AbstractC3340k.e(n10, "$this$null");
                EnumC4601f enumC4601f = EnumC4601f.f48218a;
                EnumC4601f enumC4601f2 = EnumC4601f.f48219b;
                boolean zA = n10.a(enumC4601f, enumC4601f2);
                v vVar2 = this.f48256j;
                if (zA) {
                    if (vVar2.f48260b.getValue() == null) {
                        return AbstractC4604i.f48230d;
                    }
                    throw new ClassCastException();
                }
                if (!n10.a(enumC4601f2, EnumC4601f.f48220c)) {
                    return AbstractC4604i.f48230d;
                }
                if (vVar2.f48261c.getValue() == null) {
                    return AbstractC4604i.f48230d;
                }
                throw new ClassCastException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, long j8) {
        super(1);
        this.f48256j = vVar;
    }
}
