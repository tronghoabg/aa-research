package c0;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: c0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1544i extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19511i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1542g f19512j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1544i(C1542g c1542g, int i5) {
        super(0);
        this.f19511i = i5;
        this.f19512j = c1542g;
    }

    @Override // tf.a
    public final Object invoke() {
        switch (this.f19511i) {
            case 0:
                C1542g c1542g = this.f19512j;
                AbstractC3340k.e(c1542g, "<this>");
                C1539d c1539d = c1542g.f19502f;
                if (c1539d != null) {
                    c1539d.c();
                }
                break;
            default:
                C1542g c1542g2 = this.f19512j;
                n nVar = c1542g2.f19504h;
                if (nVar != null) {
                    nVar.e0(c1542g2.f19505i);
                }
                break;
        }
        return C2515C.f34653a;
    }
}
