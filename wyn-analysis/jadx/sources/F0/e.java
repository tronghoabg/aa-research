package F0;

import ef.C2515C;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import tf.l;

/* loaded from: classes.dex */
public final class e extends AbstractC3343n implements l {

    /* renamed from: j, reason: collision with root package name */
    public static final e f3801j = new e(1, 0);
    public static final e k = new e(1, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3802i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i5, int i10) {
        super(i5);
        this.f3802i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f3802i) {
            case 0:
                List it = (List) obj;
                AbstractC3340k.e(it, "it");
                return C2515C.f34653a;
            default:
                throw null;
        }
    }
}
