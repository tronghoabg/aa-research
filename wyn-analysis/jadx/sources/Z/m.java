package z;

import E5.Q;
import N.V;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class m extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48236i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f48237j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, long j8, int i5) {
        super(1);
        this.f48236i = i5;
        this.f48237j = nVar;
        this.k = j8;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        int iOrdinal;
        long jB;
        n nVar = this.f48237j;
        switch (this.f48236i) {
            case 0:
                EnumC4601f it = (EnumC4601f) obj;
                AbstractC3340k.e(it, "it");
                nVar.getClass();
                C4600e c4600e = (C4600e) nVar.f48240c.getValue();
                long j8 = this.k;
                long j10 = c4600e != null ? ((L0.h) c4600e.f48216b.invoke(new L0.h(j8))).f6805a : j8;
                C4600e c4600e2 = (C4600e) nVar.f48241d.getValue();
                long j11 = c4600e2 != null ? ((L0.h) c4600e2.f48216b.invoke(new L0.h(j8))).f6805a : j8;
                int iOrdinal2 = it.ordinal();
                if (iOrdinal2 == 0) {
                    j8 = j10;
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new Q((byte) 0, 9);
                    }
                    j8 = j11;
                }
                return new L0.h(j8);
            default:
                EnumC4601f it2 = (EnumC4601f) obj;
                AbstractC3340k.e(it2, "it");
                nVar.getClass();
                if (nVar.f48243f == null) {
                    jB = L0.g.f6802b;
                } else {
                    V v2 = nVar.f48242e;
                    if (v2.getValue() == null || AbstractC3340k.a(nVar.f48243f, v2.getValue()) || (iOrdinal = it2.ordinal()) == 0 || iOrdinal == 1) {
                        jB = L0.g.f6802b;
                    } else {
                        if (iOrdinal != 2) {
                            throw new Q((byte) 0, 9);
                        }
                        C4600e c4600e3 = (C4600e) nVar.f48241d.getValue();
                        if (c4600e3 != null) {
                            long j12 = this.k;
                            long j13 = ((L0.h) c4600e3.f48216b.invoke(new L0.h(j12))).f6805a;
                            Object value = v2.getValue();
                            AbstractC3340k.b(value);
                            L0.i iVar = L0.i.f6806a;
                            long jA = ((Z.d) value).a(j12, j13, iVar);
                            Z.d dVar = nVar.f48243f;
                            AbstractC3340k.b(dVar);
                            long jA2 = dVar.a(j12, j13, iVar);
                            int i5 = L0.g.f6803c;
                            jB = A6.h.b(((int) (jA >> 32)) - ((int) (jA2 >> 32)), ((int) (jA & 4294967295L)) - ((int) (jA2 & 4294967295L)));
                        } else {
                            jB = L0.g.f6802b;
                        }
                    }
                }
                return new L0.g(jB);
        }
    }
}
