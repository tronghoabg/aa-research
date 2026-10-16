package Y3;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class a extends AbstractC3343n implements tf.l {

    /* renamed from: j, reason: collision with root package name */
    public static final a f16630j = new a(1, 0);
    public static final a k = new a(1, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16631i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i5, int i10) {
        super(i5);
        this.f16631i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f16631i) {
            case 0:
                return C2515C.f34653a;
            default:
                return (g) obj;
        }
    }
}
