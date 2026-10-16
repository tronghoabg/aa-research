package Va;

import com.chartboost.sdk.ChartboostDelegate;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class F1 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ K1 f13329a;

    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ChartboostDelegate chartboostDelegate = (ChartboostDelegate) arrayList.get(0);
        K1.f13474T = (K1.f13473S + 91) % 128;
        this.f13329a.getClass();
        J1 j12 = new J1(chartboostDelegate);
        int i5 = K1.f13473S;
        int i10 = i5 + 35;
        K1.f13474T = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        K1.f13474T = (i5 + 53) % 128;
        return j12;
    }
}
