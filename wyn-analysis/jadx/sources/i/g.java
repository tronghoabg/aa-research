package I;

import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import ef.C2527k;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import r0.s;
import r0.t;
import tf.l;

/* loaded from: classes.dex */
public final class g extends AbstractC3343n implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5255i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5256j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ArrayList arrayList, int i5) {
        super(1);
        this.f5255i = i5;
        this.f5256j = arrayList;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f5255i) {
            case 0:
                AbstractC3340k.e((s) obj, "$this$layout");
                ArrayList arrayList = this.f5256j;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C2527k c2527k = (C2527k) arrayList.get(i5);
                    s.b((t) c2527k.f34671a, ((L0.g) c2527k.f34672b).f6804a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                break;
            case 1:
                s layout = (s) obj;
                AbstractC3340k.e(layout, "$this$layout");
                ArrayList arrayList2 = this.f5256j;
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    s.d(layout, (t) arrayList2.get(i10));
                }
                break;
            default:
                AbstractC3340k.e((s) obj, "$this$layout");
                ArrayList arrayList3 = this.f5256j;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    s.a((t) arrayList3.get(i11), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                break;
        }
        return C2515C.f34653a;
    }
}
