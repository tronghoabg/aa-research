package K;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import x0.AbstractC4446p;
import x0.C4437g;

/* loaded from: classes.dex */
public final class s extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6293i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f6294j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(String str, int i5) {
        super(1);
        this.f6293i = i5;
        this.f6294j = str;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f6293i) {
            case 0:
                C4437g semantics = (C4437g) obj;
                AbstractC3340k.e(semantics, "$this$semantics");
                AbstractC4446p.a(semantics, this.f6294j);
                AbstractC4446p.b(semantics, 5);
                break;
            case 1:
                C4437g semantics2 = (C4437g) obj;
                AbstractC3340k.e(semantics2, "$this$semantics");
                AbstractC4446p.c(semantics2, this.f6294j);
                break;
            default:
                C4437g fakeSemanticsNode = (C4437g) obj;
                AbstractC3340k.e(fakeSemanticsNode, "$this$fakeSemanticsNode");
                AbstractC4446p.a(fakeSemanticsNode, this.f6294j);
                break;
        }
        return C2515C.f34653a;
    }
}
